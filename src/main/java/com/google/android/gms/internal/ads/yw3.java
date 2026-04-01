package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class yw3 extends z04 implements l24 {
    private static final yw3 zzb;
    private int zzd;
    private int zze;
    private bx3 zzf;

    static {
        yw3 yw3Var = new yw3();
        zzb = yw3Var;
        z04.E(yw3.class, yw3Var);
    }

    private yw3() {
    }

    public static ww3 N() {
        return (ww3) zzb.l();
    }

    public static yw3 P(rz3 rz3Var, m04 m04Var) {
        return (yw3) z04.r(zzb, rz3Var, m04Var);
    }

    static /* synthetic */ void S(yw3 yw3Var, bx3 bx3Var) {
        bx3Var.getClass();
        yw3Var.zzf = bx3Var;
        yw3Var.zzd |= 1;
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
            return new yw3();
        }
        vw3 vw3Var = null;
        if (i9 == 4) {
            return new ww3(vw3Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zze;
    }

    public final bx3 Q() {
        bx3 bx3Var = this.zzf;
        return bx3Var == null ? bx3.O() : bx3Var;
    }
}
