package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class b64 extends z04 implements l24 {
    private static final b64 zzb;
    private int zzd;
    private a64 zze;
    private rz3 zzg;
    private rz3 zzh;
    private int zzi;
    private rz3 zzj;
    private byte zzk = 2;
    private j14 zzf = z04.y();

    static {
        b64 b64Var = new b64();
        zzb = b64Var;
        z04.E(b64.class, b64Var);
    }

    private b64() {
        rz3 rz3Var = rz3.f14393b;
        this.zzg = rz3Var;
        this.zzh = rz3Var;
        this.zzj = rz3Var;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzd", "zze", "zzf", t54.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i9 == 3) {
            return new b64();
        }
        w44 w44Var = null;
        if (i9 == 4) {
            return new y54(w44Var);
        }
        if (i9 == 5) {
            return zzb;
        }
        this.zzk = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
