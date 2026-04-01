package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class vv3 extends z04 implements l24 {
    private static final vv3 zzb;
    private String zzd = "";
    private rz3 zze = rz3.f14393b;
    private int zzf;

    static {
        vv3 vv3Var = new vv3();
        zzb = vv3Var;
        z04.E(vv3.class, vv3Var);
    }

    private vv3() {
    }

    public static sv3 M() {
        return (sv3) zzb.l();
    }

    public static vv3 P() {
        return zzb;
    }

    static /* synthetic */ void S(vv3 vv3Var, String str) {
        str.getClass();
        vv3Var.zzd = str;
    }

    static /* synthetic */ void T(vv3 vv3Var, rz3 rz3Var) {
        rz3Var.getClass();
        vv3Var.zze = rz3Var;
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new vv3();
        }
        rv3 rv3Var = null;
        if (i9 == 4) {
            return new sv3(rv3Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final uv3 N() {
        int i8 = this.zzf;
        uv3 uv3Var = uv3.UNKNOWN_KEYMATERIAL;
        uv3 uv3Var2 = i8 != 0 ? i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? null : uv3.REMOTE : uv3.ASYMMETRIC_PUBLIC : uv3.ASYMMETRIC_PRIVATE : uv3.SYMMETRIC : uv3.UNKNOWN_KEYMATERIAL;
        return uv3Var2 == null ? uv3.UNRECOGNIZED : uv3Var2;
    }

    public final rz3 Q() {
        return this.zze;
    }

    public final String R() {
        return this.zzd;
    }
}
