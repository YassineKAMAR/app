package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ae extends z04 implements l24 {
    private static final ae zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        ae aeVar = new ae();
        zzb = aeVar;
        z04.E(ae.class, aeVar);
    }

    private ae() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i9 == 3) {
            return new ae();
        }
        td tdVar = null;
        if (i9 == 4) {
            return new zd(tdVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
