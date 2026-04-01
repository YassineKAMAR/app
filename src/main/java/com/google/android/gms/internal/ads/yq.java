package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class yq extends z04 implements l24 {
    private static final yq zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        yq yqVar = new yq();
        zzb = yqVar;
        z04.E(yq.class, yqVar);
    }

    private yq() {
    }

    public static xq M() {
        return (xq) zzb.l();
    }

    static /* synthetic */ void O(yq yqVar, int i8) {
        yqVar.zzd |= 1;
        yqVar.zze = i8;
    }

    static /* synthetic */ void P(yq yqVar, int i8) {
        yqVar.zzd |= 2;
        yqVar.zzf = i8;
    }

    static /* synthetic */ void Q(yq yqVar, int i8) {
        yqVar.zzd |= 4;
        yqVar.zzg = i8;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new yq();
        }
        co coVar = null;
        if (i9 == 4) {
            return new xq(coVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
