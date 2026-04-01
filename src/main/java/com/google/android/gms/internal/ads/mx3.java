package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class mx3 extends z04 implements l24 {
    private static final mx3 zzb;
    private int zzd;

    static {
        mx3 mx3Var = new mx3();
        zzb = mx3Var;
        z04.E(mx3.class, mx3Var);
    }

    private mx3() {
    }

    public static mx3 N() {
        return zzb;
    }

    public static mx3 O(rz3 rz3Var, m04 m04Var) {
        return (mx3) z04.r(zzb, rz3Var, m04Var);
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
            return new mx3();
        }
        kx3 kx3Var = null;
        if (i9 == 4) {
            return new lx3(kx3Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
