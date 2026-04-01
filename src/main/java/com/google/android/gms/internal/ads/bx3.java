package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class bx3 extends z04 implements l24 {
    private static final bx3 zzb;
    private int zzd;
    private String zze = "";
    private bw3 zzf;

    static {
        bx3 bx3Var = new bx3();
        zzb = bx3Var;
        z04.E(bx3.class, bx3Var);
    }

    private bx3() {
    }

    public static bx3 O() {
        return zzb;
    }

    public static bx3 P(rz3 rz3Var, m04 m04Var) {
        return (bx3) z04.r(zzb, rz3Var, m04Var);
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new bx3();
        }
        zw3 zw3Var = null;
        if (i9 == 4) {
            return new ax3(zw3Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final bw3 M() {
        bw3 bw3Var = this.zzf;
        return bw3Var == null ? bw3.O() : bw3Var;
    }

    public final String Q() {
        return this.zze;
    }

    public final boolean R() {
        return (this.zzd & 1) != 0;
    }
}
