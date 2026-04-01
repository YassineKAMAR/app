package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class p64 extends z04 implements l24 {
    private static final p64 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private rz3 zzg;
    private rz3 zzh;

    static {
        p64 p64Var = new p64();
        zzb = p64Var;
        z04.E(p64.class, p64Var);
    }

    private p64() {
        rz3 rz3Var = rz3.f14393b;
        this.zzg = rz3Var;
        this.zzh = rz3Var;
    }

    public static n64 M() {
        return (n64) zzb.l();
    }

    static /* synthetic */ void O(p64 p64Var, String str) {
        p64Var.zzd |= 2;
        p64Var.zzf = "image/png";
    }

    static /* synthetic */ void P(p64 p64Var, rz3 rz3Var) {
        rz3Var.getClass();
        p64Var.zzd |= 4;
        p64Var.zzg = rz3Var;
    }

    static /* synthetic */ void Q(p64 p64Var, int i8) {
        p64Var.zze = 1;
        p64Var.zzd = 1 | p64Var.zzd;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", o64.f12385a, "zzf", "zzg", "zzh"});
        }
        if (i9 == 3) {
            return new p64();
        }
        w44 w44Var = null;
        if (i9 == 4) {
            return new n64(w44Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
