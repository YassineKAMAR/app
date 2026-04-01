package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class qv3 extends z04 implements l24 {
    private static final qv3 zzb;
    private int zzd;
    private int zze;

    static {
        qv3 qv3Var = new qv3();
        zzb = qv3Var;
        z04.E(qv3.class, qv3Var);
    }

    private qv3() {
    }

    public static pv3 O() {
        return (pv3) zzb.l();
    }

    public static qv3 Q() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        if (i9 == 3) {
            return new qv3();
        }
        ov3 ov3Var = null;
        if (i9 == 4) {
            return new pv3(ov3Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zze;
    }

    public final hv3 N() {
        int i8 = this.zzd;
        hv3 hv3Var = hv3.UNKNOWN_HASH;
        hv3 hv3Var2 = i8 != 0 ? i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? i8 != 5 ? null : hv3.SHA224 : hv3.SHA512 : hv3.SHA256 : hv3.SHA384 : hv3.SHA1 : hv3.UNKNOWN_HASH;
        return hv3Var2 == null ? hv3.UNRECOGNIZED : hv3Var2;
    }
}
