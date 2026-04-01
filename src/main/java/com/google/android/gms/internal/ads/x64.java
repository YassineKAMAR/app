package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class x64 extends z04 implements l24 {
    private static final x64 zzb;
    private int zzd;
    private long zzf;
    private boolean zzg;
    private int zzh;
    private String zze = "";
    private String zzi = "";
    private String zzj = "";

    static {
        x64 x64Var = new x64();
        zzb = x64Var;
        z04.E(x64.class, x64Var);
    }

    private x64() {
    }

    public static w64 M() {
        return (w64) zzb.l();
    }

    static /* synthetic */ void O(x64 x64Var, String str) {
        x64Var.zzd |= 1;
        x64Var.zze = str;
    }

    static /* synthetic */ void P(x64 x64Var, long j8) {
        x64Var.zzd |= 2;
        x64Var.zzf = j8;
    }

    static /* synthetic */ void Q(x64 x64Var, boolean z7) {
        x64Var.zzd |= 4;
        x64Var.zzg = z7;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", y64.f17598a, "zzi", "zzj"});
        }
        if (i9 == 3) {
            return new x64();
        }
        w44 w44Var = null;
        if (i9 == 4) {
            return new w64(w44Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
