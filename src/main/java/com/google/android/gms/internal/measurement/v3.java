package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.y8;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v3 extends y8<v3, a> implements oa {
    private static final v3 zzc;
    private static volatile ya<v3> zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private h9<w3> zzh = y8.B();
    private boolean zzi;
    private x3 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    public static final class a extends y8.b<v3, a> implements oa {
        private a() {
            super(v3.zzc);
        }

        /* synthetic */ a(t3 t3Var) {
            this();
        }

        public final int s() {
            return ((v3) this.f19404b).m();
        }

        public final a t(int i8, w3 w3Var) {
            o();
            ((v3) this.f19404b).G(i8, w3Var);
            return this;
        }

        public final a u(String str) {
            o();
            ((v3) this.f19404b).J(str);
            return this;
        }

        public final w3 v(int i8) {
            return ((v3) this.f19404b).F(i8);
        }

        public final String w() {
            return ((v3) this.f19404b).O();
        }
    }

    static {
        v3 v3Var = new v3();
        zzc = v3Var;
        y8.t(v3.class, v3Var);
    }

    private v3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(int i8, w3 w3Var) {
        w3Var.getClass();
        h9<w3> h9Var = this.zzh;
        if (!h9Var.l()) {
            this.zzh = y8.o(h9Var);
        }
        this.zzh.set(i8, w3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(String str) {
        str.getClass();
        this.zze |= 2;
        this.zzg = str;
    }

    public static a L() {
        return zzc.w();
    }

    public final w3 F(int i8) {
        return this.zzh.get(i8);
    }

    public final int K() {
        return this.zzf;
    }

    public final x3 N() {
        x3 x3Var = this.zzj;
        return x3Var == null ? x3.H() : x3Var;
    }

    public final String O() {
        return this.zzg;
    }

    public final List<w3> P() {
        return this.zzh;
    }

    public final boolean Q() {
        return this.zzk;
    }

    public final boolean R() {
        return this.zzl;
    }

    public final boolean S() {
        return this.zzm;
    }

    public final boolean T() {
        return (this.zze & 8) != 0;
    }

    public final boolean U() {
        return (this.zze & 1) != 0;
    }

    public final boolean V() {
        return (this.zze & 64) != 0;
    }

    public final int m() {
        return this.zzh.size();
    }

    @Override // com.google.android.gms.internal.measurement.y8
    protected final Object q(int i8, Object obj, Object obj2) {
        t3 t3Var = null;
        switch (t3.f19223a[i8 - 1]) {
            case 1:
                return new v3();
            case 2:
                return new a(t3Var);
            case 3:
                return y8.r(zzc, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", w3.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                ya<v3> aVar = zzd;
                if (aVar == null) {
                    synchronized (v3.class) {
                        aVar = zzd;
                        if (aVar == null) {
                            aVar = new y8.a<>(zzc);
                            zzd = aVar;
                        }
                        break;
                    }
                }
                return aVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
