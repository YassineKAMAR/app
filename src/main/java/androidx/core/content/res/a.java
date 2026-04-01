package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f1950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f1951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f1952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f1953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f1954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f1955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f1956g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f1957h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f1958i;

    a(float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        this.f1950a = f8;
        this.f1951b = f9;
        this.f1952c = f10;
        this.f1953d = f11;
        this.f1954e = f12;
        this.f1955f = f13;
        this.f1956g = f14;
        this.f1957h = f15;
        this.f1958i = f16;
    }

    private static a b(float f8, float f9, float f10) {
        float f11 = 1000.0f;
        a aVar = null;
        float f12 = 1000.0f;
        float f13 = 100.0f;
        float f14 = 0.0f;
        while (Math.abs(f14 - f13) > 0.01f) {
            float f15 = ((f13 - f14) / 2.0f) + f14;
            int iP = e(f15, f9, f8).p();
            float fB = b.b(iP);
            float fAbs = Math.abs(f10 - fB);
            if (fAbs < 0.2f) {
                a aVarC = c(iP);
                float fA = aVarC.a(e(aVarC.k(), aVarC.i(), f8));
                if (fA <= 1.0f) {
                    aVar = aVarC;
                    f11 = fAbs;
                    f12 = fA;
                }
            }
            if (f11 == 0.0f && f12 == 0.0f) {
                break;
            }
            if (fB < f10) {
                f14 = f15;
            } else {
                f13 = f15;
            }
        }
        return aVar;
    }

    static a c(int i8) {
        return d(i8, o.f1995k);
    }

    static a d(int i8, o oVar) {
        float[] fArrF = b.f(i8);
        float[][] fArr = b.f1959a;
        float f8 = fArrF[0];
        float[] fArr2 = fArr[0];
        float f9 = fArr2[0] * f8;
        float f10 = fArrF[1];
        float f11 = f9 + (fArr2[1] * f10);
        float f12 = fArrF[2];
        float f13 = f11 + (fArr2[2] * f12);
        float[] fArr3 = fArr[1];
        float f14 = (fArr3[0] * f8) + (fArr3[1] * f10) + (fArr3[2] * f12);
        float[] fArr4 = fArr[2];
        float f15 = (f8 * fArr4[0]) + (f10 * fArr4[1]) + (f12 * fArr4[2]);
        float f16 = oVar.i()[0] * f13;
        float f17 = oVar.i()[1] * f14;
        float f18 = oVar.i()[2] * f15;
        float fPow = (float) Math.pow(((double) (oVar.c() * Math.abs(f16))) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (oVar.c() * Math.abs(f17))) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (oVar.c() * Math.abs(f18))) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f16) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f17) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f18) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d8 = fSignum3;
        float f19 = ((float) (((((double) fSignum) * 11.0d) + (((double) fSignum2) * (-12.0d))) + d8)) / 11.0f;
        float f20 = ((float) (((double) (fSignum + fSignum2)) - (d8 * 2.0d))) / 9.0f;
        float f21 = fSignum2 * 20.0f;
        float f22 = (((fSignum * 20.0f) + f21) + (21.0f * fSignum3)) / 20.0f;
        float f23 = (((fSignum * 40.0f) + f21) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f20, f19)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f24 = fAtan2;
        float f25 = (3.1415927f * f24) / 180.0f;
        float fPow4 = ((float) Math.pow((f23 * oVar.f()) / oVar.a(), oVar.b() * oVar.j())) * 100.0f;
        float fD = oVar.d() * (4.0f / oVar.b()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (oVar.a() + 4.0f);
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, oVar.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) f24) < 20.14d ? 360.0f + f24 : f24)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * oVar.g()) * oVar.h()) * ((float) Math.sqrt((f19 * f19) + (f20 * f20)))) / (f22 + 0.305f), 0.9d)) * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        float fD2 = fPow5 * oVar.d();
        float fSqrt = ((float) Math.sqrt((r2 * oVar.b()) / (oVar.a() + 4.0f))) * 50.0f;
        float f26 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * fD2) + 1.0f)) * 43.85965f;
        double d9 = f25;
        return new a(f24, fPow5, fPow4, fD, fD2, fSqrt, f26, fLog * ((float) Math.cos(d9)), fLog * ((float) Math.sin(d9)));
    }

    private static a e(float f8, float f9, float f10) {
        return f(f8, f9, f10, o.f1995k);
    }

    private static a f(float f8, float f9, float f10, o oVar) {
        float fB = (4.0f / oVar.b()) * ((float) Math.sqrt(((double) f8) / 100.0d)) * (oVar.a() + 4.0f) * oVar.d();
        float fD = f9 * oVar.d();
        float fSqrt = ((float) Math.sqrt(((f9 / ((float) Math.sqrt(r4))) * oVar.b()) / (oVar.a() + 4.0f))) * 50.0f;
        float f11 = (1.7f * f8) / ((0.007f * f8) + 1.0f);
        float fLog = ((float) Math.log((((double) fD) * 0.0228d) + 1.0d)) * 43.85965f;
        double d8 = (3.1415927f * f10) / 180.0f;
        return new a(f10, f9, f8, fB, fD, fSqrt, f11, fLog * ((float) Math.cos(d8)), fLog * ((float) Math.sin(d8)));
    }

    static int m(float f8, float f9, float f10) {
        return n(f8, f9, f10, o.f1995k);
    }

    static int n(float f8, float f9, float f10, o oVar) {
        if (f9 < 1.0d || Math.round(f10) <= 0.0d || Math.round(f10) >= 100.0d) {
            return b.a(f10);
        }
        float fMin = f8 < 0.0f ? 0.0f : Math.min(360.0f, f8);
        float f11 = f9;
        a aVar = null;
        float f12 = 0.0f;
        boolean z7 = true;
        while (Math.abs(f12 - f9) >= 0.4f) {
            a aVarB = b(fMin, f11, f10);
            if (z7) {
                if (aVarB != null) {
                    return aVarB.o(oVar);
                }
                z7 = false;
            } else if (aVarB == null) {
                f9 = f11;
            } else {
                f12 = f11;
                aVar = aVarB;
            }
            f11 = ((f9 - f12) / 2.0f) + f12;
        }
        return aVar == null ? b.a(f10) : aVar.o(oVar);
    }

    float a(a aVar) {
        float fL = l() - aVar.l();
        float fG = g() - aVar.g();
        float fH = h() - aVar.h();
        return (float) (Math.pow(Math.sqrt((fL * fL) + (fG * fG) + (fH * fH)), 0.63d) * 1.41d);
    }

    float g() {
        return this.f1957h;
    }

    float h() {
        return this.f1958i;
    }

    float i() {
        return this.f1951b;
    }

    float j() {
        return this.f1950a;
    }

    float k() {
        return this.f1952c;
    }

    float l() {
        return this.f1956g;
    }

    int o(o oVar) {
        float fPow = (float) Math.pow(((double) ((((double) i()) == 0.0d || ((double) k()) == 0.0d) ? 0.0f : i() / ((float) Math.sqrt(((double) k()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, oVar.e()), 0.73d), 1.1111111111111112d);
        double dJ = (j() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + dJ) + 3.8d)) * 0.25f;
        float fA = oVar.a() * ((float) Math.pow(((double) k()) / 100.0d, (1.0d / ((double) oVar.b())) / ((double) oVar.j())));
        float fG = fCos * 3846.1538f * oVar.g() * oVar.h();
        float f8 = fA / oVar.f();
        float fSin = (float) Math.sin(dJ);
        float fCos2 = (float) Math.cos(dJ);
        float f9 = (((0.305f + f8) * 23.0f) * fPow) / (((fG * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f10 = fCos2 * f9;
        float f11 = f9 * fSin;
        float f12 = f8 * 460.0f;
        float f13 = (((451.0f * f10) + f12) + (288.0f * f11)) / 1403.0f;
        float f14 = ((f12 - (891.0f * f10)) - (261.0f * f11)) / 1403.0f;
        float fSignum = Math.signum(f13) * (100.0f / oVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f13)) * 27.13d) / (400.0d - ((double) Math.abs(f13)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f14) * (100.0f / oVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f14)) * 27.13d) / (400.0d - ((double) Math.abs(f14)))), 2.380952380952381d));
        float fSignum3 = Math.signum(((f12 - (f10 * 220.0f)) - (f11 * 6300.0f)) / 1403.0f) * (100.0f / oVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(r6)) * 27.13d) / (400.0d - ((double) Math.abs(r6)))), 2.380952380952381d));
        float f15 = fSignum / oVar.i()[0];
        float f16 = fSignum2 / oVar.i()[1];
        float f17 = fSignum3 / oVar.i()[2];
        float[][] fArr = b.f1960b;
        float[] fArr2 = fArr[0];
        float f18 = (fArr2[0] * f15) + (fArr2[1] * f16) + (fArr2[2] * f17);
        float[] fArr3 = fArr[1];
        float f19 = (fArr3[0] * f15) + (fArr3[1] * f16) + (fArr3[2] * f17);
        float[] fArr4 = fArr[2];
        return androidx.core.graphics.a.a(f18, f19, (f15 * fArr4[0]) + (f16 * fArr4[1]) + (f17 * fArr4[2]));
    }

    int p() {
        return o(o.f1995k);
    }
}
