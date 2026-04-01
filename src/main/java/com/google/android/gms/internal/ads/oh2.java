package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class oh2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lg3 f12484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f12485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q92 f12486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f12487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ts2 f12488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m92 f12489f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final xn1 f12490g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ls1 f12491h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final String f12492i;

    oh2(lg3 lg3Var, ScheduledExecutorService scheduledExecutorService, String str, q92 q92Var, Context context, ts2 ts2Var, m92 m92Var, xn1 xn1Var, ls1 ls1Var) {
        this.f12484a = lg3Var;
        this.f12485b = scheduledExecutorService;
        this.f12492i = str;
        this.f12486c = q92Var;
        this.f12487d = context;
        this.f12488e = ts2Var;
        this.f12489f = m92Var;
        this.f12490g = xn1Var;
        this.f12491h = ls1Var;
    }

    public static /* synthetic */ x3.d a(oh2 oh2Var) {
        Map mapA;
        String lowerCase = ((Boolean) h2.y.c().b(ns.X9)).booleanValue() ? oh2Var.f12488e.f15304f.toLowerCase(Locale.ROOT) : oh2Var.f12488e.f15304f;
        final Bundle bundleC = ((Boolean) h2.y.c().b(ns.B1)).booleanValue() ? oh2Var.f12491h.c() : new Bundle();
        final ArrayList arrayList = new ArrayList();
        if (((Boolean) h2.y.c().b(ns.K1)).booleanValue()) {
            mapA = oh2Var.f12486c.a(oh2Var.f12492i, lowerCase);
        } else {
            for (Map.Entry entry : ((mb3) oh2Var.f12486c.b(oh2Var.f12492i, lowerCase)).entrySet()) {
                String str = (String) entry.getKey();
                arrayList.add(oh2Var.e(str, (List) entry.getValue(), oh2Var.d(str), true, true));
            }
            mapA = oh2Var.f12486c.c();
        }
        oh2Var.g(arrayList, mapA);
        return zf3.b(arrayList).a(new Callable() { // from class: com.google.android.gms.internal.ads.jh2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                JSONArray jSONArray = new JSONArray();
                for (x3.d dVar : arrayList) {
                    if (((JSONObject) dVar.get()) != null) {
                        jSONArray.put(dVar.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new ph2(jSONArray.toString(), bundleC);
            }
        }, oh2Var.f12484a);
    }

    private final Bundle d(String str) {
        Bundle bundle = this.f12488e.f15302d.f22264m;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final qf3 e(final String str, final List list, final Bundle bundle, final boolean z7, final boolean z8) {
        qf3 qf3VarC = qf3.C(zf3.k(new ef3() { // from class: com.google.android.gms.internal.ads.lh2
            @Override // com.google.android.gms.internal.ads.ef3
            public final x3.d j() {
                return this.f10723a.b(str, list, bundle, z7, z8);
            }
        }, this.f12484a));
        if (!((Boolean) h2.y.c().b(ns.f12226x1)).booleanValue()) {
            qf3VarC = (qf3) zf3.o(qf3VarC, ((Long) h2.y.c().b(ns.f12167q1)).longValue(), TimeUnit.MILLISECONDS, this.f12485b);
        }
        return (qf3) zf3.e(qf3VarC, Throwable.class, new z73() { // from class: com.google.android.gms.internal.ads.mh2
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj) {
                qg0.d("Error calling adapter: ".concat(String.valueOf(str)));
                return null;
            }
        }, this.f12484a);
    }

    private final void f(y60 y60Var, Bundle bundle, List list, t92 t92Var) {
        y60Var.x1(g3.b.k3(this.f12487d), this.f12492i, bundle, (Bundle) list.get(0), this.f12488e.f15303e, t92Var);
    }

    private final void g(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            u92 u92Var = (u92) ((Map.Entry) it.next()).getValue();
            String str = u92Var.f15577a;
            list.add(e(str, Collections.singletonList(u92Var.f15581e), d(str), u92Var.f15578b, u92Var.f15579c));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ x3.d b(java.lang.String r9, final java.util.List r10, final android.os.Bundle r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.jh0 r7 = new com.google.android.gms.internal.ads.jh0
            r7.<init>()
            r0 = 0
            if (r13 == 0) goto L26
            com.google.android.gms.internal.ads.fs r13 = com.google.android.gms.internal.ads.ns.C1
            com.google.android.gms.internal.ads.ls r1 = h2.y.c()
            java.lang.Object r13 = r1.b(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L26
            com.google.android.gms.internal.ads.m92 r13 = r8.f12489f
            r13.b(r9)
            com.google.android.gms.internal.ads.m92 r13 = r8.f12489f
            com.google.android.gms.internal.ads.y60 r13 = r13.a(r9)
            goto L34
        L26:
            com.google.android.gms.internal.ads.xn1 r13 = r8.f12490g     // Catch: android.os.RemoteException -> L2d
            com.google.android.gms.internal.ads.y60 r13 = r13.b(r9)     // Catch: android.os.RemoteException -> L2d
            goto L34
        L2d:
            r13 = move-exception
            java.lang.String r1 = "Couldn't create RTB adapter : "
            com.google.android.gms.internal.ads.qg0.e(r1, r13)
            r13 = r0
        L34:
            if (r13 != 0) goto L4e
            com.google.android.gms.internal.ads.fs r10 = com.google.android.gms.internal.ads.ns.f12185s1
            com.google.android.gms.internal.ads.ls r11 = h2.y.c()
            java.lang.Object r10 = r11.b(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L4d
            com.google.android.gms.internal.ads.t92.O5(r9, r7)
            goto Lba
        L4d:
            throw r0
        L4e:
            com.google.android.gms.internal.ads.t92 r6 = new com.google.android.gms.internal.ads.t92
            e3.e r0 = g2.t.b()
            long r4 = r0.b()
            r0 = r6
            r1 = r9
            r2 = r13
            r3 = r7
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.internal.ads.fs r9 = com.google.android.gms.internal.ads.ns.f12226x1
            com.google.android.gms.internal.ads.ls r0 = h2.y.c()
            java.lang.Object r9 = r0.b(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8d
            java.util.concurrent.ScheduledExecutorService r9 = r8.f12485b
            com.google.android.gms.internal.ads.nh2 r0 = new com.google.android.gms.internal.ads.nh2
            r0.<init>()
            com.google.android.gms.internal.ads.fs r1 = com.google.android.gms.internal.ads.ns.f12167q1
            com.google.android.gms.internal.ads.ls r2 = h2.y.c()
            java.lang.Object r1 = r2.b(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r9.schedule(r0, r1, r3)
        L8d:
            if (r12 == 0) goto Lb7
            com.google.android.gms.internal.ads.fs r9 = com.google.android.gms.internal.ads.ns.E1
            com.google.android.gms.internal.ads.ls r12 = h2.y.c()
            java.lang.Object r9 = r12.b(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lb3
            com.google.android.gms.internal.ads.lg3 r9 = r8.f12484a
            com.google.android.gms.internal.ads.kh2 r12 = new com.google.android.gms.internal.ads.kh2
            r0 = r12
            r1 = r8
            r2 = r13
            r3 = r11
            r4 = r10
            r5 = r6
            r6 = r7
            r0.<init>()
            r9.d(r12)
            goto Lba
        Lb3:
            r8.f(r13, r11, r10, r6)
            goto Lba
        Lb7:
            r6.p()
        Lba:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oh2.b(java.lang.String, java.util.List, android.os.Bundle, boolean, boolean):x3.d");
    }

    final /* synthetic */ void c(y60 y60Var, Bundle bundle, List list, t92 t92Var, jh0 jh0Var) {
        try {
            f(y60Var, bundle, list, t92Var);
        } catch (RemoteException e8) {
            jh0Var.e(e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        ts2 ts2Var = this.f12488e;
        if (ts2Var.f15315q) {
            if (!Arrays.asList(((String) h2.y.c().b(ns.D1)).split(com.amazon.a.a.o.b.f.f3942a)).contains(p2.y.a(p2.y.b(ts2Var.f15302d)))) {
                return zf3.h(new ph2(new JSONArray().toString(), new Bundle()));
            }
        }
        return zf3.k(new ef3() { // from class: com.google.android.gms.internal.ads.ih2
            @Override // com.google.android.gms.internal.ads.ef3
            public final x3.d j() {
                return oh2.a(this.f9195a);
            }
        }, this.f12484a);
    }
}
