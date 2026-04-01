package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class aa1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Map f5160a = new HashMap();

    protected aa1(Set set) {
        x0(set);
    }

    public final synchronized void u0(yb1 yb1Var) {
        w0(yb1Var.f17725a, yb1Var.f17726b);
    }

    public final synchronized void w0(Object obj, Executor executor) {
        this.f5160a.put(obj, executor);
    }

    public final synchronized void x0(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            u0((yb1) it.next());
        }
    }

    protected final synchronized void z0(final z91 z91Var) {
        for (Map.Entry entry : this.f5160a.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.y91
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        z91Var.a(key);
                    } catch (Throwable th) {
                        g2.t.q().t(th, "EventEmitter.notify");
                        j2.v1.l("Event emitter exception.", th);
                    }
                }
            });
        }
    }
}
