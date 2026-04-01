package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f15953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15955d;

    public v1(int i8, byte[] bArr, int i9, int i10) {
        this.f15952a = i8;
        this.f15953b = bArr;
        this.f15954c = i9;
        this.f15955d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v1.class == obj.getClass()) {
            v1 v1Var = (v1) obj;
            if (this.f15952a == v1Var.f15952a && this.f15954c == v1Var.f15954c && this.f15955d == v1Var.f15955d && Arrays.equals(this.f15953b, v1Var.f15953b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f15952a * 31) + Arrays.hashCode(this.f15953b)) * 31) + this.f15954c) * 31) + this.f15955d;
    }
}
