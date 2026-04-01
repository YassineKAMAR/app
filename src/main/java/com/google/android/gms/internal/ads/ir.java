package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ir extends z04 implements l24 {
    private static final ir zzb;
    private int zzd;
    private yq zze;
    private int zzf = 1000;
    private gr zzg;
    private wq zzh;

    static {
        ir irVar = new ir();
        zzb = irVar;
        z04.E(ir.class, irVar);
    }

    private ir() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", jp.f9734a, "zzg", "zzh"});
        }
        if (i9 == 3) {
            return new ir();
        }
        co coVar = null;
        if (i9 == 4) {
            return new hr(coVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
