package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.e;
import androidx.lifecycle.d;

/* JADX INFO: loaded from: classes.dex */
public class m extends Activity implements androidx.lifecycle.i, e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p.h<Class<Object>, Object> f1868a = new p.h<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.lifecycle.j f1869b = new androidx.lifecycle.j(this);

    public androidx.lifecycle.d a() {
        return this.f1869b;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !androidx.core.view.e.d(decorView, keyEvent)) {
            return androidx.core.view.e.e(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !androidx.core.view.e.d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.core.view.e.a
    public boolean f(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.lifecycle.u.e(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        this.f1869b.j(d.b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
