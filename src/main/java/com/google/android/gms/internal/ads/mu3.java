package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class mu3 extends z04 implements l24 {
    private static final mu3 zzb;
    private int zzd;

    static {
        mu3 mu3Var = new mu3();
        zzb = mu3Var;
        z04.E(mu3.class, mu3Var);
    }

    private mu3() {
    }

    public static lu3 N() {
        return (lu3) zzb.l();
    }

    public static mu3 P() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        if (i9 == 3) {
            return new mu3();
        }
        ku3 ku3Var = null;
        if (i9 == 4) {
            return new lu3(ku3Var);
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
