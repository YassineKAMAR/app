package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import j1.z0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.b$b, reason: collision with other inner class name */
    public static final class C0072b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile d0 f4459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f4460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile j1.n f4461c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile j1.c f4462d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private volatile j1.q f4463e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private volatile boolean f4464f;

        /* synthetic */ C0072b(Context context, z0 z0Var) {
            this.f4460b = context;
        }

        public b a() {
            if (this.f4460b == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.f4462d != null && this.f4463e != null) {
                throw new IllegalArgumentException("Please provide only one valid listener for alternative billing/user choice billing updates.");
            }
            if (this.f4461c != null) {
                if (this.f4459a != null) {
                    return this.f4461c != null ? this.f4463e == null ? new c((String) null, this.f4459a, this.f4460b, this.f4461c, this.f4462d, (y) null, (ExecutorService) null) : new c((String) null, this.f4459a, this.f4460b, this.f4461c, this.f4463e, (y) null, (ExecutorService) null) : new c(null, this.f4459a, this.f4460b, null, null, null);
                }
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            if (this.f4462d != null) {
                throw new IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling Alternative Billing.");
            }
            if (this.f4463e != null) {
                throw new IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling User Choice Billing.");
            }
            if (this.f4464f) {
                return new c(null, this.f4460b, null, null);
            }
            throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
        }

        public C0072b b() {
            c0 c0Var = new c0(null);
            c0Var.a();
            this.f4459a = c0Var.b();
            return this;
        }

        public C0072b c(j1.n nVar) {
            this.f4461c = nVar;
            return this;
        }
    }

    public static C0072b h(Context context) {
        return new C0072b(context, null);
    }

    public abstract void a(j1.a aVar, j1.b bVar);

    public abstract void b(j1.f fVar, j1.g gVar);

    public abstract void c();

    public abstract void d(j1.h hVar, j1.e eVar);

    public abstract f e(String str);

    public abstract boolean f();

    public abstract f g(Activity activity, e eVar);

    public abstract void i(i iVar, j1.k kVar);

    public abstract void j(j1.o oVar, j1.l lVar);

    public abstract void k(j1.p pVar, j1.m mVar);

    public abstract f l(Activity activity, g gVar, j1.i iVar);

    public abstract void m(j1.d dVar);
}
