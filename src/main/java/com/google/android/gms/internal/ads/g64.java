package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class g64 extends z04 implements l24 {
    private static final g64 zzb;
    private int zzd;
    private int zze;
    private f64 zzf;
    private f64 zzg;

    static {
        g64 g64Var = new g64();
        zzb = g64Var;
        z04.E(g64.class, g64Var);
    }

    private g64() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", d64.f6599a, "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new g64();
        }
        w44 w44Var = null;
        if (i9 == 4) {
            return new c64(w44Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
