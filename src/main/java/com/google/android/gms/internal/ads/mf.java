package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class mf extends z04 implements l24 {
    private static final mf zzb;
    private int zzd;
    private j14 zze = z04.y();
    private rz3 zzf = rz3.f14393b;
    private int zzg = 1;
    private int zzh = 1;

    static {
        mf mfVar = new mf();
        zzb = mfVar;
        z04.E(mf.class, mfVar);
    }

    private mf() {
    }

    public static lf M() {
        return (lf) zzb.l();
    }

    static /* synthetic */ void O(mf mfVar, rz3 rz3Var) {
        j14 j14Var = mfVar.zze;
        if (!j14Var.l()) {
            mfVar.zze = z04.z(j14Var);
        }
        mfVar.zze.add(rz3Var);
    }

    static /* synthetic */ void P(mf mfVar, rz3 rz3Var) {
        mfVar.zzd |= 1;
        mfVar.zzf = rz3Var;
    }

    static /* synthetic */ void Q(mf mfVar, int i8) {
        mfVar.zzh = 4;
        mfVar.zzd = 4 | mfVar.zzd;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", gf.f8306a, "zzh", ef.f7297a});
        }
        if (i9 == 3) {
            return new mf();
        }
        be beVar = null;
        if (i9 == 4) {
            return new lf(beVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
