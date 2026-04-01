package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.y8;

/* JADX INFO: loaded from: classes.dex */
public final class x4 extends y8<x4, a> implements oa {
    private static final x4 zzc;
    private static volatile ya<x4> zzd;
    private int zze;
    private String zzf = "";
    private long zzg;

    public static final class a extends y8.b<x4, a> implements oa {
        private a() {
            super(x4.zzc);
        }

        /* synthetic */ a(r4 r4Var) {
            this();
        }

        public final a s(long j8) {
            o();
            ((x4) this.f19404b).G(j8);
            return this;
        }

        public final a t(String str) {
            o();
            ((x4) this.f19404b).J(str);
            return this;
        }
    }

    static {
        x4 x4Var = new x4();
        zzc = x4Var;
        y8.t(x4.class, x4Var);
    }

    private x4() {
    }

    public static a F() {
        return zzc.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(long j8) {
        this.zze |= 2;
        this.zzg = j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(String str) {
        str.getClass();
        this.zze |= 1;
        this.zzf = str;
    }

    @Override // com.google.android.gms.internal.measurement.y8
    protected final Object q(int i8, Object obj, Object obj2) {
        r4 r4Var = null;
        switch (r4.f19115a[i8 - 1]) {
            case 1:
                return new x4();
            case 2:
                return new a(r4Var);
            case 3:
                return y8.r(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                ya<x4> aVar = zzd;
                if (aVar == null) {
                    synchronized (x4.class) {
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
