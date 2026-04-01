package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class h<E> extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f2432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f2433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f2434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f2435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final j f2436e;

    h(Activity activity, Context context, Handler handler, int i8) {
        this.f2436e = new j();
        this.f2432a = activity;
        this.f2433b = (Context) androidx.core.util.f.c(context, "context == null");
        this.f2434c = (Handler) androidx.core.util.f.c(handler, "handler == null");
        this.f2435d = i8;
    }

    h(d dVar) {
        this(dVar, dVar, new Handler(), 0);
    }

    @Override // androidx.fragment.app.e
    public View c(int i8) {
        return null;
    }

    @Override // androidx.fragment.app.e
    public boolean d() {
        return true;
    }

    Activity f() {
        return this.f2432a;
    }

    Context g() {
        return this.f2433b;
    }

    Handler i() {
        return this.f2434c;
    }

    void j(Fragment fragment) {
    }

    public void k(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public abstract E l();

    public LayoutInflater m() {
        return LayoutInflater.from(this.f2433b);
    }

    public int n() {
        return this.f2435d;
    }

    public boolean o() {
        return true;
    }

    public boolean p(Fragment fragment) {
        return true;
    }

    public void q(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i8, Bundle bundle) {
        if (i8 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.f2433b.startActivity(intent);
    }

    public void r() {
    }
}
