package g2;

import com.google.android.gms.internal.ads.k33;

/* JADX INFO: loaded from: classes.dex */
final class h implements k33 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f21951a;

    h(i iVar) {
        this.f21951a = iVar;
    }

    @Override // com.google.android.gms.internal.ads.k33
    public final void a(int i8, long j8, String str) {
        this.f21951a.f21959h.e(i8, System.currentTimeMillis() - j8, str);
    }

    @Override // com.google.android.gms.internal.ads.k33
    public final void c(int i8, long j8) {
        this.f21951a.f21959h.d(i8, System.currentTimeMillis() - j8);
    }
}
