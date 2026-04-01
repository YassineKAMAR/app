package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.y8;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d5 extends y8<d5, a> implements oa {
    private static final d5 zzc;
    private static volatile ya<d5> zzd;
    private i9 zze = y8.A();
    private i9 zzf = y8.A();
    private h9<v4> zzg = y8.B();
    private h9<e5> zzh = y8.B();

    public static final class a extends y8.b<d5, a> implements oa {
        private a() {
            super(d5.zzc);
        }

        /* synthetic */ a(r4 r4Var) {
            this();
        }

        public final a s() {
            o();
            ((d5) this.f19404b).b0();
            return this;
        }

        public final a t(Iterable<? extends v4> iterable) {
            o();
            ((d5) this.f19404b).H(iterable);
            return this;
        }

        public final a u() {
            o();
            ((d5) this.f19404b).c0();
            return this;
        }

        public final a v(Iterable<? extends Long> iterable) {
            o();
            ((d5) this.f19404b).L(iterable);
            return this;
        }

        public final a w() {
            o();
            ((d5) this.f19404b).d0();
            return this;
        }

        public final a x(Iterable<? extends e5> iterable) {
            o();
            ((d5) this.f19404b).P(iterable);
            return this;
        }

        public final a y() {
            o();
            ((d5) this.f19404b).e0();
            return this;
        }

        public final a z(Iterable<? extends Long> iterable) {
            o();
            ((d5) this.f19404b).T(iterable);
            return this;
        }
    }

    static {
        d5 d5Var = new d5();
        zzc = d5Var;
        y8.t(d5.class, d5Var);
    }

    private d5() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(Iterable<? extends v4> iterable) {
        h9<v4> h9Var = this.zzg;
        if (!h9Var.l()) {
            this.zzg = y8.o(h9Var);
        }
        f7.h(iterable, this.zzg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(Iterable<? extends Long> iterable) {
        i9 i9Var = this.zzf;
        if (!i9Var.l()) {
            this.zzf = y8.p(i9Var);
        }
        f7.h(iterable, this.zzf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(Iterable<? extends e5> iterable) {
        h9<e5> h9Var = this.zzh;
        if (!h9Var.l()) {
            this.zzh = y8.o(h9Var);
        }
        f7.h(iterable, this.zzh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(Iterable<? extends Long> iterable) {
        i9 i9Var = this.zze;
        if (!i9Var.l()) {
            this.zze = y8.p(i9Var);
        }
        f7.h(iterable, this.zze);
    }

    public static a U() {
        return zzc.w();
    }

    public static d5 W() {
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0() {
        this.zzg = y8.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0() {
        this.zzf = y8.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0() {
        this.zzh = y8.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e0() {
        this.zze = y8.A();
    }

    public final int I() {
        return this.zzf.size();
    }

    public final int M() {
        return this.zzh.size();
    }

    public final int Q() {
        return this.zze.size();
    }

    public final List<v4> X() {
        return this.zzg;
    }

    public final List<Long> Y() {
        return this.zzf;
    }

    public final List<e5> Z() {
        return this.zzh;
    }

    public final List<Long> a0() {
        return this.zze;
    }

    public final int m() {
        return this.zzg.size();
    }

    @Override // com.google.android.gms.internal.measurement.y8
    protected final Object q(int i8, Object obj, Object obj2) {
        r4 r4Var = null;
        switch (r4.f19115a[i8 - 1]) {
            case 1:
                return new d5();
            case 2:
                return new a(r4Var);
            case 3:
                return y8.r(zzc, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", v4.class, "zzh", e5.class});
            case 4:
                return zzc;
            case 5:
                ya<d5> aVar = zzd;
                if (aVar == null) {
                    synchronized (d5.class) {
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
