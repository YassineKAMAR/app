package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.y8;

/* JADX INFO: loaded from: classes.dex */
public final class l4 extends y8<l4, a> implements oa {
    private static final l4 zzc;
    private static volatile ya<l4> zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    public static final class a extends y8.b<l4, a> implements oa {
        private a() {
            super(l4.zzc);
        }

        /* synthetic */ a(f4 f4Var) {
            this();
        }
    }

    static {
        l4 l4Var = new l4();
        zzc = l4Var;
        y8.t(l4.class, l4Var);
    }

    private l4() {
    }

    @Override // com.google.android.gms.internal.measurement.y8
    protected final Object q(int i8, Object obj, Object obj2) {
        f4 f4Var = null;
        switch (f4.f18697a[i8 - 1]) {
            case 1:
                return new l4();
            case 2:
                return new a(f4Var);
            case 3:
                return y8.r(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                ya<l4> aVar = zzd;
                if (aVar == null) {
                    synchronized (l4.class) {
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
