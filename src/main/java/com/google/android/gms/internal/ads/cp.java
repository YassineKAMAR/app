package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class cp extends z04 implements l24 {
    private static final cp zzb;
    private int zzd;
    private int zze;
    private wq zzf;
    private wq zzg;
    private wq zzh;
    private j14 zzi = z04.y();
    private int zzj;

    static {
        cp cpVar = new cp();
        zzb = cpVar;
        z04.E(cp.class, cpVar);
    }

    private cp() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", wq.class, "zzj"});
        }
        if (i9 == 3) {
            return new cp();
        }
        co coVar = null;
        if (i9 == 4) {
            return new bp(coVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
