package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.y8;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j4 extends y8<j4, a> implements oa {
    private static final j4 zzc;
    private static volatile ya<j4> zzd;
    private int zze;
    private long zzf;
    private int zzh;
    private boolean zzm;
    private g4 zzt;
    private k4 zzu;
    private String zzg = "";
    private h9<m4> zzi = y8.B();
    private h9<i4> zzj = y8.B();
    private h9<u3> zzk = y8.B();
    private String zzl = "";
    private h9<o5> zzn = y8.B();
    private h9<h4> zzo = y8.B();
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private String zzs = "";

    public static final class a extends y8.b<j4, a> implements oa {
        private a() {
            super(j4.zzc);
        }

        /* synthetic */ a(f4 f4Var) {
            this();
        }

        public final int s() {
            return ((j4) this.f19404b).J();
        }

        public final i4 t(int i8) {
            return ((j4) this.f19404b).F(i8);
        }

        public final a u(int i8, i4.a aVar) {
            o();
            ((j4) this.f19404b).G(i8, (i4) ((y8) aVar.d()));
            return this;
        }

        public final a v() {
            o();
            ((j4) this.f19404b).b0();
            return this;
        }

        public final String w() {
            return ((j4) this.f19404b).S();
        }

        public final List<u3> x() {
            return Collections.unmodifiableList(((j4) this.f19404b).T());
        }

        public final List<h4> y() {
            return Collections.unmodifiableList(((j4) this.f19404b).U());
        }
    }

    static {
        j4 j4Var = new j4();
        zzc = j4Var;
        y8.t(j4.class, j4Var);
    }

    private j4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(int i8, i4 i4Var) {
        i4Var.getClass();
        h9<i4> h9Var = this.zzj;
        if (!h9Var.l()) {
            this.zzj = y8.o(h9Var);
        }
        this.zzj.set(i8, i4Var);
    }

    public static a M() {
        return zzc.w();
    }

    public static j4 O() {
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0() {
        this.zzk = y8.B();
    }

    public final i4 F(int i8) {
        return this.zzj.get(i8);
    }

    public final int J() {
        return this.zzj.size();
    }

    public final long K() {
        return this.zzf;
    }

    public final g4 L() {
        g4 g4Var = this.zzt;
        return g4Var == null ? g4.G() : g4Var;
    }

    public final String P() {
        return this.zzg;
    }

    public final String Q() {
        return this.zzr;
    }

    public final String R() {
        return this.zzq;
    }

    public final String S() {
        return this.zzp;
    }

    public final List<u3> T() {
        return this.zzk;
    }

    public final List<h4> U() {
        return this.zzo;
    }

    public final List<o5> V() {
        return this.zzn;
    }

    public final List<m4> W() {
        return this.zzi;
    }

    public final boolean X() {
        return this.zzm;
    }

    public final boolean Y() {
        return (this.zze & 512) != 0;
    }

    public final boolean Z() {
        return (this.zze & 2) != 0;
    }

    public final boolean a0() {
        return (this.zze & 1) != 0;
    }

    public final int m() {
        return this.zzn.size();
    }

    @Override // com.google.android.gms.internal.measurement.y8
    protected final Object q(int i8, Object obj, Object obj2) {
        f4 f4Var = null;
        switch (f4.f18697a[i8 - 1]) {
            case 1:
                return new j4();
            case 2:
                return new a(f4Var);
            case 3:
                return y8.r(zzc, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\fဈ\u0006\rဈ\u0007\u000eဈ\b\u000fဉ\t\u0010ဉ\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", m4.class, "zzj", i4.class, "zzk", u3.class, "zzl", "zzm", "zzn", o5.class, "zzo", h4.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
            case 4:
                return zzc;
            case 5:
                ya<j4> aVar = zzd;
                if (aVar == null) {
                    synchronized (j4.class) {
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
