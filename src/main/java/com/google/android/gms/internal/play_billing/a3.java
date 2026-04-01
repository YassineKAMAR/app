package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
final class a3 implements n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r2 f19472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f19474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f19475d;

    a3(r2 r2Var, String str, Object[] objArr) {
        this.f19472a = r2Var;
        this.f19473b = str;
        this.f19474c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f19475d = cCharAt;
            return;
        }
        int i8 = cCharAt & 8191;
        int i9 = 1;
        int i10 = 13;
        while (true) {
            int i11 = i9 + 1;
            char cCharAt2 = str.charAt(i9);
            if (cCharAt2 < 55296) {
                this.f19475d = i8 | (cCharAt2 << i10);
                return;
            } else {
                i8 |= (cCharAt2 & 8191) << i10;
                i10 += 13;
                i9 = i11;
            }
        }
    }

    final String a() {
        return this.f19473b;
    }

    final Object[] b() {
        return this.f19474c;
    }

    @Override // com.google.android.gms.internal.play_billing.n2
    public final r2 j() {
        return this.f19472a;
    }

    @Override // com.google.android.gms.internal.play_billing.n2
    public final boolean k() {
        return (this.f19475d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.play_billing.n2
    public final int l() {
        int i8 = this.f19475d;
        if ((i8 & 1) != 0) {
            return 1;
        }
        return (i8 & 4) == 4 ? 3 : 2;
    }
}
