package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class bb implements ka {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ma f18593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f18595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f18596d;

    bb(ma maVar, String str, Object[] objArr) {
        this.f18593a = maVar;
        this.f18594b = str;
        this.f18595c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f18596d = cCharAt;
            return;
        }
        int i8 = cCharAt & 8191;
        int i9 = 13;
        int i10 = 1;
        while (true) {
            int i11 = i10 + 1;
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < 55296) {
                this.f18596d = i8 | (cCharAt2 << i9);
                return;
            } else {
                i8 |= (cCharAt2 & 8191) << i9;
                i9 += 13;
                i10 = i11;
            }
        }
    }

    final String a() {
        return this.f18594b;
    }

    final Object[] b() {
        return this.f18595c;
    }

    @Override // com.google.android.gms.internal.measurement.ka
    public final ma j() {
        return this.f18593a;
    }

    @Override // com.google.android.gms.internal.measurement.ka
    public final ab k() {
        int i8 = this.f18596d;
        return (i8 & 1) != 0 ? ab.PROTO2 : (i8 & 4) == 4 ? ab.EDITIONS : ab.PROTO3;
    }

    @Override // com.google.android.gms.internal.measurement.ka
    public final boolean l() {
        return (this.f18596d & 2) == 2;
    }
}
