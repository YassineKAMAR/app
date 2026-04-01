package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class sd extends z04 implements l24 {
    private static final sd zzb;
    private int zzd;
    private long zzf;
    private long zzj;
    private long zzk;
    private long zzm;
    private int zzq;
    private String zze = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzl = "";
    private String zzn = "";
    private String zzo = "";
    private j14 zzp = z04.y();

    static {
        sd sdVar = new sd();
        zzb = sdVar;
        z04.E(sd.class, sdVar);
    }

    private sd() {
    }

    public static nd M() {
        return (nd) zzb.l();
    }

    static /* synthetic */ void O(sd sdVar, long j8) {
        sdVar.zzd |= 2;
        sdVar.zzf = j8;
    }

    static /* synthetic */ void P(sd sdVar, String str) {
        str.getClass();
        sdVar.zzd |= 4;
        sdVar.zzg = str;
    }

    static /* synthetic */ void Q(sd sdVar, String str) {
        str.getClass();
        sdVar.zzd |= 8;
        sdVar.zzh = str;
    }

    static /* synthetic */ void R(sd sdVar, String str) {
        sdVar.zzd |= 16;
        sdVar.zzi = str;
    }

    static /* synthetic */ void S(sd sdVar, String str) {
        sdVar.zzd |= 1024;
        sdVar.zzo = str;
    }

    static /* synthetic */ void T(sd sdVar, String str) {
        str.getClass();
        sdVar.zzd |= 1;
        sdVar.zze = str;
    }

    static /* synthetic */ void U(sd sdVar, int i8) {
        sdVar.zzq = i8 - 1;
        sdVar.zzd |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", qd.class, "zzq", rd.f14063a});
        }
        if (i9 == 3) {
            return new sd();
        }
        md mdVar = null;
        if (i9 == 4) {
            return new nd(mdVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
