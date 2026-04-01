package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class o74 extends z04 implements l24 {
    private static final o74 zzb;
    private int zzd;
    private boolean zzk;
    private double zzl;
    private int zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private String zze = "";
    private String zzf = "";
    private int zzg = 4;
    private j14 zzh = z04.y();
    private String zzi = "";
    private String zzj = "";
    private j14 zzm = z04.y();

    static {
        o74 o74Var = new o74();
        zzb = o74Var;
        z04.E(o74.class, o74Var);
    }

    private o74() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zzd", "zze", "zzg", n74.f11716a, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", m74.class, "zzf", "zzn", k74.f9980a, "zzo", "zzp", "zzq", "zzr"});
        }
        if (i9 == 3) {
            return new o74();
        }
        w44 w44Var = null;
        if (i9 == 4) {
            return new j74(w44Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
