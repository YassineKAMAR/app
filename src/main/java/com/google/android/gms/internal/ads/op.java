package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class op extends z04 implements l24 {
    private static final op zzb;
    private int zzd;
    private int zzf;
    private wq zzh;
    private String zze = "";
    private f14 zzg = z04.u();

    static {
        op opVar = new op();
        zzb = opVar;
        z04.E(op.class, opVar);
    }

    private op() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzd", "zze", "zzf", jp.f9734a, "zzg", "zzh"});
        }
        if (i9 == 3) {
            return new op();
        }
        co coVar = null;
        if (i9 == 4) {
            return new np(coVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
