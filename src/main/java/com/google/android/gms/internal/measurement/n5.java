package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.y8;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n5 extends y8<n5, a> implements oa {
    private static final n5 zzc;
    private static volatile ya<n5> zzd;
    private int zze;
    private String zzf = "";
    private h9<p5> zzg = y8.B();

    public static final class a extends y8.b<n5, a> implements oa {
        private a() {
            super(n5.zzc);
        }

        /* synthetic */ a(l5 l5Var) {
            this();
        }
    }

    static {
        n5 n5Var = new n5();
        zzc = n5Var;
        y8.t(n5.class, n5Var);
    }

    private n5() {
    }

    public final String G() {
        return this.zzf;
    }

    public final List<p5> H() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.measurement.y8
    protected final Object q(int i8, Object obj, Object obj2) {
        l5 l5Var = null;
        switch (l5.f18919a[i8 - 1]) {
            case 1:
                return new n5();
            case 2:
                return new a(l5Var);
            case 3:
                return y8.r(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", p5.class});
            case 4:
                return zzc;
            case 5:
                ya<n5> aVar = zzd;
                if (aVar == null) {
                    synchronized (n5.class) {
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
