package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
class p extends PopupWindow {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f1065b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1066a;

    public p(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        a(context, attributeSet, i8, i9);
    }

    private void a(Context context, AttributeSet attributeSet, int i8, int i9) {
        l1 l1VarU = l1.u(context, attributeSet, e.j.f21230b2, i8, i9);
        int i10 = e.j.f21240d2;
        if (l1VarU.r(i10)) {
            b(l1VarU.a(i10, false));
        }
        setBackgroundDrawable(l1VarU.f(e.j.f21235c2));
        l1VarU.v();
    }

    private void b(boolean z7) {
        if (f1065b) {
            this.f1066a = z7;
        } else {
            androidx.core.widget.k.a(this, z7);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i8, int i9) {
        if (f1065b && this.f1066a) {
            i9 -= view.getHeight();
        }
        super.showAsDropDown(view, i8, i9);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i8, int i9, int i10) {
        if (f1065b && this.f1066a) {
            i9 -= view.getHeight();
        }
        super.showAsDropDown(view, i8, i9, i10);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i8, int i9, int i10, int i11) {
        if (f1065b && this.f1066a) {
            i9 -= view.getHeight();
        }
        super.update(view, i8, i9, i10, i11);
    }
}
