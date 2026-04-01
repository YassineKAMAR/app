package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class e33 extends z04 implements l24 {
    private static final g14 zzb = new b33();
    private static final e33 zzd;
    private int zze;
    private f14 zzf = z04.u();
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        e33 e33Var = new e33();
        zzd = e33Var;
        z04.E(e33.class, e33Var);
    }

    private e33() {
    }

    public static d33 M() {
        return (d33) zzd.l();
    }

    static /* synthetic */ void O(e33 e33Var, String str) {
        str.getClass();
        e33Var.zze |= 1;
        e33Var.zzg = str;
    }

    static /* synthetic */ void P(e33 e33Var, int i8) {
        f14 f14Var = e33Var.zzf;
        if (!f14Var.l()) {
            e33Var.zzf = z04.v(f14Var);
        }
        e33Var.zzf.S(2);
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zze", "zzf", c33.f6138a, "zzg", "zzh", "zzi"});
        }
        if (i9 == 3) {
            return new e33();
        }
        b33 b33Var = null;
        if (i9 == 4) {
            return new d33(b33Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzd;
    }
}
