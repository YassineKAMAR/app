package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class o2 implements g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jb3 f12345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12346b;

    private o2(int i8, jb3 jb3Var) {
        this.f12346b = i8;
        this.f12345a = jb3Var;
    }

    public static o2 b(int i8, dq2 dq2Var) {
        String strConcat;
        int iS;
        StringBuilder sb;
        String str;
        String str2;
        gb3 gb3Var = new gb3();
        int iM = dq2Var.m();
        int i9 = -2;
        while (dq2Var.j() > 8) {
            int iQ = dq2Var.q();
            int iL = dq2Var.l() + dq2Var.q();
            dq2Var.f(iL);
            g2 p2Var = null;
            if (iQ != 1414744396) {
                switch (iQ) {
                    case 1718776947:
                        if (i9 == 2) {
                            dq2Var.h(4);
                            int iQ2 = dq2Var.q();
                            int iQ3 = dq2Var.q();
                            dq2Var.h(4);
                            iS = dq2Var.q();
                            switch (iS) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                l9 l9Var = new l9();
                                l9Var.C(iQ2);
                                l9Var.h(iQ3);
                                l9Var.u(str2);
                                p2Var = new p2(l9Var.D());
                            } else {
                                sb = new StringBuilder();
                                str = "Ignoring track with unsupported compression ";
                                sb.append(str);
                                sb.append(iS);
                                strConcat = sb.toString();
                            }
                        } else if (i9 == 1) {
                            iS = dq2Var.s();
                            String str3 = iS != 1 ? iS != 85 ? iS != 255 ? iS != 8192 ? iS != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str3 != null) {
                                int iS2 = dq2Var.s();
                                int iQ4 = dq2Var.q();
                                dq2Var.h(6);
                                int iW = nz2.w(dq2Var.y());
                                int iS3 = dq2Var.s();
                                byte[] bArr = new byte[iS3];
                                dq2Var.c(bArr, 0, iS3);
                                l9 l9Var2 = new l9();
                                l9Var2.u(str3);
                                l9Var2.k0(iS2);
                                l9Var2.v(iQ4);
                                if ("audio/raw".equals(str3) && iW != 0) {
                                    l9Var2.p(iW);
                                }
                                if ("audio/mp4a-latm".equals(str3) && iS3 > 0) {
                                    l9Var2.k(jb3.A(bArr));
                                }
                                p2Var = new p2(l9Var2.D());
                            } else {
                                sb = new StringBuilder();
                                str = "Ignoring track with unsupported format tag ";
                                sb.append(str);
                                sb.append(iS);
                                strConcat = sb.toString();
                            }
                        } else {
                            strConcat = "Ignoring strf box for unsupported track type: ".concat(nz2.a(i9));
                        }
                        pf2.f("StreamFormatChunk", strConcat);
                        break;
                    case 1751742049:
                        p2Var = l2.a(dq2Var);
                        break;
                    case 1752331379:
                        p2Var = m2.a(dq2Var);
                        break;
                    case 1852994675:
                        p2Var = q2.a(dq2Var);
                        break;
                }
            } else {
                p2Var = b(dq2Var.q(), dq2Var);
            }
            if (p2Var != null) {
                if (p2Var.j() == 1752331379) {
                    int i10 = ((m2) p2Var).f11124a;
                    if (i10 == 1935960438) {
                        i9 = 2;
                    } else if (i10 == 1935963489) {
                        i9 = 1;
                    } else if (i10 != 1937012852) {
                        pf2.f("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i10))));
                        i9 = -1;
                    } else {
                        i9 = 3;
                    }
                }
                gb3Var.g(p2Var);
            }
            dq2Var.g(iL);
            dq2Var.f(iM);
        }
        return new o2(i8, gb3Var.j());
    }

    public final g2 a(Class cls) {
        jb3 jb3Var = this.f12345a;
        int size = jb3Var.size();
        int i8 = 0;
        while (i8 < size) {
            g2 g2Var = (g2) jb3Var.get(i8);
            i8++;
            if (g2Var.getClass() == cls) {
                return g2Var;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.g2
    public final int j() {
        return this.f12346b;
    }
}
