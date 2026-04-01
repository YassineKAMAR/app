package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class qr extends z04 implements l24 {
    private static final qr zzb;
    private int zzd;
    private int zze = 1000;
    private gr zzf;
    private wq zzg;

    static {
        qr qrVar = new qr();
        zzb = qrVar;
        z04.E(qr.class, qrVar);
    }

    private qr() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", jp.f9734a, "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new qr();
        }
        co coVar = null;
        if (i9 == 4) {
            return new pr(coVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
