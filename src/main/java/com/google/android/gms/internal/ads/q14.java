package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class q14 extends bz3 implements RandomAccess, r14 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final q14 f13247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final r14 f13248d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f13249b;

    static {
        q14 q14Var = new q14(false);
        f13247c = q14Var;
        f13248d = q14Var;
    }

    public q14() {
        this(10);
    }

    public q14(int i8) {
        ArrayList arrayList = new ArrayList(i8);
        super(true);
        this.f13249b = arrayList;
    }

    private q14(ArrayList arrayList) {
        super(true);
        this.f13249b = arrayList;
    }

    private q14(boolean z7) {
        super(false);
        this.f13249b = Collections.emptyList();
    }

    private static String g(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof rz3 ? ((rz3) obj).N(k14.f9885b) : k14.d((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i8, Object obj) {
        a();
        this.f13249b.add(i8, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.bz3, java.util.AbstractList, java.util.List
    public final boolean addAll(int i8, Collection collection) {
        a();
        if (collection instanceof r14) {
            collection = ((r14) collection).o();
        }
        boolean zAddAll = this.f13249b.addAll(i8, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.ads.bz3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.ads.r14
    public final Object c(int i8) {
        return this.f13249b.get(i8);
    }

    @Override // com.google.android.gms.internal.ads.bz3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f13249b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final String get(int i8) {
        Object obj = this.f13249b.get(i8);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof rz3) {
            rz3 rz3Var = (rz3) obj;
            String strN = rz3Var.N(k14.f9885b);
            if (rz3Var.D()) {
                this.f13249b.set(i8, strN);
            }
            return strN;
        }
        byte[] bArr = (byte[]) obj;
        String strD = k14.d(bArr);
        if (l44.i(bArr)) {
            this.f13249b.set(i8, strD);
        }
        return strD;
    }

    @Override // com.google.android.gms.internal.ads.j14
    public final /* bridge */ /* synthetic */ j14 f(int i8) {
        if (i8 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i8);
        arrayList.addAll(this.f13249b);
        return new q14(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.r14
    public final r14 m() {
        return l() ? new a44(this) : this;
    }

    @Override // com.google.android.gms.internal.ads.r14
    public final List o() {
        return Collections.unmodifiableList(this.f13249b);
    }

    @Override // com.google.android.gms.internal.ads.bz3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        a();
        Object objRemove = this.f13249b.remove(i8);
        ((AbstractList) this).modCount++;
        return g(objRemove);
    }

    @Override // com.google.android.gms.internal.ads.r14
    public final void s(rz3 rz3Var) {
        a();
        this.f13249b.add(rz3Var);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        a();
        return g(this.f13249b.set(i8, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13249b.size();
    }
}
