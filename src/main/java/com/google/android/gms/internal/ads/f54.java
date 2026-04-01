package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class f54 extends z04 implements l24 {
    private static final g14 zzb = new x44();
    private static final f54 zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private int zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private int zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private boolean zzt;
    private long zzu;
    private boolean zzw;
    private String zzh = "";
    private j14 zzi = z04.y();
    private String zzn = "";
    private j14 zzs = z04.y();
    private f14 zzv = z04.u();

    static {
        f54 f54Var = new f54();
        zzd = f54Var;
        z04.E(f54.class, f54Var);
    }

    private f54() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzd, "\u0001\u0012\u0000\u0001\u0001\u0012\u0012\u0000\u0003\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e", new Object[]{"zze", "zzf", e54.f7133a, "zzg", "zzh", "zzi", "zzj", c54.f6179a, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", b54.class, "zzt", "zzu", "zzv", q44.a(), "zzw"});
        }
        if (i9 == 3) {
            return new f54();
        }
        w44 w44Var = null;
        if (i9 == 4) {
            return new y44(w44Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzd;
    }
}
