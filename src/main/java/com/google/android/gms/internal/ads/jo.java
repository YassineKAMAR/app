package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class jo extends z04 implements l24 {
    private static final jo zzb;
    private int zzd;
    private int zze;
    private no zzf;
    private po zzg;

    static {
        jo joVar = new jo();
        zzb = joVar;
        z04.E(jo.class, joVar);
    }

    private jo() {
    }

    public static io M() {
        return (io) zzb.l();
    }

    static /* synthetic */ void O(jo joVar, no noVar) {
        noVar.getClass();
        joVar.zzf = noVar;
        joVar.zzd |= 2;
    }

    static /* synthetic */ void P(jo joVar, po poVar) {
        poVar.getClass();
        joVar.zzg = poVar;
        joVar.zzd |= 4;
    }

    static /* synthetic */ void Q(jo joVar, int i8) {
        joVar.zze = 1;
        joVar.zzd = 1 | joVar.zzd;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", lo.f10791a, "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new jo();
        }
        co coVar = null;
        if (i9 == 4) {
            return new io(coVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
