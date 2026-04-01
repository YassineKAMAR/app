package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ye extends z04 implements l24 {
    private static final ye zzb;
    private int zzd;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private long zzl = -1;

    static {
        ye yeVar = new ye();
        zzb = yeVar;
        z04.E(ye.class, yeVar);
    }

    private ye() {
    }

    public static xe M() {
        return (xe) zzb.l();
    }

    static /* synthetic */ void O(ye yeVar, long j8) {
        yeVar.zzd |= 1;
        yeVar.zze = j8;
    }

    static /* synthetic */ void P(ye yeVar, long j8) {
        yeVar.zzd |= 4;
        yeVar.zzg = j8;
    }

    static /* synthetic */ void Q(ye yeVar, long j8) {
        yeVar.zzd |= 8;
        yeVar.zzh = j8;
    }

    static /* synthetic */ void R(ye yeVar, long j8) {
        yeVar.zzd |= 16;
        yeVar.zzi = j8;
    }

    static /* synthetic */ void S(ye yeVar, long j8) {
        yeVar.zzd |= 32;
        yeVar.zzj = j8;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i9 == 3) {
            return new ye();
        }
        be beVar = null;
        if (i9 == 4) {
            return new xe(beVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
