package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class oq extends z04 implements l24 {
    private static final oq zzb;
    private int zzd;
    private int zze = 1000;
    private int zzf = 1000;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private qq zzo;

    static {
        oq oqVar = new oq();
        zzb = oqVar;
        z04.E(oq.class, oqVar);
    }

    private oq() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            e14 e14Var = jp.f9734a;
            return z04.B(zzb, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzd", "zze", e14Var, "zzf", e14Var, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo"});
        }
        if (i9 == 3) {
            return new oq();
        }
        co coVar = null;
        if (i9 == 4) {
            return new nq(coVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
