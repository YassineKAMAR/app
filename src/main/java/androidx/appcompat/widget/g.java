package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* JADX INFO: loaded from: classes.dex */
public class g extends CheckedTextView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f955b = {R.attr.checkMark};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f956a;

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    public g(Context context, AttributeSet attributeSet, int i8) {
        super(i1.b(context), attributeSet, i8);
        g1.a(this, getContext());
        d0 d0Var = new d0(this);
        this.f956a = d0Var;
        d0Var.m(attributeSet, i8);
        d0Var.b();
        l1 l1VarU = l1.u(getContext(), attributeSet, f955b, i8, 0);
        setCheckMarkDrawable(l1VarU.f(0));
        l1VarU.v();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        d0 d0Var = this.f956a;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return k.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i8) {
        setCheckMarkDrawable(g.b.d(getContext(), i8));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.p.m(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        d0 d0Var = this.f956a;
        if (d0Var != null) {
            d0Var.q(context, i8);
        }
    }
}
