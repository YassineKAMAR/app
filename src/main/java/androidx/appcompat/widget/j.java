package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public class j extends EditText {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f1000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f1001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w f1002c;

    public j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.A);
    }

    public j(Context context, AttributeSet attributeSet, int i8) {
        super(i1.b(context), attributeSet, i8);
        g1.a(this, getContext());
        e eVar = new e(this);
        this.f1000a = eVar;
        eVar.e(attributeSet, i8);
        d0 d0Var = new d0(this);
        this.f1001b = d0Var;
        d0Var.m(attributeSet, i8);
        d0Var.b();
        this.f1002c = new w(this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1000a;
        if (eVar != null) {
            eVar.b();
        }
        d0 d0Var = this.f1001b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1000a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1000a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        w wVar;
        return (Build.VERSION.SDK_INT >= 28 || (wVar = this.f1002c) == null) ? super.getTextClassifier() : wVar.a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return k.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1000a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        e eVar = this.f1000a;
        if (eVar != null) {
            eVar.g(i8);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.p.m(this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1000a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1000a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        d0 d0Var = this.f1001b;
        if (d0Var != null) {
            d0Var.q(context, i8);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        w wVar;
        if (Build.VERSION.SDK_INT >= 28 || (wVar = this.f1002c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            wVar.b(textClassifier);
        }
    }
}
