package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class k7 {
    static double a(byte[] bArr, int i8) {
        return Double.longBitsToDouble(r(bArr, i8));
    }

    static int b(int i8, byte[] bArr, int i9, int i10, n7 n7Var) {
        if ((i8 >>> 3) == 0) {
            throw k9.b();
        }
        int i11 = i8 & 7;
        if (i11 == 0) {
            return q(bArr, i9, n7Var);
        }
        if (i11 == 1) {
            return i9 + 8;
        }
        if (i11 == 2) {
            return p(bArr, i9, n7Var) + n7Var.f18978a;
        }
        if (i11 != 3) {
            if (i11 == 5) {
                return i9 + 4;
            }
            throw k9.b();
        }
        int i12 = (i8 & (-8)) | 4;
        int i13 = 0;
        while (i9 < i10) {
            i9 = p(bArr, i9, n7Var);
            i13 = n7Var.f18978a;
            if (i13 == i12) {
                break;
            }
            i9 = b(i13, bArr, i9, i10, n7Var);
        }
        if (i9 > i10 || i13 != i12) {
            throw k9.e();
        }
        return i9;
    }

    static int c(int i8, byte[] bArr, int i9, int i10, h9<?> h9Var, n7 n7Var) {
        c9 c9Var = (c9) h9Var;
        int iP = p(bArr, i9, n7Var);
        while (true) {
            c9Var.i(n7Var.f18978a);
            if (iP >= i10) {
                break;
            }
            int iP2 = p(bArr, iP, n7Var);
            if (i8 != n7Var.f18978a) {
                break;
            }
            iP = p(bArr, iP2, n7Var);
        }
        return iP;
    }

    static int d(int i8, byte[] bArr, int i9, int i10, bc bcVar, n7 n7Var) {
        if ((i8 >>> 3) == 0) {
            throw k9.b();
        }
        int i11 = i8 & 7;
        if (i11 == 0) {
            int iQ = q(bArr, i9, n7Var);
            bcVar.e(i8, Long.valueOf(n7Var.f18979b));
            return iQ;
        }
        if (i11 == 1) {
            bcVar.e(i8, Long.valueOf(r(bArr, i9)));
            return i9 + 8;
        }
        if (i11 == 2) {
            int iP = p(bArr, i9, n7Var);
            int i12 = n7Var.f18978a;
            if (i12 < 0) {
                throw k9.d();
            }
            if (i12 > bArr.length - iP) {
                throw k9.f();
            }
            bcVar.e(i8, i12 == 0 ? o7.f19004b : o7.u(bArr, iP, i12));
            return iP + i12;
        }
        if (i11 != 3) {
            if (i11 != 5) {
                throw k9.b();
            }
            bcVar.e(i8, Integer.valueOf(o(bArr, i9)));
            return i9 + 4;
        }
        bc bcVarL = bc.l();
        int i13 = (i8 & (-8)) | 4;
        int i14 = 0;
        while (true) {
            if (i9 >= i10) {
                break;
            }
            int iP2 = p(bArr, i9, n7Var);
            int i15 = n7Var.f18978a;
            i14 = i15;
            if (i15 == i13) {
                i9 = iP2;
                break;
            }
            int iD = d(i14, bArr, iP2, i10, bcVarL, n7Var);
            i14 = i15;
            i9 = iD;
        }
        if (i9 > i10 || i14 != i13) {
            throw k9.e();
        }
        bcVar.e(i8, bcVarL);
        return i9;
    }

    static int e(int i8, byte[] bArr, int i9, n7 n7Var) {
        int i10;
        int i11;
        int i12 = i8 & 127;
        int i13 = i9 + 1;
        byte b8 = bArr[i9];
        if (b8 < 0) {
            int i14 = i12 | ((b8 & 127) << 7);
            int i15 = i13 + 1;
            byte b9 = bArr[i13];
            if (b9 >= 0) {
                i10 = b9 << 14;
            } else {
                i12 = i14 | ((b9 & 127) << 14);
                i13 = i15 + 1;
                byte b10 = bArr[i15];
                if (b10 >= 0) {
                    i11 = b10 << 21;
                } else {
                    i14 = i12 | ((b10 & 127) << 21);
                    i15 = i13 + 1;
                    byte b11 = bArr[i13];
                    if (b11 >= 0) {
                        i10 = b11 << 28;
                    } else {
                        int i16 = i14 | ((b11 & 127) << 28);
                        while (true) {
                            int i17 = i15 + 1;
                            if (bArr[i15] >= 0) {
                                n7Var.f18978a = i16;
                                return i17;
                            }
                            i15 = i17;
                        }
                    }
                }
            }
            n7Var.f18978a = i14 | i10;
            return i15;
        }
        i11 = b8 << 7;
        n7Var.f18978a = i12 | i11;
        return i13;
    }

    static int f(eb<?> ebVar, int i8, byte[] bArr, int i9, int i10, h9<?> h9Var, n7 n7Var) {
        int iH = h(ebVar, bArr, i9, i10, n7Var);
        while (true) {
            h9Var.add(n7Var.f18980c);
            if (iH >= i10) {
                break;
            }
            int iP = p(bArr, iH, n7Var);
            if (i8 != n7Var.f18978a) {
                break;
            }
            iH = h(ebVar, bArr, iP, i10, n7Var);
        }
        return iH;
    }

    static int g(eb ebVar, byte[] bArr, int i8, int i9, int i10, n7 n7Var) {
        Object objJ = ebVar.j();
        int i11 = i(objJ, ebVar, bArr, i8, i9, i10, n7Var);
        ebVar.f(objJ);
        n7Var.f18980c = objJ;
        return i11;
    }

    static int h(eb ebVar, byte[] bArr, int i8, int i9, n7 n7Var) {
        Object objJ = ebVar.j();
        int iJ = j(objJ, ebVar, bArr, i8, i9, n7Var);
        ebVar.f(objJ);
        n7Var.f18980c = objJ;
        return iJ;
    }

    static int i(Object obj, eb ebVar, byte[] bArr, int i8, int i9, int i10, n7 n7Var) {
        int iM = ((qa) ebVar).m(obj, bArr, i8, i9, i10, n7Var);
        n7Var.f18980c = obj;
        return iM;
    }

    static int j(Object obj, eb ebVar, byte[] bArr, int i8, int i9, n7 n7Var) {
        int iE = i8 + 1;
        int i10 = bArr[i8];
        if (i10 < 0) {
            iE = e(i10, bArr, iE, n7Var);
            i10 = n7Var.f18978a;
        }
        int i11 = iE;
        if (i10 < 0 || i10 > i9 - i11) {
            throw k9.f();
        }
        int i12 = i10 + i11;
        ebVar.e(obj, bArr, i11, i12, n7Var);
        n7Var.f18980c = obj;
        return i12;
    }

    static int k(byte[] bArr, int i8, n7 n7Var) {
        int iP = p(bArr, i8, n7Var);
        int i9 = n7Var.f18978a;
        if (i9 < 0) {
            throw k9.d();
        }
        if (i9 > bArr.length - iP) {
            throw k9.f();
        }
        if (i9 == 0) {
            n7Var.f18980c = o7.f19004b;
            return iP;
        }
        n7Var.f18980c = o7.u(bArr, iP, i9);
        return iP + i9;
    }

    static int l(byte[] bArr, int i8, h9<?> h9Var, n7 n7Var) {
        c9 c9Var = (c9) h9Var;
        int iP = p(bArr, i8, n7Var);
        int i9 = n7Var.f18978a + iP;
        while (iP < i9) {
            iP = p(bArr, iP, n7Var);
            c9Var.i(n7Var.f18978a);
        }
        if (iP == i9) {
            return iP;
        }
        throw k9.f();
    }

    static float m(byte[] bArr, int i8) {
        return Float.intBitsToFloat(o(bArr, i8));
    }

    static int n(byte[] bArr, int i8, n7 n7Var) {
        int iP = p(bArr, i8, n7Var);
        int i9 = n7Var.f18978a;
        if (i9 < 0) {
            throw k9.d();
        }
        if (i9 == 0) {
            n7Var.f18980c = "";
            return iP;
        }
        n7Var.f18980c = kc.e(bArr, iP, i9);
        return iP + i9;
    }

    static int o(byte[] bArr, int i8) {
        return ((bArr[i8 + 3] & 255) << 24) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16);
    }

    static int p(byte[] bArr, int i8, n7 n7Var) {
        int i9 = i8 + 1;
        byte b8 = bArr[i8];
        if (b8 < 0) {
            return e(b8, bArr, i9, n7Var);
        }
        n7Var.f18978a = b8;
        return i9;
    }

    static int q(byte[] bArr, int i8, n7 n7Var) {
        int i9 = i8 + 1;
        long j8 = bArr[i8];
        if (j8 >= 0) {
            n7Var.f18979b = j8;
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
            b8 = b9;
            i10 = i12;
        }
        n7Var.f18979b = j9;
        return i10;
    }

    static long r(byte[] bArr, int i8) {
        return ((((long) bArr[i8 + 7]) & 255) << 56) | (((long) bArr[i8]) & 255) | ((((long) bArr[i8 + 1]) & 255) << 8) | ((((long) bArr[i8 + 2]) & 255) << 16) | ((((long) bArr[i8 + 3]) & 255) << 24) | ((((long) bArr[i8 + 4]) & 255) << 32) | ((((long) bArr[i8 + 5]) & 255) << 40) | ((((long) bArr[i8 + 6]) & 255) << 48);
    }
}
