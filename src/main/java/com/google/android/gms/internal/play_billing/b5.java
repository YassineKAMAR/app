package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class b5 extends n1 implements s2 {
    private static final b5 zzb;
    private int zzd;
    private String zze = "";

    static {
        b5 b5Var = new b5();
        zzb = b5Var;
        n1.p(b5.class, b5Var);
    }

    private b5() {
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    protected final Object u(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return n1.j(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i9 == 3) {
            return new b5();
        }
        z4 z4Var = null;
        if (i9 == 4) {
            return new a5(z4Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
