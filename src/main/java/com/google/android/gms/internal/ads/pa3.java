package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class pa3 extends ca3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f12807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ sa3 f12809c;

    pa3(sa3 sa3Var, int i8) {
        this.f12809c = sa3Var;
        Object[] objArr = sa3Var.f14584c;
        objArr.getClass();
        this.f12807a = objArr[i8];
        this.f12808b = i8;
    }

    private final void a() {
        int i8 = this.f12808b;
        if (i8 != -1 && i8 < this.f12809c.size()) {
            Object obj = this.f12807a;
            sa3 sa3Var = this.f12809c;
            int i9 = this.f12808b;
            Object[] objArr = sa3Var.f14584c;
            objArr.getClass();
            if (g83.a(obj, objArr[i9])) {
                return;
            }
        }
        this.f12808b = this.f12809c.r(this.f12807a);
    }

    @Override // com.google.android.gms.internal.ads.ca3, java.util.Map.Entry
    public final Object getKey() {
        return this.f12807a;
    }

    @Override // com.google.android.gms.internal.ads.ca3, java.util.Map.Entry
    public final Object getValue() {
        Map mapK = this.f12809c.k();
        if (mapK != null) {
            return mapK.get(this.f12807a);
        }
        a();
        int i8 = this.f12808b;
        if (i8 == -1) {
            return null;
        }
        Object[] objArr = this.f12809c.f14585d;
        objArr.getClass();
        return objArr[i8];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapK = this.f12809c.k();
        if (mapK != null) {
            return mapK.put(this.f12807a, obj);
        }
        a();
        int i8 = this.f12808b;
        if (i8 == -1) {
            this.f12809c.put(this.f12807a, obj);
            return null;
        }
        Object[] objArr = this.f12809c.f14585d;
        objArr.getClass();
        Object obj2 = objArr[i8];
        objArr[i8] = obj;
        return obj2;
    }
}
