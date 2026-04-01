package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class nv3 extends z04 implements l24 {
    private static final nv3 zzb;
    private int zzd;
    private qv3 zze;
    private int zzf;
    private int zzg;

    static {
        nv3 nv3Var = new nv3();
        zzb = nv3Var;
        z04.E(nv3.class, nv3Var);
    }

    private nv3() {
    }

    public static mv3 N() {
        return (mv3) zzb.l();
    }

    public static nv3 P() {
        return zzb;
    }

    public static nv3 Q(rz3 rz3Var, m04 m04Var) {
        return (nv3) z04.r(zzb, rz3Var, m04Var);
    }

    static /* synthetic */ void S(nv3 nv3Var, qv3 qv3Var) {
        qv3Var.getClass();
        nv3Var.zze = qv3Var;
        nv3Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new nv3();
        }
        lv3 lv3Var = null;
        if (i9 == 4) {
            return new mv3(lv3Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zzf;
    }

    public final qv3 R() {
        qv3 qv3Var = this.zze;
        return qv3Var == null ? qv3.Q() : qv3Var;
    }
}
