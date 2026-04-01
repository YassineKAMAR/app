package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class gr extends z04 implements l24 {
    private static final gr zzb;
    private int zzd;
    private int zze;

    static {
        gr grVar = new gr();
        zzb = grVar;
        z04.E(gr.class, grVar);
    }

    private gr() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", fr.f8003a});
        }
        if (i9 == 3) {
            return new gr();
        }
        co coVar = null;
        if (i9 == 4) {
            return new er(coVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
