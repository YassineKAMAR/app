package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class le extends z04 implements l24 {
    private static final le zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = 1000;
    private int zzg = 1000;

    static {
        le leVar = new le();
        zzb = leVar;
        z04.E(le.class, leVar);
    }

    private le() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            e14 e14Var = ff.f7739a;
            return z04.B(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", e14Var, "zzg", e14Var});
        }
        if (i9 == 3) {
            return new le();
        }
        be beVar = null;
        if (i9 == 4) {
            return new ke(beVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
