package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class sg4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final sg4 f14656c = new sg4(new int[]{2}, 10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final jb3 f14657d = jb3.C(2, 5, 6);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final mb3 f14658e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f14659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f14660b;

    static {
        lb3 lb3Var = new lb3();
        lb3Var.a(5, 6);
        lb3Var.a(17, 6);
        lb3Var.a(7, 6);
        lb3Var.a(30, 10);
        lb3Var.a(18, 6);
        lb3Var.a(6, 8);
        lb3Var.a(8, 8);
        lb3Var.a(14, 8);
        f14658e = lb3Var.c();
    }

    public sg4(int[] iArr, int i8) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, 1);
        this.f14659a = iArrCopyOf;
        Arrays.sort(iArrCopyOf);
        this.f14660b = 10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038 A[PHI: r0
  0x0038: PHI (r0v3 int) = (r0v2 int), (r0v6 int) binds: [B:11:0x002b, B:14:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair a(com.google.android.gms.internal.ads.nb r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.f11793l
            r0.getClass()
            java.lang.String r1 = r10.f11790i
            int r0 = com.google.android.gms.internal.ads.xg0.a(r0, r1)
            com.google.android.gms.internal.ads.mb3 r1 = com.google.android.gms.internal.ads.sg4.f14658e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r2 = r1.containsKey(r2)
            r3 = 0
            if (r2 != 0) goto L19
            return r3
        L19:
            r2 = 7
            r4 = 6
            r5 = 8
            r6 = 18
            if (r0 != r6) goto L2b
            boolean r0 = r9.c(r6)
            if (r0 != 0) goto L29
            r0 = 6
            goto L43
        L29:
            r0 = 18
        L2b:
            if (r0 != r5) goto L38
            boolean r0 = r9.c(r5)
            if (r0 == 0) goto L36
            r0 = 8
            goto L38
        L36:
            r0 = 7
            goto L43
        L38:
            r7 = 30
            if (r0 != r7) goto L43
            boolean r7 = r9.c(r7)
            if (r7 != 0) goto L43
            goto L36
        L43:
            boolean r7 = r9.c(r0)
            if (r7 != 0) goto L4a
            return r3
        L4a:
            int r7 = r10.f11806y
            r8 = -1
            if (r7 == r8) goto L64
            if (r0 != r6) goto L52
            goto L64
        L52:
            java.lang.String r10 = r10.f11793l
            java.lang.String r1 = "audio/vnd.dts.uhd;profile=p2"
            boolean r10 = r10.equals(r1)
            r1 = 10
            if (r10 == 0) goto L61
            if (r7 <= r1) goto L8c
            return r3
        L61:
            if (r7 <= r1) goto L8c
            return r3
        L64:
            int r10 = r10.f11807z
            if (r10 != r8) goto L6b
            r10 = 48000(0xbb80, float:6.7262E-41)
        L6b:
            int r6 = com.google.android.gms.internal.ads.nz2.f12300a
            r7 = 29
            if (r6 < r7) goto L76
            int r7 = com.google.android.gms.internal.ads.rg4.a(r0, r10)
            goto L8c
        L76:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r10 = r1.getOrDefault(r10, r6)
            java.lang.Integer r10 = (java.lang.Integer) r10
            r10.getClass()
            int r7 = r10.intValue()
        L8c:
            int r10 = com.google.android.gms.internal.ads.nz2.f12300a
            r1 = 28
            if (r10 > r1) goto La1
            if (r7 != r2) goto L97
            r4 = 8
            goto La2
        L97:
            r1 = 3
            if (r7 == r1) goto La2
            r1 = 4
            if (r7 == r1) goto La2
            r1 = 5
            if (r7 != r1) goto La1
            goto La2
        La1:
            r4 = r7
        La2:
            r1 = 26
            if (r10 > r1) goto Lb4
            java.lang.String r10 = com.google.android.gms.internal.ads.nz2.f12301b
            java.lang.String r1 = "fugu"
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto Lb4
            r10 = 1
            if (r4 != r10) goto Lb4
            r4 = 2
        Lb4:
            int r10 = com.google.android.gms.internal.ads.nz2.s(r4)
            if (r10 != 0) goto Lbb
            return r3
        Lbb:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            android.util.Pair r10 = android.util.Pair.create(r0, r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sg4.a(com.google.android.gms.internal.ads.nb):android.util.Pair");
    }

    public final boolean c(int i8) {
        return Arrays.binarySearch(this.f14659a, i8) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sg4) && Arrays.equals(this.f14659a, ((sg4) obj).f14659a);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f14659a) * 31) + 10;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=10, supportedEncodings=" + Arrays.toString(this.f14659a) + "]";
    }
}
