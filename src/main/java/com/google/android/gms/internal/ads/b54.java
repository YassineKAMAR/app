package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class b54 extends z04 implements l24 {
    private static final b54 zzb;
    private int zzd;
    private int zze;
    private long zzf;
    private rz3 zzg = rz3.f14393b;

    static {
        b54 b54Var = new b54();
        zzb = b54Var;
        z04.E(b54.class, b54Var);
    }

    private b54() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", a54.f5028a, "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new b54();
        }
        w44 w44Var = null;
        if (i9 == 4) {
            return new z44(w44Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
