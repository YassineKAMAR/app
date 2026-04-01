package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class rx2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e3.e f14364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f14365b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f14366c = new HashMap();

    public rx2(e3.e eVar) {
        this.f14364a = eVar;
    }

    private final void d(String str, String str2) {
        if (!this.f14365b.containsKey(str)) {
            this.f14365b.put(str, new ArrayList());
        }
        ((List) this.f14365b.get(str)).add(str2);
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f14365b.entrySet()) {
            int i8 = 0;
            if (((List) entry.getValue()).size() > 1) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    i8++;
                    arrayList.add(new qx2(((String) entry.getKey()) + "." + i8, (String) it.next()));
                }
            } else {
                arrayList.add(new qx2((String) entry.getKey(), (String) ((List) entry.getValue()).get(0)));
            }
        }
        return arrayList;
    }

    public final void b(String str) {
        if (!this.f14366c.containsKey(str)) {
            this.f14366c.put(str, Long.valueOf(this.f14364a.b()));
            return;
        }
        long jB = this.f14364a.b() - ((Long) this.f14366c.remove(str)).longValue();
        StringBuilder sb = new StringBuilder();
        sb.append(jB);
        d(str, sb.toString());
    }

    public final void c(String str, String str2) {
        if (!this.f14366c.containsKey(str)) {
            this.f14366c.put(str, Long.valueOf(this.f14364a.b()));
            return;
        }
        d(str, str2 + (this.f14364a.b() - ((Long) this.f14366c.remove(str)).longValue()));
    }
}
