package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.y8;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o5 extends y8<o5, a> implements oa {
    private static final o5 zzc;
    private static volatile ya<o5> zzd;
    private int zze;
    private h9<p5> zzf = y8.B();
    private m5 zzg;

    public static final class a extends y8.b<o5, a> implements oa {
        private a() {
            super(o5.zzc);
        }

        /* synthetic */ a(l5 l5Var) {
            this();
        }
    }

    static {
        o5 o5Var = new o5();
        zzc = o5Var;
        y8.t(o5.class, o5Var);
    }

    private o5() {
    }

    public final m5 F() {
        m5 m5Var = this.zzg;
        return m5Var == null ? m5.G() : m5Var;
    }

    public final List<p5> H() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.y8
    protected final Object q(int i8, Object obj, Object obj2) {
        l5 l5Var = null;
        switch (l5.f18919a[i8 - 1]) {
            case 1:
                return new o5();
            case 2:
                return new a(l5Var);
            case 3:
                return y8.r(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", p5.class, "zzg"});
            case 4:
                return zzc;
            case 5:
                ya<o5> aVar = zzd;
                if (aVar == null) {
                    synchronized (o5.class) {
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
