package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class au3 extends z04 implements l24 {
    private static final au3 zzb;
    private int zzd;
    private du3 zze;
    private int zzf;

    static {
        au3 au3Var = new au3();
        zzb = au3Var;
        z04.E(au3.class, au3Var);
    }

    private au3() {
    }

    public static zt3 N() {
        return (zt3) zzb.l();
    }

    public static au3 P() {
        return zzb;
    }

    public static au3 Q(rz3 rz3Var, m04 m04Var) {
        return (au3) z04.r(zzb, rz3Var, m04Var);
    }

    static /* synthetic */ void S(au3 au3Var, du3 du3Var) {
        du3Var.getClass();
        au3Var.zze = du3Var;
        au3Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new au3();
        }
        yt3 yt3Var = null;
        if (i9 == 4) {
            return new zt3(yt3Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zzf;
    }

    public final du3 R() {
        du3 du3Var = this.zze;
        return du3Var == null ? du3.P() : du3Var;
    }
}
