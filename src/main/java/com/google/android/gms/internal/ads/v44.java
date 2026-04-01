package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class v44 extends z04 implements l24 {
    private static final v44 zzb;
    private j14 zzd = z04.y();

    static {
        v44 v44Var = new v44();
        zzb = v44Var;
        z04.E(v44.class, v44Var);
    }

    private v44() {
    }

    public static u44 M() {
        return (u44) zzb.l();
    }

    static /* synthetic */ void O(v44 v44Var, t44 t44Var) {
        t44Var.getClass();
        j14 j14Var = v44Var.zzd;
        if (!j14Var.l()) {
            v44Var.zzd = z04.z(j14Var);
        }
        v44Var.zzd.add(t44Var);
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", t44.class});
        }
        if (i9 == 3) {
            return new v44();
        }
        r44 r44Var = null;
        if (i9 == 4) {
            return new u44(r44Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
