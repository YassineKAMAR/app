package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object[] f19569a = new Object[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f19570b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    h f19571c;

    public final i a(Object obj, Object obj2) {
        int i8 = this.f19570b + 1;
        Object[] objArr = this.f19569a;
        int length = objArr.length;
        int i9 = i8 + i8;
        if (i9 > length) {
            int i10 = length + (length >> 1) + 1;
            if (i10 < i9) {
                int iHighestOneBit = Integer.highestOneBit(i9 - 1);
                i10 = iHighestOneBit + iHighestOneBit;
            }
            if (i10 < 0) {
                i10 = Integer.MAX_VALUE;
            }
            this.f19569a = Arrays.copyOf(objArr, i10);
        }
        b.a(obj, obj2);
        Object[] objArr2 = this.f19569a;
        int i11 = this.f19570b;
        int i12 = i11 + i11;
        objArr2[i12] = obj;
        objArr2[i12 + 1] = obj2;
        this.f19570b = i11 + 1;
        return this;
    }

    public final j b() {
        h hVar = this.f19571c;
        if (hVar != null) {
            throw hVar.a();
        }
        r rVarG = r.g(this.f19570b, this.f19569a, this);
        h hVar2 = this.f19571c;
        if (hVar2 == null) {
            return rVarG;
        }
        throw hVar2.a();
    }
}
