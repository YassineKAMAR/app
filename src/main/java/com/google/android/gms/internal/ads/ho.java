package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ho extends z04 implements l24 {
    private static final ho zzb;
    private int zzd;
    private int zze;
    private xo zzg;
    private zo zzh;
    private cp zzj;
    private oq zzk;
    private eq zzl;
    private qp zzm;
    private sp zzn;
    private int zzf = 1000;
    private j14 zzi = z04.y();
    private j14 zzo = z04.y();

    static {
        ho hoVar = new ho();
        zzb = hoVar;
        z04.E(ho.class, hoVar);
    }

    private ho() {
    }

    public static ho N() {
        return zzb;
    }

    static /* synthetic */ void P(ho hoVar, fo foVar) {
        hoVar.zze = foVar.j();
        hoVar.zzd |= 1;
    }

    static /* synthetic */ void Q(ho hoVar, zo zoVar) {
        zoVar.getClass();
        hoVar.zzh = zoVar;
        hoVar.zzd |= 8;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzd", "zze", eo.f7439a, "zzf", jp.f9734a, "zzg", "zzh", "zzi", vo.class, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", ar.class});
        }
        if (i9 == 3) {
            return new ho();
        }
        co coVar = null;
        if (i9 == 4) {
            return new go(coVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final zo O() {
        zo zoVar = this.zzh;
        return zoVar == null ? zo.N() : zoVar;
    }
}
