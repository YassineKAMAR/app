package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class p5 extends n1 implements s2 {
    private static final p5 zzb;
    private int zzd;
    private int zze;

    static {
        p5 p5Var = new p5();
        zzb = p5Var;
        n1.p(p5.class, p5Var);
    }

    private p5() {
    }

    public static p5 y() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    protected final Object u(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return n1.j(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", o5.f19649a});
        }
        if (i9 == 3) {
            return new p5();
        }
        m5 m5Var = null;
        if (i9 == 4) {
            return new n5(m5Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
