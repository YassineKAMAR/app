package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.y8;

/* JADX INFO: loaded from: classes.dex */
public final class z4 extends y8<z4, a> implements oa {
    private static final z4 zzc;
    private static volatile ya<z4> zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private s4 zzh;

    public static final class a extends y8.b<z4, a> implements oa {
        private a() {
            super(z4.zzc);
        }

        /* synthetic */ a(r4 r4Var) {
            this();
        }
    }

    static {
        z4 z4Var = new z4();
        zzc = z4Var;
        y8.t(z4.class, z4Var);
    }

    private z4() {
    }

    @Override // com.google.android.gms.internal.measurement.y8
    protected final Object q(int i8, Object obj, Object obj2) {
        r4 r4Var = null;
        switch (r4.f19115a[i8 - 1]) {
            case 1:
                return new z4();
            case 2:
                return new a(r4Var);
            case 3:
                return y8.r(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                ya<z4> aVar = zzd;
                if (aVar == null) {
                    synchronized (z4.class) {
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
