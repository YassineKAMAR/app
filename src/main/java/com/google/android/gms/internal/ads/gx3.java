package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class gx3 extends z04 implements l24 {
    private static final gx3 zzb;
    private String zzd = "";
    private j14 zze = z04.y();

    static {
        gx3 gx3Var = new gx3();
        zzb = gx3Var;
        z04.E(gx3.class, gx3Var);
    }

    private gx3() {
    }

    public static gx3 N() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", ew3.class});
        }
        if (i9 == 3) {
            return new gx3();
        }
        ex3 ex3Var = null;
        if (i9 == 4) {
            return new fx3(ex3Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
