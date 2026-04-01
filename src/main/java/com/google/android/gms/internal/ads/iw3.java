package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class iw3 extends z04 implements l24 {
    private static final iw3 zzb;
    private int zzd;
    private vv3 zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        iw3 iw3Var = new iw3();
        zzb = iw3Var;
        z04.E(iw3.class, iw3Var);
    }

    private iw3() {
    }

    public static hw3 O() {
        return (hw3) zzb.l();
    }

    static /* synthetic */ void R(iw3 iw3Var, vv3 vv3Var) {
        vv3Var.getClass();
        iw3Var.zze = vv3Var;
        iw3Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i9 == 3) {
            return new iw3();
        }
        fw3 fw3Var = null;
        if (i9 == 4) {
            return new hw3(fw3Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zzg;
    }

    public final vv3 N() {
        vv3 vv3Var = this.zze;
        return vv3Var == null ? vv3.P() : vv3Var;
    }

    public final dx3 Q() {
        dx3 dx3VarA = dx3.a(this.zzh);
        return dx3VarA == null ? dx3.UNRECOGNIZED : dx3VarA;
    }

    public final boolean U() {
        return (this.zzd & 1) != 0;
    }

    public final int V() {
        int i8 = this.zzf;
        int i9 = 3;
        if (i8 == 0) {
            i9 = 2;
        } else if (i8 != 1) {
            i9 = i8 != 2 ? i8 != 3 ? 0 : 5 : 4;
        }
        if (i9 == 0) {
            return 1;
        }
        return i9;
    }
}
