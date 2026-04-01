package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.y8;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y4 extends y8<y4, a> implements oa {
    private static final y4 zzc;
    private static volatile ya<y4> zzd;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private h9<y4> zzk = y8.B();

    public static final class a extends y8.b<y4, a> implements oa {
        private a() {
            super(y4.zzc);
        }

        /* synthetic */ a(r4 r4Var) {
            this();
        }

        public final a A() {
            o();
            ((y4) this.f19404b).p0();
            return this;
        }

        public final a B() {
            o();
            ((y4) this.f19404b).q0();
            return this;
        }

        public final a C() {
            o();
            ((y4) this.f19404b).r0();
            return this;
        }

        public final int s() {
            return ((y4) this.f19404b).U();
        }

        public final a t(double d8) {
            o();
            ((y4) this.f19404b).G(d8);
            return this;
        }

        public final a u(long j8) {
            o();
            ((y4) this.f19404b).H(j8);
            return this;
        }

        public final a v(a aVar) {
            o();
            ((y4) this.f19404b).Z((y4) ((y8) aVar.d()));
            return this;
        }

        public final a w(Iterable<? extends y4> iterable) {
            o();
            ((y4) this.f19404b).O(iterable);
            return this;
        }

        public final a x(String str) {
            o();
            ((y4) this.f19404b).P(str);
            return this;
        }

        public final a y() {
            o();
            ((y4) this.f19404b).j0();
            return this;
        }

        public final a z(String str) {
            o();
            ((y4) this.f19404b).T(str);
            return this;
        }
    }

    static {
        y4 y4Var = new y4();
        zzc = y4Var;
        y8.t(y4.class, y4Var);
    }

    private y4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(double d8) {
        this.zze |= 16;
        this.zzj = d8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(long j8) {
        this.zze |= 4;
        this.zzh = j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(Iterable<? extends y4> iterable) {
        s0();
        f7.h(iterable, this.zzk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(String str) {
        str.getClass();
        this.zze |= 1;
        this.zzf = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(String str) {
        str.getClass();
        this.zze |= 2;
        this.zzg = str;
    }

    public static a Y() {
        return zzc.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z(y4 y4Var) {
        y4Var.getClass();
        s0();
        this.zzk.add(y4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0() {
        this.zze &= -17;
        this.zzj = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0() {
        this.zze &= -5;
        this.zzh = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0() {
        this.zzk = y8.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0() {
        this.zze &= -3;
        this.zzg = zzc.zzg;
    }

    private final void s0() {
        h9<y4> h9Var = this.zzk;
        if (h9Var.l()) {
            return;
        }
        this.zzk = y8.o(h9Var);
    }

    public final double F() {
        return this.zzj;
    }

    public final float Q() {
        return this.zzi;
    }

    public final int U() {
        return this.zzk.size();
    }

    public final long W() {
        return this.zzh;
    }

    public final String b0() {
        return this.zzf;
    }

    public final String c0() {
        return this.zzg;
    }

    public final List<y4> d0() {
        return this.zzk;
    }

    public final boolean e0() {
        return (this.zze & 16) != 0;
    }

    public final boolean f0() {
        return (this.zze & 8) != 0;
    }

    public final boolean g0() {
        return (this.zze & 4) != 0;
    }

    public final boolean h0() {
        return (this.zze & 1) != 0;
    }

    public final boolean i0() {
        return (this.zze & 2) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.y8
    protected final Object q(int i8, Object obj, Object obj2) {
        r4 r4Var = null;
        switch (r4.f19115a[i8 - 1]) {
            case 1:
                return new y4();
            case 2:
                return new a(r4Var);
            case 3:
                return y8.r(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", y4.class});
            case 4:
                return zzc;
            case 5:
                ya<y4> aVar = zzd;
                if (aVar == null) {
                    synchronized (y4.class) {
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
