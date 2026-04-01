package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button implements androidx.core.widget.b, androidx.core.widget.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f702b;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.f21103q);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i8) {
        super(i1.b(context), attributeSet, i8);
        g1.a(this, getContext());
        e eVar = new e(this);
        this.f701a = eVar;
        eVar.e(attributeSet, i8);
        d0 d0Var = new d0(this);
        this.f702b = d0Var;
        d0Var.m(attributeSet, i8);
        d0Var.b();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f701a;
        if (eVar != null) {
            eVar.b();
        }
        d0 d0Var = this.f702b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (androidx.core.widget.b.J) {
            return super.getAutoSizeMaxTextSize();
        }
        d0 d0Var = this.f702b;
        if (d0Var != null) {
            return d0Var.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (androidx.core.widget.b.J) {
            return super.getAutoSizeMinTextSize();
        }
        d0 d0Var = this.f702b;
        if (d0Var != null) {
            return d0Var.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (androidx.core.widget.b.J) {
            return super.getAutoSizeStepGranularity();
        }
        d0 d0Var = this.f702b;
        if (d0Var != null) {
            return d0Var.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (androidx.core.widget.b.J) {
            return super.getAutoSizeTextAvailableSizes();
        }
        d0 d0Var = this.f702b;
        return d0Var != null ? d0Var.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (androidx.core.widget.b.J) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        d0 d0Var = this.f702b;
        if (d0Var != null) {
            return d0Var.i();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f701a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f701a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f702b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f702b.k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        super.onLayout(z7, i8, i9, i10, i11);
        d0 d0Var = this.f702b;
        if (d0Var != null) {
            d0Var.o(z7, i8, i9, i10, i11);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        super.onTextChanged(charSequence, i8, i9, i10);
        d0 d0Var = this.f702b;
        if (d0Var == null || androidx.core.widget.b.J || !d0Var.l()) {
            return;
        }
        this.f702b.c();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i8, int i9, int i10, int i11) {
        if (androidx.core.widget.b.J) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i8, i9, i10, i11);
            return;
        }
        d0 d0Var = this.f702b;
        if (d0Var != null) {
            d0Var.s(i8, i9, i10, i11);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i8) {
        if (androidx.core.widget.b.J) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i8);
            return;
        }
        d0 d0Var = this.f702b;
        if (d0Var != null) {
            d0Var.t(iArr, i8);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i8) {
        if (androidx.core.widget.b.J) {
            super.setAutoSizeTextTypeWithDefaults(i8);
            return;
        }
        d0 d0Var = this.f702b;
        if (d0Var != null) {
            d0Var.u(i8);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f701a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        e eVar = this.f701a;
        if (eVar != null) {
            eVar.g(i8);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.p.m(this, callback));
    }

    public void setSupportAllCaps(boolean z7) {
        d0 d0Var = this.f702b;
        if (d0Var != null) {
            d0Var.r(z7);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f701a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f701a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.a0
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f702b.v(colorStateList);
        this.f702b.b();
    }

    @Override // androidx.core.widget.a0
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f702b.w(mode);
        this.f702b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        d0 d0Var = this.f702b;
        if (d0Var != null) {
            d0Var.q(context, i8);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i8, float f8) {
        if (androidx.core.widget.b.J) {
            super.setTextSize(i8, f8);
            return;
        }
        d0 d0Var = this.f702b;
        if (d0Var != null) {
            d0Var.z(i8, f8);
        }
    }
}
