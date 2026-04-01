package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class kv3 extends z04 implements l24 {
    private static final kv3 zzb;
    private int zzd;
    private int zze;
    private qv3 zzf;
    private rz3 zzg = rz3.f14393b;

    static {
        kv3 kv3Var = new kv3();
        zzb = kv3Var;
        z04.E(kv3.class, kv3Var);
    }

    private kv3() {
    }

    public static jv3 N() {
        return (jv3) zzb.l();
    }

    public static kv3 P() {
        return zzb;
    }

    public static kv3 Q(rz3 rz3Var, m04 m04Var) {
        return (kv3) z04.r(zzb, rz3Var, m04Var);
    }

    static /* synthetic */ void U(kv3 kv3Var, qv3 qv3Var) {
        qv3Var.getClass();
        kv3Var.zzf = qv3Var;
        kv3Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new kv3();
        }
        iv3 iv3Var = null;
        if (i9 == 4) {
            return new jv3(iv3Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zze;
    }

    public final qv3 R() {
        qv3 qv3Var = this.zzf;
        return qv3Var == null ? qv3.Q() : qv3Var;
    }

    public final rz3 S() {
        return this.zzg;
    }
}
