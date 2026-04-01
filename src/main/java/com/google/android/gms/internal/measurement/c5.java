package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.x4;
import com.google.android.gms.internal.measurement.y8;

/* JADX INFO: loaded from: classes.dex */
public final class c5 extends y8<c5, b> implements oa {
    private static final c5 zzc;
    private static volatile ya<c5> zzd;
    private int zze;
    private int zzf = 1;
    private h9<x4> zzg = y8.B();

    public enum a implements e9 {
        RADS(1),
        PROVISIONING(2);


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final d9<a> f18616d = new k5();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f18618a;

        a(int i8) {
            this.f18618a = i8;
        }

        public static a a(int i8) {
            if (i8 == 1) {
                return RADS;
            }
            if (i8 != 2) {
                return null;
            }
            return PROVISIONING;
        }

        public static g9 c() {
            return j5.f18830a;
        }

        @Override // com.google.android.gms.internal.measurement.e9
        public final int j() {
            return this.f18618a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f18618a + " name=" + name() + '>';
        }
    }

    public static final class b extends y8.b<c5, b> implements oa {
        private b() {
            super(c5.zzc);
        }

        /* synthetic */ b(r4 r4Var) {
            this();
        }

        public final b s(x4.a aVar) {
            o();
            ((c5) this.f19404b).G((x4) ((y8) aVar.d()));
            return this;
        }
    }

    static {
        c5 c5Var = new c5();
        zzc = c5Var;
        y8.t(c5.class, c5Var);
    }

    private c5() {
    }

    public static b F() {
        return zzc.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(x4 x4Var) {
        x4Var.getClass();
        h9<x4> h9Var = this.zzg;
        if (!h9Var.l()) {
            this.zzg = y8.o(h9Var);
        }
        this.zzg.add(x4Var);
    }

    @Override // com.google.android.gms.internal.measurement.y8
    protected final Object q(int i8, Object obj, Object obj2) {
        r4 r4Var = null;
        switch (r4.f19115a[i8 - 1]) {
            case 1:
                return new c5();
            case 2:
                return new b(r4Var);
            case 3:
                return y8.r(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zze", "zzf", a.c(), "zzg", x4.class});
            case 4:
                return zzc;
            case 5:
                ya<c5> aVar = zzd;
                if (aVar == null) {
                    synchronized (c5.class) {
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
