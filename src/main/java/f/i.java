package f;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.e;
import j.b;

/* JADX INFO: loaded from: classes.dex */
public class i extends Dialog implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f21547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e.a f21548b;

    class a implements e.a {
        a() {
        }

        @Override // androidx.core.view.e.a
        public boolean f(KeyEvent keyEvent) {
            return i.this.c(keyEvent);
        }
    }

    public i(Context context, int i8) {
        super(context, b(context, i8));
        this.f21548b = new a();
        d dVarA = a();
        dVarA.D(b(context, i8));
        dVarA.q(null);
    }

    private static int b(Context context, int i8) {
        if (i8 != 0) {
            return i8;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(e.a.f21111y, typedValue, true);
        return typedValue.resourceId;
    }

    public d a() {
        if (this.f21547a == null) {
            this.f21547a = d.h(this, this);
        }
        return this.f21547a;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().d(view, layoutParams);
    }

    boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // f.c
    public void d(j.b bVar) {
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        a().r();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return androidx.core.view.e.e(this.f21548b, getWindow().getDecorView(), this, keyEvent);
    }

    public boolean e(int i8) {
        return a().z(i8);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i8) {
        return (T) a().i(i8);
    }

    @Override // f.c
    public void g(j.b bVar) {
    }

    @Override // f.c
    public j.b i(b.a aVar) {
        return null;
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().o();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        a().n();
        super.onCreate(bundle);
        a().q(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        a().w();
    }

    @Override // android.app.Dialog
    public void setContentView(int i8) {
        a().A(i8);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().B(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().C(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i8) {
        super.setTitle(i8);
        a().E(getContext().getString(i8));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().E(charSequence);
    }
}
