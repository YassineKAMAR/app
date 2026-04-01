package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class we extends z04 implements l24 {
    private static final we zzb;
    private int zzd;
    private long zzt;
    private long zzu;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private int zzk = 1000;
    private long zzl = -1;
    private long zzm = -1;
    private long zzn = -1;
    private int zzo = 1000;
    private long zzp = -1;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzv = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;

    static {
        we weVar = new we();
        zzb = weVar;
        z04.E(we.class, weVar);
    }

    private we() {
    }

    public static ve M() {
        return (ve) zzb.l();
    }

    static /* synthetic */ void O(we weVar, long j8) {
        weVar.zzd |= 1;
        weVar.zze = j8;
    }

    static /* synthetic */ void P(we weVar, long j8) {
        weVar.zzd |= 2;
        weVar.zzf = j8;
    }

    static /* synthetic */ void Q(we weVar, long j8) {
        weVar.zzd |= 4;
        weVar.zzg = j8;
    }

    static /* synthetic */ void R(we weVar, long j8) {
        weVar.zzd |= 8;
        weVar.zzh = j8;
    }

    static /* synthetic */ void S(we weVar) {
        weVar.zzd &= -9;
        weVar.zzh = -1L;
    }

    static /* synthetic */ void T(we weVar, long j8) {
        weVar.zzd |= 16;
        weVar.zzi = j8;
    }

    static /* synthetic */ void U(we weVar, long j8) {
        weVar.zzd |= 32;
        weVar.zzj = j8;
    }

    static /* synthetic */ void V(we weVar, long j8) {
        weVar.zzd |= 128;
        weVar.zzl = j8;
    }

    static /* synthetic */ void W(we weVar, long j8) {
        weVar.zzd |= 256;
        weVar.zzm = j8;
    }

    static /* synthetic */ void X(we weVar, long j8) {
        weVar.zzd |= 512;
        weVar.zzn = j8;
    }

    static /* synthetic */ void Y(we weVar, long j8) {
        weVar.zzd |= 2048;
        weVar.zzp = j8;
    }

    static /* synthetic */ void Z(we weVar, long j8) {
        weVar.zzd |= 4096;
        weVar.zzq = j8;
    }

    static /* synthetic */ void a0(we weVar, long j8) {
        weVar.zzd |= 8192;
        weVar.zzr = j8;
    }

    static /* synthetic */ void b0(we weVar, long j8) {
        weVar.zzd |= 16384;
        weVar.zzs = j8;
    }

    static /* synthetic */ void c0(we weVar, long j8) {
        weVar.zzd |= 32768;
        weVar.zzt = j8;
    }

    static /* synthetic */ void d0(we weVar, long j8) {
        weVar.zzd |= 65536;
        weVar.zzu = j8;
    }

    static /* synthetic */ void e0(we weVar, long j8) {
        weVar.zzd |= 131072;
        weVar.zzv = j8;
    }

    static /* synthetic */ void f0(we weVar, long j8) {
        weVar.zzd |= 262144;
        weVar.zzw = j8;
    }

    static /* synthetic */ void g0(we weVar, int i8) {
        weVar.zzk = i8 - 1;
        weVar.zzd |= 64;
    }

    static /* synthetic */ void h0(we weVar, int i8) {
        weVar.zzo = i8 - 1;
        weVar.zzd |= 1024;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            e14 e14Var = ff.f7739a;
            return z04.B(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", e14Var, "zzl", "zzm", "zzn", "zzo", e14Var, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy"});
        }
        if (i9 == 3) {
            return new we();
        }
        be beVar = null;
        if (i9 == 4) {
            return new ve(beVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
