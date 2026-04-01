package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.y8;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e5 extends y8<e5, a> implements oa {
    private static final e5 zzc;
    private static volatile ya<e5> zzd;
    private int zze;
    private int zzf;
    private i9 zzg = y8.A();

    public static final class a extends y8.b<e5, a> implements oa {
        private a() {
            super(e5.zzc);
        }

        /* synthetic */ a(r4 r4Var) {
            this();
        }

        public final a s(int i8) {
            o();
            ((e5) this.f19404b).K(i8);
            return this;
        }

        public final a t(Iterable<? extends Long> iterable) {
            o();
            ((e5) this.f19404b).I(iterable);
            return this;
        }
    }

    static {
        e5 e5Var = new e5();
        zzc = e5Var;
        y8.t(e5.class, e5Var);
    }

    private e5() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(Iterable<? extends Long> iterable) {
        i9 i9Var = this.zzg;
        if (!i9Var.l()) {
            this.zzg = y8.p(i9Var);
        }
        f7.h(iterable, this.zzg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(int i8) {
        this.zze |= 1;
        this.zzf = i8;
    }

    public static a L() {
        return zzc.w();
    }

    public final long F(int i8) {
        return this.zzg.d(i8);
    }

    public final int J() {
        return this.zzf;
    }

    public final List<Long> N() {
        return this.zzg;
    }

    public final boolean O() {
        return (this.zze & 1) != 0;
    }

    public final int m() {
        return this.zzg.size();
    }

    @Override // com.google.android.gms.internal.measurement.y8
    protected final Object q(int i8, Object obj, Object obj2) {
        r4 r4Var = null;
        switch (r4.f19115a[i8 - 1]) {
            case 1:
                return new e5();
            case 2:
                return new a(r4Var);
            case 3:
                return y8.r(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                ya<e5> aVar = zzd;
                if (aVar == null) {
                    synchronized (e5.class) {
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
