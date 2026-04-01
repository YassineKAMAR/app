package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class cs3 implements ei3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ni3 f6469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xs3 f6470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final xs3 f6471c;

    /* synthetic */ cs3(ni3 ni3Var, bs3 bs3Var) {
        xs3 xs3VarA;
        this.f6469a = ni3Var;
        if (ni3Var.f()) {
            ys3 ys3VarB = uo3.a().b();
            dt3 dt3VarA = ro3.a(ni3Var);
            this.f6470b = ys3VarB.a(dt3VarA, "mac", "compute");
            xs3VarA = ys3VarB.a(dt3VarA, "mac", "verify");
        } else {
            xs3VarA = ro3.f14255a;
            this.f6470b = xs3VarA;
        }
        this.f6471c = xs3VarA;
    }

    @Override // com.google.android.gms.internal.ads.ei3
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= 5) {
            throw new GeneralSecurityException("tag too short");
        }
        for (ii3 ii3Var : this.f6469a.e(Arrays.copyOf(bArr, 5))) {
            try {
                ((ei3) ii3Var.d()).a(bArr, bArr2);
                ii3Var.a();
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        for (ii3 ii3Var2 : this.f6469a.e(lh3.f10729a)) {
            try {
                ((ei3) ii3Var2.d()).a(bArr, bArr2);
                ii3Var2.a();
                return;
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
