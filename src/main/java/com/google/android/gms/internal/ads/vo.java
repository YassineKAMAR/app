package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class vo extends z04 implements l24 {
    private static final vo zzb;
    private int zzd;
    private int zze;
    private sq zzf;

    static {
        vo voVar = new vo();
        zzb = voVar;
        z04.E(vo.class, voVar);
    }

    private vo() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", so.f14774a, "zzf"});
        }
        if (i9 == 3) {
            return new vo();
        }
        co coVar = null;
        if (i9 == 4) {
            return new uo(coVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
