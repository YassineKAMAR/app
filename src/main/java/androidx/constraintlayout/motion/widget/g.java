package androidx.constraintlayout.motion.widget;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import v.b;
import v.c;
import v.d;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f1269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k f1270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private k f1271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f f1272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f1273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r.a[] f1274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private r.a f1275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f1276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f1277i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f1278j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private double[] f1279k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private double[] f1280l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String[] f1281m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float[] f1282n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ArrayList<k> f1283o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private HashMap<String, v.d> f1284p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private HashMap<String, v.c> f1285q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private HashMap<String, v.b> f1286r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private e[] f1287s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f1288t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private View f1289u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f1290v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f1291w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Interpolator f1292x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f1293y;

    private float a(float f8, float[] fArr) {
        float f9 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f10 = this.f1277i;
            if (f10 != 1.0d) {
                float f11 = this.f1276h;
                if (f8 < f11) {
                    f8 = 0.0f;
                }
                if (f8 > f11 && f8 < 1.0d) {
                    f8 = Math.min((f8 - f11) * f10, 1.0f);
                }
            }
        }
        r.b bVar = this.f1270b.f1343a;
        float f12 = Float.NaN;
        for (k kVar : this.f1283o) {
            r.b bVar2 = kVar.f1343a;
            if (bVar2 != null) {
                float f13 = kVar.f1345c;
                if (f13 < f8) {
                    bVar = bVar2;
                    f9 = f13;
                } else if (Float.isNaN(f12)) {
                    f12 = kVar.f1345c;
                }
            }
        }
        if (bVar != null) {
            float f14 = (Float.isNaN(f12) ? 1.0f : f12) - f9;
            double d8 = (f8 - f9) / f14;
            f8 = (((float) bVar.a(d8)) * f14) + f9;
            if (fArr != null) {
                fArr[0] = (float) bVar.b(d8);
            }
        }
        return f8;
    }

    public void b(double d8, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f1274f[0].b(d8, dArr);
        this.f1274f[0].d(d8, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f1270b.c(d8, this.f1278j, dArr, fArr, dArr2, fArr2);
    }

    boolean c(View view, float f8, long j8, r.c cVar) {
        d.a aVar;
        boolean zC;
        char c8;
        double d8;
        float fA = a(f8, null);
        int i8 = this.f1290v;
        if (i8 != d.f1266a) {
            float f9 = 1.0f / i8;
            float fFloor = ((float) Math.floor(fA / f9)) * f9;
            float f10 = (fA % f9) / f9;
            if (!Float.isNaN(this.f1291w)) {
                f10 = (f10 + this.f1291w) % 1.0f;
            }
            Interpolator interpolator = this.f1292x;
            fA = ((interpolator != null ? interpolator.getInterpolation(f10) : ((double) f10) > 0.5d ? 1.0f : 0.0f) * f9) + fFloor;
        }
        float f11 = fA;
        HashMap<String, v.c> map = this.f1285q;
        if (map != null) {
            Iterator<v.c> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().b(view, f11);
            }
        }
        HashMap<String, v.d> map2 = this.f1284p;
        if (map2 != null) {
            d.a aVar2 = null;
            boolean zB = false;
            for (v.d dVar : map2.values()) {
                if (dVar instanceof d.a) {
                    aVar2 = (d.a) dVar;
                } else {
                    zB |= dVar.b(view, f11, j8, cVar);
                }
            }
            zC = zB;
            aVar = aVar2;
        } else {
            aVar = null;
            zC = false;
        }
        r.a[] aVarArr = this.f1274f;
        if (aVarArr != null) {
            double d9 = f11;
            aVarArr[0].b(d9, this.f1279k);
            this.f1274f[0].d(d9, this.f1280l);
            r.a aVar3 = this.f1275g;
            if (aVar3 != null) {
                double[] dArr = this.f1279k;
                if (dArr.length > 0) {
                    aVar3.b(d9, dArr);
                    this.f1275g.d(d9, this.f1280l);
                }
            }
            if (this.f1293y) {
                d8 = d9;
            } else {
                d8 = d9;
                this.f1270b.d(f11, view, this.f1278j, this.f1279k, this.f1280l, null, this.f1269a);
                this.f1269a = false;
            }
            if (this.f1288t != d.f1266a) {
                if (this.f1289u == null) {
                    this.f1289u = ((View) view.getParent()).findViewById(this.f1288t);
                }
                if (this.f1289u != null) {
                    float top = (r1.getTop() + this.f1289u.getBottom()) / 2.0f;
                    float left = (this.f1289u.getLeft() + this.f1289u.getRight()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view.setPivotX(left - view.getLeft());
                        view.setPivotY(top - view.getTop());
                    }
                }
            }
            HashMap<String, v.c> map3 = this.f1285q;
            if (map3 != null) {
                for (v.c cVar2 : map3.values()) {
                    if (cVar2 instanceof c.a) {
                        double[] dArr2 = this.f1280l;
                        if (dArr2.length > 1) {
                            ((c.a) cVar2).c(view, f11, dArr2[0], dArr2[1]);
                        }
                    }
                }
            }
            if (aVar != null) {
                double[] dArr3 = this.f1280l;
                c8 = 1;
                zC |= aVar.c(view, cVar, f11, j8, dArr3[0], dArr3[1]);
            } else {
                c8 = 1;
            }
            int i9 = 1;
            while (true) {
                r.a[] aVarArr2 = this.f1274f;
                if (i9 >= aVarArr2.length) {
                    break;
                }
                aVarArr2[i9].c(d8, this.f1282n);
                v.a.b(this.f1270b.f1357o.get(this.f1281m[i9 - 1]), view, this.f1282n);
                i9++;
            }
            f fVar = this.f1272d;
            if (fVar.f1267a == 0) {
                if (f11 <= 0.0f) {
                    view.setVisibility(fVar.f1268b);
                } else if (f11 >= 1.0f) {
                    fVar = this.f1273e;
                    view.setVisibility(fVar.f1268b);
                } else if (this.f1273e.f1268b != fVar.f1268b) {
                    view.setVisibility(0);
                }
            }
            if (this.f1287s != null) {
                int i10 = 0;
                while (true) {
                    e[] eVarArr = this.f1287s;
                    if (i10 >= eVarArr.length) {
                        break;
                    }
                    eVarArr[i10].a(f11, view);
                    i10++;
                }
            }
        } else {
            c8 = 1;
            k kVar = this.f1270b;
            float f12 = kVar.f1347e;
            k kVar2 = this.f1271c;
            float f13 = f12 + ((kVar2.f1347e - f12) * f11);
            float f14 = kVar.f1348f;
            float f15 = f14 + ((kVar2.f1348f - f14) * f11);
            float f16 = kVar.f1349g;
            float f17 = kVar2.f1349g;
            float f18 = kVar.f1350h;
            float f19 = kVar2.f1350h;
            float f20 = f13 + 0.5f;
            int i11 = (int) f20;
            float f21 = f15 + 0.5f;
            int i12 = (int) f21;
            int i13 = (int) (f20 + ((f17 - f16) * f11) + f16);
            int i14 = (int) (f21 + ((f19 - f18) * f11) + f18);
            int i15 = i13 - i11;
            int i16 = i14 - i12;
            if (f17 != f16 || f19 != f18 || this.f1269a) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(i16, 1073741824));
                this.f1269a = false;
            }
            view.layout(i11, i12, i13, i14);
        }
        HashMap<String, v.b> map4 = this.f1286r;
        if (map4 != null) {
            for (v.b bVar : map4.values()) {
                if (bVar instanceof b.a) {
                    double[] dArr4 = this.f1280l;
                    ((b.a) bVar).c(view, f11, dArr4[0], dArr4[c8]);
                } else {
                    bVar.b(view, f11);
                }
            }
        }
        return zC;
    }

    public String toString() {
        return " start: x: " + this.f1270b.f1347e + " y: " + this.f1270b.f1348f + " end: x: " + this.f1271c.f1347e + " y: " + this.f1271c.f1348f;
    }
}
