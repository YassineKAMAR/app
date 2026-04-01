package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class f64 extends z04 implements l24 {
    private static final f64 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        f64 f64Var = new f64();
        zzb = f64Var;
        z04.E(f64.class, f64Var);
    }

    private f64() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            e14 e14Var = d64.f6599a;
            return z04.B(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", e14Var, "zzf", "zzg", e14Var});
        }
        if (i9 == 3) {
            return new f64();
        }
        w44 w44Var = null;
        if (i9 == 4) {
            return new e64(w44Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
