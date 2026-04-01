package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class qt3 extends z04 implements l24 {
    private static final qt3 zzb;
    private int zzd;
    private int zze;
    private xt3 zzf;
    private kv3 zzg;

    static {
        qt3 qt3Var = new qt3();
        zzb = qt3Var;
        z04.E(qt3.class, qt3Var);
    }

    private qt3() {
    }

    public static pt3 N() {
        return (pt3) zzb.l();
    }

    public static qt3 P(rz3 rz3Var, m04 m04Var) {
        return (qt3) z04.r(zzb, rz3Var, m04Var);
    }

    static /* synthetic */ void T(qt3 qt3Var, xt3 xt3Var) {
        xt3Var.getClass();
        qt3Var.zzf = xt3Var;
        qt3Var.zzd |= 1;
    }

    static /* synthetic */ void U(qt3 qt3Var, kv3 kv3Var) {
        kv3Var.getClass();
        qt3Var.zzg = kv3Var;
        qt3Var.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new qt3();
        }
        ot3 ot3Var = null;
        if (i9 == 4) {
            return new pt3(ot3Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zze;
    }

    public final xt3 Q() {
        xt3 xt3Var = this.zzf;
        return xt3Var == null ? xt3.P() : xt3Var;
    }

    public final kv3 R() {
        kv3 kv3Var = this.zzg;
        return kv3Var == null ? kv3.P() : kv3Var;
    }
}
