package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.y8;

/* JADX INFO: loaded from: classes.dex */
public final class t4 extends y8<t4, a> implements oa {
    private static final t4 zzc;
    private static volatile ya<t4> zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    public static final class a extends y8.b<t4, a> implements oa {
        private a() {
            super(t4.zzc);
        }

        /* synthetic */ a(r4 r4Var) {
            this();
        }

        public final a s(boolean z7) {
            o();
            ((t4) this.f19404b).H(z7);
            return this;
        }

        public final a t(boolean z7) {
            o();
            ((t4) this.f19404b).K(z7);
            return this;
        }

        public final a u(boolean z7) {
            o();
            ((t4) this.f19404b).N(z7);
            return this;
        }

        public final a v(boolean z7) {
            o();
            ((t4) this.f19404b).P(z7);
            return this;
        }

        public final a w(boolean z7) {
            o();
            ((t4) this.f19404b).S(z7);
            return this;
        }

        public final a x(boolean z7) {
            o();
            ((t4) this.f19404b).V(z7);
            return this;
        }

        public final a y(boolean z7) {
            o();
            ((t4) this.f19404b).Y(z7);
            return this;
        }
    }

    static {
        t4 t4Var = new t4();
        zzc = t4Var;
        y8.t(t4.class, t4Var);
    }

    private t4() {
    }

    public static a F() {
        return zzc.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(boolean z7) {
        this.zze |= 32;
        this.zzk = z7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(boolean z7) {
        this.zze |= 16;
        this.zzj = z7;
    }

    public static t4 L() {
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(boolean z7) {
        this.zze |= 1;
        this.zzf = z7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(boolean z7) {
        this.zze |= 64;
        this.zzl = z7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(boolean z7) {
        this.zze |= 2;
        this.zzg = z7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(boolean z7) {
        this.zze |= 4;
        this.zzh = z7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(boolean z7) {
        this.zze |= 8;
        this.zzi = z7;
    }

    public final boolean Q() {
        return this.zzk;
    }

    public final boolean T() {
        return this.zzj;
    }

    public final boolean W() {
        return this.zzf;
    }

    public final boolean Z() {
        return this.zzl;
    }

    public final boolean a0() {
        return this.zzg;
    }

    public final boolean b0() {
        return this.zzh;
    }

    public final boolean c0() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.y8
    protected final Object q(int i8, Object obj, Object obj2) {
        r4 r4Var = null;
        switch (r4.f19115a[i8 - 1]) {
            case 1:
                return new t4();
            case 2:
                return new a(r4Var);
            case 3:
                return y8.r(zzc, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            case 4:
                return zzc;
            case 5:
                ya<t4> aVar = zzd;
                if (aVar == null) {
                    synchronized (t4.class) {
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
