package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class x1 extends y implements RandomAccess, y1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final x1 f19734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final y1 f19735d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f19736b;

    static {
        x1 x1Var = new x1(false);
        f19734c = x1Var;
        f19735d = x1Var;
    }

    public x1() {
        this(10);
    }

    public x1(int i8) {
        ArrayList arrayList = new ArrayList(i8);
        super(true);
        this.f19736b = arrayList;
    }

    private x1(ArrayList arrayList) {
        super(true);
        this.f19736b = arrayList;
    }

    private x1(boolean z7) {
        super(false);
        this.f19736b = Collections.emptyList();
    }

    private static String g(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof n0 ? ((n0) obj).z(s1.f19669b) : s1.d((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i8, Object obj) {
        a();
        this.f19736b.add(i8, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.y, java.util.AbstractList, java.util.List
    public final boolean addAll(int i8, Collection collection) {
        a();
        if (collection instanceof y1) {
            collection = ((y1) collection).o();
        }
        boolean zAddAll = this.f19736b.addAll(i8, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.play_billing.y, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.play_billing.y1
    public final Object c(int i8) {
        return this.f19736b.get(i8);
    }

    @Override // com.google.android.gms.internal.play_billing.y, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f19736b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final String get(int i8) {
        Object obj = this.f19736b.get(i8);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof n0) {
            n0 n0Var = (n0) obj;
            String strZ = n0Var.z(s1.f19669b);
            if (n0Var.v()) {
                this.f19736b.set(i8, strZ);
            }
            return strZ;
        }
        byte[] bArr = (byte[]) obj;
        String strD = s1.d(bArr);
        if (i4.d(bArr)) {
            this.f19736b.set(i8, strD);
        }
        return strD;
    }

    @Override // com.google.android.gms.internal.play_billing.r1
    public final /* bridge */ /* synthetic */ r1 f(int i8) {
        if (i8 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i8);
        arrayList.addAll(this.f19736b);
        return new x1(arrayList);
    }

    @Override // com.google.android.gms.internal.play_billing.y1
    public final y1 m() {
        return l() ? new y3(this) : this;
    }

    @Override // com.google.android.gms.internal.play_billing.y1
    public final List o() {
        return Collections.unmodifiableList(this.f19736b);
    }

    @Override // com.google.android.gms.internal.play_billing.y, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        a();
        Object objRemove = this.f19736b.remove(i8);
        ((AbstractList) this).modCount++;
        return g(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        a();
        return g(this.f19736b.set(i8, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19736b.size();
    }
}
