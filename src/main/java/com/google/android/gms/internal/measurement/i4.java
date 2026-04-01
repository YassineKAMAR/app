package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.y8;

/* JADX INFO: loaded from: classes.dex */
public final class i4 extends y8<i4, a> implements oa {
    private static final i4 zzc;
    private static volatile ya<i4> zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    public static final class a extends y8.b<i4, a> implements oa {
        private a() {
            super(i4.zzc);
        }

        /* synthetic */ a(f4 f4Var) {
            this();
        }

        public final int s() {
            return ((i4) this.f19404b).m();
        }

        public final a t(String str) {
            o();
            ((i4) this.f19404b).G(str);
            return this;
        }

        public final String u() {
            return ((i4) this.f19404b).I();
        }

        public final boolean v() {
            return ((i4) this.f19404b).J();
        }

        public final boolean w() {
            return ((i4) this.f19404b).K();
        }

        public final boolean x() {
            return ((i4) this.f19404b).L();
        }

        public final boolean y() {
            return ((i4) this.f19404b).M();
        }

        public final boolean z() {
            return ((i4) this.f19404b).N();
        }
    }

    static {
        i4 i4Var = new i4();
        zzc = i4Var;
        y8.t(i4.class, i4Var);
    }

    private i4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(String str) {
        str.getClass();
        this.zze |= 1;
        this.zzf = str;
    }

    public final String I() {
        return this.zzf;
    }

    public final boolean J() {
        return this.zzg;
    }

    public final boolean K() {
        return this.zzh;
    }

    public final boolean L() {
        return (this.zze & 2) != 0;
    }

    public final boolean M() {
        return (this.zze & 4) != 0;
    }

    public final boolean N() {
        return (this.zze & 8) != 0;
    }

    public final int m() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.y8
    protected final Object q(int i8, Object obj, Object obj2) {
        f4 f4Var = null;
        switch (f4.f18697a[i8 - 1]) {
            case 1:
                return new i4();
            case 2:
                return new a(f4Var);
            case 3:
                return y8.r(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                ya<i4> aVar = zzd;
                if (aVar == null) {
                    synchronized (i4.class) {
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
