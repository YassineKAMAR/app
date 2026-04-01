package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.y8;

/* JADX INFO: loaded from: classes.dex */
public final class u4 extends y8<u4, a> implements oa {
    private static final u4 zzc;
    private static volatile ya<u4> zzd;
    private int zze;
    private int zzf;
    private d5 zzg;
    private d5 zzh;
    private boolean zzi;

    public static final class a extends y8.b<u4, a> implements oa {
        private a() {
            super(u4.zzc);
        }

        /* synthetic */ a(r4 r4Var) {
            this();
        }

        public final a s(int i8) {
            o();
            ((u4) this.f19404b).F(i8);
            return this;
        }

        public final a t(d5.a aVar) {
            o();
            ((u4) this.f19404b).J((d5) ((y8) aVar.d()));
            return this;
        }

        public final a u(d5 d5Var) {
            o();
            ((u4) this.f19404b).N(d5Var);
            return this;
        }

        public final a v(boolean z7) {
            o();
            ((u4) this.f19404b).K(z7);
            return this;
        }
    }

    static {
        u4 u4Var = new u4();
        zzc = u4Var;
        y8.t(u4.class, u4Var);
    }

    private u4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(int i8) {
        this.zze |= 1;
        this.zzf = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(d5 d5Var) {
        d5Var.getClass();
        this.zzg = d5Var;
        this.zze |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(boolean z7) {
        this.zze |= 8;
        this.zzi = z7;
    }

    public static a L() {
        return zzc.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(d5 d5Var) {
        d5Var.getClass();
        this.zzh = d5Var;
        this.zze |= 4;
    }

    public final d5 P() {
        d5 d5Var = this.zzg;
        return d5Var == null ? d5.W() : d5Var;
    }

    public final d5 Q() {
        d5 d5Var = this.zzh;
        return d5Var == null ? d5.W() : d5Var;
    }

    public final boolean R() {
        return this.zzi;
    }

    public final boolean S() {
        return (this.zze & 1) != 0;
    }

    public final boolean T() {
        return (this.zze & 8) != 0;
    }

    public final boolean U() {
        return (this.zze & 4) != 0;
    }

    public final int m() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.y8
    protected final Object q(int i8, Object obj, Object obj2) {
        r4 r4Var = null;
        switch (r4.f19115a[i8 - 1]) {
            case 1:
                return new u4();
            case 2:
                return new a(r4Var);
            case 3:
                return y8.r(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                ya<u4> aVar = zzd;
                if (aVar == null) {
                    synchronized (u4.class) {
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
