package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class rw3 extends z04 implements l24 {
    private static final rw3 zzb;
    private int zzd;
    private int zze;
    private uw3 zzf;

    static {
        rw3 rw3Var = new rw3();
        zzb = rw3Var;
        z04.E(rw3.class, rw3Var);
    }

    private rw3() {
    }

    public static qw3 N() {
        return (qw3) zzb.l();
    }

    public static rw3 P(rz3 rz3Var, m04 m04Var) {
        return (rw3) z04.r(zzb, rz3Var, m04Var);
    }

    static /* synthetic */ void S(rw3 rw3Var, uw3 uw3Var) {
        uw3Var.getClass();
        rw3Var.zzf = uw3Var;
        rw3Var.zzd |= 1;
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
            return new rw3();
        }
        pw3 pw3Var = null;
        if (i9 == 4) {
            return new qw3(pw3Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zze;
    }

    public final uw3 Q() {
        uw3 uw3Var = this.zzf;
        return uw3Var == null ? uw3.N() : uw3Var;
    }
}
