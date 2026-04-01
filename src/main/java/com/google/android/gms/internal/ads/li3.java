package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class li3 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f10737a;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        li3 li3Var = (li3) obj;
        int length = this.f10737a.length;
        int length2 = li3Var.f10737a.length;
        if (length != length2) {
            return length - length2;
        }
        int i8 = 0;
        while (true) {
            byte[] bArr = this.f10737a;
            if (i8 >= bArr.length) {
                return 0;
            }
            byte b8 = bArr[i8];
            byte b9 = li3Var.f10737a[i8];
            if (b8 != b9) {
                return b8 - b9;
            }
            i8++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof li3) {
            return Arrays.equals(this.f10737a, ((li3) obj).f10737a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10737a);
    }

    public final String toString() {
        return ny3.a(this.f10737a);
    }
}
