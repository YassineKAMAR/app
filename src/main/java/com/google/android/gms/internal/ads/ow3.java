package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ow3 extends z04 implements l24 {
    private static final ow3 zzb;
    private int zzd;
    private j14 zze = z04.y();

    static {
        ow3 ow3Var = new ow3();
        zzb = ow3Var;
        z04.E(ow3.class, ow3Var);
    }

    private ow3() {
    }

    public static lw3 M() {
        return (lw3) zzb.l();
    }

    static /* synthetic */ void P(ow3 ow3Var, nw3 nw3Var) {
        nw3Var.getClass();
        j14 j14Var = ow3Var.zze;
        if (!j14Var.l()) {
            ow3Var.zze = z04.z(j14Var);
        }
        ow3Var.zze.add(nw3Var);
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", nw3.class});
        }
        if (i9 == 3) {
            return new ow3();
        }
        kw3 kw3Var = null;
        if (i9 == 4) {
            return new lw3(kw3Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
