package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zz implements i2.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f18513a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f18514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ h2.a f18515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Map f18516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Map f18517e;

    zz(b00 b00Var, boolean z7, h2.a aVar, Map map, Map map2) {
        this.f18514b = z7;
        this.f18515c = aVar;
        this.f18516d = map;
        this.f18517e = map2;
    }

    @Override // i2.d0
    public final void a(boolean z7) {
        if (this.f18513a) {
            return;
        }
        if (z7 && this.f18514b) {
            ((hc1) this.f18515c).f0();
        }
        this.f18513a = true;
        this.f18516d.put((String) this.f18517e.get("event_id"), Boolean.valueOf(z7));
        ((d20) this.f18515c).U("openIntentAsync", this.f18516d);
    }

    @Override // i2.d0
    public final void d(int i8) {
    }
}
