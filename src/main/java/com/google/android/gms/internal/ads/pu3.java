package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class pu3 extends z04 implements l24 {
    private static final pu3 zzb;
    private int zzd;
    private rz3 zze = rz3.f14393b;

    static {
        pu3 pu3Var = new pu3();
        zzb = pu3Var;
        z04.E(pu3.class, pu3Var);
    }

    private pu3() {
    }

    public static ou3 N() {
        return (ou3) zzb.l();
    }

    public static pu3 P(rz3 rz3Var, m04 m04Var) {
        return (pu3) z04.r(zzb, rz3Var, m04Var);
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzd", "zze"});
        }
        if (i9 == 3) {
            return new pu3();
        }
        nu3 nu3Var = null;
        if (i9 == 4) {
            return new ou3(nu3Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zzd;
    }

    public final rz3 Q() {
        return this.zze;
    }
}
