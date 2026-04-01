package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class e5 extends n1 implements s2 {
    private static final e5 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        e5 e5Var = new e5();
        zzb = e5Var;
        n1.p(e5.class, e5Var);
    }

    private e5() {
    }

    static /* synthetic */ void A(e5 e5Var, String str) {
        str.getClass();
        e5Var.zzd |= 2;
        e5Var.zzf = str;
    }

    public static d5 x() {
        return (d5) zzb.e();
    }

    static /* synthetic */ void z(e5 e5Var, String str) {
        str.getClass();
        e5Var.zzd |= 1;
        e5Var.zze = str;
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    protected final Object u(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return n1.j(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new e5();
        }
        c5 c5Var = null;
        if (i9 == 4) {
            return new d5(c5Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
