package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: loaded from: classes.dex */
class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CompoundButton f967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f968b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f969c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f970d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f971e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f972f;

    h(CompoundButton compoundButton) {
        this.f967a = compoundButton;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.c.a(this.f967a);
        if (drawableA != null) {
            if (this.f970d || this.f971e) {
                Drawable drawableMutate = androidx.core.graphics.drawable.a.p(drawableA).mutate();
                if (this.f970d) {
                    androidx.core.graphics.drawable.a.n(drawableMutate, this.f968b);
                }
                if (this.f971e) {
                    androidx.core.graphics.drawable.a.o(drawableMutate, this.f969c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f967a.getDrawableState());
                }
                this.f967a.setButtonDrawable(drawableMutate);
            }
        }
    }

    int b(int i8) {
        return i8;
    }

    ColorStateList c() {
        return this.f968b;
    }

    PorterDuff.Mode d() {
        return this.f969c;
    }

    void e(AttributeSet attributeSet, int i8) {
        boolean z7;
        int iM;
        int iM2;
        Context context = this.f967a.getContext();
        int[] iArr = e.j.R0;
        l1 l1VarU = l1.u(context, attributeSet, iArr, i8, 0);
        CompoundButton compoundButton = this.f967a;
        androidx.core.view.e0.F(compoundButton, compoundButton.getContext(), iArr, attributeSet, l1VarU.q(), i8, 0);
        try {
            int i9 = e.j.T0;
            if (!l1VarU.r(i9) || (iM2 = l1VarU.m(i9, 0)) == 0) {
                z7 = false;
            } else {
                try {
                    CompoundButton compoundButton2 = this.f967a;
                    compoundButton2.setButtonDrawable(g.b.d(compoundButton2.getContext(), iM2));
                    z7 = true;
                } catch (Resources.NotFoundException unused) {
                    z7 = false;
                }
            }
            if (!z7) {
                int i10 = e.j.S0;
                if (l1VarU.r(i10) && (iM = l1VarU.m(i10, 0)) != 0) {
                    CompoundButton compoundButton3 = this.f967a;
                    compoundButton3.setButtonDrawable(g.b.d(compoundButton3.getContext(), iM));
                }
            }
            int i11 = e.j.U0;
            if (l1VarU.r(i11)) {
                androidx.core.widget.c.b(this.f967a, l1VarU.c(i11));
            }
            int i12 = e.j.V0;
            if (l1VarU.r(i12)) {
                androidx.core.widget.c.c(this.f967a, n0.d(l1VarU.j(i12, -1), null));
            }
        } finally {
            l1VarU.v();
        }
    }

    void f() {
        if (this.f972f) {
            this.f972f = false;
        } else {
            this.f972f = true;
            a();
        }
    }

    void g(ColorStateList colorStateList) {
        this.f968b = colorStateList;
        this.f970d = true;
        a();
    }

    void h(PorterDuff.Mode mode) {
        this.f969c = mode;
        this.f971e = true;
        a();
    }
}
