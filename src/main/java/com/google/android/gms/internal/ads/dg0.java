package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class dg0 implements nl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j2.x1 f6714b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ag0 f6716d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f6713a = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final HashSet f6717e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final HashSet f6718f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f6719g = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bg0 f6715c = new bg0();

    public dg0(String str, j2.x1 x1Var) {
        this.f6716d = new ag0(str, x1Var);
        this.f6714b = x1Var;
    }

    @Override // com.google.android.gms.internal.ads.nl
    public final void a(boolean z7) {
        ag0 ag0Var;
        int iL;
        long jA = g2.t.b().a();
        if (!z7) {
            this.f6714b.D(jA);
            this.f6714b.e(this.f6716d.f5253d);
            return;
        }
        if (jA - this.f6714b.p() > ((Long) h2.y.c().b(ns.S0)).longValue()) {
            ag0Var = this.f6716d;
            iL = -1;
        } else {
            ag0Var = this.f6716d;
            iL = this.f6714b.l();
        }
        ag0Var.f5253d = iL;
        this.f6719g = true;
    }

    public final int b() {
        int iA;
        synchronized (this.f6713a) {
            iA = this.f6716d.a();
        }
        return iA;
    }

    public final qf0 c(e3.e eVar, String str) {
        return new qf0(eVar, this, this.f6715c.a(), str);
    }

    public final String d() {
        return this.f6715c.b();
    }

    public final void e(qf0 qf0Var) {
        synchronized (this.f6713a) {
            this.f6717e.add(qf0Var);
        }
    }

    public final void f() {
        synchronized (this.f6713a) {
            this.f6716d.c();
        }
    }

    public final void g() {
        synchronized (this.f6713a) {
            this.f6716d.d();
        }
    }

    public final void h() {
        synchronized (this.f6713a) {
            this.f6716d.e();
        }
    }

    public final void i() {
        synchronized (this.f6713a) {
            this.f6716d.f();
        }
    }

    public final void j(h2.r4 r4Var, long j8) {
        synchronized (this.f6713a) {
            this.f6716d.g(r4Var, j8);
        }
    }

    public final void k() {
        synchronized (this.f6713a) {
            this.f6716d.h();
        }
    }

    public final void l(HashSet hashSet) {
        synchronized (this.f6713a) {
            this.f6717e.addAll(hashSet);
        }
    }

    public final boolean m() {
        return this.f6719g;
    }

    public final Bundle n(Context context, bu2 bu2Var) {
        HashSet hashSet = new HashSet();
        synchronized (this.f6713a) {
            hashSet.addAll(this.f6717e);
            this.f6717e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.f6716d.b(context, this.f6715c.b()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.f6718f.iterator();
        if (it.hasNext()) {
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((qf0) it2.next()).a());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        bu2Var.b(hashSet);
        return bundle;
    }
}
