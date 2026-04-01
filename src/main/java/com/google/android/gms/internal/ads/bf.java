package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class bf extends z04 implements l24 {
    private static final bf zzb;
    private int zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private f14 zzh = z04.u();
    private long zzi;

    static {
        bf bfVar = new bf();
        zzb = bfVar;
        z04.E(bf.class, bfVar);
    }

    private bf() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i9 == 3) {
            return new bf();
        }
        be beVar = null;
        if (i9 == 4) {
            return new af(beVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
