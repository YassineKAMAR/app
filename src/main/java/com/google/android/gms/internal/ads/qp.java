package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class qp extends z04 implements l24 {
    private static final qp zzb;
    private int zzd;
    private int zze;
    private f14 zzf = z04.u();

    static {
        qp qpVar = new qp();
        zzb = qpVar;
        z04.E(qp.class, qpVar);
    }

    private qp() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u0016", new Object[]{"zzd", "zze", jp.f9734a, "zzf"});
        }
        if (i9 == 3) {
            return new qp();
        }
        co coVar = null;
        if (i9 == 4) {
            return new pp(coVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
