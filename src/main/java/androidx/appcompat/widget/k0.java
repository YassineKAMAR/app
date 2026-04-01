package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: loaded from: classes.dex */
public class k0 extends ToggleButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f1007a;

    public k0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public k0(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        g1.a(this, getContext());
        d0 d0Var = new d0(this);
        this.f1007a = d0Var;
        d0Var.m(attributeSet, i8);
    }
}
