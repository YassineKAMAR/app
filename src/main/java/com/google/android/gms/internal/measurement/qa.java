package com.google.android.gms.internal.measurement;

import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class qa<T> implements eb<T> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f19064r = new int[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Unsafe f19065s = jc.p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f19066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f19067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f19068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f19069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ma f19070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f19071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f19072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ab f19073h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f19074i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f19075j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f19076k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f19077l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ta f19078m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final u9 f19079n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final dc<?, ?> f19080o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final n8<?> f19081p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ja f19082q;

    private qa(int[] iArr, Object[] objArr, int i8, int i9, ma maVar, ab abVar, boolean z7, int[] iArr2, int i10, int i11, ta taVar, u9 u9Var, dc<?, ?> dcVar, n8<?> n8Var, ja jaVar) {
        this.f19066a = iArr;
        this.f19067b = objArr;
        this.f19068c = i8;
        this.f19069d = i9;
        this.f19072g = maVar instanceof y8;
        this.f19073h = abVar;
        this.f19071f = n8Var != null && n8Var.e(maVar);
        this.f19074i = false;
        this.f19075j = iArr2;
        this.f19076k = i10;
        this.f19077l = i11;
        this.f19078m = taVar;
        this.f19079n = u9Var;
        this.f19080o = dcVar;
        this.f19081p = n8Var;
        this.f19070e = maVar;
        this.f19082q = jaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean A(Object obj, int i8, eb ebVar) {
        return ebVar.d(jc.B(obj, i8 & 1048575));
    }

    private static <T> float B(T t7, long j8) {
        return ((Float) jc.B(t7, j8)).floatValue();
    }

    private final int C(int i8) {
        return this.f19066a[i8 + 2];
    }

    private final void D(T t7, int i8) {
        int iC = C(i8);
        long j8 = 1048575 & iC;
        if (j8 == 1048575) {
            return;
        }
        jc.h(t7, j8, (1 << (iC >>> 20)) | jc.t(t7, j8));
    }

    private final void E(T t7, int i8, int i9) {
        jc.h(t7, C(i9) & 1048575, i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void F(T t7, T t8, int i8) {
        int i9 = this.f19066a[i8];
        if (J(t8, i9, i8)) {
            long jG = G(i8) & 1048575;
            Unsafe unsafe = f19065s;
            Object object = unsafe.getObject(t8, jG);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f19066a[i8] + " is present but null: " + String.valueOf(t8));
            }
            eb ebVarN = N(i8);
            if (!J(t7, i9, i8)) {
                if (T(object)) {
                    Object objJ = ebVarN.j();
                    ebVarN.g(objJ, object);
                    unsafe.putObject(t7, jG, objJ);
                } else {
                    unsafe.putObject(t7, jG, object);
                }
                E(t7, i9, i8);
                return;
            }
            Object object2 = unsafe.getObject(t7, jG);
            if (!T(object2)) {
                Object objJ2 = ebVarN.j();
                ebVarN.g(objJ2, object2);
                unsafe.putObject(t7, jG, objJ2);
                object2 = objJ2;
            }
            ebVarN.g(object2, object);
        }
    }

    private final int G(int i8) {
        return this.f19066a[i8 + 1];
    }

    private static <T> int H(T t7, long j8) {
        return ((Integer) jc.B(t7, j8)).intValue();
    }

    private final boolean I(T t7, int i8) {
        int iC = C(i8);
        long j8 = iC & 1048575;
        if (j8 != 1048575) {
            return (jc.t(t7, j8) & (1 << (iC >>> 20))) != 0;
        }
        int iG = G(i8);
        long j9 = iG & 1048575;
        switch ((iG & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(jc.a(t7, j9)) != 0;
            case 1:
                return Float.floatToRawIntBits(jc.n(t7, j9)) != 0;
            case 2:
                return jc.x(t7, j9) != 0;
            case 3:
                return jc.x(t7, j9) != 0;
            case 4:
                return jc.t(t7, j9) != 0;
            case 5:
                return jc.x(t7, j9) != 0;
            case 6:
                return jc.t(t7, j9) != 0;
            case 7:
                return jc.F(t7, j9);
            case 8:
                Object objB = jc.B(t7, j9);
                if (objB instanceof String) {
                    return !((String) objB).isEmpty();
                }
                if (objB instanceof o7) {
                    return !o7.f19004b.equals(objB);
                }
                throw new IllegalArgumentException();
            case 9:
                return jc.B(t7, j9) != null;
            case R.styleable.GradientColor_android_endX /* 10 */:
                return !o7.f19004b.equals(jc.B(t7, j9));
            case R.styleable.GradientColor_android_endY /* 11 */:
                return jc.t(t7, j9) != 0;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                return jc.t(t7, j9) != 0;
            case 13:
                return jc.t(t7, j9) != 0;
            case 14:
                return jc.x(t7, j9) != 0;
            case 15:
                return jc.t(t7, j9) != 0;
            case com.amazon.c.a.a.c.f4052g /* 16 */:
                return jc.x(t7, j9) != 0;
            case 17:
                return jc.B(t7, j9) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean J(T t7, int i8, int i9) {
        return jc.t(t7, (long) (C(i9) & 1048575)) == i8;
    }

    private final boolean K(T t7, T t8, int i8) {
        return I(t7, i8) == I(t8, i8);
    }

    private static <T> long L(T t7, long j8) {
        return ((Long) jc.B(t7, j8)).longValue();
    }

    private final g9 M(int i8) {
        return (g9) this.f19067b[((i8 / 3) << 1) + 1];
    }

    private final eb N(int i8) {
        int i9 = (i8 / 3) << 1;
        eb ebVar = (eb) this.f19067b[i9];
        if (ebVar != null) {
            return ebVar;
        }
        eb<T> ebVarB = za.a().b((Class) this.f19067b[i9 + 1]);
        this.f19067b[i9] = ebVarB;
        return ebVarB;
    }

    private static bc O(Object obj) {
        y8 y8Var = (y8) obj;
        bc bcVar = y8Var.zzb;
        if (bcVar != bc.k()) {
            return bcVar;
        }
        bc bcVarL = bc.l();
        y8Var.zzb = bcVarL;
        return bcVarL;
    }

    private static <T> boolean P(T t7, long j8) {
        return ((Boolean) jc.B(t7, j8)).booleanValue();
    }

    private final Object Q(int i8) {
        return this.f19067b[(i8 / 3) << 1];
    }

    private static void R(Object obj) {
        if (T(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + String.valueOf(obj));
    }

    private static boolean S(int i8) {
        return (i8 & 536870912) != 0;
    }

    private static boolean T(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof y8) {
            return ((y8) obj).E();
        }
        return true;
    }

    private static <T> double i(T t7, long j8) {
        return ((Double) jc.B(t7, j8)).doubleValue();
    }

    private final int k(int i8) {
        if (i8 < this.f19068c || i8 > this.f19069d) {
            return -1;
        }
        return l(i8, 0);
    }

    private final int l(int i8, int i9) {
        int length = (this.f19066a.length / 3) - 1;
        while (i9 <= length) {
            int i10 = (length + i9) >>> 1;
            int i11 = i10 * 3;
            int i12 = this.f19066a[i11];
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

    /* JADX WARN: Removed duplicated region for block: B:124:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0275  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static <T> com.google.android.gms.internal.measurement.qa<T> n(java.lang.Class<T> r32, com.google.android.gms.internal.measurement.ka r33, com.google.android.gms.internal.measurement.ta r34, com.google.android.gms.internal.measurement.u9 r35, com.google.android.gms.internal.measurement.dc<?, ?> r36, com.google.android.gms.internal.measurement.n8<?> r37, com.google.android.gms.internal.measurement.ja r38) {
        /*
            Method dump skipped, instruction units count: 1021
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.qa.n(java.lang.Class, com.google.android.gms.internal.measurement.ka, com.google.android.gms.internal.measurement.ta, com.google.android.gms.internal.measurement.u9, com.google.android.gms.internal.measurement.dc, com.google.android.gms.internal.measurement.n8, com.google.android.gms.internal.measurement.ja):com.google.android.gms.internal.measurement.qa");
    }

    private final <K, V, UT, UB> UB o(int i8, int i9, Map<K, V> map, g9 g9Var, UB ub, dc<UT, UB> dcVar, Object obj) {
        this.f19082q.a(Q(i8));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!g9Var.b(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = dcVar.i(obj);
                }
                x7 x7VarA = o7.A(ea.a(null, next.getKey(), next.getValue()));
                try {
                    ea.b(x7VarA.b(), null, next.getKey(), next.getValue());
                    dcVar.c(ub, i9, x7VarA.a());
                    it.remove();
                } catch (IOException e8) {
                    throw new RuntimeException(e8);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object p(T t7, int i8) {
        eb ebVarN = N(i8);
        long jG = G(i8) & 1048575;
        if (!I(t7, i8)) {
            return ebVarN.j();
        }
        Object object = f19065s.getObject(t7, jG);
        if (T(object)) {
            return object;
        }
        Object objJ = ebVarN.j();
        if (object != null) {
            ebVarN.g(objJ, object);
        }
        return objJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object q(T t7, int i8, int i9) {
        eb ebVarN = N(i9);
        if (!J(t7, i8, i9)) {
            return ebVarN.j();
        }
        Object object = f19065s.getObject(t7, G(i9) & 1048575);
        if (T(object)) {
            return object;
        }
        Object objJ = ebVarN.j();
        if (object != null) {
            ebVarN.g(objJ, object);
        }
        return objJ;
    }

    private final <UT, UB> UB r(Object obj, int i8, UB ub, dc<UT, UB> dcVar, Object obj2) {
        g9 g9VarM;
        int i9 = this.f19066a[i8];
        Object objB = jc.B(obj, G(i8) & 1048575);
        return (objB == null || (g9VarM = M(i8)) == null) ? ub : (UB) o(i8, i9, this.f19082q.e(objB), g9VarM, ub, dcVar, obj2);
    }

    private static Field s(Class<?> cls, String str) {
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

    private static void t(int i8, Object obj, zc zcVar) {
        if (obj instanceof String) {
            zcVar.f(i8, (String) obj);
        } else {
            zcVar.A(i8, (o7) obj);
        }
    }

    private static <UT, UB> void u(dc<UT, UB> dcVar, T t7, zc zcVar) {
        dcVar.g(dcVar.k(t7), zcVar);
    }

    private final <K, V> void v(zc zcVar, int i8, Object obj, int i9) {
        if (obj != null) {
            this.f19082q.a(Q(i9));
            zcVar.D(i8, null, this.f19082q.d(obj));
        }
    }

    private final void w(T t7, int i8, int i9, Object obj) {
        f19065s.putObject(t7, G(i9) & 1048575, obj);
        E(t7, i8, i9);
    }

    private final void x(T t7, int i8, Object obj) {
        f19065s.putObject(t7, G(i8) & 1048575, obj);
        D(t7, i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void y(T t7, T t8, int i8) {
        if (I(t8, i8)) {
            long jG = G(i8) & 1048575;
            Unsafe unsafe = f19065s;
            Object object = unsafe.getObject(t8, jG);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f19066a[i8] + " is present but null: " + String.valueOf(t8));
            }
            eb ebVarN = N(i8);
            if (!I(t7, i8)) {
                if (T(object)) {
                    Object objJ = ebVarN.j();
                    ebVarN.g(objJ, object);
                    unsafe.putObject(t7, jG, objJ);
                } else {
                    unsafe.putObject(t7, jG, object);
                }
                D(t7, i8);
                return;
            }
            Object object2 = unsafe.getObject(t7, jG);
            if (!T(object2)) {
                Object objJ2 = ebVarN.j();
                ebVarN.g(objJ2, object2);
                unsafe.putObject(t7, jG, objJ2);
                object2 = objJ2;
            }
            ebVarN.g(object2, object);
        }
    }

    private final boolean z(T t7, int i8, int i9, int i10, int i11) {
        return i9 == 1048575 ? I(t7, i8) : (i10 & i11) != 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01d3, code lost:
    
        if (r0 > 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01e0, code lost:
    
        if (r0 > 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ed, code lost:
    
        if (r0 > 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01fa, code lost:
    
        if (r0 > 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0207, code lost:
    
        if (r0 > 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0214, code lost:
    
        if (r0 > 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0221, code lost:
    
        if (r0 > 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0223, code lost:
    
        r1 = (com.google.android.gms.internal.measurement.h8.w0(r13) + com.google.android.gms.internal.measurement.h8.z0(r0)) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x03ed, code lost:
    
        if (z(r19, r11, r14, r16, r17) != false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x03ef, code lost:
    
        r0 = com.google.android.gms.internal.measurement.h8.D(r13, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e1, code lost:
    
        if (J(r19, r13, r11) != false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0172, code lost:
    
        if (r0 > 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0180, code lost:
    
        if (r0 > 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x018e, code lost:
    
        if (r0 > 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019c, code lost:
    
        if (r0 > 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01aa, code lost:
    
        if (r0 > 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b8, code lost:
    
        if (r0 > 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01c6, code lost:
    
        if (r0 > 0) goto L119;
     */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0396 A[PHI: r0
  0x0396: PHI (r0v186 java.lang.Object) = (r0v43 java.lang.Object), (r0v49 java.lang.Object), (r0v181 java.lang.Object), (r0v190 java.lang.Object) binds: [B:173:0x03d4, B:164:0x0392, B:50:0x00d9, B:43:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03d7 A[PHI: r0
  0x03d7: PHI (r0v177 java.lang.Object) = (r0v43 java.lang.Object), (r0v181 java.lang.Object) binds: [B:173:0x03d4, B:50:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.measurement.eb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(T r19) {
        /*
            Method dump skipped, instruction units count: 1440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.qa.a(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2 A[PHI: r3
  0x00e2: PHI (r3v13 java.lang.Object) = (r3v11 java.lang.Object), (r3v14 java.lang.Object) binds: [B:67:0x00e0, B:62:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.measurement.eb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(T r9) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.qa.b(java.lang.Object):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    @Override // com.google.android.gms.internal.measurement.eb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(T r24, com.google.android.gms.internal.measurement.zc r25) {
        /*
            Method dump skipped, instruction units count: 3178
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.qa.c(java.lang.Object, com.google.android.gms.internal.measurement.zc):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac  */
    @Override // com.google.android.gms.internal.measurement.eb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(T r19) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.qa.d(java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.measurement.eb
    public final void e(T t7, byte[] bArr, int i8, int i9, n7 n7Var) throws k9 {
        m(t7, bArr, i8, i9, 0, n7Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
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
    @Override // com.google.android.gms.internal.measurement.eb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(T r8) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.qa.f(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // com.google.android.gms.internal.measurement.eb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(T r7, T r8) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.qa.g(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01b2  */
    @Override // com.google.android.gms.internal.measurement.eb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(T r10, T r11) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.qa.h(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.measurement.eb
    public final T j() {
        return (T) this.f19078m.a(this.f19070e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:195:0x0550, code lost:
    
        if (r1 == 0) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0552, code lost:
    
        r14.add(com.google.android.gms.internal.measurement.o7.f19004b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0558, code lost:
    
        r14.add(com.google.android.gms.internal.measurement.o7.u(r33, r0, r1));
        r0 = r0 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0560, code lost:
    
        if (r0 >= r12) goto L627;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0562, code lost:
    
        r1 = com.google.android.gms.internal.measurement.k7.p(r33, r0, r37);
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0568, code lost:
    
        if (r10 != r37.f18978a) goto L628;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x056a, code lost:
    
        r0 = com.google.android.gms.internal.measurement.k7.p(r33, r1, r37);
        r1 = r37.f18978a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0570, code lost:
    
        if (r1 < 0) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0574, code lost:
    
        if (r1 > (r33.length - r0)) goto L545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0576, code lost:
    
        if (r1 != 0) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x057d, code lost:
    
        throw com.google.android.gms.internal.measurement.k9.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0582, code lost:
    
        throw com.google.android.gms.internal.measurement.k9.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x06b0, code lost:
    
        if (r1.f18979b != 0) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x06b2, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x06b4, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x06b5, code lost:
    
        r14.e(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x06b8, code lost:
    
        if (r0 >= r3) goto L642;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x06ba, code lost:
    
        r8 = com.google.android.gms.internal.measurement.k7.p(r33, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x06c0, code lost:
    
        if (r5 != r1.f18978a) goto L643;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x06c2, code lost:
    
        r0 = com.google.android.gms.internal.measurement.k7.q(r33, r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x06ca, code lost:
    
        if (r1.f18979b == 0) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0b96, code lost:
    
        if (r14 == 1048575) goto L503;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0b98, code lost:
    
        r20.putInt(r7, r14, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0b9e, code lost:
    
        r10 = r31.f19076k;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x0ba5, code lost:
    
        if (r10 >= r31.f19077l) goto L618;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0ba7, code lost:
    
        r3 = (com.google.android.gms.internal.measurement.bc) r(r32, r31.f19075j[r10], r3, r31.f19080o, r32);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0bbd, code lost:
    
        if (r3 == null) goto L509;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0bbf, code lost:
    
        r31.f19080o.h(r7, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0bc6, code lost:
    
        if (r11 != 0) goto L515;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0bc8, code lost:
    
        if (r8 != r35) goto L513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0bcf, code lost:
    
        throw com.google.android.gms.internal.measurement.k9.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0bd0, code lost:
    
        if (r8 > r35) goto L518;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0bd2, code lost:
    
        if (r9 != r11) goto L518;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0bd4, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x0bd9, code lost:
    
        throw com.google.android.gms.internal.measurement.k9.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x0560, code lost:
    
        r14.add(com.google.android.gms.internal.measurement.o7.u(r33, r0, r1));
        r0 = r0 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x06b5, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0878 A[PHI: r7 r8 r9 r10 r11 r12 r13
  0x0878: PHI (r7v34 int) = (r7v11 int), (r7v12 int), (r7v13 int), (r7v19 int), (r7v35 int) binds: [B:375:0x0857, B:359:0x080c, B:342:0x07c5, B:268:0x066b, B:139:0x0437] A[DONT_GENERATE, DONT_INLINE]
  0x0878: PHI (r8v133 int) = (r8v84 int), (r8v85 int), (r8v86 int), (r8v114 int), (r8v134 int) binds: [B:375:0x0857, B:359:0x080c, B:342:0x07c5, B:268:0x066b, B:139:0x0437] A[DONT_GENERATE, DONT_INLINE]
  0x0878: PHI (r9v107 int) = (r9v79 int), (r9v80 int), (r9v81 int), (r9v91 int), (r9v108 int) binds: [B:375:0x0857, B:359:0x080c, B:342:0x07c5, B:268:0x066b, B:139:0x0437] A[DONT_GENERATE, DONT_INLINE]
  0x0878: PHI (r10v63 int) = (r10v29 int), (r10v29 int), (r10v29 int), (r10v52 int), (r10v29 int) binds: [B:375:0x0857, B:359:0x080c, B:342:0x07c5, B:268:0x066b, B:139:0x0437] A[DONT_GENERATE, DONT_INLINE]
  0x0878: PHI (r11v62 sun.misc.Unsafe) = 
  (r11v36 sun.misc.Unsafe)
  (r11v37 sun.misc.Unsafe)
  (r11v38 sun.misc.Unsafe)
  (r11v49 sun.misc.Unsafe)
  (r11v63 sun.misc.Unsafe)
 binds: [B:375:0x0857, B:359:0x080c, B:342:0x07c5, B:268:0x066b, B:139:0x0437] A[DONT_GENERATE, DONT_INLINE]
  0x0878: PHI (r12v83 com.google.android.gms.internal.measurement.n7) = 
  (r12v62 com.google.android.gms.internal.measurement.n7)
  (r12v63 com.google.android.gms.internal.measurement.n7)
  (r12v64 com.google.android.gms.internal.measurement.n7)
  (r12v67 com.google.android.gms.internal.measurement.n7)
  (r12v84 com.google.android.gms.internal.measurement.n7)
 binds: [B:375:0x0857, B:359:0x080c, B:342:0x07c5, B:268:0x066b, B:139:0x0437] A[DONT_GENERATE, DONT_INLINE]
  0x0878: PHI (r13v80 int) = (r13v63 int), (r13v64 int), (r13v65 int), (r13v71 int), (r13v81 int) binds: [B:375:0x0857, B:359:0x080c, B:342:0x07c5, B:268:0x066b, B:139:0x0437] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:558:0x088c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:561:0x0b7a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0b1c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:606:0x087b A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:205:0x0576 -> B:196:0x0552). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:235:0x05fa -> B:227:0x05d9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:255:0x0644 -> B:245:0x061b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:292:0x06ca -> B:285:0x06b2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int m(T r32, byte[] r33, int r34, int r35, int r36, com.google.android.gms.internal.measurement.n7 r37) throws com.google.android.gms.internal.measurement.k9 {
        /*
            Method dump skipped, instruction units count: 3182
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.qa.m(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.n7):int");
    }
}
