package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class g74 extends z04 implements l24 {
    private static final g74 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        g74 g74Var = new g74();
        zzb = g74Var;
        z04.E(g74.class, g74Var);
    }

    private g74() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new g74();
        }
        w44 w44Var = null;
        if (i9 == 4) {
            return new d74(w44Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
