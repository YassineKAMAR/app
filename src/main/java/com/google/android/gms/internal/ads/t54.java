package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class t54 extends z04 implements l24 {
    private static final t54 zzb;
    private int zzd;
    private rz3 zze;
    private rz3 zzf;
    private byte zzg = 2;

    static {
        t54 t54Var = new t54();
        zzb = t54Var;
        z04.E(t54.class, t54Var);
    }

    private t54() {
        rz3 rz3Var = rz3.f14393b;
        this.zze = rz3Var;
        this.zzf = rz3Var;
    }

    public static s54 M() {
        return (s54) zzb.l();
    }

    static /* synthetic */ void O(t54 t54Var, rz3 rz3Var) {
        t54Var.zzd |= 1;
        t54Var.zze = rz3Var;
    }

    static /* synthetic */ void P(t54 t54Var, rz3 rz3Var) {
        t54Var.zzd |= 2;
        t54Var.zzf = rz3Var;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new t54();
        }
        w44 w44Var = null;
        if (i9 == 4) {
            return new s54(w44Var);
        }
        if (i9 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
