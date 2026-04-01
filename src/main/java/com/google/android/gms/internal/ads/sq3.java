package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class sq3 extends ko3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final kp3 f14792d = kp3.b(new ip3() { // from class: com.google.android.gms.internal.ads.nq3
        @Override // com.google.android.gms.internal.ads.ip3
        public final Object a(nh3 nh3Var) {
            return new ls3((mq3) nh3Var);
        }
    }, mq3.class, dr3.class);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final kp3 f14793e = kp3.b(new ip3() { // from class: com.google.android.gms.internal.ads.oq3
        @Override // com.google.android.gms.internal.ads.ip3
        public final Object a(nh3 nh3Var) {
            return sy3.b((mq3) nh3Var);
        }
    }, mq3.class, ei3.class);

    sq3() {
        super(ht3.class, new pq3(ei3.class));
    }

    public static void m(boolean z7) {
        qi3.f(new sq3(), true);
        int i8 = cr3.f6462f;
        cr3.a(yo3.b());
        vo3.a().e(f14792d);
        vo3.a().e(f14793e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(nt3 nt3Var) throws GeneralSecurityException {
        if (nt3Var.M() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (nt3Var.M() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(int i8) throws GeneralSecurityException {
        if (i8 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final jo3 a() {
        return new qq3(this, kt3.class);
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final uv3 b() {
        return uv3.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final /* synthetic */ k24 c(rz3 rz3Var) {
        return ht3.P(rz3Var, m04.a());
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final /* bridge */ /* synthetic */ void e(k24 k24Var) throws GeneralSecurityException {
        ht3 ht3Var = (ht3) k24Var;
        uy3.b(ht3Var.M(), 0);
        o(ht3Var.R().n());
        n(ht3Var.Q());
    }
}
