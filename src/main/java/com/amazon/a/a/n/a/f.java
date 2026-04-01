package com.amazon.a.a.n.a;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public class f extends com.amazon.a.a.i.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f3808b = new com.amazon.a.a.o.c("DecisionDialog");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f3810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BlockingQueue<a> f3811e = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Thread f3809c = Thread.currentThread();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.amazon.d.a.a f3814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f3815b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Intent f3816c;

        public a(com.amazon.d.a.a aVar) {
            this.f3814a = aVar;
            this.f3815b = aVar.a();
            this.f3816c = aVar.b();
        }

        public com.amazon.d.a.a a() {
            return this.f3814a;
        }

        public String b() {
            return this.f3815b;
        }

        public Intent c() {
            return this.f3816c;
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f3817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f3818b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f3819c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final a f3820d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final a f3821e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final a f3822f;

        public b(com.amazon.d.a.f fVar) {
            this.f3817a = fVar.b();
            this.f3818b = fVar.c();
            this.f3819c = fVar.d();
            this.f3820d = a(fVar.e());
            this.f3821e = a(fVar.f());
            this.f3822f = a(fVar.g());
        }

        private a a(com.amazon.d.a.a aVar) {
            if (aVar == null) {
                return null;
            }
            return new a(aVar);
        }

        public String a() {
            return this.f3817a;
        }

        public String b() {
            return this.f3818b;
        }

        public long c() {
            return this.f3819c;
        }

        public a d() {
            return this.f3822f;
        }

        public a e() {
            return this.f3821e;
        }

        public a f() {
            return this.f3820d;
        }
    }

    public f(com.amazon.d.a.f fVar) {
        this.f3810d = new b(fVar);
    }

    private void a(Activity activity, AlertDialog alertDialog, final a aVar, int i8) {
        if (aVar == null) {
            return;
        }
        alertDialog.setButton(i8, aVar.b(), new DialogInterface.OnClickListener() { // from class: com.amazon.a.a.n.a.f.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i9) {
                if (com.amazon.a.a.o.c.f3947a) {
                    f.f3808b.a("Choice selected!");
                }
                if (f.this.k()) {
                    f.this.f3811e.add(aVar);
                }
            }
        });
    }

    private boolean a(a aVar) {
        return (aVar == null || aVar.c() == null) ? false : true;
    }

    private ActivityInfo e(Activity activity) {
        try {
            return activity.getPackageManager().getActivityInfo(activity.getComponentName(), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            if (!com.amazon.a.a.o.c.f3948b) {
                return null;
            }
            f3808b.b("Unable to get info for activity: " + activity);
            return null;
        }
    }

    private Dialog f(Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(this.f3810d.a()).setMessage(this.f3810d.b()).setCancelable(false);
        AlertDialog alertDialogCreate = builder.create();
        a(activity, alertDialogCreate, this.f3810d.f(), -1);
        a(activity, alertDialogCreate, this.f3810d.e(), -3);
        a(activity, alertDialogCreate, this.f3810d.d(), -2);
        return alertDialogCreate;
    }

    private com.amazon.d.a.a n() throws com.amazon.a.a.n.a.a.e {
        try {
            if (com.amazon.a.a.o.c.f3947a) {
                f3808b.a("Blocking while awaiting customer decision: " + Thread.currentThread());
            }
            return this.f3811e.take().a();
        } catch (InterruptedException unused) {
            if (com.amazon.a.a.o.c.f3947a) {
                f3808b.a("Interrupted while awaiting decision, throwing decision expired!");
            }
            throw new com.amazon.a.a.n.a.a.e(o());
        }
    }

    private e o() {
        return l() == com.amazon.a.a.i.d.NOT_COMPATIBLE ? e.APP_NOT_COMPATIBLE : e.EXPIRATION_DURATION_ELAPSED;
    }

    private boolean p() {
        return a(this.f3810d.f()) || a(this.f3810d.e()) || a(this.f3810d.d());
    }

    @Override // com.amazon.a.a.i.b
    protected void a(com.amazon.a.a.i.d dVar) {
        if (com.amazon.a.a.o.c.f3947a) {
            f3808b.a("Expiring Decision Dialog: Thread: " + Thread.currentThread());
        }
        this.f3809c.interrupt();
    }

    @Override // com.amazon.a.a.i.b
    public boolean b(Activity activity) {
        if (!p()) {
            return true;
        }
        ActivityInfo activityInfoE = e(activity);
        if (activityInfoE == null) {
            return false;
        }
        boolean z7 = activityInfoE.launchMode == 3;
        com.amazon.a.a.o.c cVar = f3808b;
        cVar.a("Single instance: " + z7);
        boolean z8 = (activityInfoE.flags & 2) != 0;
        cVar.a("Finish on task launch:" + z8);
        boolean z9 = (activityInfoE.flags & 128) != 0;
        cVar.a("No History: " + z9);
        return (z7 || z8 || z9) ? false : true;
    }

    @Override // com.amazon.a.a.i.b
    public Dialog d(Activity activity) {
        return f(activity);
    }

    @Override // com.amazon.a.a.e.c
    protected long h() {
        return this.f3810d.c();
    }

    public com.amazon.d.a.a i() {
        if (com.amazon.a.a.o.c.f3947a) {
            f3808b.a("GetCustomerDecision: " + this.f3809c);
        }
        return n();
    }

    public String toString() {
        return "DecisionDialog: " + this.f3810d.a();
    }
}
