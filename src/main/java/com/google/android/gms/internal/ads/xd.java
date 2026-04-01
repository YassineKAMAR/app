package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class xd extends z04 implements l24 {
    private static final xd zzb;
    private int zzd;
    private int zze = 2;

    static {
        xd xdVar = new xd();
        zzb = xdVar;
        z04.E(xd.class, xdVar);
    }

    private xd() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b᠌\u0000", new Object[]{"zzd", "zze", yd.f17735a});
        }
        if (i9 == 3) {
            return new xd();
        }
        td tdVar = null;
        if (i9 == 4) {
            return new wd(tdVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
