package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class r5 implements p0 {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final w0 f13900c0 = new w0() { // from class: com.google.android.gms.internal.ads.n5
        @Override // com.google.android.gms.internal.ads.w0
        public final /* synthetic */ p0[] a(Uri uri, Map map) {
            int i8 = v0.f15946a;
            return new p0[]{new r5(0)};
        }
    };

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final byte[] f13901d0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final byte[] f13902e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final byte[] f13903f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final byte[] f13904g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final UUID f13905h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final Map f13906i0;
    private long A;
    private long B;
    private qg2 C;
    private qg2 D;
    private boolean E;
    private boolean F;
    private int G;
    private long H;
    private long I;
    private int J;
    private int K;
    private int[] L;
    private int M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private long R;
    private int S;
    private int T;
    private int U;
    private boolean V;
    private boolean W;
    private boolean X;
    private int Y;
    private byte Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m5 f13907a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f13908a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t5 f13909b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private s0 f13910b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray f13911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f13912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dq2 f13913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final dq2 f13914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final dq2 f13915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final dq2 f13916h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final dq2 f13917i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final dq2 f13918j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final dq2 f13919k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final dq2 f13920l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final dq2 f13921m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final dq2 f13922n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ByteBuffer f13923o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f13924p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f13925q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f13926r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f13927s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f13928t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private q5 f13929u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f13930v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f13931w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f13932x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f13933y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f13934z;

    static {
        int i8 = nz2.f12300a;
        f13902e0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(x73.f17098c);
        f13903f0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f13904g0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f13905h0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        f13906i0 = Collections.unmodifiableMap(map);
    }

    public r5(int i8) {
        k5 k5Var = new k5();
        this.f13925q = -1L;
        this.f13926r = -9223372036854775807L;
        this.f13927s = -9223372036854775807L;
        this.f13928t = -9223372036854775807L;
        this.f13934z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.f13907a = k5Var;
        k5Var.b(new p5(this, null));
        this.f13912d = true;
        this.f13909b = new t5();
        this.f13911c = new SparseArray();
        this.f13915g = new dq2(4);
        this.f13916h = new dq2(ByteBuffer.allocate(4).putInt(-1).array());
        this.f13917i = new dq2(4);
        this.f13913e = new dq2(sd3.f14624a);
        this.f13914f = new dq2(4);
        this.f13918j = new dq2();
        this.f13919k = new dq2();
        this.f13920l = new dq2(8);
        this.f13921m = new dq2();
        this.f13922n = new dq2();
        this.L = new int[1];
    }

    private final int n(q0 q0Var, q5 q5Var, int i8, boolean z7) throws yh0, EOFException, InterruptedIOException {
        int i9;
        if ("S_TEXT/UTF8".equals(q5Var.f13270b)) {
            v(q0Var, f13901d0, i8);
        } else if ("S_TEXT/ASS".equals(q5Var.f13270b)) {
            v(q0Var, f13903f0, i8);
        } else if ("S_TEXT/WEBVTT".equals(q5Var.f13270b)) {
            v(q0Var, f13904g0, i8);
        } else {
            w1 w1Var = q5Var.X;
            if (!this.V) {
                if (q5Var.f13276h) {
                    this.O &= -1073741825;
                    if (!this.W) {
                        ((f0) q0Var).J(this.f13915g.i(), 0, 1, false);
                        this.S++;
                        if ((this.f13915g.i()[0] & 128) == 128) {
                            throw yh0.a("Extension bit is set in signal byte", null);
                        }
                        this.Z = this.f13915g.i()[0];
                        this.W = true;
                    }
                    byte b8 = this.Z;
                    if ((b8 & 1) == 1) {
                        int i10 = b8 & 2;
                        this.O |= 1073741824;
                        if (!this.f13908a0) {
                            ((f0) q0Var).J(this.f13920l.i(), 0, 8, false);
                            this.S += 8;
                            this.f13908a0 = true;
                            this.f13915g.i()[0] = (byte) ((i10 != 2 ? 0 : 128) | 8);
                            this.f13915g.g(0);
                            w1Var.c(this.f13915g, 1, 1);
                            this.T++;
                            this.f13920l.g(0);
                            w1Var.c(this.f13920l, 8, 1);
                            this.T += 8;
                        }
                        if (i10 == 2) {
                            if (!this.X) {
                                ((f0) q0Var).J(this.f13915g.i(), 0, 1, false);
                                this.S++;
                                this.f13915g.g(0);
                                this.Y = this.f13915g.u();
                                this.X = true;
                            }
                            int i11 = this.Y * 4;
                            this.f13915g.d(i11);
                            ((f0) q0Var).J(this.f13915g.i(), 0, i11, false);
                            this.S += i11;
                            int i12 = (this.Y >> 1) + 1;
                            int i13 = (i12 * 6) + 2;
                            ByteBuffer byteBuffer = this.f13923o;
                            if (byteBuffer == null || byteBuffer.capacity() < i13) {
                                this.f13923o = ByteBuffer.allocate(i13);
                            }
                            this.f13923o.position(0);
                            this.f13923o.putShort((short) i12);
                            int i14 = 0;
                            int i15 = 0;
                            while (true) {
                                i9 = this.Y;
                                if (i14 >= i9) {
                                    break;
                                }
                                int iX = this.f13915g.x();
                                int i16 = iX - i15;
                                if (i14 % 2 == 0) {
                                    this.f13923o.putShort((short) i16);
                                } else {
                                    this.f13923o.putInt(i16);
                                }
                                i14++;
                                i15 = iX;
                            }
                            int i17 = (i8 - this.S) - i15;
                            if ((i9 & 1) == 1) {
                                this.f13923o.putInt(i17);
                            } else {
                                this.f13923o.putShort((short) i17);
                                this.f13923o.putInt(0);
                            }
                            this.f13921m.e(this.f13923o.array(), i13);
                            w1Var.c(this.f13921m, i13, 1);
                            this.T += i13;
                        }
                    }
                } else {
                    byte[] bArr = q5Var.f13277i;
                    if (bArr != null) {
                        this.f13918j.e(bArr, bArr.length);
                    }
                }
                if (!"A_OPUS".equals(q5Var.f13270b) ? q5Var.f13274f > 0 : z7) {
                    this.O |= 268435456;
                    this.f13922n.d(0);
                    int iM = (this.f13918j.m() + i8) - this.S;
                    this.f13915g.d(4);
                    this.f13915g.i()[0] = (byte) ((iM >> 24) & 255);
                    this.f13915g.i()[1] = (byte) ((iM >> 16) & 255);
                    this.f13915g.i()[2] = (byte) ((iM >> 8) & 255);
                    this.f13915g.i()[3] = (byte) (iM & 255);
                    w1Var.c(this.f13915g, 4, 2);
                    this.T += 4;
                }
                this.V = true;
            }
            int iM2 = i8 + this.f13918j.m();
            if (!"V_MPEG4/ISO/AVC".equals(q5Var.f13270b) && !"V_MPEGH/ISO/HEVC".equals(q5Var.f13270b)) {
                if (q5Var.T != null) {
                    uu1.f(this.f13918j.m() == 0);
                    q5Var.T.d(q0Var);
                }
                while (true) {
                    int i18 = this.S;
                    if (i18 >= iM2) {
                        break;
                    }
                    int iO = o(q0Var, w1Var, iM2 - i18);
                    this.S += iO;
                    this.T += iO;
                }
            } else {
                byte[] bArrI = this.f13914f.i();
                bArrI[0] = 0;
                bArrI[1] = 0;
                bArrI[2] = 0;
                int i19 = q5Var.Y;
                int i20 = 4 - i19;
                while (this.S < iM2) {
                    int i21 = this.U;
                    if (i21 == 0) {
                        int iMin = Math.min(i19, this.f13918j.j());
                        ((f0) q0Var).J(bArrI, i20 + iMin, i19 - iMin, false);
                        if (iMin > 0) {
                            this.f13918j.c(bArrI, i20, iMin);
                        }
                        this.S += i19;
                        this.f13914f.g(0);
                        this.U = this.f13914f.x();
                        this.f13913e.g(0);
                        u1.b(w1Var, this.f13913e, 4);
                        this.T += 4;
                    } else {
                        int iO2 = o(q0Var, w1Var, i21);
                        this.S += iO2;
                        this.T += iO2;
                        this.U -= iO2;
                    }
                }
            }
            if ("A_VORBIS".equals(q5Var.f13270b)) {
                this.f13916h.g(0);
                u1.b(w1Var, this.f13916h, 4);
                this.T += 4;
            }
        }
        int i22 = this.T;
        u();
        return i22;
    }

    private final int o(q0 q0Var, w1 w1Var, int i8) {
        int iJ = this.f13918j.j();
        if (iJ <= 0) {
            return u1.a(w1Var, q0Var, i8, false);
        }
        int iMin = Math.min(i8, iJ);
        u1.b(w1Var, this.f13918j, iMin);
        return iMin;
    }

    private final long p(long j8) throws yh0 {
        long j9 = this.f13926r;
        if (j9 != -9223372036854775807L) {
            return nz2.D(j8, j9, 1000L);
        }
        throw yh0.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private final void q(int i8) throws yh0 {
        if (this.C == null || this.D == null) {
            throw yh0.a("Element " + i8 + " must be in a Cues", null);
        }
    }

    private final void r(int i8) throws yh0 {
        if (this.f13929u != null) {
            return;
        }
        throw yh0.a("Element " + i8 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d6 A[EDGE_INSN: B:63:0x00d6->B:52:0x00d6 BREAK  A[LOOP:0: B:46:0x00bb->B:51:0x00d3], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void s(com.google.android.gms.internal.ads.q5 r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r5.s(com.google.android.gms.internal.ads.q5, long, int, int, int):void");
    }

    private final void t(q0 q0Var, int i8) throws EOFException, InterruptedIOException {
        if (this.f13915g.m() >= i8) {
            return;
        }
        if (this.f13915g.k() < i8) {
            dq2 dq2Var = this.f13915g;
            int iK = dq2Var.k();
            dq2Var.a(Math.max(iK + iK, i8));
        }
        dq2 dq2Var2 = this.f13915g;
        ((f0) q0Var).J(dq2Var2.i(), dq2Var2.m(), i8 - dq2Var2.m(), false);
        this.f13915g.f(i8);
    }

    private final void u() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.f13908a0 = false;
        this.f13918j.d(0);
    }

    private final void v(q0 q0Var, byte[] bArr, int i8) throws EOFException, InterruptedIOException {
        int length = bArr.length;
        int i9 = length + i8;
        if (this.f13919k.k() < i9) {
            dq2 dq2Var = this.f13919k;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i9 + i8);
            dq2Var.e(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.f13919k.i(), 0, length);
        }
        ((f0) q0Var).J(this.f13919k.i(), length, i8, false);
        this.f13919k.g(0);
        this.f13919k.f(i9);
    }

    private static byte[] w(long j8, String str, long j9) {
        uu1.d(j8 != -9223372036854775807L);
        int i8 = (int) (j8 / 3600000000L);
        long j10 = j8 - (((long) i8) * 3600000000L);
        int i9 = (int) (j10 / 60000000);
        long j11 = j10 - (((long) i9) * 60000000);
        int i10 = (int) (j11 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf((int) ((j11 - (((long) i10) * 1000000)) / j9)));
        int i11 = nz2.f12300a;
        return str2.getBytes(x73.f17098c);
    }

    private static int[] x(int[] iArr, int i8) {
        if (iArr == null) {
            return new int[i8];
        }
        int length = iArr.length;
        return length >= i8 ? iArr : new int[Math.max(length + length, i8)];
    }

    protected final void c(int i8, int i9, q0 q0Var) {
        long j8;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = i8;
        int i15 = 1;
        int i16 = 0;
        if (i14 != 161 && i14 != 163) {
            if (i14 == 165) {
                if (this.G != 2) {
                    return;
                }
                q5 q5Var = (q5) this.f13911c.get(this.M);
                if (this.P != 4 || !"V_VP9".equals(q5Var.f13270b)) {
                    ((f0) q0Var).d(i9, false);
                    return;
                }
                this.f13922n.d(i9);
                ((f0) q0Var).J(this.f13922n.i(), 0, i9, false);
                return;
            }
            if (i14 == 16877) {
                r(i8);
                q5 q5Var2 = this.f13929u;
                if (q5Var2.f13275g != 1685485123 && q5Var2.f13275g != 1685480259) {
                    ((f0) q0Var).d(i9, false);
                    return;
                }
                byte[] bArr = new byte[i9];
                q5Var2.N = bArr;
                ((f0) q0Var).J(bArr, 0, i9, false);
                return;
            }
            if (i14 == 16981) {
                r(i8);
                byte[] bArr2 = new byte[i9];
                this.f13929u.f13277i = bArr2;
                ((f0) q0Var).J(bArr2, 0, i9, false);
                return;
            }
            if (i14 == 18402) {
                byte[] bArr3 = new byte[i9];
                ((f0) q0Var).J(bArr3, 0, i9, false);
                r(i8);
                this.f13929u.f13278j = new v1(1, bArr3, 0, 0);
                return;
            }
            if (i14 == 21419) {
                Arrays.fill(this.f13917i.i(), (byte) 0);
                ((f0) q0Var).J(this.f13917i.i(), 4 - i9, i9, false);
                this.f13917i.g(0);
                this.f13931w = (int) this.f13917i.C();
                return;
            }
            if (i14 == 25506) {
                r(i8);
                byte[] bArr4 = new byte[i9];
                this.f13929u.f13279k = bArr4;
                ((f0) q0Var).J(bArr4, 0, i9, false);
                return;
            }
            if (i14 != 30322) {
                throw yh0.a("Unexpected id: " + i14, null);
            }
            r(i8);
            byte[] bArr5 = new byte[i9];
            this.f13929u.f13290v = bArr5;
            ((f0) q0Var).J(bArr5, 0, i9, false);
            return;
        }
        int i17 = 8;
        if (this.G == 0) {
            this.M = (int) this.f13909b.d(q0Var, false, true, 8);
            this.N = this.f13909b.a();
            this.I = -9223372036854775807L;
            this.G = 1;
            this.f13915g.d(0);
        }
        q5 q5Var3 = (q5) this.f13911c.get(this.M);
        if (q5Var3 == null) {
            ((f0) q0Var).d(i9 - this.N, false);
            this.G = 0;
            return;
        }
        q5Var3.X.getClass();
        if (this.G == 1) {
            t(q0Var, 3);
            int i18 = (this.f13915g.i()[2] & 6) >> 1;
            if (i18 == 0) {
                this.K = 1;
                int[] iArrX = x(this.L, 1);
                this.L = iArrX;
                iArrX[0] = (i9 - this.N) - 3;
            } else {
                t(q0Var, 4);
                int i19 = (this.f13915g.i()[3] & 255) + 1;
                this.K = i19;
                int[] iArrX2 = x(this.L, i19);
                this.L = iArrX2;
                if (i18 == 2) {
                    int i20 = (i9 - this.N) - 4;
                    int i21 = this.K;
                    Arrays.fill(iArrX2, 0, i21, i20 / i21);
                } else {
                    if (i18 != 1) {
                        if (i18 != 3) {
                            throw yh0.a("Unexpected lacing value: 2", null);
                        }
                        int i22 = 0;
                        int i23 = 4;
                        int i24 = 0;
                        while (true) {
                            int i25 = this.K - 1;
                            if (i22 >= i25) {
                                this.L[i25] = ((i9 - this.N) - i23) - i24;
                                break;
                            }
                            this.L[i22] = i16;
                            i23++;
                            t(q0Var, i23);
                            int i26 = i23 - 1;
                            if (this.f13915g.i()[i26] == 0) {
                                throw yh0.a("No valid varint length mask found", null);
                            }
                            int i27 = 0;
                            while (true) {
                                if (i27 >= i17) {
                                    j8 = 0;
                                    break;
                                }
                                int i28 = i15 << (7 - i27);
                                if ((this.f13915g.i()[i26] & i28) != 0) {
                                    i23 += i27;
                                    t(q0Var, i23);
                                    j8 = (~i28) & this.f13915g.i()[i26] & 255;
                                    int i29 = i26 + 1;
                                    while (i29 < i23) {
                                        j8 = (j8 << i17) | ((long) (this.f13915g.i()[i29] & 255));
                                        i29++;
                                        i17 = 8;
                                    }
                                    if (i22 > 0) {
                                        j8 -= (1 << ((i27 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i27++;
                                    i15 = 1;
                                    i17 = 8;
                                }
                            }
                            if (j8 < -2147483648L || j8 > 2147483647L) {
                                break;
                            }
                            int[] iArr = this.L;
                            int i30 = (int) j8;
                            if (i22 != 0) {
                                i30 += iArr[i22 - 1];
                            }
                            iArr[i22] = i30;
                            i24 += i30;
                            i22++;
                            i15 = 1;
                            i16 = 0;
                            i17 = 8;
                        }
                        throw yh0.a("EBML lacing sample size out of range.", null);
                    }
                    int i31 = 0;
                    int i32 = 0;
                    int i33 = 4;
                    while (true) {
                        i10 = this.K - 1;
                        if (i31 >= i10) {
                            break;
                        }
                        this.L[i31] = 0;
                        do {
                            i33++;
                            t(q0Var, i33);
                            i11 = this.f13915g.i()[i33 - 1] & 255;
                            int[] iArr2 = this.L;
                            i12 = iArr2[i31] + i11;
                            iArr2[i31] = i12;
                        } while (i11 == 255);
                        i32 += i12;
                        i31++;
                    }
                    this.L[i10] = ((i9 - this.N) - i33) - i32;
                }
            }
            this.H = this.B + p((this.f13915g.i()[0] << 8) | (this.f13915g.i()[1] & 255));
            if (q5Var3.f13272d == 2) {
                i13 = 1;
                this.O = i13;
                this.G = 2;
                this.J = 0;
            } else {
                if (i14 == 163) {
                    if ((this.f13915g.i()[2] & 128) == 128) {
                        i14 = 163;
                        i13 = 1;
                        this.O = i13;
                        this.G = 2;
                        this.J = 0;
                    } else {
                        i14 = 163;
                    }
                }
                i13 = 0;
                this.O = i13;
                this.G = 2;
                this.J = 0;
            }
        }
        if (i14 == 163) {
            while (true) {
                int i34 = this.J;
                if (i34 >= this.K) {
                    this.G = 0;
                    return;
                }
                s(q5Var3, ((long) ((this.J * q5Var3.f13273e) / 1000)) + this.H, this.O, n(q0Var, q5Var3, this.L[i34], false), 0);
                this.J++;
            }
        } else {
            while (true) {
                int i35 = this.J;
                if (i35 >= this.K) {
                    return;
                }
                int[] iArr3 = this.L;
                iArr3[i35] = n(q0Var, q5Var3, iArr3[i35], true);
                this.J++;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0314  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void d(int r22) {
        /*
            Method dump skipped, instruction units count: 1150
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r5.d(int):void");
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final void e(long j8, long j9) {
        this.B = -9223372036854775807L;
        this.G = 0;
        this.f13907a.k();
        this.f13909b.e();
        u();
        for (int i8 = 0; i8 < this.f13911c.size(); i8++) {
            x1 x1Var = ((q5) this.f13911c.valueAt(i8)).T;
            if (x1Var != null) {
                x1Var.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final int f(q0 q0Var, n1 n1Var) {
        this.F = false;
        while (!this.F) {
            if (!this.f13907a.a(q0Var)) {
                for (int i8 = 0; i8 < this.f13911c.size(); i8++) {
                    q5 q5Var = (q5) this.f13911c.valueAt(i8);
                    q5Var.X.getClass();
                    x1 x1Var = q5Var.T;
                    if (x1Var != null) {
                        x1Var.a(q5Var.X, q5Var.f13278j);
                    }
                }
                return -1;
            }
            long jN = q0Var.n();
            if (this.f13933y) {
                this.A = jN;
                n1Var.f11591a = this.f13934z;
                this.f13933y = false;
                return 1;
            }
            if (this.f13930v) {
                long j8 = this.A;
                if (j8 != -1) {
                    n1Var.f11591a = j8;
                    this.A = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final boolean g(q0 q0Var) {
        return new s5().a(q0Var);
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final void h(s0 s0Var) {
        this.f13910b0 = s0Var;
    }

    protected final void i(int i8, double d8) {
        if (i8 == 181) {
            r(i8);
            this.f13929u.Q = (int) d8;
            return;
        }
        if (i8 == 17545) {
            this.f13927s = (long) d8;
            return;
        }
        switch (i8) {
            case 21969:
                r(i8);
                this.f13929u.D = (float) d8;
                break;
            case 21970:
                r(i8);
                this.f13929u.E = (float) d8;
                break;
            case 21971:
                r(i8);
                this.f13929u.F = (float) d8;
                break;
            case 21972:
                r(i8);
                this.f13929u.G = (float) d8;
                break;
            case 21973:
                r(i8);
                this.f13929u.H = (float) d8;
                break;
            case 21974:
                r(i8);
                this.f13929u.I = (float) d8;
                break;
            case 21975:
                r(i8);
                this.f13929u.J = (float) d8;
                break;
            case 21976:
                r(i8);
                this.f13929u.K = (float) d8;
                break;
            case 21977:
                r(i8);
                this.f13929u.L = (float) d8;
                break;
            case 21978:
                r(i8);
                this.f13929u.M = (float) d8;
                break;
            default:
                switch (i8) {
                    case 30323:
                        r(i8);
                        this.f13929u.f13287s = (float) d8;
                        break;
                    case 30324:
                        r(i8);
                        this.f13929u.f13288t = (float) d8;
                        break;
                    case 30325:
                        r(i8);
                        this.f13929u.f13289u = (float) d8;
                        break;
                }
                break;
        }
    }

    protected final void j(int i8, long j8) {
        boolean z7;
        if (i8 == 20529) {
            if (j8 == 0) {
                return;
            }
            throw yh0.a("ContentEncodingOrder " + j8 + " not supported", null);
        }
        if (i8 == 20530) {
            if (j8 == 1) {
                return;
            }
            throw yh0.a("ContentEncodingScope " + j8 + " not supported", null);
        }
        switch (i8) {
            case 131:
                r(i8);
                this.f13929u.f13272d = (int) j8;
                return;
            case 136:
                z7 = j8 == 1;
                r(i8);
                this.f13929u.V = z7;
                return;
            case 155:
                this.I = p(j8);
                return;
            case 159:
                r(i8);
                this.f13929u.O = (int) j8;
                return;
            case 176:
                r(i8);
                this.f13929u.f13281m = (int) j8;
                return;
            case 179:
                q(i8);
                this.C.c(p(j8));
                return;
            case 186:
                r(i8);
                this.f13929u.f13282n = (int) j8;
                return;
            case 215:
                r(i8);
                this.f13929u.f13271c = (int) j8;
                return;
            case 231:
                this.B = p(j8);
                return;
            case 238:
                this.P = (int) j8;
                return;
            case 241:
                if (this.E) {
                    return;
                }
                q(i8);
                this.D.c(j8);
                this.E = true;
                return;
            case 251:
                this.Q = true;
                return;
            case 16871:
                r(i8);
                this.f13929u.f13275g = (int) j8;
                return;
            case 16980:
                if (j8 == 3) {
                    return;
                }
                throw yh0.a("ContentCompAlgo " + j8 + " not supported", null);
            case 17029:
                if (j8 < 1 || j8 > 2) {
                    throw yh0.a("DocTypeReadVersion " + j8 + " not supported", null);
                }
                return;
            case 17143:
                if (j8 == 1) {
                    return;
                }
                throw yh0.a("EBMLReadVersion " + j8 + " not supported", null);
            case 18401:
                if (j8 == 5) {
                    return;
                }
                throw yh0.a("ContentEncAlgo " + j8 + " not supported", null);
            case 18408:
                if (j8 == 1) {
                    return;
                }
                throw yh0.a("AESSettingsCipherMode " + j8 + " not supported", null);
            case 21420:
                this.f13932x = j8 + this.f13925q;
                return;
            case 21432:
                int i9 = (int) j8;
                r(i8);
                if (i9 == 0) {
                    this.f13929u.f13291w = 0;
                    return;
                }
                if (i9 == 1) {
                    this.f13929u.f13291w = 2;
                    return;
                } else if (i9 == 3) {
                    this.f13929u.f13291w = 1;
                    return;
                } else {
                    if (i9 != 15) {
                        return;
                    }
                    this.f13929u.f13291w = 3;
                    return;
                }
            case 21680:
                r(i8);
                this.f13929u.f13283o = (int) j8;
                return;
            case 21682:
                r(i8);
                this.f13929u.f13285q = (int) j8;
                return;
            case 21690:
                r(i8);
                this.f13929u.f13284p = (int) j8;
                return;
            case 21930:
                z7 = j8 == 1;
                r(i8);
                this.f13929u.U = z7;
                return;
            case 21998:
                r(i8);
                this.f13929u.f13274f = (int) j8;
                return;
            case 22186:
                r(i8);
                this.f13929u.R = j8;
                return;
            case 22203:
                r(i8);
                this.f13929u.S = j8;
                return;
            case 25188:
                r(i8);
                this.f13929u.P = (int) j8;
                return;
            case 30114:
                this.R = j8;
                return;
            case 30321:
                int i10 = (int) j8;
                r(i8);
                if (i10 == 0) {
                    this.f13929u.f13286r = 0;
                    return;
                }
                if (i10 == 1) {
                    this.f13929u.f13286r = 1;
                    return;
                } else if (i10 == 2) {
                    this.f13929u.f13286r = 2;
                    return;
                } else {
                    if (i10 != 3) {
                        return;
                    }
                    this.f13929u.f13286r = 3;
                    return;
                }
            case 2352003:
                r(i8);
                this.f13929u.f13273e = (int) j8;
                return;
            case 2807729:
                this.f13926r = j8;
                return;
            default:
                switch (i8) {
                    case 21945:
                        int i11 = (int) j8;
                        r(i8);
                        if (i11 == 1) {
                            this.f13929u.A = 2;
                            return;
                        } else {
                            if (i11 != 2) {
                                return;
                            }
                            this.f13929u.A = 1;
                            return;
                        }
                    case 21946:
                        r(i8);
                        int iB = sk4.b((int) j8);
                        if (iB != -1) {
                            this.f13929u.f13294z = iB;
                            return;
                        }
                        return;
                    case 21947:
                        r(i8);
                        this.f13929u.f13292x = true;
                        int iA = sk4.a((int) j8);
                        if (iA != -1) {
                            this.f13929u.f13293y = iA;
                            return;
                        }
                        return;
                    case 21948:
                        r(i8);
                        this.f13929u.B = (int) j8;
                        return;
                    case 21949:
                        r(i8);
                        this.f13929u.C = (int) j8;
                        return;
                    default:
                        return;
                }
        }
    }

    protected final void k(int i8, long j8, long j9) {
        uu1.b(this.f13910b0);
        if (i8 == 160) {
            this.Q = false;
            this.R = 0L;
            return;
        }
        if (i8 == 174) {
            this.f13929u = new q5();
            return;
        }
        if (i8 == 187) {
            this.E = false;
            return;
        }
        if (i8 == 19899) {
            this.f13931w = -1;
            this.f13932x = -1L;
            return;
        }
        if (i8 == 20533) {
            r(i8);
            this.f13929u.f13276h = true;
            return;
        }
        if (i8 == 21968) {
            r(i8);
            this.f13929u.f13292x = true;
            return;
        }
        if (i8 == 408125543) {
            long j10 = this.f13925q;
            if (j10 != -1 && j10 != j8) {
                throw yh0.a("Multiple Segment elements not supported", null);
            }
            this.f13925q = j8;
            this.f13924p = j9;
            return;
        }
        if (i8 == 475249515) {
            this.C = new qg2(32);
            this.D = new qg2(32);
        } else if (i8 == 524531317 && !this.f13930v) {
            if (this.f13912d && this.f13934z != -1) {
                this.f13933y = true;
            } else {
                this.f13910b0.r(new p1(this.f13928t, 0L));
                this.f13930v = true;
            }
        }
    }

    protected final void l(int i8, String str) {
        if (i8 == 134) {
            r(i8);
            this.f13929u.f13270b = str;
            return;
        }
        if (i8 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw yh0.a("DocType " + str + " not supported", null);
        }
        if (i8 == 21358) {
            r(i8);
            this.f13929u.f13269a = str;
        } else {
            if (i8 != 2274716) {
                return;
            }
            r(i8);
            this.f13929u.W = str;
        }
    }
}
