package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f903a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j1 f906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private j1 f907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j1 f908f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f905c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f904b = i.b();

    e(View view) {
        this.f903a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f908f == null) {
            this.f908f = new j1();
        }
        j1 j1Var = this.f908f;
        j1Var.a();
        ColorStateList colorStateListK = androidx.core.view.e0.k(this.f903a);
        if (colorStateListK != null) {
            j1Var.f1006d = true;
            j1Var.f1003a = colorStateListK;
        }
        PorterDuff.Mode modeL = androidx.core.view.e0.l(this.f903a);
        if (modeL != null) {
            j1Var.f1005c = true;
            j1Var.f1004b = modeL;
        }
        if (!j1Var.f1006d && !j1Var.f1005c) {
            return false;
        }
        i.i(drawable, j1Var, this.f903a.getDrawableState());
        return true;
    }

    private boolean k() {
        int i8 = Build.VERSION.SDK_INT;
        return i8 > 21 ? this.f906d != null : i8 == 21;
    }

    void b() {
        Drawable background = this.f903a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            j1 j1Var = this.f907e;
            if (j1Var != null) {
                i.i(background, j1Var, this.f903a.getDrawableState());
                return;
            }
            j1 j1Var2 = this.f906d;
            if (j1Var2 != null) {
                i.i(background, j1Var2, this.f903a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        j1 j1Var = this.f907e;
        if (j1Var != null) {
            return j1Var.f1003a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        j1 j1Var = this.f907e;
        if (j1Var != null) {
            return j1Var.f1004b;
        }
        return null;
    }

    void e(AttributeSet attributeSet, int i8) {
        Context context = this.f903a.getContext();
        int[] iArr = e.j.D3;
        l1 l1VarU = l1.u(context, attributeSet, iArr, i8, 0);
        View view = this.f903a;
        androidx.core.view.e0.F(view, view.getContext(), iArr, attributeSet, l1VarU.q(), i8, 0);
        try {
            int i9 = e.j.E3;
            if (l1VarU.r(i9)) {
                this.f905c = l1VarU.m(i9, -1);
                ColorStateList colorStateListF = this.f904b.f(this.f903a.getContext(), this.f905c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            int i10 = e.j.F3;
            if (l1VarU.r(i10)) {
                androidx.core.view.e0.J(this.f903a, l1VarU.c(i10));
            }
            int i11 = e.j.G3;
            if (l1VarU.r(i11)) {
                androidx.core.view.e0.K(this.f903a, n0.d(l1VarU.j(i11, -1), null));
            }
        } finally {
            l1VarU.v();
        }
    }

    void f(Drawable drawable) {
        this.f905c = -1;
        h(null);
        b();
    }

    void g(int i8) {
        this.f905c = i8;
        i iVar = this.f904b;
        h(iVar != null ? iVar.f(this.f903a.getContext(), i8) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f906d == null) {
                this.f906d = new j1();
            }
            j1 j1Var = this.f906d;
            j1Var.f1003a = colorStateList;
            j1Var.f1006d = true;
        } else {
            this.f906d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f907e == null) {
            this.f907e = new j1();
        }
        j1 j1Var = this.f907e;
        j1Var.f1003a = colorStateList;
        j1Var.f1006d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f907e == null) {
            this.f907e = new j1();
        }
        j1 j1Var = this.f907e;
        j1Var.f1004b = mode;
        j1Var.f1005c = true;
        b();
    }
}
