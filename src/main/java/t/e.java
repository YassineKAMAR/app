package t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import t.d;
import u.n;
import u.p;

/* JADX INFO: loaded from: classes.dex */
public class e {
    public static float K0 = 0.5f;
    int A0;
    boolean B0;
    boolean C0;
    public float[] D0;
    protected e[] E0;
    protected e[] F0;
    e G0;
    e H0;
    public int I0;
    public int J0;
    private boolean K;
    public d V;
    public d[] W;
    protected ArrayList<d> X;
    private boolean[] Y;
    public b[] Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public e f26383a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    int f26385b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u.c f26386c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    int f26387c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u.c f26388d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public float f26389d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    protected int f26391e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    protected int f26393f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    protected int f26395g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    int f26397h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    int f26399i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    protected int f26401j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    protected int f26403k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    int f26405l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    protected int f26407m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    protected int f26409n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f26410o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    float f26411o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    float f26413p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private Object f26415q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f26417r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f26419s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private boolean f26421t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private String f26423u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private String f26425v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    boolean f26427w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    boolean f26429x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    boolean f26431y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    int f26433z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f26382a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p[] f26384b = new p[2];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u.l f26390e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n f26392f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean[] f26394g = {true, true};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f26396h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f26398i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f26400j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f26402k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f26404l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f26406m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public s.a f26408n = new s.a(this);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f26412p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f26414q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f26416r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f26418s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f26420t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f26422u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f26424v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f26426w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f26428x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int[] f26430y = new int[2];

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f26432z = 0;
    public int A = 0;
    public float B = 1.0f;
    public int C = 0;
    public int D = 0;
    public float E = 1.0f;
    int F = -1;
    float G = 1.0f;
    private int[] H = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    private float I = 0.0f;
    private boolean J = false;
    private boolean L = false;
    private int M = 0;
    private int N = 0;
    public d O = new d(this, d.b.LEFT);
    public d P = new d(this, d.b.TOP);
    public d Q = new d(this, d.b.RIGHT);
    public d R = new d(this, d.b.BOTTOM);
    public d S = new d(this, d.b.BASELINE);
    d T = new d(this, d.b.CENTER_X);
    d U = new d(this, d.b.CENTER_Y);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f26435b;

        static {
            int[] iArr = new int[b.values().length];
            f26435b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26435b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26435b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26435b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f26434a = iArr2;
            try {
                iArr2[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26434a[d.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26434a[d.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26434a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26434a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f26434a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f26434a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f26434a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f26434a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        d dVar = new d(this, d.b.CENTER);
        this.V = dVar;
        this.W = new d[]{this.O, this.Q, this.P, this.R, this.S, dVar};
        this.X = new ArrayList<>();
        this.Y = new boolean[2];
        b bVar = b.FIXED;
        this.Z = new b[]{bVar, bVar};
        this.f26383a0 = null;
        this.f26385b0 = 0;
        this.f26387c0 = 0;
        this.f26389d0 = 0.0f;
        this.f26391e0 = -1;
        this.f26393f0 = 0;
        this.f26395g0 = 0;
        this.f26397h0 = 0;
        this.f26399i0 = 0;
        this.f26401j0 = 0;
        this.f26403k0 = 0;
        this.f26405l0 = 0;
        float f8 = K0;
        this.f26411o0 = f8;
        this.f26413p0 = f8;
        this.f26417r0 = 0;
        this.f26419s0 = 0;
        this.f26421t0 = false;
        this.f26423u0 = null;
        this.f26425v0 = null;
        this.f26431y0 = false;
        this.f26433z0 = 0;
        this.A0 = 0;
        this.D0 = new float[]{-1.0f, -1.0f};
        this.E0 = new e[]{null, null};
        this.F0 = new e[]{null, null};
        this.G0 = null;
        this.H0 = null;
        this.I0 = -1;
        this.J0 = -1;
        d();
    }

    private void N(StringBuilder sb, String str, int i8, int i9, int i10, int i11, int i12, int i13, float f8, float f9) {
        sb.append(str);
        sb.append(" :  {\n");
        v0(sb, "      size", i8, 0);
        v0(sb, "      min", i9, 0);
        v0(sb, "      max", i10, Integer.MAX_VALUE);
        v0(sb, "      matchMin", i12, 0);
        v0(sb, "      matchDef", i13, 0);
        u0(sb, "      matchPercent", f8, 1.0f);
        sb.append("    },\n");
    }

    private void O(StringBuilder sb, String str, d dVar) {
        if (dVar.f26367f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(dVar.f26367f);
        sb.append("'");
        if (dVar.f26369h != Integer.MIN_VALUE || dVar.f26368g != 0) {
            sb.append(com.amazon.a.a.o.b.f.f3942a);
            sb.append(dVar.f26368g);
            if (dVar.f26369h != Integer.MIN_VALUE) {
                sb.append(com.amazon.a.a.o.b.f.f3942a);
                sb.append(dVar.f26369h);
                sb.append(com.amazon.a.a.o.b.f.f3942a);
            }
        }
        sb.append(" ] ,\n");
    }

    private void d() {
        this.X.add(this.O);
        this.X.add(this.P);
        this.X.add(this.Q);
        this.X.add(this.R);
        this.X.add(this.T);
        this.X.add(this.U);
        this.X.add(this.V);
        this.X.add(this.S);
    }

    private boolean d0(int i8) {
        d dVar;
        d dVar2;
        int i9 = i8 * 2;
        d[] dVarArr = this.W;
        d dVar3 = dVarArr[i9];
        d dVar4 = dVar3.f26367f;
        return (dVar4 == null || dVar4.f26367f == dVar3 || (dVar2 = (dVar = dVarArr[i9 + 1]).f26367f) == null || dVar2.f26367f != dVar) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0546 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:389:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void i(q.d r37, boolean r38, boolean r39, boolean r40, boolean r41, q.i r42, q.i r43, t.e.b r44, boolean r45, t.d r46, t.d r47, int r48, int r49, int r50, int r51, float r52, boolean r53, boolean r54, boolean r55, boolean r56, boolean r57, int r58, int r59, int r60, int r61, float r62, boolean r63) {
        /*
            Method dump skipped, instruction units count: 1407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.e.i(q.d, boolean, boolean, boolean, boolean, q.i, q.i, t.e$b, boolean, t.d, t.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    private void u0(StringBuilder sb, String str, float f8, float f9) {
        if (f8 == f9) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f8);
        sb.append(",\n");
    }

    private void v0(StringBuilder sb, String str, int i8, int i9) {
        if (i8 == i9) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i8);
        sb.append(",\n");
    }

    private void w0(StringBuilder sb, String str, float f8, int i8) {
        if (f8 == 0.0f) {
            return;
        }
        sb.append(str);
        sb.append(" :  [");
        sb.append(f8);
        sb.append(com.amazon.a.a.o.b.f.f3942a);
        sb.append(i8);
        sb.append("");
        sb.append("],\n");
    }

    public int A() {
        return this.M;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0085 A[PHI: r0
  0x0085: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:38:0x0084, B:35:0x007d, B:23:0x004f, B:25:0x0055, B:27:0x0061, B:29:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0085 -> B:40:0x0086). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L8f
            int r1 = r9.length()
            if (r1 != 0) goto Lb
            goto L8f
        Lb:
            r1 = -1
            int r2 = r9.length()
            r3 = 44
            int r3 = r9.indexOf(r3)
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L37
            int r6 = r2 + (-1)
            if (r3 >= r6) goto L37
            java.lang.String r6 = r9.substring(r4, r3)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L2c
            r1 = 0
            goto L35
        L2c:
            java.lang.String r4 = "H"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L35
            r1 = 1
        L35:
            int r4 = r3 + 1
        L37:
            r3 = 58
            int r3 = r9.indexOf(r3)
            if (r3 < 0) goto L75
            int r2 = r2 - r5
            if (r3 >= r2) goto L75
            java.lang.String r2 = r9.substring(r4, r3)
            int r3 = r3 + r5
            java.lang.String r9 = r9.substring(r3)
            int r3 = r2.length()
            if (r3 <= 0) goto L85
            int r3 = r9.length()
            if (r3 <= 0) goto L85
            float r2 = java.lang.Float.parseFloat(r2)     // Catch: java.lang.NumberFormatException -> L84
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L84
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L85
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L85
            if (r1 != r5) goto L6f
            float r9 = r9 / r2
            float r9 = java.lang.Math.abs(r9)     // Catch: java.lang.NumberFormatException -> L84
            goto L86
        L6f:
            float r2 = r2 / r9
            float r9 = java.lang.Math.abs(r2)     // Catch: java.lang.NumberFormatException -> L84
            goto L86
        L75:
            java.lang.String r9 = r9.substring(r4)
            int r2 = r9.length()
            if (r2 <= 0) goto L85
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L84
            goto L86
        L84:
        L85:
            r9 = 0
        L86:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8e
            r8.f26389d0 = r9
            r8.f26391e0 = r1
        L8e:
            return
        L8f:
            r8.f26389d0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.e.A0(java.lang.String):void");
    }

    public int B() {
        return this.N;
    }

    public void B0(int i8) {
        if (this.J) {
            int i9 = i8 - this.f26405l0;
            int i10 = this.f26387c0 + i9;
            this.f26395g0 = i9;
            this.P.s(i9);
            this.R.s(i10);
            this.S.s(i8);
            this.f26414q = true;
        }
    }

    public int C(int i8) {
        if (i8 == 0) {
            return U();
        }
        if (i8 == 1) {
            return v();
        }
        return 0;
    }

    public void C0(int i8, int i9) {
        if (this.f26412p) {
            return;
        }
        this.O.s(i8);
        this.Q.s(i9);
        this.f26393f0 = i8;
        this.f26385b0 = i9 - i8;
        this.f26412p = true;
    }

    public int D() {
        return this.H[1];
    }

    public void D0(int i8) {
        this.O.s(i8);
        this.f26393f0 = i8;
    }

    public int E() {
        return this.H[0];
    }

    public void E0(int i8) {
        this.P.s(i8);
        this.f26395g0 = i8;
    }

    public int F() {
        return this.f26409n0;
    }

    public void F0(int i8, int i9) {
        if (this.f26414q) {
            return;
        }
        this.P.s(i8);
        this.R.s(i9);
        this.f26395g0 = i8;
        this.f26387c0 = i9 - i8;
        if (this.J) {
            this.S.s(i8 + this.f26405l0);
        }
        this.f26414q = true;
    }

    public int G() {
        return this.f26407m0;
    }

    public void G0(int i8, int i9, int i10, int i11) {
        int i12;
        int i13;
        int i14 = i10 - i8;
        int i15 = i11 - i9;
        this.f26393f0 = i8;
        this.f26395g0 = i9;
        if (this.f26419s0 == 8) {
            this.f26385b0 = 0;
            this.f26387c0 = 0;
            return;
        }
        b[] bVarArr = this.Z;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i14 < (i13 = this.f26385b0)) {
            i14 = i13;
        }
        if (bVarArr[1] == bVar2 && i15 < (i12 = this.f26387c0)) {
            i15 = i12;
        }
        this.f26385b0 = i14;
        this.f26387c0 = i15;
        int i16 = this.f26409n0;
        if (i15 < i16) {
            this.f26387c0 = i16;
        }
        int i17 = this.f26407m0;
        if (i14 < i17) {
            this.f26385b0 = i17;
        }
        int i18 = this.A;
        if (i18 > 0 && bVar == b.MATCH_CONSTRAINT) {
            this.f26385b0 = Math.min(this.f26385b0, i18);
        }
        int i19 = this.D;
        if (i19 > 0 && this.Z[1] == b.MATCH_CONSTRAINT) {
            this.f26387c0 = Math.min(this.f26387c0, i19);
        }
        int i20 = this.f26385b0;
        if (i14 != i20) {
            this.f26404l = i20;
        }
        int i21 = this.f26387c0;
        if (i15 != i21) {
            this.f26406m = i21;
        }
    }

    public e H(int i8) {
        d dVar;
        d dVar2;
        if (i8 != 0) {
            if (i8 == 1 && (dVar2 = (dVar = this.R).f26367f) != null && dVar2.f26367f == dVar) {
                return dVar2.f26365d;
            }
            return null;
        }
        d dVar3 = this.Q;
        d dVar4 = dVar3.f26367f;
        if (dVar4 == null || dVar4.f26367f != dVar3) {
            return null;
        }
        return dVar4.f26365d;
    }

    public void H0(boolean z7) {
        this.J = z7;
    }

    public e I() {
        return this.f26383a0;
    }

    public void I0(int i8) {
        this.f26387c0 = i8;
        int i9 = this.f26409n0;
        if (i8 < i9) {
            this.f26387c0 = i9;
        }
    }

    public e J(int i8) {
        d dVar;
        d dVar2;
        if (i8 != 0) {
            if (i8 == 1 && (dVar2 = (dVar = this.P).f26367f) != null && dVar2.f26367f == dVar) {
                return dVar2.f26365d;
            }
            return null;
        }
        d dVar3 = this.O;
        d dVar4 = dVar3.f26367f;
        if (dVar4 == null || dVar4.f26367f != dVar3) {
            return null;
        }
        return dVar4.f26365d;
    }

    public void J0(float f8) {
        this.f26411o0 = f8;
    }

    public int K() {
        return V() + this.f26385b0;
    }

    public void K0(int i8) {
        this.f26433z0 = i8;
    }

    public p L(int i8) {
        if (i8 == 0) {
            return this.f26390e;
        }
        if (i8 == 1) {
            return this.f26392f;
        }
        return null;
    }

    public void L0(int i8, int i9) {
        this.f26393f0 = i8;
        int i10 = i9 - i8;
        this.f26385b0 = i10;
        int i11 = this.f26407m0;
        if (i10 < i11) {
            this.f26385b0 = i11;
        }
    }

    public void M(StringBuilder sb) {
        sb.append("  " + this.f26410o + ":{\n");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("    actualWidth:");
        sb2.append(this.f26385b0);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.f26387c0);
        sb.append("\n");
        sb.append("    actualLeft:" + this.f26393f0);
        sb.append("\n");
        sb.append("    actualTop:" + this.f26395g0);
        sb.append("\n");
        O(sb, "left", this.O);
        O(sb, "top", this.P);
        O(sb, "right", this.Q);
        O(sb, "bottom", this.R);
        O(sb, "baseline", this.S);
        O(sb, "centerX", this.T);
        O(sb, "centerY", this.U);
        N(sb, "    width", this.f26385b0, this.f26407m0, this.H[0], this.f26404l, this.f26432z, this.f26426w, this.B, this.D0[0]);
        N(sb, "    height", this.f26387c0, this.f26409n0, this.H[1], this.f26406m, this.C, this.f26428x, this.E, this.D0[1]);
        w0(sb, "    dimensionRatio", this.f26389d0, this.f26391e0);
        u0(sb, "    horizontalBias", this.f26411o0, K0);
        u0(sb, "    verticalBias", this.f26413p0, K0);
        v0(sb, "    horizontalChainStyle", this.f26433z0, 0);
        v0(sb, "    verticalChainStyle", this.A0, 0);
        sb.append("  }");
    }

    public void M0(b bVar) {
        this.Z[0] = bVar;
    }

    public void N0(int i8, int i9, int i10, float f8) {
        this.f26426w = i8;
        this.f26432z = i9;
        if (i10 == Integer.MAX_VALUE) {
            i10 = 0;
        }
        this.A = i10;
        this.B = f8;
        if (f8 <= 0.0f || f8 >= 1.0f || i8 != 0) {
            return;
        }
        this.f26426w = 2;
    }

    public void O0(float f8) {
        this.D0[0] = f8;
    }

    public float P() {
        return this.f26413p0;
    }

    protected void P0(int i8, boolean z7) {
        this.Y[i8] = z7;
    }

    public int Q() {
        return this.A0;
    }

    public void Q0(boolean z7) {
        this.K = z7;
    }

    public b R() {
        return this.Z[1];
    }

    public void R0(boolean z7) {
        this.L = z7;
    }

    public int S() {
        int i8 = this.O != null ? 0 + this.P.f26368g : 0;
        return this.Q != null ? i8 + this.R.f26368g : i8;
    }

    public void S0(int i8, int i9) {
        this.M = i8;
        this.N = i9;
        V0(false);
    }

    public int T() {
        return this.f26419s0;
    }

    public void T0(int i8) {
        this.H[1] = i8;
    }

    public int U() {
        if (this.f26419s0 == 8) {
            return 0;
        }
        return this.f26385b0;
    }

    public void U0(int i8) {
        this.H[0] = i8;
    }

    public int V() {
        e eVar = this.f26383a0;
        return (eVar == null || !(eVar instanceof f)) ? this.f26393f0 : ((f) eVar).S0 + this.f26393f0;
    }

    public void V0(boolean z7) {
        this.f26398i = z7;
    }

    public int W() {
        e eVar = this.f26383a0;
        return (eVar == null || !(eVar instanceof f)) ? this.f26395g0 : ((f) eVar).T0 + this.f26395g0;
    }

    public void W0(int i8) {
        if (i8 < 0) {
            i8 = 0;
        }
        this.f26409n0 = i8;
    }

    public boolean X() {
        return this.J;
    }

    public void X0(int i8) {
        if (i8 < 0) {
            i8 = 0;
        }
        this.f26407m0 = i8;
    }

    public boolean Y(int i8) {
        if (i8 == 0) {
            return (this.O.f26367f != null ? 1 : 0) + (this.Q.f26367f != null ? 1 : 0) < 2;
        }
        return ((this.P.f26367f != null ? 1 : 0) + (this.R.f26367f != null ? 1 : 0)) + (this.S.f26367f != null ? 1 : 0) < 2;
    }

    public void Y0(int i8, int i9) {
        this.f26393f0 = i8;
        this.f26395g0 = i9;
    }

    public boolean Z() {
        int size = this.X.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.X.get(i8).l()) {
                return true;
            }
        }
        return false;
    }

    public void Z0(e eVar) {
        this.f26383a0 = eVar;
    }

    public boolean a0() {
        return (this.f26404l == -1 && this.f26406m == -1) ? false : true;
    }

    public void a1(float f8) {
        this.f26413p0 = f8;
    }

    public boolean b0(int i8, int i9) {
        d dVar;
        d dVar2;
        if (i8 == 0) {
            d dVar3 = this.O.f26367f;
            return dVar3 != null && dVar3.m() && (dVar2 = this.Q.f26367f) != null && dVar2.m() && (this.Q.f26367f.d() - this.Q.e()) - (this.O.f26367f.d() + this.O.e()) >= i9;
        }
        d dVar4 = this.P.f26367f;
        return dVar4 != null && dVar4.m() && (dVar = this.R.f26367f) != null && dVar.m() && (this.R.f26367f.d() - this.R.e()) - (this.P.f26367f.d() + this.P.e()) >= i9;
        return false;
    }

    public void b1(int i8) {
        this.A0 = i8;
    }

    public void c0(d.b bVar, e eVar, d.b bVar2, int i8, int i9) {
        m(bVar).a(eVar.m(bVar2), i8, i9, true);
    }

    public void c1(int i8, int i9) {
        this.f26395g0 = i8;
        int i10 = i9 - i8;
        this.f26387c0 = i10;
        int i11 = this.f26409n0;
        if (i10 < i11) {
            this.f26387c0 = i11;
        }
    }

    public void d1(b bVar) {
        this.Z[1] = bVar;
    }

    public void e(f fVar, q.d dVar, HashSet<e> hashSet, int i8, boolean z7) {
        if (z7) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.a(fVar, dVar, this);
            hashSet.remove(this);
            g(dVar, fVar.P1(64));
        }
        if (i8 == 0) {
            HashSet<d> hashSetC = this.O.c();
            if (hashSetC != null) {
                Iterator<d> it = hashSetC.iterator();
                while (it.hasNext()) {
                    it.next().f26365d.e(fVar, dVar, hashSet, i8, true);
                }
            }
            HashSet<d> hashSetC2 = this.Q.c();
            if (hashSetC2 != null) {
                Iterator<d> it2 = hashSetC2.iterator();
                while (it2.hasNext()) {
                    it2.next().f26365d.e(fVar, dVar, hashSet, i8, true);
                }
                return;
            }
            return;
        }
        HashSet<d> hashSetC3 = this.P.c();
        if (hashSetC3 != null) {
            Iterator<d> it3 = hashSetC3.iterator();
            while (it3.hasNext()) {
                it3.next().f26365d.e(fVar, dVar, hashSet, i8, true);
            }
        }
        HashSet<d> hashSetC4 = this.R.c();
        if (hashSetC4 != null) {
            Iterator<d> it4 = hashSetC4.iterator();
            while (it4.hasNext()) {
                it4.next().f26365d.e(fVar, dVar, hashSet, i8, true);
            }
        }
        HashSet<d> hashSetC5 = this.S.c();
        if (hashSetC5 != null) {
            Iterator<d> it5 = hashSetC5.iterator();
            while (it5.hasNext()) {
                it5.next().f26365d.e(fVar, dVar, hashSet, i8, true);
            }
        }
    }

    public boolean e0() {
        return this.f26416r;
    }

    public void e1(int i8, int i9, int i10, float f8) {
        this.f26428x = i8;
        this.C = i9;
        if (i10 == Integer.MAX_VALUE) {
            i10 = 0;
        }
        this.D = i10;
        this.E = f8;
        if (f8 <= 0.0f || f8 >= 1.0f || i8 != 0) {
            return;
        }
        this.f26428x = 2;
    }

    boolean f() {
        return (this instanceof k) || (this instanceof g);
    }

    public boolean f0(int i8) {
        return this.Y[i8];
    }

    public void f1(float f8) {
        this.D0[1] = f8;
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x05b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(q.d r54, boolean r55) {
        /*
            Method dump skipped, instruction units count: 1498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.e.g(q.d, boolean):void");
    }

    public boolean g0() {
        d dVar = this.O;
        d dVar2 = dVar.f26367f;
        if (dVar2 != null && dVar2.f26367f == dVar) {
            return true;
        }
        d dVar3 = this.Q;
        d dVar4 = dVar3.f26367f;
        return dVar4 != null && dVar4.f26367f == dVar3;
    }

    public void g1(int i8) {
        this.f26419s0 = i8;
    }

    public boolean h() {
        return this.f26419s0 != 8;
    }

    public boolean h0() {
        return this.K;
    }

    public void h1(int i8) {
        this.f26385b0 = i8;
        int i9 = this.f26407m0;
        if (i8 < i9) {
            this.f26385b0 = i9;
        }
    }

    public boolean i0() {
        d dVar = this.P;
        d dVar2 = dVar.f26367f;
        if (dVar2 != null && dVar2.f26367f == dVar) {
            return true;
        }
        d dVar3 = this.R;
        d dVar4 = dVar3.f26367f;
        return dVar4 != null && dVar4.f26367f == dVar3;
    }

    public void i1(int i8) {
        if (i8 < 0 || i8 > 3) {
            return;
        }
        this.f26424v = i8;
    }

    public void j(e eVar, float f8, int i8) {
        d.b bVar = d.b.CENTER;
        c0(bVar, eVar, bVar, i8, 0);
        this.I = f8;
    }

    public boolean j0() {
        return this.L;
    }

    public void j1(int i8) {
        this.f26393f0 = i8;
    }

    public void k(q.d dVar) {
        dVar.q(this.O);
        dVar.q(this.P);
        dVar.q(this.Q);
        dVar.q(this.R);
        if (this.f26405l0 > 0) {
            dVar.q(this.S);
        }
    }

    public boolean k0() {
        return this.f26398i && this.f26419s0 != 8;
    }

    public void k1(int i8) {
        this.f26395g0 = i8;
    }

    public void l() {
        if (this.f26390e == null) {
            this.f26390e = new u.l(this);
        }
        if (this.f26392f == null) {
            this.f26392f = new n(this);
        }
    }

    public boolean l0() {
        return this.f26412p || (this.O.m() && this.Q.m());
    }

    public void l1(boolean z7, boolean z8, boolean z9, boolean z10) {
        if (this.F == -1) {
            if (z9 && !z10) {
                this.F = 0;
            } else if (!z9 && z10) {
                this.F = 1;
                if (this.f26391e0 == -1) {
                    this.G = 1.0f / this.G;
                }
            }
        }
        if (this.F == 0 && (!this.P.n() || !this.R.n())) {
            this.F = 1;
        } else if (this.F == 1 && (!this.O.n() || !this.Q.n())) {
            this.F = 0;
        }
        if (this.F == -1 && (!this.P.n() || !this.R.n() || !this.O.n() || !this.Q.n())) {
            if (this.P.n() && this.R.n()) {
                this.F = 0;
            } else if (this.O.n() && this.Q.n()) {
                this.G = 1.0f / this.G;
                this.F = 1;
            }
        }
        if (this.F == -1) {
            int i8 = this.f26432z;
            if (i8 > 0 && this.C == 0) {
                this.F = 0;
            } else {
                if (i8 != 0 || this.C <= 0) {
                    return;
                }
                this.G = 1.0f / this.G;
                this.F = 1;
            }
        }
    }

    public d m(d.b bVar) {
        switch (a.f26434a[bVar.ordinal()]) {
            case 1:
                return this.O;
            case 2:
                return this.P;
            case 3:
                return this.Q;
            case 4:
                return this.R;
            case 5:
                return this.S;
            case 6:
                return this.V;
            case 7:
                return this.T;
            case 8:
                return this.U;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public boolean m0() {
        return this.f26414q || (this.P.m() && this.R.m());
    }

    public void m1(boolean z7, boolean z8) {
        int i8;
        int i9;
        boolean zK = z7 & this.f26390e.k();
        boolean zK2 = z8 & this.f26392f.k();
        u.l lVar = this.f26390e;
        int i10 = lVar.f26627h.f26573g;
        n nVar = this.f26392f;
        int i11 = nVar.f26627h.f26573g;
        int i12 = lVar.f26628i.f26573g;
        int i13 = nVar.f26628i.f26573g;
        int i14 = i13 - i11;
        if (i12 - i10 < 0 || i14 < 0 || i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE || i11 == Integer.MIN_VALUE || i11 == Integer.MAX_VALUE || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE) {
            i12 = 0;
            i10 = 0;
            i13 = 0;
            i11 = 0;
        }
        int i15 = i12 - i10;
        int i16 = i13 - i11;
        if (zK) {
            this.f26393f0 = i10;
        }
        if (zK2) {
            this.f26395g0 = i11;
        }
        if (this.f26419s0 == 8) {
            this.f26385b0 = 0;
            this.f26387c0 = 0;
            return;
        }
        if (zK) {
            if (this.Z[0] == b.FIXED && i15 < (i9 = this.f26385b0)) {
                i15 = i9;
            }
            this.f26385b0 = i15;
            int i17 = this.f26407m0;
            if (i15 < i17) {
                this.f26385b0 = i17;
            }
        }
        if (zK2) {
            if (this.Z[1] == b.FIXED && i16 < (i8 = this.f26387c0)) {
                i16 = i8;
            }
            this.f26387c0 = i16;
            int i18 = this.f26409n0;
            if (i16 < i18) {
                this.f26387c0 = i18;
            }
        }
    }

    public int n() {
        return this.f26405l0;
    }

    public boolean n0() {
        return this.f26418s;
    }

    public void n1(q.d dVar, boolean z7) {
        n nVar;
        u.l lVar;
        int iX = dVar.x(this.O);
        int iX2 = dVar.x(this.P);
        int iX3 = dVar.x(this.Q);
        int iX4 = dVar.x(this.R);
        if (z7 && (lVar = this.f26390e) != null) {
            u.f fVar = lVar.f26627h;
            if (fVar.f26576j) {
                u.f fVar2 = lVar.f26628i;
                if (fVar2.f26576j) {
                    iX = fVar.f26573g;
                    iX3 = fVar2.f26573g;
                }
            }
        }
        if (z7 && (nVar = this.f26392f) != null) {
            u.f fVar3 = nVar.f26627h;
            if (fVar3.f26576j) {
                u.f fVar4 = nVar.f26628i;
                if (fVar4.f26576j) {
                    iX2 = fVar3.f26573g;
                    iX4 = fVar4.f26573g;
                }
            }
        }
        int i8 = iX4 - iX2;
        if (iX3 - iX < 0 || i8 < 0 || iX == Integer.MIN_VALUE || iX == Integer.MAX_VALUE || iX2 == Integer.MIN_VALUE || iX2 == Integer.MAX_VALUE || iX3 == Integer.MIN_VALUE || iX3 == Integer.MAX_VALUE || iX4 == Integer.MIN_VALUE || iX4 == Integer.MAX_VALUE) {
            iX4 = 0;
            iX = 0;
            iX2 = 0;
            iX3 = 0;
        }
        G0(iX, iX2, iX3, iX4);
    }

    public float o(int i8) {
        if (i8 == 0) {
            return this.f26411o0;
        }
        if (i8 == 1) {
            return this.f26413p0;
        }
        return -1.0f;
    }

    public void o0() {
        this.f26416r = true;
    }

    public int p() {
        return W() + this.f26387c0;
    }

    public void p0() {
        this.f26418s = true;
    }

    public Object q() {
        return this.f26415q0;
    }

    public boolean q0() {
        b[] bVarArr = this.Z;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public String r() {
        return this.f26423u0;
    }

    public void r0() {
        this.O.p();
        this.P.p();
        this.Q.p();
        this.R.p();
        this.S.p();
        this.T.p();
        this.U.p();
        this.V.p();
        this.f26383a0 = null;
        this.I = 0.0f;
        this.f26385b0 = 0;
        this.f26387c0 = 0;
        this.f26389d0 = 0.0f;
        this.f26391e0 = -1;
        this.f26393f0 = 0;
        this.f26395g0 = 0;
        this.f26401j0 = 0;
        this.f26403k0 = 0;
        this.f26405l0 = 0;
        this.f26407m0 = 0;
        this.f26409n0 = 0;
        float f8 = K0;
        this.f26411o0 = f8;
        this.f26413p0 = f8;
        b[] bVarArr = this.Z;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f26415q0 = null;
        this.f26417r0 = 0;
        this.f26419s0 = 0;
        this.f26425v0 = null;
        this.f26427w0 = false;
        this.f26429x0 = false;
        this.f26433z0 = 0;
        this.A0 = 0;
        this.B0 = false;
        this.C0 = false;
        float[] fArr = this.D0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f26420t = -1;
        this.f26422u = -1;
        int[] iArr = this.H;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f26426w = 0;
        this.f26428x = 0;
        this.B = 1.0f;
        this.E = 1.0f;
        this.A = Integer.MAX_VALUE;
        this.D = Integer.MAX_VALUE;
        this.f26432z = 0;
        this.C = 0;
        this.f26396h = false;
        this.F = -1;
        this.G = 1.0f;
        this.f26431y0 = false;
        boolean[] zArr = this.f26394g;
        zArr[0] = true;
        zArr[1] = true;
        this.L = false;
        boolean[] zArr2 = this.Y;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f26398i = true;
        int[] iArr2 = this.f26430y;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f26404l = -1;
        this.f26406m = -1;
    }

    public b s(int i8) {
        if (i8 == 0) {
            return y();
        }
        if (i8 == 1) {
            return R();
        }
        return null;
    }

    public void s0() {
        this.f26412p = false;
        this.f26414q = false;
        this.f26416r = false;
        this.f26418s = false;
        int size = this.X.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.X.get(i8).q();
        }
    }

    public float t() {
        return this.f26389d0;
    }

    public void t0(q.c cVar) {
        this.O.r(cVar);
        this.P.r(cVar);
        this.Q.r(cVar);
        this.R.r(cVar);
        this.S.r(cVar);
        this.V.r(cVar);
        this.T.r(cVar);
        this.U.r(cVar);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f26425v0 != null) {
            str = "type: " + this.f26425v0 + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f26423u0 != null) {
            str2 = "id: " + this.f26423u0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f26393f0);
        sb.append(", ");
        sb.append(this.f26395g0);
        sb.append(") - (");
        sb.append(this.f26385b0);
        sb.append(" x ");
        sb.append(this.f26387c0);
        sb.append(")");
        return sb.toString();
    }

    public int u() {
        return this.f26391e0;
    }

    public int v() {
        if (this.f26419s0 == 8) {
            return 0;
        }
        return this.f26387c0;
    }

    public float w() {
        return this.f26411o0;
    }

    public int x() {
        return this.f26433z0;
    }

    public void x0(int i8) {
        this.f26405l0 = i8;
        this.J = i8 > 0;
    }

    public b y() {
        return this.Z[0];
    }

    public void y0(Object obj) {
        this.f26415q0 = obj;
    }

    public int z() {
        d dVar = this.O;
        int i8 = dVar != null ? 0 + dVar.f26368g : 0;
        d dVar2 = this.Q;
        return dVar2 != null ? i8 + dVar2.f26368g : i8;
    }

    public void z0(String str) {
        this.f26423u0 = str;
    }
}
