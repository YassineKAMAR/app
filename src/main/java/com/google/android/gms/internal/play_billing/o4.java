package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class o4 extends n1 implements s2 {
    private static final o4 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private y4 zzh;

    static {
        o4 o4Var = new o4();
        zzb = o4Var;
        n1.p(o4.class, o4Var);
    }

    private o4() {
    }

    public static o4 A(byte[] bArr, a1 a1Var) {
        return (o4) n1.h(zzb, bArr, a1Var);
    }

    static /* synthetic */ void B(o4 o4Var, y4 y4Var) {
        y4Var.getClass();
        o4Var.zzh = y4Var;
        o4Var.zzd |= 2;
    }

    static /* synthetic */ void C(o4 o4Var, i5 i5Var) {
        i5Var.getClass();
        o4Var.zzf = i5Var;
        o4Var.zze = 4;
    }

    static /* synthetic */ void x(o4 o4Var, int i8) {
        o4Var.zzg = i8 - 1;
        o4Var.zzd |= 1;
    }

    public static n4 y() {
        return (n4) zzb.e();
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    protected final Object u(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return n1.j(zzb, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", p4.f19656a, "zzh", i5.class});
        }
        if (i9 == 3) {
            return new o4();
        }
        m4 m4Var = null;
        if (i9 == 4) {
            return new n4(m4Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
