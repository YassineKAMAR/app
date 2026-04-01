package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends r0 implements j.c {
    static final n D0;
    private Rect A;
    private final AdapterView.OnItemClickListener A0;
    private int[] B;
    private final AdapterView.OnItemSelectedListener B0;
    private int[] C;
    private TextWatcher C0;
    private final ImageView D;
    private final Drawable E;
    private final int F;
    private final int G;
    private final Intent H;
    private final Intent I;
    private final CharSequence W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private l f716a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private k f717b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    View.OnFocusChangeListener f718c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private m f719d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private View.OnClickListener f720e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f721f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private boolean f722g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    b0.a f723h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f724i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private CharSequence f725j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private boolean f726k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f727l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private int f728m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private boolean f729n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private CharSequence f730o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final SearchAutoComplete f731p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private CharSequence f732p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final View f733q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean f734q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final View f735r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f736r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final View f737s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    SearchableInfo f738s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final ImageView f739t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private Bundle f740t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final ImageView f741u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private final Runnable f742u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final ImageView f743v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private Runnable f744v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final ImageView f745w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f746w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final View f747x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private final View.OnClickListener f748x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private p f749y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    View.OnKeyListener f750y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Rect f751z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private final TextView.OnEditorActionListener f752z0;

    public static class SearchAutoComplete extends androidx.appcompat.widget.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f753d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private SearchView f754e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f755f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final Runnable f756g;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.c();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, e.a.f21102p);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i8) {
            super(context, attributeSet, i8);
            this.f756g = new a();
            this.f753d = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i8 = configuration.screenWidthDp;
            int i9 = configuration.screenHeightDp;
            if (i8 >= 960 && i9 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i8 < 600) {
                return (i8 < 640 || i9 < 480) ? 160 : 192;
            }
            return 192;
        }

        void a() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.D0.c(this);
                return;
            }
            setInputMethodMode(1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        boolean b() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void c() {
            if (this.f755f) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f755f = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f753d <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f755f) {
                removeCallbacks(this.f756g);
                post(this.f756g);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z7, int i8, Rect rect) {
            super.onFocusChanged(z7, i8, rect);
            this.f754e.V();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i8, KeyEvent keyEvent) {
            if (i8 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f754e.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i8, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z7) {
            super.onWindowFocusChanged(z7);
            if (z7 && this.f754e.hasFocus() && getVisibility() == 0) {
                this.f755f = true;
                if (SearchView.I(getContext())) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z7) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z7) {
                this.f755f = false;
                removeCallbacks(this.f756g);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f755f = true;
                    return;
                }
                this.f755f = false;
                removeCallbacks(this.f756g);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f754e = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i8) {
            super.setThreshold(i8);
            this.f753d = i8;
        }
    }

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            SearchView.this.U(charSequence);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.b0();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.a aVar = SearchView.this.f723h0;
            if (aVar instanceof f1) {
                aVar.a(null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z7) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f718c0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z7);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
            SearchView.this.x();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f739t) {
                searchView.R();
                return;
            }
            if (view == searchView.f743v) {
                searchView.N();
                return;
            }
            if (view == searchView.f741u) {
                searchView.S();
            } else if (view == searchView.f745w) {
                searchView.W();
            } else if (view == searchView.f731p) {
                searchView.D();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i8, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f738s0 == null) {
                return false;
            }
            if (searchView.f731p.isPopupShowing() && SearchView.this.f731p.getListSelection() != -1) {
                return SearchView.this.T(view, i8, keyEvent);
            }
            if (SearchView.this.f731p.b() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i8 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.L(0, null, searchView2.f731p.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
            SearchView.this.S();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i8, long j8) {
            SearchView.this.O(i8, 0, null);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i8, long j8) {
            SearchView.this.P(i8);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public interface k {
        boolean a();
    }

    public interface l {
        boolean a(String str);

        boolean b(String str);
    }

    public interface m {
        boolean a(int i8);

        boolean b(int i8);
    }

    private static class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Method f768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Method f769b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Method f770c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        n() {
            this.f768a = null;
            this.f769b = null;
            this.f770c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f768a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f769b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f770c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f769b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f768a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f770c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    static class o extends c0.a {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f771c;

        class a implements Parcelable.ClassLoaderCreator<o> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public o createFromParcel(Parcel parcel) {
                return new o(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public o[] newArray(int i8) {
                return new o[i8];
            }
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f771c = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f771c + "}";
        }

        @Override // c0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeValue(Boolean.valueOf(this.f771c));
        }
    }

    private static class p extends TouchDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f773b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Rect f774c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Rect f775d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f776e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f777f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f776e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f773b = new Rect();
            this.f775d = new Rect();
            this.f774c = new Rect();
            a(rect, rect2);
            this.f772a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f773b.set(rect);
            this.f775d.set(rect);
            Rect rect3 = this.f775d;
            int i8 = this.f776e;
            rect3.inset(-i8, -i8);
            this.f774c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z7;
            float width;
            int height;
            boolean z8;
            int x7 = (int) motionEvent.getX();
            int y7 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z9 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z8 = this.f777f;
                    if (z8 && !this.f775d.contains(x7, y7)) {
                        z9 = z8;
                        z7 = false;
                    }
                } else {
                    if (action == 3) {
                        z8 = this.f777f;
                        this.f777f = false;
                    }
                    z7 = true;
                    z9 = false;
                }
                z9 = z8;
                z7 = true;
            } else {
                if (this.f773b.contains(x7, y7)) {
                    this.f777f = true;
                    z7 = true;
                }
                z7 = true;
                z9 = false;
            }
            if (!z9) {
                return false;
            }
            if (!z7 || this.f774c.contains(x7, y7)) {
                Rect rect = this.f774c;
                width = x7 - rect.left;
                height = y7 - rect.top;
            } else {
                width = this.f772a.getWidth() / 2;
                height = this.f772a.getHeight() / 2;
            }
            motionEvent.setLocation(width, height);
            return this.f772a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        D0 = Build.VERSION.SDK_INT < 29 ? new n() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.G);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f751z = new Rect();
        this.A = new Rect();
        this.B = new int[2];
        this.C = new int[2];
        this.f742u0 = new b();
        this.f744v0 = new c();
        this.f746w0 = new WeakHashMap<>();
        f fVar = new f();
        this.f748x0 = fVar;
        this.f750y0 = new g();
        h hVar = new h();
        this.f752z0 = hVar;
        i iVar = new i();
        this.A0 = iVar;
        j jVar = new j();
        this.B0 = jVar;
        this.C0 = new a();
        l1 l1VarU = l1.u(context, attributeSet, e.j.f21265i2, i8, 0);
        LayoutInflater.from(context).inflate(l1VarU.m(e.j.f21315s2, e.g.f21203r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(e.f.D);
        this.f731p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f733q = findViewById(e.f.f21185z);
        View viewFindViewById = findViewById(e.f.C);
        this.f735r = viewFindViewById;
        View viewFindViewById2 = findViewById(e.f.J);
        this.f737s = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(e.f.f21183x);
        this.f739t = imageView;
        ImageView imageView2 = (ImageView) findViewById(e.f.A);
        this.f741u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(e.f.f21184y);
        this.f743v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(e.f.E);
        this.f745w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(e.f.B);
        this.D = imageView5;
        androidx.core.view.e0.I(viewFindViewById, l1VarU.f(e.j.f21320t2));
        androidx.core.view.e0.I(viewFindViewById2, l1VarU.f(e.j.f21340x2));
        int i9 = e.j.f21335w2;
        imageView.setImageDrawable(l1VarU.f(i9));
        imageView2.setImageDrawable(l1VarU.f(e.j.f21305q2));
        imageView3.setImageDrawable(l1VarU.f(e.j.f21290n2));
        imageView4.setImageDrawable(l1VarU.f(e.j.f21350z2));
        imageView5.setImageDrawable(l1VarU.f(i9));
        this.E = l1VarU.f(e.j.f21330v2);
        o1.a(imageView, getResources().getString(e.h.f21217l));
        this.F = l1VarU.m(e.j.f21345y2, e.g.f21202q);
        this.G = l1VarU.m(e.j.f21295o2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.C0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f750y0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(l1VarU.a(e.j.f21310r2, true));
        int iE = l1VarU.e(e.j.f21275k2, -1);
        if (iE != -1) {
            setMaxWidth(iE);
        }
        this.W = l1VarU.o(e.j.f21300p2);
        this.f725j0 = l1VarU.o(e.j.f21325u2);
        int iJ = l1VarU.j(e.j.f21285m2, -1);
        if (iJ != -1) {
            setImeOptions(iJ);
        }
        int iJ2 = l1VarU.j(e.j.f21280l2, -1);
        if (iJ2 != -1) {
            setInputType(iJ2);
        }
        setFocusable(l1VarU.a(e.j.f21270j2, true));
        l1VarU.v();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.I = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f747x = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e());
        }
        g0(this.f721f0);
        c0();
    }

    private Intent A(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f740t0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent B(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void C() {
        this.f731p.dismissDropDown();
    }

    private void E(View view, Rect rect) {
        view.getLocationInWindow(this.B);
        getLocationInWindow(this.C);
        int[] iArr = this.B;
        int i8 = iArr[1];
        int[] iArr2 = this.C;
        int i9 = i8 - iArr2[1];
        int i10 = iArr[0] - iArr2[0];
        rect.set(i10, i9, view.getWidth() + i10, view.getHeight() + i9);
    }

    private CharSequence F(CharSequence charSequence) {
        if (!this.f721f0 || this.E == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f731p.getTextSize()) * 1.25d);
        this.E.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.E), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean G() {
        SearchableInfo searchableInfo = this.f738s0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f738s0.getVoiceSearchLaunchWebSearch()) {
            intent = this.H;
        } else if (this.f738s0.getVoiceSearchLaunchRecognizer()) {
            intent = this.I;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    static boolean I(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean J() {
        return (this.f724i0 || this.f729n0) && !H();
    }

    private void K(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e8) {
            Log.e("SearchView", "Failed launch activity: " + intent, e8);
        }
    }

    private boolean M(int i8, int i9, String str) {
        Cursor cursorB = this.f723h0.b();
        if (cursorB == null || !cursorB.moveToPosition(i8)) {
            return false;
        }
        K(z(cursorB, i9, str));
        return true;
    }

    private void X() {
        post(this.f742u0);
    }

    private void Y(int i8) {
        CharSequence charSequenceConvertToString;
        Editable text = this.f731p.getText();
        Cursor cursorB = this.f723h0.b();
        if (cursorB == null) {
            return;
        }
        if (!cursorB.moveToPosition(i8) || (charSequenceConvertToString = this.f723h0.convertToString(cursorB)) == null) {
            setQuery(text);
        } else {
            setQuery(charSequenceConvertToString);
        }
    }

    private void a0() {
        boolean z7 = true;
        boolean z8 = !TextUtils.isEmpty(this.f731p.getText());
        if (!z8 && (!this.f721f0 || this.f734q0)) {
            z7 = false;
        }
        this.f743v.setVisibility(z7 ? 0 : 8);
        Drawable drawable = this.f743v.getDrawable();
        if (drawable != null) {
            drawable.setState(z8 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void c0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f731p;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(F(queryHint));
    }

    private void d0() {
        this.f731p.setThreshold(this.f738s0.getSuggestThreshold());
        this.f731p.setImeOptions(this.f738s0.getImeOptions());
        int inputType = this.f738s0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f738s0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f731p.setInputType(inputType);
        b0.a aVar = this.f723h0;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.f738s0.getSuggestAuthority() != null) {
            f1 f1Var = new f1(getContext(), this, this.f738s0, this.f746w0);
            this.f723h0 = f1Var;
            this.f731p.setAdapter(f1Var);
            ((f1) this.f723h0).G(this.f726k0 ? 2 : 1);
        }
    }

    private void e0() {
        this.f737s.setVisibility((J() && (this.f741u.getVisibility() == 0 || this.f745w.getVisibility() == 0)) ? 0 : 8);
    }

    private void f0(boolean z7) {
        this.f741u.setVisibility((this.f724i0 && J() && hasFocus() && (z7 || !this.f729n0)) ? 0 : 8);
    }

    private void g0(boolean z7) {
        this.f722g0 = z7;
        int i8 = z7 ? 0 : 8;
        boolean z8 = !TextUtils.isEmpty(this.f731p.getText());
        this.f739t.setVisibility(i8);
        f0(z8);
        this.f733q.setVisibility(z7 ? 8 : 0);
        this.D.setVisibility((this.D.getDrawable() == null || this.f721f0) ? 8 : 0);
        a0();
        h0(!z8);
        e0();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(e.d.f21128g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(e.d.f21129h);
    }

    private void h0(boolean z7) {
        int i8 = 8;
        if (this.f729n0 && !H() && z7) {
            this.f741u.setVisibility(8);
            i8 = 0;
        }
        this.f745w.setVisibility(i8);
    }

    private void setQuery(CharSequence charSequence) {
        this.f731p.setText(charSequence);
        this.f731p.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    private Intent y(String str, Uri uri, String str2, String str3, int i8, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f732p0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f740t0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i8 != 0) {
            intent.putExtra("action_key", i8);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f738s0.getSearchActivity());
        return intent;
    }

    private Intent z(Cursor cursor, int i8, String str) {
        int position;
        String strP;
        try {
            String strP2 = f1.p(cursor, "suggest_intent_action");
            if (strP2 == null) {
                strP2 = this.f738s0.getSuggestIntentAction();
            }
            if (strP2 == null) {
                strP2 = "android.intent.action.SEARCH";
            }
            String str2 = strP2;
            String strP3 = f1.p(cursor, "suggest_intent_data");
            if (strP3 == null) {
                strP3 = this.f738s0.getSuggestIntentData();
            }
            if (strP3 != null && (strP = f1.p(cursor, "suggest_intent_data_id")) != null) {
                strP3 = strP3 + "/" + Uri.encode(strP);
            }
            return y(str2, strP3 == null ? null : Uri.parse(strP3), f1.p(cursor, "suggest_intent_extra_data"), f1.p(cursor, "suggest_intent_query"), i8, str);
        } catch (RuntimeException e8) {
            try {
                position = cursor.getPosition();
            } catch (RuntimeException unused) {
                position = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e8);
            return null;
        }
    }

    void D() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f731p.refreshAutoCompleteResults();
            return;
        }
        n nVar = D0;
        nVar.b(this.f731p);
        nVar.a(this.f731p);
    }

    public boolean H() {
        return this.f722g0;
    }

    void L(int i8, String str, String str2) {
        getContext().startActivity(y("android.intent.action.SEARCH", null, null, str2, i8, str));
    }

    void N() {
        if (!TextUtils.isEmpty(this.f731p.getText())) {
            this.f731p.setText("");
            this.f731p.requestFocus();
            this.f731p.setImeVisibility(true);
        } else if (this.f721f0) {
            k kVar = this.f717b0;
            if (kVar == null || !kVar.a()) {
                clearFocus();
                g0(true);
            }
        }
    }

    boolean O(int i8, int i9, String str) {
        m mVar = this.f719d0;
        if (mVar != null && mVar.b(i8)) {
            return false;
        }
        M(i8, 0, null);
        this.f731p.setImeVisibility(false);
        C();
        return true;
    }

    boolean P(int i8) {
        m mVar = this.f719d0;
        if (mVar != null && mVar.a(i8)) {
            return false;
        }
        Y(i8);
        return true;
    }

    void Q(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void R() {
        g0(false);
        this.f731p.requestFocus();
        this.f731p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f720e0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void S() {
        Editable text = this.f731p.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        l lVar = this.f716a0;
        if (lVar == null || !lVar.b(text.toString())) {
            if (this.f738s0 != null) {
                L(0, null, text.toString());
            }
            this.f731p.setImeVisibility(false);
            C();
        }
    }

    boolean T(View view, int i8, KeyEvent keyEvent) {
        if (this.f738s0 != null && this.f723h0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i8 == 66 || i8 == 84 || i8 == 61) {
                return O(this.f731p.getListSelection(), 0, null);
            }
            if (i8 == 21 || i8 == 22) {
                this.f731p.setSelection(i8 == 21 ? 0 : this.f731p.length());
                this.f731p.setListSelection(0);
                this.f731p.clearListSelection();
                this.f731p.a();
                return true;
            }
            if (i8 == 19) {
                this.f731p.getListSelection();
                return false;
            }
        }
        return false;
    }

    void U(CharSequence charSequence) {
        Editable text = this.f731p.getText();
        this.f732p0 = text;
        boolean z7 = !TextUtils.isEmpty(text);
        f0(z7);
        h0(!z7);
        a0();
        e0();
        if (this.f716a0 != null && !TextUtils.equals(charSequence, this.f730o0)) {
            this.f716a0.a(charSequence.toString());
        }
        this.f730o0 = charSequence.toString();
    }

    void V() {
        g0(H());
        X();
        if (this.f731p.hasFocus()) {
            D();
        }
    }

    void W() {
        Intent intentA;
        SearchableInfo searchableInfo = this.f738s0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                intentA = B(this.H, searchableInfo);
            } else if (!searchableInfo.getVoiceSearchLaunchRecognizer()) {
                return;
            } else {
                intentA = A(this.I, searchableInfo);
            }
            getContext().startActivity(intentA);
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    public void Z(CharSequence charSequence, boolean z7) {
        this.f731p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f731p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f732p0 = charSequence;
        }
        if (!z7 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        S();
    }

    void b0() {
        int[] iArr = this.f731p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f735r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f737s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f727l0 = true;
        super.clearFocus();
        this.f731p.clearFocus();
        this.f731p.setImeVisibility(false);
        this.f727l0 = false;
    }

    public int getImeOptions() {
        return this.f731p.getImeOptions();
    }

    public int getInputType() {
        return this.f731p.getInputType();
    }

    public int getMaxWidth() {
        return this.f728m0;
    }

    public CharSequence getQuery() {
        return this.f731p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f725j0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f738s0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.W : getContext().getText(this.f738s0.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.G;
    }

    int getSuggestionRowLayout() {
        return this.F;
    }

    public b0.a getSuggestionsAdapter() {
        return this.f723h0;
    }

    @Override // j.c
    public void onActionViewCollapsed() {
        Z("", false);
        clearFocus();
        g0(true);
        this.f731p.setImeOptions(this.f736r0);
        this.f734q0 = false;
    }

    @Override // j.c
    public void onActionViewExpanded() {
        if (this.f734q0) {
            return;
        }
        this.f734q0 = true;
        int imeOptions = this.f731p.getImeOptions();
        this.f736r0 = imeOptions;
        this.f731p.setImeOptions(imeOptions | 33554432);
        this.f731p.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f742u0);
        post(this.f744v0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.r0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        super.onLayout(z7, i8, i9, i10, i11);
        if (z7) {
            E(this.f731p, this.f751z);
            Rect rect = this.A;
            Rect rect2 = this.f751z;
            rect.set(rect2.left, 0, rect2.right, i11 - i9);
            p pVar = this.f749y;
            if (pVar != null) {
                pVar.a(this.A, this.f751z);
                return;
            }
            p pVar2 = new p(this.A, this.f751z, this.f731p);
            this.f749y = pVar2;
            setTouchDelegate(pVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    @Override // androidx.appcompat.widget.r0, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.H()
            if (r0 == 0) goto La
            super.onMeasure(r4, r5)
            return
        La:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2c
            if (r0 == 0) goto L22
            if (r0 == r2) goto L1d
            goto L39
        L1d:
            int r0 = r3.f728m0
            if (r0 <= 0) goto L39
            goto L30
        L22:
            int r4 = r3.f728m0
            if (r4 <= 0) goto L27
            goto L39
        L27:
            int r4 = r3.getPreferredWidth()
            goto L39
        L2c:
            int r0 = r3.f728m0
            if (r0 <= 0) goto L31
        L30:
            goto L35
        L31:
            int r0 = r3.getPreferredWidth()
        L35:
            int r4 = java.lang.Math.min(r0, r4)
        L39:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L4b
            if (r0 == 0) goto L46
            goto L53
        L46:
            int r5 = r3.getPreferredHeight()
            goto L53
        L4b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L53:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.b());
        g0(oVar.f771c);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.f771c = H();
        return oVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z7) {
        super.onWindowFocusChanged(z7);
        X();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i8, Rect rect) {
        if (this.f727l0 || !isFocusable()) {
            return false;
        }
        if (H()) {
            return super.requestFocus(i8, rect);
        }
        boolean zRequestFocus = this.f731p.requestFocus(i8, rect);
        if (zRequestFocus) {
            g0(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f740t0 = bundle;
    }

    public void setIconified(boolean z7) {
        if (z7) {
            N();
        } else {
            R();
        }
    }

    public void setIconifiedByDefault(boolean z7) {
        if (this.f721f0 == z7) {
            return;
        }
        this.f721f0 = z7;
        g0(z7);
        c0();
    }

    public void setImeOptions(int i8) {
        this.f731p.setImeOptions(i8);
    }

    public void setInputType(int i8) {
        this.f731p.setInputType(i8);
    }

    public void setMaxWidth(int i8) {
        this.f728m0 = i8;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
        this.f717b0 = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f718c0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
        this.f716a0 = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f720e0 = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
        this.f719d0 = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f725j0 = charSequence;
        c0();
    }

    public void setQueryRefinementEnabled(boolean z7) {
        this.f726k0 = z7;
        b0.a aVar = this.f723h0;
        if (aVar instanceof f1) {
            ((f1) aVar).G(z7 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f738s0 = searchableInfo;
        if (searchableInfo != null) {
            d0();
            c0();
        }
        boolean zG = G();
        this.f729n0 = zG;
        if (zG) {
            this.f731p.setPrivateImeOptions("nm");
        }
        g0(H());
    }

    public void setSubmitButtonEnabled(boolean z7) {
        this.f724i0 = z7;
        g0(H());
    }

    public void setSuggestionsAdapter(b0.a aVar) {
        this.f723h0 = aVar;
        this.f731p.setAdapter(aVar);
    }

    void x() {
        if (this.f747x.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f735r.getPaddingLeft();
            Rect rect = new Rect();
            boolean zB = s1.b(this);
            int dimensionPixelSize = this.f721f0 ? resources.getDimensionPixelSize(e.d.f21126e) + resources.getDimensionPixelSize(e.d.f21127f) : 0;
            this.f731p.getDropDownBackground().getPadding(rect);
            int i8 = rect.left;
            this.f731p.setDropDownHorizontalOffset(zB ? -i8 : paddingLeft - (i8 + dimensionPixelSize));
            this.f731p.setDropDownWidth((((this.f747x.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}
