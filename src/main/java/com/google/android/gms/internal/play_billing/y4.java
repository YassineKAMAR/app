package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class y4 extends n1 implements s2 {
    private static final y4 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        y4 y4Var = new y4();
        zzb = y4Var;
        n1.p(y4.class, y4Var);
    }

    private y4() {
    }

    static /* synthetic */ void A(y4 y4Var, int i8) {
        y4Var.zzd |= 1;
        y4Var.zze = i8;
    }

    static /* synthetic */ void B(y4 y4Var, String str) {
        str.getClass();
        y4Var.zzd |= 2;
        y4Var.zzf = str;
    }

    static /* synthetic */ void x(y4 y4Var, int i8) {
        y4Var.zzg = i8 - 1;
        y4Var.zzd |= 4;
    }

    public static u4 y() {
        return (u4) zzb.e();
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    protected final Object u(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return n1.j(zzb, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", w4.f19730a, "zzh"});
        }
        if (i9 == 3) {
            return new y4();
        }
        t4 t4Var = null;
        if (i9 == 4) {
            return new u4(t4Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
