package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class i33 extends z04 implements l24 {
    private static final i33 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private e33 zzh;

    static {
        i33 i33Var = new i33();
        zzb = i33Var;
        z04.E(i33.class, i33Var);
    }

    private i33() {
    }

    public static g33 M() {
        return (g33) zzb.l();
    }

    static /* synthetic */ void O(i33 i33Var, String str) {
        str.getClass();
        i33Var.zzd |= 2;
        i33Var.zzf = str;
    }

    static /* synthetic */ void P(i33 i33Var, e33 e33Var) {
        e33Var.getClass();
        i33Var.zzh = e33Var;
        i33Var.zzd |= 8;
    }

    static /* synthetic */ void Q(i33 i33Var, int i8) {
        i33Var.zze = 1;
        i33Var.zzd = 1 | i33Var.zzd;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", h33.f8618a, "zzf", "zzg", "zzh"});
        }
        if (i9 == 3) {
            return new i33();
        }
        f33 f33Var = null;
        if (i9 == 4) {
            return new g33(f33Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
