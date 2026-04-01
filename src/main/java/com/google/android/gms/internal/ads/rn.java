package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public final class rn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private gn f14228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f14229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f14230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f14231d = new Object();

    rn(Context context) {
        this.f14230c = context;
    }

    static /* bridge */ /* synthetic */ void e(rn rnVar) {
        synchronized (rnVar.f14231d) {
            gn gnVar = rnVar.f14228a;
            if (gnVar == null) {
                return;
            }
            gnVar.f();
            rnVar.f14228a = null;
            Binder.flushPendingCommands();
        }
    }

    final Future c(hn hnVar) {
        ln lnVar = new ln(this);
        pn pnVar = new pn(this, hnVar, lnVar);
        qn qnVar = new qn(this, lnVar);
        synchronized (this.f14231d) {
            gn gnVar = new gn(this.f14230c, g2.t.v().b(), pnVar, qnVar);
            this.f14228a = gnVar;
            gnVar.q();
        }
        return lnVar;
    }
}
