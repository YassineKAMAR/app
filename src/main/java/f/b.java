package f;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.r1;
import androidx.core.app.s0;
import j.b;

/* JADX INFO: loaded from: classes.dex */
public class b extends androidx.fragment.app.d implements c, s0.a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private d f21462u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Resources f21463v;

    private boolean I(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // androidx.fragment.app.d
    public void A() {
        B().o();
    }

    public d B() {
        if (this.f21462u == null) {
            this.f21462u = d.g(this, this);
        }
        return this.f21462u;
    }

    public a C() {
        return B().m();
    }

    public void D(s0 s0Var) {
        s0Var.e(this);
    }

    protected void E(int i8) {
    }

    public void F(s0 s0Var) {
    }

    @Deprecated
    public void G() {
    }

    public boolean H() {
        Intent intentC = c();
        if (intentC == null) {
            return false;
        }
        if (!K(intentC)) {
            J(intentC);
            return true;
        }
        s0 s0VarI = s0.i(this);
        D(s0VarI);
        F(s0VarI);
        s0VarI.n();
        try {
            androidx.core.app.b.p(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    public void J(Intent intent) {
        androidx.core.app.n.e(this, intent);
    }

    public boolean K(Intent intent) {
        return androidx.core.app.n.f(this, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        B().d(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(B().f(context));
    }

    @Override // androidx.core.app.s0.a
    public Intent c() {
        return androidx.core.app.n.a(this);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        a aVarC = C();
        if (getWindow().hasFeature(0)) {
            if (aVarC == null || !aVarC.f()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // f.c
    public void d(j.b bVar) {
    }

    @Override // androidx.core.app.m, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a aVarC = C();
        if (keyCode == 82 && aVarC != null && aVarC.o(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i8) {
        return (T) B().i(i8);
    }

    @Override // f.c
    public void g(j.b bVar) {
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return B().l();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f21463v == null && r1.b()) {
            this.f21463v = new r1(this, super.getResources());
        }
        Resources resources = this.f21463v;
        return resources == null ? super.getResources() : resources;
    }

    @Override // f.c
    public j.b i(b.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        B().o();
    }

    @Override // androidx.fragment.app.d, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f21463v != null) {
            this.f21463v.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        B().p(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        G();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.m, android.app.Activity
    protected void onCreate(Bundle bundle) {
        d dVarB = B();
        dVarB.n();
        dVarB.q(bundle);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        B().r();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent keyEvent) {
        if (I(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i8, keyEvent);
    }

    @Override // androidx.fragment.app.d, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i8, MenuItem menuItem) {
        if (super.onMenuItemSelected(i8, menuItem)) {
            return true;
        }
        a aVarC = C();
        if (menuItem.getItemId() != 16908332 || aVarC == null || (aVarC.i() & 4) == 0) {
            return false;
        }
        return H();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i8, Menu menu) {
        return super.onMenuOpened(i8, menu);
    }

    @Override // androidx.fragment.app.d, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i8, Menu menu) {
        super.onPanelClosed(i8, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        B().s(bundle);
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        B().t();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.m, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        B().u(bundle);
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    protected void onStart() {
        super.onStart();
        B().v();
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    protected void onStop() {
        super.onStop();
        B().w();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i8) {
        super.onTitleChanged(charSequence, i8);
        B().E(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        a aVarC = C();
        if (getWindow().hasFeature(0)) {
            if (aVarC == null || !aVarC.p()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i8) {
        B().A(i8);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        B().B(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        B().C(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i8) {
        super.setTheme(i8);
        B().D(i8);
    }
}
