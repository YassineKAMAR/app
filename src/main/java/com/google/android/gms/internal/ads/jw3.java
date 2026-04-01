package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jw3 extends z04 implements l24 {
    private static final jw3 zzb;
    private int zzd;
    private j14 zze = z04.y();

    static {
        jw3 jw3Var = new jw3();
        zzb = jw3Var;
        z04.E(jw3.class, jw3Var);
    }

    private jw3() {
    }

    public static gw3 O() {
        return (gw3) zzb.l();
    }

    public static jw3 R(InputStream inputStream, m04 m04Var) {
        return (jw3) z04.s(zzb, inputStream, m04Var);
    }

    static /* synthetic */ void U(jw3 jw3Var, iw3 iw3Var) {
        iw3Var.getClass();
        j14 j14Var = jw3Var.zze;
        if (!j14Var.l()) {
            jw3Var.zze = z04.z(j14Var);
        }
        jw3Var.zze.add(iw3Var);
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", iw3.class});
        }
        if (i9 == 3) {
            return new jw3();
        }
        fw3 fw3Var = null;
        if (i9 == 4) {
            return new gw3(fw3Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zze.size();
    }

    public final int N() {
        return this.zzd;
    }

    public final iw3 P(int i8) {
        return (iw3) this.zze.get(i8);
    }

    public final List S() {
        return this.zze;
    }
}
