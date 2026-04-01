package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
class o0 extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f1049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Field f1055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f1056h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f1057i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f1058j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f1059k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private androidx.core.view.f1 f1060l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private androidx.core.widget.i f1061m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    b f1062n;

    private static class a extends h.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f1063b;

        a(Drawable drawable) {
            super(drawable);
            this.f1063b = true;
        }

        void c(boolean z7) {
            this.f1063b = z7;
        }

        @Override // h.d, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f1063b) {
                super.draw(canvas);
            }
        }

        @Override // h.d, android.graphics.drawable.Drawable
        public void setHotspot(float f8, float f9) {
            if (this.f1063b) {
                super.setHotspot(f8, f9);
            }
        }

        @Override // h.d, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i8, int i9, int i10, int i11) {
            if (this.f1063b) {
                super.setHotspotBounds(i8, i9, i10, i11);
            }
        }

        @Override // h.d, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1063b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // h.d, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z7, boolean z8) {
            if (this.f1063b) {
                return super.setVisible(z7, z8);
            }
            return false;
        }
    }

    private class b implements Runnable {
        b() {
        }

        public void a() {
            o0 o0Var = o0.this;
            o0Var.f1062n = null;
            o0Var.removeCallbacks(this);
        }

        public void b() {
            o0.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            o0 o0Var = o0.this;
            o0Var.f1062n = null;
            o0Var.drawableStateChanged();
        }
    }

    o0(Context context, boolean z7) {
        super(context, null, e.a.f21112z);
        this.f1049a = new Rect();
        this.f1050b = 0;
        this.f1051c = 0;
        this.f1052d = 0;
        this.f1053e = 0;
        this.f1058j = z7;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1055g = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e8) {
            e8.printStackTrace();
        }
    }

    private void a() {
        this.f1059k = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1054f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        androidx.core.view.f1 f1Var = this.f1060l;
        if (f1Var != null) {
            f1Var.c();
            this.f1060l = null;
        }
    }

    private void b(View view, int i8) {
        performItemClick(view, i8, getItemIdAtPosition(i8));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (this.f1049a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f1049a);
        selector.draw(canvas);
    }

    private void f(int i8, View view) {
        Rect rect = this.f1049a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1050b;
        rect.top -= this.f1051c;
        rect.right += this.f1052d;
        rect.bottom += this.f1053e;
        try {
            boolean z7 = this.f1055g.getBoolean(this);
            if (view.isEnabled() != z7) {
                this.f1055g.set(this, Boolean.valueOf(!z7));
                if (i8 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e8) {
            e8.printStackTrace();
        }
    }

    private void g(int i8, View view) {
        Drawable selector = getSelector();
        boolean z7 = (selector == null || i8 == -1) ? false : true;
        if (z7) {
            selector.setVisible(false, false);
        }
        f(i8, view);
        if (z7) {
            Rect rect = this.f1049a;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            androidx.core.graphics.drawable.a.j(selector, fExactCenterX, fExactCenterY);
        }
    }

    private void h(int i8, View view, float f8, float f9) {
        g(i8, view);
        Drawable selector = getSelector();
        if (selector == null || i8 == -1) {
            return;
        }
        androidx.core.graphics.drawable.a.j(selector, f8, f9);
    }

    private void i(View view, int i8, float f8, float f9) {
        View childAt;
        this.f1059k = true;
        drawableHotspotChanged(f8, f9);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i9 = this.f1054f;
        if (i9 != -1 && (childAt = getChildAt(i9 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f1054f = i8;
        view.drawableHotspotChanged(f8 - view.getLeft(), f9 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i8, view, f8, f9);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    private boolean j() {
        return this.f1059k;
    }

    private void k() {
        Drawable selector = getSelector();
        if (selector != null && j() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z7) {
        a aVar = this.f1056h;
        if (aVar != null) {
            aVar.c(z7);
        }
    }

    public int d(int i8, int i9, int i10, int i11, int i12) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return measuredHeight;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < count) {
            int itemViewType = adapter.getItemViewType(i13);
            if (itemViewType != i14) {
                view = null;
                i14 = itemViewType;
            }
            view = adapter.getView(i13, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i16 = layoutParams.height;
            view.measure(i8, i16 > 0 ? View.MeasureSpec.makeMeasureSpec(i16, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i13 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i11) {
                return (i12 < 0 || i13 <= i12 || i15 <= 0 || measuredHeight == i11) ? i11 : i15;
            }
            if (i12 >= 0 && i13 >= i12) {
                i15 = measuredHeight;
            }
            i13++;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f1062n != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        k();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r9 = 0
            r3 = 1
            goto L46
        L11:
            r9 = 0
            r3 = 0
            goto L46
        L14:
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = 1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.i(r3, r5, r4, r9)
            if (r0 != r2) goto Le
            r7.b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.a()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.i r9 = r7.f1061m
            if (r9 != 0) goto L5a
            androidx.core.widget.i r9 = new androidx.core.widget.i
            r9.<init>(r7)
            r7.f1061m = r9
        L5a:
            androidx.core.widget.i r9 = r7.f1061m
            r9.m(r2)
            androidx.core.widget.i r9 = r7.f1061m
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            androidx.core.widget.i r8 = r7.f1061m
            if (r8 == 0) goto L6c
            r8.m(r1)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0.e(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f1058j || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f1058j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f1058j || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f1058j && this.f1057i) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f1062n = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1062n == null) {
            b bVar = new b();
            this.f1062n = bVar;
            bVar.b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                }
                k();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1054f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f1062n;
        if (bVar != null) {
            bVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    void setListSelectionHidden(boolean z7) {
        this.f1057i = z7;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f1056h = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1050b = rect.left;
        this.f1051c = rect.top;
        this.f1052d = rect.right;
        this.f1053e = rect.bottom;
    }
}
