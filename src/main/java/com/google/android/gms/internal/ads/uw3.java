package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class uw3 extends z04 implements l24 {
    private static final uw3 zzb;
    private String zzd = "";

    static {
        uw3 uw3Var = new uw3();
        zzb = uw3Var;
        z04.E(uw3.class, uw3Var);
    }

    private uw3() {
    }

    public static uw3 N() {
        return zzb;
    }

    public static uw3 O(rz3 rz3Var, m04 m04Var) {
        return (uw3) z04.r(zzb, rz3Var, m04Var);
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzd"});
        }
        if (i9 == 3) {
            return new uw3();
        }
        sw3 sw3Var = null;
        if (i9 == 4) {
            return new tw3(sw3Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final String P() {
        return this.zzd;
    }
}
