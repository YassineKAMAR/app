package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class fe extends z04 implements l24 {
    private static final fe zzb;
    private int zzd;
    private int zze;

    static {
        fe feVar = new fe();
        zzb = feVar;
        z04.E(fe.class, feVar);
    }

    private fe() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", je.f9575a});
        }
        if (i9 == 3) {
            return new fe();
        }
        be beVar = null;
        if (i9 == 4) {
            return new ee(beVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
