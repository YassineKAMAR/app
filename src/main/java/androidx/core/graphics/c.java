package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c {

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f2012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f2013b;

        a() {
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public char f2014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float[] f2015b;

        b(char c8, float[] fArr) {
            this.f2014a = c8;
            this.f2015b = fArr;
        }

        b(b bVar) {
            this.f2014a = bVar.f2014a;
            float[] fArr = bVar.f2015b;
            this.f2015b = c.c(fArr, 0, fArr.length);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private static void a(Path path, float[] fArr, char c8, char c9, float[] fArr2) {
            int i8;
            int i9;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            char c10 = c9;
            float f16 = fArr[0];
            float f17 = fArr[1];
            float f18 = fArr[2];
            float f19 = fArr[3];
            float f20 = fArr[4];
            float f21 = fArr[5];
            switch (c10) {
                case 'A':
                case ModuleDescriptor.MODULE_VERSION /* 97 */:
                    i8 = 7;
                    break;
                case 'C':
                case 'c':
                    i8 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i8 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i8 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i8 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f20, f21);
                    f16 = f20;
                    f18 = f16;
                    f17 = f21;
                    f19 = f17;
                    i8 = 2;
                    break;
            }
            float f22 = f16;
            float f23 = f17;
            float f24 = f20;
            float f25 = f21;
            int i10 = 0;
            char c11 = c8;
            while (i10 < fArr2.length) {
                if (c10 != 'A') {
                    if (c10 == 'C') {
                        i9 = i10;
                        int i11 = i9 + 2;
                        int i12 = i9 + 3;
                        int i13 = i9 + 4;
                        int i14 = i9 + 5;
                        path.cubicTo(fArr2[i9 + 0], fArr2[i9 + 1], fArr2[i11], fArr2[i12], fArr2[i13], fArr2[i14]);
                        f22 = fArr2[i13];
                        float f26 = fArr2[i14];
                        float f27 = fArr2[i11];
                        float f28 = fArr2[i12];
                        f23 = f26;
                        f19 = f28;
                        f18 = f27;
                    } else if (c10 == 'H') {
                        i9 = i10;
                        int i15 = i9 + 0;
                        path.lineTo(fArr2[i15], f23);
                        f22 = fArr2[i15];
                    } else if (c10 == 'Q') {
                        i9 = i10;
                        int i16 = i9 + 0;
                        int i17 = i9 + 1;
                        int i18 = i9 + 2;
                        int i19 = i9 + 3;
                        path.quadTo(fArr2[i16], fArr2[i17], fArr2[i18], fArr2[i19]);
                        float f29 = fArr2[i16];
                        float f30 = fArr2[i17];
                        f22 = fArr2[i18];
                        f23 = fArr2[i19];
                        f18 = f29;
                        f19 = f30;
                    } else if (c10 == 'V') {
                        i9 = i10;
                        int i20 = i9 + 0;
                        path.lineTo(f22, fArr2[i20]);
                        f23 = fArr2[i20];
                    } else if (c10 != 'a') {
                        if (c10 != 'c') {
                            if (c10 == 'h') {
                                int i21 = i10 + 0;
                                path.rLineTo(fArr2[i21], 0.0f);
                                f22 += fArr2[i21];
                            } else if (c10 != 'q') {
                                if (c10 == 'v') {
                                    int i22 = i10 + 0;
                                    path.rLineTo(0.0f, fArr2[i22]);
                                    f11 = fArr2[i22];
                                } else if (c10 == 'L') {
                                    int i23 = i10 + 0;
                                    int i24 = i10 + 1;
                                    path.lineTo(fArr2[i23], fArr2[i24]);
                                    f22 = fArr2[i23];
                                    f23 = fArr2[i24];
                                } else if (c10 == 'M') {
                                    f22 = fArr2[i10 + 0];
                                    f23 = fArr2[i10 + 1];
                                    if (i10 > 0) {
                                        path.lineTo(f22, f23);
                                    } else {
                                        path.moveTo(f22, f23);
                                        i9 = i10;
                                        f25 = f23;
                                        f24 = f22;
                                    }
                                } else if (c10 == 'S') {
                                    if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                        f22 = (f22 * 2.0f) - f18;
                                        f23 = (f23 * 2.0f) - f19;
                                    }
                                    float f31 = f23;
                                    int i25 = i10 + 0;
                                    int i26 = i10 + 1;
                                    int i27 = i10 + 2;
                                    int i28 = i10 + 3;
                                    path.cubicTo(f22, f31, fArr2[i25], fArr2[i26], fArr2[i27], fArr2[i28]);
                                    f8 = fArr2[i25];
                                    f9 = fArr2[i26];
                                    f22 = fArr2[i27];
                                    f23 = fArr2[i28];
                                    f18 = f8;
                                    f19 = f9;
                                } else if (c10 == 'T') {
                                    if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                        f22 = (f22 * 2.0f) - f18;
                                        f23 = (f23 * 2.0f) - f19;
                                    }
                                    int i29 = i10 + 0;
                                    int i30 = i10 + 1;
                                    path.quadTo(f22, f23, fArr2[i29], fArr2[i30]);
                                    float f32 = fArr2[i29];
                                    float f33 = fArr2[i30];
                                    i9 = i10;
                                    f19 = f23;
                                    f18 = f22;
                                    f22 = f32;
                                    f23 = f33;
                                } else if (c10 == 'l') {
                                    int i31 = i10 + 0;
                                    int i32 = i10 + 1;
                                    path.rLineTo(fArr2[i31], fArr2[i32]);
                                    f22 += fArr2[i31];
                                    f11 = fArr2[i32];
                                } else if (c10 == 'm') {
                                    float f34 = fArr2[i10 + 0];
                                    f22 += f34;
                                    float f35 = fArr2[i10 + 1];
                                    f23 += f35;
                                    if (i10 > 0) {
                                        path.rLineTo(f34, f35);
                                    } else {
                                        path.rMoveTo(f34, f35);
                                        i9 = i10;
                                        f25 = f23;
                                        f24 = f22;
                                    }
                                } else if (c10 == 's') {
                                    if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                        float f36 = f22 - f18;
                                        f12 = f23 - f19;
                                        f13 = f36;
                                    } else {
                                        f13 = 0.0f;
                                        f12 = 0.0f;
                                    }
                                    int i33 = i10 + 0;
                                    int i34 = i10 + 1;
                                    int i35 = i10 + 2;
                                    int i36 = i10 + 3;
                                    path.rCubicTo(f13, f12, fArr2[i33], fArr2[i34], fArr2[i35], fArr2[i36]);
                                    f8 = fArr2[i33] + f22;
                                    f9 = fArr2[i34] + f23;
                                    f22 += fArr2[i35];
                                    f10 = fArr2[i36];
                                } else if (c10 == 't') {
                                    if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                        f14 = f22 - f18;
                                        f15 = f23 - f19;
                                    } else {
                                        f15 = 0.0f;
                                        f14 = 0.0f;
                                    }
                                    int i37 = i10 + 0;
                                    int i38 = i10 + 1;
                                    path.rQuadTo(f14, f15, fArr2[i37], fArr2[i38]);
                                    float f37 = f14 + f22;
                                    float f38 = f15 + f23;
                                    f22 += fArr2[i37];
                                    f23 += fArr2[i38];
                                    f19 = f38;
                                    f18 = f37;
                                }
                                f23 += f11;
                            } else {
                                int i39 = i10 + 0;
                                int i40 = i10 + 1;
                                int i41 = i10 + 2;
                                int i42 = i10 + 3;
                                path.rQuadTo(fArr2[i39], fArr2[i40], fArr2[i41], fArr2[i42]);
                                f8 = fArr2[i39] + f22;
                                f9 = fArr2[i40] + f23;
                                f22 += fArr2[i41];
                                f10 = fArr2[i42];
                            }
                            i9 = i10;
                        } else {
                            int i43 = i10 + 2;
                            int i44 = i10 + 3;
                            int i45 = i10 + 4;
                            int i46 = i10 + 5;
                            path.rCubicTo(fArr2[i10 + 0], fArr2[i10 + 1], fArr2[i43], fArr2[i44], fArr2[i45], fArr2[i46]);
                            f8 = fArr2[i43] + f22;
                            f9 = fArr2[i44] + f23;
                            f22 += fArr2[i45];
                            f10 = fArr2[i46];
                        }
                        f23 += f10;
                        f18 = f8;
                        f19 = f9;
                        i9 = i10;
                    } else {
                        int i47 = i10 + 5;
                        int i48 = i10 + 6;
                        i9 = i10;
                        c(path, f22, f23, fArr2[i47] + f22, fArr2[i48] + f23, fArr2[i10 + 0], fArr2[i10 + 1], fArr2[i10 + 2], fArr2[i10 + 3] != 0.0f, fArr2[i10 + 4] != 0.0f);
                        f22 += fArr2[i47];
                        f23 += fArr2[i48];
                    }
                    i10 = i9 + i8;
                    c11 = c9;
                    c10 = c11;
                } else {
                    i9 = i10;
                    int i49 = i9 + 5;
                    int i50 = i9 + 6;
                    c(path, f22, f23, fArr2[i49], fArr2[i50], fArr2[i9 + 0], fArr2[i9 + 1], fArr2[i9 + 2], fArr2[i9 + 3] != 0.0f, fArr2[i9 + 4] != 0.0f);
                    f22 = fArr2[i49];
                    f23 = fArr2[i50];
                }
                f19 = f23;
                f18 = f22;
                i10 = i9 + i8;
                c11 = c9;
                c10 = c11;
            }
            fArr[0] = f22;
            fArr[1] = f23;
            fArr[2] = f18;
            fArr[3] = f19;
            fArr[4] = f24;
            fArr[5] = f25;
        }

        private static void b(Path path, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
            double d17 = d10;
            int iCeil = (int) Math.ceil(Math.abs((d16 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d14);
            double dSin = Math.sin(d14);
            double dCos2 = Math.cos(d15);
            double dSin2 = Math.sin(d15);
            double d18 = -d17;
            double d19 = d18 * dCos;
            double d20 = d11 * dSin;
            double d21 = (d19 * dSin2) - (d20 * dCos2);
            double d22 = d18 * dSin;
            double d23 = d11 * dCos;
            double d24 = (dSin2 * d22) + (dCos2 * d23);
            double d25 = d16 / ((double) iCeil);
            double d26 = d15;
            double d27 = d24;
            double d28 = d21;
            int i8 = 0;
            double d29 = d12;
            double d30 = d13;
            while (i8 < iCeil) {
                double d31 = d26 + d25;
                double dSin3 = Math.sin(d31);
                double dCos3 = Math.cos(d31);
                double d32 = (d8 + ((d17 * dCos) * dCos3)) - (d20 * dSin3);
                double d33 = d9 + (d17 * dSin * dCos3) + (d23 * dSin3);
                double d34 = (d19 * dSin3) - (d20 * dCos3);
                double d35 = (dSin3 * d22) + (dCos3 * d23);
                double d36 = d31 - d26;
                double dTan = Math.tan(d36 / 2.0d);
                double dSin4 = (Math.sin(d36) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                double d37 = d29 + (d28 * dSin4);
                double d38 = dCos;
                double d39 = dSin;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d37, (float) (d30 + (d27 * dSin4)), (float) (d32 - (dSin4 * d34)), (float) (d33 - (dSin4 * d35)), (float) d32, (float) d33);
                i8++;
                d25 = d25;
                dSin = d39;
                d29 = d32;
                d22 = d22;
                dCos = d38;
                d26 = d31;
                d27 = d35;
                d28 = d34;
                iCeil = iCeil;
                d30 = d33;
                d17 = d10;
            }
        }

        private static void c(Path path, float f8, float f9, float f10, float f11, float f12, float f13, float f14, boolean z7, boolean z8) {
            double d8;
            double d9;
            double radians = Math.toRadians(f14);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d10 = f8;
            double d11 = d10 * dCos;
            double d12 = f9;
            double d13 = f12;
            double d14 = (d11 + (d12 * dSin)) / d13;
            double d15 = (((double) (-f8)) * dSin) + (d12 * dCos);
            double d16 = f13;
            double d17 = d15 / d16;
            double d18 = f11;
            double d19 = ((((double) f10) * dCos) + (d18 * dSin)) / d13;
            double d20 = ((((double) (-f10)) * dSin) + (d18 * dCos)) / d16;
            double d21 = d14 - d19;
            double d22 = d17 - d20;
            double d23 = (d14 + d19) / 2.0d;
            double d24 = (d17 + d20) / 2.0d;
            double d25 = (d21 * d21) + (d22 * d22);
            if (d25 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d26 = (1.0d / d25) - 0.25d;
            if (d26 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d25);
                float fSqrt = (float) (Math.sqrt(d25) / 1.99999d);
                c(path, f8, f9, f10, f11, f12 * fSqrt, f13 * fSqrt, f14, z7, z8);
                return;
            }
            double dSqrt = Math.sqrt(d26);
            double d27 = d21 * dSqrt;
            double d28 = dSqrt * d22;
            if (z7 == z8) {
                d8 = d23 - d28;
                d9 = d24 + d27;
            } else {
                d8 = d23 + d28;
                d9 = d24 - d27;
            }
            double dAtan2 = Math.atan2(d17 - d9, d14 - d8);
            double dAtan22 = Math.atan2(d20 - d9, d19 - d8) - dAtan2;
            if (z8 != (dAtan22 >= 0.0d)) {
                dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
            }
            double d29 = d8 * d13;
            double d30 = d9 * d16;
            b(path, (d29 * dCos) - (d30 * dSin), (d29 * dSin) + (d30 * dCos), d13, d16, d10, d12, radians, dAtan2, dAtan22);
        }

        public static void e(b[] bVarArr, Path path) {
            float[] fArr = new float[6];
            char c8 = 'm';
            for (int i8 = 0; i8 < bVarArr.length; i8++) {
                b bVar = bVarArr[i8];
                a(path, fArr, c8, bVar.f2014a, bVar.f2015b);
                c8 = bVarArr[i8].f2014a;
            }
        }

        public void d(b bVar, b bVar2, float f8) {
            this.f2014a = bVar.f2014a;
            int i8 = 0;
            while (true) {
                float[] fArr = bVar.f2015b;
                if (i8 >= fArr.length) {
                    return;
                }
                this.f2015b[i8] = (fArr[i8] * (1.0f - f8)) + (bVar2.f2015b[i8] * f8);
                i8++;
            }
        }
    }

    private static void a(ArrayList<b> arrayList, char c8, float[] fArr) {
        arrayList.add(new b(c8, fArr));
    }

    public static boolean b(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i8 = 0; i8 < bVarArr.length; i8++) {
            b bVar = bVarArr[i8];
            char c8 = bVar.f2014a;
            b bVar2 = bVarArr2[i8];
            if (c8 != bVar2.f2014a || bVar.f2015b.length != bVar2.f2015b.length) {
                return false;
            }
        }
        return true;
    }

    static float[] c(float[] fArr, int i8, int i9) {
        if (i8 > i9) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i8 < 0 || i8 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i10 = i9 - i8;
        int iMin = Math.min(i10, length - i8);
        float[] fArr2 = new float[i10];
        System.arraycopy(fArr, i8, fArr2, 0, iMin);
        return fArr2;
    }

    public static b[] d(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i8 = 1;
        int i9 = 0;
        while (i8 < str.length()) {
            int i10 = i(str, i8);
            String strTrim = str.substring(i9, i10).trim();
            if (strTrim.length() > 0) {
                a(arrayList, strTrim.charAt(0), h(strTrim));
            }
            i9 = i10;
            i8 = i10 + 1;
        }
        if (i8 - i9 == 1 && i9 < str.length()) {
            a(arrayList, str.charAt(i9), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[arrayList.size()]);
    }

    public static Path e(String str) {
        Path path = new Path();
        b[] bVarArrD = d(str);
        if (bVarArrD == null) {
            return null;
        }
        try {
            b.e(bVarArrD, path);
            return path;
        } catch (RuntimeException e8) {
            throw new RuntimeException("Error in parsing " + str, e8);
        }
    }

    public static b[] f(b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i8 = 0; i8 < bVarArr.length; i8++) {
            bVarArr2[i8] = new b(bVarArr[i8]);
        }
        return bVarArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r2 == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038 A[LOOP:0: B:3:0x0007->B:24:0x0038, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(java.lang.String r8, int r9, androidx.core.graphics.c.a r10) {
        /*
            r0 = 0
            r10.f2013b = r0
            r1 = r9
            r2 = 0
            r3 = 0
            r4 = 0
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3b
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L33
            r6 = 69
            if (r5 == r6) goto L31
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L31
            switch(r5) {
                case 44: goto L33;
                case 45: goto L2a;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L2f
        L22:
            if (r3 != 0) goto L27
            r2 = 0
            r3 = 1
            goto L35
        L27:
            r10.f2013b = r7
            goto L33
        L2a:
            if (r1 == r9) goto L2f
            if (r2 != 0) goto L2f
            goto L27
        L2f:
            r2 = 0
            goto L35
        L31:
            r2 = 1
            goto L35
        L33:
            r2 = 0
            r4 = 1
        L35:
            if (r4 == 0) goto L38
            goto L3b
        L38:
            int r1 = r1 + 1
            goto L7
        L3b:
            r10.f2012a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.c.g(java.lang.String, int, androidx.core.graphics.c$a):void");
    }

    private static float[] h(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i8 = 1;
            int i9 = 0;
            while (i8 < length) {
                g(str, i8, aVar);
                int i10 = aVar.f2012a;
                if (i8 < i10) {
                    fArr[i9] = Float.parseFloat(str.substring(i8, i10));
                    i9++;
                }
                i8 = aVar.f2013b ? i10 : i10 + 1;
            }
            return c(fArr, 0, i9);
        } catch (NumberFormatException e8) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e8);
        }
    }

    private static int i(String str, int i8) {
        while (i8 < str.length()) {
            char cCharAt = str.charAt(i8);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                return i8;
            }
            i8++;
        }
        return i8;
    }

    public static void j(b[] bVarArr, b[] bVarArr2) {
        for (int i8 = 0; i8 < bVarArr2.length; i8++) {
            bVarArr[i8].f2014a = bVarArr2[i8].f2014a;
            int i9 = 0;
            while (true) {
                float[] fArr = bVarArr2[i8].f2015b;
                if (i9 < fArr.length) {
                    bVarArr[i8].f2015b[i9] = fArr[i9];
                    i9++;
                }
            }
        }
    }
}
