package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.a;

/* JADX INFO: loaded from: classes.dex */
public class v extends Spinner {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f1132i = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.appcompat.widget.e f1133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f1134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private q0 f1135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SpinnerAdapter f1136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f1137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g f1138f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f1139g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Rect f1140h;

    class a extends q0 {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ e f1141j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, e eVar) {
            super(view);
            this.f1141j = eVar;
        }

        @Override // androidx.appcompat.widget.q0
        public k.e b() {
            return this.f1141j;
        }

        @Override // androidx.appcompat.widget.q0
        @SuppressLint({"SyntheticAccessor"})
        public boolean c() {
            if (v.this.getInternalPopup().a()) {
                return true;
            }
            v.this.b();
            return true;
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!v.this.getInternalPopup().a()) {
                v.this.b();
            }
            ViewTreeObserver viewTreeObserver = v.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    class c implements g, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.appcompat.app.a f1144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ListAdapter f1145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CharSequence f1146c;

        c() {
        }

        @Override // androidx.appcompat.widget.v.g
        public boolean a() {
            androidx.appcompat.app.a aVar = this.f1144a;
            if (aVar != null) {
                return aVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.v.g
        public int c() {
            return 0;
        }

        @Override // androidx.appcompat.widget.v.g
        public void dismiss() {
            androidx.appcompat.app.a aVar = this.f1144a;
            if (aVar != null) {
                aVar.dismiss();
                this.f1144a = null;
            }
        }

        @Override // androidx.appcompat.widget.v.g
        public void e(int i8) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.v.g
        public CharSequence f() {
            return this.f1146c;
        }

        @Override // androidx.appcompat.widget.v.g
        public Drawable h() {
            return null;
        }

        @Override // androidx.appcompat.widget.v.g
        public void i(CharSequence charSequence) {
            this.f1146c = charSequence;
        }

        @Override // androidx.appcompat.widget.v.g
        public void k(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.v.g
        public void l(int i8) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.v.g
        public void m(int i8) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.v.g
        public void n(int i8, int i9) {
            if (this.f1145b == null) {
                return;
            }
            a.C0009a c0009a = new a.C0009a(v.this.getPopupContext());
            CharSequence charSequence = this.f1146c;
            if (charSequence != null) {
                c0009a.h(charSequence);
            }
            androidx.appcompat.app.a aVarA = c0009a.g(this.f1145b, v.this.getSelectedItemPosition(), this).a();
            this.f1144a = aVarA;
            ListView listViewF = aVarA.f();
            listViewF.setTextDirection(i8);
            listViewF.setTextAlignment(i9);
            this.f1144a.show();
        }

        @Override // androidx.appcompat.widget.v.g
        public int o() {
            return 0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i8) {
            v.this.setSelection(i8);
            if (v.this.getOnItemClickListener() != null) {
                v.this.performItemClick(null, i8, this.f1145b.getItemId(i8));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.v.g
        public void p(ListAdapter listAdapter) {
            this.f1145b = listAdapter;
        }
    }

    private static class d implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private SpinnerAdapter f1148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ListAdapter f1149b;

        public d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1148a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1149b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                        return;
                    }
                    return;
                }
                if (spinnerAdapter instanceof h1) {
                    h1 h1Var = (h1) spinnerAdapter;
                    if (h1Var.getDropDownViewTheme() == null) {
                        h1Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1149b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1148a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i8, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1148a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i8, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i8) {
            SpinnerAdapter spinnerAdapter = this.f1148a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i8);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i8) {
            SpinnerAdapter spinnerAdapter = this.f1148a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i8);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i8) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i8, View view, ViewGroup viewGroup) {
            return getDropDownView(i8, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1148a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i8) {
            ListAdapter listAdapter = this.f1149b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i8);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1148a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1148a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    class e extends v0 implements g {
        private CharSequence W;
        ListAdapter X;
        private final Rect Y;
        private int Z;

        class a implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ v f1151a;

            a(v vVar) {
                this.f1151a = vVar;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i8, long j8) {
                v.this.setSelection(i8);
                if (v.this.getOnItemClickListener() != null) {
                    e eVar = e.this;
                    v.this.performItemClick(view, i8, eVar.X.getItemId(i8));
                }
                e.this.dismiss();
            }
        }

        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                e eVar = e.this;
                if (!eVar.Q(v.this)) {
                    e.this.dismiss();
                } else {
                    e.this.O();
                    e.super.b();
                }
            }
        }

        class c implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1154a;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1154a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = v.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1154a);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i8) {
            super(context, attributeSet, i8);
            this.Y = new Rect();
            z(v.this);
            F(true);
            K(0);
            H(new a(v.this));
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void O() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.h()
                r1 = 0
                if (r0 == 0) goto L26
                androidx.appcompat.widget.v r1 = androidx.appcompat.widget.v.this
                android.graphics.Rect r1 = r1.f1140h
                r0.getPadding(r1)
                androidx.appcompat.widget.v r0 = androidx.appcompat.widget.v.this
                boolean r0 = androidx.appcompat.widget.s1.b(r0)
                if (r0 == 0) goto L1d
                androidx.appcompat.widget.v r0 = androidx.appcompat.widget.v.this
                android.graphics.Rect r0 = r0.f1140h
                int r0 = r0.right
                goto L24
            L1d:
                androidx.appcompat.widget.v r0 = androidx.appcompat.widget.v.this
                android.graphics.Rect r0 = r0.f1140h
                int r0 = r0.left
                int r0 = -r0
            L24:
                r1 = r0
                goto L2e
            L26:
                androidx.appcompat.widget.v r0 = androidx.appcompat.widget.v.this
                android.graphics.Rect r0 = r0.f1140h
                r0.right = r1
                r0.left = r1
            L2e:
                androidx.appcompat.widget.v r0 = androidx.appcompat.widget.v.this
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.v r2 = androidx.appcompat.widget.v.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.v r3 = androidx.appcompat.widget.v.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.v r4 = androidx.appcompat.widget.v.this
                int r5 = r4.f1139g
                r6 = -2
                if (r5 != r6) goto L78
                android.widget.ListAdapter r5 = r8.X
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.h()
                int r4 = r4.a(r5, r6)
                androidx.appcompat.widget.v r5 = androidx.appcompat.widget.v.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.v r6 = androidx.appcompat.widget.v.this
                android.graphics.Rect r6 = r6.f1140h
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L70
                r4 = r5
            L70:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L7e
            L78:
                r4 = -1
                if (r5 != r4) goto L82
                int r4 = r3 - r0
                int r4 = r4 - r2
            L7e:
                r8.B(r4)
                goto L85
            L82:
                r8.B(r5)
            L85:
                androidx.appcompat.widget.v r4 = androidx.appcompat.widget.v.this
                boolean r4 = androidx.appcompat.widget.s1.b(r4)
                if (r4 == 0) goto L9a
                int r3 = r3 - r2
                int r0 = r8.v()
                int r3 = r3 - r0
                int r0 = r8.P()
                int r3 = r3 - r0
                int r1 = r1 + r3
                goto La0
            L9a:
                int r2 = r8.P()
                int r0 = r0 + r2
                int r1 = r1 + r0
            La0:
                r8.e(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.v.e.O():void");
        }

        public int P() {
            return this.Z;
        }

        boolean Q(View view) {
            return androidx.core.view.e0.v(view) && view.getGlobalVisibleRect(this.Y);
        }

        @Override // androidx.appcompat.widget.v.g
        public CharSequence f() {
            return this.W;
        }

        @Override // androidx.appcompat.widget.v.g
        public void i(CharSequence charSequence) {
            this.W = charSequence;
        }

        @Override // androidx.appcompat.widget.v.g
        public void m(int i8) {
            this.Z = i8;
        }

        @Override // androidx.appcompat.widget.v.g
        public void n(int i8, int i9) {
            ViewTreeObserver viewTreeObserver;
            boolean zA = a();
            O();
            E(2);
            super.b();
            ListView listViewJ = j();
            listViewJ.setChoiceMode(1);
            listViewJ.setTextDirection(i8);
            listViewJ.setTextAlignment(i9);
            L(v.this.getSelectedItemPosition());
            if (zA || (viewTreeObserver = v.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            G(new c(bVar));
        }

        @Override // androidx.appcompat.widget.v0, androidx.appcompat.widget.v.g
        public void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.X = listAdapter;
        }
    }

    static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f1156a;

        class a implements Parcelable.Creator<f> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i8) {
                return new f[i8];
            }
        }

        f(Parcel parcel) {
            super(parcel);
            this.f1156a = parcel.readByte() != 0;
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeByte(this.f1156a ? (byte) 1 : (byte) 0);
        }
    }

    interface g {
        boolean a();

        int c();

        void dismiss();

        void e(int i8);

        CharSequence f();

        Drawable h();

        void i(CharSequence charSequence);

        void k(Drawable drawable);

        void l(int i8);

        void m(int i8);

        void n(int i8, int i9);

        int o();

        void p(ListAdapter listAdapter);
    }

    public v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.I);
    }

    public v(Context context, AttributeSet attributeSet, int i8) {
        this(context, attributeSet, i8, -1);
    }

    public v(Context context, AttributeSet attributeSet, int i8, int i9) {
        this(context, attributeSet, i8, i9, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, androidx.appcompat.widget.v] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public v(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.v.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i8 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f1140h);
        Rect rect = this.f1140h;
        return iMax2 + rect.left + rect.right;
    }

    void b() {
        this.f1138f.n(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.e eVar = this.f1133a;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        g gVar = this.f1138f;
        return gVar != null ? gVar.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        g gVar = this.f1138f;
        return gVar != null ? gVar.o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f1138f != null ? this.f1139g : super.getDropDownWidth();
    }

    final g getInternalPopup() {
        return this.f1138f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        g gVar = this.f1138f;
        return gVar != null ? gVar.h() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1134b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        g gVar = this.f1138f;
        return gVar != null ? gVar.f() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.e eVar = this.f1133a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.e eVar = this.f1133a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.f1138f;
        if (gVar == null || !gVar.a()) {
            return;
        }
        this.f1138f.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        if (this.f1138f == null || View.MeasureSpec.getMode(i8) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i8)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (!fVar.f1156a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        g gVar = this.f1138f;
        fVar.f1156a = gVar != null && gVar.a();
        return fVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        q0 q0Var = this.f1135c;
        if (q0Var == null || !q0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        g gVar = this.f1138f;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.a()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1137e) {
            this.f1136d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1138f != null) {
            Context context = this.f1134b;
            if (context == null) {
                context = getContext();
            }
            this.f1138f.p(new d(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.e eVar = this.f1133a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        androidx.appcompat.widget.e eVar = this.f1133a;
        if (eVar != null) {
            eVar.g(i8);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i8) {
        g gVar = this.f1138f;
        if (gVar == null) {
            super.setDropDownHorizontalOffset(i8);
        } else {
            gVar.m(i8);
            this.f1138f.e(i8);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i8) {
        g gVar = this.f1138f;
        if (gVar != null) {
            gVar.l(i8);
        } else {
            super.setDropDownVerticalOffset(i8);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i8) {
        if (this.f1138f != null) {
            this.f1139g = i8;
        } else {
            super.setDropDownWidth(i8);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.f1138f;
        if (gVar != null) {
            gVar.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i8) {
        setPopupBackgroundDrawable(g.b.d(getPopupContext(), i8));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        g gVar = this.f1138f;
        if (gVar != null) {
            gVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.e eVar = this.f1133a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.e eVar = this.f1133a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }
}
