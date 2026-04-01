package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class u84 implements j84 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final j84 f15565c = k84.a(Collections.emptySet());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f15566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f15567b;

    /* synthetic */ u84(List list, List list2, s84 s84Var) {
        this.f15566a = list;
        this.f15567b = list2;
    }

    public static t84 a(int i8, int i9) {
        return new t84(i8, i9, null);
    }

    @Override // com.google.android.gms.internal.ads.w84
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Set k() {
        int size = this.f15566a.size();
        ArrayList arrayList = new ArrayList(this.f15567b.size());
        int size2 = this.f15567b.size();
        for (int i8 = 0; i8 < size2; i8++) {
            Collection collection = (Collection) ((w84) this.f15567b.get(i8)).k();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSetA = f84.a(size);
        int size3 = this.f15566a.size();
        for (int i9 = 0; i9 < size3; i9++) {
            Object objK = ((w84) this.f15566a.get(i9)).k();
            objK.getClass();
            hashSetA.add(objK);
        }
        int size4 = arrayList.size();
        for (int i10 = 0; i10 < size4; i10++) {
            for (Object obj : (Collection) arrayList.get(i10)) {
                obj.getClass();
                hashSetA.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSetA);
    }
}
