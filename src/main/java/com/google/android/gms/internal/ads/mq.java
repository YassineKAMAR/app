package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class mq extends z04 implements l24 {
    private static final mq zzb;
    private int zzd;
    private int zzf;
    private int zzg;
    private long zzh;
    private long zzk;
    private int zzl;
    private j14 zze = z04.y();
    private String zzi = "";
    private String zzj = "";

    static {
        mq mqVar = new mq();
        zzb = mqVar;
        z04.E(mq.class, mqVar);
    }

    private mq() {
    }

    public static iq M() {
        return (iq) zzb.l();
    }

    static /* synthetic */ void O(mq mqVar, Iterable iterable) {
        j14 j14Var = mqVar.zze;
        if (!j14Var.l()) {
            mqVar.zze = z04.z(j14Var);
        }
        az3.d(iterable, mqVar.zze);
    }

    static /* synthetic */ void P(mq mqVar, int i8) {
        mqVar.zzd |= 1;
        mqVar.zzf = i8;
    }

    static /* synthetic */ void Q(mq mqVar, int i8) {
        mqVar.zzd |= 2;
        mqVar.zzg = i8;
    }

    static /* synthetic */ void R(mq mqVar, long j8) {
        mqVar.zzd |= 4;
        mqVar.zzh = j8;
    }

    static /* synthetic */ void S(mq mqVar, String str) {
        str.getClass();
        mqVar.zzd |= 8;
        mqVar.zzi = str;
    }

    static /* synthetic */ void T(mq mqVar, String str) {
        str.getClass();
        mqVar.zzd |= 16;
        mqVar.zzj = str;
    }

    static /* synthetic */ void U(mq mqVar, long j8) {
        mqVar.zzd |= 32;
        mqVar.zzk = j8;
    }

    static /* synthetic */ void V(mq mqVar, int i8) {
        mqVar.zzd |= 64;
        mqVar.zzl = i8;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzd", "zze", hq.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i9 == 3) {
            return new mq();
        }
        co coVar = null;
        if (i9 == 4) {
            return new iq(coVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
