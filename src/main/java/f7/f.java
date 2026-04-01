package f7;

import y6.b1;

/* JADX INFO: loaded from: classes2.dex */
public class f extends b1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f21844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f21845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f21846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f21847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f21848h = h0();

    public f(int i8, int i9, long j8, String str) {
        this.f21844d = i8;
        this.f21845e = i9;
        this.f21846f = j8;
        this.f21847g = str;
    }

    private final a h0() {
        return new a(this.f21844d, this.f21845e, this.f21846f, this.f21847g);
    }

    @Override // y6.b0
    public void e0(h6.g gVar, Runnable runnable) {
        a.t(this.f21848h, runnable, null, false, 6, null);
    }

    public final void i0(Runnable runnable, i iVar, boolean z7) {
        this.f21848h.q(runnable, iVar, z7);
    }
}
