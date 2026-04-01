package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
final class q<T> implements s3.d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f4891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f4892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z2.b<?> f4893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f4894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f4895e;

    q(b bVar, int i8, z2.b<?> bVar2, long j8, long j9, String str, String str2) {
        this.f4891a = bVar;
        this.f4892b = i8;
        this.f4893c = bVar2;
        this.f4894d = j8;
        this.f4895e = j9;
    }

    static <T> q<T> b(b bVar, int i8, z2.b<?> bVar2) {
        boolean zP;
        if (!bVar.f()) {
            return null;
        }
        a3.q qVarA = a3.p.b().a();
        if (qVarA == null) {
            zP = true;
        } else {
            if (!qVarA.n()) {
                return null;
            }
            zP = qVarA.p();
            m mVarW = bVar.w(bVar2);
            if (mVarW != null) {
                if (!(mVarW.s() instanceof a3.c)) {
                    return null;
                }
                a3.c cVar = (a3.c) mVarW.s();
                if (cVar.J() && !cVar.d()) {
                    a3.e eVarC = c(mVarW, cVar, i8);
                    if (eVarC == null) {
                        return null;
                    }
                    mVarW.D();
                    zP = eVarC.u();
                }
            }
        }
        return new q<>(bVar, i8, bVar2, zP ? System.currentTimeMillis() : 0L, zP ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    private static a3.e c(m<?> mVar, a3.c<?> cVar, int i8) {
        int[] iArrI;
        int[] iArrN;
        a3.e eVarH = cVar.H();
        if (eVarH == null || !eVarH.p() || ((iArrI = eVarH.i()) != null ? !e3.b.a(iArrI, i8) : !((iArrN = eVarH.n()) == null || !e3.b.a(iArrN, i8))) || mVar.p() >= eVarH.g()) {
            return null;
        }
        return eVarH;
    }

    @Override // s3.d
    public final void a(s3.h<T> hVar) {
        m mVarW;
        int iU;
        int i8;
        int i9;
        int i10;
        int iG;
        long j8;
        long jCurrentTimeMillis;
        int iElapsedRealtime;
        if (this.f4891a.f()) {
            a3.q qVarA = a3.p.b().a();
            if ((qVarA == null || qVarA.n()) && (mVarW = this.f4891a.w(this.f4893c)) != null && (mVarW.s() instanceof a3.c)) {
                a3.c cVar = (a3.c) mVarW.s();
                boolean zP = this.f4894d > 0;
                int iZ = cVar.z();
                if (qVarA != null) {
                    zP &= qVarA.p();
                    int iG2 = qVarA.g();
                    int i11 = qVarA.i();
                    iU = qVarA.u();
                    if (cVar.J() && !cVar.d()) {
                        a3.e eVarC = c(mVarW, cVar, this.f4892b);
                        if (eVarC == null) {
                            return;
                        }
                        boolean z7 = eVarC.u() && this.f4894d > 0;
                        i11 = eVarC.g();
                        zP = z7;
                    }
                    i8 = iG2;
                    i9 = i11;
                } else {
                    iU = 0;
                    i8 = 5000;
                    i9 = 100;
                }
                b bVar = this.f4891a;
                if (hVar.m()) {
                    i10 = 0;
                    iG = 0;
                } else {
                    if (hVar.k()) {
                        i10 = 100;
                    } else {
                        Exception excI = hVar.i();
                        if (excI instanceof y2.b) {
                            Status statusA = ((y2.b) excI).a();
                            int i12 = statusA.i();
                            x2.b bVarG = statusA.g();
                            iG = bVarG == null ? -1 : bVarG.g();
                            i10 = i12;
                        } else {
                            i10 = 101;
                        }
                    }
                    iG = -1;
                }
                if (zP) {
                    long j9 = this.f4894d;
                    jCurrentTimeMillis = System.currentTimeMillis();
                    j8 = j9;
                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.f4895e);
                } else {
                    j8 = 0;
                    jCurrentTimeMillis = 0;
                    iElapsedRealtime = -1;
                }
                bVar.E(new a3.m(this.f4892b, i10, iG, j8, jCurrentTimeMillis, null, null, iZ, iElapsedRealtime), iU, i8, i9);
            }
        }
    }
}
