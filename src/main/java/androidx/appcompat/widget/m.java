package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageView f1014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j1 f1015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j1 f1016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j1 f1017d;

    public m(ImageView imageView) {
        this.f1014a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f1017d == null) {
            this.f1017d = new j1();
        }
        j1 j1Var = this.f1017d;
        j1Var.a();
        ColorStateList colorStateListA = androidx.core.widget.h.a(this.f1014a);
        if (colorStateListA != null) {
            j1Var.f1006d = true;
            j1Var.f1003a = colorStateListA;
        }
        PorterDuff.Mode modeB = androidx.core.widget.h.b(this.f1014a);
        if (modeB != null) {
            j1Var.f1005c = true;
            j1Var.f1004b = modeB;
        }
        if (!j1Var.f1006d && !j1Var.f1005c) {
            return false;
        }
        i.i(drawable, j1Var, this.f1014a.getDrawableState());
        return true;
    }

    private boolean j() {
        int i8 = Build.VERSION.SDK_INT;
        return i8 > 21 ? this.f1015b != null : i8 == 21;
    }

    void b() {
        Drawable drawable = this.f1014a.getDrawable();
        if (drawable != null) {
            n0.b(drawable);
        }
        if (drawable != null) {
            if (j() && a(drawable)) {
                return;
            }
            j1 j1Var = this.f1016c;
            if (j1Var != null) {
                i.i(drawable, j1Var, this.f1014a.getDrawableState());
                return;
            }
            j1 j1Var2 = this.f1015b;
            if (j1Var2 != null) {
                i.i(drawable, j1Var2, this.f1014a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        j1 j1Var = this.f1016c;
        if (j1Var != null) {
            return j1Var.f1003a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        j1 j1Var = this.f1016c;
        if (j1Var != null) {
            return j1Var.f1004b;
        }
        return null;
    }

    boolean e() {
        return !(this.f1014a.getBackground() instanceof RippleDrawable);
    }

    public void f(AttributeSet attributeSet, int i8) {
        int iM;
        Context context = this.f1014a.getContext();
        int[] iArr = e.j.R;
        l1 l1VarU = l1.u(context, attributeSet, iArr, i8, 0);
        ImageView imageView = this.f1014a;
        androidx.core.view.e0.F(imageView, imageView.getContext(), iArr, attributeSet, l1VarU.q(), i8, 0);
        try {
            Drawable drawable = this.f1014a.getDrawable();
            if (drawable == null && (iM = l1VarU.m(e.j.S, -1)) != -1 && (drawable = g.b.d(this.f1014a.getContext(), iM)) != null) {
                this.f1014a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                n0.b(drawable);
            }
            int i9 = e.j.T;
            if (l1VarU.r(i9)) {
                androidx.core.widget.h.c(this.f1014a, l1VarU.c(i9));
            }
            int i10 = e.j.U;
            if (l1VarU.r(i10)) {
                androidx.core.widget.h.d(this.f1014a, n0.d(l1VarU.j(i10, -1), null));
            }
        } finally {
            l1VarU.v();
        }
    }

    public void g(int i8) {
        if (i8 != 0) {
            Drawable drawableD = g.b.d(this.f1014a.getContext(), i8);
            if (drawableD != null) {
                n0.b(drawableD);
            }
            this.f1014a.setImageDrawable(drawableD);
        } else {
            this.f1014a.setImageDrawable(null);
        }
        b();
    }

    void h(ColorStateList colorStateList) {
        if (this.f1016c == null) {
            this.f1016c = new j1();
        }
        j1 j1Var = this.f1016c;
        j1Var.f1003a = colorStateList;
        j1Var.f1006d = true;
        b();
    }

    void i(PorterDuff.Mode mode) {
        if (this.f1016c == null) {
            this.f1016c = new j1();
        }
        j1 j1Var = this.f1016c;
        j1Var.f1004b = mode;
        j1Var.f1005c = true;
        b();
    }
}
