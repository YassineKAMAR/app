package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class w54 extends z04 implements l24 {
    private static final w54 zzb;
    private int zzd;
    private rz3 zze;
    private rz3 zzf;
    private rz3 zzg;

    static {
        w54 w54Var = new w54();
        zzb = w54Var;
        z04.E(w54.class, w54Var);
    }

    private w54() {
        rz3 rz3Var = rz3.f14393b;
        this.zze = rz3Var;
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
            return z04.B(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new w54();
        }
        w44 w44Var = null;
        if (i9 == 4) {
            return new v54(w44Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
