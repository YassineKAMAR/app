package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class r54 extends z04 implements l24 {
    private static final r54 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private long zzh;

    static {
        r54 r54Var = new r54();
        zzb = r54Var;
        z04.E(r54.class, r54Var);
    }

    private r54() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", q54.f13299a, "zzf", o54.f12371a, "zzg", "zzh"});
        }
        if (i9 == 3) {
            return new r54();
        }
        w44 w44Var = null;
        if (i9 == 4) {
            return new p54(w44Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
