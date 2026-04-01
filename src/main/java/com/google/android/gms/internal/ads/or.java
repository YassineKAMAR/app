package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class or extends z04 implements l24 {
    private static final or zzb;
    private int zzd;
    private int zze = 1000;
    private gr zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private long zzj;

    static {
        or orVar = new or();
        zzb = orVar;
        z04.E(or.class, orVar);
    }

    private or() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzd", "zze", jp.f9734a, "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i9 == 3) {
            return new or();
        }
        co coVar = null;
        if (i9 == 4) {
            return new nr(coVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
