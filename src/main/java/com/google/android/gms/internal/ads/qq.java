package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class qq extends z04 implements l24 {
    private static final qq zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        qq qqVar = new qq();
        zzb = qqVar;
        z04.E(qq.class, qqVar);
    }

    private qq() {
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
            return new qq();
        }
        co coVar = null;
        if (i9 == 4) {
            return new pq(coVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
