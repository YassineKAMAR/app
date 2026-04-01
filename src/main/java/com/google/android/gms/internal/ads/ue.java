package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ue extends z04 implements l24 {
    private static final ue zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = 1000;

    static {
        ue ueVar = new ue();
        zzb = ueVar;
        z04.E(ue.class, ueVar);
    }

    private ue() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", "zzf", ff.f7739a});
        }
        if (i9 == 3) {
            return new ue();
        }
        be beVar = null;
        if (i9 == 4) {
            return new te(beVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
