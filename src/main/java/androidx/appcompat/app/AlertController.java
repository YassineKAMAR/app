package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.r0;
import androidx.core.view.e0;
import androidx.core.widget.NestedScrollView;
import e.j;
import f.i;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class AlertController {
    NestedScrollView A;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    Handler R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final i f360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Window f361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f364f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ListView f365g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f366h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f367i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f368j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f369k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f370l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f371m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Button f373o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f374p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    Message f375q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f376r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Button f377s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private CharSequence f378t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    Message f379u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Drawable f380v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    Button f381w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CharSequence f382x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    Message f383y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Drawable f384z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f372n = false;
    private int B = 0;
    int I = -1;
    private int Q = 0;
    private final View.OnClickListener S = new a();

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f386b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f21250f2);
            this.f386b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(j.f21255g2, -1);
            this.f385a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(j.f21260h2, -1);
        }

        public void a(boolean z7, boolean z8) {
            if (z8 && z7) {
                return;
            }
            setPadding(getPaddingLeft(), z7 ? getPaddingTop() : this.f385a, getPaddingRight(), z8 ? getPaddingBottom() : this.f386b);
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            Message messageObtain = ((view != alertController.f373o || (message2 = alertController.f375q) == null) && (view != alertController.f377s || (message2 = alertController.f379u) == null)) ? (view != alertController.f381w || (message = alertController.f383y) == null) ? null : Message.obtain(message) : Message.obtain(message2);
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.f360b).sendToTarget();
        }
    }

    class b implements NestedScrollView.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f389b;

        b(View view, View view2) {
            this.f388a = view;
            this.f389b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.c
        public void a(NestedScrollView nestedScrollView, int i8, int i9, int i10, int i11) {
            AlertController.f(nestedScrollView, this.f388a, this.f389b);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f392b;

        c(View view, View view2) {
            this.f391a = view;
            this.f392b = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.f(AlertController.this.A, this.f391a, this.f392b);
        }
    }

    class d implements AbsListView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f395b;

        d(View view, View view2) {
            this.f394a = view;
            this.f395b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i8, int i9, int i10) {
            AlertController.f(absListView, this.f394a, this.f395b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i8) {
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f398b;

        e(View view, View view2) {
            this.f397a = view;
            this.f398b = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.f(AlertController.this.f365g, this.f397a, this.f398b);
        }
    }

    public static class f {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;
        public e O;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LayoutInflater f401b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Drawable f403d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f405f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f406g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f407h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public CharSequence f408i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Drawable f409j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f410k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f411l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Drawable f412m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f413n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public CharSequence f414o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Drawable f415p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f416q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f418s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f419t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f420u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public CharSequence[] f421v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ListAdapter f422w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f423x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f424y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public View f425z;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f402c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f404e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean P = true;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f417r = true;

        class a extends ArrayAdapter<CharSequence> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f426a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i8, int i9, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i8, i9, charSequenceArr);
                this.f426a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i8, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i8, view, viewGroup);
                boolean[] zArr = f.this.F;
                if (zArr != null && zArr[i8]) {
                    this.f426a.setItemChecked(i8, true);
                }
                return view2;
            }
        }

        class b extends CursorAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f428a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f429b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ RecycleListView f430c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ AlertController f431d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z7, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z7);
                this.f430c = recycleListView;
                this.f431d = alertController;
                Cursor cursor2 = getCursor();
                this.f428a = cursor2.getColumnIndexOrThrow(f.this.L);
                this.f429b = cursor2.getColumnIndexOrThrow(f.this.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f428a));
                this.f430c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f429b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return f.this.f401b.inflate(this.f431d.M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AlertController f433a;

            c(AlertController alertController) {
                this.f433a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i8, long j8) {
                f.this.f423x.onClick(this.f433a.f360b, i8);
                if (f.this.H) {
                    return;
                }
                this.f433a.f360b.dismiss();
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f435a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AlertController f436b;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f435a = recycleListView;
                this.f436b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i8, long j8) {
                boolean[] zArr = f.this.F;
                if (zArr != null) {
                    zArr[i8] = this.f435a.isItemChecked(i8);
                }
                f.this.J.onClick(this.f436b.f360b, i8, this.f435a.isItemChecked(i8));
            }
        }

        public interface e {
            void a(ListView listView);
        }

        public f(Context context) {
            this.f400a = context;
            this.f401b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void b(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f401b
                int r1 = r11.L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.G
                r8 = 1
                if (r1 == 0) goto L35
                android.database.Cursor r1 = r10.K
                if (r1 != 0) goto L26
                androidx.appcompat.app.AlertController$f$a r9 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r10.f400a
                int r4 = r11.M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f421v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L26:
                androidx.appcompat.app.AlertController$f$b r9 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r10.f400a
                android.database.Cursor r4 = r10.K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L35:
                boolean r1 = r10.H
                if (r1 == 0) goto L3c
                int r1 = r11.N
                goto L3e
            L3c:
                int r1 = r11.O
            L3e:
                r4 = r1
                android.database.Cursor r1 = r10.K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L5d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f400a
                android.database.Cursor r5 = r10.K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L5d:
                android.widget.ListAdapter r9 = r10.f422w
                if (r9 == 0) goto L62
                goto L6b
            L62:
                androidx.appcompat.app.AlertController$h r9 = new androidx.appcompat.app.AlertController$h
                android.content.Context r1 = r10.f400a
                java.lang.CharSequence[] r3 = r10.f421v
                r9.<init>(r1, r4, r2, r3)
            L6b:
                androidx.appcompat.app.AlertController$f$e r1 = r10.O
                if (r1 == 0) goto L72
                r1.a(r0)
            L72:
                r11.H = r9
                int r1 = r10.I
                r11.I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f423x
                if (r1 == 0) goto L85
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r11)
            L81:
                r0.setOnItemClickListener(r1)
                goto L8f
            L85:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.J
                if (r1 == 0) goto L8f
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r11)
                goto L81
            L8f:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.N
                if (r1 == 0) goto L96
                r0.setOnItemSelectedListener(r1)
            L96:
                boolean r1 = r10.H
                if (r1 == 0) goto L9e
                r0.setChoiceMode(r8)
                goto La6
            L9e:
                boolean r1 = r10.G
                if (r1 == 0) goto La6
                r1 = 2
                r0.setChoiceMode(r1)
            La6:
                r11.f365g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.f.b(androidx.appcompat.app.AlertController):void");
        }

        public void a(AlertController alertController) {
            View view = this.f406g;
            if (view != null) {
                alertController.l(view);
            } else {
                CharSequence charSequence = this.f405f;
                if (charSequence != null) {
                    alertController.q(charSequence);
                }
                Drawable drawable = this.f403d;
                if (drawable != null) {
                    alertController.n(drawable);
                }
                int i8 = this.f402c;
                if (i8 != 0) {
                    alertController.m(i8);
                }
                int i9 = this.f404e;
                if (i9 != 0) {
                    alertController.m(alertController.c(i9));
                }
            }
            CharSequence charSequence2 = this.f407h;
            if (charSequence2 != null) {
                alertController.o(charSequence2);
            }
            CharSequence charSequence3 = this.f408i;
            if (charSequence3 != null || this.f409j != null) {
                alertController.k(-1, charSequence3, this.f410k, null, this.f409j);
            }
            CharSequence charSequence4 = this.f411l;
            if (charSequence4 != null || this.f412m != null) {
                alertController.k(-2, charSequence4, this.f413n, null, this.f412m);
            }
            CharSequence charSequence5 = this.f414o;
            if (charSequence5 != null || this.f415p != null) {
                alertController.k(-3, charSequence5, this.f416q, null, this.f415p);
            }
            if (this.f421v != null || this.K != null || this.f422w != null) {
                b(alertController);
            }
            View view2 = this.f425z;
            if (view2 != null) {
                if (this.E) {
                    alertController.t(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController.s(view2);
                    return;
                }
            }
            int i10 = this.f424y;
            if (i10 != 0) {
                alertController.r(i10);
            }
        }
    }

    private static final class g extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<DialogInterface> f438a;

        public g(DialogInterface dialogInterface) {
            this.f438a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i8 = message.what;
            if (i8 == -3 || i8 == -2 || i8 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f438a.get(), message.what);
            } else {
                if (i8 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class h extends ArrayAdapter<CharSequence> {
        public h(Context context, int i8, int i9, CharSequence[] charSequenceArr) {
            super(context, i8, i9, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i8) {
            return i8;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, i iVar, Window window) {
        this.f359a = context;
        this.f360b = iVar;
        this.f361c = window;
        this.R = new g(iVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, j.F, e.a.f21100n, 0);
        this.J = typedArrayObtainStyledAttributes.getResourceId(j.G, 0);
        this.K = typedArrayObtainStyledAttributes.getResourceId(j.I, 0);
        this.L = typedArrayObtainStyledAttributes.getResourceId(j.K, 0);
        this.M = typedArrayObtainStyledAttributes.getResourceId(j.L, 0);
        this.N = typedArrayObtainStyledAttributes.getResourceId(j.N, 0);
        this.O = typedArrayObtainStyledAttributes.getResourceId(j.J, 0);
        this.P = typedArrayObtainStyledAttributes.getBoolean(j.M, true);
        this.f362d = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.H, 0);
        typedArrayObtainStyledAttributes.recycle();
        iVar.e(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    static void f(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    private ViewGroup i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int j() {
        int i8 = this.K;
        return (i8 != 0 && this.Q == 1) ? i8 : this.J;
    }

    private void p(ViewGroup viewGroup, View view, int i8, int i9) {
        View view2;
        Runnable eVar;
        View viewFindViewById = this.f361c.findViewById(e.f.f21181v);
        View viewFindViewById2 = this.f361c.findViewById(e.f.f21180u);
        if (Build.VERSION.SDK_INT < 23) {
            if (viewFindViewById != null && (i8 & 1) == 0) {
                viewGroup.removeView(viewFindViewById);
                viewFindViewById = null;
            }
            if (viewFindViewById2 != null && (i8 & 2) == 0) {
                viewGroup.removeView(viewFindViewById2);
                viewFindViewById2 = null;
            }
            if (viewFindViewById == null && viewFindViewById2 == null) {
                return;
            }
            if (this.f364f != null) {
                this.A.setOnScrollChangeListener(new b(viewFindViewById, viewFindViewById2));
                view2 = this.A;
                eVar = new c(viewFindViewById, viewFindViewById2);
            } else {
                ListView listView = this.f365g;
                if (listView != null) {
                    listView.setOnScrollListener(new d(viewFindViewById, viewFindViewById2));
                    view2 = this.f365g;
                    eVar = new e(viewFindViewById, viewFindViewById2);
                } else {
                    if (viewFindViewById != null) {
                        viewGroup.removeView(viewFindViewById);
                    }
                    if (viewFindViewById2 == null) {
                        return;
                    }
                }
            }
            view2.post(eVar);
            return;
        }
        e0.O(view, i8, i9);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 == null) {
            return;
        }
        viewGroup.removeView(viewFindViewById2);
    }

    private void u(ViewGroup viewGroup) {
        int i8;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(R.id.button1);
        this.f373o = button2;
        button2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f374p) && this.f376r == null) {
            this.f373o.setVisibility(8);
            i8 = 0;
        } else {
            this.f373o.setText(this.f374p);
            Drawable drawable = this.f376r;
            if (drawable != null) {
                int i9 = this.f362d;
                drawable.setBounds(0, 0, i9, i9);
                this.f373o.setCompoundDrawables(this.f376r, null, null, null);
            }
            this.f373o.setVisibility(0);
            i8 = 1;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button2);
        this.f377s = button3;
        button3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f378t) && this.f380v == null) {
            this.f377s.setVisibility(8);
        } else {
            this.f377s.setText(this.f378t);
            Drawable drawable2 = this.f380v;
            if (drawable2 != null) {
                int i10 = this.f362d;
                drawable2.setBounds(0, 0, i10, i10);
                this.f377s.setCompoundDrawables(this.f380v, null, null, null);
            }
            this.f377s.setVisibility(0);
            i8 |= 2;
        }
        Button button4 = (Button) viewGroup.findViewById(R.id.button3);
        this.f381w = button4;
        button4.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f382x) && this.f384z == null) {
            this.f381w.setVisibility(8);
        } else {
            this.f381w.setText(this.f382x);
            Drawable drawable3 = this.f384z;
            if (drawable3 != null) {
                int i11 = this.f362d;
                drawable3.setBounds(0, 0, i11, i11);
                this.f381w.setCompoundDrawables(this.f384z, null, null, null);
            }
            this.f381w.setVisibility(0);
            i8 |= 4;
        }
        if (z(this.f359a)) {
            if (i8 == 1) {
                button = this.f373o;
            } else if (i8 == 2) {
                button = this.f377s;
            } else if (i8 == 4) {
                button = this.f381w;
            }
            b(button);
        }
        if (i8 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f361c.findViewById(e.f.f21182w);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f364f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.f365g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f365g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void w(ViewGroup viewGroup) {
        View viewInflate = this.f366h;
        if (viewInflate == null) {
            viewInflate = this.f367i != 0 ? LayoutInflater.from(this.f359a).inflate(this.f367i, viewGroup, false) : null;
        }
        boolean z7 = viewInflate != null;
        if (!z7 || !a(viewInflate)) {
            this.f361c.setFlags(131072, 131072);
        }
        if (!z7) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f361c.findViewById(e.f.f21173n);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f372n) {
            frameLayout.setPadding(this.f368j, this.f369k, this.f370l, this.f371m);
        }
        if (this.f365g != null) {
            ((r0.a) viewGroup.getLayoutParams()).f1119a = 0.0f;
        }
    }

    private void x(ViewGroup viewGroup) {
        View viewFindViewById;
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            viewFindViewById = this.f361c.findViewById(e.f.O);
        } else {
            this.D = (ImageView) this.f361c.findViewById(R.id.icon);
            if ((!TextUtils.isEmpty(this.f363e)) && this.P) {
                TextView textView = (TextView) this.f361c.findViewById(e.f.f21169j);
                this.E = textView;
                textView.setText(this.f363e);
                int i8 = this.B;
                if (i8 != 0) {
                    this.D.setImageResource(i8);
                    return;
                }
                Drawable drawable = this.C;
                if (drawable != null) {
                    this.D.setImageDrawable(drawable);
                    return;
                } else {
                    this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
                    this.D.setVisibility(8);
                    return;
                }
            }
            this.f361c.findViewById(e.f.O).setVisibility(8);
            this.D.setVisibility(8);
            viewFindViewById = viewGroup;
        }
        viewFindViewById.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void y() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f361c.findViewById(e.f.f21179t);
        int i8 = e.f.P;
        View viewFindViewById4 = viewFindViewById3.findViewById(i8);
        int i9 = e.f.f21172m;
        View viewFindViewById5 = viewFindViewById3.findViewById(i9);
        int i10 = e.f.f21170k;
        View viewFindViewById6 = viewFindViewById3.findViewById(i10);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(e.f.f21174o);
        w(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(i8);
        View viewFindViewById8 = viewGroup.findViewById(i9);
        View viewFindViewById9 = viewGroup.findViewById(i10);
        ViewGroup viewGroupI = i(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupI2 = i(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupI3 = i(viewFindViewById9, viewFindViewById6);
        v(viewGroupI2);
        u(viewGroupI3);
        x(viewGroupI);
        boolean z7 = viewGroup.getVisibility() != 8;
        boolean z8 = (viewGroupI == null || viewGroupI.getVisibility() == 8) ? 0 : 1;
        boolean z9 = (viewGroupI3 == null || viewGroupI3.getVisibility() == 8) ? false : true;
        if (!z9 && viewGroupI2 != null && (viewFindViewById2 = viewGroupI2.findViewById(e.f.K)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z8 != 0) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f364f == null && this.f365g == null) ? null : viewGroupI.findViewById(e.f.N);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupI2 != null && (viewFindViewById = viewGroupI2.findViewById(e.f.L)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f365g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z8, z9);
        }
        if (!z7) {
            View view = this.f365g;
            if (view == null) {
                view = this.A;
            }
            if (view != null) {
                p(viewGroupI2, view, z8 | (z9 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f365g;
        if (listView2 == null || (listAdapter = this.H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i11 = this.I;
        if (i11 > -1) {
            listView2.setItemChecked(i11, true);
            listView2.setSelection(i11);
        }
    }

    private static boolean z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(e.a.f21099m, typedValue, true);
        return typedValue.data != 0;
    }

    public int c(int i8) {
        TypedValue typedValue = new TypedValue();
        this.f359a.getTheme().resolveAttribute(i8, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f365g;
    }

    public void e() {
        this.f360b.setContentView(j());
        y();
    }

    public boolean g(int i8, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.s(keyEvent);
    }

    public boolean h(int i8, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.s(keyEvent);
    }

    public void k(int i8, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i8, onClickListener);
        }
        if (i8 == -3) {
            this.f382x = charSequence;
            this.f383y = message;
            this.f384z = drawable;
        } else if (i8 == -2) {
            this.f378t = charSequence;
            this.f379u = message;
            this.f380v = drawable;
        } else {
            if (i8 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f374p = charSequence;
            this.f375q = message;
            this.f376r = drawable;
        }
    }

    public void l(View view) {
        this.G = view;
    }

    public void m(int i8) {
        this.C = null;
        this.B = i8;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i8 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageResource(this.B);
            }
        }
    }

    public void n(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageDrawable(drawable);
            }
        }
    }

    public void o(CharSequence charSequence) {
        this.f364f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(CharSequence charSequence) {
        this.f363e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void r(int i8) {
        this.f366h = null;
        this.f367i = i8;
        this.f372n = false;
    }

    public void s(View view) {
        this.f366h = view;
        this.f367i = 0;
        this.f372n = false;
    }

    public void t(View view, int i8, int i9, int i10, int i11) {
        this.f366h = view;
        this.f367i = 0;
        this.f372n = true;
        this.f368j = i8;
        this.f369k = i9;
        this.f370l = i10;
        this.f371m = i11;
    }
}
