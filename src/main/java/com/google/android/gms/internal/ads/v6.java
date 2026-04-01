package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class v6 implements p0 {
    public static final w0 E = new w0() { // from class: com.google.android.gms.internal.ads.r6
        @Override // com.google.android.gms.internal.ads.w0
        public final /* synthetic */ p0[] a(Uri uri, Map map) {
            int i8 = v0.f15946a;
            return new p0[]{new v6(0, null)};
        }
    };
    private static final byte[] F = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final nb G;
    private boolean D;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f15999f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final dq2 f16000g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f16005l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f16006m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f16007n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f16008o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private dq2 f16009p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f16010q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f16011r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private u6 f16015v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f16016w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f16017x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f16018y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f16019z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f15994a = Collections.unmodifiableList(Collections.emptyList());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final q3 f16001h = new q3();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final dq2 f16002i = new dq2(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dq2 f15996c = new dq2(sd3.f14624a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dq2 f15997d = new dq2(5);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dq2 f15998e = new dq2();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ArrayDeque f16003j = new ArrayDeque();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ArrayDeque f16004k = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f15995b = new SparseArray();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f16013t = -9223372036854775807L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f16012s = -9223372036854775807L;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f16014u = -9223372036854775807L;
    private s0 A = s0.K;
    private w1[] B = new w1[0];
    private w1[] C = new w1[0];

    static {
        l9 l9Var = new l9();
        l9Var.u("application/x-emsg");
        G = l9Var.D();
    }

    public v6(int i8, kx2 kx2Var) {
        byte[] bArr = new byte[16];
        this.f15999f = bArr;
        this.f16000g = new dq2(bArr);
    }

    private static int a(int i8) throws yh0 {
        if (i8 >= 0) {
            return i8;
        }
        throw yh0.a("Unexpected negative value: " + i8, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.e2 b(java.util.List r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r4 = r2
            r3 = 0
        L8:
            if (r3 >= r0) goto Lb9
            java.lang.Object r5 = r14.get(r3)
            com.google.android.gms.internal.ads.f6 r5 = (com.google.android.gms.internal.ads.f6) r5
            int r6 = r5.f8224a
            r7 = 1886614376(0x70737368, float:3.013775E29)
            if (r6 != r7) goto Lb5
            if (r4 != 0) goto L1e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L1e:
            com.google.android.gms.internal.ads.dq2 r5 = r5.f7629b
            byte[] r5 = r5.i()
            com.google.android.gms.internal.ads.dq2 r6 = new com.google.android.gms.internal.ads.dq2
            r6.<init>(r5)
            int r8 = r6.m()
            r9 = 32
            if (r8 >= r9) goto L33
        L31:
            r6 = r2
            goto L99
        L33:
            r6.g(r1)
            int r8 = r6.o()
            int r9 = r6.j()
            int r9 = r9 + 4
            if (r8 == r9) goto L43
            goto L31
        L43:
            int r8 = r6.o()
            if (r8 == r7) goto L4a
            goto L31
        L4a:
            int r7 = r6.o()
            int r7 = com.google.android.gms.internal.ads.g6.a(r7)
            r8 = 1
            if (r7 <= r8) goto L6c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Unsupported pssh version: "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "PsshAtomUtil"
            com.google.android.gms.internal.ads.pf2.f(r7, r6)
            goto L31
        L6c:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.B()
            long r12 = r6.B()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L84
            int r8 = r6.x()
            int r8 = r8 * 16
            r6.h(r8)
        L84:
            int r8 = r6.x()
            int r10 = r6.j()
            if (r8 == r10) goto L8f
            goto L31
        L8f:
            byte[] r10 = new byte[r8]
            r6.c(r10, r1, r8)
            com.google.android.gms.internal.ads.b7 r6 = new com.google.android.gms.internal.ads.b7
            r6.<init>(r9, r7, r10)
        L99:
            if (r6 != 0) goto L9d
            r6 = r2
            goto La1
        L9d:
            java.util.UUID r6 = com.google.android.gms.internal.ads.b7.a(r6)
        La1:
            if (r6 != 0) goto Lab
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            com.google.android.gms.internal.ads.pf2.f(r5, r6)
            goto Lb5
        Lab:
            com.google.android.gms.internal.ads.d1 r7 = new com.google.android.gms.internal.ads.d1
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r2, r8, r5)
            r4.add(r7)
        Lb5:
            int r3 = r3 + 1
            goto L8
        Lb9:
            if (r4 != 0) goto Lbc
            return r2
        Lbc:
            com.google.android.gms.internal.ads.e2 r14 = new com.google.android.gms.internal.ads.e2
            r14.<init>(r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v6.b(java.util.List):com.google.android.gms.internal.ads.e2");
    }

    private final void c() {
        this.f16005l = 0;
        this.f16008o = 0;
    }

    private static void d(dq2 dq2Var, int i8, g7 g7Var) throws yh0 {
        dq2Var.g(i8 + 8);
        int iO = dq2Var.o() & 16777215;
        if ((iO & 1) != 0) {
            throw yh0.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z7 = (iO & 2) != 0;
        int iX = dq2Var.x();
        if (iX == 0) {
            Arrays.fill(g7Var.f8239l, 0, g7Var.f8232e, false);
            return;
        }
        int i9 = g7Var.f8232e;
        if (iX != i9) {
            throw yh0.a("Senc sample count " + iX + " is different from fragment sample count" + i9, null);
        }
        Arrays.fill(g7Var.f8239l, 0, iX, z7);
        g7Var.a(dq2Var.j());
        dq2 dq2Var2 = g7Var.f8241n;
        dq2Var.c(dq2Var2.i(), 0, dq2Var2.m());
        g7Var.f8241n.g(0);
        g7Var.f8242o = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:255:0x0635  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void i(long r46) throws com.google.android.gms.internal.ads.yh0 {
        /*
            Method dump skipped, instruction units count: 1798
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v6.i(long):void");
    }

    private static final q6 j(SparseArray sparseArray, int i8) {
        if (sparseArray.size() == 1) {
            return (q6) sparseArray.valueAt(0);
        }
        q6 q6Var = (q6) sparseArray.get(i8);
        q6Var.getClass();
        return q6Var;
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final void e(long j8, long j9) {
        int size = this.f15995b.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((u6) this.f15995b.valueAt(i8)).i();
        }
        this.f16004k.clear();
        this.f16011r = 0;
        this.f16012s = j9;
        this.f16003j.clear();
        c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x023f, code lost:
    
        r23 = r1.f7655c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0244, code lost:
    
        r23 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0246, code lost:
    
        r5.a(r10, r20, r33.f16016w, 0, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0259, code lost:
    
        if (r33.f16004k.isEmpty() != false) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x025b, code lost:
    
        r1 = (com.google.android.gms.internal.ads.t6) r33.f16004k.removeFirst();
        r33.f16011r -= r1.f14975c;
        r3 = r1.f14973a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x026e, code lost:
    
        if (r1.f14974b == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0270, code lost:
    
        r3 = r3 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0271, code lost:
    
        r5 = r33.B;
        r6 = r5.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0275, code lost:
    
        if (r8 >= r6) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0277, code lost:
    
        r5[r8].a(r3, 1, r1.f14975c, r33.f16011r, null);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x028f, code lost:
    
        if (r2.k() != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0291, code lost:
    
        r33.f16015v = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0293, code lost:
    
        r33.f16005l = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
    
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
    
        if (r33.f16005l != 3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
    
        r3 = r2.b();
        r33.f16016w = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
    
        if (r2.f15506f >= r2.f15509i) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00aa, code lost:
    
        ((com.google.android.gms.internal.ads.f0) r1).d(r3, false);
        r1 = r2.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b3, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b6, code lost:
    
        r3 = r2.f15502b.f8241n;
        r1 = r1.f7656d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bc, code lost:
    
        if (r1 == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00be, code lost:
    
        r3.h(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c9, code lost:
    
        if (r2.f15502b.b(r2.f15506f) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cb, code lost:
    
        r3.h(r3.y() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d8, code lost:
    
        if (r2.k() != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00da, code lost:
    
        r33.f16015v = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00dc, code lost:
    
        r33.f16005l = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00de, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e7, code lost:
    
        if (r2.f15504d.f8654a.f7155g != 1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e9, code lost:
    
        r33.f16016w = r3 - 8;
        ((com.google.android.gms.internal.ads.f0) r1).d(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0103, code lost:
    
        if ("audio/ac4".equals(r2.f15504d.f8654a.f7154f.f11793l) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0105, code lost:
    
        r33.f16017x = r2.c(r33.f16016w, 7);
        com.google.android.gms.internal.ads.s.b(r33.f16016w, r33.f16000g);
        r2.f15501a.d(r33.f16000g, 7);
        r3 = r33.f16017x + 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0120, code lost:
    
        r3 = r2.c(r33.f16016w, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0126, code lost:
    
        r33.f16017x = r3;
        r33.f16016w += r3;
        r33.f16005l = 4;
        r33.f16018y = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0132, code lost:
    
        r3 = r2.f15504d.f8654a;
        r5 = r2.f15501a;
        r10 = r2.e();
        r6 = r3.f7158j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013e, code lost:
    
        if (r6 != 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0140, code lost:
    
        r3 = r33.f16017x;
        r4 = r33.f16016w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0144, code lost:
    
        if (r3 >= r4) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0146, code lost:
    
        r33.f16017x += r5.f(r1, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0151, code lost:
    
        r13 = r33.f15997d.i();
        r13[0] = 0;
        r13[1] = 0;
        r13[2] = 0;
        r14 = r6 + 1;
        r6 = 4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0167, code lost:
    
        if (r33.f16017x >= r33.f16016w) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0169, code lost:
    
        r12 = r33.f16018y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016d, code lost:
    
        if (r12 != 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016f, code lost:
    
        ((com.google.android.gms.internal.ads.f0) r1).J(r13, r6, r14, r9);
        r33.f15997d.g(r9);
        r12 = r33.f15997d.o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0180, code lost:
    
        if (r12 <= 0) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0182, code lost:
    
        r33.f16018y = r12 - 1;
        r33.f15996c.g(r9);
        r5.d(r33.f15996c, 4);
        r5.d(r33.f15997d, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0199, code lost:
    
        if (r33.C.length <= 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019b, code lost:
    
        r12 = r3.f7154f.f11793l;
        r17 = r13[4];
        r9 = com.google.android.gms.internal.ads.sd3.f14624a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a9, code lost:
    
        if ("video/avc".equals(r12) == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ad, code lost:
    
        if ((r17 & 31) == r4) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b0, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b6, code lost:
    
        if ("video/hevc".equals(r12) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01bd, code lost:
    
        if (((r17 & 126) >> r8) != 39) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c0, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c1, code lost:
    
        r33.f16019z = r9;
        r33.f16017x += 5;
        r33.f16016w += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d5, code lost:
    
        throw com.google.android.gms.internal.ads.yh0.a("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d8, code lost:
    
        if (r33.f16019z == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01da, code lost:
    
        r33.f15998e.d(r12);
        ((com.google.android.gms.internal.ads.f0) r1).J(r33.f15998e.i(), 0, r33.f16018y, false);
        r5.d(r33.f15998e, r33.f16018y);
        r4 = r33.f16018y;
        r8 = r33.f15998e;
        r8 = com.google.android.gms.internal.ads.sd3.b(r8.i(), r8.m());
        r33.f15998e.g("video/hevc".equals(r3.f7154f.f11793l) ? 1 : 0);
        r33.f15998e.f(r8);
        com.google.android.gms.internal.ads.b0.a(r10, r33.f15998e, r33.C);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x021f, code lost:
    
        r4 = r5.f(r1, r12, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0225, code lost:
    
        r33.f16017x += r4;
        r33.f16018y -= r4;
        r4 = 6;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0231, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0235, code lost:
    
        r20 = r2.a();
        r1 = r2.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x023d, code lost:
    
        if (r1 == null) goto L101;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x072b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(com.google.android.gms.internal.ads.q0 r34, com.google.android.gms.internal.ads.n1 r35) throws com.google.android.gms.internal.ads.yh0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 1842
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v6.f(com.google.android.gms.internal.ads.q0, com.google.android.gms.internal.ads.n1):int");
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final boolean g(q0 q0Var) {
        return d7.a(q0Var);
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final void h(s0 s0Var) {
        this.A = s0Var;
        c();
        w1[] w1VarArr = new w1[2];
        this.B = w1VarArr;
        int i8 = 0;
        w1[] w1VarArr2 = (w1[]) nz2.j(w1VarArr, 0);
        this.B = w1VarArr2;
        for (w1 w1Var : w1VarArr2) {
            w1Var.e(G);
        }
        this.C = new w1[this.f15994a.size()];
        int i9 = 100;
        while (i8 < this.C.length) {
            int i10 = i9 + 1;
            w1 w1VarF = this.A.f(i9, 3);
            w1VarF.e((nb) this.f15994a.get(i8));
            this.C[i8] = w1VarF;
            i8++;
            i9 = i10;
        }
    }
}
