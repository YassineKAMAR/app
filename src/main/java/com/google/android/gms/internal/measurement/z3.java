package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.y8;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z3 extends y8<z3, b> implements oa {
    private static final z3 zzc;
    private static volatile ya<z3> zzd;
    private int zze;
    private int zzf;
    private boolean zzh;
    private String zzg = "";
    private h9<String> zzi = y8.B();

    public enum a implements e9 {
        UNKNOWN_MATCH_TYPE(0),
        REGEXP(1),
        BEGINS_WITH(2),
        ENDS_WITH(3),
        PARTIAL(4),
        EXACT(5),
        IN_LIST(6);


        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final d9<a> f19430i = new e4();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f19432a;

        a(int i8) {
            this.f19432a = i8;
        }

        public static a a(int i8) {
            switch (i8) {
                case 0:
                    return UNKNOWN_MATCH_TYPE;
                case 1:
                    return REGEXP;
                case 2:
                    return BEGINS_WITH;
                case 3:
                    return ENDS_WITH;
                case 4:
                    return PARTIAL;
                case 5:
                    return EXACT;
                case 6:
                    return IN_LIST;
                default:
                    return null;
            }
        }

        public static g9 c() {
            return c4.f18613a;
        }

        @Override // com.google.android.gms.internal.measurement.e9
        public final int j() {
            return this.f19432a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f19432a + " name=" + name() + '>';
        }
    }

    public static final class b extends y8.b<z3, b> implements oa {
        private b() {
            super(z3.zzc);
        }

        /* synthetic */ b(t3 t3Var) {
            this();
        }
    }

    static {
        z3 z3Var = new z3();
        zzc = z3Var;
        y8.t(z3.class, z3Var);
    }

    private z3() {
    }

    public static z3 H() {
        return zzc;
    }

    public final a F() {
        a aVarA = a.a(this.zzf);
        return aVarA == null ? a.UNKNOWN_MATCH_TYPE : aVarA;
    }

    public final String I() {
        return this.zzg;
    }

    public final List<String> J() {
        return this.zzi;
    }

    public final boolean K() {
        return this.zzh;
    }

    public final boolean L() {
        return (this.zze & 4) != 0;
    }

    public final boolean M() {
        return (this.zze & 2) != 0;
    }

    public final boolean N() {
        return (this.zze & 1) != 0;
    }

    public final int m() {
        return this.zzi.size();
    }

    @Override // com.google.android.gms.internal.measurement.y8
    protected final Object q(int i8, Object obj, Object obj2) {
        t3 t3Var = null;
        switch (t3.f19223a[i8 - 1]) {
            case 1:
                return new z3();
            case 2:
                return new b(t3Var);
            case 3:
                return y8.r(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", a.c(), "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                ya<z3> aVar = zzd;
                if (aVar == null) {
                    synchronized (z3.class) {
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
