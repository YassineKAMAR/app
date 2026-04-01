package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class hs1 implements vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ js1 f8946a;

    hs1(js1 js1Var) {
        this.f8946a = js1Var;
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void a(Throwable th) {
        synchronized (this) {
            this.f8946a.f9777c = true;
            this.f8946a.v("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (g2.t.b().b() - this.f8946a.f9778d));
            this.f8946a.f9779e.e(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        final String str = (String) obj;
        synchronized (this) {
            this.f8946a.f9777c = true;
            this.f8946a.v("com.google.android.gms.ads.MobileAds", true, "", (int) (g2.t.b().b() - this.f8946a.f9778d));
            this.f8946a.f9783i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.gs1
                @Override // java.lang.Runnable
                public final void run() {
                    js1.j(this.f8486a.f8946a, str);
                }
            });
        }
    }
}
