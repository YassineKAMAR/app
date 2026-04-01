package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class bh1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final bh1 f5789h = new bh1(new zg1());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ww f5790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final tw f5791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kx f5792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final gx f5793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b20 f5794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p.h f5795f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p.h f5796g;

    private bh1(zg1 zg1Var) {
        this.f5790a = zg1Var.f18218a;
        this.f5791b = zg1Var.f18219b;
        this.f5792c = zg1Var.f18220c;
        this.f5795f = new p.h(zg1Var.f18223f);
        this.f5796g = new p.h(zg1Var.f18224g);
        this.f5793d = zg1Var.f18221d;
        this.f5794e = zg1Var.f18222e;
    }

    public final tw a() {
        return this.f5791b;
    }

    public final ww b() {
        return this.f5790a;
    }

    public final zw c(String str) {
        return (zw) this.f5796g.get(str);
    }

    public final cx d(String str) {
        return (cx) this.f5795f.get(str);
    }

    public final gx e() {
        return this.f5793d;
    }

    public final kx f() {
        return this.f5792c;
    }

    public final b20 g() {
        return this.f5794e;
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList(this.f5795f.size());
        for (int i8 = 0; i8 < this.f5795f.size(); i8++) {
            arrayList.add((String) this.f5795f.j(i8));
        }
        return arrayList;
    }

    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        if (this.f5792c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.f5790a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.f5791b != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.f5795f.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.f5794e != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }
}
