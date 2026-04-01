package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class mp extends z04 implements l24 {
    private static final mp zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private yq zzi;
    private ep zzk;
    private hp zzl;
    private aq zzm;
    private ho zzn;
    private mq zzo;
    private ur zzp;
    private qo zzq;
    private String zzf = "";
    private int zzh = 1000;
    private i14 zzj = z04.w();

    static {
        mp mpVar = new mp();
        zzb = mpVar;
        z04.E(mp.class, mpVar);
    }

    private mp() {
    }

    public static lp O() {
        return (lp) zzb.l();
    }

    static /* synthetic */ void R(mp mpVar, String str) {
        str.getClass();
        mpVar.zzd |= 2;
        mpVar.zzf = str;
    }

    static /* synthetic */ void S(mp mpVar, Iterable iterable) {
        i14 i14Var = mpVar.zzj;
        if (!i14Var.l()) {
            mpVar.zzj = z04.x(i14Var);
        }
        az3.d(iterable, mpVar.zzj);
    }

    static /* synthetic */ void U(mp mpVar, ep epVar) {
        epVar.getClass();
        mpVar.zzk = epVar;
        mpVar.zzd |= 32;
    }

    static /* synthetic */ void V(mp mpVar, ho hoVar) {
        hoVar.getClass();
        mpVar.zzn = hoVar;
        mpVar.zzd |= 256;
    }

    static /* synthetic */ void W(mp mpVar, mq mqVar) {
        mqVar.getClass();
        mpVar.zzo = mqVar;
        mpVar.zzd |= 512;
    }

    static /* synthetic */ void X(mp mpVar, ur urVar) {
        urVar.getClass();
        mpVar.zzp = urVar;
        mpVar.zzd |= 1024;
    }

    static /* synthetic */ void Y(mp mpVar, qo qoVar) {
        qoVar.getClass();
        mpVar.zzq = qoVar;
        mpVar.zzd |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", jp.f9734a, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        }
        if (i9 == 3) {
            return new mp();
        }
        co coVar = null;
        if (i9 == 4) {
            return new lp(coVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final ho M() {
        ho hoVar = this.zzn;
        return hoVar == null ? ho.N() : hoVar;
    }

    public final ep N() {
        ep epVar = this.zzk;
        return epVar == null ? ep.N() : epVar;
    }

    public final String Q() {
        return this.zzf;
    }
}
