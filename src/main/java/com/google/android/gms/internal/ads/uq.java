package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class uq extends z04 implements l24 {
    private static final uq zzb;
    private int zzd;
    private String zze = "";
    private int zzf;
    private wq zzg;

    static {
        uq uqVar = new uq();
        zzb = uqVar;
        z04.E(uq.class, uqVar);
    }

    private uq() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", jp.f9734a, "zzg"});
        }
        if (i9 == 3) {
            return new uq();
        }
        co coVar = null;
        if (i9 == 4) {
            return new tq(coVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
