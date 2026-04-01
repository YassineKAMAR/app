package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class x54 extends z04 implements l24 {
    private static final x54 zzb;
    private int zzd;
    private w54 zze;
    private rz3 zzg;
    private rz3 zzh;
    private int zzi;
    private byte zzj = 2;
    private j14 zzf = z04.y();

    static {
        x54 x54Var = new x54();
        zzb = x54Var;
        z04.E(x54.class, x54Var);
    }

    private x54() {
        rz3 rz3Var = rz3.f14393b;
        this.zzg = rz3Var;
        this.zzh = rz3Var;
    }

    public static u54 M() {
        return (u54) zzb.l();
    }

    static /* synthetic */ void O(x54 x54Var, t54 t54Var) {
        t54Var.getClass();
        j14 j14Var = x54Var.zzf;
        if (!j14Var.l()) {
            x54Var.zzf = z04.z(j14Var);
        }
        x54Var.zzf.add(t54Var);
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzj);
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzd", "zze", "zzf", t54.class, "zzg", "zzh", "zzi"});
        }
        if (i9 == 3) {
            return new x54();
        }
        w44 w44Var = null;
        if (i9 == 4) {
            return new u54(w44Var);
        }
        if (i9 == 5) {
            return zzb;
        }
        this.zzj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
