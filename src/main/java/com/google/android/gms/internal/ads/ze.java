package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ze extends z04 implements l24 {
    private static final ze zzb;
    private long zzA;
    private long zzB;
    private long zzF;
    private long zzG;
    private long zzH;
    private long zzJ;
    private bf zzM;
    private ue zzaC;
    private long zzaI;
    private le zzaL;
    private ne zzaM;
    private int zzaP;
    private long zzaQ;
    private boolean zzaT;
    private long zzaV;
    private Cif zzaW;
    private we zzae;
    private ye zzag;
    private int zzar;
    private int zzas;
    private int zzat;
    private kf zzau;
    private int zzd;
    private int zze;
    private int zzf;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzt;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zzg = "";
    private String zzh = "";
    private String zzs = "";
    private String zzC = "";
    private String zzD = "D";
    private String zzE = "";
    private String zzI = "";
    private long zzK = -1;
    private long zzL = -1;
    private long zzN = -1;
    private long zzO = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private String zzT = "D";
    private String zzU = "D";
    private long zzV = -1;
    private int zzW = 1000;
    private int zzX = 1000;
    private long zzY = -1;
    private long zzZ = -1;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private int zzad = 1000;
    private j14 zzaf = z04.y();
    private long zzah = -1;
    private long zzai = -1;
    private long zzaj = -1;
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private String zzap = "D";
    private long zzaq = -1;
    private long zzav = -1;
    private int zzaw = 1000;
    private int zzax = 1000;
    private String zzay = "D";
    private j14 zzaz = z04.y();
    private int zzaA = 1000;
    private j14 zzaB = z04.y();
    private String zzaD = "";
    private long zzaE = -1;
    private long zzaF = -1;
    private long zzaG = -1;
    private long zzaH = -1;
    private long zzaJ = -1;
    private String zzaK = "";
    private long zzaN = -1;
    private long zzaO = -1;
    private String zzaR = "";
    private int zzaS = 2;
    private String zzaU = "";
    private long zzaX = -1;
    private String zzaY = "";

    static {
        ze zeVar = new ze();
        zzb = zeVar;
        z04.E(ze.class, zeVar);
    }

    private ze() {
    }

    static /* synthetic */ void A0(ze zeVar, int i8) {
        zeVar.zzX = i8 - 1;
        zeVar.zze |= 2048;
    }

    static /* synthetic */ void B0(ze zeVar, int i8) {
        zeVar.zzad = i8 - 1;
        zeVar.zze |= 131072;
    }

    static /* synthetic */ void C0(ze zeVar, int i8) {
        zeVar.zzaw = i8 - 1;
        zeVar.zzf |= 8;
    }

    static /* synthetic */ void D0(ze zeVar, int i8) {
        zeVar.zzax = i8 - 1;
        zeVar.zzf |= 16;
    }

    static /* synthetic */ void E0(ze zeVar, int i8) {
        zeVar.zzaP = i8 - 1;
        zeVar.zzf |= 1048576;
    }

    static /* synthetic */ void F0(ze zeVar, int i8) {
        zeVar.zzaS = 5;
        zeVar.zzf |= 8388608;
    }

    public static ze H0() {
        return zzb;
    }

    public static ze I0(byte[] bArr, m04 m04Var) {
        return (ze) z04.t(zzb, bArr, m04Var);
    }

    static /* synthetic */ void M(ze zeVar, long j8) {
        zeVar.zzd |= 134217728;
        zeVar.zzH = j8;
    }

    static /* synthetic */ void M0(ze zeVar, String str) {
        str.getClass();
        zeVar.zzd |= 1;
        zeVar.zzg = str;
    }

    static /* synthetic */ void N(ze zeVar, String str) {
        str.getClass();
        zeVar.zzd |= 268435456;
        zeVar.zzI = str;
    }

    static /* synthetic */ void N0(ze zeVar, String str) {
        str.getClass();
        zeVar.zzd |= 2;
        zeVar.zzh = str;
    }

    static /* synthetic */ void O(ze zeVar, long j8) {
        zeVar.zzd |= 536870912;
        zeVar.zzJ = j8;
    }

    static /* synthetic */ void O0(ze zeVar, long j8) {
        zeVar.zzd |= 4;
        zeVar.zzi = j8;
    }

    static /* synthetic */ void P(ze zeVar, long j8) {
        zeVar.zzd |= 1073741824;
        zeVar.zzK = j8;
    }

    static /* synthetic */ void P0(ze zeVar, long j8) {
        zeVar.zzd |= 16;
        zeVar.zzk = j8;
    }

    static /* synthetic */ void Q(ze zeVar, long j8) {
        zeVar.zzd |= Integer.MIN_VALUE;
        zeVar.zzL = j8;
    }

    static /* synthetic */ void Q0(ze zeVar, long j8) {
        zeVar.zzd |= 32;
        zeVar.zzl = j8;
    }

    static /* synthetic */ void R(ze zeVar, long j8) {
        zeVar.zze |= 2;
        zeVar.zzN = j8;
    }

    static /* synthetic */ void R0(ze zeVar, long j8) {
        zeVar.zzd |= 1024;
        zeVar.zzq = j8;
    }

    static /* synthetic */ void S(ze zeVar, long j8) {
        zeVar.zze |= 4;
        zeVar.zzO = j8;
    }

    static /* synthetic */ void S0(ze zeVar, long j8) {
        zeVar.zzd |= 2048;
        zeVar.zzr = j8;
    }

    static /* synthetic */ void T(ze zeVar, long j8) {
        zeVar.zze |= 8;
        zeVar.zzP = j8;
    }

    static /* synthetic */ void T0(ze zeVar, long j8) {
        zeVar.zzd |= 8192;
        zeVar.zzt = j8;
    }

    static /* synthetic */ void U(ze zeVar, long j8) {
        zeVar.zze |= 16;
        zeVar.zzQ = j8;
    }

    static /* synthetic */ void U0(ze zeVar, long j8) {
        zeVar.zzd |= 16384;
        zeVar.zzu = j8;
    }

    static /* synthetic */ void V(ze zeVar, long j8) {
        zeVar.zze |= 32;
        zeVar.zzR = j8;
    }

    static /* synthetic */ void V0(ze zeVar, long j8) {
        zeVar.zzd |= 32768;
        zeVar.zzv = j8;
    }

    static /* synthetic */ void W(ze zeVar, long j8) {
        zeVar.zze |= 64;
        zeVar.zzS = j8;
    }

    static /* synthetic */ void W0(ze zeVar, long j8) {
        zeVar.zzd |= 65536;
        zeVar.zzw = j8;
    }

    static /* synthetic */ void X(ze zeVar, String str) {
        str.getClass();
        zeVar.zze |= 128;
        zeVar.zzT = str;
    }

    static /* synthetic */ void X0(ze zeVar, long j8) {
        zeVar.zzd |= 524288;
        zeVar.zzz = j8;
    }

    static /* synthetic */ void Y(ze zeVar, String str) {
        str.getClass();
        zeVar.zze |= 256;
        zeVar.zzU = str;
    }

    static /* synthetic */ void Y0(ze zeVar, long j8) {
        zeVar.zzd |= 1048576;
        zeVar.zzA = j8;
    }

    static /* synthetic */ void Z(ze zeVar, long j8) {
        zeVar.zze |= 4096;
        zeVar.zzY = j8;
    }

    static /* synthetic */ void Z0(ze zeVar, long j8) {
        zeVar.zzd |= 2097152;
        zeVar.zzB = j8;
    }

    static /* synthetic */ void a0(ze zeVar, long j8) {
        zeVar.zze |= 8192;
        zeVar.zzZ = j8;
    }

    static /* synthetic */ void a1(ze zeVar, String str) {
        str.getClass();
        zeVar.zzd |= 4194304;
        zeVar.zzC = str;
    }

    static /* synthetic */ void b0(ze zeVar, long j8) {
        zeVar.zze |= 16384;
        zeVar.zzaa = j8;
    }

    static /* synthetic */ void b1(ze zeVar, String str) {
        str.getClass();
        zeVar.zzd |= 16777216;
        zeVar.zzE = str;
    }

    static /* synthetic */ void c0(ze zeVar, we weVar) {
        weVar.getClass();
        zeVar.zzae = weVar;
        zeVar.zze |= 262144;
    }

    static /* synthetic */ void c1(ze zeVar, long j8) {
        zeVar.zzd |= 33554432;
        zeVar.zzF = j8;
    }

    static /* synthetic */ void d0(ze zeVar, we weVar) {
        weVar.getClass();
        j14 j14Var = zeVar.zzaf;
        if (!j14Var.l()) {
            zeVar.zzaf = z04.z(j14Var);
        }
        zeVar.zzaf.add(weVar);
    }

    static /* synthetic */ void d1(ze zeVar, long j8) {
        zeVar.zzd |= 67108864;
        zeVar.zzG = j8;
    }

    static /* synthetic */ void f0(ze zeVar, ye yeVar) {
        yeVar.getClass();
        zeVar.zzag = yeVar;
        zeVar.zze |= 524288;
    }

    static /* synthetic */ void g0(ze zeVar, long j8) {
        zeVar.zze |= 2097152;
        zeVar.zzai = j8;
    }

    static /* synthetic */ void h0(ze zeVar, long j8) {
        zeVar.zze |= 4194304;
        zeVar.zzaj = j8;
    }

    static /* synthetic */ void i0(ze zeVar, long j8) {
        zeVar.zze |= 8388608;
        zeVar.zzak = j8;
    }

    static /* synthetic */ void j0(ze zeVar, long j8) {
        zeVar.zze |= 67108864;
        zeVar.zzan = j8;
    }

    static /* synthetic */ void k0(ze zeVar, long j8) {
        zeVar.zze |= 134217728;
        zeVar.zzao = j8;
    }

    static /* synthetic */ void l0(ze zeVar, String str) {
        str.getClass();
        zeVar.zze |= 268435456;
        zeVar.zzap = str;
    }

    public static ce m0() {
        return (ce) zzb.l();
    }

    static /* synthetic */ void n0(ze zeVar, long j8) {
        zeVar.zzf |= 512;
        zeVar.zzaE = j8;
    }

    static /* synthetic */ void o0(ze zeVar, long j8) {
        zeVar.zzf |= 1024;
        zeVar.zzaF = j8;
    }

    static /* synthetic */ void p0(ze zeVar, long j8) {
        zeVar.zzf |= 2048;
        zeVar.zzaG = j8;
    }

    static /* synthetic */ void q0(ze zeVar, long j8) {
        zeVar.zzf |= 4096;
        zeVar.zzaH = j8;
    }

    static /* synthetic */ void r0(ze zeVar, String str) {
        str.getClass();
        zeVar.zzf |= 32768;
        zeVar.zzaK = str;
    }

    static /* synthetic */ void s0(ze zeVar, String str) {
        str.getClass();
        zeVar.zzf |= 4194304;
        zeVar.zzaR = str;
    }

    static /* synthetic */ void t0(ze zeVar, boolean z7) {
        zeVar.zzf |= 16777216;
        zeVar.zzaT = z7;
    }

    static /* synthetic */ void u0(ze zeVar, long j8) {
        zeVar.zzf |= 67108864;
        zeVar.zzaV = j8;
    }

    static /* synthetic */ void z0(ze zeVar, int i8) {
        zeVar.zzW = i8 - 1;
        zeVar.zze |= 1024;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            e14 e14Var = ff.f7739a;
            return z04.B(zzb, "\u0001a\u0000\u0003\u0001Įa\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂU\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈV\u0019ဂZ\u001a᠌W\u001bဈ\u0016\u001cဇX\u001dဈ\u0018\u001eဈY\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌@EဉAFဂBGဂ8Hဂ9I᠌CJဂ)Kဈ\u0017L᠌DMဈEN\u001bO᠌FP\u001bQဉGRဈHSဂITဂJUဂKVဂLWဂMXဂNYဈOZဉP[ဉQ\\ဂR]ဂS^᠌TÉဉ[ĭဂ\\Įဈ]", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaQ", "zzA", "zzB", "zzaR", "zzaV", "zzaS", he.f8732a, "zzC", "zzaT", "zzE", "zzaU", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzaf", we.class, "zzR", "zzS", "zzT", "zzU", "zzW", e14Var, "zzX", e14Var, "zzae", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", e14Var, "zzag", "zzah", "zzai", "zzaj", "zzak", "zzan", "zzao", "zzaq", "zzar", ef.f7297a, "zzas", gf.f8306a, "zzap", "zzat", de.f6697a, "zzau", "zzav", "zzal", "zzam", "zzaw", e14Var, "zzV", "zzD", "zzax", e14Var, "zzay", "zzaz", se.class, "zzaA", e14Var, "zzaB", fe.class, "zzaC", "zzaD", "zzaE", "zzaF", "zzaG", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaN", "zzaO", "zzaP", pe.f12834a, "zzaW", "zzaX", "zzaY"});
        }
        if (i9 == 3) {
            return new ze();
        }
        be beVar = null;
        if (i9 == 4) {
            return new ce(beVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final Cif J0() {
        Cif cif = this.zzaW;
        return cif == null ? Cif.O() : cif;
    }

    public final String K0() {
        return this.zzaR;
    }

    public final String L0() {
        return this.zzC;
    }

    public final boolean v0() {
        return this.zzaT;
    }

    public final boolean w0() {
        return (this.zzd & 4194304) != 0;
    }

    public final boolean x0() {
        return (this.zzf & 134217728) != 0;
    }

    public final int y0() {
        int iA = ie.a(this.zzaS);
        if (iA == 0) {
            return 3;
        }
        return iA;
    }
}
