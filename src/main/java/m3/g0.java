package m3;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import t3.b;
import t3.f;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements t3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f24675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f24676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t0 f24677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t f24678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n0 f24679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o2 f24680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Dialog f24681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private r0 f24682h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f24683i = new AtomicBoolean();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicReference f24684j = new AtomicReference();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicReference f24685k = new AtomicReference();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicReference f24686l = new AtomicReference();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f24687m = false;

    public g0(Application application, f fVar, t0 t0Var, t tVar, n0 n0Var, o2 o2Var) {
        this.f24675a = application;
        this.f24676b = fVar;
        this.f24677c = t0Var;
        this.f24678d = tVar;
        this.f24679e = n0Var;
        this.f24680f = o2Var;
    }

    private final void h() {
        Dialog dialog = this.f24681g;
        if (dialog != null) {
            dialog.dismiss();
            this.f24681g = null;
        }
        this.f24677c.a(null);
        d0 d0Var = (d0) this.f24686l.getAndSet(null);
        if (d0Var != null) {
            d0Var.f24642b.f24675a.unregisterActivityLifecycleCallbacks(d0Var);
        }
    }

    @Override // t3.b
    public final void a(Activity activity, b.a aVar) {
        p1.a();
        if (!this.f24683i.compareAndSet(false, true)) {
            aVar.a(new t2(3, true != this.f24687m ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.").a());
            return;
        }
        d0 d0Var = new d0(this, activity);
        this.f24675a.registerActivityLifecycleCallbacks(d0Var);
        this.f24686l.set(d0Var);
        this.f24677c.a(activity);
        Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.f24682h);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            aVar.a(new t2(3, "Activity with null windows is passed in.").a());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        this.f24685k.set(aVar);
        dialog.show();
        this.f24681g = dialog;
        this.f24682h.c("UMP_messagePresented", "");
    }

    final r0 b() {
        return this.f24682h;
    }

    final void c(f.b bVar, f.a aVar) {
        r0 r0VarA = ((s0) this.f24680f).k();
        this.f24682h = r0VarA;
        r0VarA.setBackgroundColor(0);
        r0VarA.getSettings().setJavaScriptEnabled(true);
        r0VarA.setWebViewClient(new q0(r0VarA, null));
        this.f24684j.set(new f0(bVar, aVar, 0 == true ? 1 : 0));
        this.f24682h.loadDataWithBaseURL(this.f24679e.a(), this.f24679e.b(), "text/html", "UTF-8", null);
        p1.f24788a.postDelayed(new Runnable() { // from class: m3.c0
            @Override // java.lang.Runnable
            public final void run() {
                this.f24630a.g(new t2(4, "Web view timed out."));
            }
        }, 10000L);
    }

    final void d(int i8) {
        h();
        b.a aVar = (b.a) this.f24685k.getAndSet(null);
        if (aVar == null) {
            return;
        }
        this.f24678d.f(3);
        aVar.a(null);
    }

    final void e(t2 t2Var) {
        h();
        b.a aVar = (b.a) this.f24685k.getAndSet(null);
        if (aVar == null) {
            return;
        }
        aVar.a(t2Var.a());
    }

    final void f() {
        f0 f0Var = (f0) this.f24684j.getAndSet(null);
        if (f0Var == null) {
            return;
        }
        f0Var.b(this);
    }

    final void g(t2 t2Var) {
        f0 f0Var = (f0) this.f24684j.getAndSet(null);
        if (f0Var == null) {
            return;
        }
        f0Var.a(t2Var.a());
    }
}
