package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.y8;

/* JADX INFO: loaded from: classes.dex */
public final class f5 extends y8<f5, a> implements oa {
    private static final f5 zzc;
    private static volatile ya<f5> zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    public static final class a extends y8.b<f5, a> implements oa {
        private a() {
            super(f5.zzc);
        }

        /* synthetic */ a(r4 r4Var) {
            this();
        }

        public final a s() {
            o();
            ((f5) this.f19404b).f0();
            return this;
        }

        public final a t(double d8) {
            o();
            ((f5) this.f19404b).G(d8);
            return this;
        }

        public final a u(long j8) {
            o();
            ((f5) this.f19404b).H(j8);
            return this;
        }

        public final a v(String str) {
            o();
            ((f5) this.f19404b).M(str);
            return this;
        }

        public final a w() {
            o();
            ((f5) this.f19404b).g0();
            return this;
        }

        public final a x(long j8) {
            o();
            ((f5) this.f19404b).O(j8);
            return this;
        }

        public final a y(String str) {
            o();
            ((f5) this.f19404b).S(str);
            return this;
        }

        public final a z() {
            o();
            ((f5) this.f19404b).h0();
            return this;
        }
    }

    static {
        f5 f5Var = new f5();
        zzc = f5Var;
        y8.t(f5.class, f5Var);
    }

    private f5() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(double d8) {
        this.zze |= 32;
        this.zzk = d8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(long j8) {
        this.zze |= 8;
        this.zzi = j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(String str) {
        str.getClass();
        this.zze |= 2;
        this.zzg = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(long j8) {
        this.zze |= 1;
        this.zzf = j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(String str) {
        str.getClass();
        this.zze |= 4;
        this.zzh = str;
    }

    public static a W() {
        return zzc.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0() {
        this.zze &= -33;
        this.zzk = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0() {
        this.zze &= -9;
        this.zzi = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0() {
        this.zze &= -5;
        this.zzh = zzc.zzh;
    }

    public final double F() {
        return this.zzk;
    }

    public final float N() {
        return this.zzj;
    }

    public final long T() {
        return this.zzi;
    }

    public final long V() {
        return this.zzf;
    }

    public final String Y() {
        return this.zzg;
    }

    public final String Z() {
        return this.zzh;
    }

    public final boolean a0() {
        return (this.zze & 32) != 0;
    }

    public final boolean b0() {
        return (this.zze & 16) != 0;
    }

    public final boolean c0() {
        return (this.zze & 8) != 0;
    }

    public final boolean d0() {
        return (this.zze & 1) != 0;
    }

    public final boolean e0() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.y8
    protected final Object q(int i8, Object obj, Object obj2) {
        r4 r4Var = null;
        switch (r4.f19115a[i8 - 1]) {
            case 1:
                return new f5();
            case 2:
                return new a(r4Var);
            case 3:
                return y8.r(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                ya<f5> aVar = zzd;
                if (aVar == null) {
                    synchronized (f5.class) {
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
