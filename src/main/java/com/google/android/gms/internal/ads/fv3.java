package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class fv3 extends z04 implements l24 {
    private static final fv3 zzb;

    static {
        fv3 fv3Var = new fv3();
        zzb = fv3Var;
        z04.E(fv3.class, fv3Var);
    }

    private fv3() {
    }

    public static fv3 N() {
        return zzb;
    }

    public static fv3 O(rz3 rz3Var, m04 m04Var) {
        return (fv3) z04.r(zzb, rz3Var, m04Var);
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        dv3 dv3Var = null;
        if (i9 == 2) {
            return z04.B(zzb, "\u0000\u0000", null);
        }
        if (i9 == 3) {
            return new fv3();
        }
        if (i9 == 4) {
            return new ev3(dv3Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
