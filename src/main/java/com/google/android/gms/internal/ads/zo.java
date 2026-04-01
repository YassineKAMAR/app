package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zo extends z04 implements l24 {
    private static final zo zzb;
    private int zzd;
    private String zze = "";
    private j14 zzf = z04.y();
    private int zzg = 1000;
    private int zzh = 1000;
    private int zzi = 1000;

    static {
        zo zoVar = new zo();
        zzb = zoVar;
        z04.E(zo.class, zoVar);
    }

    private zo() {
    }

    public static zo N() {
        return zzb;
    }

    static /* synthetic */ void O(zo zoVar, String str) {
        str.getClass();
        zoVar.zzd |= 1;
        zoVar.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            e14 e14Var = jp.f9734a;
            return z04.B(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzd", "zze", "zzf", vo.class, "zzg", e14Var, "zzh", e14Var, "zzi", e14Var});
        }
        if (i9 == 3) {
            return new zo();
        }
        co coVar = null;
        if (i9 == 4) {
            return new yo(coVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
