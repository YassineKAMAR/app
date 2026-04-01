package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class no extends z04 implements l24 {
    private static final no zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        no noVar = new no();
        zzb = noVar;
        z04.E(no.class, noVar);
    }

    private no() {
    }

    public static mo M() {
        return (mo) zzb.l();
    }

    public static no O() {
        return zzb;
    }

    static /* synthetic */ void P(no noVar, boolean z7) {
        noVar.zzd |= 1;
        noVar.zze = z7;
    }

    static /* synthetic */ void Q(no noVar, int i8) {
        noVar.zzd |= 2;
        noVar.zzf = i8;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new no();
        }
        co coVar = null;
        if (i9 == 4) {
            return new mo(coVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
