package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class ew3 extends z04 implements l24 {
    private static final ew3 zzb;
    private int zzf;
    private boolean zzg;
    private String zzd = "";
    private String zze = "";
    private String zzh = "";

    static {
        ew3 ew3Var = new ew3();
        zzb = ew3Var;
        z04.E(ew3.class, ew3Var);
    }

    private ew3() {
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i9 == 3) {
            return new ew3();
        }
        cw3 cw3Var = null;
        if (i9 == 4) {
            return new dw3(cw3Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
