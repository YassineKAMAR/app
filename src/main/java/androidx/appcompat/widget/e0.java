package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import z.c;

/* JADX INFO: loaded from: classes.dex */
public class e0 extends TextView implements androidx.core.widget.a0, androidx.core.widget.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w f911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Future<z.c> f912d;

    public e0(Context context) {
        this(context, null);
    }

    public e0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public e0(Context context, AttributeSet attributeSet, int i8) {
        super(i1.b(context), attributeSet, i8);
        g1.a(this, getContext());
        e eVar = new e(this);
        this.f909a = eVar;
        eVar.e(attributeSet, i8);
        d0 d0Var = new d0(this);
        this.f910b = d0Var;
        d0Var.m(attributeSet, i8);
        d0Var.b();
        this.f911c = new w(this);
    }

    private void e() {
        Future<z.c> future = this.f912d;
        if (future != null) {
            try {
                this.f912d = null;
                androidx.core.widget.p.k(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f909a;
        if (eVar != null) {
            eVar.b();
        }
        d0 d0Var = this.f910b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (androidx.core.widget.b.J) {
            return super.getAutoSizeMaxTextSize();
        }
        d0 d0Var = this.f910b;
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
        d0 d0Var = this.f910b;
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
        d0 d0Var = this.f910b;
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
        d0 d0Var = this.f910b;
        return d0Var != null ? d0Var.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (androidx.core.widget.b.J) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        d0 d0Var = this.f910b;
        if (d0Var != null) {
            return d0Var.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.p.a(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.p.b(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f909a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f909a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f910b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f910b.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        e();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        w wVar;
        return (Build.VERSION.SDK_INT >= 28 || (wVar = this.f911c) == null) ? super.getTextClassifier() : wVar.a();
    }

    public c.a getTextMetricsParamsCompat() {
        return androidx.core.widget.p.e(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return k.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        super.onLayout(z7, i8, i9, i10, i11);
        d0 d0Var = this.f910b;
        if (d0Var != null) {
            d0Var.o(z7, i8, i9, i10, i11);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i8, int i9) {
        e();
        super.onMeasure(i8, i9);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        super.onTextChanged(charSequence, i8, i9, i10);
        d0 d0Var = this.f910b;
        if (d0Var == null || androidx.core.widget.b.J || !d0Var.l()) {
            return;
        }
        this.f910b.c();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i8, int i9, int i10, int i11) {
        if (androidx.core.widget.b.J) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i8, i9, i10, i11);
            return;
        }
        d0 d0Var = this.f910b;
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
        d0 d0Var = this.f910b;
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
        d0 d0Var = this.f910b;
        if (d0Var != null) {
            d0Var.u(i8);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f909a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        e eVar = this.f909a;
        if (eVar != null) {
            eVar.g(i8);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        d0 d0Var = this.f910b;
        if (d0Var != null) {
            d0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        d0 d0Var = this.f910b;
        if (d0Var != null) {
            d0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i8, int i9, int i10, int i11) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i8 != 0 ? g.b.d(context, i8) : null, i9 != 0 ? g.b.d(context, i9) : null, i10 != 0 ? g.b.d(context, i10) : null, i11 != 0 ? g.b.d(context, i11) : null);
        d0 d0Var = this.f910b;
        if (d0Var != null) {
            d0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        d0 d0Var = this.f910b;
        if (d0Var != null) {
            d0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i8, int i9, int i10, int i11) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i8 != 0 ? g.b.d(context, i8) : null, i9 != 0 ? g.b.d(context, i9) : null, i10 != 0 ? g.b.d(context, i10) : null, i11 != 0 ? g.b.d(context, i11) : null);
        d0 d0Var = this.f910b;
        if (d0Var != null) {
            d0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        d0 d0Var = this.f910b;
        if (d0Var != null) {
            d0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.p.m(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i8) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i8);
        } else {
            androidx.core.widget.p.h(this, i8);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i8) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i8);
        } else {
            androidx.core.widget.p.i(this, i8);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i8) {
        androidx.core.widget.p.j(this, i8);
    }

    public void setPrecomputedText(z.c cVar) {
        androidx.core.widget.p.k(this, cVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f909a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f909a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.a0
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f910b.v(colorStateList);
        this.f910b.b();
    }

    @Override // androidx.core.widget.a0
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f910b.w(mode);
        this.f910b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        d0 d0Var = this.f910b;
        if (d0Var != null) {
            d0Var.q(context, i8);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        w wVar;
        if (Build.VERSION.SDK_INT >= 28 || (wVar = this.f911c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            wVar.b(textClassifier);
        }
    }

    public void setTextFuture(Future<z.c> future) {
        this.f912d = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(c.a aVar) {
        androidx.core.widget.p.l(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i8, float f8) {
        if (androidx.core.widget.b.J) {
            super.setTextSize(i8, f8);
            return;
        }
        d0 d0Var = this.f910b;
        if (d0Var != null) {
            d0Var.z(i8, f8);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i8) {
        Typeface typefaceA = (typeface == null || i8 <= 0) ? null : androidx.core.graphics.d.a(getContext(), typeface, i8);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        super.setTypeface(typeface, i8);
    }
}
