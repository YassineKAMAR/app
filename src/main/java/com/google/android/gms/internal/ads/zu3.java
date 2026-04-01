package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zu3 extends z04 implements l24 {
    private static final zu3 zzb;
    private int zzd;
    private int zze;

    static {
        zu3 zu3Var = new zu3();
        zzb = zu3Var;
        z04.E(zu3.class, zu3Var);
    }

    private zu3() {
    }

    public static yu3 N() {
        return (yu3) zzb.l();
    }

    public static zu3 P(rz3 rz3Var, m04 m04Var) {
        return (zu3) z04.r(zzb, rz3Var, m04Var);
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzd"});
        }
        if (i9 == 3) {
            return new zu3();
        }
        xu3 xu3Var = null;
        if (i9 == 4) {
            return new yu3(xu3Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zzd;
    }
}
