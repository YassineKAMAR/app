package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class i03 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final i03 f9033c = new i03();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f9034a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f9035b = new ArrayList();

    private i03() {
    }

    public static i03 a() {
        return f9033c;
    }

    public final Collection b() {
        return Collections.unmodifiableCollection(this.f9035b);
    }

    public final Collection c() {
        return Collections.unmodifiableCollection(this.f9034a);
    }

    public final void d(uz2 uz2Var) {
        this.f9034a.add(uz2Var);
    }

    public final void e(uz2 uz2Var) {
        ArrayList arrayList = this.f9034a;
        boolean zG = g();
        arrayList.remove(uz2Var);
        this.f9035b.remove(uz2Var);
        if (!zG || g()) {
            return;
        }
        q03.c().g();
    }

    public final void f(uz2 uz2Var) {
        ArrayList arrayList = this.f9035b;
        boolean zG = g();
        arrayList.add(uz2Var);
        if (zG) {
            return;
        }
        q03.c().f();
    }

    public final boolean g() {
        return this.f9035b.size() > 0;
    }
}
