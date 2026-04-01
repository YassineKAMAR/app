package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.r0;
import f.a;

/* JADX INFO: loaded from: classes.dex */
public class e1 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Interpolator f913j = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Runnable f914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    r0 f916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Spinner f917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f920g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f921h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f922i;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f923a;

        a(View view) {
            this.f923a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            e1.this.smoothScrollTo(this.f923a.getLeft() - ((e1.this.getWidth() - this.f923a.getWidth()) / 2), 0);
            e1.this.f914a = null;
        }
    }

    private class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return e1.this.f916c.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i8) {
            return ((d) e1.this.f916c.getChildAt(i8)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i8) {
            return i8;
        }

        @Override // android.widget.Adapter
        public View getView(int i8, View view, ViewGroup viewGroup) {
            if (view == null) {
                return e1.this.c((a.c) getItem(i8), true);
            }
            ((d) view).a((a.c) getItem(i8));
            return view;
        }
    }

    private class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = e1.this.f916c.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = e1.this.f916c.getChildAt(i8);
                childAt.setSelected(childAt == view);
            }
        }
    }

    private class d extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a.c f928b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private TextView f929c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ImageView f930d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private View f931e;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(Context context, a.c cVar, boolean z7) {
            int i8 = e.a.f21090d;
            super(context, null, i8);
            int[] iArr = {R.attr.background};
            this.f927a = iArr;
            this.f928b = cVar;
            l1 l1VarU = l1.u(context, null, iArr, i8, 0);
            if (l1VarU.r(0)) {
                setBackgroundDrawable(l1VarU.f(0));
            }
            l1VarU.v();
            if (z7) {
                setGravity(8388627);
            }
            c();
        }

        public void a(a.c cVar) {
            this.f928b = cVar;
            c();
        }

        public a.c b() {
            return this.f928b;
        }

        public void c() {
            a.c cVar = this.f928b;
            View viewB = cVar.b();
            if (viewB != null) {
                ViewParent parent = viewB.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewB);
                    }
                    addView(viewB);
                }
                this.f931e = viewB;
                TextView textView = this.f929c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f930d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f930d.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f931e;
            if (view != null) {
                removeView(view);
                this.f931e = null;
            }
            Drawable drawableC = cVar.c();
            CharSequence charSequenceD = cVar.d();
            if (drawableC != null) {
                if (this.f930d == null) {
                    n nVar = new n(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    nVar.setLayoutParams(layoutParams);
                    addView(nVar, 0);
                    this.f930d = nVar;
                }
                this.f930d.setImageDrawable(drawableC);
                this.f930d.setVisibility(0);
            } else {
                ImageView imageView2 = this.f930d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f930d.setImageDrawable(null);
                }
            }
            boolean z7 = !TextUtils.isEmpty(charSequenceD);
            if (z7) {
                if (this.f929c == null) {
                    e0 e0Var = new e0(getContext(), null, e.a.f21091e);
                    e0Var.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    e0Var.setLayoutParams(layoutParams2);
                    addView(e0Var);
                    this.f929c = e0Var;
                }
                this.f929c.setText(charSequenceD);
                this.f929c.setVisibility(0);
            } else {
                TextView textView2 = this.f929c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f929c.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f930d;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            o1.a(this, z7 ? null : cVar.a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i8, int i9) {
            super.onMeasure(i8, i9);
            if (e1.this.f919f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i10 = e1.this.f919f;
                if (measuredWidth > i10) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), i9);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z7) {
            boolean z8 = isSelected() != z7;
            super.setSelected(z7);
            if (z8 && z7) {
                sendAccessibilityEvent(4);
            }
        }
    }

    private Spinner b() {
        v vVar = new v(getContext(), null, e.a.f21094h);
        vVar.setLayoutParams(new r0.a(-2, -1));
        vVar.setOnItemSelectedListener(this);
        return vVar;
    }

    private boolean d() {
        Spinner spinner = this.f917d;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        if (d()) {
            return;
        }
        if (this.f917d == null) {
            this.f917d = b();
        }
        removeView(this.f916c);
        addView(this.f917d, new ViewGroup.LayoutParams(-2, -1));
        if (this.f917d.getAdapter() == null) {
            this.f917d.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f914a;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f914a = null;
        }
        this.f917d.setSelection(this.f922i);
    }

    private boolean f() {
        if (!d()) {
            return false;
        }
        removeView(this.f917d);
        addView(this.f916c, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f917d.getSelectedItemPosition());
        return false;
    }

    public void a(int i8) {
        View childAt = this.f916c.getChildAt(i8);
        Runnable runnable = this.f914a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f914a = aVar;
        post(aVar);
    }

    d c(a.c cVar, boolean z7) {
        d dVar = new d(getContext(), cVar, z7);
        if (z7) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f921h));
        } else {
            dVar.setFocusable(true);
            if (this.f915b == null) {
                this.f915b = new c();
            }
            dVar.setOnClickListener(this.f915b);
        }
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f914a;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        j.a aVarB = j.a.b(getContext());
        setContentHeight(aVarB.f());
        this.f920g = aVarB.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f914a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i8, long j8) {
        ((d) view).b().e();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            int r8 = android.view.View.MeasureSpec.getMode(r7)
            r0 = 1
            r1 = 0
            r2 = 1073741824(0x40000000, float:2.0)
            if (r8 != r2) goto Lc
            r3 = 1
            goto Ld
        Lc:
            r3 = 0
        Ld:
            r6.setFillViewport(r3)
            androidx.appcompat.widget.r0 r4 = r6.f916c
            int r4 = r4.getChildCount()
            if (r4 <= r0) goto L3f
            if (r8 == r2) goto L1e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 != r5) goto L3f
        L1e:
            r8 = 2
            if (r4 <= r8) goto L2f
            int r8 = android.view.View.MeasureSpec.getSize(r7)
            float r8 = (float) r8
            r4 = 1053609165(0x3ecccccd, float:0.4)
            float r8 = r8 * r4
            int r8 = (int) r8
            r6.f919f = r8
            goto L36
        L2f:
            int r4 = android.view.View.MeasureSpec.getSize(r7)
            int r4 = r4 / r8
            r6.f919f = r4
        L36:
            int r8 = r6.f919f
            int r4 = r6.f920g
            int r8 = java.lang.Math.min(r8, r4)
            goto L40
        L3f:
            r8 = -1
        L40:
            r6.f919f = r8
            int r8 = r6.f921h
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r2)
            if (r3 != 0) goto L4f
            boolean r2 = r6.f918e
            if (r2 == 0) goto L4f
            goto L50
        L4f:
            r0 = 0
        L50:
            if (r0 == 0) goto L67
            androidx.appcompat.widget.r0 r0 = r6.f916c
            r0.measure(r1, r8)
            androidx.appcompat.widget.r0 r0 = r6.f916c
            int r0 = r0.getMeasuredWidth()
            int r1 = android.view.View.MeasureSpec.getSize(r7)
            if (r0 <= r1) goto L67
            r6.e()
            goto L6a
        L67:
            r6.f()
        L6a:
            int r0 = r6.getMeasuredWidth()
            super.onMeasure(r7, r8)
            int r7 = r6.getMeasuredWidth()
            if (r3 == 0) goto L7e
            if (r0 == r7) goto L7e
            int r7 = r6.f922i
            r6.setTabSelected(r7)
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.e1.onMeasure(int, int):void");
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z7) {
        this.f918e = z7;
    }

    public void setContentHeight(int i8) {
        this.f921h = i8;
        requestLayout();
    }

    public void setTabSelected(int i8) {
        this.f922i = i8;
        int childCount = this.f916c.getChildCount();
        int i9 = 0;
        while (i9 < childCount) {
            View childAt = this.f916c.getChildAt(i9);
            boolean z7 = i9 == i8;
            childAt.setSelected(z7);
            if (z7) {
                a(i8);
            }
            i9++;
        }
        Spinner spinner = this.f917d;
        if (spinner == null || i8 < 0) {
            return;
        }
        spinner.setSelection(i8);
    }
}
