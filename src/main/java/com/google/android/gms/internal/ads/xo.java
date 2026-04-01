package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class xo extends z04 implements l24 {
    private static final xo zzb;
    private int zzd;
    private String zze = "";
    private j14 zzf = z04.y();
    private int zzg;

    static {
        xo xoVar = new xo();
        zzb = xoVar;
        z04.E(xo.class, xoVar);
    }

    private xo() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new Object[]{"zzd", "zze", "zzf", vo.class, "zzg", jp.f9734a});
        }
        if (i9 == 3) {
            return new xo();
        }
        co coVar = null;
        if (i9 == 4) {
            return new wo(coVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
