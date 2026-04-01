package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class lv2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dv2 f11073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x3.d f11074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f11075c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f11076d = false;

    public lv2(final iu2 iu2Var, final cv2 cv2Var, final dv2 dv2Var) {
        this.f11073a = dv2Var;
        this.f11074b = zf3.f(zf3.n(cv2Var.a(dv2Var), new gf3() { // from class: com.google.android.gms.internal.ads.jv2
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return this.f9822a.b(cv2Var, iu2Var, dv2Var, (ru2) obj);
            }
        }, dv2Var.k()), Exception.class, new gf3() { // from class: com.google.android.gms.internal.ads.kv2
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return this.f10372a.c(cv2Var, (Exception) obj);
            }
        }, dv2Var.k());
    }

    public final synchronized x3.d a(dv2 dv2Var) {
        if (!this.f11076d && !this.f11075c) {
            if (this.f11073a.j() != null && dv2Var.j() != null && this.f11073a.j().equals(dv2Var.j())) {
                this.f11075c = true;
                return this.f11074b;
            }
            return null;
        }
        return null;
    }

    final /* synthetic */ x3.d b(cv2 cv2Var, iu2 iu2Var, dv2 dv2Var, ru2 ru2Var) {
        synchronized (this) {
            this.f11076d = true;
            cv2Var.b(ru2Var);
            if (this.f11075c) {
                return zf3.h(new bv2(ru2Var, dv2Var));
            }
            iu2Var.d(dv2Var.j(), ru2Var);
            return zf3.h(null);
        }
    }

    final /* synthetic */ x3.d c(cv2 cv2Var, Exception exc) {
        synchronized (this) {
            this.f11076d = true;
            throw exc;
        }
    }

    public final synchronized void d(vf3 vf3Var) {
        zf3.r(zf3.n(this.f11074b, new gf3() { // from class: com.google.android.gms.internal.ads.hv2
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return zf3.i();
            }
        }, this.f11073a.k()), vf3Var, this.f11073a.k());
    }
}
