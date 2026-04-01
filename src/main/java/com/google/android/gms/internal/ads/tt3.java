package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class tt3 extends z04 implements l24 {
    private static final tt3 zzb;
    private int zzd;
    private au3 zze;
    private nv3 zzf;

    static {
        tt3 tt3Var = new tt3();
        zzb = tt3Var;
        z04.E(tt3.class, tt3Var);
    }

    private tt3() {
    }

    public static st3 M() {
        return (st3) zzb.l();
    }

    public static tt3 O(rz3 rz3Var, m04 m04Var) {
        return (tt3) z04.r(zzb, rz3Var, m04Var);
    }

    static /* synthetic */ void R(tt3 tt3Var, au3 au3Var) {
        au3Var.getClass();
        tt3Var.zze = au3Var;
        tt3Var.zzd |= 1;
    }

    static /* synthetic */ void S(tt3 tt3Var, nv3 nv3Var) {
        nv3Var.getClass();
        tt3Var.zzf = nv3Var;
        tt3Var.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new tt3();
        }
        rt3 rt3Var = null;
        if (i9 == 4) {
            return new st3(rt3Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final au3 P() {
        au3 au3Var = this.zze;
        return au3Var == null ? au3.P() : au3Var;
    }

    public final nv3 Q() {
        nv3 nv3Var = this.zzf;
        return nv3Var == null ? nv3.P() : nv3Var;
    }
}
