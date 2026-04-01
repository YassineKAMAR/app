package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class sr extends z04 implements l24 {
    private static final sr zzb;
    private int zzd;
    private int zze = 1000;
    private gr zzf;

    static {
        sr srVar = new sr();
        zzb = srVar;
        z04.E(sr.class, srVar);
    }

    private sr() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", jp.f9734a, "zzf"});
        }
        if (i9 == 3) {
            return new sr();
        }
        co coVar = null;
        if (i9 == 4) {
            return new rr(coVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
