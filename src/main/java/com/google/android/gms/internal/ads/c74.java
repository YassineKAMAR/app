package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c74 extends z04 implements l24 {
    private static final c74 zzb;
    private n54 zzB;
    private f54 zzD;
    private g64 zzF;
    private int zzG;
    private int zzd;
    private int zze;
    private int zzf;
    private j54 zzj;
    private p64 zzn;
    private boolean zzo;
    private boolean zzr;
    private boolean zzs;
    private x64 zzu;
    private boolean zzv;
    private b74 zzz;
    private byte zzJ = 2;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private j14 zzk = z04.y();
    private j14 zzl = z04.y();
    private String zzm = "";
    private j14 zzp = z04.y();
    private String zzq = "";
    private rz3 zzt = rz3.f14393b;
    private String zzw = "";
    private j14 zzx = z04.y();
    private j14 zzy = z04.y();
    private j14 zzA = z04.y();
    private String zzC = "";
    private j14 zzE = z04.y();
    private j14 zzH = z04.y();
    private j14 zzI = z04.y();

    static {
        c74 c74Var = new c74();
        zzb = c74Var;
        z04.E(c74.class, c74Var);
    }

    private c74() {
    }

    public static h54 M() {
        return (h54) zzb.l();
    }

    static /* synthetic */ void R(c74 c74Var, String str) {
        str.getClass();
        c74Var.zzd |= 4;
        c74Var.zzg = str;
    }

    static /* synthetic */ void S(c74 c74Var, String str) {
        str.getClass();
        c74Var.zzd |= 8;
        c74Var.zzh = str;
    }

    static /* synthetic */ void T(c74 c74Var, j54 j54Var) {
        j54Var.getClass();
        c74Var.zzj = j54Var;
        c74Var.zzd |= 32;
    }

    static /* synthetic */ void U(c74 c74Var, v64 v64Var) {
        v64Var.getClass();
        j14 j14Var = c74Var.zzk;
        if (!j14Var.l()) {
            c74Var.zzk = z04.z(j14Var);
        }
        c74Var.zzk.add(v64Var);
    }

    static /* synthetic */ void V(c74 c74Var, String str) {
        c74Var.zzd |= 64;
        c74Var.zzm = str;
    }

    static /* synthetic */ void W(c74 c74Var) {
        c74Var.zzd &= -65;
        c74Var.zzm = zzb.zzm;
    }

    static /* synthetic */ void X(c74 c74Var, p64 p64Var) {
        p64Var.getClass();
        c74Var.zzn = p64Var;
        c74Var.zzd |= 128;
    }

    static /* synthetic */ void Y(c74 c74Var, x64 x64Var) {
        x64Var.getClass();
        c74Var.zzu = x64Var;
        c74Var.zzd |= 8192;
    }

    static /* synthetic */ void Z(c74 c74Var, Iterable iterable) {
        j14 j14Var = c74Var.zzx;
        if (!j14Var.l()) {
            c74Var.zzx = z04.z(j14Var);
        }
        az3.d(iterable, c74Var.zzx);
    }

    static /* synthetic */ void a0(c74 c74Var, Iterable iterable) {
        j14 j14Var = c74Var.zzy;
        if (!j14Var.l()) {
            c74Var.zzy = z04.z(j14Var);
        }
        az3.d(iterable, c74Var.zzy);
    }

    static /* synthetic */ void b0(c74 c74Var, int i8) {
        c74Var.zze = i8 - 1;
        c74Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzJ);
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u001f\u0000\u0001\u0001\u001f\u001f\u0000\t\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b", new Object[]{"zzd", "zzg", "zzh", "zzi", "zzk", v64.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zze", q64.f13311a, "zzf", g54.f8223a, "zzj", "zzm", "zzn", "zzt", "zzl", i74.class, "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", o74.class, "zzB", "zzC", "zzD", "zzE", r54.class, "zzF", "zzG", z64.f18049a, "zzH", j64.class, "zzI", m64.class});
        }
        if (i9 == 3) {
            return new c74();
        }
        w44 w44Var = null;
        if (i9 == 4) {
            return new h54(w44Var);
        }
        if (i9 == 5) {
            return zzb;
        }
        this.zzJ = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final String O() {
        return this.zzm;
    }

    public final String P() {
        return this.zzg;
    }

    public final List Q() {
        return this.zzk;
    }
}
