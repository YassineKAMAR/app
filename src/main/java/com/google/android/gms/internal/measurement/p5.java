package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.y8;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p5 extends y8<p5, a> implements oa {
    private static final p5 zzc;
    private static volatile ya<p5> zzd;
    private int zze;
    private int zzf;
    private h9<p5> zzg = y8.B();
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    public static final class a extends y8.b<p5, a> implements oa {
        private a() {
            super(p5.zzc);
        }

        /* synthetic */ a(l5 l5Var) {
            this();
        }
    }

    public enum b implements e9 {
        UNKNOWN(0),
        STRING(1),
        NUMBER(2),
        BOOLEAN(3),
        STATEMENT(4);


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final d9<b> f19036g = new q5();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f19038a;

        b(int i8) {
            this.f19038a = i8;
        }

        public static b a(int i8) {
            if (i8 == 0) {
                return UNKNOWN;
            }
            if (i8 == 1) {
                return STRING;
            }
            if (i8 == 2) {
                return NUMBER;
            }
            if (i8 == 3) {
                return BOOLEAN;
            }
            if (i8 != 4) {
                return null;
            }
            return STATEMENT;
        }

        public static g9 c() {
            return s5.f19152a;
        }

        @Override // com.google.android.gms.internal.measurement.e9
        public final int j() {
            return this.f19038a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f19038a + " name=" + name() + '>';
        }
    }

    static {
        p5 p5Var = new p5();
        zzc = p5Var;
        y8.t(p5.class, p5Var);
    }

    private p5() {
    }

    public final double F() {
        return this.zzk;
    }

    public final b G() {
        b bVarA = b.a(this.zzf);
        return bVarA == null ? b.UNKNOWN : bVarA;
    }

    public final String I() {
        return this.zzh;
    }

    public final String J() {
        return this.zzi;
    }

    public final List<p5> K() {
        return this.zzg;
    }

    public final boolean L() {
        return this.zzj;
    }

    public final boolean M() {
        return (this.zze & 8) != 0;
    }

    public final boolean N() {
        return (this.zze & 16) != 0;
    }

    public final boolean O() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.y8
    protected final Object q(int i8, Object obj, Object obj2) {
        l5 l5Var = null;
        switch (l5.f18919a[i8 - 1]) {
            case 1:
                return new p5();
            case 2:
                return new a(l5Var);
            case 3:
                return y8.r(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", b.c(), "zzg", p5.class, "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                ya<p5> aVar = zzd;
                if (aVar == null) {
                    synchronized (p5.class) {
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
