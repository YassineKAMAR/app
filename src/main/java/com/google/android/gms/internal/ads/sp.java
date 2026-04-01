package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class sp extends z04 implements l24 {
    private static final sp zzb;
    private int zzd;
    private op zze;
    private j14 zzf = z04.y();
    private int zzg;
    private wq zzh;

    static {
        sp spVar = new sp();
        zzb = spVar;
        z04.E(sp.class, spVar);
    }

    private sp() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zzd", "zze", "zzf", uq.class, "zzg", jp.f9734a, "zzh"});
        }
        if (i9 == 3) {
            return new sp();
        }
        co coVar = null;
        if (i9 == 4) {
            return new rp(coVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
