package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.y8;

/* JADX INFO: loaded from: classes.dex */
public final class x3 extends y8<x3, a> implements oa {
    private static final x3 zzc;
    private static volatile ya<x3> zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    public static final class a extends y8.b<x3, a> implements oa {
        private a() {
            super(x3.zzc);
        }

        /* synthetic */ a(t3 t3Var) {
            this();
        }
    }

    public enum b implements e9 {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final d9<b> f19370g = new a4();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f19372a;

        b(int i8) {
            this.f19372a = i8;
        }

        public static b a(int i8) {
            if (i8 == 0) {
                return UNKNOWN_COMPARISON_TYPE;
            }
            if (i8 == 1) {
                return LESS_THAN;
            }
            if (i8 == 2) {
                return GREATER_THAN;
            }
            if (i8 == 3) {
                return EQUAL;
            }
            if (i8 != 4) {
                return null;
            }
            return BETWEEN;
        }

        public static g9 c() {
            return b4.f18586a;
        }

        @Override // com.google.android.gms.internal.measurement.e9
        public final int j() {
            return this.f19372a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f19372a + " name=" + name() + '>';
        }
    }

    static {
        x3 x3Var = new x3();
        zzc = x3Var;
        y8.t(x3.class, x3Var);
    }

    private x3() {
    }

    public static x3 H() {
        return zzc;
    }

    public final b F() {
        b bVarA = b.a(this.zzf);
        return bVarA == null ? b.UNKNOWN_COMPARISON_TYPE : bVarA;
    }

    public final String I() {
        return this.zzh;
    }

    public final String J() {
        return this.zzj;
    }

    public final String K() {
        return this.zzi;
    }

    public final boolean L() {
        return this.zzg;
    }

    public final boolean M() {
        return (this.zze & 1) != 0;
    }

    public final boolean N() {
        return (this.zze & 4) != 0;
    }

    public final boolean O() {
        return (this.zze & 2) != 0;
    }

    public final boolean P() {
        return (this.zze & 16) != 0;
    }

    public final boolean Q() {
        return (this.zze & 8) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.y8
    protected final Object q(int i8, Object obj, Object obj2) {
        t3 t3Var = null;
        switch (t3.f19223a[i8 - 1]) {
            case 1:
                return new x3();
            case 2:
                return new a(t3Var);
            case 3:
                return y8.r(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", b.c(), "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                ya<x3> aVar = zzd;
                if (aVar == null) {
                    synchronized (x3.class) {
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
