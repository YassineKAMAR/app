package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class s9 extends i7<String> implements r9, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final s9 f19201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    private static final r9 f19202d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Object> f19203b;

    static {
        s9 s9Var = new s9(false);
        f19201c = s9Var;
        f19202d = s9Var;
    }

    public s9(int i8) {
        this((ArrayList<Object>) new ArrayList(i8));
    }

    private s9(ArrayList<Object> arrayList) {
        this.f19203b = arrayList;
    }

    private s9(boolean z7) {
        super(false);
        this.f19203b = Collections.emptyList();
    }

    private static String e(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof o7 ? ((o7) obj).B() : a9.h((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        a();
        this.f19203b.add(i8, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.List
    public final boolean addAll(int i8, Collection<? extends String> collection) {
        a();
        if (collection instanceof r9) {
            collection = ((r9) collection).k();
        }
        boolean zAddAll = this.f19203b.addAll(i8, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.measurement.h9
    public final /* synthetic */ h9 b(int i8) {
        if (i8 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i8);
        arrayList.addAll(this.f19203b);
        return new s9((ArrayList<Object>) arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f19203b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.r9
    public final Object d(int i8) {
        return this.f19203b.get(i8);
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        Object obj = this.f19203b.get(i8);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof o7) {
            o7 o7Var = (o7) obj;
            String strB = o7Var.B();
            if (o7Var.C()) {
                this.f19203b.set(i8, strB);
            }
            return strB;
        }
        byte[] bArr = (byte[]) obj;
        String strH = a9.h(bArr);
        if (a9.i(bArr)) {
            this.f19203b.set(i8, strH);
        }
        return strH;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.r9
    public final List<?> k() {
        return Collections.unmodifiableList(this.f19203b);
    }

    @Override // com.google.android.gms.internal.measurement.i7, com.google.android.gms.internal.measurement.h9
    public final /* bridge */ /* synthetic */ boolean l() {
        return super.l();
    }

    @Override // com.google.android.gms.internal.measurement.r9
    public final r9 q() {
        return l() ? new ec(this) : this;
    }

    @Override // com.google.android.gms.internal.measurement.r9
    public final void r(o7 o7Var) {
        a();
        this.f19203b.add(o7Var);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i8) {
        a();
        Object objRemove = this.f19203b.remove(i8);
        ((AbstractList) this).modCount++;
        return e(objRemove);
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i8, Object obj) {
        a();
        return e(this.f19203b.set(i8, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19203b.size();
    }
}
