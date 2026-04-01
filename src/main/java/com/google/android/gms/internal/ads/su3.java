package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class su3 extends z04 implements l24 {
    private static final su3 zzb;
    private int zzd;
    private int zze;

    static {
        su3 su3Var = new su3();
        zzb = su3Var;
        z04.E(su3.class, su3Var);
    }

    private su3() {
    }

    public static ru3 N() {
        return (ru3) zzb.l();
    }

    public static su3 P(rz3 rz3Var, m04 m04Var) {
        return (su3) z04.r(zzb, rz3Var, m04Var);
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze"});
        }
        if (i9 == 3) {
            return new su3();
        }
        qu3 qu3Var = null;
        if (i9 == 4) {
            return new ru3(qu3Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zzd;
    }
}
