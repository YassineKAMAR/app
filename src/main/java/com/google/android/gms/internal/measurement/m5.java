package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.y8;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m5 extends y8<m5, a> implements oa {
    private static final m5 zzc;
    private static volatile ya<m5> zzd;
    private h9<n5> zze = y8.B();

    public static final class a extends y8.b<m5, a> implements oa {
        private a() {
            super(m5.zzc);
        }

        /* synthetic */ a(l5 l5Var) {
            this();
        }
    }

    static {
        m5 m5Var = new m5();
        zzc = m5Var;
        y8.t(m5.class, m5Var);
    }

    private m5() {
    }

    public static m5 G() {
        return zzc;
    }

    public final List<n5> H() {
        return this.zze;
    }

    public final int m() {
        return this.zze.size();
    }

    @Override // com.google.android.gms.internal.measurement.y8
    protected final Object q(int i8, Object obj, Object obj2) {
        l5 l5Var = null;
        switch (l5.f18919a[i8 - 1]) {
            case 1:
                return new m5();
            case 2:
                return new a(l5Var);
            case 3:
                return y8.r(zzc, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", n5.class});
            case 4:
                return zzc;
            case 5:
                ya<m5> aVar = zzd;
                if (aVar == null) {
                    synchronized (m5.class) {
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
