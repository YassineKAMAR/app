package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class du3 extends z04 implements l24 {
    private static final du3 zzb;
    private int zzd;

    static {
        du3 du3Var = new du3();
        zzb = du3Var;
        z04.E(du3.class, du3Var);
    }

    private du3() {
    }

    public static cu3 N() {
        return (cu3) zzb.l();
    }

    public static du3 P() {
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
            return new du3();
        }
        bu3 bu3Var = null;
        if (i9 == 4) {
            return new cu3(bu3Var);
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
