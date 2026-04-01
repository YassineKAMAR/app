package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class se extends z04 implements l24 {
    private static final se zzb;
    private int zzd;
    private int zze;
    private long zzf = -1;

    static {
        se seVar = new se();
        zzb = seVar;
        z04.E(se.class, seVar);
    }

    private se() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", he.f8732a, "zzf"});
        }
        if (i9 == 3) {
            return new se();
        }
        be beVar = null;
        if (i9 == 4) {
            return new re(beVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
