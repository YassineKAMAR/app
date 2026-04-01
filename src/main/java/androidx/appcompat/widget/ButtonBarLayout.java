package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f705c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f704b = -1;
        this.f705c = 0;
        int[] iArr = e.j.O0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        androidx.core.view.e0.F(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.f703a = typedArrayObtainStyledAttributes.getBoolean(e.j.P0, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    private int a(int i8) {
        int childCount = getChildCount();
        while (i8 < childCount) {
            if (getChildAt(i8).getVisibility() == 0) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    private boolean b() {
        return getOrientation() == 1;
    }

    private void setStacked(boolean z7) {
        setOrientation(z7 ? 1 : 0);
        setGravity(z7 ? 5 : 80);
        View viewFindViewById = findViewById(e.f.G);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(z7 ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(this.f705c, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        int iMakeMeasureSpec;
        boolean z7;
        int size = View.MeasureSpec.getSize(i8);
        int paddingBottom = 0;
        if (this.f703a) {
            if (size > this.f704b && b()) {
                setStacked(false);
            }
            this.f704b = size;
        }
        if (b() || View.MeasureSpec.getMode(i8) != 1073741824) {
            iMakeMeasureSpec = i8;
            z7 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z7 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i9);
        if (this.f703a && !b()) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                setStacked(true);
                z7 = true;
            }
        }
        if (z7) {
            super.onMeasure(i8, i9);
        }
        int iA = a(0);
        if (iA >= 0) {
            View childAt = getChildAt(iA);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (b()) {
                int iA2 = a(iA + 1);
                if (iA2 >= 0) {
                    paddingTop += getChildAt(iA2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                paddingBottom = paddingTop;
            } else {
                paddingBottom = paddingTop + getPaddingBottom();
            }
        }
        if (androidx.core.view.e0.o(this) != paddingBottom) {
            setMinimumHeight(paddingBottom);
        }
    }

    public void setAllowStacking(boolean z7) {
        if (this.f703a != z7) {
            this.f703a = z7;
            if (!z7 && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
