package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class t44 extends z04 implements l24 {
    private static final t44 zzb;
    private int zzd;
    private long zze;
    private long zzf;

    static {
        t44 t44Var = new t44();
        zzb = t44Var;
        z04.E(t44.class, t44Var);
    }

    private t44() {
    }

    public static s44 M() {
        return (s44) zzb.l();
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new t44();
        }
        r44 r44Var = null;
        if (i9 == 4) {
            return new s44(r44Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
