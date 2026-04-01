package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.y8;

/* JADX INFO: loaded from: classes.dex */
public final class k4 extends y8<k4, a> implements oa {
    private static final k4 zzc;
    private static volatile ya<k4> zzd;
    private int zze;
    private int zzf = 14;
    private int zzg = 11;
    private int zzh = 60;

    public static final class a extends y8.b<k4, a> implements oa {
        private a() {
            super(k4.zzc);
        }

        /* synthetic */ a(f4 f4Var) {
            this();
        }
    }

    static {
        k4 k4Var = new k4();
        zzc = k4Var;
        y8.t(k4.class, k4Var);
    }

    private k4() {
    }

    @Override // com.google.android.gms.internal.measurement.y8
    protected final Object q(int i8, Object obj, Object obj2) {
        f4 f4Var = null;
        switch (f4.f18697a[i8 - 1]) {
            case 1:
                return new k4();
            case 2:
                return new a(f4Var);
            case 3:
                return y8.r(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                ya<k4> aVar = zzd;
                if (aVar == null) {
                    synchronized (k4.class) {
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
