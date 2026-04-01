package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class n54 extends z04 implements l24 {
    private static final n54 zzb;
    private int zzd;
    private m54 zzf;
    private long zzg;
    private String zze = "";
    private String zzh = "";

    static {
        n54 n54Var = new n54();
        zzb = n54Var;
        z04.E(n54.class, n54Var);
    }

    private n54() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i9 == 3) {
            return new n54();
        }
        w44 w44Var = null;
        if (i9 == 4) {
            return new k54(w44Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
