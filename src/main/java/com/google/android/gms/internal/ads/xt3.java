package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class xt3 extends z04 implements l24 {
    private static final xt3 zzb;
    private int zzd;
    private int zze;
    private du3 zzf;
    private rz3 zzg = rz3.f14393b;

    static {
        xt3 xt3Var = new xt3();
        zzb = xt3Var;
        z04.E(xt3.class, xt3Var);
    }

    private xt3() {
    }

    public static wt3 N() {
        return (wt3) zzb.l();
    }

    public static xt3 P() {
        return zzb;
    }

    public static xt3 Q(rz3 rz3Var, m04 m04Var) {
        return (xt3) z04.r(zzb, rz3Var, m04Var);
    }

    static /* synthetic */ void U(xt3 xt3Var, du3 du3Var) {
        du3Var.getClass();
        xt3Var.zzf = du3Var;
        xt3Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new xt3();
        }
        vt3 vt3Var = null;
        if (i9 == 4) {
            return new wt3(vt3Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zze;
    }

    public final du3 R() {
        du3 du3Var = this.zzf;
        return du3Var == null ? du3.P() : du3Var;
    }

    public final rz3 S() {
        return this.zzg;
    }
}
