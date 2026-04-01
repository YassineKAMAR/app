package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class b74 extends z04 implements l24 {
    private static final b74 zzb;
    private int zzd;
    private String zze = "";
    private rz3 zzf = rz3.f14393b;

    static {
        b74 b74Var = new b74();
        zzb = b74Var;
        z04.E(b74.class, b74Var);
    }

    private b74() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new b74();
        }
        w44 w44Var = null;
        if (i9 == 4) {
            return new a74(w44Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
