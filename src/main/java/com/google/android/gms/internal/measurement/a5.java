package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.y8;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a5 extends y8<a5, a> implements oa {
    private static final a5 zzc;
    private static volatile ya<a5> zzd;
    private int zze;
    private h9<b5> zzf = y8.B();
    private String zzg = "";

    public static final class a extends y8.b<a5, a> implements oa {
        private a() {
            super(a5.zzc);
        }

        /* synthetic */ a(r4 r4Var) {
            this();
        }

        public final int s() {
            return ((a5) this.f19404b).m();
        }

        public final a t(b5.a aVar) {
            o();
            ((a5) this.f19404b).H((b5) ((y8) aVar.d()));
            return this;
        }

        public final b5 u(int i8) {
            return ((a5) this.f19404b).F(0);
        }
    }

    static {
        a5 a5Var = new a5();
        zzc = a5Var;
        y8.t(a5.class, a5Var);
    }

    private a5() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(b5 b5Var) {
        b5Var.getClass();
        h9<b5> h9Var = this.zzf;
        if (!h9Var.l()) {
            this.zzf = y8.o(h9Var);
        }
        this.zzf.add(b5Var);
    }

    public static a I() {
        return zzc.w();
    }

    public final b5 F(int i8) {
        return this.zzf.get(0);
    }

    public final List<b5> K() {
        return this.zzf;
    }

    public final int m() {
        return this.zzf.size();
    }

    @Override // com.google.android.gms.internal.measurement.y8
    protected final Object q(int i8, Object obj, Object obj2) {
        r4 r4Var = null;
        switch (r4.f19115a[i8 - 1]) {
            case 1:
                return new a5();
            case 2:
                return new a(r4Var);
            case 3:
                return y8.r(zzc, "\u0001\u0002\u0000\u0001\u0001\u0007\u0002\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000", new Object[]{"zze", "zzf", b5.class, "zzg"});
            case 4:
                return zzc;
            case 5:
                ya<a5> aVar = zzd;
                if (aVar == null) {
                    synchronized (a5.class) {
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
