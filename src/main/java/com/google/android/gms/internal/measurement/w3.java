package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.y8;

/* JADX INFO: loaded from: classes.dex */
public final class w3 extends y8<w3, a> implements oa {
    private static final w3 zzc;
    private static volatile ya<w3> zzd;
    private int zze;
    private z3 zzf;
    private x3 zzg;
    private boolean zzh;
    private String zzi = "";

    public static final class a extends y8.b<w3, a> implements oa {
        private a() {
            super(w3.zzc);
        }

        /* synthetic */ a(t3 t3Var) {
            this();
        }

        public final a s(String str) {
            o();
            ((w3) this.f19404b).H(str);
            return this;
        }
    }

    static {
        w3 w3Var = new w3();
        zzc = w3Var;
        y8.t(w3.class, w3Var);
    }

    private w3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(String str) {
        str.getClass();
        this.zze |= 8;
        this.zzi = str;
    }

    public static w3 I() {
        return zzc;
    }

    public final x3 J() {
        x3 x3Var = this.zzg;
        return x3Var == null ? x3.H() : x3Var;
    }

    public final z3 K() {
        z3 z3Var = this.zzf;
        return z3Var == null ? z3.H() : z3Var;
    }

    public final String L() {
        return this.zzi;
    }

    public final boolean M() {
        return this.zzh;
    }

    public final boolean N() {
        return (this.zze & 4) != 0;
    }

    public final boolean O() {
        return (this.zze & 2) != 0;
    }

    public final boolean P() {
        return (this.zze & 8) != 0;
    }

    public final boolean Q() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.y8
    protected final Object q(int i8, Object obj, Object obj2) {
        t3 t3Var = null;
        switch (t3.f19223a[i8 - 1]) {
            case 1:
                return new w3();
            case 2:
                return new a(t3Var);
            case 3:
                return y8.r(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                ya<w3> aVar = zzd;
                if (aVar == null) {
                    synchronized (w3.class) {
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
