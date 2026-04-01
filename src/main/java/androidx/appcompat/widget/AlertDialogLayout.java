package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.r0;

/* JADX INFO: loaded from: classes.dex */
public class AlertDialogLayout extends r0 {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void h(int i8, int i9) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i10 = 0; i10 < i8; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                r0.a aVar = (r0.a) childAt.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
                    int i11 = ((ViewGroup.MarginLayoutParams) aVar).height;
                    ((ViewGroup.MarginLayoutParams) aVar).height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, iMakeMeasureSpec, 0, i9, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).height = i11;
                }
            }
        }
    }

    private void w(View view, int i8, int i9, int i10, int i11) {
        view.layout(i8, i9, i10 + i8, i11 + i9);
    }

    private static int x(View view) {
        int iO = androidx.core.view.e0.o(view);
        if (iO > 0) {
            return iO;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return x(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    private boolean y(int i8, int i9) {
        int iCombineMeasuredStates;
        int iX;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == e.f.P) {
                    view = childAt;
                } else if (id == e.f.f21170k) {
                    view2 = childAt;
                } else {
                    if ((id != e.f.f21172m && id != e.f.f21174o) || view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i9);
        int mode2 = View.MeasureSpec.getMode(i8);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i8, 0);
            paddingTop += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i8, 0);
            iX = x(view2);
            measuredHeight = view2.getMeasuredHeight() - iX;
            paddingTop += iX;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iX = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i8, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingTop += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i11 = size - paddingTop;
        if (view2 != null) {
            int i12 = paddingTop - iX;
            int iMin = Math.min(i11, measuredHeight);
            if (iMin > 0) {
                i11 -= iMin;
                iX += iMin;
            }
            view2.measure(i8, View.MeasureSpec.makeMeasureSpec(iX, 1073741824));
            paddingTop = i12 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i11 > 0) {
            view3.measure(i8, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i11, mode));
            paddingTop = (paddingTop - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(iMax + getPaddingLeft() + getPaddingRight(), i8, iCombineMeasuredStates), View.resolveSizeAndState(paddingTop, i9, 0));
        if (mode2 == 1073741824) {
            return true;
        }
        h(childCount, i9);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    @Override // androidx.appcompat.widget.r0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r21 - r19
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r0 = r17.getMeasuredHeight()
            int r10 = r17.getChildCount()
            int r1 = r17.getGravity()
            r2 = r1 & 112(0x70, float:1.57E-43)
            r3 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r1 & r3
            r1 = 16
            if (r2 == r1) goto L40
            r1 = 80
            if (r2 == r1) goto L35
            int r0 = r17.getPaddingTop()
            goto L4b
        L35:
            int r1 = r17.getPaddingTop()
            int r1 = r1 + r22
            int r1 = r1 - r20
            int r0 = r1 - r0
            goto L4b
        L40:
            int r1 = r17.getPaddingTop()
            int r2 = r22 - r20
            int r2 = r2 - r0
            int r2 = r2 / 2
            int r0 = r1 + r2
        L4b:
            android.graphics.drawable.Drawable r1 = r17.getDividerDrawable()
            r2 = 0
            if (r1 != 0) goto L54
            r12 = 0
            goto L59
        L54:
            int r1 = r1.getIntrinsicHeight()
            r12 = r1
        L59:
            r13 = 0
        L5a:
            if (r13 >= r10) goto Lbd
            android.view.View r1 = r6.getChildAt(r13)
            if (r1 == 0) goto Lba
            int r2 = r1.getVisibility()
            r3 = 8
            if (r2 == r3) goto Lba
            int r4 = r1.getMeasuredWidth()
            int r14 = r1.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            r15 = r2
            androidx.appcompat.widget.r0$a r15 = (androidx.appcompat.widget.r0.a) r15
            int r2 = r15.f1120b
            if (r2 >= 0) goto L7e
            r2 = r11
        L7e:
            int r3 = androidx.core.view.e0.n(r17)
            int r2 = androidx.core.view.d.a(r2, r3)
            r2 = r2 & 7
            r3 = 1
            if (r2 == r3) goto L95
            r3 = 5
            if (r2 == r3) goto L92
            int r2 = r15.leftMargin
            int r2 = r2 + r7
            goto La0
        L92:
            int r2 = r8 - r4
            goto L9d
        L95:
            int r2 = r9 - r4
            int r2 = r2 / 2
            int r2 = r2 + r7
            int r3 = r15.leftMargin
            int r2 = r2 + r3
        L9d:
            int r3 = r15.rightMargin
            int r2 = r2 - r3
        La0:
            boolean r3 = r6.p(r13)
            if (r3 == 0) goto La7
            int r0 = r0 + r12
        La7:
            int r3 = r15.topMargin
            int r16 = r0 + r3
            r0 = r17
            r3 = r16
            r5 = r14
            r0.w(r1, r2, r3, r4, r5)
            int r0 = r15.bottomMargin
            int r14 = r14 + r0
            int r16 = r16 + r14
            r0 = r16
        Lba:
            int r13 = r13 + 1
            goto L5a
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // androidx.appcompat.widget.r0, android.view.View
    protected void onMeasure(int i8, int i9) {
        if (y(i8, i9)) {
            return;
        }
        super.onMeasure(i8, i9);
    }
}
