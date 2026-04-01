package com.google.android.gms.internal.play_billing;

import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class u2<T> implements b3<T> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int[] f19676o = new int[0];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Unsafe f19677p = d4.l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f19678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f19679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f19680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f19681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r2 f19682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f19683f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f19684g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f19685h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f19686i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final e2 f19687j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final t3 f19688k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b1 f19689l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final w2 f19690m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final l2 f19691n;

    private u2(int[] iArr, Object[] objArr, int i8, int i9, r2 r2Var, int i10, boolean z7, int[] iArr2, int i11, int i12, w2 w2Var, e2 e2Var, t3 t3Var, b1 b1Var, l2 l2Var) {
        this.f19678a = iArr;
        this.f19679b = objArr;
        this.f19680c = i8;
        this.f19681d = i9;
        boolean z8 = false;
        if (b1Var != null && b1Var.c(r2Var)) {
            z8 = true;
        }
        this.f19683f = z8;
        this.f19684g = iArr2;
        this.f19685h = i11;
        this.f19686i = i12;
        this.f19690m = w2Var;
        this.f19687j = e2Var;
        this.f19688k = t3Var;
        this.f19689l = b1Var;
        this.f19682e = r2Var;
        this.f19691n = l2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0281  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.android.gms.internal.play_billing.u2 A(java.lang.Class r33, com.google.android.gms.internal.play_billing.n2 r34, com.google.android.gms.internal.play_billing.w2 r35, com.google.android.gms.internal.play_billing.e2 r36, com.google.android.gms.internal.play_billing.t3 r37, com.google.android.gms.internal.play_billing.b1 r38, com.google.android.gms.internal.play_billing.l2 r39) {
        /*
            Method dump skipped, instruction units count: 1029
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.u2.A(java.lang.Class, com.google.android.gms.internal.play_billing.n2, com.google.android.gms.internal.play_billing.w2, com.google.android.gms.internal.play_billing.e2, com.google.android.gms.internal.play_billing.t3, com.google.android.gms.internal.play_billing.b1, com.google.android.gms.internal.play_billing.l2):com.google.android.gms.internal.play_billing.u2");
    }

    private static double B(Object obj, long j8) {
        return ((Double) d4.k(obj, j8)).doubleValue();
    }

    private static float C(Object obj, long j8) {
        return ((Float) d4.k(obj, j8)).floatValue();
    }

    private static int D(Object obj, long j8) {
        return ((Integer) d4.k(obj, j8)).intValue();
    }

    private final int E(int i8) {
        return this.f19678a[i8 + 2];
    }

    private final int F(int i8, int i9) {
        int length = (this.f19678a.length / 3) - 1;
        while (i9 <= length) {
            int i10 = (length + i9) >>> 1;
            int i11 = i10 * 3;
            int i12 = this.f19678a[i11];
            if (i8 == i12) {
                return i11;
            }
            if (i8 < i12) {
                length = i10 - 1;
            } else {
                i9 = i10 + 1;
            }
        }
        return -1;
    }

    private static int G(int i8) {
        return (i8 >>> 20) & 255;
    }

    private final int H(int i8) {
        return this.f19678a[i8 + 1];
    }

    private static long I(Object obj, long j8) {
        return ((Long) d4.k(obj, j8)).longValue();
    }

    private final q1 J(int i8) {
        int i9 = i8 / 3;
        return (q1) this.f19679b[i9 + i9 + 1];
    }

    private final b3 K(int i8) {
        Object[] objArr = this.f19679b;
        int i9 = i8 / 3;
        int i10 = i9 + i9;
        b3 b3Var = (b3) objArr[i10];
        if (b3Var != null) {
            return b3Var;
        }
        b3 b3VarB = z2.a().b((Class) objArr[i10 + 1]);
        this.f19679b[i10] = b3VarB;
        return b3VarB;
    }

    private final Object L(int i8) {
        int i9 = i8 / 3;
        return this.f19679b[i9 + i9];
    }

    private final Object M(Object obj, int i8) {
        b3 b3VarK = K(i8);
        int iH = H(i8) & 1048575;
        if (!r(obj, i8)) {
            return b3VarK.m();
        }
        Object object = f19677p.getObject(obj, iH);
        if (u(object)) {
            return object;
        }
        Object objM = b3VarK.m();
        if (object != null) {
            b3VarK.e(objM, object);
        }
        return objM;
    }

    private final Object N(Object obj, int i8, int i9) {
        b3 b3VarK = K(i9);
        if (!v(obj, i8, i9)) {
            return b3VarK.m();
        }
        Object object = f19677p.getObject(obj, H(i9) & 1048575);
        if (u(object)) {
            return object;
        }
        Object objM = b3VarK.m();
        if (object != null) {
            b3VarK.e(objM, object);
        }
        return objM;
    }

    private static Field O(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void i(Object obj) {
        if (!u(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void j(Object obj, Object obj2, int i8) {
        if (r(obj2, i8)) {
            int iH = H(i8) & 1048575;
            Unsafe unsafe = f19677p;
            long j8 = iH;
            Object object = unsafe.getObject(obj2, j8);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f19678a[i8] + " is present but null: " + obj2.toString());
            }
            b3 b3VarK = K(i8);
            if (!r(obj, i8)) {
                if (u(object)) {
                    Object objM = b3VarK.m();
                    b3VarK.e(objM, object);
                    unsafe.putObject(obj, j8, objM);
                } else {
                    unsafe.putObject(obj, j8, object);
                }
                l(obj, i8);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!u(object2)) {
                Object objM2 = b3VarK.m();
                b3VarK.e(objM2, object2);
                unsafe.putObject(obj, j8, objM2);
                object2 = objM2;
            }
            b3VarK.e(object2, object);
        }
    }

    private final void k(Object obj, Object obj2, int i8) {
        int i9 = this.f19678a[i8];
        if (v(obj2, i9, i8)) {
            int iH = H(i8) & 1048575;
            Unsafe unsafe = f19677p;
            long j8 = iH;
            Object object = unsafe.getObject(obj2, j8);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f19678a[i8] + " is present but null: " + obj2.toString());
            }
            b3 b3VarK = K(i8);
            if (!v(obj, i9, i8)) {
                if (u(object)) {
                    Object objM = b3VarK.m();
                    b3VarK.e(objM, object);
                    unsafe.putObject(obj, j8, objM);
                } else {
                    unsafe.putObject(obj, j8, object);
                }
                n(obj, i9, i8);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!u(object2)) {
                Object objM2 = b3VarK.m();
                b3VarK.e(objM2, object2);
                unsafe.putObject(obj, j8, objM2);
                object2 = objM2;
            }
            b3VarK.e(object2, object);
        }
    }

    private final void l(Object obj, int i8) {
        int iE = E(i8);
        long j8 = 1048575 & iE;
        if (j8 == 1048575) {
            return;
        }
        d4.v(obj, j8, (1 << (iE >>> 20)) | d4.h(obj, j8));
    }

    private final void n(Object obj, int i8, int i9) {
        d4.v(obj, E(i9) & 1048575, i8);
    }

    private final void o(Object obj, int i8, Object obj2) {
        f19677p.putObject(obj, H(i8) & 1048575, obj2);
        l(obj, i8);
    }

    private final void p(Object obj, int i8, int i9, Object obj2) {
        f19677p.putObject(obj, H(i9) & 1048575, obj2);
        n(obj, i8, i9);
    }

    private final boolean q(Object obj, Object obj2, int i8) {
        return r(obj, i8) == r(obj2, i8);
    }

    private final boolean r(Object obj, int i8) {
        int iE = E(i8);
        long j8 = iE & 1048575;
        if (j8 != 1048575) {
            return (d4.h(obj, j8) & (1 << (iE >>> 20))) != 0;
        }
        int iH = H(i8);
        long j9 = iH & 1048575;
        switch (G(iH)) {
            case 0:
                return Double.doubleToRawLongBits(d4.f(obj, j9)) != 0;
            case 1:
                return Float.floatToRawIntBits(d4.g(obj, j9)) != 0;
            case 2:
                return d4.i(obj, j9) != 0;
            case 3:
                return d4.i(obj, j9) != 0;
            case 4:
                return d4.h(obj, j9) != 0;
            case 5:
                return d4.i(obj, j9) != 0;
            case 6:
                return d4.h(obj, j9) != 0;
            case 7:
                return d4.B(obj, j9);
            case 8:
                Object objK = d4.k(obj, j9);
                if (objK instanceof String) {
                    return !((String) objK).isEmpty();
                }
                if (objK instanceof n0) {
                    return !n0.f19633b.equals(objK);
                }
                throw new IllegalArgumentException();
            case 9:
                return d4.k(obj, j9) != null;
            case R.styleable.GradientColor_android_endX /* 10 */:
                return !n0.f19633b.equals(d4.k(obj, j9));
            case R.styleable.GradientColor_android_endY /* 11 */:
                return d4.h(obj, j9) != 0;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                return d4.h(obj, j9) != 0;
            case 13:
                return d4.h(obj, j9) != 0;
            case 14:
                return d4.i(obj, j9) != 0;
            case 15:
                return d4.h(obj, j9) != 0;
            case com.amazon.c.a.a.c.f4052g /* 16 */:
                return d4.i(obj, j9) != 0;
            case 17:
                return d4.k(obj, j9) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean s(Object obj, int i8, int i9, int i10, int i11) {
        return i9 == 1048575 ? r(obj, i8) : (i10 & i11) != 0;
    }

    private static boolean t(Object obj, int i8, b3 b3Var) {
        return b3Var.d(d4.k(obj, i8 & 1048575));
    }

    private static boolean u(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof n1) {
            return ((n1) obj).t();
        }
        return true;
    }

    private final boolean v(Object obj, int i8, int i9) {
        return d4.h(obj, (long) (E(i9) & 1048575)) == i8;
    }

    private static boolean w(Object obj, long j8) {
        return ((Boolean) d4.k(obj, j8)).booleanValue();
    }

    private static final void x(int i8, Object obj, l4 l4Var) {
        if (obj instanceof String) {
            l4Var.p(i8, (String) obj);
        } else {
            l4Var.n(i8, (n0) obj);
        }
    }

    static u3 z(Object obj) {
        n1 n1Var = (n1) obj;
        u3 u3Var = n1Var.zzc;
        if (u3Var != u3.c()) {
            return u3Var;
        }
        u3 u3VarF = u3.f();
        n1Var.zzc = u3VarF;
        return u3VarF;
    }

    /* JADX WARN: Code restructure failed: missing block: B:243:0x0507, code lost:
    
        if ((r1 instanceof com.google.android.gms.internal.play_billing.n0) != false) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x050a, code lost:
    
        r1 = com.google.android.gms.internal.play_billing.v0.x((java.lang.String) r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d1, code lost:
    
        if ((r1 instanceof com.google.android.gms.internal.play_billing.n0) != false) goto L235;
     */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03d3  */
    @Override // com.google.android.gms.internal.play_billing.b3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 1642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.u2.a(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2 A[PHI: r1 r2
  0x00e2: PHI (r1v12 int) = (r1v10 int), (r1v15 int) binds: [B:67:0x00e0, B:63:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x00e2: PHI (r2v15 java.lang.Object) = (r2v12 java.lang.Object), (r2v16 java.lang.Object) binds: [B:67:0x00e0, B:63:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.play_billing.b3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.u2.b(java.lang.Object):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.google.android.gms.internal.play_billing.b3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.u2.c(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    @Override // com.google.android.gms.internal.play_billing.b3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.u2.d(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    @Override // com.google.android.gms.internal.play_billing.b3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.u2.e(java.lang.Object, java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.play_billing.b3
    public final boolean f(Object obj, Object obj2) {
        for (int i8 = 0; i8 < this.f19678a.length; i8 += 3) {
            int iH = H(i8);
            long j8 = iH & 1048575;
            switch (G(iH)) {
                case 0:
                    if (!q(obj, obj2, i8) || Double.doubleToLongBits(d4.f(obj, j8)) != Double.doubleToLongBits(d4.f(obj2, j8))) {
                        return false;
                    }
                    break;
                    break;
                case 1:
                    if (!q(obj, obj2, i8) || Float.floatToIntBits(d4.g(obj, j8)) != Float.floatToIntBits(d4.g(obj2, j8))) {
                        return false;
                    }
                    break;
                    break;
                case 2:
                    if (!q(obj, obj2, i8) || d4.i(obj, j8) != d4.i(obj2, j8)) {
                        return false;
                    }
                    break;
                    break;
                case 3:
                    if (!q(obj, obj2, i8) || d4.i(obj, j8) != d4.i(obj2, j8)) {
                        return false;
                    }
                    break;
                    break;
                case 4:
                    if (!q(obj, obj2, i8) || d4.h(obj, j8) != d4.h(obj2, j8)) {
                        return false;
                    }
                    break;
                    break;
                case 5:
                    if (!q(obj, obj2, i8) || d4.i(obj, j8) != d4.i(obj2, j8)) {
                        return false;
                    }
                    break;
                    break;
                case 6:
                    if (!q(obj, obj2, i8) || d4.h(obj, j8) != d4.h(obj2, j8)) {
                        return false;
                    }
                    break;
                    break;
                case 7:
                    if (!q(obj, obj2, i8) || d4.B(obj, j8) != d4.B(obj2, j8)) {
                        return false;
                    }
                    break;
                    break;
                case 8:
                    if (!q(obj, obj2, i8) || !d3.f(d4.k(obj, j8), d4.k(obj2, j8))) {
                        return false;
                    }
                    break;
                    break;
                case 9:
                    if (!q(obj, obj2, i8) || !d3.f(d4.k(obj, j8), d4.k(obj2, j8))) {
                        return false;
                    }
                    break;
                    break;
                case R.styleable.GradientColor_android_endX /* 10 */:
                    if (!q(obj, obj2, i8) || !d3.f(d4.k(obj, j8), d4.k(obj2, j8))) {
                        return false;
                    }
                    break;
                    break;
                case R.styleable.GradientColor_android_endY /* 11 */:
                    if (!q(obj, obj2, i8) || d4.h(obj, j8) != d4.h(obj2, j8)) {
                        return false;
                    }
                    break;
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    if (!q(obj, obj2, i8) || d4.h(obj, j8) != d4.h(obj2, j8)) {
                        return false;
                    }
                    break;
                    break;
                case 13:
                    if (!q(obj, obj2, i8) || d4.h(obj, j8) != d4.h(obj2, j8)) {
                        return false;
                    }
                    break;
                    break;
                case 14:
                    if (!q(obj, obj2, i8) || d4.i(obj, j8) != d4.i(obj2, j8)) {
                        return false;
                    }
                    break;
                    break;
                case 15:
                    if (!q(obj, obj2, i8) || d4.h(obj, j8) != d4.h(obj2, j8)) {
                        return false;
                    }
                    break;
                    break;
                case com.amazon.c.a.a.c.f4052g /* 16 */:
                    if (!q(obj, obj2, i8) || d4.i(obj, j8) != d4.i(obj2, j8)) {
                        return false;
                    }
                    break;
                    break;
                case 17:
                    if (!q(obj, obj2, i8) || !d3.f(d4.k(obj, j8), d4.k(obj2, j8))) {
                        return false;
                    }
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case com.amazon.c.a.a.c.f4053h /* 32 */:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    if (!d3.f(d4.k(obj, j8), d4.k(obj2, j8))) {
                        return false;
                    }
                    break;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jE = E(i8) & 1048575;
                    if (d4.h(obj, jE) != d4.h(obj2, jE) || !d3.f(d4.k(obj, j8), d4.k(obj2, j8))) {
                        return false;
                    }
                    break;
                    break;
            }
        }
        if (!this.f19688k.d(obj).equals(this.f19688k.d(obj2))) {
            return false;
        }
        if (!this.f19683f) {
            return true;
        }
        this.f19689l.a(obj);
        this.f19689l.a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.b3
    public final void g(Object obj, l4 l4Var) {
        int i8;
        int i9;
        int i10;
        double dF;
        float fG;
        long jI;
        long jI2;
        int iD;
        long jI3;
        int iD2;
        boolean zB;
        Object object;
        Object object2;
        Object object3;
        int iD3;
        int iD4;
        int iD5;
        long jI4;
        int iD6;
        long jI5;
        Object object4;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        List list;
        if (this.f19683f) {
            this.f19689l.a(obj);
            throw null;
        }
        int[] iArr = this.f19678a;
        Unsafe unsafe = f19677p;
        int i19 = 1048575;
        int i20 = 1048575;
        int i21 = 0;
        int i22 = 0;
        while (i22 < iArr.length) {
            int iH = H(i22);
            int[] iArr2 = this.f19678a;
            int iG = G(iH);
            int i23 = iArr2[i22];
            boolean z7 = true;
            if (iG <= 17) {
                int i24 = iArr2[i22 + 2];
                int i25 = i24 & i19;
                if (i25 != i20) {
                    i21 = i25 == i19 ? 0 : unsafe.getInt(obj, i25);
                    i20 = i25;
                }
                i8 = i20;
                i9 = i21;
                i10 = 1 << (i24 >>> 20);
            } else {
                i8 = i20;
                i9 = i21;
                i10 = 0;
            }
            long j8 = iH & i19;
            switch (iG) {
                case 0:
                    if (s(obj, i22, i8, i9, i10)) {
                        dF = d4.f(obj, j8);
                        l4Var.z(i23, dF);
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case 1:
                    if (s(obj, i22, i8, i9, i10)) {
                        fG = d4.g(obj, j8);
                        l4Var.A(i23, fG);
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case 2:
                    if (s(obj, i22, i8, i9, i10)) {
                        jI = unsafe.getLong(obj, j8);
                        l4Var.q(i23, jI);
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case 3:
                    if (s(obj, i22, i8, i9, i10)) {
                        jI2 = unsafe.getLong(obj, j8);
                        l4Var.F(i23, jI2);
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case 4:
                    if (s(obj, i22, i8, i9, i10)) {
                        iD = unsafe.getInt(obj, j8);
                        l4Var.w(i23, iD);
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case 5:
                    if (s(obj, i22, i8, i9, i10)) {
                        jI3 = unsafe.getLong(obj, j8);
                        l4Var.d(i23, jI3);
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case 6:
                    if (s(obj, i22, i8, i9, i10)) {
                        iD2 = unsafe.getInt(obj, j8);
                        l4Var.l(i23, iD2);
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case 7:
                    if (s(obj, i22, i8, i9, i10)) {
                        zB = d4.B(obj, j8);
                        l4Var.m(i23, zB);
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case 8:
                    if (s(obj, i22, i8, i9, i10)) {
                        object = unsafe.getObject(obj, j8);
                        x(i23, object, l4Var);
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case 9:
                    if (s(obj, i22, i8, i9, i10)) {
                        object2 = unsafe.getObject(obj, j8);
                        l4Var.y(i23, object2, K(i22));
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case R.styleable.GradientColor_android_endX /* 10 */:
                    if (s(obj, i22, i8, i9, i10)) {
                        object3 = unsafe.getObject(obj, j8);
                        l4Var.n(i23, (n0) object3);
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case R.styleable.GradientColor_android_endY /* 11 */:
                    if (s(obj, i22, i8, i9, i10)) {
                        iD3 = unsafe.getInt(obj, j8);
                        l4Var.c(i23, iD3);
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    if (s(obj, i22, i8, i9, i10)) {
                        iD4 = unsafe.getInt(obj, j8);
                        l4Var.v(i23, iD4);
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case 13:
                    if (s(obj, i22, i8, i9, i10)) {
                        iD5 = unsafe.getInt(obj, j8);
                        l4Var.f(i23, iD5);
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case 14:
                    if (s(obj, i22, i8, i9, i10)) {
                        jI4 = unsafe.getLong(obj, j8);
                        l4Var.s(i23, jI4);
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case 15:
                    if (s(obj, i22, i8, i9, i10)) {
                        iD6 = unsafe.getInt(obj, j8);
                        l4Var.o(i23, iD6);
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case com.amazon.c.a.a.c.f4052g /* 16 */:
                    if (s(obj, i22, i8, i9, i10)) {
                        jI5 = unsafe.getLong(obj, j8);
                        l4Var.I(i23, jI5);
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case 17:
                    if (s(obj, i22, i8, i9, i10)) {
                        object4 = unsafe.getObject(obj, j8);
                        l4Var.r(i23, object4, K(i22));
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case 18:
                    z7 = false;
                    i11 = this.f19678a[i22];
                    d3.y(i11, (List) unsafe.getObject(obj, j8), l4Var, z7);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 19:
                    z7 = false;
                    i12 = this.f19678a[i22];
                    d3.C(i12, (List) unsafe.getObject(obj, j8), l4Var, z7);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 20:
                    z7 = false;
                    i13 = this.f19678a[i22];
                    d3.E(i13, (List) unsafe.getObject(obj, j8), l4Var, z7);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 21:
                    z7 = false;
                    i14 = this.f19678a[i22];
                    d3.e(i14, (List) unsafe.getObject(obj, j8), l4Var, z7);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 22:
                    z7 = false;
                    i15 = this.f19678a[i22];
                    d3.D(i15, (List) unsafe.getObject(obj, j8), l4Var, z7);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 23:
                    z7 = false;
                    i16 = this.f19678a[i22];
                    d3.B(i16, (List) unsafe.getObject(obj, j8), l4Var, z7);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 24:
                    z7 = false;
                    i17 = this.f19678a[i22];
                    d3.A(i17, (List) unsafe.getObject(obj, j8), l4Var, z7);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 25:
                    i18 = this.f19678a[i22];
                    list = (List) unsafe.getObject(obj, j8);
                    z7 = false;
                    d3.x(i18, list, l4Var, z7);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 26:
                    int i26 = this.f19678a[i22];
                    List list2 = (List) unsafe.getObject(obj, j8);
                    int i27 = d3.f19488d;
                    if (list2 != null && !list2.isEmpty()) {
                        l4Var.x(i26, list2);
                    }
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 27:
                    int i28 = this.f19678a[i22];
                    List list3 = (List) unsafe.getObject(obj, j8);
                    b3 b3VarK = K(i22);
                    int i29 = d3.f19488d;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i30 = 0; i30 < list3.size(); i30++) {
                            ((w0) l4Var).y(i28, list3.get(i30), b3VarK);
                        }
                    }
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 28:
                    int i31 = this.f19678a[i22];
                    List list4 = (List) unsafe.getObject(obj, j8);
                    int i32 = d3.f19488d;
                    if (list4 != null && !list4.isEmpty()) {
                        l4Var.k(i31, list4);
                    }
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 29:
                    d3.d(this.f19678a[i22], (List) unsafe.getObject(obj, j8), l4Var, false);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 30:
                    d3.z(this.f19678a[i22], (List) unsafe.getObject(obj, j8), l4Var, false);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 31:
                    d3.F(this.f19678a[i22], (List) unsafe.getObject(obj, j8), l4Var, false);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case com.amazon.c.a.a.c.f4053h /* 32 */:
                    d3.a(this.f19678a[i22], (List) unsafe.getObject(obj, j8), l4Var, false);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 33:
                    d3.b(this.f19678a[i22], (List) unsafe.getObject(obj, j8), l4Var, false);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 34:
                    d3.c(this.f19678a[i22], (List) unsafe.getObject(obj, j8), l4Var, false);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 35:
                    i11 = this.f19678a[i22];
                    d3.y(i11, (List) unsafe.getObject(obj, j8), l4Var, z7);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 36:
                    i12 = this.f19678a[i22];
                    d3.C(i12, (List) unsafe.getObject(obj, j8), l4Var, z7);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 37:
                    i13 = this.f19678a[i22];
                    d3.E(i13, (List) unsafe.getObject(obj, j8), l4Var, z7);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 38:
                    i14 = this.f19678a[i22];
                    d3.e(i14, (List) unsafe.getObject(obj, j8), l4Var, z7);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 39:
                    i15 = this.f19678a[i22];
                    d3.D(i15, (List) unsafe.getObject(obj, j8), l4Var, z7);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 40:
                    i16 = this.f19678a[i22];
                    d3.B(i16, (List) unsafe.getObject(obj, j8), l4Var, z7);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 41:
                    i17 = this.f19678a[i22];
                    d3.A(i17, (List) unsafe.getObject(obj, j8), l4Var, z7);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 42:
                    i18 = this.f19678a[i22];
                    list = (List) unsafe.getObject(obj, j8);
                    d3.x(i18, list, l4Var, z7);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 43:
                    d3.d(this.f19678a[i22], (List) unsafe.getObject(obj, j8), l4Var, true);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 44:
                    d3.z(this.f19678a[i22], (List) unsafe.getObject(obj, j8), l4Var, true);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 45:
                    d3.F(this.f19678a[i22], (List) unsafe.getObject(obj, j8), l4Var, true);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 46:
                    d3.a(this.f19678a[i22], (List) unsafe.getObject(obj, j8), l4Var, true);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 47:
                    d3.b(this.f19678a[i22], (List) unsafe.getObject(obj, j8), l4Var, true);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 48:
                    d3.c(this.f19678a[i22], (List) unsafe.getObject(obj, j8), l4Var, true);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 49:
                    int i33 = this.f19678a[i22];
                    List list5 = (List) unsafe.getObject(obj, j8);
                    b3 b3VarK2 = K(i22);
                    int i34 = d3.f19488d;
                    if (list5 != null && !list5.isEmpty()) {
                        for (int i35 = 0; i35 < list5.size(); i35++) {
                            ((w0) l4Var).r(i33, list5.get(i35), b3VarK2);
                        }
                    }
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j8) != null) {
                        throw null;
                    }
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                    break;
                case 51:
                    if (v(obj, i23, i22)) {
                        dF = B(obj, j8);
                        l4Var.z(i23, dF);
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case 52:
                    if (v(obj, i23, i22)) {
                        fG = C(obj, j8);
                        l4Var.A(i23, fG);
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case 53:
                    if (v(obj, i23, i22)) {
                        jI = I(obj, j8);
                        l4Var.q(i23, jI);
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case 54:
                    if (v(obj, i23, i22)) {
                        jI2 = I(obj, j8);
                        l4Var.F(i23, jI2);
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case 55:
                    if (v(obj, i23, i22)) {
                        iD = D(obj, j8);
                        l4Var.w(i23, iD);
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case 56:
                    if (v(obj, i23, i22)) {
                        jI3 = I(obj, j8);
                        l4Var.d(i23, jI3);
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case 57:
                    if (v(obj, i23, i22)) {
                        iD2 = D(obj, j8);
                        l4Var.l(i23, iD2);
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case 58:
                    if (v(obj, i23, i22)) {
                        zB = w(obj, j8);
                        l4Var.m(i23, zB);
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case 59:
                    if (v(obj, i23, i22)) {
                        object = unsafe.getObject(obj, j8);
                        x(i23, object, l4Var);
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case 60:
                    if (v(obj, i23, i22)) {
                        object2 = unsafe.getObject(obj, j8);
                        l4Var.y(i23, object2, K(i22));
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case 61:
                    if (v(obj, i23, i22)) {
                        object3 = unsafe.getObject(obj, j8);
                        l4Var.n(i23, (n0) object3);
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case 62:
                    if (v(obj, i23, i22)) {
                        iD3 = D(obj, j8);
                        l4Var.c(i23, iD3);
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case 63:
                    if (v(obj, i23, i22)) {
                        iD4 = D(obj, j8);
                        l4Var.v(i23, iD4);
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case 64:
                    if (v(obj, i23, i22)) {
                        iD5 = D(obj, j8);
                        l4Var.f(i23, iD5);
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case 65:
                    if (v(obj, i23, i22)) {
                        jI4 = I(obj, j8);
                        l4Var.s(i23, jI4);
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case 66:
                    if (v(obj, i23, i22)) {
                        iD6 = D(obj, j8);
                        l4Var.o(i23, iD6);
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case 67:
                    if (v(obj, i23, i22)) {
                        jI5 = I(obj, j8);
                        l4Var.I(i23, jI5);
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                case 68:
                    if (v(obj, i23, i22)) {
                        object4 = unsafe.getObject(obj, j8);
                        l4Var.r(i23, object4, K(i22));
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    } else {
                        i22 += 3;
                        i20 = i8;
                        i21 = i9;
                        i19 = 1048575;
                    }
                    break;
                default:
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
            }
        }
        t3 t3Var = this.f19688k;
        t3Var.i(t3Var.d(obj), l4Var);
    }

    @Override // com.google.android.gms.internal.play_billing.b3
    public final void h(Object obj, byte[] bArr, int i8, int i9, a0 a0Var) throws u1 {
        y(obj, bArr, i8, i9, 0, a0Var);
    }

    @Override // com.google.android.gms.internal.play_billing.b3
    public final Object m() {
        return ((n1) this.f19682e).g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:257:0x0622, code lost:
    
        if (r1 == 0) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0624, code lost:
    
        r13.add(com.google.android.gms.internal.play_billing.n0.f19633b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x062a, code lost:
    
        r13.add(com.google.android.gms.internal.play_billing.n0.y(r37, r0, r1));
        r0 = r0 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0632, code lost:
    
        if (r0 >= r8) goto L696;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0634, code lost:
    
        r1 = com.google.android.gms.internal.play_billing.b0.h(r37, r0, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x063a, code lost:
    
        if (r14 != r10.f19464a) goto L697;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x063c, code lost:
    
        r0 = com.google.android.gms.internal.play_billing.b0.h(r37, r1, r10);
        r1 = r10.f19464a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0642, code lost:
    
        if (r1 < 0) goto L605;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0646, code lost:
    
        if (r1 > (r37.length - r0)) goto L606;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0648, code lost:
    
        if (r1 != 0) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x064f, code lost:
    
        throw com.google.android.gms.internal.play_billing.u1.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0654, code lost:
    
        throw com.google.android.gms.internal.play_billing.u1.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0655, code lost:
    
        r1 = r0;
        r7 = r14;
        r0 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x07a0, code lost:
    
        if (r3.f19465b != 0) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x07a2, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x07a4, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x07a5, code lost:
    
        r13.e(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x07a8, code lost:
    
        if (r2 >= r6) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x07aa, code lost:
    
        r8 = com.google.android.gms.internal.play_billing.b0.h(r37, r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x07b0, code lost:
    
        if (r7 != r3.f19464a) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x07b2, code lost:
    
        r2 = com.google.android.gms.internal.play_billing.b0.k(r37, r8, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x07ba, code lost:
    
        if (r3.f19465b == 0) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x0c3e, code lost:
    
        if (r6 == 1048575) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x0c40, code lost:
    
        r33.putInt(r7, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x0c46, code lost:
    
        r2 = r0.f19685h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x0c4a, code lost:
    
        if (r2 >= r0.f19686i) goto L676;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0c4c, code lost:
    
        r3 = r0.f19684g;
        r5 = r0.f19678a;
        r3 = r3[r2];
        r5 = r5[r3];
        r5 = com.google.android.gms.internal.play_billing.d4.k(r7, r0.H(r3) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0c5e, code lost:
    
        if (r5 != null) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x0c65, code lost:
    
        if (r0.J(r3) != null) goto L677;
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x0c67, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0c6a, code lost:
    
        r5 = (com.google.android.gms.internal.play_billing.k2) r5;
        r1 = (com.google.android.gms.internal.play_billing.j2) r0.L(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x0c72, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x0c75, code lost:
    
        if (r8 != 0) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x0c77, code lost:
    
        if (r1 != r39) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x0c7e, code lost:
    
        throw com.google.android.gms.internal.play_billing.u1.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0c7f, code lost:
    
        if (r1 > r39) goto L579;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0c81, code lost:
    
        if (r4 != r8) goto L579;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x0c83, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x0c88, code lost:
    
        throw com.google.android.gms.internal.play_billing.u1.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x0632, code lost:
    
        r13.add(com.google.android.gms.internal.play_billing.n0.y(r37, r0, r1));
        r0 = r0 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x07a5, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x09a7 A[PHI: r0 r7 r8 r9 r11 r14 r33
  0x09a7: PHI (r0v32 com.google.android.gms.internal.play_billing.u2<T>) = 
  (r0v1 com.google.android.gms.internal.play_billing.u2<T>)
  (r0v1 com.google.android.gms.internal.play_billing.u2<T>)
  (r0v1 com.google.android.gms.internal.play_billing.u2<T>)
  (r0v29 com.google.android.gms.internal.play_billing.u2<T>)
  (r0v30 com.google.android.gms.internal.play_billing.u2<T>)
  (r0v1 com.google.android.gms.internal.play_billing.u2<T>)
 binds: [B:439:0x0964, B:423:0x090a, B:406:0x08bc, B:250:0x0605, B:332:0x075b, B:182:0x0474] A[DONT_GENERATE, DONT_INLINE]
  0x09a7: PHI (r7v29 int) = (r7v6 int), (r7v7 int), (r7v8 int), (r7v22 int), (r7v24 int), (r7v33 int) binds: [B:439:0x0964, B:423:0x090a, B:406:0x08bc, B:250:0x0605, B:332:0x075b, B:182:0x0474] A[DONT_GENERATE, DONT_INLINE]
  0x09a7: PHI (r8v108 int) = (r8v48 int), (r8v49 int), (r8v50 int), (r8v99 int), (r8v101 int), (r8v112 int) binds: [B:439:0x0964, B:423:0x090a, B:406:0x08bc, B:250:0x0605, B:332:0x075b, B:182:0x0474] A[DONT_GENERATE, DONT_INLINE]
  0x09a7: PHI (r9v78 com.google.android.gms.internal.play_billing.a0) = 
  (r9v37 com.google.android.gms.internal.play_billing.a0)
  (r9v38 com.google.android.gms.internal.play_billing.a0)
  (r9v39 com.google.android.gms.internal.play_billing.a0)
  (r9v71 com.google.android.gms.internal.play_billing.a0)
  (r9v73 com.google.android.gms.internal.play_billing.a0)
  (r9v80 com.google.android.gms.internal.play_billing.a0)
 binds: [B:439:0x0964, B:423:0x090a, B:406:0x08bc, B:250:0x0605, B:332:0x075b, B:182:0x0474] A[DONT_GENERATE, DONT_INLINE]
  0x09a7: PHI (r11v33 int) = (r11v13 int), (r11v14 int), (r11v15 int), (r11v26 int), (r11v28 int), (r11v36 int) binds: [B:439:0x0964, B:423:0x090a, B:406:0x08bc, B:250:0x0605, B:332:0x075b, B:182:0x0474] A[DONT_GENERATE, DONT_INLINE]
  0x09a7: PHI (r14v41 int) = (r14v15 int), (r14v16 int), (r14v17 int), (r14v31 int), (r14v33 int), (r14v43 int) binds: [B:439:0x0964, B:423:0x090a, B:406:0x08bc, B:250:0x0605, B:332:0x075b, B:182:0x0474] A[DONT_GENERATE, DONT_INLINE]
  0x09a7: PHI (r33v32 sun.misc.Unsafe) = 
  (r33v7 sun.misc.Unsafe)
  (r33v8 sun.misc.Unsafe)
  (r33v9 sun.misc.Unsafe)
  (r33v25 sun.misc.Unsafe)
  (r33v27 sun.misc.Unsafe)
  (r33v34 sun.misc.Unsafe)
 binds: [B:439:0x0964, B:423:0x090a, B:406:0x08bc, B:250:0x0605, B:332:0x075b, B:182:0x0474] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:619:0x09aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:622:0x0bc5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:625:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:666:0x09bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:667:0x0bd7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0210  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:267:0x0648 -> B:258:0x0624). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:298:0x06e6 -> B:290:0x06c5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:318:0x0730 -> B:308:0x0707). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:356:0x07ba -> B:349:0x07a2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int y(java.lang.Object r36, byte[] r37, int r38, int r39, int r40, com.google.android.gms.internal.play_billing.a0 r41) throws com.google.android.gms.internal.play_billing.u1 {
        /*
            Method dump skipped, instruction units count: 3354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.u2.y(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.a0):int");
    }
}
