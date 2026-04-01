package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.y8;

/* JADX INFO: loaded from: classes.dex */
public final class h4 extends y8<h4, a> implements oa {
    private static final h4 zzc;
    private static volatile ya<h4> zzd;
    private int zze;
    private String zzf = "";
    private h9<l4> zzg = y8.B();
    private boolean zzh;

    public static final class a extends y8.b<h4, a> implements oa {
        private a() {
            super(h4.zzc);
        }

        /* synthetic */ a(f4 f4Var) {
            this();
        }
    }

    static {
        h4 h4Var = new h4();
        zzc = h4Var;
        y8.t(h4.class, h4Var);
    }

    private h4() {
    }

    public final String G() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.y8
    protected final Object q(int i8, Object obj, Object obj2) {
        f4 f4Var = null;
        switch (f4.f18697a[i8 - 1]) {
            case 1:
                return new h4();
            case 2:
                return new a(f4Var);
            case 3:
                return y8.r(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", l4.class, "zzh"});
            case 4:
                return zzc;
            case 5:
                ya<h4> aVar = zzd;
                if (aVar == null) {
                    synchronized (h4.class) {
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
