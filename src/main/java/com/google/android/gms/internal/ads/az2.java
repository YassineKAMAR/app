package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class az2 extends z04 implements l24 {
    private static final az2 zzb;
    private int zzd;
    private wy2 zze;

    static {
        az2 az2Var = new az2();
        zzb = az2Var;
        z04.E(az2.class, az2Var);
    }

    private az2() {
    }

    public static zy2 M() {
        return (zy2) zzb.l();
    }

    static /* synthetic */ void O(az2 az2Var, wy2 wy2Var) {
        wy2Var.getClass();
        az2Var.zze = wy2Var;
        az2Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0000\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i9 == 3) {
            return new az2();
        }
        xy2 xy2Var = null;
        if (i9 == 4) {
            return new zy2(xy2Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
