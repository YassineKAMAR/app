package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class sq extends z04 implements l24 {
    private static final sq zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        sq sqVar = new sq();
        zzb = sqVar;
        z04.E(sq.class, sqVar);
    }

    private sq() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new sq();
        }
        co coVar = null;
        if (i9 == 4) {
            return new rq(coVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
