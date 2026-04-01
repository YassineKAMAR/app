package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class wy2 extends z04 implements l24 {
    private static final g14 zzb = new uy2();
    private static final wy2 zzd;
    private int zzA;
    private int zzB;
    private long zzC;
    private int zzD;
    private long zzP;
    private int zzQ;
    private int zzR;
    private int zze;
    private int zzf;
    private long zzh;
    private long zzi;
    private long zzj;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private int zzw;
    private String zzg = "";
    private f14 zzk = z04.u();
    private String zzr = "";
    private String zzs = "";
    private String zzt = "";
    private String zzu = "";
    private String zzv = "";
    private String zzx = "";
    private String zzy = "";
    private i14 zzz = z04.w();
    private String zzE = "";
    private String zzF = "";
    private String zzG = "";
    private String zzH = "";
    private String zzI = "";
    private String zzJ = "";
    private String zzK = "";
    private String zzL = "";
    private String zzM = "";
    private String zzN = "";
    private String zzO = "";

    static {
        wy2 wy2Var = new wy2();
        zzd = wy2Var;
        z04.E(wy2.class, wy2Var);
    }

    private wy2() {
    }

    public static vy2 M() {
        return (vy2) zzd.l();
    }

    static /* synthetic */ void O(wy2 wy2Var, String str) {
        str.getClass();
        wy2Var.zzN = str;
    }

    static /* synthetic */ void P(wy2 wy2Var, String str) {
        str.getClass();
        wy2Var.zzO = str;
    }

    static /* synthetic */ void T(wy2 wy2Var, String str) {
        str.getClass();
        wy2Var.zzr = str;
    }

    static /* synthetic */ void U(wy2 wy2Var, String str) {
        str.getClass();
        wy2Var.zzu = str;
    }

    static /* synthetic */ void V(wy2 wy2Var, String str) {
        str.getClass();
        wy2Var.zzv = str;
    }

    static /* synthetic */ void X(wy2 wy2Var, Iterable iterable) {
        i14 i14Var = wy2Var.zzz;
        if (!i14Var.l()) {
            wy2Var.zzz = z04.x(i14Var);
        }
        az3.d(iterable, wy2Var.zzz);
    }

    static /* synthetic */ void a0(wy2 wy2Var, String str) {
        str.getClass();
        wy2Var.zzE = str;
    }

    static /* synthetic */ void b0(wy2 wy2Var, String str) {
        str.getClass();
        wy2Var.zzF = str;
    }

    static /* synthetic */ void c0(wy2 wy2Var, String str) {
        str.getClass();
        wy2Var.zzJ = str;
    }

    static /* synthetic */ void e0(wy2 wy2Var, String str) {
        str.getClass();
        wy2Var.zzL = str;
    }

    static /* synthetic */ void f0(wy2 wy2Var, String str) {
        str.getClass();
        wy2Var.zzM = str;
    }

    static /* synthetic */ void i0(wy2 wy2Var, int i8) {
        if (i8 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        wy2Var.zzA = i8 - 2;
    }

    static /* synthetic */ void j0(wy2 wy2Var, int i8) {
        if (i8 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        wy2Var.zzD = i8 - 2;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzd, "\u0000(\u0000\u0000\u0001((\u0000\u0002\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019%\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001f\u0002 \u0002!\u0002\"\u0002#\u0002$\u0002%,&\f'\f(\f", new Object[]{"zze", "zzl", "zzm", "zzq", "zzr", "zzu", "zzv", "zzw", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzs", "zzt", "zzx", "zzy", "zzz", "zzG", "zzH", "zzI", "zzP", "zzg", "zzh", "zzi", "zzj", "zzn", "zzo", "zzp", "zzk", "zzQ", "zzR", "zzf"});
        }
        if (i9 == 3) {
            return new wy2();
        }
        uy2 uy2Var = null;
        if (i9 == 4) {
            return new vy2(uy2Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzd;
    }
}
