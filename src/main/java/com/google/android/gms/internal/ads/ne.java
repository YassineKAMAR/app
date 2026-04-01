package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ne extends z04 implements l24 {
    private static final ne zzb;
    private int zzd;
    private long zze = -1;

    static {
        ne neVar = new ne();
        zzb = neVar;
        z04.E(ne.class, neVar);
    }

    private ne() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i9 == 3) {
            return new ne();
        }
        be beVar = null;
        if (i9 == 4) {
            return new me(beVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
