package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.j;

/* JADX INFO: loaded from: classes.dex */
public interface m0 {
    void a(Menu menu, j.a aVar);

    boolean b();

    void c();

    void collapseActionView();

    boolean d();

    boolean e();

    boolean f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    void h();

    void i(e1 e1Var);

    boolean j();

    void k(int i8);

    void l(int i8);

    int m();

    androidx.core.view.f1 n(int i8, long j8);

    void o(int i8);

    ViewGroup p();

    void q(boolean z7);

    int r();

    void s();

    void setIcon(int i8);

    void setIcon(Drawable drawable);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t();

    void u(boolean z7);
}
