package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
final class hc implements tb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f8717a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fb f8718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BlockingQueue f8719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kb f8720d;

    hc(fb fbVar, BlockingQueue blockingQueue, kb kbVar) {
        this.f8720d = kbVar;
        this.f8718b = fbVar;
        this.f8719c = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.tb
    public final synchronized void a(ub ubVar) {
        Map map = this.f8717a;
        String strO = ubVar.o();
        List list = (List) map.remove(strO);
        if (list == null || list.isEmpty()) {
            return;
        }
        if (gc.f8287b) {
            gc.d("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strO);
        }
        ub ubVar2 = (ub) list.remove(0);
        this.f8717a.put(strO, list);
        ubVar2.A(this);
        try {
            this.f8719c.put(ubVar2);
        } catch (InterruptedException e8) {
            gc.b("Couldn't add request to queue. %s", e8.toString());
            Thread.currentThread().interrupt();
            this.f8718b.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.tb
    public final void b(ub ubVar, ac acVar) {
        List list;
        cb cbVar = acVar.f5191b;
        if (cbVar == null || cbVar.a(System.currentTimeMillis())) {
            a(ubVar);
            return;
        }
        String strO = ubVar.o();
        synchronized (this) {
            list = (List) this.f8717a.remove(strO);
        }
        if (list != null) {
            if (gc.f8287b) {
                gc.d("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strO);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f8720d.b((ub) it.next(), acVar, null);
            }
        }
    }

    final synchronized boolean c(ub ubVar) {
        Map map = this.f8717a;
        String strO = ubVar.o();
        if (!map.containsKey(strO)) {
            this.f8717a.put(strO, null);
            ubVar.A(this);
            if (gc.f8287b) {
                gc.a("new request, sending to network %s", strO);
            }
            return false;
        }
        List arrayList = (List) this.f8717a.get(strO);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        ubVar.s("waiting-for-response");
        arrayList.add(ubVar);
        this.f8717a.put(strO, arrayList);
        if (gc.f8287b) {
            gc.a("Request for cacheKey=%s is in flight, putting on hold.", strO);
        }
        return true;
    }
}
