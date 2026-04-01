package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ep extends z04 implements l24 {
    private static final ep zzb;
    private int zzd;
    private wq zzf;
    private int zzg;
    private yq zzh;
    private int zzi;
    private String zze = "";
    private int zzj = 1000;
    private int zzk = 1000;
    private int zzl = 1000;

    static {
        ep epVar = new ep();
        zzb = epVar;
        z04.E(ep.class, epVar);
    }

    private ep() {
    }

    public static ep N() {
        return zzb;
    }

    static /* synthetic */ void O(ep epVar, String str) {
        epVar.zzd |= 1;
        epVar.zze = str;
    }

    static /* synthetic */ void P(ep epVar, yq yqVar) {
        yqVar.getClass();
        epVar.zzh = yqVar;
        epVar.zzd |= 8;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            e14 e14Var = jp.f9734a;
            return z04.B(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", e14Var, "zzk", e14Var, "zzl", e14Var});
        }
        if (i9 == 3) {
            return new ep();
        }
        co coVar = null;
        if (i9 == 4) {
            return new dp(coVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
