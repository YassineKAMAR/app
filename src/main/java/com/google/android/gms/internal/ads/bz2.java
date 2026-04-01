package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class bz2 extends z04 implements l24 {
    private static final bz2 zzb;
    private j14 zzd = z04.y();

    static {
        bz2 bz2Var = new bz2();
        zzb = bz2Var;
        z04.E(bz2.class, bz2Var);
    }

    private bz2() {
    }

    public static yy2 N() {
        return (yy2) zzb.l();
    }

    static /* synthetic */ void Q(bz2 bz2Var, az2 az2Var) {
        az2Var.getClass();
        j14 j14Var = bz2Var.zzd;
        if (!j14Var.l()) {
            bz2Var.zzd = z04.z(j14Var);
        }
        bz2Var.zzd.add(az2Var);
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", az2.class});
        }
        if (i9 == 3) {
            return new bz2();
        }
        xy2 xy2Var = null;
        if (i9 == 4) {
            return new yy2(xy2Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zzd.size();
    }
}
