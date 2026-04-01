package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ar extends z04 implements l24 {
    private static final ar zzb;
    private int zzd;
    private kr zze;
    private or zzf;
    private qr zzg;
    private sr zzh;
    private cr zzi;
    private mr zzj;
    private ir zzk;
    private int zzl;
    private int zzm;
    private wq zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private long zzt;

    static {
        ar arVar = new ar();
        zzb = arVar;
        z04.E(ar.class, arVar);
    }

    private ar() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fင\u0007\rင\b\u000eဉ\t\u000fင\n\u0010င\u000b\u0011င\f\u0012င\r\u0013င\u000e\u0014ဃ\u000f", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt"});
        }
        if (i9 == 3) {
            return new ar();
        }
        co coVar = null;
        if (i9 == 4) {
            return new zq(coVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
