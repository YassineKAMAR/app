package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class pr3 extends ko3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final kp3 f13118d = kp3.b(new ip3() { // from class: com.google.android.gms.internal.ads.lr3
        @Override // com.google.android.gms.internal.ads.ip3
        public final Object a(nh3 nh3Var) {
            return new ms3((kr3) nh3Var);
        }
    }, kr3.class, dr3.class);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final kp3 f13119e = kp3.b(new ip3() { // from class: com.google.android.gms.internal.ads.mr3
        @Override // com.google.android.gms.internal.ads.ip3
        public final Object a(nh3 nh3Var) {
            return sy3.c((kr3) nh3Var);
        }
    }, kr3.class, ei3.class);

    public pr3() {
        super(kv3.class, new nr3(ei3.class));
    }

    public static void l(boolean z7) {
        qi3.f(new pr3(), true);
        int i8 = rs3.f14326h;
        rs3.c(yo3.b());
        vo3.a().e(f13118d);
        vo3.a().e(f13119e);
    }

    public static final void m(kv3 kv3Var) throws GeneralSecurityException {
        uy3.b(kv3Var.M(), 0);
        if (kv3Var.S().n() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        n(kv3Var.R());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(qv3 qv3Var) throws GeneralSecurityException {
        if (qv3Var.M() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        hv3 hv3Var = hv3.UNKNOWN_HASH;
        int iOrdinal = qv3Var.N().ordinal();
        if (iOrdinal == 1) {
            if (qv3Var.M() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (iOrdinal == 2) {
            if (qv3Var.M() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (iOrdinal == 3) {
            if (qv3Var.M() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (iOrdinal == 4) {
            if (qv3Var.M() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (iOrdinal != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (qv3Var.M() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final jo3 a() {
        return new or3(this, nv3.class);
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final uv3 b() {
        return uv3.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final /* synthetic */ k24 c(rz3 rz3Var) {
        return kv3.Q(rz3Var, m04.a());
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final /* bridge */ /* synthetic */ void e(k24 k24Var) throws GeneralSecurityException {
        m((kv3) k24Var);
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final int f() {
        return 2;
    }
}
