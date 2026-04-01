package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* JADX INFO: loaded from: classes.dex */
public class f extends CheckBox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f935c;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.f21104r);
    }

    public f(Context context, AttributeSet attributeSet, int i8) {
        super(i1.b(context), attributeSet, i8);
        g1.a(this, getContext());
        h hVar = new h(this);
        this.f933a = hVar;
        hVar.e(attributeSet, i8);
        e eVar = new e(this);
        this.f934b = eVar;
        eVar.e(attributeSet, i8);
        d0 d0Var = new d0(this);
        this.f935c = d0Var;
        d0Var.m(attributeSet, i8);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f934b;
        if (eVar != null) {
            eVar.b();
        }
        d0 d0Var = this.f935c;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        h hVar = this.f933a;
        return hVar != null ? hVar.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f934b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f934b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        h hVar = this.f933a;
        if (hVar != null) {
            return hVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        h hVar = this.f933a;
        if (hVar != null) {
            return hVar.d();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f934b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        e eVar = this.f934b;
        if (eVar != null) {
            eVar.g(i8);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i8) {
        setButtonDrawable(g.b.d(getContext(), i8));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        h hVar = this.f933a;
        if (hVar != null) {
            hVar.f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f934b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f934b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        h hVar = this.f933a;
        if (hVar != null) {
            hVar.g(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        h hVar = this.f933a;
        if (hVar != null) {
            hVar.h(mode);
        }
    }
}
