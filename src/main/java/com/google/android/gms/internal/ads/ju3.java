package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ju3 extends z04 implements l24 {
    private static final ju3 zzb;
    private int zzd;
    private mu3 zze;
    private int zzf;

    static {
        ju3 ju3Var = new ju3();
        zzb = ju3Var;
        z04.E(ju3.class, ju3Var);
    }

    private ju3() {
    }

    public static iu3 N() {
        return (iu3) zzb.l();
    }

    public static ju3 P(rz3 rz3Var, m04 m04Var) {
        return (ju3) z04.r(zzb, rz3Var, m04Var);
    }

    static /* synthetic */ void R(ju3 ju3Var, mu3 mu3Var) {
        mu3Var.getClass();
        ju3Var.zze = mu3Var;
        ju3Var.zzd |= 1;
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
            return new ju3();
        }
        hu3 hu3Var = null;
        if (i9 == 4) {
            return new iu3(hu3Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zzf;
    }

    public final mu3 Q() {
        mu3 mu3Var = this.zze;
        return mu3Var == null ? mu3.P() : mu3Var;
    }
}
