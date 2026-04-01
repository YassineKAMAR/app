package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class vf0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f16130h = Integer.toString(0, 36);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f16131i = Integer.toString(1, 36);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f16132j = Integer.toString(2, 36);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f16133k = Integer.toString(3, 36);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f16134l = Integer.toString(4, 36);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f16135m = Integer.toString(5, 36);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f16136n = Integer.toString(6, 36);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f16137o = Integer.toString(7, 36);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final cf4 f16138p = new cf4() { // from class: com.google.android.gms.internal.ads.bq
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri[] f16141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f16142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f16143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f16144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f16145g;

    public vf0(long j8) {
        this(0L, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
    }

    private vf0(long j8, int i8, int i9, int[] iArr, Uri[] uriArr, long[] jArr, long j9, boolean z7) {
        uu1.d(iArr.length == uriArr.length);
        this.f16139a = 0L;
        this.f16140b = i8;
        this.f16142d = iArr;
        this.f16141c = uriArr;
        this.f16143e = jArr;
        this.f16144f = 0L;
        this.f16145g = false;
    }

    public final int a(int i8) {
        int i9;
        int i10 = i8 + 1;
        while (true) {
            int[] iArr = this.f16142d;
            if (i10 >= iArr.length || (i9 = iArr[i10]) == 0 || i9 == 1) {
                break;
            }
            i10++;
        }
        return i10;
    }

    public final vf0 b(int i8) {
        int[] iArr = this.f16142d;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = this.f16143e;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        return new vf0(0L, 0, -1, iArrCopyOf, (Uri[]) Arrays.copyOf(this.f16141c, 0), jArrCopyOf, 0L, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vf0.class == obj.getClass()) {
            vf0 vf0Var = (vf0) obj;
            if (this.f16140b == vf0Var.f16140b && Arrays.equals(this.f16141c, vf0Var.f16141c) && Arrays.equals(this.f16142d, vf0Var.f16142d) && Arrays.equals(this.f16143e, vf0Var.f16143e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f16140b * 31) - 1) * 961) + Arrays.hashCode(this.f16141c)) * 31) + Arrays.hashCode(this.f16142d)) * 31) + Arrays.hashCode(this.f16143e)) * 961;
    }
}
