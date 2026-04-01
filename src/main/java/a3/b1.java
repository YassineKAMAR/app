package a3;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class b1 extends m0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ c f23g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(c cVar, int i8, Bundle bundle) {
        super(cVar, i8, null);
        this.f23g = cVar;
    }

    @Override // a3.m0
    protected final void f(x2.b bVar) {
        if (this.f23g.t() && c.h0(this.f23g)) {
            c.d0(this.f23g, 16);
        } else {
            this.f23g.f39p.c(bVar);
            this.f23g.L(bVar);
        }
    }

    @Override // a3.m0
    protected final boolean g() {
        this.f23g.f39p.c(x2.b.f27239e);
        return true;
    }
}
