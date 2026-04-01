package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class jx3 extends z04 implements l24 {
    private static final jx3 zzb;
    private int zzd;
    private rz3 zze = rz3.f14393b;

    static {
        jx3 jx3Var = new jx3();
        zzb = jx3Var;
        z04.E(jx3.class, jx3Var);
    }

    private jx3() {
    }

    public static ix3 N() {
        return (ix3) zzb.l();
    }

    public static jx3 P(rz3 rz3Var, m04 m04Var) {
        return (jx3) z04.r(zzb, rz3Var, m04Var);
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzd", "zze"});
        }
        if (i9 == 3) {
            return new jx3();
        }
        hx3 hx3Var = null;
        if (i9 == 4) {
            return new ix3(hx3Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zzd;
    }

    public final rz3 Q() {
        return this.zze;
    }
}
