package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class fk extends z04 implements l24 {
    private static final fk zzb;
    private int zzd;
    private ik zze;
    private rz3 zzf;
    private rz3 zzg;

    static {
        fk fkVar = new fk();
        zzb = fkVar;
        z04.E(fk.class, fkVar);
    }

    private fk() {
        rz3 rz3Var = rz3.f14393b;
        this.zzf = rz3Var;
        this.zzg = rz3Var;
    }

    public static fk N(rz3 rz3Var, m04 m04Var) {
        return (fk) z04.r(zzb, rz3Var, m04Var);
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new fk();
        }
        dk dkVar = null;
        if (i9 == 4) {
            return new ek(dkVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final ik O() {
        ik ikVar = this.zze;
        return ikVar == null ? ik.R() : ikVar;
    }

    public final rz3 P() {
        return this.zzg;
    }

    public final rz3 Q() {
        return this.zzf;
    }
}
