package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.y8;

/* JADX INFO: loaded from: classes.dex */
public final class v4 extends y8<v4, a> implements oa {
    private static final v4 zzc;
    private static volatile ya<v4> zzd;
    private int zze;
    private int zzf;
    private long zzg;

    public static final class a extends y8.b<v4, a> implements oa {
        private a() {
            super(v4.zzc);
        }

        /* synthetic */ a(r4 r4Var) {
            this();
        }

        public final a s(int i8) {
            o();
            ((v4) this.f19404b).F(i8);
            return this;
        }

        public final a t(long j8) {
            o();
            ((v4) this.f19404b).G(j8);
            return this;
        }
    }

    static {
        v4 v4Var = new v4();
        zzc = v4Var;
        y8.t(v4.class, v4Var);
    }

    private v4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(int i8) {
        this.zze |= 1;
        this.zzf = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(long j8) {
        this.zze |= 2;
        this.zzg = j8;
    }

    public static a K() {
        return zzc.w();
    }

    public final long J() {
        return this.zzg;
    }

    public final boolean M() {
        return (this.zze & 2) != 0;
    }

    public final boolean N() {
        return (this.zze & 1) != 0;
    }

    public final int m() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.y8
    protected final Object q(int i8, Object obj, Object obj2) {
        r4 r4Var = null;
        switch (r4.f19115a[i8 - 1]) {
            case 1:
                return new v4();
            case 2:
                return new a(r4Var);
            case 3:
                return y8.r(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                ya<v4> aVar = zzd;
                if (aVar == null) {
                    synchronized (v4.class) {
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
