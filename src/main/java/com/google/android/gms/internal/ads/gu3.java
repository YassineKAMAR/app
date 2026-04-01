package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class gu3 extends z04 implements l24 {
    private static final gu3 zzb;
    private int zzd;
    private int zze;
    private mu3 zzf;
    private rz3 zzg = rz3.f14393b;

    static {
        gu3 gu3Var = new gu3();
        zzb = gu3Var;
        z04.E(gu3.class, gu3Var);
    }

    private gu3() {
    }

    public static fu3 N() {
        return (fu3) zzb.l();
    }

    public static gu3 P(rz3 rz3Var, m04 m04Var) {
        return (gu3) z04.r(zzb, rz3Var, m04Var);
    }

    static /* synthetic */ void T(gu3 gu3Var, mu3 mu3Var) {
        mu3Var.getClass();
        gu3Var.zzf = mu3Var;
        gu3Var.zzd |= 1;
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
            return new gu3();
        }
        eu3 eu3Var = null;
        if (i9 == 4) {
            return new fu3(eu3Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zze;
    }

    public final mu3 Q() {
        mu3 mu3Var = this.zzf;
        return mu3Var == null ? mu3.P() : mu3Var;
    }

    public final rz3 R() {
        return this.zzg;
    }
}
