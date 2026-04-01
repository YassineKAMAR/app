package com.google.android.gms.internal.ads;

import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class n24<T> implements e34<T> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int[] f11632p = new int[0];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Unsafe f11633q = g44.q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f11634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f11635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f11636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f11637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k24 f11638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f11639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f11640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int[] f11641h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f11642i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f11643j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final x14 f11644k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final v34 f11645l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final n04 f11646m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final p24 f11647n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final f24 f11648o;

    private n24(int[] iArr, Object[] objArr, int i8, int i9, k24 k24Var, int i10, boolean z7, int[] iArr2, int i11, int i12, p24 p24Var, x14 x14Var, v34 v34Var, n04 n04Var, f24 f24Var) {
        this.f11634a = iArr;
        this.f11635b = objArr;
        this.f11636c = i8;
        this.f11637d = i9;
        this.f11640g = k24Var instanceof z04;
        boolean z8 = false;
        if (n04Var != null && n04Var.h(k24Var)) {
            z8 = true;
        }
        this.f11639f = z8;
        this.f11641h = iArr2;
        this.f11642i = i11;
        this.f11643j = i12;
        this.f11647n = p24Var;
        this.f11644k = x14Var;
        this.f11645l = v34Var;
        this.f11646m = n04Var;
        this.f11638e = k24Var;
        this.f11648o = f24Var;
    }

    private static boolean A(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof z04) {
            return ((z04) obj).H();
        }
        return true;
    }

    private final boolean B(Object obj, int i8, int i9) {
        return g44.l(obj, (long) (L(i9) & 1048575)) == i8;
    }

    private static boolean C(Object obj, long j8) {
        return ((Boolean) g44.p(obj, j8)).booleanValue();
    }

    private static final void D(int i8, Object obj, i04 i04Var) {
        if (obj instanceof String) {
            i04Var.f(i8, (String) obj);
        } else {
            i04Var.o(i8, (rz3) obj);
        }
    }

    static w34 F(Object obj) {
        z04 z04Var = (z04) obj;
        w34 w34Var = z04Var.zzc;
        if (w34Var != w34.c()) {
            return w34Var;
        }
        w34 w34VarF = w34.f();
        z04Var.zzc = w34VarF;
        return w34VarF;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0281  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.android.gms.internal.ads.n24 G(java.lang.Class r33, com.google.android.gms.internal.ads.h24 r34, com.google.android.gms.internal.ads.p24 r35, com.google.android.gms.internal.ads.x14 r36, com.google.android.gms.internal.ads.v34 r37, com.google.android.gms.internal.ads.n04 r38, com.google.android.gms.internal.ads.f24 r39) {
        /*
            Method dump skipped, instruction units count: 1029
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n24.G(java.lang.Class, com.google.android.gms.internal.ads.h24, com.google.android.gms.internal.ads.p24, com.google.android.gms.internal.ads.x14, com.google.android.gms.internal.ads.v34, com.google.android.gms.internal.ads.n04, com.google.android.gms.internal.ads.f24):com.google.android.gms.internal.ads.n24");
    }

    private static double H(Object obj, long j8) {
        return ((Double) g44.p(obj, j8)).doubleValue();
    }

    private static float I(Object obj, long j8) {
        return ((Float) g44.p(obj, j8)).floatValue();
    }

    private static int J(Object obj, long j8) {
        return ((Integer) g44.p(obj, j8)).intValue();
    }

    private final int K(int i8) {
        if (i8 < this.f11636c || i8 > this.f11637d) {
            return -1;
        }
        return M(i8, 0);
    }

    private final int L(int i8) {
        return this.f11634a[i8 + 2];
    }

    private final int M(int i8, int i9) {
        int length = (this.f11634a.length / 3) - 1;
        while (i9 <= length) {
            int i10 = (length + i9) >>> 1;
            int i11 = i10 * 3;
            int i12 = this.f11634a[i11];
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

    private static int N(int i8) {
        return (i8 >>> 20) & 255;
    }

    private final int O(int i8) {
        return this.f11634a[i8 + 1];
    }

    private static long P(Object obj, long j8) {
        return ((Long) g44.p(obj, j8)).longValue();
    }

    private final e14 Q(int i8) {
        int i9 = i8 / 3;
        return (e14) this.f11635b[i9 + i9 + 1];
    }

    private final e34 R(int i8) {
        Object[] objArr = this.f11635b;
        int i9 = i8 / 3;
        int i10 = i9 + i9;
        e34 e34Var = (e34) objArr[i10];
        if (e34Var != null) {
            return e34Var;
        }
        e34 e34VarB = s24.a().b((Class) objArr[i10 + 1]);
        this.f11635b[i10] = e34VarB;
        return e34VarB;
    }

    private final Object S(Object obj, int i8, Object obj2, v34 v34Var, Object obj3) {
        int i9 = this.f11634a[i8];
        Object objP = g44.p(obj, O(i8) & 1048575);
        if (objP == null || Q(i8) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object T(int i8) {
        int i9 = i8 / 3;
        return this.f11635b[i9 + i9];
    }

    private final Object j(Object obj, int i8) {
        e34 e34VarR = R(i8);
        int iO = O(i8) & 1048575;
        if (!x(obj, i8)) {
            return e34VarR.m();
        }
        Object object = f11633q.getObject(obj, iO);
        if (A(object)) {
            return object;
        }
        Object objM = e34VarR.m();
        if (object != null) {
            e34VarR.e(objM, object);
        }
        return objM;
    }

    private final Object k(Object obj, int i8, int i9) {
        e34 e34VarR = R(i9);
        if (!B(obj, i8, i9)) {
            return e34VarR.m();
        }
        Object object = f11633q.getObject(obj, O(i9) & 1048575);
        if (A(object)) {
            return object;
        }
        Object objM = e34VarR.m();
        if (object != null) {
            e34VarR.e(objM, object);
        }
        return objM;
    }

    private static Field l(Class cls, String str) {
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

    private static void n(Object obj) {
        if (!A(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void o(Object obj, Object obj2, int i8) {
        if (x(obj2, i8)) {
            int iO = O(i8) & 1048575;
            Unsafe unsafe = f11633q;
            long j8 = iO;
            Object object = unsafe.getObject(obj2, j8);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f11634a[i8] + " is present but null: " + obj2.toString());
            }
            e34 e34VarR = R(i8);
            if (!x(obj, i8)) {
                if (A(object)) {
                    Object objM = e34VarR.m();
                    e34VarR.e(objM, object);
                    unsafe.putObject(obj, j8, objM);
                } else {
                    unsafe.putObject(obj, j8, object);
                }
                r(obj, i8);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!A(object2)) {
                Object objM2 = e34VarR.m();
                e34VarR.e(objM2, object2);
                unsafe.putObject(obj, j8, objM2);
                object2 = objM2;
            }
            e34VarR.e(object2, object);
        }
    }

    private final void p(Object obj, Object obj2, int i8) {
        int i9 = this.f11634a[i8];
        if (B(obj2, i9, i8)) {
            int iO = O(i8) & 1048575;
            Unsafe unsafe = f11633q;
            long j8 = iO;
            Object object = unsafe.getObject(obj2, j8);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f11634a[i8] + " is present but null: " + obj2.toString());
            }
            e34 e34VarR = R(i8);
            if (!B(obj, i9, i8)) {
                if (A(object)) {
                    Object objM = e34VarR.m();
                    e34VarR.e(objM, object);
                    unsafe.putObject(obj, j8, objM);
                } else {
                    unsafe.putObject(obj, j8, object);
                }
                s(obj, i9, i8);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!A(object2)) {
                Object objM2 = e34VarR.m();
                e34VarR.e(objM2, object2);
                unsafe.putObject(obj, j8, objM2);
                object2 = objM2;
            }
            e34VarR.e(object2, object);
        }
    }

    private final void q(Object obj, int i8, v24 v24Var) {
        g44.D(obj, i8 & 1048575, w(i8) ? v24Var.C() : this.f11640g ? v24Var.B() : v24Var.y());
    }

    private final void r(Object obj, int i8) {
        int iL = L(i8);
        long j8 = 1048575 & iL;
        if (j8 == 1048575) {
            return;
        }
        g44.B(obj, j8, (1 << (iL >>> 20)) | g44.l(obj, j8));
    }

    private final void s(Object obj, int i8, int i9) {
        g44.B(obj, L(i9) & 1048575, i8);
    }

    private final void t(Object obj, int i8, Object obj2) {
        f11633q.putObject(obj, O(i8) & 1048575, obj2);
        r(obj, i8);
    }

    private final void u(Object obj, int i8, int i9, Object obj2) {
        f11633q.putObject(obj, O(i9) & 1048575, obj2);
        s(obj, i8, i9);
    }

    private final boolean v(Object obj, Object obj2, int i8) {
        return x(obj, i8) == x(obj2, i8);
    }

    private static boolean w(int i8) {
        return (i8 & 536870912) != 0;
    }

    private final boolean x(Object obj, int i8) {
        int iL = L(i8);
        long j8 = iL & 1048575;
        if (j8 != 1048575) {
            return (g44.l(obj, j8) & (1 << (iL >>> 20))) != 0;
        }
        int iO = O(i8);
        long j9 = iO & 1048575;
        switch (N(iO)) {
            case 0:
                return Double.doubleToRawLongBits(g44.j(obj, j9)) != 0;
            case 1:
                return Float.floatToRawIntBits(g44.k(obj, j9)) != 0;
            case 2:
                return g44.n(obj, j9) != 0;
            case 3:
                return g44.n(obj, j9) != 0;
            case 4:
                return g44.l(obj, j9) != 0;
            case 5:
                return g44.n(obj, j9) != 0;
            case 6:
                return g44.l(obj, j9) != 0;
            case 7:
                return g44.H(obj, j9);
            case 8:
                Object objP = g44.p(obj, j9);
                if (objP instanceof String) {
                    return !((String) objP).isEmpty();
                }
                if (objP instanceof rz3) {
                    return !rz3.f14393b.equals(objP);
                }
                throw new IllegalArgumentException();
            case 9:
                return g44.p(obj, j9) != null;
            case R.styleable.GradientColor_android_endX /* 10 */:
                return !rz3.f14393b.equals(g44.p(obj, j9));
            case R.styleable.GradientColor_android_endY /* 11 */:
                return g44.l(obj, j9) != 0;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                return g44.l(obj, j9) != 0;
            case 13:
                return g44.l(obj, j9) != 0;
            case 14:
                return g44.n(obj, j9) != 0;
            case 15:
                return g44.l(obj, j9) != 0;
            case com.amazon.c.a.a.c.f4052g /* 16 */:
                return g44.n(obj, j9) != 0;
            case 17:
                return g44.p(obj, j9) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean y(Object obj, int i8, int i9, int i10, int i11) {
        return i9 == 1048575 ? x(obj, i8) : (i10 & i11) != 0;
    }

    private static boolean z(Object obj, int i8, e34 e34Var) {
        return e34Var.d(g44.p(obj, i8 & 1048575));
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x0487, code lost:
    
        if (r1 == 0) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0489, code lost:
    
        r13.add(com.google.android.gms.internal.ads.rz3.f14393b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x048f, code lost:
    
        r13.add(com.google.android.gms.internal.ads.rz3.L(r35, r0, r1));
        r0 = r0 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0497, code lost:
    
        if (r0 >= r10) goto L580;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0499, code lost:
    
        r1 = com.google.android.gms.internal.ads.ez3.h(r35, r0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x049f, code lost:
    
        if (r14 != r12.f7070a) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x04a1, code lost:
    
        r0 = com.google.android.gms.internal.ads.ez3.h(r35, r1, r12);
        r1 = r12.f7070a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x04a7, code lost:
    
        if (r1 < 0) goto L522;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x04ab, code lost:
    
        if (r1 > (r35.length - r0)) goto L523;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x04ad, code lost:
    
        if (r1 != 0) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x04b4, code lost:
    
        throw com.google.android.gms.internal.ads.m14.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x04b9, code lost:
    
        throw com.google.android.gms.internal.ads.m14.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x04ba, code lost:
    
        r7 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x05ee, code lost:
    
        if (r12.f7071b != 0) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x05f0, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x05f2, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x05f3, code lost:
    
        r13.e(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x05f6, code lost:
    
        if (r1 >= r3) goto L597;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x05f8, code lost:
    
        r8 = com.google.android.gms.internal.ads.ez3.h(r35, r1, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x05fe, code lost:
    
        if (r7 != r12.f7070a) goto L595;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0600, code lost:
    
        r1 = com.google.android.gms.internal.ads.ez3.k(r35, r8, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0608, code lost:
    
        if (r12.f7071b == 0) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0ace, code lost:
    
        if (r5 == r0) goto L494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0ad0, code lost:
    
        r14.putInt(r7, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0ad4, code lost:
    
        r11 = r12.f11642i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0ad9, code lost:
    
        if (r11 >= r12.f11643j) goto L573;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0adb, code lost:
    
        S(r34, r12.f11641h[r11], null, r12.f11645l, r34);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0aee, code lost:
    
        if (r9 != 0) goto L503;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0af0, code lost:
    
        if (r6 != r10) goto L501;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0af7, code lost:
    
        throw com.google.android.gms.internal.ads.m14.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0af8, code lost:
    
        if (r6 > r10) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x0afa, code lost:
    
        if (r8 != r9) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x0afc, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0b01, code lost:
    
        throw com.google.android.gms.internal.ads.m14.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0497, code lost:
    
        r13.add(com.google.android.gms.internal.ads.rz3.L(r35, r0, r1));
        r0 = r0 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x05f3, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:229:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x07db A[PHI: r7 r8 r9 r10 r11 r14
  0x07db: PHI (r7v30 int) = (r7v12 int), (r7v14 int), (r7v15 int), (r7v20 int), (r7v24 int), (r7v28 int), (r7v34 int) binds: [B:372:0x0796, B:356:0x0740, B:339:0x06f6, B:266:0x05ab, B:216:0x04ee, B:185:0x0469, B:141:0x0377] A[DONT_GENERATE, DONT_INLINE]
  0x07db: PHI (r8v123 int) = (r8v69 int), (r8v71 int), (r8v72 int), (r8v98 int), (r8v114 int), (r8v121 int), (r8v126 int) binds: [B:372:0x0796, B:356:0x0740, B:339:0x06f6, B:266:0x05ab, B:216:0x04ee, B:185:0x0469, B:141:0x0377] A[DONT_GENERATE, DONT_INLINE]
  0x07db: PHI (r9v72 int) = (r9v47 int), (r9v49 int), (r9v50 int), (r9v62 int), (r9v68 int), (r9v70 int), (r9v75 int) binds: [B:372:0x0796, B:356:0x0740, B:339:0x06f6, B:266:0x05ab, B:216:0x04ee, B:185:0x0469, B:141:0x0377] A[DONT_GENERATE, DONT_INLINE]
  0x07db: PHI (r10v101 int) = (r10v69 int), (r10v71 int), (r10v72 int), (r10v76 int), (r10v88 int), (r10v95 int), (r10v105 int) binds: [B:372:0x0796, B:356:0x0740, B:339:0x06f6, B:266:0x05ab, B:216:0x04ee, B:185:0x0469, B:141:0x0377] A[DONT_GENERATE, DONT_INLINE]
  0x07db: PHI (r11v67 int) = (r11v44 int), (r11v46 int), (r11v47 int), (r11v50 int), (r11v59 int), (r11v65 int), (r11v71 int) binds: [B:372:0x0796, B:356:0x0740, B:339:0x06f6, B:266:0x05ab, B:216:0x04ee, B:185:0x0469, B:141:0x0377] A[DONT_GENERATE, DONT_INLINE]
  0x07db: PHI (r14v48 sun.misc.Unsafe) = 
  (r14v27 sun.misc.Unsafe)
  (r14v29 sun.misc.Unsafe)
  (r14v30 sun.misc.Unsafe)
  (r14v32 sun.misc.Unsafe)
  (r14v40 sun.misc.Unsafe)
  (r14v46 sun.misc.Unsafe)
  (r14v51 sun.misc.Unsafe)
 binds: [B:372:0x0796, B:356:0x0740, B:339:0x06f6, B:266:0x05ab, B:216:0x04ee, B:185:0x0469, B:141:0x0377] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0a4f  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0a5e  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x07de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:564:0x07ee A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:202:0x04ad -> B:193:0x0489). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:233:0x053a -> B:225:0x0519). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:253:0x0584 -> B:243:0x055b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:290:0x0608 -> B:283:0x05f0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int E(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.ads.dz3 r39) throws com.google.android.gms.internal.ads.m14 {
        /*
            Method dump skipped, instruction units count: 2962
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n24.E(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.dz3):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:243:0x0507, code lost:
    
        if ((r1 instanceof com.google.android.gms.internal.ads.rz3) != false) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x050a, code lost:
    
        r1 = com.google.android.gms.internal.ads.h04.C((java.lang.String) r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d1, code lost:
    
        if ((r1 instanceof com.google.android.gms.internal.ads.rz3) != false) goto L235;
     */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03d3  */
    @Override // com.google.android.gms.internal.ads.e34
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 1642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n24.a(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2 A[PHI: r1 r2
  0x00e2: PHI (r1v12 int) = (r1v10 int), (r1v15 int) binds: [B:67:0x00e0, B:63:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x00e2: PHI (r2v15 java.lang.Object) = (r2v12 java.lang.Object), (r2v16 java.lang.Object) binds: [B:67:0x00e0, B:63:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.e34
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n24.b(java.lang.Object):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
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
    @Override // com.google.android.gms.internal.ads.e34
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n24.c(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    @Override // com.google.android.gms.internal.ads.e34
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n24.d(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    @Override // com.google.android.gms.internal.ads.e34
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n24.e(java.lang.Object, java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.ads.e34
    public final boolean f(Object obj, Object obj2) {
        for (int i8 = 0; i8 < this.f11634a.length; i8 += 3) {
            int iO = O(i8);
            long j8 = iO & 1048575;
            switch (N(iO)) {
                case 0:
                    if (!v(obj, obj2, i8) || Double.doubleToLongBits(g44.j(obj, j8)) != Double.doubleToLongBits(g44.j(obj2, j8))) {
                        return false;
                    }
                    break;
                    break;
                case 1:
                    if (!v(obj, obj2, i8) || Float.floatToIntBits(g44.k(obj, j8)) != Float.floatToIntBits(g44.k(obj2, j8))) {
                        return false;
                    }
                    break;
                    break;
                case 2:
                    if (!v(obj, obj2, i8) || g44.n(obj, j8) != g44.n(obj2, j8)) {
                        return false;
                    }
                    break;
                    break;
                case 3:
                    if (!v(obj, obj2, i8) || g44.n(obj, j8) != g44.n(obj2, j8)) {
                        return false;
                    }
                    break;
                    break;
                case 4:
                    if (!v(obj, obj2, i8) || g44.l(obj, j8) != g44.l(obj2, j8)) {
                        return false;
                    }
                    break;
                    break;
                case 5:
                    if (!v(obj, obj2, i8) || g44.n(obj, j8) != g44.n(obj2, j8)) {
                        return false;
                    }
                    break;
                    break;
                case 6:
                    if (!v(obj, obj2, i8) || g44.l(obj, j8) != g44.l(obj2, j8)) {
                        return false;
                    }
                    break;
                    break;
                case 7:
                    if (!v(obj, obj2, i8) || g44.H(obj, j8) != g44.H(obj2, j8)) {
                        return false;
                    }
                    break;
                    break;
                case 8:
                    if (!v(obj, obj2, i8) || !g34.z(g44.p(obj, j8), g44.p(obj2, j8))) {
                        return false;
                    }
                    break;
                    break;
                case 9:
                    if (!v(obj, obj2, i8) || !g34.z(g44.p(obj, j8), g44.p(obj2, j8))) {
                        return false;
                    }
                    break;
                    break;
                case R.styleable.GradientColor_android_endX /* 10 */:
                    if (!v(obj, obj2, i8) || !g34.z(g44.p(obj, j8), g44.p(obj2, j8))) {
                        return false;
                    }
                    break;
                    break;
                case R.styleable.GradientColor_android_endY /* 11 */:
                    if (!v(obj, obj2, i8) || g44.l(obj, j8) != g44.l(obj2, j8)) {
                        return false;
                    }
                    break;
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    if (!v(obj, obj2, i8) || g44.l(obj, j8) != g44.l(obj2, j8)) {
                        return false;
                    }
                    break;
                    break;
                case 13:
                    if (!v(obj, obj2, i8) || g44.l(obj, j8) != g44.l(obj2, j8)) {
                        return false;
                    }
                    break;
                    break;
                case 14:
                    if (!v(obj, obj2, i8) || g44.n(obj, j8) != g44.n(obj2, j8)) {
                        return false;
                    }
                    break;
                    break;
                case 15:
                    if (!v(obj, obj2, i8) || g44.l(obj, j8) != g44.l(obj2, j8)) {
                        return false;
                    }
                    break;
                    break;
                case com.amazon.c.a.a.c.f4052g /* 16 */:
                    if (!v(obj, obj2, i8) || g44.n(obj, j8) != g44.n(obj2, j8)) {
                        return false;
                    }
                    break;
                    break;
                case 17:
                    if (!v(obj, obj2, i8) || !g34.z(g44.p(obj, j8), g44.p(obj2, j8))) {
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
                    if (!g34.z(g44.p(obj, j8), g44.p(obj2, j8))) {
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
                    long jL = L(i8) & 1048575;
                    if (g44.l(obj, jL) != g44.l(obj2, jL) || !g34.z(g44.p(obj, j8), g44.p(obj2, j8))) {
                        return false;
                    }
                    break;
                    break;
            }
        }
        if (!this.f11645l.d(obj).equals(this.f11645l.d(obj2))) {
            return false;
        }
        if (!this.f11639f) {
            return true;
        }
        this.f11646m.a(obj);
        this.f11646m.a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.e34
    public final void g(Object obj, byte[] bArr, int i8, int i9, dz3 dz3Var) throws m14 {
        E(obj, bArr, i8, i9, 0, dz3Var);
    }

    @Override // com.google.android.gms.internal.ads.e34
    public final void h(Object obj, i04 i04Var) {
        int i8;
        int i9;
        int i10;
        double dJ;
        float fK;
        long jP;
        long jP2;
        int iJ;
        long jP3;
        int iJ2;
        boolean zH;
        Object object;
        Object object2;
        Object object3;
        int iJ3;
        int iJ4;
        int iJ5;
        long jP4;
        int iJ6;
        long jP5;
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
        if (this.f11639f) {
            this.f11646m.a(obj);
            throw null;
        }
        int[] iArr = this.f11634a;
        Unsafe unsafe = f11633q;
        int i19 = 1048575;
        int i20 = 1048575;
        int i21 = 0;
        int i22 = 0;
        while (i22 < iArr.length) {
            int iO = O(i22);
            int[] iArr2 = this.f11634a;
            int iN = N(iO);
            int i23 = iArr2[i22];
            boolean z7 = true;
            if (iN <= 17) {
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
            long j8 = iO & i19;
            switch (iN) {
                case 0:
                    if (y(obj, i22, i8, i9, i10)) {
                        dJ = g44.j(obj, j8);
                        i04Var.q(i23, dJ);
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
                    if (y(obj, i22, i8, i9, i10)) {
                        fK = g44.k(obj, j8);
                        i04Var.z(i23, fK);
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
                    if (y(obj, i22, i8, i9, i10)) {
                        jP = unsafe.getLong(obj, j8);
                        i04Var.E(i23, jP);
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
                    if (y(obj, i22, i8, i9, i10)) {
                        jP2 = unsafe.getLong(obj, j8);
                        i04Var.j(i23, jP2);
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
                    if (y(obj, i22, i8, i9, i10)) {
                        iJ = unsafe.getInt(obj, j8);
                        i04Var.C(i23, iJ);
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
                    if (y(obj, i22, i8, i9, i10)) {
                        jP3 = unsafe.getLong(obj, j8);
                        i04Var.x(i23, jP3);
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
                    if (y(obj, i22, i8, i9, i10)) {
                        iJ2 = unsafe.getInt(obj, j8);
                        i04Var.v(i23, iJ2);
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
                    if (y(obj, i22, i8, i9, i10)) {
                        zH = g44.H(obj, j8);
                        i04Var.m(i23, zH);
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
                    if (y(obj, i22, i8, i9, i10)) {
                        object = unsafe.getObject(obj, j8);
                        D(i23, object, i04Var);
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
                    if (y(obj, i22, i8, i9, i10)) {
                        object2 = unsafe.getObject(obj, j8);
                        i04Var.G(i23, object2, R(i22));
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
                    if (y(obj, i22, i8, i9, i10)) {
                        object3 = unsafe.getObject(obj, j8);
                        i04Var.o(i23, (rz3) object3);
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
                    if (y(obj, i22, i8, i9, i10)) {
                        iJ3 = unsafe.getInt(obj, j8);
                        i04Var.h(i23, iJ3);
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
                    if (y(obj, i22, i8, i9, i10)) {
                        iJ4 = unsafe.getInt(obj, j8);
                        i04Var.t(i23, iJ4);
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
                    if (y(obj, i22, i8, i9, i10)) {
                        iJ5 = unsafe.getInt(obj, j8);
                        i04Var.H(i23, iJ5);
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
                    if (y(obj, i22, i8, i9, i10)) {
                        jP4 = unsafe.getLong(obj, j8);
                        i04Var.J(i23, jP4);
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
                    if (y(obj, i22, i8, i9, i10)) {
                        iJ6 = unsafe.getInt(obj, j8);
                        i04Var.a(i23, iJ6);
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
                    if (y(obj, i22, i8, i9, i10)) {
                        jP5 = unsafe.getLong(obj, j8);
                        i04Var.c(i23, jP5);
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
                    if (y(obj, i22, i8, i9, i10)) {
                        object4 = unsafe.getObject(obj, j8);
                        i04Var.B(i23, object4, R(i22));
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
                    i11 = this.f11634a[i22];
                    g34.B(i11, (List) unsafe.getObject(obj, j8), i04Var, z7);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 19:
                    z7 = false;
                    i12 = this.f11634a[i22];
                    g34.F(i12, (List) unsafe.getObject(obj, j8), i04Var, z7);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 20:
                    z7 = false;
                    i13 = this.f11634a[i22];
                    g34.a(i13, (List) unsafe.getObject(obj, j8), i04Var, z7);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 21:
                    z7 = false;
                    i14 = this.f11634a[i22];
                    g34.g(i14, (List) unsafe.getObject(obj, j8), i04Var, z7);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 22:
                    z7 = false;
                    i15 = this.f11634a[i22];
                    g34.G(i15, (List) unsafe.getObject(obj, j8), i04Var, z7);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 23:
                    z7 = false;
                    i16 = this.f11634a[i22];
                    g34.E(i16, (List) unsafe.getObject(obj, j8), i04Var, z7);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 24:
                    z7 = false;
                    i17 = this.f11634a[i22];
                    g34.D(i17, (List) unsafe.getObject(obj, j8), i04Var, z7);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 25:
                    i18 = this.f11634a[i22];
                    list = (List) unsafe.getObject(obj, j8);
                    z7 = false;
                    g34.A(i18, list, i04Var, z7);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 26:
                    int i26 = this.f11634a[i22];
                    List list2 = (List) unsafe.getObject(obj, j8);
                    int i27 = g34.f8190d;
                    if (list2 != null && !list2.isEmpty()) {
                        i04Var.g(i26, list2);
                    }
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 27:
                    int i28 = this.f11634a[i22];
                    List list3 = (List) unsafe.getObject(obj, j8);
                    e34 e34VarR = R(i22);
                    int i29 = g34.f8190d;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i30 = 0; i30 < list3.size(); i30++) {
                            i04Var.G(i28, list3.get(i30), e34VarR);
                        }
                    }
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 28:
                    int i31 = this.f11634a[i22];
                    List list4 = (List) unsafe.getObject(obj, j8);
                    int i32 = g34.f8190d;
                    if (list4 != null && !list4.isEmpty()) {
                        i04Var.p(i31, list4);
                    }
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 29:
                    g34.f(this.f11634a[i22], (List) unsafe.getObject(obj, j8), i04Var, false);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 30:
                    g34.C(this.f11634a[i22], (List) unsafe.getObject(obj, j8), i04Var, false);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 31:
                    g34.b(this.f11634a[i22], (List) unsafe.getObject(obj, j8), i04Var, false);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case com.amazon.c.a.a.c.f4053h /* 32 */:
                    g34.c(this.f11634a[i22], (List) unsafe.getObject(obj, j8), i04Var, false);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 33:
                    g34.d(this.f11634a[i22], (List) unsafe.getObject(obj, j8), i04Var, false);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 34:
                    g34.e(this.f11634a[i22], (List) unsafe.getObject(obj, j8), i04Var, false);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 35:
                    i11 = this.f11634a[i22];
                    g34.B(i11, (List) unsafe.getObject(obj, j8), i04Var, z7);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 36:
                    i12 = this.f11634a[i22];
                    g34.F(i12, (List) unsafe.getObject(obj, j8), i04Var, z7);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 37:
                    i13 = this.f11634a[i22];
                    g34.a(i13, (List) unsafe.getObject(obj, j8), i04Var, z7);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 38:
                    i14 = this.f11634a[i22];
                    g34.g(i14, (List) unsafe.getObject(obj, j8), i04Var, z7);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 39:
                    i15 = this.f11634a[i22];
                    g34.G(i15, (List) unsafe.getObject(obj, j8), i04Var, z7);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 40:
                    i16 = this.f11634a[i22];
                    g34.E(i16, (List) unsafe.getObject(obj, j8), i04Var, z7);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 41:
                    i17 = this.f11634a[i22];
                    g34.D(i17, (List) unsafe.getObject(obj, j8), i04Var, z7);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 42:
                    i18 = this.f11634a[i22];
                    list = (List) unsafe.getObject(obj, j8);
                    g34.A(i18, list, i04Var, z7);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 43:
                    g34.f(this.f11634a[i22], (List) unsafe.getObject(obj, j8), i04Var, true);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 44:
                    g34.C(this.f11634a[i22], (List) unsafe.getObject(obj, j8), i04Var, true);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 45:
                    g34.b(this.f11634a[i22], (List) unsafe.getObject(obj, j8), i04Var, true);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 46:
                    g34.c(this.f11634a[i22], (List) unsafe.getObject(obj, j8), i04Var, true);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 47:
                    g34.d(this.f11634a[i22], (List) unsafe.getObject(obj, j8), i04Var, true);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 48:
                    g34.e(this.f11634a[i22], (List) unsafe.getObject(obj, j8), i04Var, true);
                    i22 += 3;
                    i20 = i8;
                    i21 = i9;
                    i19 = 1048575;
                    break;
                case 49:
                    int i33 = this.f11634a[i22];
                    List list5 = (List) unsafe.getObject(obj, j8);
                    e34 e34VarR2 = R(i22);
                    int i34 = g34.f8190d;
                    if (list5 != null && !list5.isEmpty()) {
                        for (int i35 = 0; i35 < list5.size(); i35++) {
                            i04Var.B(i33, list5.get(i35), e34VarR2);
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
                    if (B(obj, i23, i22)) {
                        dJ = H(obj, j8);
                        i04Var.q(i23, dJ);
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
                    if (B(obj, i23, i22)) {
                        fK = I(obj, j8);
                        i04Var.z(i23, fK);
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
                    if (B(obj, i23, i22)) {
                        jP = P(obj, j8);
                        i04Var.E(i23, jP);
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
                    if (B(obj, i23, i22)) {
                        jP2 = P(obj, j8);
                        i04Var.j(i23, jP2);
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
                    if (B(obj, i23, i22)) {
                        iJ = J(obj, j8);
                        i04Var.C(i23, iJ);
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
                    if (B(obj, i23, i22)) {
                        jP3 = P(obj, j8);
                        i04Var.x(i23, jP3);
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
                    if (B(obj, i23, i22)) {
                        iJ2 = J(obj, j8);
                        i04Var.v(i23, iJ2);
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
                    if (B(obj, i23, i22)) {
                        zH = C(obj, j8);
                        i04Var.m(i23, zH);
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
                    if (B(obj, i23, i22)) {
                        object = unsafe.getObject(obj, j8);
                        D(i23, object, i04Var);
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
                    if (B(obj, i23, i22)) {
                        object2 = unsafe.getObject(obj, j8);
                        i04Var.G(i23, object2, R(i22));
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
                    if (B(obj, i23, i22)) {
                        object3 = unsafe.getObject(obj, j8);
                        i04Var.o(i23, (rz3) object3);
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
                    if (B(obj, i23, i22)) {
                        iJ3 = J(obj, j8);
                        i04Var.h(i23, iJ3);
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
                    if (B(obj, i23, i22)) {
                        iJ4 = J(obj, j8);
                        i04Var.t(i23, iJ4);
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
                    if (B(obj, i23, i22)) {
                        iJ5 = J(obj, j8);
                        i04Var.H(i23, iJ5);
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
                    if (B(obj, i23, i22)) {
                        jP4 = P(obj, j8);
                        i04Var.J(i23, jP4);
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
                    if (B(obj, i23, i22)) {
                        iJ6 = J(obj, j8);
                        i04Var.a(i23, iJ6);
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
                    if (B(obj, i23, i22)) {
                        jP5 = P(obj, j8);
                        i04Var.c(i23, jP5);
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
                    if (B(obj, i23, i22)) {
                        object4 = unsafe.getObject(obj, j8);
                        i04Var.B(i23, object4, R(i22));
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
        v34 v34Var = this.f11645l;
        v34Var.r(v34Var.d(obj), i04Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x05af A[Catch: all -> 0x05a4, TryCatch #1 {all -> 0x05a4, blocks: (B:171:0x057d, B:185:0x05aa, B:187:0x05af, B:188:0x05b4), top: B:213:0x057d }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05e7 A[LOOP:2: B:203:0x05e3->B:205:0x05e7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05ba A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.e34
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.lang.Object r18, com.google.android.gms.internal.ads.v24 r19, com.google.android.gms.internal.ads.m04 r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n24.i(java.lang.Object, com.google.android.gms.internal.ads.v24, com.google.android.gms.internal.ads.m04):void");
    }

    @Override // com.google.android.gms.internal.ads.e34
    public final Object m() {
        return ((z04) this.f11638e).o();
    }
}
