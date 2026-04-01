package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class m64 extends z04 implements l24 {
    private static final m64 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    static {
        m64 m64Var = new m64();
        zzb = m64Var;
        z04.E(m64.class, m64Var);
    }

    private m64() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", l64.f10478a, "zzf", "zzg", "zzh"});
        }
        if (i9 == 3) {
            return new m64();
        }
        w44 w44Var = null;
        if (i9 == 4) {
            return new k64(w44Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
