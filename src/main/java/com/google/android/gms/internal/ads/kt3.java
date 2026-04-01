package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class kt3 extends z04 implements l24 {
    private static final kt3 zzb;
    private int zzd;
    private int zze;
    private nt3 zzf;

    static {
        kt3 kt3Var = new kt3();
        zzb = kt3Var;
        z04.E(kt3.class, kt3Var);
    }

    private kt3() {
    }

    public static jt3 N() {
        return (jt3) zzb.l();
    }

    public static kt3 P(rz3 rz3Var, m04 m04Var) {
        return (kt3) z04.r(zzb, rz3Var, m04Var);
    }

    static /* synthetic */ void S(kt3 kt3Var, nt3 nt3Var) {
        nt3Var.getClass();
        kt3Var.zzf = nt3Var;
        kt3Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new kt3();
        }
        it3 it3Var = null;
        if (i9 == 4) {
            return new jt3(it3Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zze;
    }

    public final nt3 Q() {
        nt3 nt3Var = this.zzf;
        return nt3Var == null ? nt3.P() : nt3Var;
    }
}
