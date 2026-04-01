package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class df extends z04 implements l24 {
    private static final df zzb;
    private int zzd;
    private rz3 zze;
    private rz3 zzf;
    private rz3 zzg;
    private rz3 zzh;

    static {
        df dfVar = new df();
        zzb = dfVar;
        z04.E(df.class, dfVar);
    }

    private df() {
        rz3 rz3Var = rz3.f14393b;
        this.zze = rz3Var;
        this.zzf = rz3Var;
        this.zzg = rz3Var;
        this.zzh = rz3Var;
    }

    public static cf M() {
        return (cf) zzb.l();
    }

    public static df O(byte[] bArr, m04 m04Var) {
        return (df) z04.t(zzb, bArr, m04Var);
    }

    static /* synthetic */ void T(df dfVar, rz3 rz3Var) {
        dfVar.zzd |= 1;
        dfVar.zze = rz3Var;
    }

    static /* synthetic */ void U(df dfVar, rz3 rz3Var) {
        dfVar.zzd |= 2;
        dfVar.zzf = rz3Var;
    }

    static /* synthetic */ void V(df dfVar, rz3 rz3Var) {
        dfVar.zzd |= 4;
        dfVar.zzg = rz3Var;
    }

    static /* synthetic */ void W(df dfVar, rz3 rz3Var) {
        dfVar.zzd |= 8;
        dfVar.zzh = rz3Var;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i9 == 3) {
            return new df();
        }
        be beVar = null;
        if (i9 == 4) {
            return new cf(beVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final rz3 P() {
        return this.zze;
    }

    public final rz3 Q() {
        return this.zzf;
    }

    public final rz3 R() {
        return this.zzh;
    }

    public final rz3 S() {
        return this.zzg;
    }
}
