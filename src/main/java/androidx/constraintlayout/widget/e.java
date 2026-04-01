package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.f;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f1490f = {0, 4, 8};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static SparseIntArray f1491g = new SparseIntArray();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static SparseIntArray f1492h = new SparseIntArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1493a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1494b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<String, androidx.constraintlayout.widget.b> f1495c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f1496d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private HashMap<Integer, a> f1497e = new HashMap<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f1498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f1499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f1500c = new d();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c f1501d = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b f1502e = new b();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final C0019e f1503f = new C0019e();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.b> f1504g = new HashMap<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        C0018a f1505h;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.e$a$a, reason: collision with other inner class name */
        static class C0018a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int[] f1506a = new int[10];

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int[] f1507b = new int[10];

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f1508c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int[] f1509d = new int[10];

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            float[] f1510e = new float[10];

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f1511f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int[] f1512g = new int[5];

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            String[] f1513h = new String[5];

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            int f1514i = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int[] f1515j = new int[4];

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            boolean[] f1516k = new boolean[4];

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f1517l = 0;

            C0018a() {
            }

            void a(int i8, float f8) {
                int i9 = this.f1511f;
                int[] iArr = this.f1509d;
                if (i9 >= iArr.length) {
                    this.f1509d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f1510e;
                    this.f1510e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f1509d;
                int i10 = this.f1511f;
                iArr2[i10] = i8;
                float[] fArr2 = this.f1510e;
                this.f1511f = i10 + 1;
                fArr2[i10] = f8;
            }

            void b(int i8, int i9) {
                int i10 = this.f1508c;
                int[] iArr = this.f1506a;
                if (i10 >= iArr.length) {
                    this.f1506a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f1507b;
                    this.f1507b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f1506a;
                int i11 = this.f1508c;
                iArr3[i11] = i8;
                int[] iArr4 = this.f1507b;
                this.f1508c = i11 + 1;
                iArr4[i11] = i9;
            }

            void c(int i8, String str) {
                int i9 = this.f1514i;
                int[] iArr = this.f1512g;
                if (i9 >= iArr.length) {
                    this.f1512g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f1513h;
                    this.f1513h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f1512g;
                int i10 = this.f1514i;
                iArr2[i10] = i8;
                String[] strArr2 = this.f1513h;
                this.f1514i = i10 + 1;
                strArr2[i10] = str;
            }

            void d(int i8, boolean z7) {
                int i9 = this.f1517l;
                int[] iArr = this.f1515j;
                if (i9 >= iArr.length) {
                    this.f1515j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f1516k;
                    this.f1516k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f1515j;
                int i10 = this.f1517l;
                iArr2[i10] = i8;
                boolean[] zArr2 = this.f1516k;
                this.f1517l = i10 + 1;
                zArr2[i10] = z7;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(int i8, ConstraintLayout.b bVar) {
            this.f1498a = i8;
            b bVar2 = this.f1502e;
            bVar2.f1537j = bVar.f1394e;
            bVar2.f1539k = bVar.f1396f;
            bVar2.f1541l = bVar.f1398g;
            bVar2.f1543m = bVar.f1400h;
            bVar2.f1545n = bVar.f1402i;
            bVar2.f1547o = bVar.f1404j;
            bVar2.f1549p = bVar.f1406k;
            bVar2.f1551q = bVar.f1408l;
            bVar2.f1553r = bVar.f1410m;
            bVar2.f1554s = bVar.f1412n;
            bVar2.f1555t = bVar.f1414o;
            bVar2.f1556u = bVar.f1422s;
            bVar2.f1557v = bVar.f1424t;
            bVar2.f1558w = bVar.f1426u;
            bVar2.f1559x = bVar.f1428v;
            bVar2.f1560y = bVar.G;
            bVar2.f1561z = bVar.H;
            bVar2.A = bVar.I;
            bVar2.B = bVar.f1416p;
            bVar2.C = bVar.f1418q;
            bVar2.D = bVar.f1420r;
            bVar2.E = bVar.X;
            bVar2.F = bVar.Y;
            bVar2.G = bVar.Z;
            bVar2.f1533h = bVar.f1390c;
            bVar2.f1529f = bVar.f1386a;
            bVar2.f1531g = bVar.f1388b;
            bVar2.f1525d = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f1527e = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.H = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.I = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.J = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.K = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.N = bVar.D;
            bVar2.V = bVar.M;
            bVar2.W = bVar.L;
            bVar2.Y = bVar.O;
            bVar2.X = bVar.N;
            bVar2.f1546n0 = bVar.f1387a0;
            bVar2.f1548o0 = bVar.f1389b0;
            bVar2.Z = bVar.P;
            bVar2.f1520a0 = bVar.Q;
            bVar2.f1522b0 = bVar.T;
            bVar2.f1524c0 = bVar.U;
            bVar2.f1526d0 = bVar.R;
            bVar2.f1528e0 = bVar.S;
            bVar2.f1530f0 = bVar.V;
            bVar2.f1532g0 = bVar.W;
            bVar2.f1544m0 = bVar.f1391c0;
            bVar2.P = bVar.f1432x;
            bVar2.R = bVar.f1434z;
            bVar2.O = bVar.f1430w;
            bVar2.Q = bVar.f1433y;
            bVar2.T = bVar.A;
            bVar2.S = bVar.B;
            bVar2.U = bVar.C;
            bVar2.f1552q0 = bVar.f1393d0;
            bVar2.L = bVar.getMarginEnd();
            this.f1502e.M = bVar.getMarginStart();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(int i8, f.a aVar) {
            f(i8, aVar);
            this.f1500c.f1580d = aVar.f1598x0;
            C0019e c0019e = this.f1503f;
            c0019e.f1584b = aVar.A0;
            c0019e.f1585c = aVar.B0;
            c0019e.f1586d = aVar.C0;
            c0019e.f1587e = aVar.D0;
            c0019e.f1588f = aVar.E0;
            c0019e.f1589g = aVar.F0;
            c0019e.f1590h = aVar.G0;
            c0019e.f1592j = aVar.H0;
            c0019e.f1593k = aVar.I0;
            c0019e.f1594l = aVar.J0;
            c0019e.f1596n = aVar.f1600z0;
            c0019e.f1595m = aVar.f1599y0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(androidx.constraintlayout.widget.c cVar, int i8, f.a aVar) {
            g(i8, aVar);
            if (cVar instanceof androidx.constraintlayout.widget.a) {
                b bVar = this.f1502e;
                bVar.f1538j0 = 1;
                androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) cVar;
                bVar.f1534h0 = aVar2.getType();
                this.f1502e.f1540k0 = aVar2.getReferencedIds();
                this.f1502e.f1536i0 = aVar2.getMargin();
            }
        }

        public void d(ConstraintLayout.b bVar) {
            b bVar2 = this.f1502e;
            bVar.f1394e = bVar2.f1537j;
            bVar.f1396f = bVar2.f1539k;
            bVar.f1398g = bVar2.f1541l;
            bVar.f1400h = bVar2.f1543m;
            bVar.f1402i = bVar2.f1545n;
            bVar.f1404j = bVar2.f1547o;
            bVar.f1406k = bVar2.f1549p;
            bVar.f1408l = bVar2.f1551q;
            bVar.f1410m = bVar2.f1553r;
            bVar.f1412n = bVar2.f1554s;
            bVar.f1414o = bVar2.f1555t;
            bVar.f1422s = bVar2.f1556u;
            bVar.f1424t = bVar2.f1557v;
            bVar.f1426u = bVar2.f1558w;
            bVar.f1428v = bVar2.f1559x;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.H;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.I;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.J;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.K;
            bVar.A = bVar2.T;
            bVar.B = bVar2.S;
            bVar.f1432x = bVar2.P;
            bVar.f1434z = bVar2.R;
            bVar.G = bVar2.f1560y;
            bVar.H = bVar2.f1561z;
            bVar.f1416p = bVar2.B;
            bVar.f1418q = bVar2.C;
            bVar.f1420r = bVar2.D;
            bVar.I = bVar2.A;
            bVar.X = bVar2.E;
            bVar.Y = bVar2.F;
            bVar.M = bVar2.V;
            bVar.L = bVar2.W;
            bVar.O = bVar2.Y;
            bVar.N = bVar2.X;
            bVar.f1387a0 = bVar2.f1546n0;
            bVar.f1389b0 = bVar2.f1548o0;
            bVar.P = bVar2.Z;
            bVar.Q = bVar2.f1520a0;
            bVar.T = bVar2.f1522b0;
            bVar.U = bVar2.f1524c0;
            bVar.R = bVar2.f1526d0;
            bVar.S = bVar2.f1528e0;
            bVar.V = bVar2.f1530f0;
            bVar.W = bVar2.f1532g0;
            bVar.Z = bVar2.G;
            bVar.f1390c = bVar2.f1533h;
            bVar.f1386a = bVar2.f1529f;
            bVar.f1388b = bVar2.f1531g;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f1525d;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f1527e;
            String str = bVar2.f1544m0;
            if (str != null) {
                bVar.f1391c0 = str;
            }
            bVar.f1393d0 = bVar2.f1552q0;
            bVar.setMarginStart(bVar2.M);
            bVar.setMarginEnd(this.f1502e.L);
            bVar.a();
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f1502e.a(this.f1502e);
            aVar.f1501d.a(this.f1501d);
            aVar.f1500c.a(this.f1500c);
            aVar.f1503f.a(this.f1503f);
            aVar.f1498a = this.f1498a;
            aVar.f1505h = this.f1505h;
            return aVar;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        private static SparseIntArray f1518r0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1525d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1527e;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public int[] f1540k0;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public String f1542l0;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public String f1544m0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1519a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f1521b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f1523c = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1529f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f1531g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f1533h = -1.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f1535i = true;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f1537j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f1539k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f1541l = -1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f1543m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f1545n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f1547o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f1549p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f1551q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f1553r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f1554s = -1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f1555t = -1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f1556u = -1;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f1557v = -1;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f1558w = -1;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f1559x = -1;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public float f1560y = 0.5f;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public float f1561z = 0.5f;
        public String A = null;
        public int B = -1;
        public int C = 0;
        public float D = 0.0f;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public int U = Integer.MIN_VALUE;
        public float V = -1.0f;
        public float W = -1.0f;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public int f1520a0 = 0;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public int f1522b0 = 0;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public int f1524c0 = 0;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f1526d0 = 0;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public int f1528e0 = 0;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public float f1530f0 = 1.0f;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public float f1532g0 = 1.0f;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public int f1534h0 = -1;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public int f1536i0 = 0;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public int f1538j0 = -1;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public boolean f1546n0 = false;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public boolean f1548o0 = false;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public boolean f1550p0 = true;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f1552q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1518r0 = sparseIntArray;
            sparseIntArray.append(k.K5, 24);
            f1518r0.append(k.L5, 25);
            f1518r0.append(k.N5, 28);
            f1518r0.append(k.O5, 29);
            f1518r0.append(k.T5, 35);
            f1518r0.append(k.S5, 34);
            f1518r0.append(k.f1790u5, 4);
            f1518r0.append(k.f1782t5, 3);
            f1518r0.append(k.f1764r5, 1);
            f1518r0.append(k.Z5, 6);
            f1518r0.append(k.f1612a6, 7);
            f1518r0.append(k.B5, 17);
            f1518r0.append(k.C5, 18);
            f1518r0.append(k.D5, 19);
            f1518r0.append(k.f1728n5, 90);
            f1518r0.append(k.Z4, 26);
            f1518r0.append(k.P5, 31);
            f1518r0.append(k.Q5, 32);
            f1518r0.append(k.A5, 10);
            f1518r0.append(k.f1830z5, 9);
            f1518r0.append(k.f1639d6, 13);
            f1518r0.append(k.f1666g6, 16);
            f1518r0.append(k.f1648e6, 14);
            f1518r0.append(k.f1621b6, 11);
            f1518r0.append(k.f1657f6, 15);
            f1518r0.append(k.f1630c6, 12);
            f1518r0.append(k.W5, 38);
            f1518r0.append(k.I5, 37);
            f1518r0.append(k.H5, 39);
            f1518r0.append(k.V5, 40);
            f1518r0.append(k.G5, 20);
            f1518r0.append(k.U5, 36);
            f1518r0.append(k.f1822y5, 5);
            f1518r0.append(k.J5, 91);
            f1518r0.append(k.R5, 91);
            f1518r0.append(k.M5, 91);
            f1518r0.append(k.f1773s5, 91);
            f1518r0.append(k.f1755q5, 91);
            f1518r0.append(k.f1629c5, 23);
            f1518r0.append(k.f1647e5, 27);
            f1518r0.append(k.f1665g5, 30);
            f1518r0.append(k.f1674h5, 8);
            f1518r0.append(k.f1638d5, 33);
            f1518r0.append(k.f1656f5, 2);
            f1518r0.append(k.f1611a5, 22);
            f1518r0.append(k.f1620b5, 21);
            f1518r0.append(k.X5, 41);
            f1518r0.append(k.E5, 42);
            f1518r0.append(k.f1746p5, 41);
            f1518r0.append(k.f1737o5, 42);
            f1518r0.append(k.f1675h6, 76);
            f1518r0.append(k.f1798v5, 61);
            f1518r0.append(k.f1814x5, 62);
            f1518r0.append(k.f1806w5, 63);
            f1518r0.append(k.Y5, 69);
            f1518r0.append(k.F5, 70);
            f1518r0.append(k.f1710l5, 71);
            f1518r0.append(k.f1692j5, 72);
            f1518r0.append(k.f1701k5, 73);
            f1518r0.append(k.f1719m5, 74);
            f1518r0.append(k.f1683i5, 75);
        }

        public void a(b bVar) {
            this.f1519a = bVar.f1519a;
            this.f1525d = bVar.f1525d;
            this.f1521b = bVar.f1521b;
            this.f1527e = bVar.f1527e;
            this.f1529f = bVar.f1529f;
            this.f1531g = bVar.f1531g;
            this.f1533h = bVar.f1533h;
            this.f1535i = bVar.f1535i;
            this.f1537j = bVar.f1537j;
            this.f1539k = bVar.f1539k;
            this.f1541l = bVar.f1541l;
            this.f1543m = bVar.f1543m;
            this.f1545n = bVar.f1545n;
            this.f1547o = bVar.f1547o;
            this.f1549p = bVar.f1549p;
            this.f1551q = bVar.f1551q;
            this.f1553r = bVar.f1553r;
            this.f1554s = bVar.f1554s;
            this.f1555t = bVar.f1555t;
            this.f1556u = bVar.f1556u;
            this.f1557v = bVar.f1557v;
            this.f1558w = bVar.f1558w;
            this.f1559x = bVar.f1559x;
            this.f1560y = bVar.f1560y;
            this.f1561z = bVar.f1561z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f1520a0 = bVar.f1520a0;
            this.f1522b0 = bVar.f1522b0;
            this.f1524c0 = bVar.f1524c0;
            this.f1526d0 = bVar.f1526d0;
            this.f1528e0 = bVar.f1528e0;
            this.f1530f0 = bVar.f1530f0;
            this.f1532g0 = bVar.f1532g0;
            this.f1534h0 = bVar.f1534h0;
            this.f1536i0 = bVar.f1536i0;
            this.f1538j0 = bVar.f1538j0;
            this.f1544m0 = bVar.f1544m0;
            int[] iArr = bVar.f1540k0;
            if (iArr == null || bVar.f1542l0 != null) {
                this.f1540k0 = null;
            } else {
                this.f1540k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f1542l0 = bVar.f1542l0;
            this.f1546n0 = bVar.f1546n0;
            this.f1548o0 = bVar.f1548o0;
            this.f1550p0 = bVar.f1550p0;
            this.f1552q0 = bVar.f1552q0;
        }

        void b(Context context, AttributeSet attributeSet) {
            StringBuilder sb;
            String str;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.Y4);
            this.f1521b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                int i9 = f1518r0.get(index);
                switch (i9) {
                    case 1:
                        this.f1553r = e.l(typedArrayObtainStyledAttributes, index, this.f1553r);
                        break;
                    case 2:
                        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 3:
                        this.f1551q = e.l(typedArrayObtainStyledAttributes, index, this.f1551q);
                        break;
                    case 4:
                        this.f1549p = e.l(typedArrayObtainStyledAttributes, index, this.f1549p);
                        break;
                    case 5:
                        this.A = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 7:
                        this.F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.F);
                        break;
                    case 8:
                        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 9:
                        this.f1559x = e.l(typedArrayObtainStyledAttributes, index, this.f1559x);
                        break;
                    case R.styleable.GradientColor_android_endX /* 10 */:
                        this.f1558w = e.l(typedArrayObtainStyledAttributes, index, this.f1558w);
                        break;
                    case R.styleable.GradientColor_android_endY /* 11 */:
                        this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 13:
                        this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 14:
                        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 15:
                        this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        break;
                    case com.amazon.c.a.a.c.f4052g /* 16 */:
                        this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 17:
                        this.f1529f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1529f);
                        break;
                    case 18:
                        this.f1531g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1531g);
                        break;
                    case 19:
                        this.f1533h = typedArrayObtainStyledAttributes.getFloat(index, this.f1533h);
                        break;
                    case 20:
                        this.f1560y = typedArrayObtainStyledAttributes.getFloat(index, this.f1560y);
                        break;
                    case 21:
                        this.f1527e = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f1527e);
                        break;
                    case 22:
                        this.f1525d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f1525d);
                        break;
                    case 23:
                        this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 24:
                        this.f1537j = e.l(typedArrayObtainStyledAttributes, index, this.f1537j);
                        break;
                    case 25:
                        this.f1539k = e.l(typedArrayObtainStyledAttributes, index, this.f1539k);
                        break;
                    case 26:
                        this.G = typedArrayObtainStyledAttributes.getInt(index, this.G);
                        break;
                    case 27:
                        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 28:
                        this.f1541l = e.l(typedArrayObtainStyledAttributes, index, this.f1541l);
                        break;
                    case 29:
                        this.f1543m = e.l(typedArrayObtainStyledAttributes, index, this.f1543m);
                        break;
                    case 30:
                        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 31:
                        this.f1556u = e.l(typedArrayObtainStyledAttributes, index, this.f1556u);
                        break;
                    case com.amazon.c.a.a.c.f4053h /* 32 */:
                        this.f1557v = e.l(typedArrayObtainStyledAttributes, index, this.f1557v);
                        break;
                    case 33:
                        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 34:
                        this.f1547o = e.l(typedArrayObtainStyledAttributes, index, this.f1547o);
                        break;
                    case 35:
                        this.f1545n = e.l(typedArrayObtainStyledAttributes, index, this.f1545n);
                        break;
                    case 36:
                        this.f1561z = typedArrayObtainStyledAttributes.getFloat(index, this.f1561z);
                        break;
                    case 37:
                        this.W = typedArrayObtainStyledAttributes.getFloat(index, this.W);
                        break;
                    case 38:
                        this.V = typedArrayObtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 39:
                        this.X = typedArrayObtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 40:
                        this.Y = typedArrayObtainStyledAttributes.getInt(index, this.Y);
                        break;
                    case 41:
                        e.m(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        e.m(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i9) {
                            case 61:
                                this.B = e.l(typedArrayObtainStyledAttributes, index, this.B);
                                break;
                            case 62:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            case 63:
                                this.D = typedArrayObtainStyledAttributes.getFloat(index, this.D);
                                break;
                            default:
                                switch (i9) {
                                    case 69:
                                        this.f1530f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 70:
                                        this.f1532g0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        continue;
                                    case 72:
                                        this.f1534h0 = typedArrayObtainStyledAttributes.getInt(index, this.f1534h0);
                                        continue;
                                    case 73:
                                        this.f1536i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1536i0);
                                        continue;
                                    case 74:
                                        this.f1542l0 = typedArrayObtainStyledAttributes.getString(index);
                                        continue;
                                    case 75:
                                        this.f1550p0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1550p0);
                                        continue;
                                    case 76:
                                        this.f1552q0 = typedArrayObtainStyledAttributes.getInt(index, this.f1552q0);
                                        continue;
                                    case 77:
                                        this.f1554s = e.l(typedArrayObtainStyledAttributes, index, this.f1554s);
                                        continue;
                                    case 78:
                                        this.f1555t = e.l(typedArrayObtainStyledAttributes, index, this.f1555t);
                                        continue;
                                    case 79:
                                        this.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.U);
                                        continue;
                                    case 80:
                                        this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                                        continue;
                                    case 81:
                                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                                        continue;
                                    case 82:
                                        this.f1520a0 = typedArrayObtainStyledAttributes.getInt(index, this.f1520a0);
                                        continue;
                                    case 83:
                                        this.f1524c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1524c0);
                                        continue;
                                    case 84:
                                        this.f1522b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1522b0);
                                        continue;
                                    case 85:
                                        this.f1528e0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1528e0);
                                        continue;
                                    case 86:
                                        this.f1526d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1526d0);
                                        continue;
                                    case 87:
                                        this.f1546n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1546n0);
                                        continue;
                                    case 88:
                                        this.f1548o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1548o0);
                                        continue;
                                    case 89:
                                        this.f1544m0 = typedArrayObtainStyledAttributes.getString(index);
                                        continue;
                                    case 90:
                                        this.f1535i = typedArrayObtainStyledAttributes.getBoolean(index, this.f1535i);
                                        continue;
                                    case 91:
                                        sb = new StringBuilder();
                                        str = "unused attribute 0x";
                                        break;
                                    default:
                                        sb = new StringBuilder();
                                        str = "Unknown attribute 0x";
                                        break;
                                }
                                sb.append(str);
                                sb.append(Integer.toHexString(index));
                                sb.append("   ");
                                sb.append(f1518r0.get(index));
                                Log.w("ConstraintSet", sb.toString());
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static SparseIntArray f1562o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1563a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1564b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1565c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f1566d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1567e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1568f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f1569g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f1570h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f1571i = Float.NaN;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f1572j = Float.NaN;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f1573k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f1574l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f1575m = -3;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f1576n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1562o = sparseIntArray;
            sparseIntArray.append(k.f1783t6, 1);
            f1562o.append(k.f1799v6, 2);
            f1562o.append(k.f1831z6, 3);
            f1562o.append(k.f1774s6, 4);
            f1562o.append(k.f1765r6, 5);
            f1562o.append(k.f1756q6, 6);
            f1562o.append(k.f1791u6, 7);
            f1562o.append(k.f1823y6, 8);
            f1562o.append(k.f1815x6, 9);
            f1562o.append(k.f1807w6, 10);
        }

        public void a(c cVar) {
            this.f1563a = cVar.f1563a;
            this.f1564b = cVar.f1564b;
            this.f1566d = cVar.f1566d;
            this.f1567e = cVar.f1567e;
            this.f1568f = cVar.f1568f;
            this.f1571i = cVar.f1571i;
            this.f1569g = cVar.f1569g;
            this.f1570h = cVar.f1570h;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f1747p6);
            this.f1563a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                switch (f1562o.get(index)) {
                    case 1:
                        this.f1571i = typedArrayObtainStyledAttributes.getFloat(index, this.f1571i);
                        break;
                    case 2:
                        this.f1567e = typedArrayObtainStyledAttributes.getInt(index, this.f1567e);
                        break;
                    case 3:
                        this.f1566d = typedArrayObtainStyledAttributes.peekValue(index).type == 3 ? typedArrayObtainStyledAttributes.getString(index) : r.b.f25815c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f1568f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f1564b = e.l(typedArrayObtainStyledAttributes, index, this.f1564b);
                        break;
                    case 6:
                        this.f1565c = typedArrayObtainStyledAttributes.getInteger(index, this.f1565c);
                        break;
                    case 7:
                        this.f1569g = typedArrayObtainStyledAttributes.getFloat(index, this.f1569g);
                        break;
                    case 8:
                        this.f1573k = typedArrayObtainStyledAttributes.getInteger(index, this.f1573k);
                        break;
                    case 9:
                        this.f1572j = typedArrayObtainStyledAttributes.getFloat(index, this.f1572j);
                        break;
                    case R.styleable.GradientColor_android_endX /* 10 */:
                        int i9 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i9 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f1576n = resourceId;
                            if (resourceId != -1) {
                                this.f1575m = -2;
                            }
                        } else if (i9 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f1574l = string;
                            if (string.indexOf("/") > 0) {
                                this.f1576n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f1575m = -2;
                            } else {
                                this.f1575m = -1;
                            }
                        } else {
                            this.f1575m = typedArrayObtainStyledAttributes.getInteger(index, this.f1576n);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1577a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1578b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1579c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f1580d = 1.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f1581e = Float.NaN;

        public void a(d dVar) {
            this.f1577a = dVar.f1577a;
            this.f1578b = dVar.f1578b;
            this.f1580d = dVar.f1580d;
            this.f1581e = dVar.f1581e;
            this.f1579c = dVar.f1579c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.M6);
            this.f1577a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                if (index == k.O6) {
                    this.f1580d = typedArrayObtainStyledAttributes.getFloat(index, this.f1580d);
                } else if (index == k.N6) {
                    this.f1578b = typedArrayObtainStyledAttributes.getInt(index, this.f1578b);
                    this.f1578b = e.f1490f[this.f1578b];
                } else if (index == k.Q6) {
                    this.f1579c = typedArrayObtainStyledAttributes.getInt(index, this.f1579c);
                } else if (index == k.P6) {
                    this.f1581e = typedArrayObtainStyledAttributes.getFloat(index, this.f1581e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.e$e, reason: collision with other inner class name */
    public static class C0019e {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static SparseIntArray f1582o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1583a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f1584b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f1585c = 0.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f1586d = 0.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f1587e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f1588f = 1.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f1589g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f1590h = Float.NaN;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f1591i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f1592j = 0.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f1593k = 0.0f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f1594l = 0.0f;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f1595m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f1596n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1582o = sparseIntArray;
            sparseIntArray.append(k.f1712l7, 1);
            f1582o.append(k.f1721m7, 2);
            f1582o.append(k.f1730n7, 3);
            f1582o.append(k.f1694j7, 4);
            f1582o.append(k.f1703k7, 5);
            f1582o.append(k.f1658f7, 6);
            f1582o.append(k.f1667g7, 7);
            f1582o.append(k.f1676h7, 8);
            f1582o.append(k.f1685i7, 9);
            f1582o.append(k.f1739o7, 10);
            f1582o.append(k.f1748p7, 11);
            f1582o.append(k.f1757q7, 12);
        }

        public void a(C0019e c0019e) {
            this.f1583a = c0019e.f1583a;
            this.f1584b = c0019e.f1584b;
            this.f1585c = c0019e.f1585c;
            this.f1586d = c0019e.f1586d;
            this.f1587e = c0019e.f1587e;
            this.f1588f = c0019e.f1588f;
            this.f1589g = c0019e.f1589g;
            this.f1590h = c0019e.f1590h;
            this.f1591i = c0019e.f1591i;
            this.f1592j = c0019e.f1592j;
            this.f1593k = c0019e.f1593k;
            this.f1594l = c0019e.f1594l;
            this.f1595m = c0019e.f1595m;
            this.f1596n = c0019e.f1596n;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f1649e7);
            this.f1583a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                switch (f1582o.get(index)) {
                    case 1:
                        this.f1584b = typedArrayObtainStyledAttributes.getFloat(index, this.f1584b);
                        break;
                    case 2:
                        this.f1585c = typedArrayObtainStyledAttributes.getFloat(index, this.f1585c);
                        break;
                    case 3:
                        this.f1586d = typedArrayObtainStyledAttributes.getFloat(index, this.f1586d);
                        break;
                    case 4:
                        this.f1587e = typedArrayObtainStyledAttributes.getFloat(index, this.f1587e);
                        break;
                    case 5:
                        this.f1588f = typedArrayObtainStyledAttributes.getFloat(index, this.f1588f);
                        break;
                    case 6:
                        this.f1589g = typedArrayObtainStyledAttributes.getDimension(index, this.f1589g);
                        break;
                    case 7:
                        this.f1590h = typedArrayObtainStyledAttributes.getDimension(index, this.f1590h);
                        break;
                    case 8:
                        this.f1592j = typedArrayObtainStyledAttributes.getDimension(index, this.f1592j);
                        break;
                    case 9:
                        this.f1593k = typedArrayObtainStyledAttributes.getDimension(index, this.f1593k);
                        break;
                    case R.styleable.GradientColor_android_endX /* 10 */:
                        this.f1594l = typedArrayObtainStyledAttributes.getDimension(index, this.f1594l);
                        break;
                    case R.styleable.GradientColor_android_endY /* 11 */:
                        this.f1595m = true;
                        this.f1596n = typedArrayObtainStyledAttributes.getDimension(index, this.f1596n);
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        this.f1591i = e.l(typedArrayObtainStyledAttributes, index, this.f1591i);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        f1491g.append(k.A0, 25);
        f1491g.append(k.B0, 26);
        f1491g.append(k.D0, 29);
        f1491g.append(k.E0, 30);
        f1491g.append(k.K0, 36);
        f1491g.append(k.J0, 35);
        f1491g.append(k.f1669h0, 4);
        f1491g.append(k.f1660g0, 3);
        f1491g.append(k.f1624c0, 1);
        f1491g.append(k.f1642e0, 91);
        f1491g.append(k.f1633d0, 92);
        f1491g.append(k.T0, 6);
        f1491g.append(k.U0, 7);
        f1491g.append(k.f1732o0, 17);
        f1491g.append(k.f1741p0, 18);
        f1491g.append(k.f1750q0, 19);
        f1491g.append(k.Y, 99);
        f1491g.append(k.f1784u, 27);
        f1491g.append(k.F0, 32);
        f1491g.append(k.G0, 33);
        f1491g.append(k.f1723n0, 10);
        f1491g.append(k.f1714m0, 9);
        f1491g.append(k.X0, 13);
        f1491g.append(k.f1607a1, 16);
        f1491g.append(k.Y0, 14);
        f1491g.append(k.V0, 11);
        f1491g.append(k.Z0, 15);
        f1491g.append(k.W0, 12);
        f1491g.append(k.N0, 40);
        f1491g.append(k.f1817y0, 39);
        f1491g.append(k.f1809x0, 41);
        f1491g.append(k.M0, 42);
        f1491g.append(k.f1801w0, 20);
        f1491g.append(k.L0, 37);
        f1491g.append(k.f1705l0, 5);
        f1491g.append(k.f1825z0, 87);
        f1491g.append(k.I0, 87);
        f1491g.append(k.C0, 87);
        f1491g.append(k.f1651f0, 87);
        f1491g.append(k.f1615b0, 87);
        f1491g.append(k.f1824z, 24);
        f1491g.append(k.B, 28);
        f1491g.append(k.N, 31);
        f1491g.append(k.O, 8);
        f1491g.append(k.A, 34);
        f1491g.append(k.C, 2);
        f1491g.append(k.f1808x, 23);
        f1491g.append(k.f1816y, 21);
        f1491g.append(k.O0, 95);
        f1491g.append(k.f1759r0, 96);
        f1491g.append(k.f1800w, 22);
        f1491g.append(k.D, 43);
        f1491g.append(k.Q, 44);
        f1491g.append(k.L, 45);
        f1491g.append(k.M, 46);
        f1491g.append(k.K, 60);
        f1491g.append(k.I, 47);
        f1491g.append(k.J, 48);
        f1491g.append(k.E, 49);
        f1491g.append(k.F, 50);
        f1491g.append(k.G, 51);
        f1491g.append(k.H, 52);
        f1491g.append(k.P, 53);
        f1491g.append(k.P0, 54);
        f1491g.append(k.f1768s0, 55);
        f1491g.append(k.Q0, 56);
        f1491g.append(k.f1777t0, 57);
        f1491g.append(k.R0, 58);
        f1491g.append(k.f1785u0, 59);
        f1491g.append(k.f1678i0, 61);
        f1491g.append(k.f1696k0, 62);
        f1491g.append(k.f1687j0, 63);
        f1491g.append(k.R, 64);
        f1491g.append(k.f1697k1, 65);
        f1491g.append(k.X, 66);
        f1491g.append(k.f1706l1, 67);
        f1491g.append(k.f1634d1, 79);
        f1491g.append(k.f1792v, 38);
        f1491g.append(k.f1625c1, 68);
        f1491g.append(k.S0, 69);
        f1491g.append(k.f1793v0, 70);
        f1491g.append(k.f1616b1, 97);
        f1491g.append(k.V, 71);
        f1491g.append(k.T, 72);
        f1491g.append(k.U, 73);
        f1491g.append(k.W, 74);
        f1491g.append(k.S, 75);
        f1491g.append(k.f1643e1, 76);
        f1491g.append(k.H0, 77);
        f1491g.append(k.f1715m1, 78);
        f1491g.append(k.f1606a0, 80);
        f1491g.append(k.Z, 81);
        f1491g.append(k.f1652f1, 82);
        f1491g.append(k.f1688j1, 83);
        f1491g.append(k.f1679i1, 84);
        f1491g.append(k.f1670h1, 85);
        f1491g.append(k.f1661g1, 86);
        SparseIntArray sparseIntArray = f1492h;
        int i8 = k.R3;
        sparseIntArray.append(i8, 6);
        f1492h.append(i8, 7);
        f1492h.append(k.M2, 27);
        f1492h.append(k.U3, 13);
        f1492h.append(k.X3, 16);
        f1492h.append(k.V3, 14);
        f1492h.append(k.S3, 11);
        f1492h.append(k.W3, 15);
        f1492h.append(k.T3, 12);
        f1492h.append(k.L3, 40);
        f1492h.append(k.E3, 39);
        f1492h.append(k.D3, 41);
        f1492h.append(k.K3, 42);
        f1492h.append(k.C3, 20);
        f1492h.append(k.J3, 37);
        f1492h.append(k.f1804w3, 5);
        f1492h.append(k.F3, 87);
        f1492h.append(k.I3, 87);
        f1492h.append(k.G3, 87);
        f1492h.append(k.f1780t3, 87);
        f1492h.append(k.f1771s3, 87);
        f1492h.append(k.R2, 24);
        f1492h.append(k.T2, 28);
        f1492h.append(k.f1654f3, 31);
        f1492h.append(k.f1663g3, 8);
        f1492h.append(k.S2, 34);
        f1492h.append(k.U2, 2);
        f1492h.append(k.P2, 23);
        f1492h.append(k.Q2, 21);
        f1492h.append(k.M3, 95);
        f1492h.append(k.f1812x3, 96);
        f1492h.append(k.O2, 22);
        f1492h.append(k.V2, 43);
        f1492h.append(k.f1681i3, 44);
        f1492h.append(k.f1636d3, 45);
        f1492h.append(k.f1645e3, 46);
        f1492h.append(k.f1627c3, 60);
        f1492h.append(k.f1609a3, 47);
        f1492h.append(k.f1618b3, 48);
        f1492h.append(k.W2, 49);
        f1492h.append(k.X2, 50);
        f1492h.append(k.Y2, 51);
        f1492h.append(k.Z2, 52);
        f1492h.append(k.f1672h3, 53);
        f1492h.append(k.N3, 54);
        f1492h.append(k.f1820y3, 55);
        f1492h.append(k.O3, 56);
        f1492h.append(k.f1828z3, 57);
        f1492h.append(k.P3, 58);
        f1492h.append(k.A3, 59);
        f1492h.append(k.f1796v3, 62);
        f1492h.append(k.f1788u3, 63);
        f1492h.append(k.f1690j3, 64);
        f1492h.append(k.f1682i4, 65);
        f1492h.append(k.f1744p3, 66);
        f1492h.append(k.f1691j4, 67);
        f1492h.append(k.f1610a4, 79);
        f1492h.append(k.N2, 38);
        f1492h.append(k.f1619b4, 98);
        f1492h.append(k.Z3, 68);
        f1492h.append(k.Q3, 69);
        f1492h.append(k.B3, 70);
        f1492h.append(k.f1726n3, 71);
        f1492h.append(k.f1708l3, 72);
        f1492h.append(k.f1717m3, 73);
        f1492h.append(k.f1735o3, 74);
        f1492h.append(k.f1699k3, 75);
        f1492h.append(k.f1628c4, 76);
        f1492h.append(k.H3, 77);
        f1492h.append(k.f1700k4, 78);
        f1492h.append(k.f1762r3, 80);
        f1492h.append(k.f1753q3, 81);
        f1492h.append(k.f1637d4, 82);
        f1492h.append(k.f1673h4, 83);
        f1492h.append(k.f1664g4, 84);
        f1492h.append(k.f1655f4, 85);
        f1492h.append(k.f1646e4, 86);
        f1492h.append(k.Y3, 97);
    }

    private int[] h(View view, String str) {
        int iIntValue;
        Object objF;
        String[] strArrSplit = str.split(com.amazon.a.a.o.b.f.f3942a);
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i8 = 0;
        int i9 = 0;
        while (i8 < strArrSplit.length) {
            String strTrim = strArrSplit[i8].trim();
            try {
                iIntValue = j.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objF = ((ConstraintLayout) view.getParent()).f(0, strTrim)) != null && (objF instanceof Integer)) {
                iIntValue = ((Integer) objF).intValue();
            }
            iArr[i9] = iIntValue;
            i8++;
            i9++;
        }
        return i9 != strArrSplit.length ? Arrays.copyOf(iArr, i9) : iArr;
    }

    private a i(Context context, AttributeSet attributeSet, boolean z7) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z7 ? k.L2 : k.f1776t);
        p(context, aVar, typedArrayObtainStyledAttributes, z7);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(TypedArray typedArray, int i8, int i9) {
        int resourceId = typedArray.getResourceId(i8, i9);
        return resourceId == -1 ? typedArray.getInt(i8, -1) : resourceId;
    }

    static void m(Object obj, TypedArray typedArray, int i8, int i9) {
        int i10;
        if (obj == null) {
            return;
        }
        int i11 = typedArray.peekValue(i8).type;
        if (i11 == 3) {
            n(obj, typedArray.getString(i8), i9);
            return;
        }
        int dimensionPixelSize = -2;
        boolean z7 = false;
        if (i11 != 5) {
            int i12 = typedArray.getInt(i8, 0);
            if (i12 != -4) {
                dimensionPixelSize = (i12 == -3 || !(i12 == -2 || i12 == -1)) ? 0 : i12;
            } else {
                z7 = true;
            }
        } else {
            dimensionPixelSize = typedArray.getDimensionPixelSize(i8, 0);
        }
        if (obj instanceof ConstraintLayout.b) {
            ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
            if (i9 == 0) {
                ((ViewGroup.MarginLayoutParams) bVar).width = dimensionPixelSize;
                bVar.f1387a0 = z7;
                return;
            } else {
                ((ViewGroup.MarginLayoutParams) bVar).height = dimensionPixelSize;
                bVar.f1389b0 = z7;
                return;
            }
        }
        if (obj instanceof b) {
            b bVar2 = (b) obj;
            if (i9 == 0) {
                bVar2.f1525d = dimensionPixelSize;
                bVar2.f1546n0 = z7;
                return;
            } else {
                bVar2.f1527e = dimensionPixelSize;
                bVar2.f1548o0 = z7;
                return;
            }
        }
        if (obj instanceof a.C0018a) {
            a.C0018a c0018a = (a.C0018a) obj;
            if (i9 == 0) {
                c0018a.b(23, dimensionPixelSize);
                i10 = 80;
            } else {
                c0018a.b(21, dimensionPixelSize);
                i10 = 81;
            }
            c0018a.d(i10, z7);
        }
    }

    static void n(Object obj, String str, int i8) {
        int i9;
        int i10;
        if (str == null) {
            return;
        }
        int iIndexOf = str.indexOf(61);
        int length = str.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                    if (i8 == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                    }
                    o(bVar, strTrim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).A = strTrim2;
                    return;
                } else {
                    if (obj instanceof a.C0018a) {
                        ((a.C0018a) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f8 = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                        if (i8 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                            bVar2.L = f8;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                            bVar2.M = f8;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar3 = (b) obj;
                        if (i8 == 0) {
                            bVar3.f1525d = 0;
                            bVar3.W = f8;
                            return;
                        } else {
                            bVar3.f1527e = 0;
                            bVar3.V = f8;
                            return;
                        }
                    }
                    if (obj instanceof a.C0018a) {
                        a.C0018a c0018a = (a.C0018a) obj;
                        if (i8 == 0) {
                            c0018a.b(23, 0);
                            i10 = 39;
                        } else {
                            c0018a.b(21, 0);
                            i10 = 40;
                        }
                        c0018a.a(i10, f8);
                        return;
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                        if (i8 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                            bVar4.V = fMax;
                            bVar4.P = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                            bVar4.W = fMax;
                            bVar4.Q = 2;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar5 = (b) obj;
                        if (i8 == 0) {
                            bVar5.f1525d = 0;
                            bVar5.f1530f0 = fMax;
                            bVar5.Z = 2;
                            return;
                        } else {
                            bVar5.f1527e = 0;
                            bVar5.f1532g0 = fMax;
                            bVar5.f1520a0 = 2;
                            return;
                        }
                    }
                    if (obj instanceof a.C0018a) {
                        a.C0018a c0018a2 = (a.C0018a) obj;
                        if (i8 == 0) {
                            c0018a2.b(23, 0);
                            i9 = 54;
                        } else {
                            c0018a2.b(21, 0);
                            i9 = 55;
                        }
                        c0018a2.b(i9, 2);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    static void o(ConstraintLayout.b bVar, String str) {
        float fAbs = Float.NaN;
        int i8 = -1;
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i9 = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i8 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i8 = 1;
                }
                i9 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i9);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i9, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f8 = Float.parseFloat(strSubstring3);
                        float f9 = Float.parseFloat(strSubstring4);
                        if (f8 > 0.0f && f9 > 0.0f) {
                            fAbs = i8 == 1 ? Math.abs(f9 / f8) : Math.abs(f8 / f9);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.I = str;
        bVar.J = fAbs;
        bVar.K = i8;
    }

    private void p(Context context, a aVar, TypedArray typedArray, boolean z7) {
        c cVar;
        String string;
        c cVar2;
        StringBuilder sb;
        String str;
        if (z7) {
            q(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i8 = 0; i8 < indexCount; i8++) {
            int index = typedArray.getIndex(i8);
            if (index != k.f1792v && k.N != index && k.O != index) {
                aVar.f1501d.f1563a = true;
                aVar.f1502e.f1521b = true;
                aVar.f1500c.f1577a = true;
                aVar.f1503f.f1583a = true;
            }
            switch (f1491g.get(index)) {
                case 1:
                    b bVar = aVar.f1502e;
                    bVar.f1553r = l(typedArray, index, bVar.f1553r);
                    continue;
                    break;
                case 2:
                    b bVar2 = aVar.f1502e;
                    bVar2.K = typedArray.getDimensionPixelSize(index, bVar2.K);
                    continue;
                    break;
                case 3:
                    b bVar3 = aVar.f1502e;
                    bVar3.f1551q = l(typedArray, index, bVar3.f1551q);
                    continue;
                    break;
                case 4:
                    b bVar4 = aVar.f1502e;
                    bVar4.f1549p = l(typedArray, index, bVar4.f1549p);
                    continue;
                    break;
                case 5:
                    aVar.f1502e.A = typedArray.getString(index);
                    continue;
                    break;
                case 6:
                    b bVar5 = aVar.f1502e;
                    bVar5.E = typedArray.getDimensionPixelOffset(index, bVar5.E);
                    continue;
                    break;
                case 7:
                    b bVar6 = aVar.f1502e;
                    bVar6.F = typedArray.getDimensionPixelOffset(index, bVar6.F);
                    continue;
                    break;
                case 8:
                    b bVar7 = aVar.f1502e;
                    bVar7.L = typedArray.getDimensionPixelSize(index, bVar7.L);
                    continue;
                    break;
                case 9:
                    b bVar8 = aVar.f1502e;
                    bVar8.f1559x = l(typedArray, index, bVar8.f1559x);
                    continue;
                    break;
                case R.styleable.GradientColor_android_endX /* 10 */:
                    b bVar9 = aVar.f1502e;
                    bVar9.f1558w = l(typedArray, index, bVar9.f1558w);
                    continue;
                    break;
                case R.styleable.GradientColor_android_endY /* 11 */:
                    b bVar10 = aVar.f1502e;
                    bVar10.R = typedArray.getDimensionPixelSize(index, bVar10.R);
                    continue;
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    b bVar11 = aVar.f1502e;
                    bVar11.S = typedArray.getDimensionPixelSize(index, bVar11.S);
                    continue;
                    break;
                case 13:
                    b bVar12 = aVar.f1502e;
                    bVar12.O = typedArray.getDimensionPixelSize(index, bVar12.O);
                    continue;
                    break;
                case 14:
                    b bVar13 = aVar.f1502e;
                    bVar13.Q = typedArray.getDimensionPixelSize(index, bVar13.Q);
                    continue;
                    break;
                case 15:
                    b bVar14 = aVar.f1502e;
                    bVar14.T = typedArray.getDimensionPixelSize(index, bVar14.T);
                    continue;
                    break;
                case com.amazon.c.a.a.c.f4052g /* 16 */:
                    b bVar15 = aVar.f1502e;
                    bVar15.P = typedArray.getDimensionPixelSize(index, bVar15.P);
                    continue;
                    break;
                case 17:
                    b bVar16 = aVar.f1502e;
                    bVar16.f1529f = typedArray.getDimensionPixelOffset(index, bVar16.f1529f);
                    continue;
                    break;
                case 18:
                    b bVar17 = aVar.f1502e;
                    bVar17.f1531g = typedArray.getDimensionPixelOffset(index, bVar17.f1531g);
                    continue;
                    break;
                case 19:
                    b bVar18 = aVar.f1502e;
                    bVar18.f1533h = typedArray.getFloat(index, bVar18.f1533h);
                    continue;
                    break;
                case 20:
                    b bVar19 = aVar.f1502e;
                    bVar19.f1560y = typedArray.getFloat(index, bVar19.f1560y);
                    continue;
                    break;
                case 21:
                    b bVar20 = aVar.f1502e;
                    bVar20.f1527e = typedArray.getLayoutDimension(index, bVar20.f1527e);
                    continue;
                    break;
                case 22:
                    d dVar = aVar.f1500c;
                    dVar.f1578b = typedArray.getInt(index, dVar.f1578b);
                    d dVar2 = aVar.f1500c;
                    dVar2.f1578b = f1490f[dVar2.f1578b];
                    continue;
                    break;
                case 23:
                    b bVar21 = aVar.f1502e;
                    bVar21.f1525d = typedArray.getLayoutDimension(index, bVar21.f1525d);
                    continue;
                    break;
                case 24:
                    b bVar22 = aVar.f1502e;
                    bVar22.H = typedArray.getDimensionPixelSize(index, bVar22.H);
                    continue;
                    break;
                case 25:
                    b bVar23 = aVar.f1502e;
                    bVar23.f1537j = l(typedArray, index, bVar23.f1537j);
                    continue;
                    break;
                case 26:
                    b bVar24 = aVar.f1502e;
                    bVar24.f1539k = l(typedArray, index, bVar24.f1539k);
                    continue;
                    break;
                case 27:
                    b bVar25 = aVar.f1502e;
                    bVar25.G = typedArray.getInt(index, bVar25.G);
                    continue;
                    break;
                case 28:
                    b bVar26 = aVar.f1502e;
                    bVar26.I = typedArray.getDimensionPixelSize(index, bVar26.I);
                    continue;
                    break;
                case 29:
                    b bVar27 = aVar.f1502e;
                    bVar27.f1541l = l(typedArray, index, bVar27.f1541l);
                    continue;
                    break;
                case 30:
                    b bVar28 = aVar.f1502e;
                    bVar28.f1543m = l(typedArray, index, bVar28.f1543m);
                    continue;
                    break;
                case 31:
                    b bVar29 = aVar.f1502e;
                    bVar29.M = typedArray.getDimensionPixelSize(index, bVar29.M);
                    continue;
                    break;
                case com.amazon.c.a.a.c.f4053h /* 32 */:
                    b bVar30 = aVar.f1502e;
                    bVar30.f1556u = l(typedArray, index, bVar30.f1556u);
                    continue;
                    break;
                case 33:
                    b bVar31 = aVar.f1502e;
                    bVar31.f1557v = l(typedArray, index, bVar31.f1557v);
                    continue;
                    break;
                case 34:
                    b bVar32 = aVar.f1502e;
                    bVar32.J = typedArray.getDimensionPixelSize(index, bVar32.J);
                    continue;
                    break;
                case 35:
                    b bVar33 = aVar.f1502e;
                    bVar33.f1547o = l(typedArray, index, bVar33.f1547o);
                    continue;
                    break;
                case 36:
                    b bVar34 = aVar.f1502e;
                    bVar34.f1545n = l(typedArray, index, bVar34.f1545n);
                    continue;
                    break;
                case 37:
                    b bVar35 = aVar.f1502e;
                    bVar35.f1561z = typedArray.getFloat(index, bVar35.f1561z);
                    continue;
                    break;
                case 38:
                    aVar.f1498a = typedArray.getResourceId(index, aVar.f1498a);
                    continue;
                    break;
                case 39:
                    b bVar36 = aVar.f1502e;
                    bVar36.W = typedArray.getFloat(index, bVar36.W);
                    continue;
                    break;
                case 40:
                    b bVar37 = aVar.f1502e;
                    bVar37.V = typedArray.getFloat(index, bVar37.V);
                    continue;
                    break;
                case 41:
                    b bVar38 = aVar.f1502e;
                    bVar38.X = typedArray.getInt(index, bVar38.X);
                    continue;
                    break;
                case 42:
                    b bVar39 = aVar.f1502e;
                    bVar39.Y = typedArray.getInt(index, bVar39.Y);
                    continue;
                    break;
                case 43:
                    d dVar3 = aVar.f1500c;
                    dVar3.f1580d = typedArray.getFloat(index, dVar3.f1580d);
                    continue;
                    break;
                case 44:
                    C0019e c0019e = aVar.f1503f;
                    c0019e.f1595m = true;
                    c0019e.f1596n = typedArray.getDimension(index, c0019e.f1596n);
                    continue;
                    break;
                case 45:
                    C0019e c0019e2 = aVar.f1503f;
                    c0019e2.f1585c = typedArray.getFloat(index, c0019e2.f1585c);
                    continue;
                    break;
                case 46:
                    C0019e c0019e3 = aVar.f1503f;
                    c0019e3.f1586d = typedArray.getFloat(index, c0019e3.f1586d);
                    continue;
                    break;
                case 47:
                    C0019e c0019e4 = aVar.f1503f;
                    c0019e4.f1587e = typedArray.getFloat(index, c0019e4.f1587e);
                    continue;
                    break;
                case 48:
                    C0019e c0019e5 = aVar.f1503f;
                    c0019e5.f1588f = typedArray.getFloat(index, c0019e5.f1588f);
                    continue;
                    break;
                case 49:
                    C0019e c0019e6 = aVar.f1503f;
                    c0019e6.f1589g = typedArray.getDimension(index, c0019e6.f1589g);
                    continue;
                    break;
                case 50:
                    C0019e c0019e7 = aVar.f1503f;
                    c0019e7.f1590h = typedArray.getDimension(index, c0019e7.f1590h);
                    continue;
                    break;
                case 51:
                    C0019e c0019e8 = aVar.f1503f;
                    c0019e8.f1592j = typedArray.getDimension(index, c0019e8.f1592j);
                    continue;
                    break;
                case 52:
                    C0019e c0019e9 = aVar.f1503f;
                    c0019e9.f1593k = typedArray.getDimension(index, c0019e9.f1593k);
                    continue;
                    break;
                case 53:
                    C0019e c0019e10 = aVar.f1503f;
                    c0019e10.f1594l = typedArray.getDimension(index, c0019e10.f1594l);
                    continue;
                    break;
                case 54:
                    b bVar40 = aVar.f1502e;
                    bVar40.Z = typedArray.getInt(index, bVar40.Z);
                    continue;
                    break;
                case 55:
                    b bVar41 = aVar.f1502e;
                    bVar41.f1520a0 = typedArray.getInt(index, bVar41.f1520a0);
                    continue;
                    break;
                case 56:
                    b bVar42 = aVar.f1502e;
                    bVar42.f1522b0 = typedArray.getDimensionPixelSize(index, bVar42.f1522b0);
                    continue;
                    break;
                case 57:
                    b bVar43 = aVar.f1502e;
                    bVar43.f1524c0 = typedArray.getDimensionPixelSize(index, bVar43.f1524c0);
                    continue;
                    break;
                case 58:
                    b bVar44 = aVar.f1502e;
                    bVar44.f1526d0 = typedArray.getDimensionPixelSize(index, bVar44.f1526d0);
                    continue;
                    break;
                case 59:
                    b bVar45 = aVar.f1502e;
                    bVar45.f1528e0 = typedArray.getDimensionPixelSize(index, bVar45.f1528e0);
                    continue;
                    break;
                case 60:
                    C0019e c0019e11 = aVar.f1503f;
                    c0019e11.f1584b = typedArray.getFloat(index, c0019e11.f1584b);
                    continue;
                    break;
                case 61:
                    b bVar46 = aVar.f1502e;
                    bVar46.B = l(typedArray, index, bVar46.B);
                    continue;
                    break;
                case 62:
                    b bVar47 = aVar.f1502e;
                    bVar47.C = typedArray.getDimensionPixelSize(index, bVar47.C);
                    continue;
                    break;
                case 63:
                    b bVar48 = aVar.f1502e;
                    bVar48.D = typedArray.getFloat(index, bVar48.D);
                    continue;
                    break;
                case 64:
                    c cVar3 = aVar.f1501d;
                    cVar3.f1564b = l(typedArray, index, cVar3.f1564b);
                    continue;
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        cVar = aVar.f1501d;
                        string = typedArray.getString(index);
                    } else {
                        cVar = aVar.f1501d;
                        string = r.b.f25815c[typedArray.getInteger(index, 0)];
                    }
                    cVar.f1566d = string;
                    continue;
                    break;
                case 66:
                    aVar.f1501d.f1568f = typedArray.getInt(index, 0);
                    continue;
                    break;
                case 67:
                    c cVar4 = aVar.f1501d;
                    cVar4.f1571i = typedArray.getFloat(index, cVar4.f1571i);
                    continue;
                    break;
                case 68:
                    d dVar4 = aVar.f1500c;
                    dVar4.f1581e = typedArray.getFloat(index, dVar4.f1581e);
                    continue;
                    break;
                case 69:
                    aVar.f1502e.f1530f0 = typedArray.getFloat(index, 1.0f);
                    continue;
                    break;
                case 70:
                    aVar.f1502e.f1532g0 = typedArray.getFloat(index, 1.0f);
                    continue;
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                    break;
                case 72:
                    b bVar49 = aVar.f1502e;
                    bVar49.f1534h0 = typedArray.getInt(index, bVar49.f1534h0);
                    continue;
                    break;
                case 73:
                    b bVar50 = aVar.f1502e;
                    bVar50.f1536i0 = typedArray.getDimensionPixelSize(index, bVar50.f1536i0);
                    continue;
                    break;
                case 74:
                    aVar.f1502e.f1542l0 = typedArray.getString(index);
                    continue;
                    break;
                case 75:
                    b bVar51 = aVar.f1502e;
                    bVar51.f1550p0 = typedArray.getBoolean(index, bVar51.f1550p0);
                    continue;
                    break;
                case 76:
                    c cVar5 = aVar.f1501d;
                    cVar5.f1567e = typedArray.getInt(index, cVar5.f1567e);
                    continue;
                    break;
                case 77:
                    aVar.f1502e.f1544m0 = typedArray.getString(index);
                    continue;
                    break;
                case 78:
                    d dVar5 = aVar.f1500c;
                    dVar5.f1579c = typedArray.getInt(index, dVar5.f1579c);
                    continue;
                    break;
                case 79:
                    c cVar6 = aVar.f1501d;
                    cVar6.f1569g = typedArray.getFloat(index, cVar6.f1569g);
                    continue;
                    break;
                case 80:
                    b bVar52 = aVar.f1502e;
                    bVar52.f1546n0 = typedArray.getBoolean(index, bVar52.f1546n0);
                    continue;
                    break;
                case 81:
                    b bVar53 = aVar.f1502e;
                    bVar53.f1548o0 = typedArray.getBoolean(index, bVar53.f1548o0);
                    continue;
                    break;
                case 82:
                    c cVar7 = aVar.f1501d;
                    cVar7.f1565c = typedArray.getInteger(index, cVar7.f1565c);
                    continue;
                    break;
                case 83:
                    C0019e c0019e12 = aVar.f1503f;
                    c0019e12.f1591i = l(typedArray, index, c0019e12.f1591i);
                    continue;
                    break;
                case 84:
                    c cVar8 = aVar.f1501d;
                    cVar8.f1573k = typedArray.getInteger(index, cVar8.f1573k);
                    continue;
                    break;
                case 85:
                    c cVar9 = aVar.f1501d;
                    cVar9.f1572j = typedArray.getFloat(index, cVar9.f1572j);
                    continue;
                    break;
                case 86:
                    int i9 = typedArray.peekValue(index).type;
                    if (i9 == 1) {
                        aVar.f1501d.f1576n = typedArray.getResourceId(index, -1);
                        cVar2 = aVar.f1501d;
                        if (cVar2.f1576n != -1) {
                            cVar2.f1575m = -2;
                        } else {
                            continue;
                        }
                    } else if (i9 == 3) {
                        aVar.f1501d.f1574l = typedArray.getString(index);
                        if (aVar.f1501d.f1574l.indexOf("/") > 0) {
                            aVar.f1501d.f1576n = typedArray.getResourceId(index, -1);
                            cVar2 = aVar.f1501d;
                            cVar2.f1575m = -2;
                        } else {
                            aVar.f1501d.f1575m = -1;
                        }
                    } else {
                        c cVar10 = aVar.f1501d;
                        cVar10.f1575m = typedArray.getInteger(index, cVar10.f1576n);
                    }
                    break;
                case 87:
                    sb = new StringBuilder();
                    str = "unused attribute 0x";
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    sb = new StringBuilder();
                    str = "Unknown attribute 0x";
                    break;
                case 91:
                    b bVar54 = aVar.f1502e;
                    bVar54.f1554s = l(typedArray, index, bVar54.f1554s);
                    continue;
                    break;
                case 92:
                    b bVar55 = aVar.f1502e;
                    bVar55.f1555t = l(typedArray, index, bVar55.f1555t);
                    continue;
                    break;
                case 93:
                    b bVar56 = aVar.f1502e;
                    bVar56.N = typedArray.getDimensionPixelSize(index, bVar56.N);
                    continue;
                    break;
                case 94:
                    b bVar57 = aVar.f1502e;
                    bVar57.U = typedArray.getDimensionPixelSize(index, bVar57.U);
                    continue;
                    break;
                case 95:
                    m(aVar.f1502e, typedArray, index, 0);
                    continue;
                    break;
                case 96:
                    m(aVar.f1502e, typedArray, index, 1);
                    continue;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 97 */:
                    b bVar58 = aVar.f1502e;
                    bVar58.f1552q0 = typedArray.getInt(index, bVar58.f1552q0);
                    continue;
                    break;
            }
            sb.append(str);
            sb.append(Integer.toHexString(index));
            sb.append("   ");
            sb.append(f1491g.get(index));
            Log.w("ConstraintSet", sb.toString());
        }
        b bVar59 = aVar.f1502e;
        if (bVar59.f1542l0 != null) {
            bVar59.f1540k0 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void q(android.content.Context r11, androidx.constraintlayout.widget.e.a r12, android.content.res.TypedArray r13) {
        /*
            Method dump skipped, instruction units count: 1108
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.e.q(android.content.Context, androidx.constraintlayout.widget.e$a, android.content.res.TypedArray):void");
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    void d(ConstraintLayout constraintLayout, boolean z7) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.f1497e.keySet());
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = constraintLayout.getChildAt(i8);
            int id = childAt.getId();
            if (!this.f1497e.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + androidx.constraintlayout.motion.widget.a.b(childAt));
            } else {
                if (this.f1496d && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f1497e.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = this.f1497e.get(Integer.valueOf(id));
                        if (aVar != null) {
                            if (childAt instanceof androidx.constraintlayout.widget.a) {
                                aVar.f1502e.f1538j0 = 1;
                                androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                                aVar2.setId(id);
                                aVar2.setType(aVar.f1502e.f1534h0);
                                aVar2.setMargin(aVar.f1502e.f1536i0);
                                aVar2.setAllowsGoneWidget(aVar.f1502e.f1550p0);
                                b bVar = aVar.f1502e;
                                int[] iArr = bVar.f1540k0;
                                if (iArr != null) {
                                    aVar2.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f1542l0;
                                    if (str != null) {
                                        bVar.f1540k0 = h(aVar2, str);
                                        aVar2.setReferencedIds(aVar.f1502e.f1540k0);
                                    }
                                }
                            }
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                            bVar2.a();
                            aVar.d(bVar2);
                            if (z7) {
                                androidx.constraintlayout.widget.b.e(childAt, aVar.f1504g);
                            }
                            childAt.setLayoutParams(bVar2);
                            d dVar = aVar.f1500c;
                            if (dVar.f1579c == 0) {
                                childAt.setVisibility(dVar.f1578b);
                            }
                            childAt.setAlpha(aVar.f1500c.f1580d);
                            childAt.setRotation(aVar.f1503f.f1584b);
                            childAt.setRotationX(aVar.f1503f.f1585c);
                            childAt.setRotationY(aVar.f1503f.f1586d);
                            childAt.setScaleX(aVar.f1503f.f1587e);
                            childAt.setScaleY(aVar.f1503f.f1588f);
                            C0019e c0019e = aVar.f1503f;
                            if (c0019e.f1591i != -1) {
                                if (((View) childAt.getParent()).findViewById(aVar.f1503f.f1591i) != null) {
                                    float top = (r4.getTop() + r4.getBottom()) / 2.0f;
                                    float left = (r4.getLeft() + r4.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(left - childAt.getLeft());
                                        childAt.setPivotY(top - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(c0019e.f1589g)) {
                                    childAt.setPivotX(aVar.f1503f.f1589g);
                                }
                                if (!Float.isNaN(aVar.f1503f.f1590h)) {
                                    childAt.setPivotY(aVar.f1503f.f1590h);
                                }
                            }
                            childAt.setTranslationX(aVar.f1503f.f1592j);
                            childAt.setTranslationY(aVar.f1503f.f1593k);
                            childAt.setTranslationZ(aVar.f1503f.f1594l);
                            C0019e c0019e2 = aVar.f1503f;
                            if (c0019e2.f1595m) {
                                childAt.setElevation(c0019e2.f1596n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar3 = this.f1497e.get(num);
            if (aVar3 != null) {
                if (aVar3.f1502e.f1538j0 == 1) {
                    androidx.constraintlayout.widget.a aVar4 = new androidx.constraintlayout.widget.a(constraintLayout.getContext());
                    aVar4.setId(num.intValue());
                    b bVar3 = aVar3.f1502e;
                    int[] iArr2 = bVar3.f1540k0;
                    if (iArr2 != null) {
                        aVar4.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f1542l0;
                        if (str2 != null) {
                            bVar3.f1540k0 = h(aVar4, str2);
                            aVar4.setReferencedIds(aVar3.f1502e.f1540k0);
                        }
                    }
                    aVar4.setType(aVar3.f1502e.f1534h0);
                    aVar4.setMargin(aVar3.f1502e.f1536i0);
                    ConstraintLayout.b bVarGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    aVar4.s();
                    aVar3.d(bVarGenerateDefaultLayoutParams);
                    constraintLayout.addView(aVar4, bVarGenerateDefaultLayoutParams);
                }
                if (aVar3.f1502e.f1519a) {
                    View hVar = new h(constraintLayout.getContext());
                    hVar.setId(num.intValue());
                    ConstraintLayout.b bVarGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar3.d(bVarGenerateDefaultLayoutParams2);
                    constraintLayout.addView(hVar, bVarGenerateDefaultLayoutParams2);
                }
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = constraintLayout.getChildAt(i9);
            if (childAt2 instanceof androidx.constraintlayout.widget.c) {
                ((androidx.constraintlayout.widget.c) childAt2).i(constraintLayout);
            }
        }
    }

    public void e(Context context, int i8) {
        f((ConstraintLayout) LayoutInflater.from(context).inflate(i8, (ViewGroup) null));
    }

    public void f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f1497e.clear();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = constraintLayout.getChildAt(i8);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f1496d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f1497e.containsKey(Integer.valueOf(id))) {
                this.f1497e.put(Integer.valueOf(id), new a());
            }
            a aVar = this.f1497e.get(Integer.valueOf(id));
            if (aVar != null) {
                aVar.f1504g = androidx.constraintlayout.widget.b.a(this.f1495c, childAt);
                aVar.f(id, bVar);
                aVar.f1500c.f1578b = childAt.getVisibility();
                aVar.f1500c.f1580d = childAt.getAlpha();
                aVar.f1503f.f1584b = childAt.getRotation();
                aVar.f1503f.f1585c = childAt.getRotationX();
                aVar.f1503f.f1586d = childAt.getRotationY();
                aVar.f1503f.f1587e = childAt.getScaleX();
                aVar.f1503f.f1588f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    C0019e c0019e = aVar.f1503f;
                    c0019e.f1589g = pivotX;
                    c0019e.f1590h = pivotY;
                }
                aVar.f1503f.f1592j = childAt.getTranslationX();
                aVar.f1503f.f1593k = childAt.getTranslationY();
                aVar.f1503f.f1594l = childAt.getTranslationZ();
                C0019e c0019e2 = aVar.f1503f;
                if (c0019e2.f1595m) {
                    c0019e2.f1596n = childAt.getElevation();
                }
                if (childAt instanceof androidx.constraintlayout.widget.a) {
                    androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                    aVar.f1502e.f1550p0 = aVar2.getAllowsGoneWidget();
                    aVar.f1502e.f1540k0 = aVar2.getReferencedIds();
                    aVar.f1502e.f1534h0 = aVar2.getType();
                    aVar.f1502e.f1536i0 = aVar2.getMargin();
                }
            }
        }
    }

    public void g(f fVar) {
        int childCount = fVar.getChildCount();
        this.f1497e.clear();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = fVar.getChildAt(i8);
            f.a aVar = (f.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f1496d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f1497e.containsKey(Integer.valueOf(id))) {
                this.f1497e.put(Integer.valueOf(id), new a());
            }
            a aVar2 = this.f1497e.get(Integer.valueOf(id));
            if (aVar2 != null) {
                if (childAt instanceof androidx.constraintlayout.widget.c) {
                    aVar2.h((androidx.constraintlayout.widget.c) childAt, id, aVar);
                }
                aVar2.g(id, aVar);
            }
        }
    }

    public void j(Context context, int i8) {
        XmlResourceParser xml = context.getResources().getXml(i8);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarI = i(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarI.f1502e.f1519a = true;
                    }
                    this.f1497e.put(Integer.valueOf(aVarI.f1498a), aVarI);
                }
            }
        } catch (IOException e8) {
            e8.printStackTrace();
        } catch (XmlPullParserException e9) {
            e9.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x01cb, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void k(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.e.k(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
