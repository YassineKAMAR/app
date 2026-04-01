package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
final class b0 {
    static int a(byte[] bArr, int i8, a0 a0Var) {
        int iH = h(bArr, i8, a0Var);
        int i9 = a0Var.f19464a;
        if (i9 < 0) {
            throw u1.d();
        }
        if (i9 > bArr.length - iH) {
            throw u1.g();
        }
        if (i9 == 0) {
            a0Var.f19466c = n0.f19633b;
            return iH;
        }
        a0Var.f19466c = n0.y(bArr, iH, i9);
        return iH + i9;
    }

    static int b(byte[] bArr, int i8) {
        int i9 = bArr[i8] & 255;
        int i10 = bArr[i8 + 1] & 255;
        int i11 = bArr[i8 + 2] & 255;
        return ((bArr[i8 + 3] & 255) << 24) | (i10 << 8) | i9 | (i11 << 16);
    }

    static int c(b3 b3Var, byte[] bArr, int i8, int i9, int i10, a0 a0Var) {
        Object objM = b3Var.m();
        int iL = l(objM, b3Var, bArr, i8, i9, i10, a0Var);
        b3Var.c(objM);
        a0Var.f19466c = objM;
        return iL;
    }

    static int d(b3 b3Var, byte[] bArr, int i8, int i9, a0 a0Var) {
        Object objM = b3Var.m();
        int iM = m(objM, b3Var, bArr, i8, i9, a0Var);
        b3Var.c(objM);
        a0Var.f19466c = objM;
        return iM;
    }

    static int e(b3 b3Var, int i8, byte[] bArr, int i9, int i10, r1 r1Var, a0 a0Var) {
        int iD = d(b3Var, bArr, i9, i10, a0Var);
        while (true) {
            r1Var.add(a0Var.f19466c);
            if (iD >= i10) {
                break;
            }
            int iH = h(bArr, iD, a0Var);
            if (i8 != a0Var.f19464a) {
                break;
            }
            iD = d(b3Var, bArr, iH, i10, a0Var);
        }
        return iD;
    }

    static int f(byte[] bArr, int i8, r1 r1Var, a0 a0Var) {
        o1 o1Var = (o1) r1Var;
        int iH = h(bArr, i8, a0Var);
        int i9 = a0Var.f19464a + iH;
        while (iH < i9) {
            iH = h(bArr, iH, a0Var);
            o1Var.g(a0Var.f19464a);
        }
        if (iH == i9) {
            return iH;
        }
        throw u1.g();
    }

    static int g(int i8, byte[] bArr, int i9, int i10, u3 u3Var, a0 a0Var) {
        if ((i8 >>> 3) == 0) {
            throw u1.b();
        }
        int i11 = i8 & 7;
        if (i11 == 0) {
            int iK = k(bArr, i9, a0Var);
            u3Var.j(i8, Long.valueOf(a0Var.f19465b));
            return iK;
        }
        if (i11 == 1) {
            u3Var.j(i8, Long.valueOf(n(bArr, i9)));
            return i9 + 8;
        }
        if (i11 == 2) {
            int iH = h(bArr, i9, a0Var);
            int i12 = a0Var.f19464a;
            if (i12 < 0) {
                throw u1.d();
            }
            if (i12 > bArr.length - iH) {
                throw u1.g();
            }
            u3Var.j(i8, i12 == 0 ? n0.f19633b : n0.y(bArr, iH, i12));
            return iH + i12;
        }
        if (i11 != 3) {
            if (i11 != 5) {
                throw u1.b();
            }
            u3Var.j(i8, Integer.valueOf(b(bArr, i9)));
            return i9 + 4;
        }
        int i13 = (i8 & (-8)) | 4;
        u3 u3VarF = u3.f();
        int i14 = 0;
        while (true) {
            if (i9 >= i10) {
                break;
            }
            int iH2 = h(bArr, i9, a0Var);
            int i15 = a0Var.f19464a;
            i14 = i15;
            if (i15 == i13) {
                i9 = iH2;
                break;
            }
            int iG = g(i14, bArr, iH2, i10, u3VarF, a0Var);
            i14 = i15;
            i9 = iG;
        }
        if (i9 > i10 || i14 != i13) {
            throw u1.e();
        }
        u3Var.j(i8, u3VarF);
        return i9;
    }

    static int h(byte[] bArr, int i8, a0 a0Var) {
        int i9 = i8 + 1;
        byte b8 = bArr[i8];
        if (b8 < 0) {
            return i(b8, bArr, i9, a0Var);
        }
        a0Var.f19464a = b8;
        return i9;
    }

    static int i(int i8, byte[] bArr, int i9, a0 a0Var) {
        int i10;
        int i11;
        byte b8 = bArr[i9];
        int i12 = i9 + 1;
        int i13 = i8 & 127;
        if (b8 < 0) {
            int i14 = i13 | ((b8 & 127) << 7);
            int i15 = i12 + 1;
            byte b9 = bArr[i12];
            if (b9 >= 0) {
                i10 = b9 << 14;
            } else {
                i13 = i14 | ((b9 & 127) << 14);
                i12 = i15 + 1;
                byte b10 = bArr[i15];
                if (b10 >= 0) {
                    i11 = b10 << 21;
                } else {
                    i14 = i13 | ((b10 & 127) << 21);
                    i15 = i12 + 1;
                    byte b11 = bArr[i12];
                    if (b11 >= 0) {
                        i10 = b11 << 28;
                    } else {
                        int i16 = i14 | ((b11 & 127) << 28);
                        while (true) {
                            int i17 = i15 + 1;
                            if (bArr[i15] >= 0) {
                                a0Var.f19464a = i16;
                                return i17;
                            }
                            i15 = i17;
                        }
                    }
                }
            }
            a0Var.f19464a = i14 | i10;
            return i15;
        }
        i11 = b8 << 7;
        a0Var.f19464a = i13 | i11;
        return i12;
    }

    static int j(int i8, byte[] bArr, int i9, int i10, r1 r1Var, a0 a0Var) {
        o1 o1Var = (o1) r1Var;
        int iH = h(bArr, i9, a0Var);
        while (true) {
            o1Var.g(a0Var.f19464a);
            if (iH >= i10) {
                break;
            }
            int iH2 = h(bArr, iH, a0Var);
            if (i8 != a0Var.f19464a) {
                break;
            }
            iH = h(bArr, iH2, a0Var);
        }
        return iH;
    }

    static int k(byte[] bArr, int i8, a0 a0Var) {
        long j8 = bArr[i8];
        int i9 = i8 + 1;
        if (j8 >= 0) {
            a0Var.f19465b = j8;
            return i9;
        }
        int i10 = i9 + 1;
        byte b8 = bArr[i9];
        long j9 = (j8 & 127) | (((long) (b8 & 127)) << 7);
        int i11 = 7;
        while (b8 < 0) {
            int i12 = i10 + 1;
            byte b9 = bArr[i10];
            i11 += 7;
            j9 |= ((long) (b9 & 127)) << i11;
            i10 = i12;
            b8 = b9;
        }
        a0Var.f19465b = j9;
        return i10;
    }

    static int l(Object obj, b3 b3Var, byte[] bArr, int i8, int i9, int i10, a0 a0Var) {
        int iY = ((u2) b3Var).y(obj, bArr, i8, i9, i10, a0Var);
        a0Var.f19466c = obj;
        return iY;
    }

    static int m(Object obj, b3 b3Var, byte[] bArr, int i8, int i9, a0 a0Var) {
        int i10 = i8 + 1;
        int i11 = bArr[i8];
        if (i11 < 0) {
            i10 = i(i11, bArr, i10, a0Var);
            i11 = a0Var.f19464a;
        }
        int i12 = i10;
        if (i11 < 0 || i11 > i9 - i12) {
            throw u1.g();
        }
        int i13 = i11 + i12;
        b3Var.h(obj, bArr, i12, i13, a0Var);
        a0Var.f19466c = obj;
        return i13;
    }

    static long n(byte[] bArr, int i8) {
        return (((long) bArr[i8]) & 255) | ((((long) bArr[i8 + 1]) & 255) << 8) | ((((long) bArr[i8 + 2]) & 255) << 16) | ((((long) bArr[i8 + 3]) & 255) << 24) | ((((long) bArr[i8 + 4]) & 255) << 32) | ((((long) bArr[i8 + 5]) & 255) << 40) | ((((long) bArr[i8 + 6]) & 255) << 48) | ((((long) bArr[i8 + 7]) & 255) << 56);
    }
}
