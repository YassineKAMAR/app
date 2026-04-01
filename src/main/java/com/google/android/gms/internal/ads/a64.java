package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class a64 extends z04 implements l24 {
    private static final a64 zzb;
    private int zzd;
    private int zze;
    private rz3 zzf;
    private rz3 zzg;

    static {
        a64 a64Var = new a64();
        zzb = a64Var;
        z04.E(a64.class, a64Var);
    }

    private a64() {
        rz3 rz3Var = rz3.f14393b;
        this.zzf = rz3Var;
        this.zzg = rz3Var;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new a64();
        }
        w44 w44Var = null;
        if (i9 == 4) {
            return new z54(w44Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
