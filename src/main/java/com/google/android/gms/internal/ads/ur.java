package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ur extends z04 implements l24 {
    private static final ur zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        ur urVar = new ur();
        zzb = urVar;
        z04.E(ur.class, urVar);
    }

    private ur() {
    }

    public static tr M() {
        return (tr) zzb.l();
    }

    static /* synthetic */ void O(ur urVar, boolean z7) {
        urVar.zzd |= 1;
        urVar.zze = z7;
    }

    static /* synthetic */ void P(ur urVar, int i8) {
        urVar.zzd |= 2;
        urVar.zzf = i8;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new ur();
        }
        co coVar = null;
        if (i9 == 4) {
            return new tr(coVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final boolean Q() {
        return this.zze;
    }
}
