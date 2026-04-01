package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class v64 extends z04 implements l24 {
    private static final v64 zzb;
    private int zzd;
    private int zze;
    private x54 zzg;
    private b64 zzh;
    private int zzi;
    private int zzl;
    private byte zzn = 2;
    private String zzf = "";
    private f14 zzj = z04.u();
    private String zzk = "";
    private j14 zzm = z04.y();

    static {
        v64 v64Var = new v64();
        zzb = v64Var;
        z04.E(v64.class, v64Var);
    }

    private v64() {
    }

    public static u64 N() {
        return (u64) zzb.l();
    }

    static /* synthetic */ void Q(v64 v64Var, int i8) {
        v64Var.zzd |= 1;
        v64Var.zze = i8;
    }

    static /* synthetic */ void R(v64 v64Var, String str) {
        str.getClass();
        v64Var.zzd |= 2;
        v64Var.zzf = str;
    }

    static /* synthetic */ void S(v64 v64Var, x54 x54Var) {
        x54Var.getClass();
        v64Var.zzg = x54Var;
        v64Var.zzd |= 4;
    }

    static /* synthetic */ void T(v64 v64Var, String str) {
        str.getClass();
        j14 j14Var = v64Var.zzm;
        if (!j14Var.l()) {
            v64Var.zzm = z04.z(j14Var);
        }
        v64Var.zzm.add(str);
    }

    static /* synthetic */ void U(v64 v64Var, int i8) {
        v64Var.zzl = i8 - 1;
        v64Var.zzd |= 64;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzn);
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", s64.f14542a, "zzm"});
        }
        if (i9 == 3) {
            return new v64();
        }
        w44 w44Var = null;
        if (i9 == 4) {
            return new u64(w44Var);
        }
        if (i9 == 5) {
            return zzb;
        }
        this.zzn = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final int M() {
        return this.zzm.size();
    }

    public final String P() {
        return this.zzf;
    }
}
