package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.y4;
import com.google.android.gms.internal.measurement.y8;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w4 extends y8<w4, a> implements oa {
    private static final w4 zzc;
    private static volatile ya<w4> zzd;
    private int zze;
    private h9<y4> zzf = y8.B();
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    public static final class a extends y8.b<w4, a> implements oa {
        private a() {
            super(w4.zzc);
        }

        /* synthetic */ a(r4 r4Var) {
            this();
        }

        public final a A(String str) {
            o();
            ((w4) this.f19404b).R(str);
            return this;
        }

        public final long B() {
            return ((w4) this.f19404b).W();
        }

        public final a C(long j8) {
            o();
            ((w4) this.f19404b).U(j8);
            return this;
        }

        public final y4 D(int i8) {
            return ((w4) this.f19404b).F(i8);
        }

        public final long E() {
            return ((w4) this.f19404b).X();
        }

        public final a F() {
            o();
            ((w4) this.f19404b).f0();
            return this;
        }

        public final String G() {
            return ((w4) this.f19404b).a0();
        }

        public final List<y4> H() {
            return Collections.unmodifiableList(((w4) this.f19404b).b0());
        }

        public final boolean I() {
            return ((w4) this.f19404b).e0();
        }

        public final int s() {
            return ((w4) this.f19404b).S();
        }

        public final a t(int i8) {
            o();
            ((w4) this.f19404b).T(i8);
            return this;
        }

        public final a u(int i8, y4.a aVar) {
            o();
            ((w4) this.f19404b).G(i8, (y4) ((y8) aVar.d()));
            return this;
        }

        public final a v(int i8, y4 y4Var) {
            o();
            ((w4) this.f19404b).G(i8, y4Var);
            return this;
        }

        public final a w(long j8) {
            o();
            ((w4) this.f19404b).H(j8);
            return this;
        }

        public final a x(y4.a aVar) {
            o();
            ((w4) this.f19404b).P((y4) ((y8) aVar.d()));
            return this;
        }

        public final a y(y4 y4Var) {
            o();
            ((w4) this.f19404b).P(y4Var);
            return this;
        }

        public final a z(Iterable<? extends y4> iterable) {
            o();
            ((w4) this.f19404b).Q(iterable);
            return this;
        }
    }

    static {
        w4 w4Var = new w4();
        zzc = w4Var;
        y8.t(w4.class, w4Var);
    }

    private w4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(int i8, y4 y4Var) {
        y4Var.getClass();
        g0();
        this.zzf.set(i8, y4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(long j8) {
        this.zze |= 4;
        this.zzi = j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(y4 y4Var) {
        y4Var.getClass();
        g0();
        this.zzf.add(y4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(Iterable<? extends y4> iterable) {
        g0();
        f7.h(iterable, this.zzf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(String str) {
        str.getClass();
        this.zze |= 1;
        this.zzg = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(int i8) {
        g0();
        this.zzf.remove(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(long j8) {
        this.zze |= 2;
        this.zzh = j8;
    }

    public static a Y() {
        return zzc.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0() {
        this.zzf = y8.B();
    }

    private final void g0() {
        h9<y4> h9Var = this.zzf;
        if (h9Var.l()) {
            return;
        }
        this.zzf = y8.o(h9Var);
    }

    public final y4 F(int i8) {
        return this.zzf.get(i8);
    }

    public final int S() {
        return this.zzf.size();
    }

    public final long W() {
        return this.zzi;
    }

    public final long X() {
        return this.zzh;
    }

    public final String a0() {
        return this.zzg;
    }

    public final List<y4> b0() {
        return this.zzf;
    }

    public final boolean c0() {
        return (this.zze & 8) != 0;
    }

    public final boolean d0() {
        return (this.zze & 4) != 0;
    }

    public final boolean e0() {
        return (this.zze & 2) != 0;
    }

    public final int m() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.measurement.y8
    protected final Object q(int i8, Object obj, Object obj2) {
        r4 r4Var = null;
        switch (r4.f19115a[i8 - 1]) {
            case 1:
                return new w4();
            case 2:
                return new a(r4Var);
            case 3:
                return y8.r(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", y4.class, "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                ya<w4> aVar = zzd;
                if (aVar == null) {
                    synchronized (w4.class) {
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
