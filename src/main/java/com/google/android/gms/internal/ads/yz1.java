package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class yz1 implements cx2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f17950a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f17951b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final lx2 f17952c;

    public yz1(Set set, lx2 lx2Var) {
        this.f17952c = lx2Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            xz1 xz1Var = (xz1) it.next();
            this.f17950a.put(xz1Var.f17509b, xz1Var.f17508a);
            this.f17951b.put(xz1Var.f17510c, xz1Var.f17508a);
        }
    }

    @Override // com.google.android.gms.internal.ads.cx2
    public final void C(vw2 vw2Var, String str) {
        this.f17952c.d("task.".concat(String.valueOf(str)));
        if (this.f17950a.containsKey(vw2Var)) {
            this.f17952c.d("label.".concat(String.valueOf((String) this.f17950a.get(vw2Var))));
        }
    }

    @Override // com.google.android.gms.internal.ads.cx2
    public final void e(vw2 vw2Var, String str) {
        this.f17952c.e("task.".concat(String.valueOf(str)), "s.");
        if (this.f17951b.containsKey(vw2Var)) {
            this.f17952c.e("label.".concat(String.valueOf((String) this.f17951b.get(vw2Var))), "s.");
        }
    }

    @Override // com.google.android.gms.internal.ads.cx2
    public final void h(vw2 vw2Var, String str) {
    }

    @Override // com.google.android.gms.internal.ads.cx2
    public final void o(vw2 vw2Var, String str, Throwable th) {
        this.f17952c.e("task.".concat(String.valueOf(str)), "f.");
        if (this.f17951b.containsKey(vw2Var)) {
            this.f17952c.e("label.".concat(String.valueOf((String) this.f17951b.get(vw2Var))), "f.");
        }
    }
}
