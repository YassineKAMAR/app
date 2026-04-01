package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class nt3 extends z04 implements l24 {
    private static final nt3 zzb;
    private int zzd;

    static {
        nt3 nt3Var = new nt3();
        zzb = nt3Var;
        z04.E(nt3.class, nt3Var);
    }

    private nt3() {
    }

    public static mt3 N() {
        return (mt3) zzb.l();
    }

    public static nt3 P() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        if (i9 == 3) {
            return new nt3();
        }
        lt3 lt3Var = null;
        if (i9 == 4) {
            return new mt3(lt3Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zzd;
    }
}
