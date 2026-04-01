package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class po extends z04 implements l24 {
    private static final po zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        po poVar = new po();
        zzb = poVar;
        z04.E(po.class, poVar);
    }

    private po() {
    }

    public static oo M() {
        return (oo) zzb.l();
    }

    static /* synthetic */ void O(po poVar, boolean z7) {
        poVar.zzd |= 1;
        poVar.zze = z7;
    }

    static /* synthetic */ void P(po poVar, boolean z7) {
        poVar.zzd |= 2;
        poVar.zzf = z7;
    }

    static /* synthetic */ void Q(po poVar, int i8) {
        poVar.zzd |= 4;
        poVar.zzg = i8;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new po();
        }
        co coVar = null;
        if (i9 == 4) {
            return new oo(coVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
