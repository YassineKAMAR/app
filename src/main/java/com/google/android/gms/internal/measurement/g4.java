package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.y8;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g4 extends y8<g4, a> implements oa {
    private static final g4 zzc;
    private static volatile ya<g4> zzd;
    private int zze;
    private boolean zzi;
    private h9<b> zzf = y8.B();
    private h9<c> zzg = y8.B();
    private h9<f> zzh = y8.B();
    private h9<b> zzj = y8.B();

    public static final class a extends y8.b<g4, a> implements oa {
        private a() {
            super(g4.zzc);
        }

        /* synthetic */ a(f4 f4Var) {
            this();
        }
    }

    public static final class b extends y8<b, a> implements oa {
        private static final b zzc;
        private static volatile ya<b> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        public static final class a extends y8.b<b, a> implements oa {
            private a() {
                super(b.zzc);
            }

            /* synthetic */ a(f4 f4Var) {
                this();
            }
        }

        static {
            b bVar = new b();
            zzc = bVar;
            y8.t(b.class, bVar);
        }

        private b() {
        }

        public final d G() {
            d dVarA = d.a(this.zzg);
            return dVarA == null ? d.CONSENT_STATUS_UNSPECIFIED : dVarA;
        }

        public final e H() {
            e eVarA = e.a(this.zzf);
            return eVarA == null ? e.CONSENT_TYPE_UNSPECIFIED : eVarA;
        }

        @Override // com.google.android.gms.internal.measurement.y8
        protected final Object q(int i8, Object obj, Object obj2) {
            f4 f4Var = null;
            switch (f4.f18697a[i8 - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a(f4Var);
                case 3:
                    return y8.r(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", e.c(), "zzg", d.c()});
                case 4:
                    return zzc;
                case 5:
                    ya<b> aVar = zzd;
                    if (aVar == null) {
                        synchronized (b.class) {
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

    public static final class c extends y8<c, a> implements oa {
        private static final c zzc;
        private static volatile ya<c> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        public static final class a extends y8.b<c, a> implements oa {
            private a() {
                super(c.zzc);
            }

            /* synthetic */ a(f4 f4Var) {
                this();
            }
        }

        static {
            c cVar = new c();
            zzc = cVar;
            y8.t(c.class, cVar);
        }

        private c() {
        }

        public final e G() {
            e eVarA = e.a(this.zzg);
            return eVarA == null ? e.CONSENT_TYPE_UNSPECIFIED : eVarA;
        }

        public final e H() {
            e eVarA = e.a(this.zzf);
            return eVarA == null ? e.CONSENT_TYPE_UNSPECIFIED : eVarA;
        }

        @Override // com.google.android.gms.internal.measurement.y8
        protected final Object q(int i8, Object obj, Object obj2) {
            f4 f4Var = null;
            switch (f4.f18697a[i8 - 1]) {
                case 1:
                    return new c();
                case 2:
                    return new a(f4Var);
                case 3:
                    return y8.r(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", e.c(), "zzg", e.c()});
                case 4:
                    return zzc;
                case 5:
                    ya<c> aVar = zzd;
                    if (aVar == null) {
                        synchronized (c.class) {
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

    public enum d implements e9 {
        CONSENT_STATUS_UNSPECIFIED(0),
        GRANTED(1),
        DENIED(2);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final d9<d> f18734e = new n4();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f18736a;

        d(int i8) {
            this.f18736a = i8;
        }

        public static d a(int i8) {
            if (i8 == 0) {
                return CONSENT_STATUS_UNSPECIFIED;
            }
            if (i8 == 1) {
                return GRANTED;
            }
            if (i8 != 2) {
                return null;
            }
            return DENIED;
        }

        public static g9 c() {
            return o4.f18992a;
        }

        @Override // com.google.android.gms.internal.measurement.e9
        public final int j() {
            return this.f18736a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + d.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f18736a + " name=" + name() + '>';
        }
    }

    public enum e implements e9 {
        CONSENT_TYPE_UNSPECIFIED(0),
        AD_STORAGE(1),
        ANALYTICS_STORAGE(2),
        AD_USER_DATA(3),
        AD_PERSONALIZATION(4);


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final d9<e> f18742g = new q4();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f18744a;

        e(int i8) {
            this.f18744a = i8;
        }

        public static e a(int i8) {
            if (i8 == 0) {
                return CONSENT_TYPE_UNSPECIFIED;
            }
            if (i8 == 1) {
                return AD_STORAGE;
            }
            if (i8 == 2) {
                return ANALYTICS_STORAGE;
            }
            if (i8 == 3) {
                return AD_USER_DATA;
            }
            if (i8 != 4) {
                return null;
            }
            return AD_PERSONALIZATION;
        }

        public static g9 c() {
            return p4.f19030a;
        }

        @Override // com.google.android.gms.internal.measurement.e9
        public final int j() {
            return this.f18744a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + e.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f18744a + " name=" + name() + '>';
        }
    }

    public static final class f extends y8<f, a> implements oa {
        private static final f zzc;
        private static volatile ya<f> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";

        public static final class a extends y8.b<f, a> implements oa {
            private a() {
                super(f.zzc);
            }

            /* synthetic */ a(f4 f4Var) {
                this();
            }
        }

        static {
            f fVar = new f();
            zzc = fVar;
            y8.t(f.class, fVar);
        }

        private f() {
        }

        public final String G() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.measurement.y8
        protected final Object q(int i8, Object obj, Object obj2) {
            f4 f4Var = null;
            switch (f4.f18697a[i8 - 1]) {
                case 1:
                    return new f();
                case 2:
                    return new a(f4Var);
                case 3:
                    return y8.r(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    ya<f> aVar = zzd;
                    if (aVar == null) {
                        synchronized (f.class) {
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

    static {
        g4 g4Var = new g4();
        zzc = g4Var;
        y8.t(g4.class, g4Var);
    }

    private g4() {
    }

    public static g4 G() {
        return zzc;
    }

    public final List<f> H() {
        return this.zzh;
    }

    public final List<b> I() {
        return this.zzf;
    }

    public final List<c> J() {
        return this.zzg;
    }

    public final boolean K() {
        return this.zzi;
    }

    public final boolean L() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.y8
    protected final Object q(int i8, Object obj, Object obj2) {
        f4 f4Var = null;
        switch (f4.f18697a[i8 - 1]) {
            case 1:
                return new g4();
            case 2:
                return new a(f4Var);
            case 3:
                return y8.r(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zze", "zzf", b.class, "zzg", c.class, "zzh", f.class, "zzi", "zzj", b.class});
            case 4:
                return zzc;
            case 5:
                ya<g4> aVar = zzd;
                if (aVar == null) {
                    synchronized (g4.class) {
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
