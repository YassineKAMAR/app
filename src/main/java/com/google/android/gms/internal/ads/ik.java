package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ik extends z04 implements l24 {
    private static final ik zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private long zzh;
    private long zzi;

    static {
        ik ikVar = new ik();
        zzb = ikVar;
        z04.E(ik.class, ikVar);
    }

    private ik() {
    }

    public static hk P() {
        return (hk) zzb.l();
    }

    public static ik R() {
        return zzb;
    }

    public static ik S(rz3 rz3Var) {
        return (ik) z04.p(zzb, rz3Var);
    }

    public static ik T(rz3 rz3Var, m04 m04Var) {
        return (ik) z04.r(zzb, rz3Var, m04Var);
    }

    static /* synthetic */ void W(ik ikVar, String str) {
        str.getClass();
        ikVar.zzd |= 1;
        ikVar.zze = str;
    }

    static /* synthetic */ void X(ik ikVar, long j8) {
        ikVar.zzd |= 16;
        ikVar.zzi = j8;
    }

    static /* synthetic */ void Y(ik ikVar, String str) {
        str.getClass();
        ikVar.zzd |= 2;
        ikVar.zzf = str;
    }

    static /* synthetic */ void Z(ik ikVar, long j8) {
        ikVar.zzd |= 4;
        ikVar.zzg = j8;
    }

    static /* synthetic */ void a0(ik ikVar, long j8) {
        ikVar.zzd |= 8;
        ikVar.zzh = j8;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i9 == 3) {
            return new ik();
        }
        gk gkVar = null;
        if (i9 == 4) {
            return new hk(gkVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final long M() {
        return this.zzh;
    }

    public final long N() {
        return this.zzg;
    }

    public final long O() {
        return this.zzi;
    }

    public final String U() {
        return this.zzf;
    }

    public final String V() {
        return this.zze;
    }
}
