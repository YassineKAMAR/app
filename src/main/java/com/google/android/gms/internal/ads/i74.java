package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class i74 extends z04 implements l24 {
    private static final i74 zzb;
    private int zzd;
    private int zze;
    private int zzh;
    private String zzf = "";
    private f14 zzg = z04.u();
    private j14 zzi = z04.y();
    private rz3 zzj = rz3.f14393b;

    static {
        i74 i74Var = new i74();
        zzb = i74Var;
        z04.E(i74.class, i74Var);
    }

    private i74() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", g74.class, "zzj"});
        }
        if (i9 == 3) {
            return new i74();
        }
        w44 w44Var = null;
        if (i9 == 4) {
            return new h74(w44Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
