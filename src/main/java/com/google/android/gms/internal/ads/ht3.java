package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ht3 extends z04 implements l24 {
    private static final ht3 zzb;
    private int zzd;
    private int zze;
    private rz3 zzf = rz3.f14393b;
    private nt3 zzg;

    static {
        ht3 ht3Var = new ht3();
        zzb = ht3Var;
        z04.E(ht3.class, ht3Var);
    }

    private ht3() {
    }

    public static gt3 N() {
        return (gt3) zzb.l();
    }

    public static ht3 P(rz3 rz3Var, m04 m04Var) {
        return (ht3) z04.r(zzb, rz3Var, m04Var);
    }

    static /* synthetic */ void U(ht3 ht3Var, nt3 nt3Var) {
        nt3Var.getClass();
        ht3Var.zzg = nt3Var;
        ht3Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new ht3();
        }
        ft3 ft3Var = null;
        if (i9 == 4) {
            return new gt3(ft3Var);
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
        nt3 nt3Var = this.zzg;
        return nt3Var == null ? nt3.P() : nt3Var;
    }

    public final rz3 R() {
        return this.zzf;
    }
}
