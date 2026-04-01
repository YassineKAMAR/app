package com.google.android.gms.internal.ads;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class g73 extends a73 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ IBinder f8250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ j73 f8251c;

    g73(j73 j73Var, IBinder iBinder) {
        this.f8251c = j73Var;
        this.f8250b = iBinder;
    }

    @Override // com.google.android.gms.internal.ads.a73
    public final void a() {
        this.f8251c.f9513a.f9978m = v63.O5(this.f8250b);
        k73.q(this.f8251c.f9513a);
        this.f8251c.f9513a.f9972g = false;
        Iterator it = this.f8251c.f9513a.f9969d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f8251c.f9513a.f9969d.clear();
    }
}
