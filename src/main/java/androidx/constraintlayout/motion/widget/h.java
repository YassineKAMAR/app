package androidx.constraintlayout.motion.widget;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.j;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public class h extends androidx.constraintlayout.widget.c implements j.d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f1294j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f1295k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f1296l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected View[] f1297m;

    @Override // androidx.constraintlayout.motion.widget.j.d
    public void a(j jVar, int i8, int i9, float f8) {
    }

    @Override // androidx.constraintlayout.motion.widget.j.d
    public void b(j jVar, int i8, int i9) {
    }

    @Override // androidx.constraintlayout.motion.widget.j.d
    public void c(j jVar, int i8) {
    }

    public float getProgress() {
        return this.f1296l;
    }

    @Override // androidx.constraintlayout.widget.c
    protected void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.k.B6);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                if (index == androidx.constraintlayout.widget.k.D6) {
                    this.f1294j = typedArrayObtainStyledAttributes.getBoolean(index, this.f1294j);
                } else if (index == androidx.constraintlayout.widget.k.C6) {
                    this.f1295k = typedArrayObtainStyledAttributes.getBoolean(index, this.f1295k);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f8) {
        this.f1296l = f8;
        int i8 = 0;
        if (this.f1466b > 0) {
            this.f1297m = l((ConstraintLayout) getParent());
            while (i8 < this.f1466b) {
                x(this.f1297m[i8], f8);
                i8++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i8 < childCount) {
            View childAt = viewGroup.getChildAt(i8);
            if (!(childAt instanceof h)) {
                x(childAt, f8);
            }
            i8++;
        }
    }

    public boolean t() {
        return false;
    }

    public boolean u() {
        return this.f1295k;
    }

    public boolean v() {
        return this.f1294j;
    }

    public void w(Canvas canvas) {
    }

    public void x(View view, float f8) {
    }
}
