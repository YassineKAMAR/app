package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hq extends z04 implements l24 {
    private static final g14 zzb = new fq();
    private static final hq zzd;
    private int zze;
    private long zzf;
    private int zzg;
    private long zzh;
    private long zzi;
    private f14 zzj = z04.u();
    private aq zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private long zzr;

    static {
        hq hqVar = new hq();
        zzd = hqVar;
        z04.E(hq.class, hqVar);
    }

    private hq() {
    }

    static /* synthetic */ void M(hq hqVar, int i8) {
        hqVar.zzm = i8 - 1;
        hqVar.zze |= 64;
    }

    static /* synthetic */ void N(hq hqVar, int i8) {
        hqVar.zzn = i8 - 1;
        hqVar.zze |= 128;
    }

    static /* synthetic */ void O(hq hqVar, int i8) {
        hqVar.zzp = i8 - 1;
        hqVar.zze |= 512;
    }

    public static gq U() {
        return (gq) zzd.l();
    }

    public static hq W(byte[] bArr) {
        return (hq) z04.q(zzd, bArr);
    }

    static /* synthetic */ void Z(hq hqVar, long j8) {
        hqVar.zze |= 1;
        hqVar.zzf = j8;
    }

    static /* synthetic */ void a0(hq hqVar, long j8) {
        hqVar.zze |= 4;
        hqVar.zzh = j8;
    }

    static /* synthetic */ void b0(hq hqVar, long j8) {
        hqVar.zze |= 8;
        hqVar.zzi = j8;
    }

    static /* synthetic */ void c0(hq hqVar, Iterable iterable) {
        f14 f14Var = hqVar.zzj;
        if (!f14Var.l()) {
            hqVar.zzj = z04.v(f14Var);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            hqVar.zzj.S(((to) it.next()).j());
        }
    }

    static /* synthetic */ void d0(hq hqVar, aq aqVar) {
        aqVar.getClass();
        hqVar.zzk = aqVar;
        hqVar.zze |= 16;
    }

    static /* synthetic */ void e0(hq hqVar, int i8) {
        hqVar.zze |= 256;
        hqVar.zzo = i8;
    }

    static /* synthetic */ void f0(hq hqVar, lq lqVar) {
        hqVar.zzq = lqVar.j();
        hqVar.zze |= 1024;
    }

    static /* synthetic */ void g0(hq hqVar, long j8) {
        hqVar.zze |= 2048;
        hqVar.zzr = j8;
    }

    static /* synthetic */ void m0(hq hqVar, int i8) {
        hqVar.zzg = i8 - 1;
        hqVar.zze |= 2;
    }

    static /* synthetic */ void n0(hq hqVar, int i8) {
        hqVar.zzl = i8 - 1;
        hqVar.zze |= 32;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            e14 e14Var = jp.f9734a;
            return z04.B(zzd, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zze", "zzf", "zzg", e14Var, "zzh", "zzi", "zzj", so.f14774a, "zzk", "zzl", e14Var, "zzm", e14Var, "zzn", e14Var, "zzo", "zzp", e14Var, "zzq", kq.f10226a, "zzr"});
        }
        if (i9 == 3) {
            return new hq();
        }
        co coVar = null;
        if (i9 == 4) {
            return new gq(coVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzd;
    }

    public final int P() {
        return this.zzo;
    }

    public final long Q() {
        return this.zzi;
    }

    public final long R() {
        return this.zzh;
    }

    public final long S() {
        return this.zzf;
    }

    public final aq T() {
        aq aqVar = this.zzk;
        return aqVar == null ? aq.O() : aqVar;
    }

    public final lq X() {
        lq lqVarA = lq.a(this.zzq);
        return lqVarA == null ? lq.UNSPECIFIED : lqVarA;
    }

    public final List Y() {
        return new h14(this.zzj, zzb);
    }

    public final int h0() {
        int iA = kp.a(this.zzm);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int i0() {
        int iA = kp.a(this.zzn);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int j0() {
        int iA = kp.a(this.zzp);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int k0() {
        int iA = kp.a(this.zzg);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int l0() {
        int iA = kp.a(this.zzl);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
