package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class ez3 {
    static int a(byte[] bArr, int i8, dz3 dz3Var) {
        int iH = h(bArr, i8, dz3Var);
        int i9 = dz3Var.f7070a;
        if (i9 < 0) {
            throw m14.f();
        }
        if (i9 > bArr.length - iH) {
            throw m14.j();
        }
        if (i9 == 0) {
            dz3Var.f7072c = rz3.f14393b;
            return iH;
        }
        dz3Var.f7072c = rz3.L(bArr, iH, i9);
        return iH + i9;
    }

    static int b(byte[] bArr, int i8) {
        int i9 = bArr[i8] & 255;
        int i10 = bArr[i8 + 1] & 255;
        int i11 = bArr[i8 + 2] & 255;
        return ((bArr[i8 + 3] & 255) << 24) | (i10 << 8) | i9 | (i11 << 16);
    }

    static int c(e34 e34Var, byte[] bArr, int i8, int i9, int i10, dz3 dz3Var) {
        Object objM = e34Var.m();
        int iL = l(objM, e34Var, bArr, i8, i9, i10, dz3Var);
        e34Var.c(objM);
        dz3Var.f7072c = objM;
        return iL;
    }

    static int d(e34 e34Var, byte[] bArr, int i8, int i9, dz3 dz3Var) {
        Object objM = e34Var.m();
        int iM = m(objM, e34Var, bArr, i8, i9, dz3Var);
        e34Var.c(objM);
        dz3Var.f7072c = objM;
        return iM;
    }

    static int e(e34 e34Var, int i8, byte[] bArr, int i9, int i10, j14 j14Var, dz3 dz3Var) {
        int iD = d(e34Var, bArr, i9, i10, dz3Var);
        while (true) {
            j14Var.add(dz3Var.f7072c);
            if (iD >= i10) {
                break;
            }
            int iH = h(bArr, iD, dz3Var);
            if (i8 != dz3Var.f7070a) {
                break;
            }
            iD = d(e34Var, bArr, iH, i10, dz3Var);
        }
        return iD;
    }

    static int f(byte[] bArr, int i8, j14 j14Var, dz3 dz3Var) {
        b14 b14Var = (b14) j14Var;
        int iH = h(bArr, i8, dz3Var);
        int i9 = dz3Var.f7070a + iH;
        while (iH < i9) {
            iH = h(bArr, iH, dz3Var);
            b14Var.S(dz3Var.f7070a);
        }
        if (iH == i9) {
            return iH;
        }
        throw m14.j();
    }

    static int g(int i8, byte[] bArr, int i9, int i10, w34 w34Var, dz3 dz3Var) {
        if ((i8 >>> 3) == 0) {
            throw m14.c();
        }
        int i11 = i8 & 7;
        if (i11 == 0) {
            int iK = k(bArr, i9, dz3Var);
            w34Var.j(i8, Long.valueOf(dz3Var.f7071b));
            return iK;
        }
        if (i11 == 1) {
            w34Var.j(i8, Long.valueOf(n(bArr, i9)));
            return i9 + 8;
        }
        if (i11 == 2) {
            int iH = h(bArr, i9, dz3Var);
            int i12 = dz3Var.f7070a;
            if (i12 < 0) {
                throw m14.f();
            }
            if (i12 > bArr.length - iH) {
                throw m14.j();
            }
            w34Var.j(i8, i12 == 0 ? rz3.f14393b : rz3.L(bArr, iH, i12));
            return iH + i12;
        }
        if (i11 != 3) {
            if (i11 != 5) {
                throw m14.c();
            }
            w34Var.j(i8, Integer.valueOf(b(bArr, i9)));
            return i9 + 4;
        }
        int i13 = (i8 & (-8)) | 4;
        w34 w34VarF = w34.f();
        int i14 = 0;
        while (true) {
            if (i9 >= i10) {
                break;
            }
            int iH2 = h(bArr, i9, dz3Var);
            int i15 = dz3Var.f7070a;
            i14 = i15;
            if (i15 == i13) {
                i9 = iH2;
                break;
            }
            int iG = g(i14, bArr, iH2, i10, w34VarF, dz3Var);
            i14 = i15;
            i9 = iG;
        }
        if (i9 > i10 || i14 != i13) {
            throw m14.g();
        }
        w34Var.j(i8, w34VarF);
        return i9;
    }

    static int h(byte[] bArr, int i8, dz3 dz3Var) {
        int i9 = i8 + 1;
        byte b8 = bArr[i8];
        if (b8 < 0) {
            return i(b8, bArr, i9, dz3Var);
        }
        dz3Var.f7070a = b8;
        return i9;
    }

    static int i(int i8, byte[] bArr, int i9, dz3 dz3Var) {
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
                                dz3Var.f7070a = i16;
                                return i17;
                            }
                            i15 = i17;
                        }
                    }
                }
            }
            dz3Var.f7070a = i14 | i10;
            return i15;
        }
        i11 = b8 << 7;
        dz3Var.f7070a = i13 | i11;
        return i12;
    }

    static int j(int i8, byte[] bArr, int i9, int i10, j14 j14Var, dz3 dz3Var) {
        b14 b14Var = (b14) j14Var;
        int iH = h(bArr, i9, dz3Var);
        while (true) {
            b14Var.S(dz3Var.f7070a);
            if (iH >= i10) {
                break;
            }
            int iH2 = h(bArr, iH, dz3Var);
            if (i8 != dz3Var.f7070a) {
                break;
            }
            iH = h(bArr, iH2, dz3Var);
        }
        return iH;
    }

    static int k(byte[] bArr, int i8, dz3 dz3Var) {
        long j8 = bArr[i8];
        int i9 = i8 + 1;
        if (j8 >= 0) {
            dz3Var.f7071b = j8;
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
        dz3Var.f7071b = j9;
        return i10;
    }

    static int l(Object obj, e34 e34Var, byte[] bArr, int i8, int i9, int i10, dz3 dz3Var) {
        int iE = ((n24) e34Var).E(obj, bArr, i8, i9, i10, dz3Var);
        dz3Var.f7072c = obj;
        return iE;
    }

    static int m(Object obj, e34 e34Var, byte[] bArr, int i8, int i9, dz3 dz3Var) {
        int i10 = i8 + 1;
        int i11 = bArr[i8];
        if (i11 < 0) {
            i10 = i(i11, bArr, i10, dz3Var);
            i11 = dz3Var.f7070a;
        }
        int i12 = i10;
        if (i11 < 0 || i11 > i9 - i12) {
            throw m14.j();
        }
        int i13 = i11 + i12;
        e34Var.g(obj, bArr, i12, i13, dz3Var);
        dz3Var.f7072c = obj;
        return i13;
    }

    static long n(byte[] bArr, int i8) {
        return (((long) bArr[i8]) & 255) | ((((long) bArr[i8 + 1]) & 255) << 8) | ((((long) bArr[i8 + 2]) & 255) << 16) | ((((long) bArr[i8 + 3]) & 255) << 24) | ((((long) bArr[i8 + 4]) & 255) << 32) | ((((long) bArr[i8 + 5]) & 255) << 40) | ((((long) bArr[i8 + 6]) & 255) << 48) | ((((long) bArr[i8 + 7]) & 255) << 56);
    }
}
