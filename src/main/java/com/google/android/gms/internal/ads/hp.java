package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class hp extends z04 implements l24 {
    private static final hp zzb;
    private int zzd;
    private int zze;
    private yq zzf;
    private String zzg = "";
    private String zzh = "";

    static {
        hp hpVar = new hp();
        zzb = hpVar;
        z04.E(hp.class, hpVar);
    }

    private hp() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzd", "zze", gp.f8445a, "zzf", "zzg", "zzh"});
        }
        if (i9 == 3) {
            return new hp();
        }
        co coVar = null;
        if (i9 == 4) {
            return new fp(coVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
