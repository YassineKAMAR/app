package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
final class o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final o f1995k = k(b.f1961c, (float) ((((double) b.h(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f1996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f1997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f1998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f1999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f2000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f2001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float[] f2002g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f2003h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f2004i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f2005j;

    private o(float f8, float f9, float f10, float f11, float f12, float f13, float[] fArr, float f14, float f15, float f16) {
        this.f2001f = f8;
        this.f1996a = f9;
        this.f1997b = f10;
        this.f1998c = f11;
        this.f1999d = f12;
        this.f2000e = f13;
        this.f2002g = fArr;
        this.f2003h = f14;
        this.f2004i = f15;
        this.f2005j = f16;
    }

    static o k(float[] fArr, float f8, float f9, float f10, boolean z7) {
        float[][] fArr2 = b.f1959a;
        float f11 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f12 = fArr3[0] * f11;
        float f13 = fArr[1];
        float f14 = f12 + (fArr3[1] * f13);
        float f15 = fArr[2];
        float f16 = f14 + (fArr3[2] * f15);
        float[] fArr4 = fArr2[1];
        float f17 = (fArr4[0] * f11) + (fArr4[1] * f13) + (fArr4[2] * f15);
        float[] fArr5 = fArr2[2];
        float f18 = (f11 * fArr5[0]) + (f13 * fArr5[1]) + (f15 * fArr5[2]);
        float f19 = (f10 / 10.0f) + 0.8f;
        float fD = ((double) f19) >= 0.9d ? b.d(0.59f, 0.69f, (f19 - 0.9f) * 10.0f) : b.d(0.525f, 0.59f, (f19 - 0.8f) * 10.0f);
        float fExp = z7 ? 1.0f : (1.0f - (((float) Math.exp(((-f8) - 42.0f) / 92.0f)) * 0.2777778f)) * f19;
        double d8 = fExp;
        if (d8 > 1.0d) {
            fExp = 1.0f;
        } else if (d8 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f16) * fExp) + 1.0f) - fExp, (((100.0f / f17) * fExp) + 1.0f) - fExp, (((100.0f / f18) * fExp) + 1.0f) - fExp};
        float f20 = 1.0f / ((5.0f * f8) + 1.0f);
        float f21 = f20 * f20 * f20 * f20;
        float f22 = 1.0f - f21;
        float fCbrt = (f21 * f8) + (0.1f * f22 * f22 * ((float) Math.cbrt(((double) f8) * 5.0d)));
        float fH = b.h(f9) / fArr[1];
        double d9 = fH;
        float fSqrt = ((float) Math.sqrt(d9)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d9, 0.2d));
        float fPow2 = (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f18)) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f16)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f17)) / 100.0d, 0.42d), fPow2};
        float f23 = fArr7[0];
        float f24 = (f23 * 400.0f) / (f23 + 27.13f);
        float f25 = fArr7[1];
        return new o(fH, ((f24 * 2.0f) + ((f25 * 400.0f) / (f25 + 27.13f)) + (((400.0f * fPow2) / (fPow2 + 27.13f)) * 0.05f)) * fPow, fPow, fPow, fD, f19, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    float a() {
        return this.f1996a;
    }

    float b() {
        return this.f1999d;
    }

    float c() {
        return this.f2003h;
    }

    float d() {
        return this.f2004i;
    }

    float e() {
        return this.f2001f;
    }

    float f() {
        return this.f1997b;
    }

    float g() {
        return this.f2000e;
    }

    float h() {
        return this.f1998c;
    }

    float[] i() {
        return this.f2002g;
    }

    float j() {
        return this.f2005j;
    }
}
