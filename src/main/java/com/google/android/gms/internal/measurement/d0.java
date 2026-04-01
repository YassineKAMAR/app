package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, z> f18634a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s0 f18635b = new s0();

    public d0() {
        b(new x());
        b(new c0());
        b(new e0());
        b(new i0());
        b(new k0());
        b(new q0());
        b(new v0());
    }

    private final void b(z zVar) {
        Iterator<x0> it = zVar.f19420a.iterator();
        while (it.hasNext()) {
            this.f18634a.put(it.next().toString(), zVar);
        }
    }

    public final r a(b7 b7Var, r rVar) {
        a6.b(b7Var);
        if (!(rVar instanceof u)) {
            return rVar;
        }
        u uVar = (u) rVar;
        ArrayList<r> arrayListB = uVar.b();
        String strA = uVar.a();
        return (this.f18634a.containsKey(strA) ? this.f18634a.get(strA) : this.f18635b).b(strA, b7Var, arrayListB);
    }
}
