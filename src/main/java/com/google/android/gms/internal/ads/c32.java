package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class c32 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f6134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private as2 f6135d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private wr2 f6136e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private h2.a5 f6137f = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f6133b = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f6132a = Collections.synchronizedList(new ArrayList());

    public c32(String str) {
        this.f6134c = str;
    }

    private static String j(wr2 wr2Var) {
        return ((Boolean) h2.y.c().b(ns.f12160p3)).booleanValue() ? wr2Var.f16900r0 : wr2Var.f16910y;
    }

    private final synchronized void k(wr2 wr2Var, int i8) {
        String str;
        String str2;
        String str3;
        String str4;
        Map map = this.f6133b;
        String strJ = j(wr2Var);
        if (map.containsKey(strJ)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = wr2Var.f16909x.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, wr2Var.f16909x.getString(next));
            } catch (JSONException unused) {
            }
        }
        if (((Boolean) h2.y.c().b(ns.K6)).booleanValue()) {
            str = wr2Var.H;
            str2 = wr2Var.I;
            str3 = wr2Var.J;
            str4 = wr2Var.K;
        } else {
            str = "";
            str2 = "";
            str3 = "";
            str4 = "";
        }
        h2.a5 a5Var = new h2.a5(wr2Var.G, 0L, null, bundle, str, str2, str3, str4);
        try {
            this.f6132a.add(i8, a5Var);
        } catch (IndexOutOfBoundsException e8) {
            g2.t.q().u(e8, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.f6133b.put(strJ, a5Var);
    }

    private final void l(wr2 wr2Var, long j8, h2.z2 z2Var, boolean z7) {
        Map map = this.f6133b;
        String strJ = j(wr2Var);
        if (map.containsKey(strJ)) {
            if (this.f6136e == null) {
                this.f6136e = wr2Var;
            }
            h2.a5 a5Var = (h2.a5) this.f6133b.get(strJ);
            a5Var.f22157b = j8;
            a5Var.f22158c = z2Var;
            if (((Boolean) h2.y.c().b(ns.L6)).booleanValue() && z7) {
                this.f6137f = a5Var;
            }
        }
    }

    public final h2.a5 a() {
        return this.f6137f;
    }

    public final z31 b() {
        return new z31(this.f6136e, "", this, this.f6135d, this.f6134c);
    }

    public final List c() {
        return this.f6132a;
    }

    public final void d(wr2 wr2Var) {
        k(wr2Var, this.f6132a.size());
    }

    public final void e(wr2 wr2Var) {
        int iIndexOf = this.f6132a.indexOf(this.f6133b.get(j(wr2Var)));
        if (iIndexOf < 0 || iIndexOf >= this.f6133b.size()) {
            iIndexOf = this.f6132a.indexOf(this.f6137f);
        }
        if (iIndexOf < 0 || iIndexOf >= this.f6133b.size()) {
            return;
        }
        this.f6137f = (h2.a5) this.f6132a.get(iIndexOf);
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f6132a.size()) {
                return;
            }
            h2.a5 a5Var = (h2.a5) this.f6132a.get(iIndexOf);
            a5Var.f22157b = 0L;
            a5Var.f22158c = null;
        }
    }

    public final void f(wr2 wr2Var, long j8, h2.z2 z2Var) {
        l(wr2Var, j8, z2Var, false);
    }

    public final void g(wr2 wr2Var, long j8, h2.z2 z2Var) {
        l(wr2Var, j8, null, true);
    }

    public final synchronized void h(String str, List list) {
        if (this.f6133b.containsKey(str)) {
            int iIndexOf = this.f6132a.indexOf((h2.a5) this.f6133b.get(str));
            try {
                this.f6132a.remove(iIndexOf);
            } catch (IndexOutOfBoundsException e8) {
                g2.t.q().u(e8, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.f6133b.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k((wr2) it.next(), iIndexOf);
                iIndexOf++;
            }
        }
    }

    public final void i(as2 as2Var) {
        this.f6135d = as2Var;
    }
}
