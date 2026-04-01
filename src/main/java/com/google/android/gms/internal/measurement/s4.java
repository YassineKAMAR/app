package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.y8;

/* JADX INFO: loaded from: classes.dex */
public final class s4 extends y8<s4, a> implements oa {
    private static final s4 zzc;
    private static volatile ya<s4> zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";

    public static final class a extends y8.b<s4, a> implements oa {
        private a() {
            super(s4.zzc);
        }

        /* synthetic */ a(r4 r4Var) {
            this();
        }
    }

    static {
        s4 s4Var = new s4();
        zzc = s4Var;
        y8.t(s4.class, s4Var);
    }

    private s4() {
    }

    @Override // com.google.android.gms.internal.measurement.y8
    protected final Object q(int i8, Object obj, Object obj2) {
        r4 r4Var = null;
        switch (r4.f19115a[i8 - 1]) {
            case 1:
                return new s4();
            case 2:
                return new a(r4Var);
            case 3:
                return y8.r(zzc, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            case 4:
                return zzc;
            case 5:
                ya<s4> aVar = zzd;
                if (aVar == null) {
                    synchronized (s4.class) {
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
