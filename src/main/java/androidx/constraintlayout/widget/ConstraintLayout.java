package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import java.util.ArrayList;
import java.util.HashMap;
import t.d;
import t.e;
import u.b;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static l f1361x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    SparseArray<View> f1362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<androidx.constraintlayout.widget.c> f1363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected t.f f1364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f1369h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f1370i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private e f1371j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected d f1372k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f1373l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private HashMap<String, Integer> f1374m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f1375n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f1376o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f1377p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f1378q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f1379r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f1380s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private SparseArray<t.e> f1381t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    c f1382u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f1383v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f1384w;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1385a;

        static {
            int[] iArr = new int[e.b.values().length];
            f1385a = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1385a[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1385a[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1385a[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public int C;
        public int D;
        boolean E;
        boolean F;
        public float G;
        public float H;
        public String I;
        float J;
        int K;
        public float L;
        public float M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public int R;
        public int S;
        public int T;
        public int U;
        public float V;
        public float W;
        public int X;
        public int Y;
        public int Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1386a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public boolean f1387a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1388b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public boolean f1389b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f1390c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public String f1391c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f1392d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f1393d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1394e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        boolean f1395e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1396f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        boolean f1397f0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f1398g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        boolean f1399g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f1400h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        boolean f1401h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f1402i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        boolean f1403i0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f1404j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        boolean f1405j0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f1406k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        boolean f1407k0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f1408l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        int f1409l0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f1410m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        int f1411m0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f1412n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        int f1413n0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f1414o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        int f1415o0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f1416p;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        int f1417p0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f1418q;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        int f1419q0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public float f1420r;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        float f1421r0;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f1422s;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        int f1423s0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f1424t;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        int f1425t0;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f1426u;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        float f1427u0;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f1428v;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        t.e f1429v0;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f1430w;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public boolean f1431w0;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f1432x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f1433y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f1434z;

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f1435a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1435a = sparseIntArray;
                sparseIntArray.append(k.f1770s2, 64);
                sparseIntArray.append(k.V1, 65);
                sparseIntArray.append(k.f1644e2, 8);
                sparseIntArray.append(k.f1653f2, 9);
                sparseIntArray.append(k.f1671h2, 10);
                sparseIntArray.append(k.f1680i2, 11);
                sparseIntArray.append(k.f1734o2, 12);
                sparseIntArray.append(k.f1725n2, 13);
                sparseIntArray.append(k.L1, 14);
                sparseIntArray.append(k.K1, 15);
                sparseIntArray.append(k.G1, 16);
                sparseIntArray.append(k.I1, 52);
                sparseIntArray.append(k.H1, 53);
                sparseIntArray.append(k.M1, 2);
                sparseIntArray.append(k.O1, 3);
                sparseIntArray.append(k.N1, 4);
                sparseIntArray.append(k.f1811x2, 49);
                sparseIntArray.append(k.f1819y2, 50);
                sparseIntArray.append(k.S1, 5);
                sparseIntArray.append(k.T1, 6);
                sparseIntArray.append(k.U1, 7);
                sparseIntArray.append(k.B1, 67);
                sparseIntArray.append(k.f1733o1, 1);
                sparseIntArray.append(k.f1689j2, 17);
                sparseIntArray.append(k.f1698k2, 18);
                sparseIntArray.append(k.R1, 19);
                sparseIntArray.append(k.Q1, 20);
                sparseIntArray.append(k.C2, 21);
                sparseIntArray.append(k.F2, 22);
                sparseIntArray.append(k.D2, 23);
                sparseIntArray.append(k.A2, 24);
                sparseIntArray.append(k.E2, 25);
                sparseIntArray.append(k.B2, 26);
                sparseIntArray.append(k.f1827z2, 55);
                sparseIntArray.append(k.G2, 54);
                sparseIntArray.append(k.f1608a2, 29);
                sparseIntArray.append(k.f1743p2, 30);
                sparseIntArray.append(k.P1, 44);
                sparseIntArray.append(k.f1626c2, 45);
                sparseIntArray.append(k.f1761r2, 46);
                sparseIntArray.append(k.f1617b2, 47);
                sparseIntArray.append(k.f1752q2, 48);
                sparseIntArray.append(k.E1, 27);
                sparseIntArray.append(k.D1, 28);
                sparseIntArray.append(k.f1779t2, 31);
                sparseIntArray.append(k.W1, 32);
                sparseIntArray.append(k.f1795v2, 33);
                sparseIntArray.append(k.f1787u2, 34);
                sparseIntArray.append(k.f1803w2, 35);
                sparseIntArray.append(k.Y1, 36);
                sparseIntArray.append(k.X1, 37);
                sparseIntArray.append(k.Z1, 38);
                sparseIntArray.append(k.f1635d2, 39);
                sparseIntArray.append(k.f1716m2, 40);
                sparseIntArray.append(k.f1662g2, 41);
                sparseIntArray.append(k.J1, 42);
                sparseIntArray.append(k.F1, 43);
                sparseIntArray.append(k.f1707l2, 51);
                sparseIntArray.append(k.I2, 66);
            }
        }

        public b(int i8, int i9) {
            super(i8, i9);
            this.f1386a = -1;
            this.f1388b = -1;
            this.f1390c = -1.0f;
            this.f1392d = true;
            this.f1394e = -1;
            this.f1396f = -1;
            this.f1398g = -1;
            this.f1400h = -1;
            this.f1402i = -1;
            this.f1404j = -1;
            this.f1406k = -1;
            this.f1408l = -1;
            this.f1410m = -1;
            this.f1412n = -1;
            this.f1414o = -1;
            this.f1416p = -1;
            this.f1418q = 0;
            this.f1420r = 0.0f;
            this.f1422s = -1;
            this.f1424t = -1;
            this.f1426u = -1;
            this.f1428v = -1;
            this.f1430w = Integer.MIN_VALUE;
            this.f1432x = Integer.MIN_VALUE;
            this.f1433y = Integer.MIN_VALUE;
            this.f1434z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f1387a0 = false;
            this.f1389b0 = false;
            this.f1391c0 = null;
            this.f1393d0 = 0;
            this.f1395e0 = true;
            this.f1397f0 = true;
            this.f1399g0 = false;
            this.f1401h0 = false;
            this.f1403i0 = false;
            this.f1405j0 = false;
            this.f1407k0 = false;
            this.f1409l0 = -1;
            this.f1411m0 = -1;
            this.f1413n0 = -1;
            this.f1415o0 = -1;
            this.f1417p0 = Integer.MIN_VALUE;
            this.f1419q0 = Integer.MIN_VALUE;
            this.f1421r0 = 0.5f;
            this.f1429v0 = new t.e();
            this.f1431w0 = false;
        }

        public b(Context context, AttributeSet attributeSet) {
            String str;
            super(context, attributeSet);
            this.f1386a = -1;
            this.f1388b = -1;
            this.f1390c = -1.0f;
            this.f1392d = true;
            this.f1394e = -1;
            this.f1396f = -1;
            this.f1398g = -1;
            this.f1400h = -1;
            this.f1402i = -1;
            this.f1404j = -1;
            this.f1406k = -1;
            this.f1408l = -1;
            this.f1410m = -1;
            this.f1412n = -1;
            this.f1414o = -1;
            this.f1416p = -1;
            this.f1418q = 0;
            this.f1420r = 0.0f;
            this.f1422s = -1;
            this.f1424t = -1;
            this.f1426u = -1;
            this.f1428v = -1;
            this.f1430w = Integer.MIN_VALUE;
            this.f1432x = Integer.MIN_VALUE;
            this.f1433y = Integer.MIN_VALUE;
            this.f1434z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f1387a0 = false;
            this.f1389b0 = false;
            this.f1391c0 = null;
            this.f1393d0 = 0;
            this.f1395e0 = true;
            this.f1397f0 = true;
            this.f1399g0 = false;
            this.f1401h0 = false;
            this.f1403i0 = false;
            this.f1405j0 = false;
            this.f1407k0 = false;
            this.f1409l0 = -1;
            this.f1411m0 = -1;
            this.f1413n0 = -1;
            this.f1415o0 = -1;
            this.f1417p0 = Integer.MIN_VALUE;
            this.f1419q0 = Integer.MIN_VALUE;
            this.f1421r0 = 0.5f;
            this.f1429v0 = new t.e();
            this.f1431w0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f1724n1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                int i9 = a.f1435a.get(index);
                switch (i9) {
                    case 1:
                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                        continue;
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f1416p);
                        this.f1416p = resourceId;
                        if (resourceId == -1) {
                            this.f1416p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 3:
                        this.f1418q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1418q);
                        continue;
                        break;
                    case 4:
                        float f8 = typedArrayObtainStyledAttributes.getFloat(index, this.f1420r) % 360.0f;
                        this.f1420r = f8;
                        if (f8 < 0.0f) {
                            this.f1420r = (360.0f - f8) % 360.0f;
                        } else {
                            continue;
                        }
                        break;
                    case 5:
                        this.f1386a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1386a);
                        continue;
                        break;
                    case 6:
                        this.f1388b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1388b);
                        continue;
                        break;
                    case 7:
                        this.f1390c = typedArrayObtainStyledAttributes.getFloat(index, this.f1390c);
                        continue;
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1394e);
                        this.f1394e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f1394e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1396f);
                        this.f1396f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f1396f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case R.styleable.GradientColor_android_endX /* 10 */:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1398g);
                        this.f1398g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f1398g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case R.styleable.GradientColor_android_endY /* 11 */:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1400h);
                        this.f1400h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f1400h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1402i);
                        this.f1402i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f1402i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1404j);
                        this.f1404j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f1404j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1406k);
                        this.f1406k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f1406k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1408l);
                        this.f1408l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f1408l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case com.amazon.c.a.a.c.f4052g /* 16 */:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1410m);
                        this.f1410m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f1410m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1422s);
                        this.f1422s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f1422s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1424t);
                        this.f1424t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f1424t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1426u);
                        this.f1426u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f1426u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1428v);
                        this.f1428v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f1428v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 21:
                        this.f1430w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1430w);
                        continue;
                        break;
                    case 22:
                        this.f1432x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1432x);
                        continue;
                        break;
                    case 23:
                        this.f1433y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1433y);
                        continue;
                        break;
                    case 24:
                        this.f1434z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1434z);
                        continue;
                        break;
                    case 25:
                        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        continue;
                        break;
                    case 26:
                        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        continue;
                        break;
                    case 27:
                        this.f1387a0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1387a0);
                        continue;
                        break;
                    case 28:
                        this.f1389b0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1389b0);
                        continue;
                        break;
                    case 29:
                        this.G = typedArrayObtainStyledAttributes.getFloat(index, this.G);
                        continue;
                        break;
                    case 30:
                        this.H = typedArrayObtainStyledAttributes.getFloat(index, this.H);
                        continue;
                        break;
                    case 31:
                        int i10 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.P = i10;
                        if (i10 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                        }
                        break;
                    case com.amazon.c.a.a.c.f4053h /* 32 */:
                        int i11 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.Q = i11;
                        if (i11 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                        }
                        break;
                    case 33:
                        try {
                            this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                            continue;
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.R) == -2) {
                                this.R = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                            continue;
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.T) == -2) {
                                this.T = -2;
                            }
                        }
                        break;
                    case 35:
                        this.V = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.V));
                        this.P = 2;
                        continue;
                        break;
                    case 36:
                        try {
                            this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                            continue;
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.S) == -2) {
                                this.S = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.U);
                            continue;
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.U) == -2) {
                                this.U = -2;
                            }
                        }
                        break;
                    case 38:
                        this.W = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.W));
                        this.Q = 2;
                        continue;
                        break;
                    default:
                        switch (i9) {
                            case 44:
                                e.o(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.L = typedArrayObtainStyledAttributes.getFloat(index, this.L);
                                break;
                            case 46:
                                this.M = typedArrayObtainStyledAttributes.getFloat(index, this.M);
                                break;
                            case 47:
                                this.N = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.O = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.X = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.X);
                                break;
                            case 50:
                                this.Y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.Y);
                                break;
                            case 51:
                                this.f1391c0 = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1412n);
                                this.f1412n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f1412n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1414o);
                                this.f1414o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f1414o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i9) {
                                    case 64:
                                        e.m(this, typedArrayObtainStyledAttributes, index, 0);
                                        this.E = true;
                                        break;
                                    case 65:
                                        e.m(this, typedArrayObtainStyledAttributes, index, 1);
                                        this.F = true;
                                        break;
                                    case 66:
                                        this.f1393d0 = typedArrayObtainStyledAttributes.getInt(index, this.f1393d0);
                                        break;
                                    case 67:
                                        this.f1392d = typedArrayObtainStyledAttributes.getBoolean(index, this.f1392d);
                                        continue;
                                }
                                break;
                        }
                        break;
                }
                Log.e("ConstraintLayout", str);
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1386a = -1;
            this.f1388b = -1;
            this.f1390c = -1.0f;
            this.f1392d = true;
            this.f1394e = -1;
            this.f1396f = -1;
            this.f1398g = -1;
            this.f1400h = -1;
            this.f1402i = -1;
            this.f1404j = -1;
            this.f1406k = -1;
            this.f1408l = -1;
            this.f1410m = -1;
            this.f1412n = -1;
            this.f1414o = -1;
            this.f1416p = -1;
            this.f1418q = 0;
            this.f1420r = 0.0f;
            this.f1422s = -1;
            this.f1424t = -1;
            this.f1426u = -1;
            this.f1428v = -1;
            this.f1430w = Integer.MIN_VALUE;
            this.f1432x = Integer.MIN_VALUE;
            this.f1433y = Integer.MIN_VALUE;
            this.f1434z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f1387a0 = false;
            this.f1389b0 = false;
            this.f1391c0 = null;
            this.f1393d0 = 0;
            this.f1395e0 = true;
            this.f1397f0 = true;
            this.f1399g0 = false;
            this.f1401h0 = false;
            this.f1403i0 = false;
            this.f1405j0 = false;
            this.f1407k0 = false;
            this.f1409l0 = -1;
            this.f1411m0 = -1;
            this.f1413n0 = -1;
            this.f1415o0 = -1;
            this.f1417p0 = Integer.MIN_VALUE;
            this.f1419q0 = Integer.MIN_VALUE;
            this.f1421r0 = 0.5f;
            this.f1429v0 = new t.e();
            this.f1431w0 = false;
        }

        public void a() {
            this.f1401h0 = false;
            this.f1395e0 = true;
            this.f1397f0 = true;
            int i8 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i8 == -2 && this.f1387a0) {
                this.f1395e0 = false;
                if (this.P == 0) {
                    this.P = 1;
                }
            }
            int i9 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i9 == -2 && this.f1389b0) {
                this.f1397f0 = false;
                if (this.Q == 0) {
                    this.Q = 1;
                }
            }
            if (i8 == 0 || i8 == -1) {
                this.f1395e0 = false;
                if (i8 == 0 && this.P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f1387a0 = true;
                }
            }
            if (i9 == 0 || i9 == -1) {
                this.f1397f0 = false;
                if (i9 == 0 && this.Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f1389b0 = true;
                }
            }
            if (this.f1390c == -1.0f && this.f1386a == -1 && this.f1388b == -1) {
                return;
            }
            this.f1401h0 = true;
            this.f1395e0 = true;
            this.f1397f0 = true;
            if (!(this.f1429v0 instanceof t.g)) {
                this.f1429v0 = new t.g();
            }
            ((t.g) this.f1429v0).x1(this.Z);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00d2  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instruction units count: 255
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }
    }

    class c implements b.InterfaceC0178b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ConstraintLayout f1436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1438c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f1439d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1440e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f1441f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f1442g;

        public c(ConstraintLayout constraintLayout) {
            this.f1436a = constraintLayout;
        }

        private boolean d(int i8, int i9, int i10) {
            if (i8 == i9) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i8);
            View.MeasureSpec.getSize(i8);
            int mode2 = View.MeasureSpec.getMode(i9);
            int size = View.MeasureSpec.getSize(i9);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i10 == size;
            }
            return false;
        }

        @Override // u.b.InterfaceC0178b
        @SuppressLint({"WrongCall"})
        public final void a(t.e eVar, b.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int baseline;
            int iMax;
            int i8;
            int measuredHeight;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            if (eVar == null) {
                return;
            }
            if (eVar.T() == 8 && !eVar.h0()) {
                aVar.f26550e = 0;
                aVar.f26551f = 0;
                aVar.f26552g = 0;
                return;
            }
            if (eVar.I() == null) {
                return;
            }
            e.b bVar = aVar.f26546a;
            e.b bVar2 = aVar.f26547b;
            int iU = aVar.f26548c;
            int iV = aVar.f26549d;
            int iS = this.f1437b + this.f1438c;
            int iZ = this.f1439d;
            View view = (View) eVar.q();
            int[] iArr = a.f1385a;
            int i14 = iArr[bVar.ordinal()];
            if (i14 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iU, 1073741824);
            } else {
                if (i14 == 2) {
                    i12 = this.f1441f;
                    i13 = -2;
                } else if (i14 == 3) {
                    i12 = this.f1441f;
                    iZ += eVar.z();
                    i13 = -1;
                } else if (i14 != 4) {
                    iMakeMeasureSpec = 0;
                } else {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1441f, iZ, -2);
                    boolean z7 = eVar.f26426w == 1;
                    int i15 = aVar.f26555j;
                    if (i15 == b.a.f26544l || i15 == b.a.f26545m) {
                        if (aVar.f26555j == b.a.f26545m || !z7 || (z7 && (view.getMeasuredHeight() == eVar.v())) || (view instanceof i) || eVar.l0()) {
                            iU = eVar.U();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iU, 1073741824);
                        }
                    }
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i12, iZ, i13);
            }
            int i16 = iArr[bVar2.ordinal()];
            if (i16 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iV, 1073741824);
            } else {
                if (i16 == 2) {
                    i10 = this.f1442g;
                    i11 = -2;
                } else if (i16 == 3) {
                    i10 = this.f1442g;
                    iS += eVar.S();
                    i11 = -1;
                } else if (i16 != 4) {
                    iMakeMeasureSpec2 = 0;
                } else {
                    iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1442g, iS, -2);
                    boolean z8 = eVar.f26428x == 1;
                    int i17 = aVar.f26555j;
                    if (i17 == b.a.f26544l || i17 == b.a.f26545m) {
                        if (aVar.f26555j == b.a.f26545m || !z8 || (z8 && (view.getMeasuredWidth() == eVar.U())) || (view instanceof i) || eVar.m0()) {
                            iV = eVar.v();
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iV, 1073741824);
                        }
                    }
                }
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, iS, i11);
            }
            t.f fVar = (t.f) eVar.I();
            if (fVar != null && t.j.b(ConstraintLayout.this.f1370i, 256) && view.getMeasuredWidth() == eVar.U() && view.getMeasuredWidth() < fVar.U() && view.getMeasuredHeight() == eVar.v() && view.getMeasuredHeight() < fVar.v() && view.getBaseline() == eVar.n() && !eVar.k0()) {
                if (d(eVar.A(), iMakeMeasureSpec, eVar.U()) && d(eVar.B(), iMakeMeasureSpec2, eVar.v())) {
                    aVar.f26550e = eVar.U();
                    aVar.f26551f = eVar.v();
                    aVar.f26552g = eVar.n();
                    return;
                }
            }
            e.b bVar3 = e.b.MATCH_CONSTRAINT;
            boolean z9 = bVar == bVar3;
            boolean z10 = bVar2 == bVar3;
            e.b bVar4 = e.b.MATCH_PARENT;
            boolean z11 = bVar2 == bVar4 || bVar2 == e.b.FIXED;
            boolean z12 = bVar == bVar4 || bVar == e.b.FIXED;
            boolean z13 = z9 && eVar.f26389d0 > 0.0f;
            boolean z14 = z10 && eVar.f26389d0 > 0.0f;
            if (view == null) {
                return;
            }
            b bVar5 = (b) view.getLayoutParams();
            int i18 = aVar.f26555j;
            if (i18 != b.a.f26544l && i18 != b.a.f26545m && z9 && eVar.f26426w == 0 && z10 && eVar.f26428x == 0) {
                i9 = -1;
                measuredHeight = 0;
                baseline = 0;
                iMax = 0;
            } else {
                if ((view instanceof m) && (eVar instanceof t.k)) {
                    ((m) view).t((t.k) eVar, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                eVar.S0(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i19 = eVar.f26432z;
                iMax = i19 > 0 ? Math.max(i19, measuredWidth) : measuredWidth;
                int i20 = eVar.A;
                if (i20 > 0) {
                    iMax = Math.min(i20, iMax);
                }
                int i21 = eVar.C;
                if (i21 > 0) {
                    measuredHeight = Math.max(i21, measuredHeight2);
                    i8 = iMakeMeasureSpec;
                } else {
                    i8 = iMakeMeasureSpec;
                    measuredHeight = measuredHeight2;
                }
                int i22 = eVar.D;
                if (i22 > 0) {
                    measuredHeight = Math.min(i22, measuredHeight);
                }
                if (!t.j.b(ConstraintLayout.this.f1370i, 1)) {
                    if (z13 && z11) {
                        iMax = (int) ((measuredHeight * eVar.f26389d0) + 0.5f);
                    } else if (z14 && z12) {
                        measuredHeight = (int) ((iMax / eVar.f26389d0) + 0.5f);
                    }
                }
                if (measuredWidth != iMax || measuredHeight2 != measuredHeight) {
                    int iMakeMeasureSpec3 = measuredWidth != iMax ? View.MeasureSpec.makeMeasureSpec(iMax, 1073741824) : i8;
                    if (measuredHeight2 != measuredHeight) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec3, iMakeMeasureSpec2);
                    eVar.S0(iMakeMeasureSpec3, iMakeMeasureSpec2);
                    iMax = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i9 = -1;
            }
            boolean z15 = baseline != i9;
            aVar.f26554i = (iMax == aVar.f26548c && measuredHeight == aVar.f26549d) ? false : true;
            if (bVar5.f1399g0) {
                z15 = true;
            }
            if (z15 && baseline != -1 && eVar.n() != baseline) {
                aVar.f26554i = true;
            }
            aVar.f26550e = iMax;
            aVar.f26551f = measuredHeight;
            aVar.f26553h = z15;
            aVar.f26552g = baseline;
        }

        @Override // u.b.InterfaceC0178b
        public final void b() {
            int childCount = this.f1436a.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = this.f1436a.getChildAt(i8);
                if (childAt instanceof i) {
                    ((i) childAt).a(this.f1436a);
                }
            }
            int size = this.f1436a.f1363b.size();
            if (size > 0) {
                for (int i9 = 0; i9 < size; i9++) {
                    ((androidx.constraintlayout.widget.c) this.f1436a.f1363b.get(i9)).p(this.f1436a);
                }
            }
        }

        public void c(int i8, int i9, int i10, int i11, int i12, int i13) {
            this.f1437b = i10;
            this.f1438c = i11;
            this.f1439d = i12;
            this.f1440e = i13;
            this.f1441f = i8;
            this.f1442g = i9;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1362a = new SparseArray<>();
        this.f1363b = new ArrayList<>(4);
        this.f1364c = new t.f();
        this.f1365d = 0;
        this.f1366e = 0;
        this.f1367f = Integer.MAX_VALUE;
        this.f1368g = Integer.MAX_VALUE;
        this.f1369h = true;
        this.f1370i = 257;
        this.f1371j = null;
        this.f1372k = null;
        this.f1373l = -1;
        this.f1374m = new HashMap<>();
        this.f1375n = -1;
        this.f1376o = -1;
        this.f1377p = -1;
        this.f1378q = -1;
        this.f1379r = 0;
        this.f1380s = 0;
        this.f1381t = new SparseArray<>();
        this.f1382u = new c(this);
        this.f1383v = 0;
        this.f1384w = 0;
        p(attributeSet, 0, 0);
    }

    private final t.e g(int i8) {
        if (i8 == 0) {
            return this.f1364c;
        }
        View viewFindViewById = this.f1362a.get(i8);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i8)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f1364c;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((b) viewFindViewById.getLayoutParams()).f1429v0;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static l getSharedValues() {
        if (f1361x == null) {
            f1361x = new l();
        }
        return f1361x;
    }

    private void p(AttributeSet attributeSet, int i8, int i9) {
        this.f1364c.y0(this);
        this.f1364c.R1(this.f1382u);
        this.f1362a.put(getId(), this);
        this.f1371j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.f1724n1, i8, i9);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == k.f1769s1) {
                    this.f1365d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1365d);
                } else if (index == k.f1778t1) {
                    this.f1366e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1366e);
                } else if (index == k.f1751q1) {
                    this.f1367f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1367f);
                } else if (index == k.f1760r1) {
                    this.f1368g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1368g);
                } else if (index == k.H2) {
                    this.f1370i = typedArrayObtainStyledAttributes.getInt(index, this.f1370i);
                } else if (index == k.C1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            s(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1372k = null;
                        }
                    }
                } else if (index == k.f1818y1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        e eVar = new e();
                        this.f1371j = eVar;
                        eVar.j(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1371j = null;
                    }
                    this.f1373l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f1364c.S1(this.f1370i);
    }

    private void r() {
        this.f1369h = true;
        this.f1375n = -1;
        this.f1376o = -1;
        this.f1377p = -1;
        this.f1378q = -1;
        this.f1379r = 0;
        this.f1380s = 0;
    }

    private void v() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            t.e eVarI = i(getChildAt(i8));
            if (eVarI != null) {
                eVarI.r0();
            }
        }
        if (zIsInEditMode) {
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    w(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    g(childAt.getId()).z0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f1373l != -1) {
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt2 = getChildAt(i10);
                if (childAt2.getId() == this.f1373l && (childAt2 instanceof f)) {
                    this.f1371j = ((f) childAt2).getConstraintSet();
                }
            }
        }
        e eVar = this.f1371j;
        if (eVar != null) {
            eVar.d(this, true);
        }
        this.f1364c.r1();
        int size = this.f1363b.size();
        if (size > 0) {
            for (int i11 = 0; i11 < size; i11++) {
                this.f1363b.get(i11).r(this);
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt3 = getChildAt(i12);
            if (childAt3 instanceof i) {
                ((i) childAt3).b(this);
            }
        }
        this.f1381t.clear();
        this.f1381t.put(0, this.f1364c);
        this.f1381t.put(getId(), this.f1364c);
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt4 = getChildAt(i13);
            this.f1381t.put(childAt4.getId(), i(childAt4));
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt5 = getChildAt(i14);
            t.e eVarI2 = i(childAt5);
            if (eVarI2 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.f1364c.c(eVarI2);
                c(zIsInEditMode, childAt5, eVarI2, bVar, this.f1381t);
            }
        }
    }

    private void y(t.e eVar, b bVar, SparseArray<t.e> sparseArray, int i8, d.b bVar2) {
        View view = this.f1362a.get(i8);
        t.e eVar2 = sparseArray.get(i8);
        if (eVar2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.f1399g0 = true;
        d.b bVar3 = d.b.BASELINE;
        if (bVar2 == bVar3) {
            b bVar4 = (b) view.getLayoutParams();
            bVar4.f1399g0 = true;
            bVar4.f1429v0.H0(true);
        }
        eVar.m(bVar3).a(eVar2.m(bVar2), bVar.D, bVar.C, true);
        eVar.H0(true);
        eVar.m(d.b.TOP).p();
        eVar.m(d.b.BOTTOM).p();
    }

    private boolean z() {
        int childCount = getChildCount();
        boolean z7 = false;
        int i8 = 0;
        while (true) {
            if (i8 >= childCount) {
                break;
            }
            if (getChildAt(i8).isLayoutRequested()) {
                z7 = true;
                break;
            }
            i8++;
        }
        if (z7) {
            v();
        }
        return z7;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void c(boolean r17, android.view.View r18, t.e r19, androidx.constraintlayout.widget.ConstraintLayout.b r20, android.util.SparseArray<t.e> r21) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.c(boolean, android.view.View, t.e, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.c> arrayList = this.f1363b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i8 = 0; i8 < size; i8++) {
                this.f1363b.get(i8).q(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(com.amazon.a.a.o.b.f.f3942a);
                    if (strArrSplit.length == 4) {
                        int i10 = Integer.parseInt(strArrSplit[0]);
                        int i11 = Integer.parseInt(strArrSplit[1]);
                        int i12 = Integer.parseInt(strArrSplit[2]);
                        int i13 = (int) ((i10 / 1080.0f) * width);
                        int i14 = (int) ((i11 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f8 = i13;
                        float f9 = i14;
                        float f10 = i13 + ((int) ((i12 / 1080.0f) * width));
                        canvas.drawLine(f8, f9, f10, f9, paint);
                        float f11 = i14 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f10, f9, f10, f11, paint);
                        canvas.drawLine(f10, f11, f8, f11, paint);
                        canvas.drawLine(f8, f11, f8, f9, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f8, f9, f10, f11, paint);
                        canvas.drawLine(f8, f11, f10, f9, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object f(int i8, Object obj) {
        if (i8 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.f1374m;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f1374m.get(str);
    }

    @Override // android.view.View
    public void forceLayout() {
        r();
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public int getMaxHeight() {
        return this.f1368g;
    }

    public int getMaxWidth() {
        return this.f1367f;
    }

    public int getMinHeight() {
        return this.f1366e;
    }

    public int getMinWidth() {
        return this.f1365d;
    }

    public int getOptimizationLevel() {
        return this.f1364c.G1();
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.f1364c.f26410o == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.f1364c.f26410o = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.f1364c.f26410o = "parent";
            }
        }
        if (this.f1364c.r() == null) {
            t.f fVar = this.f1364c;
            fVar.z0(fVar.f26410o);
            Log.v("ConstraintLayout", " setDebugName " + this.f1364c.r());
        }
        for (t.e eVar : this.f1364c.o1()) {
            View view = (View) eVar.q();
            if (view != null) {
                if (eVar.f26410o == null && (id = view.getId()) != -1) {
                    eVar.f26410o = getContext().getResources().getResourceEntryName(id);
                }
                if (eVar.r() == null) {
                    eVar.z0(eVar.f26410o);
                    Log.v("ConstraintLayout", " setDebugName " + eVar.r());
                }
            }
        }
        this.f1364c.M(sb);
        return sb.toString();
    }

    public View h(int i8) {
        return this.f1362a.get(i8);
    }

    public final t.e i(View view) {
        if (view == this) {
            return this.f1364c;
        }
        if (view == null) {
            return null;
        }
        if (!(view.getLayoutParams() instanceof b)) {
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (!(view.getLayoutParams() instanceof b)) {
                return null;
            }
        }
        return ((b) view.getLayoutParams()).f1429v0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            b bVar = (b) childAt.getLayoutParams();
            t.e eVar = bVar.f1429v0;
            if ((childAt.getVisibility() != 8 || bVar.f1401h0 || bVar.f1403i0 || bVar.f1407k0 || zIsInEditMode) && !bVar.f1405j0) {
                int iV = eVar.V();
                int iW = eVar.W();
                int iU = eVar.U() + iV;
                int iV2 = eVar.v() + iW;
                childAt.layout(iV, iW, iU, iV2);
                if ((childAt instanceof i) && (content = ((i) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iV, iW, iU, iV2);
                }
            }
        }
        int size = this.f1363b.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                this.f1363b.get(i13).o(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        if (this.f1383v == i8) {
            int i10 = this.f1384w;
        }
        if (!this.f1369h) {
            int childCount = getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                if (getChildAt(i11).isLayoutRequested()) {
                    this.f1369h = true;
                    break;
                }
                i11++;
            }
        }
        boolean z7 = this.f1369h;
        this.f1383v = i8;
        this.f1384w = i9;
        this.f1364c.U1(q());
        if (this.f1369h) {
            this.f1369h = false;
            if (z()) {
                this.f1364c.W1();
            }
        }
        u(this.f1364c, this.f1370i, i8, i9);
        t(i8, i9, this.f1364c.U(), this.f1364c.v(), this.f1364c.M1(), this.f1364c.K1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        t.e eVarI = i(view);
        if ((view instanceof h) && !(eVarI instanceof t.g)) {
            b bVar = (b) view.getLayoutParams();
            t.g gVar = new t.g();
            bVar.f1429v0 = gVar;
            bVar.f1401h0 = true;
            gVar.x1(bVar.Z);
        }
        if (view instanceof androidx.constraintlayout.widget.c) {
            androidx.constraintlayout.widget.c cVar = (androidx.constraintlayout.widget.c) view;
            cVar.s();
            ((b) view.getLayoutParams()).f1403i0 = true;
            if (!this.f1363b.contains(cVar)) {
                this.f1363b.add(cVar);
            }
        }
        this.f1362a.put(view.getId(), view);
        this.f1369h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1362a.remove(view.getId());
        this.f1364c.q1(i(view));
        this.f1363b.remove(view);
        this.f1369h = true;
    }

    protected boolean q() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        r();
        super.requestLayout();
    }

    protected void s(int i8) {
        this.f1372k = new d(getContext(), this, i8);
    }

    public void setConstraintSet(e eVar) {
        this.f1371j = eVar;
    }

    @Override // android.view.View
    public void setId(int i8) {
        this.f1362a.remove(getId());
        super.setId(i8);
        this.f1362a.put(getId(), this);
    }

    public void setMaxHeight(int i8) {
        if (i8 == this.f1368g) {
            return;
        }
        this.f1368g = i8;
        requestLayout();
    }

    public void setMaxWidth(int i8) {
        if (i8 == this.f1367f) {
            return;
        }
        this.f1367f = i8;
        requestLayout();
    }

    public void setMinHeight(int i8) {
        if (i8 == this.f1366e) {
            return;
        }
        this.f1366e = i8;
        requestLayout();
    }

    public void setMinWidth(int i8) {
        if (i8 == this.f1365d) {
            return;
        }
        this.f1365d = i8;
        requestLayout();
    }

    public void setOnConstraintsChanged(g gVar) {
        d dVar = this.f1372k;
        if (dVar != null) {
            dVar.c(gVar);
        }
    }

    public void setOptimizationLevel(int i8) {
        this.f1370i = i8;
        this.f1364c.S1(i8);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    protected void t(int i8, int i9, int i10, int i11, boolean z7, boolean z8) {
        c cVar = this.f1382u;
        int i12 = cVar.f1440e;
        int iResolveSizeAndState = View.resolveSizeAndState(i10 + cVar.f1439d, i8, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i11 + i12, i9, 0) & 16777215;
        int iMin = Math.min(this.f1367f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f1368g, iResolveSizeAndState2);
        if (z7) {
            iMin |= 16777216;
        }
        if (z8) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.f1375n = iMin;
        this.f1376o = iMin2;
    }

    protected void u(t.f fVar, int i8, int i9, int i10) {
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i9);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i11 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.f1382u.c(i9, i10, iMax, iMax2, paddingWidth, i11);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        int iMax5 = (iMax3 > 0 || iMax4 > 0) ? q() ? iMax4 : iMax3 : Math.max(0, getPaddingLeft());
        int i12 = size - paddingWidth;
        int i13 = size2 - i11;
        x(fVar, mode, i12, mode2, i13);
        fVar.N1(i8, mode, i12, mode2, i13, this.f1375n, this.f1376o, iMax5, iMax);
    }

    public void w(int i8, Object obj, Object obj2) {
        if (i8 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f1374m == null) {
                this.f1374m = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.f1374m.put(strSubstring, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c A[PHI: r9
  0x002c: PHI (r9v2 t.e$b) = (r9v1 t.e$b), (r9v8 t.e$b) binds: [B:13:0x002a, B:10:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b A[PHI: r2
  0x004b: PHI (r2v2 t.e$b) = (r2v1 t.e$b), (r2v4 t.e$b) binds: [B:24:0x0049, B:21:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void x(t.f r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$c r0 = r7.f1382u
            int r1 = r0.f1440e
            int r0 = r0.f1439d
            t.e$b r2 = t.e.b.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r9 == r5) goto L28
            if (r9 == 0) goto L23
            if (r9 == r4) goto L1a
            r9 = r2
        L18:
            r10 = 0
            goto L32
        L1a:
            int r9 = r7.f1367f
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L32
        L23:
            t.e$b r9 = t.e.b.WRAP_CONTENT
            if (r3 != 0) goto L18
            goto L2c
        L28:
            t.e$b r9 = t.e.b.WRAP_CONTENT
            if (r3 != 0) goto L32
        L2c:
            int r10 = r7.f1365d
            int r10 = java.lang.Math.max(r6, r10)
        L32:
            if (r11 == r5) goto L47
            if (r11 == 0) goto L42
            if (r11 == r4) goto L3a
        L38:
            r12 = 0
            goto L51
        L3a:
            int r11 = r7.f1368g
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L51
        L42:
            t.e$b r2 = t.e.b.WRAP_CONTENT
            if (r3 != 0) goto L38
            goto L4b
        L47:
            t.e$b r2 = t.e.b.WRAP_CONTENT
            if (r3 != 0) goto L51
        L4b:
            int r11 = r7.f1366e
            int r12 = java.lang.Math.max(r6, r11)
        L51:
            int r11 = r8.U()
            if (r10 != r11) goto L5d
            int r11 = r8.v()
            if (r12 == r11) goto L60
        L5d:
            r8.J1()
        L60:
            r8.j1(r6)
            r8.k1(r6)
            int r11 = r7.f1367f
            int r11 = r11 - r0
            r8.U0(r11)
            int r11 = r7.f1368g
            int r11 = r11 - r1
            r8.T0(r11)
            r8.X0(r6)
            r8.W0(r6)
            r8.M0(r9)
            r8.h1(r10)
            r8.d1(r2)
            r8.I0(r12)
            int r9 = r7.f1365d
            int r9 = r9 - r0
            r8.X0(r9)
            int r9 = r7.f1366e
            int r9 = r9 - r1
            r8.W0(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.x(t.f, int, int, int, int):void");
    }
}
