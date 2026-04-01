package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: loaded from: classes.dex */
class u extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SeekBar f1126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f1127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ColorStateList f1128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f1129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1130h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f1131i;

    u(SeekBar seekBar) {
        super(seekBar);
        this.f1128f = null;
        this.f1129g = null;
        this.f1130h = false;
        this.f1131i = false;
        this.f1126d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f1127e;
        if (drawable != null) {
            if (this.f1130h || this.f1131i) {
                Drawable drawableP = androidx.core.graphics.drawable.a.p(drawable.mutate());
                this.f1127e = drawableP;
                if (this.f1130h) {
                    androidx.core.graphics.drawable.a.n(drawableP, this.f1128f);
                }
                if (this.f1131i) {
                    androidx.core.graphics.drawable.a.o(this.f1127e, this.f1129g);
                }
                if (this.f1127e.isStateful()) {
                    this.f1127e.setState(this.f1126d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.q
    void c(AttributeSet attributeSet, int i8) {
        super.c(attributeSet, i8);
        Context context = this.f1126d.getContext();
        int[] iArr = e.j.V;
        l1 l1VarU = l1.u(context, attributeSet, iArr, i8, 0);
        SeekBar seekBar = this.f1126d;
        androidx.core.view.e0.F(seekBar, seekBar.getContext(), iArr, attributeSet, l1VarU.q(), i8, 0);
        Drawable drawableG = l1VarU.g(e.j.W);
        if (drawableG != null) {
            this.f1126d.setThumb(drawableG);
        }
        j(l1VarU.f(e.j.X));
        int i9 = e.j.Z;
        if (l1VarU.r(i9)) {
            this.f1129g = n0.d(l1VarU.j(i9, -1), this.f1129g);
            this.f1131i = true;
        }
        int i10 = e.j.Y;
        if (l1VarU.r(i10)) {
            this.f1128f = l1VarU.c(i10);
            this.f1130h = true;
        }
        l1VarU.v();
        f();
    }

    void g(Canvas canvas) {
        if (this.f1127e != null) {
            int max = this.f1126d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1127e.getIntrinsicWidth();
                int intrinsicHeight = this.f1127e.getIntrinsicHeight();
                int i8 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i9 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1127e.setBounds(-i8, -i9, i8, i9);
                float width = ((this.f1126d.getWidth() - this.f1126d.getPaddingLeft()) - this.f1126d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f1126d.getPaddingLeft(), this.f1126d.getHeight() / 2);
                for (int i10 = 0; i10 <= max; i10++) {
                    this.f1127e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    void h() {
        Drawable drawable = this.f1127e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1126d.getDrawableState())) {
            this.f1126d.invalidateDrawable(drawable);
        }
    }

    void i() {
        Drawable drawable = this.f1127e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f1127e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1127e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1126d);
            androidx.core.graphics.drawable.a.l(drawable, androidx.core.view.e0.n(this.f1126d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1126d.getDrawableState());
            }
            f();
        }
        this.f1126d.invalidate();
    }
}
