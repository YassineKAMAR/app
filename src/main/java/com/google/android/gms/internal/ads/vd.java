package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class vd extends z04 implements l24 {
    private static final vd zzb;
    private int zzd;
    private xd zze;
    private ae zzf;

    static {
        vd vdVar = new vd();
        zzb = vdVar;
        z04.E(vd.class, vdVar);
    }

    private vd() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new vd();
        }
        td tdVar = null;
        if (i9 == 4) {
            return new ud(tdVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
