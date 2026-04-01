package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class m54 extends z04 implements l24 {
    private static final m54 zzb;
    private int zzd;
    private rz3 zze = rz3.f14393b;

    static {
        m54 m54Var = new m54();
        zzb = m54Var;
        z04.E(m54.class, m54Var);
    }

    private m54() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"zzd", "zze"});
        }
        if (i9 == 3) {
            return new m54();
        }
        w44 w44Var = null;
        if (i9 == 4) {
            return new l54(w44Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
