package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class u24 implements h24 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k24 f15456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f15458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f15459d;

    u24(k24 k24Var, String str, Object[] objArr) {
        this.f15456a = k24Var;
        this.f15457b = str;
        this.f15458c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f15459d = cCharAt;
            return;
        }
        int i8 = cCharAt & 8191;
        int i9 = 1;
        int i10 = 13;
        while (true) {
            int i11 = i9 + 1;
            char cCharAt2 = str.charAt(i9);
            if (cCharAt2 < 55296) {
                this.f15459d = i8 | (cCharAt2 << i10);
                return;
            } else {
                i8 |= (cCharAt2 & 8191) << i10;
                i10 += 13;
                i9 = i11;
            }
        }
    }

    final String a() {
        return this.f15457b;
    }

    final Object[] b() {
        return this.f15458c;
    }

    @Override // com.google.android.gms.internal.ads.h24
    public final k24 j() {
        return this.f15456a;
    }

    @Override // com.google.android.gms.internal.ads.h24
    public final boolean k() {
        return (this.f15459d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.ads.h24
    public final int l() {
        int i8 = this.f15459d;
        if ((i8 & 1) != 0) {
            return 1;
        }
        return (i8 & 4) == 4 ? 3 : 2;
    }
}
