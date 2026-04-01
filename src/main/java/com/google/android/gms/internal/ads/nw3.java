package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class nw3 extends z04 implements l24 {
    private static final nw3 zzb;
    private String zzd = "";
    private int zze;
    private int zzf;
    private int zzg;

    static {
        nw3 nw3Var = new nw3();
        zzb = nw3Var;
        z04.E(nw3.class, nw3Var);
    }

    private nw3() {
    }

    public static mw3 M() {
        return (mw3) zzb.l();
    }

    static /* synthetic */ void O(nw3 nw3Var, String str) {
        str.getClass();
        nw3Var.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new nw3();
        }
        kw3 kw3Var = null;
        if (i9 == 4) {
            return new mw3(kw3Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
