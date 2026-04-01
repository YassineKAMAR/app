package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class j54 extends z04 implements l24 {
    private static final j54 zzb;
    private int zzd;
    private String zze = "";

    static {
        j54 j54Var = new j54();
        zzb = j54Var;
        z04.E(j54.class, j54Var);
    }

    private j54() {
    }

    public static i54 M() {
        return (i54) zzb.l();
    }

    static /* synthetic */ void O(j54 j54Var, String str) {
        j54Var.zzd |= 1;
        j54Var.zze = str;
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
            return new j54();
        }
        w44 w44Var = null;
        if (i9 == 4) {
            return new i54(w44Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
