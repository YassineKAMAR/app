package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f1834j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f1835k;

    @Override // androidx.constraintlayout.widget.c
    protected void i(ConstraintLayout constraintLayout) {
        h(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.c
    protected void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.f1724n1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                if (index == k.f1742p1) {
                    this.f1834j = true;
                } else if (index == k.f1786u1) {
                    this.f1835k = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.c, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1834j || this.f1835k) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i8 = 0; i8 < this.f1466b; i8++) {
                    View viewH = constraintLayout.h(this.f1465a[i8]);
                    if (viewH != null) {
                        if (this.f1834j) {
                            viewH.setVisibility(visibility);
                        }
                        if (this.f1835k && elevation > 0.0f) {
                            viewH.setTranslationZ(viewH.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        g();
    }

    @Override // android.view.View
    public void setVisibility(int i8) {
        super.setVisibility(i8);
        g();
    }

    public void t(t.k kVar, int i8, int i9) {
    }
}
