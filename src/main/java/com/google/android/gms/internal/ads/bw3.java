package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class bw3 extends z04 implements l24 {
    private static final bw3 zzb;
    private String zzd = "";
    private rz3 zze = rz3.f14393b;
    private int zzf;

    static {
        bw3 bw3Var = new bw3();
        zzb = bw3Var;
        z04.E(bw3.class, bw3Var);
    }

    private bw3() {
    }

    public static aw3 M() {
        return (aw3) zzb.l();
    }

    public static bw3 O() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new bw3();
        }
        zv3 zv3Var = null;
        if (i9 == 4) {
            return new aw3(zv3Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final dx3 P() {
        dx3 dx3VarA = dx3.a(this.zzf);
        return dx3VarA == null ? dx3.UNRECOGNIZED : dx3VarA;
    }

    public final rz3 Q() {
        return this.zze;
    }

    public final String R() {
        return this.zzd;
    }
}
