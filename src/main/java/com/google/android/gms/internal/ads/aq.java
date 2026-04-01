package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class aq extends z04 implements l24 {
    private static final aq zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        aq aqVar = new aq();
        zzb = aqVar;
        z04.E(aq.class, aqVar);
    }

    private aq() {
    }

    public static tp M() {
        return (tp) zzb.l();
    }

    public static aq O() {
        return zzb;
    }

    static /* synthetic */ void T(aq aqVar, int i8) {
        aqVar.zze = i8 - 1;
        aqVar.zzd |= 1;
    }

    static /* synthetic */ void U(aq aqVar, int i8) {
        aqVar.zzf = i8 - 1;
        aqVar.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", yp.f17871a, "zzf", vp.f16394a});
        }
        if (i9 == 3) {
            return new aq();
        }
        co coVar = null;
        if (i9 == 4) {
            return new tp(coVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final boolean P() {
        return (this.zzd & 2) != 0;
    }

    public final boolean Q() {
        return (this.zzd & 1) != 0;
    }

    public final int R() {
        int iA = wp.a(this.zzf);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int S() {
        int iA = zp.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
