package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* JADX INFO: loaded from: classes.dex */
public class d extends AutoCompleteTextView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f875c = {R.attr.popupBackground};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f877b;

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.f21102p);
    }

    public d(Context context, AttributeSet attributeSet, int i8) {
        super(i1.b(context), attributeSet, i8);
        g1.a(this, getContext());
        l1 l1VarU = l1.u(getContext(), attributeSet, f875c, i8, 0);
        if (l1VarU.r(0)) {
            setDropDownBackgroundDrawable(l1VarU.f(0));
        }
        l1VarU.v();
        e eVar = new e(this);
        this.f876a = eVar;
        eVar.e(attributeSet, i8);
        d0 d0Var = new d0(this);
        this.f877b = d0Var;
        d0Var.m(attributeSet, i8);
        d0Var.b();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f876a;
        if (eVar != null) {
            eVar.b();
        }
        d0 d0Var = this.f877b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f876a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f876a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return k.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f876a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        e eVar = this.f876a;
        if (eVar != null) {
            eVar.g(i8);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.p.m(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i8) {
        setDropDownBackgroundDrawable(g.b.d(getContext(), i8));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f876a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f876a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        d0 d0Var = this.f877b;
        if (d0Var != null) {
            d0Var.q(context, i8);
        }
    }
}
