package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class m74 extends z04 implements l24 {
    private static final m74 zzb;
    private int zzd;
    private String zze = "";

    static {
        m74 m74Var = new m74();
        zzb = m74Var;
        z04.E(m74.class, m74Var);
    }

    private m74() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i9 == 3) {
            return new m74();
        }
        w44 w44Var = null;
        if (i9 == 4) {
            return new l74(w44Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
