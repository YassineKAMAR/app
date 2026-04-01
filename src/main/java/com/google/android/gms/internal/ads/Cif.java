package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.if, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class Cif extends z04 implements l24 {
    private static final Cif zzb;
    private int zzd;
    private long zze;
    private String zzf = "";
    private rz3 zzg = rz3.f14393b;

    static {
        Cif cif = new Cif();
        zzb = cif;
        z04.E(Cif.class, cif);
    }

    private Cif() {
    }

    public static Cif O() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new Cif();
        }
        be beVar = null;
        if (i9 == 4) {
            return new hf(beVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final long M() {
        return this.zze;
    }

    public final boolean P() {
        return (this.zzd & 1) != 0;
    }
}
