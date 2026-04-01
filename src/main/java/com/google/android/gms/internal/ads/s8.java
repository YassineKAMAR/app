package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class s8 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte[] f14554f = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f14555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f14556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f14559e = new byte[128];

    public s8(int i8) {
    }

    public final void a(byte[] bArr, int i8, int i9) {
        if (this.f14555a) {
            int i10 = i9 - i8;
            byte[] bArr2 = this.f14559e;
            int length = bArr2.length;
            int i11 = this.f14557c + i10;
            if (length < i11) {
                this.f14559e = Arrays.copyOf(bArr2, i11 + i11);
            }
            System.arraycopy(bArr, i8, this.f14559e, this.f14557c, i10);
            this.f14557c += i10;
        }
    }

    public final void b() {
        this.f14555a = false;
        this.f14557c = 0;
        this.f14556b = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(int r9, int r10) {
        /*
            r8 = this;
            int r0 = r8.f14556b
            r1 = 0
            r2 = 3
            r3 = 1
            if (r0 == 0) goto L45
            r4 = 181(0xb5, float:2.54E-43)
            r5 = 2
            java.lang.String r6 = "Unexpected start code value"
            java.lang.String r7 = "H263Reader"
            if (r0 == r3) goto L39
            if (r0 == r5) goto L31
            if (r0 == r2) goto L22
            r0 = 179(0xb3, float:2.51E-43)
            if (r9 == r0) goto L1a
            if (r9 != r4) goto L4d
        L1a:
            int r9 = r8.f14557c
            int r9 = r9 - r10
            r8.f14557c = r9
            r8.f14555a = r1
            return r3
        L22:
            r9 = r9 & 240(0xf0, float:3.36E-43)
            r10 = 32
            if (r9 == r10) goto L29
            goto L3b
        L29:
            int r9 = r8.f14557c
            r8.f14558d = r9
            r9 = 4
            r8.f14556b = r9
            goto L4d
        L31:
            r10 = 31
            if (r9 <= r10) goto L36
            goto L3b
        L36:
            r8.f14556b = r2
            goto L4d
        L39:
            if (r9 == r4) goto L42
        L3b:
            com.google.android.gms.internal.ads.pf2.f(r7, r6)
            r8.b()
            goto L4d
        L42:
            r8.f14556b = r5
            goto L4d
        L45:
            r10 = 176(0xb0, float:2.47E-43)
            if (r9 != r10) goto L4d
            r8.f14556b = r3
            r8.f14555a = r3
        L4d:
            byte[] r9 = com.google.android.gms.internal.ads.s8.f14554f
            r8.a(r9, r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.s8.c(int, int):boolean");
    }
}
