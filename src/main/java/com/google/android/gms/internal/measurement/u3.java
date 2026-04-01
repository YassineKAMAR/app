package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.v3;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.y8;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u3 extends y8<u3, a> implements oa {
    private static final u3 zzc;
    private static volatile ya<u3> zzd;
    private int zze;
    private int zzf;
    private h9<y3> zzg = y8.B();
    private h9<v3> zzh = y8.B();
    private boolean zzi;
    private boolean zzj;

    public static final class a extends y8.b<u3, a> implements oa {
        private a() {
            super(u3.zzc);
        }

        /* synthetic */ a(t3 t3Var) {
            this();
        }

        public final int s() {
            return ((u3) this.f19404b).K();
        }

        public final a t(int i8, v3.a aVar) {
            o();
            ((u3) this.f19404b).G(i8, (v3) ((y8) aVar.d()));
            return this;
        }

        public final a u(int i8, y3.a aVar) {
            o();
            ((u3) this.f19404b).H(i8, (y3) ((y8) aVar.d()));
            return this;
        }

        public final v3 v(int i8) {
            return ((u3) this.f19404b).F(i8);
        }

        public final int w() {
            return ((u3) this.f19404b).M();
        }

        public final y3 x(int i8) {
            return ((u3) this.f19404b).L(i8);
        }
    }

    static {
        u3 u3Var = new u3();
        zzc = u3Var;
        y8.t(u3.class, u3Var);
    }

    private u3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(int i8, v3 v3Var) {
        v3Var.getClass();
        h9<v3> h9Var = this.zzh;
        if (!h9Var.l()) {
            this.zzh = y8.o(h9Var);
        }
        this.zzh.set(i8, v3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(int i8, y3 y3Var) {
        y3Var.getClass();
        h9<y3> h9Var = this.zzg;
        if (!h9Var.l()) {
            this.zzg = y8.o(h9Var);
        }
        this.zzg.set(i8, y3Var);
    }

    public final v3 F(int i8) {
        return this.zzh.get(i8);
    }

    public final int K() {
        return this.zzh.size();
    }

    public final y3 L(int i8) {
        return this.zzg.get(i8);
    }

    public final int M() {
        return this.zzg.size();
    }

    public final List<v3> O() {
        return this.zzh;
    }

    public final List<y3> P() {
        return this.zzg;
    }

    public final boolean Q() {
        return (this.zze & 1) != 0;
    }

    public final int m() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.y8
    protected final Object q(int i8, Object obj, Object obj2) {
        t3 t3Var = null;
        switch (t3.f19223a[i8 - 1]) {
            case 1:
                return new u3();
            case 2:
                return new a(t3Var);
            case 3:
                return y8.r(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", y3.class, "zzh", v3.class, "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                ya<u3> aVar = zzd;
                if (aVar == null) {
                    synchronized (u3.class) {
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
