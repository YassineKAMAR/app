package com.amazon.a.a.i;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.KeyEvent;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends com.amazon.a.a.e.c<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f3644b = new com.amazon.a.a.o.c("Prompt");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c f3645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f3646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Activity f3647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f3648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Dialog f3649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f3650h = new AtomicBoolean(false);

    public b() {
        int i8 = i();
        this.f3646d = i8;
        if (com.amazon.a.a.o.c.f3947a) {
            f3644b.a("Creating Prompt: " + i8);
        }
    }

    private void b(d dVar) {
        if (com.amazon.a.a.o.c.f3947a) {
            f3644b.a("Expiring prompt pre-maturely: id: " + j() + ", prompt: " + this + ",, reason: " + dVar);
        }
        this.f3648f = dVar;
        c();
    }

    private boolean e(Activity activity) {
        if (this.f3645c.b(com.amazon.a.a.m.c.f3748e)) {
            return false;
        }
        return b(activity);
    }

    private void f(Activity activity) {
        if (com.amazon.a.a.o.c.f3947a) {
            f3644b.a("Showing prompt, id: " + j() + ", prompt: " + this + ", activity: " + activity);
        }
        if (this.f3647e != null) {
            m();
        }
        activity.showDialog(j());
    }

    private int i() {
        int iNextInt = new Random().nextInt(2146249079) + 1234567;
        if (iNextInt <= 1234567) {
            return 1234567;
        }
        return iNextInt;
    }

    private void m() {
        if (com.amazon.a.a.o.c.f3947a) {
            f3644b.b("Dismissing dialog: " + this.f3646d);
        }
        try {
            this.f3647e.dismissDialog(this.f3646d);
            this.f3647e.removeDialog(this.f3646d);
        } catch (Exception unused) {
            if (com.amazon.a.a.o.c.f3947a) {
                f3644b.b("Unable to remove dialog: " + this.f3646d);
            }
        }
        this.f3647e = null;
        this.f3649g = null;
    }

    public final void a(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        if (e(activity)) {
            f(activity);
        } else {
            b(d.NOT_COMPATIBLE);
        }
    }

    public void a(Activity activity, boolean z7) {
        if (activity != this.f3647e) {
            if (com.amazon.a.a.o.c.f3947a) {
                f3644b.a("Unrecognized context");
            }
        } else {
            if (!z7 || this.f3649g.isShowing()) {
                return;
            }
            if (com.amazon.a.a.o.c.f3947a) {
                f3644b.a("showing dialog because it was not showing");
            }
            this.f3649g.show();
        }
    }

    protected abstract void a(d dVar);

    protected boolean b(Activity activity) {
        return true;
    }

    public final Dialog c(Activity activity) {
        this.f3647e = activity;
        Dialog dialogD = d(activity);
        this.f3649g = dialogD;
        dialogD.setCancelable(false);
        this.f3649g.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.amazon.a.a.i.b.1
            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(DialogInterface dialogInterface, int i8, KeyEvent keyEvent) {
                return i8 == 84;
            }
        });
        return this.f3649g;
    }

    protected abstract Dialog d(Activity activity);

    @Override // com.amazon.a.a.e.a
    protected final void d() {
        if (com.amazon.a.a.o.c.f3947a) {
            f3644b.a("Expiring prompt: " + this);
        }
        this.f3608a.a(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.a.a.i.b.2
            @Override // com.amazon.a.a.n.a
            public void a() {
                b.this.k();
            }

            public String toString() {
                return "DismissPromptTask: " + b.this.toString();
            }
        });
        a(l());
    }

    public int j() {
        return this.f3646d;
    }

    protected final boolean k() {
        com.amazon.a.a.o.a.a.a();
        if (com.amazon.a.a.o.c.f3947a) {
            f3644b.a("Dismissing Prompt: " + this.f3646d);
        }
        if (!this.f3650h.compareAndSet(false, true)) {
            if (com.amazon.a.a.o.c.f3947a) {
                f3644b.b("Prompt has already been dismissed");
            }
            return false;
        }
        if (this.f3647e != null) {
            m();
        }
        f();
        return true;
    }

    protected d l() {
        if (!g()) {
            return null;
        }
        d dVar = this.f3648f;
        return dVar == null ? d.EXPIRATION_DURATION_ELAPSED : dVar;
    }
}
