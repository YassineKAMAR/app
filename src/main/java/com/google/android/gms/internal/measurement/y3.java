package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.y8;

/* JADX INFO: loaded from: classes.dex */
public final class y3 extends y8<y3, a> implements oa {
    private static final y3 zzc;
    private static volatile ya<y3> zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private w3 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public static final class a extends y8.b<y3, a> implements oa {
        private a() {
            super(y3.zzc);
        }

        /* synthetic */ a(t3 t3Var) {
            this();
        }

        public final a s(String str) {
            o();
            ((y3) this.f19404b).G(str);
            return this;
        }
    }

    static {
        y3 y3Var = new y3();
        zzc = y3Var;
        y8.t(y3.class, y3Var);
    }

    private y3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(String str) {
        str.getClass();
        this.zze |= 2;
        this.zzg = str;
    }

    public static a I() {
        return zzc.w();
    }

    public final w3 H() {
        w3 w3Var = this.zzh;
        return w3Var == null ? w3.I() : w3Var;
    }

    public final String K() {
        return this.zzg;
    }

    public final boolean L() {
        return this.zzi;
    }

    public final boolean M() {
        return this.zzj;
    }

    public final boolean N() {
        return this.zzk;
    }

    public final boolean O() {
        return (this.zze & 1) != 0;
    }

    public final boolean P() {
        return (this.zze & 32) != 0;
    }

    public final int m() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.y8
    protected final Object q(int i8, Object obj, Object obj2) {
        t3 t3Var = null;
        switch (t3.f19223a[i8 - 1]) {
            case 1:
                return new y3();
            case 2:
                return new a(t3Var);
            case 3:
                return y8.r(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                ya<y3> aVar = zzd;
                if (aVar == null) {
                    synchronized (y3.class) {
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
