package androidx.constraintlayout.motion.widget;

import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
class k implements Comparable<k> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static String[] f1342s = {"position", "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    r.b f1343a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    float f1345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    float f1346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f1347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f1348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f1349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f1350h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f1353k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f1354l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    float f1355m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    g f1356n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    LinkedHashMap<String, androidx.constraintlayout.widget.b> f1357o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f1358p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    double[] f1359q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    double[] f1360r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f1344b = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f1351i = Float.NaN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f1352j = Float.NaN;

    public k() {
        int i8 = d.f1266a;
        this.f1353k = i8;
        this.f1354l = i8;
        this.f1355m = Float.NaN;
        this.f1356n = null;
        this.f1357o = new LinkedHashMap<>();
        this.f1358p = 0;
        this.f1359q = new double[18];
        this.f1360r = new double[18];
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(k kVar) {
        return Float.compare(this.f1346d, kVar.f1346d);
    }

    void c(double d8, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f8;
        float f9 = this.f1347e;
        float f10 = this.f1348f;
        float f11 = this.f1349g;
        float f12 = this.f1350h;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        for (int i8 = 0; i8 < iArr.length; i8++) {
            float f17 = (float) dArr[i8];
            float f18 = (float) dArr2[i8];
            int i9 = iArr[i8];
            if (i9 == 1) {
                f9 = f17;
                f13 = f18;
            } else if (i9 == 2) {
                f10 = f17;
                f15 = f18;
            } else if (i9 == 3) {
                f11 = f17;
                f14 = f18;
            } else if (i9 == 4) {
                f12 = f17;
                f16 = f18;
            }
        }
        float f19 = 2.0f;
        float f20 = (f14 / 2.0f) + f13;
        float fCos = (f16 / 2.0f) + f15;
        g gVar = this.f1356n;
        if (gVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            gVar.b(d8, fArr3, fArr4);
            float f21 = fArr3[0];
            float f22 = fArr3[1];
            float f23 = fArr4[0];
            float f24 = fArr4[1];
            double d9 = f9;
            double d10 = f10;
            f8 = f11;
            float fSin = (float) ((((double) f21) + (Math.sin(d10) * d9)) - ((double) (f11 / 2.0f)));
            float fCos2 = (float) ((((double) f22) - (d9 * Math.cos(d10))) - ((double) (f12 / 2.0f)));
            double d11 = f13;
            double d12 = f15;
            float fSin2 = (float) (((double) f23) + (Math.sin(d10) * d11) + (Math.cos(d10) * d12));
            fCos = (float) ((((double) f24) - (d11 * Math.cos(d10))) + (Math.sin(d10) * d12));
            f20 = fSin2;
            f9 = fSin;
            f10 = fCos2;
            f19 = 2.0f;
        } else {
            f8 = f11;
        }
        fArr[0] = f9 + (f8 / f19) + 0.0f;
        fArr[1] = f10 + (f12 / f19) + 0.0f;
        fArr2[0] = f20;
        fArr2[1] = fCos;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void d(float f8, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z7) {
        float f9;
        boolean z8;
        float f10;
        float f11 = this.f1347e;
        float f12 = this.f1348f;
        float f13 = this.f1349g;
        float f14 = this.f1350h;
        if (iArr.length != 0 && this.f1359q.length <= iArr[iArr.length - 1]) {
            int i8 = iArr[iArr.length - 1] + 1;
            this.f1359q = new double[i8];
            this.f1360r = new double[i8];
        }
        Arrays.fill(this.f1359q, Double.NaN);
        for (int i9 = 0; i9 < iArr.length; i9++) {
            double[] dArr4 = this.f1359q;
            int i10 = iArr[i9];
            dArr4[i10] = dArr[i9];
            this.f1360r[i10] = dArr2[i9];
        }
        float f15 = Float.NaN;
        int i11 = 0;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        while (true) {
            double[] dArr5 = this.f1359q;
            if (i11 >= dArr5.length) {
                break;
            }
            if (Double.isNaN(dArr5[i11]) && (dArr3 == null || dArr3[i11] == 0.0d)) {
                f10 = f15;
            } else {
                double d8 = dArr3 != null ? dArr3[i11] : 0.0d;
                if (!Double.isNaN(this.f1359q[i11])) {
                    d8 = this.f1359q[i11] + d8;
                }
                f10 = f15;
                float f20 = (float) d8;
                float f21 = (float) this.f1360r[i11];
                if (i11 == 1) {
                    f15 = f10;
                    f16 = f21;
                    f11 = f20;
                } else if (i11 == 2) {
                    f15 = f10;
                    f17 = f21;
                    f12 = f20;
                } else if (i11 == 3) {
                    f15 = f10;
                    f18 = f21;
                    f13 = f20;
                } else if (i11 == 4) {
                    f15 = f10;
                    f19 = f21;
                    f14 = f20;
                } else if (i11 == 5) {
                    f15 = f20;
                }
                i11++;
            }
            f15 = f10;
            i11++;
        }
        float f22 = f15;
        g gVar = this.f1356n;
        if (gVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            gVar.b(f8, fArr, fArr2);
            float f23 = fArr[0];
            float f24 = fArr[1];
            float f25 = fArr2[0];
            float f26 = fArr2[1];
            double d9 = f11;
            double d10 = f12;
            float fSin = (float) ((((double) f23) + (Math.sin(d10) * d9)) - ((double) (f13 / 2.0f)));
            f9 = f14;
            float fCos = (float) ((((double) f24) - (Math.cos(d10) * d9)) - ((double) (f14 / 2.0f)));
            double d11 = f16;
            double d12 = f17;
            float fSin2 = (float) (((double) f25) + (Math.sin(d10) * d11) + (Math.cos(d10) * d9 * d12));
            float fCos2 = (float) ((((double) f26) - (d11 * Math.cos(d10))) + (d9 * Math.sin(d10) * d12));
            if (dArr2.length >= 2) {
                z8 = false;
                dArr2[0] = fSin2;
                dArr2[1] = fCos2;
            } else {
                z8 = false;
            }
            if (!Float.isNaN(f22)) {
                view.setRotation((float) (((double) f22) + Math.toDegrees(Math.atan2(fCos2, fSin2))));
            }
            f11 = fSin;
            f12 = fCos;
        } else {
            f9 = f14;
            z8 = false;
            if (!Float.isNaN(f22)) {
                view.setRotation((float) (((double) 0.0f) + ((double) f22) + Math.toDegrees(Math.atan2(f17 + (f19 / 2.0f), f16 + (f18 / 2.0f)))));
            }
        }
        if (view instanceof c) {
            ((c) view).a(f11, f12, f13 + f11, f12 + f9);
            return;
        }
        float f27 = f11 + 0.5f;
        int i12 = (int) f27;
        float f28 = f12 + 0.5f;
        int i13 = (int) f28;
        int i14 = (int) (f27 + f13);
        int i15 = (int) (f28 + f9);
        int i16 = i14 - i12;
        int i17 = i15 - i13;
        if (i16 != view.getMeasuredWidth() || i17 != view.getMeasuredHeight()) {
            z8 = true;
        }
        if (z8 || z7) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(i17, 1073741824));
        }
        view.layout(i12, i13, i14, i15);
    }
}
