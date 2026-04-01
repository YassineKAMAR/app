package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;
import androidx.core.content.res.h;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j1 f879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j1 f880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j1 f881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private j1 f882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j1 f883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private j1 f884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private j1 f885h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final h0 f886i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f887j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f888k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Typeface f889l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f890m;

    class a extends h.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f892b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f893c;

        a(int i8, int i9, WeakReference weakReference) {
            this.f891a = i8;
            this.f892b = i9;
            this.f893c = weakReference;
        }

        @Override // androidx.core.content.res.h.e
        /* JADX INFO: renamed from: h */
        public void f(int i8) {
        }

        @Override // androidx.core.content.res.h.e
        /* JADX INFO: renamed from: i */
        public void g(Typeface typeface) {
            int i8;
            if (Build.VERSION.SDK_INT >= 28 && (i8 = this.f891a) != -1) {
                typeface = Typeface.create(typeface, i8, (this.f892b & 2) != 0);
            }
            d0.this.n(this.f893c, typeface);
        }
    }

    d0(TextView textView) {
        this.f878a = textView;
        this.f886i = new h0(textView);
    }

    private void A(int i8, float f8) {
        this.f886i.v(i8, f8);
    }

    private void B(Context context, l1 l1Var) {
        String strN;
        Typeface typefaceCreate;
        Typeface typeface;
        this.f887j = l1Var.j(e.j.M2, this.f887j);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 28) {
            int iJ = l1Var.j(e.j.R2, -1);
            this.f888k = iJ;
            if (iJ != -1) {
                this.f887j = (this.f887j & 2) | 0;
            }
        }
        int i9 = e.j.Q2;
        if (!l1Var.r(i9) && !l1Var.r(e.j.S2)) {
            int i10 = e.j.L2;
            if (l1Var.r(i10)) {
                this.f890m = false;
                int iJ2 = l1Var.j(i10, 1);
                if (iJ2 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (iJ2 == 2) {
                    typeface = Typeface.SERIF;
                } else if (iJ2 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f889l = typeface;
                return;
            }
            return;
        }
        this.f889l = null;
        int i11 = e.j.S2;
        if (l1Var.r(i11)) {
            i9 = i11;
        }
        int i12 = this.f888k;
        int i13 = this.f887j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceI = l1Var.i(i9, this.f887j, new a(i12, i13, new WeakReference(this.f878a)));
                if (typefaceI != null) {
                    if (i8 >= 28 && this.f888k != -1) {
                        typefaceI = Typeface.create(Typeface.create(typefaceI, 0), this.f888k, (this.f887j & 2) != 0);
                    }
                    this.f889l = typefaceI;
                }
                this.f890m = this.f889l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f889l != null || (strN = l1Var.n(i9)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f888k == -1) {
            typefaceCreate = Typeface.create(strN, this.f887j);
        } else {
            typefaceCreate = Typeface.create(Typeface.create(strN, 0), this.f888k, (this.f887j & 2) != 0);
        }
        this.f889l = typefaceCreate;
    }

    private void a(Drawable drawable, j1 j1Var) {
        if (drawable == null || j1Var == null) {
            return;
        }
        i.i(drawable, j1Var, this.f878a.getDrawableState());
    }

    private static j1 d(Context context, i iVar, int i8) {
        ColorStateList colorStateListF = iVar.f(context, i8);
        if (colorStateListF == null) {
            return null;
        }
        j1 j1Var = new j1();
        j1Var.f1006d = true;
        j1Var.f1003a = colorStateListF;
        return j1Var;
    }

    private void x(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f878a.getCompoundDrawablesRelative();
            TextView textView = this.f878a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f878a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            TextView textView2 = this.f878a;
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            Drawable drawable8 = compoundDrawablesRelative2[2];
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f878a.getCompoundDrawables();
        TextView textView3 = this.f878a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void y() {
        j1 j1Var = this.f885h;
        this.f879b = j1Var;
        this.f880c = j1Var;
        this.f881d = j1Var;
        this.f882e = j1Var;
        this.f883f = j1Var;
        this.f884g = j1Var;
    }

    void b() {
        if (this.f879b != null || this.f880c != null || this.f881d != null || this.f882e != null) {
            Drawable[] compoundDrawables = this.f878a.getCompoundDrawables();
            a(compoundDrawables[0], this.f879b);
            a(compoundDrawables[1], this.f880c);
            a(compoundDrawables[2], this.f881d);
            a(compoundDrawables[3], this.f882e);
        }
        if (this.f883f == null && this.f884g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f878a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f883f);
        a(compoundDrawablesRelative[2], this.f884g);
    }

    void c() {
        this.f886i.a();
    }

    int e() {
        return this.f886i.h();
    }

    int f() {
        return this.f886i.i();
    }

    int g() {
        return this.f886i.j();
    }

    int[] h() {
        return this.f886i.k();
    }

    int i() {
        return this.f886i.l();
    }

    ColorStateList j() {
        j1 j1Var = this.f885h;
        if (j1Var != null) {
            return j1Var.f1003a;
        }
        return null;
    }

    PorterDuff.Mode k() {
        j1 j1Var = this.f885h;
        if (j1Var != null) {
            return j1Var.f1004b;
        }
        return null;
    }

    boolean l() {
        return this.f886i.p();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a2  */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m(android.util.AttributeSet r24, int r25) {
        /*
            Method dump skipped, instruction units count: 786
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.d0.m(android.util.AttributeSet, int):void");
    }

    void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f890m) {
            this.f889l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f887j);
            }
        }
    }

    void o(boolean z7, int i8, int i9, int i10, int i11) {
        if (androidx.core.widget.b.J) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(Context context, int i8) {
        String strN;
        ColorStateList colorStateListC;
        l1 l1VarS = l1.s(context, i8, e.j.J2);
        int i9 = e.j.U2;
        if (l1VarS.r(i9)) {
            r(l1VarS.a(i9, false));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23) {
            int i11 = e.j.N2;
            if (l1VarS.r(i11) && (colorStateListC = l1VarS.c(i11)) != null) {
                this.f878a.setTextColor(colorStateListC);
            }
        }
        int i12 = e.j.K2;
        if (l1VarS.r(i12) && l1VarS.e(i12, -1) == 0) {
            this.f878a.setTextSize(0, 0.0f);
        }
        B(context, l1VarS);
        if (i10 >= 26) {
            int i13 = e.j.T2;
            if (l1VarS.r(i13) && (strN = l1VarS.n(i13)) != null) {
                this.f878a.setFontVariationSettings(strN);
            }
        }
        l1VarS.v();
        Typeface typeface = this.f889l;
        if (typeface != null) {
            this.f878a.setTypeface(typeface, this.f887j);
        }
    }

    void r(boolean z7) {
        this.f878a.setAllCaps(z7);
    }

    void s(int i8, int i9, int i10, int i11) {
        this.f886i.r(i8, i9, i10, i11);
    }

    void t(int[] iArr, int i8) {
        this.f886i.s(iArr, i8);
    }

    void u(int i8) {
        this.f886i.t(i8);
    }

    void v(ColorStateList colorStateList) {
        if (this.f885h == null) {
            this.f885h = new j1();
        }
        j1 j1Var = this.f885h;
        j1Var.f1003a = colorStateList;
        j1Var.f1006d = colorStateList != null;
        y();
    }

    void w(PorterDuff.Mode mode) {
        if (this.f885h == null) {
            this.f885h = new j1();
        }
        j1 j1Var = this.f885h;
        j1Var.f1004b = mode;
        j1Var.f1005c = mode != null;
        y();
    }

    void z(int i8, float f8) {
        if (androidx.core.widget.b.J || l()) {
            return;
        }
        A(i8, f8);
    }
}
