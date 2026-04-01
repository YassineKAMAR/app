package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class gq4 extends lq4 implements td4 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final tc3 f8455k = tc3.b(new Comparator() { // from class: com.google.android.gms.internal.ads.ep4
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i8 = gq4.f8457m;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            }
            if (num2.intValue() == -1) {
                return 1;
            }
            return num.intValue() - num2.intValue();
        }
    });

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final tc3 f8456l = tc3.b(new Comparator() { // from class: com.google.android.gms.internal.ads.fp4
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int i8 = gq4.f8457m;
            return 0;
        }
    });

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f8457m = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f8458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f8459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f8460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private tp4 f8461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private zp4 f8462h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private zb4 f8463i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ap4 f8464j;

    public gq4(Context context) {
        ap4 ap4Var = new ap4();
        tp4 tp4VarD = tp4.d(context);
        this.f8458d = new Object();
        this.f8459e = context != null ? context.getApplicationContext() : null;
        this.f8464j = ap4Var;
        this.f8461g = tp4VarD;
        this.f8463i = zb4.f18139c;
        boolean z7 = false;
        if (context != null && nz2.h(context)) {
            z7 = true;
        }
        this.f8460f = z7;
        if (!z7 && context != null && nz2.f12300a >= 32) {
            this.f8462h = zp4.a(context);
        }
        if (this.f8461g.f15232q0 && context == null) {
            pf2.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    protected static int k(nb nbVar, String str, boolean z7) {
        if (!TextUtils.isEmpty(str) && str.equals(nbVar.f11784c)) {
            return 4;
        }
        String strO = o(str);
        String strO2 = o(nbVar.f11784c);
        if (strO2 == null || strO == null) {
            return (z7 && strO2 == null) ? 1 : 0;
        }
        if (strO2.startsWith(strO) || strO.startsWith(strO2)) {
            return 3;
        }
        int i8 = nz2.f12300a;
        return strO2.split("-", 2)[0].equals(strO.split("-", 2)[0]) ? 2 : 0;
    }

    protected static String o(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ boolean r(com.google.android.gms.internal.ads.gq4 r8, com.google.android.gms.internal.ads.nb r9) {
        /*
            java.lang.Object r0 = r8.f8458d
            monitor-enter(r0)
            com.google.android.gms.internal.ads.tp4 r1 = r8.f8461g     // Catch: java.lang.Throwable -> L8e
            boolean r1 = r1.f15232q0     // Catch: java.lang.Throwable -> L8e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L8b
            boolean r1 = r8.f8460f     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L8b
            int r1 = r9.f11806y     // Catch: java.lang.Throwable -> L8e
            r4 = 2
            if (r1 <= r4) goto L8b
            java.lang.String r1 = r9.f11793l     // Catch: java.lang.Throwable -> L8e
            r5 = 32
            if (r1 != 0) goto L1b
            goto L65
        L1b:
            int r6 = r1.hashCode()     // Catch: java.lang.Throwable -> L8e
            r7 = 3
            switch(r6) {
                case -2123537834: goto L42;
                case 187078296: goto L38;
                case 187078297: goto L2e;
                case 1504578661: goto L24;
                default: goto L23;
            }
        L23:
            goto L4c
        L24:
            java.lang.String r6 = "audio/eac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 1
            goto L4d
        L2e:
            java.lang.String r6 = "audio/ac4"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 3
            goto L4d
        L38:
            java.lang.String r6 = "audio/ac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 0
            goto L4d
        L42:
            java.lang.String r6 = "audio/eac3-joc"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 2
            goto L4d
        L4c:
            r1 = -1
        L4d:
            if (r1 == 0) goto L56
            if (r1 == r3) goto L56
            if (r1 == r4) goto L56
            if (r1 == r7) goto L56
            goto L65
        L56:
            int r1 = com.google.android.gms.internal.ads.nz2.f12300a     // Catch: java.lang.Throwable -> L8e
            if (r1 < r5) goto L8b
            com.google.android.gms.internal.ads.zp4 r1 = r8.f8462h     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8b
            boolean r1 = r1.g()     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L65
            goto L8b
        L65:
            int r1 = com.google.android.gms.internal.ads.nz2.f12300a     // Catch: java.lang.Throwable -> L8e
            if (r1 < r5) goto L8c
            com.google.android.gms.internal.ads.zp4 r1 = r8.f8462h     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            boolean r4 = r1.g()     // Catch: java.lang.Throwable -> L8e
            if (r4 == 0) goto L8c
            boolean r1 = r1.e()     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            com.google.android.gms.internal.ads.zp4 r1 = r8.f8462h     // Catch: java.lang.Throwable -> L8e
            boolean r1 = r1.f()     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            com.google.android.gms.internal.ads.zp4 r1 = r8.f8462h     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.internal.ads.zb4 r8 = r8.f8463i     // Catch: java.lang.Throwable -> L8e
            boolean r8 = r1.d(r8, r9)     // Catch: java.lang.Throwable -> L8e
            if (r8 == 0) goto L8c
        L8b:
            r2 = 1
        L8c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            return r2
        L8e:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gq4.r(com.google.android.gms.internal.ads.gq4, com.google.android.gms.internal.ads.nb):boolean");
    }

    protected static boolean s(int i8, boolean z7) {
        int i9 = i8 & 7;
        return i9 == 4 || (z7 && i9 == 3);
    }

    private static void t(to4 to4Var, a91 a91Var, Map map) {
        for (int i8 = 0; i8 < to4Var.f15203a; i8++) {
            if (((w51) a91Var.f5123z.get(to4Var.b(i8))) != null) {
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        boolean z7;
        zp4 zp4Var;
        synchronized (this.f8458d) {
            z7 = false;
            if (this.f8461g.f15232q0 && !this.f8460f && nz2.f12300a >= 32 && (zp4Var = this.f8462h) != null && zp4Var.g()) {
                z7 = true;
            }
        }
        if (z7) {
            i();
        }
    }

    private static final Pair v(int i8, kq4 kq4Var, int[][][] iArr, bq4 bq4Var, Comparator comparator) {
        List arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (int i9 = 0; i9 < 2; i9++) {
            if (i8 == kq4Var.c(i9)) {
                to4 to4VarD = kq4Var.d(i9);
                for (int i10 = 0; i10 < to4VarD.f15203a; i10++) {
                    u31 u31VarB = to4VarD.b(i10);
                    List listA = bq4Var.a(i9, u31VarB, iArr[i9][i10]);
                    int i11 = u31VarB.f15465a;
                    int i12 = 1;
                    boolean[] zArr = new boolean[1];
                    int i13 = 0;
                    while (i13 <= 0) {
                        int i14 = i13 + 1;
                        cq4 cq4Var = (cq4) listA.get(i13);
                        int iA = cq4Var.a();
                        if (!zArr[i13] && iA != 0) {
                            if (iA == i12) {
                                arrayList = jb3.A(cq4Var);
                            } else {
                                arrayList = new ArrayList();
                                arrayList.add(cq4Var);
                                for (int i15 = i14; i15 <= 0; i15++) {
                                    cq4 cq4Var2 = (cq4) listA.get(i15);
                                    if (cq4Var2.a() == 2 && cq4Var.c(cq4Var2)) {
                                        arrayList.add(cq4Var2);
                                        zArr[i15] = true;
                                    }
                                }
                            }
                            arrayList2.add(arrayList);
                        }
                        i13 = i14;
                        i12 = 1;
                    }
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList2, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i16 = 0; i16 < list.size(); i16++) {
            iArr2[i16] = ((cq4) list.get(i16)).f6447c;
        }
        cq4 cq4Var3 = (cq4) list.get(0);
        return Pair.create(new hq4(cq4Var3.f6446b, iArr2, 0), Integer.valueOf(cq4Var3.f6445a));
    }

    @Override // com.google.android.gms.internal.ads.oq4
    public final td4 a() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.oq4
    public final void b() {
        zp4 zp4Var;
        synchronized (this.f8458d) {
            if (nz2.f12300a >= 32 && (zp4Var = this.f8462h) != null) {
                zp4Var.c();
            }
        }
        super.b();
    }

    @Override // com.google.android.gms.internal.ads.oq4
    public final void c(zb4 zb4Var) {
        boolean z7;
        synchronized (this.f8458d) {
            z7 = !this.f8463i.equals(zb4Var);
            this.f8463i = zb4Var;
        }
        if (z7) {
            u();
        }
    }

    @Override // com.google.android.gms.internal.ads.oq4
    public final boolean d() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.lq4
    protected final Pair j(kq4 kq4Var, int[][][] iArr, final int[] iArr2, tm4 tm4Var, s11 s11Var) {
        final tp4 tp4Var;
        int i8;
        final boolean z7;
        final String str;
        int i9;
        int[] iArr3;
        int length;
        iq4 iq4VarA;
        zp4 zp4Var;
        synchronized (this.f8458d) {
            tp4Var = this.f8461g;
            if (tp4Var.f15232q0 && nz2.f12300a >= 32 && (zp4Var = this.f8462h) != null) {
                Looper looperMyLooper = Looper.myLooper();
                uu1.b(looperMyLooper);
                zp4Var.b(this, looperMyLooper);
            }
        }
        int i10 = 2;
        hq4[] hq4VarArr = new hq4[2];
        Pair pairV = v(2, kq4Var, iArr, new bq4() { // from class: com.google.android.gms.internal.ads.jp4
            /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
            @Override // com.google.android.gms.internal.ads.bq4
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.util.List a(int r19, com.google.android.gms.internal.ads.u31 r20, int[] r21) {
                /*
                    Method dump skipped, instruction units count: 201
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jp4.a(int, com.google.android.gms.internal.ads.u31, int[]):java.util.List");
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.kp4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                ya3 ya3VarI = ya3.i();
                dq4 dq4Var = new Comparator() { // from class: com.google.android.gms.internal.ads.dq4
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return fq4.e((fq4) obj3, (fq4) obj4);
                    }
                };
                ya3 ya3VarB = ya3VarI.c((fq4) Collections.max(list, dq4Var), (fq4) Collections.max(list2, dq4Var), dq4Var).b(list.size(), list2.size());
                eq4 eq4Var = new Comparator() { // from class: com.google.android.gms.internal.ads.eq4
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return fq4.d((fq4) obj3, (fq4) obj4);
                    }
                };
                return ya3VarB.c((fq4) Collections.max(list, eq4Var), (fq4) Collections.max(list2, eq4Var), eq4Var).a();
            }
        });
        if (pairV != null) {
            hq4VarArr[((Integer) pairV.second).intValue()] = (hq4) pairV.first;
        }
        int i11 = 0;
        while (true) {
            i8 = 1;
            if (i11 >= 2) {
                z7 = false;
                break;
            }
            if (kq4Var.c(i11) == 2 && kq4Var.d(i11).f15203a > 0) {
                z7 = true;
                break;
            }
            i11++;
        }
        Pair pairV2 = v(1, kq4Var, iArr, new bq4() { // from class: com.google.android.gms.internal.ads.hp4
            @Override // com.google.android.gms.internal.ads.bq4
            public final List a(int i12, u31 u31Var, int[] iArr4) {
                final gq4 gq4Var = this.f8880a;
                m83 m83Var = new m83() { // from class: com.google.android.gms.internal.ads.gp4
                    @Override // com.google.android.gms.internal.ads.m83
                    public final boolean a(Object obj) {
                        return gq4.r(gq4Var, (nb) obj);
                    }
                };
                gb3 gb3Var = new gb3();
                int i13 = 0;
                while (true) {
                    int i14 = u31Var.f15465a;
                    if (i13 > 0) {
                        return gb3Var.j();
                    }
                    int i15 = i13;
                    gb3Var.g(new np4(i12, u31Var, i15, tp4Var, iArr4[i13], z7, m83Var));
                    i13++;
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.ip4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((np4) Collections.max((List) obj)).d((np4) Collections.max((List) obj2));
            }
        });
        if (pairV2 != null) {
            hq4VarArr[((Integer) pairV2.second).intValue()] = (hq4) pairV2.first;
        }
        if (pairV2 == null) {
            str = null;
        } else {
            Object obj = pairV2.first;
            str = ((hq4) obj).f8892a.b(((hq4) obj).f8893b[0]).f11784c;
        }
        int i12 = 3;
        Pair pairV3 = v(3, kq4Var, iArr, new bq4() { // from class: com.google.android.gms.internal.ads.lp4
            @Override // com.google.android.gms.internal.ads.bq4
            public final List a(int i13, u31 u31Var, int[] iArr4) {
                int i14 = gq4.f8457m;
                gb3 gb3Var = new gb3();
                int i15 = 0;
                while (true) {
                    int i16 = u31Var.f15465a;
                    if (i15 > 0) {
                        return gb3Var.j();
                    }
                    int i17 = i15;
                    gb3Var.g(new aq4(i13, u31Var, i17, tp4Var, iArr4[i15], str));
                    i15++;
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.mp4
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((aq4) ((List) obj2).get(0)).d((aq4) ((List) obj3).get(0));
            }
        });
        if (pairV3 != null) {
            hq4VarArr[((Integer) pairV3.second).intValue()] = (hq4) pairV3.first;
        }
        int i13 = 0;
        while (i13 < i10) {
            int iC = kq4Var.c(i13);
            if (iC != i10 && iC != i8 && iC != i12) {
                to4 to4VarD = kq4Var.d(i13);
                int[][] iArr4 = iArr[i13];
                u31 u31Var = null;
                op4 op4Var = null;
                for (int i14 = 0; i14 < to4VarD.f15203a; i14++) {
                    u31 u31VarB = to4VarD.b(i14);
                    int[] iArr5 = iArr4[i14];
                    char c8 = 0;
                    while (true) {
                        int i15 = u31VarB.f15465a;
                        if (c8 <= 0) {
                            if (s(iArr5[0], tp4Var.f15233r0)) {
                                op4 op4Var2 = new op4(u31VarB.b(0), iArr5[0]);
                                if (op4Var == null || op4Var2.compareTo(op4Var) > 0) {
                                    op4Var = op4Var2;
                                    u31Var = u31VarB;
                                }
                            }
                            c8 = 1;
                        }
                    }
                }
                hq4VarArr[i13] = u31Var == null ? null : new hq4(u31Var, new int[]{0}, 0);
            }
            i13++;
            i10 = 2;
            i8 = 1;
            i12 = 3;
        }
        HashMap map = new HashMap();
        for (int i16 = 0; i16 < 2; i16++) {
            t(kq4Var.d(i16), tp4Var, map);
        }
        t(kq4Var.e(), tp4Var, map);
        for (int i17 = 0; i17 < 2; i17++) {
            if (((w51) map.get(Integer.valueOf(kq4Var.c(i17)))) != null) {
                throw null;
            }
        }
        int i18 = 0;
        for (int i19 = 2; i18 < i19; i19 = 2) {
            to4 to4VarD2 = kq4Var.d(i18);
            if (tp4Var.g(i18, to4VarD2)) {
                if (tp4Var.e(i18, to4VarD2) != null) {
                    throw null;
                }
                hq4VarArr[i18] = null;
            }
            i18++;
        }
        for (int i20 = 0; i20 < 2; i20++) {
            int iC2 = kq4Var.c(i20);
            if (tp4Var.f(i20) || tp4Var.A.contains(Integer.valueOf(iC2))) {
                hq4VarArr[i20] = null;
            }
        }
        ap4 ap4Var = this.f8464j;
        wq4 wq4VarG = g();
        jb3 jb3VarA = bp4.a(hq4VarArr);
        int i21 = 2;
        iq4[] iq4VarArr = new iq4[2];
        int i22 = 0;
        while (i22 < i21) {
            hq4 hq4Var = hq4VarArr[i22];
            if (hq4Var == null || (length = (iArr3 = hq4Var.f8893b).length) == 0) {
                i9 = i22;
            } else {
                if (length == 1) {
                    iq4VarA = new jq4(hq4Var.f8892a, iArr3[0], 0, 0, null);
                    i9 = i22;
                } else {
                    i9 = i22;
                    iq4VarA = ap4Var.a(hq4Var.f8892a, iArr3, 0, wq4VarG, (jb3) jb3VarA.get(i22));
                }
                iq4VarArr[i9] = iq4VarA;
            }
            i22 = i9 + 1;
            i21 = 2;
        }
        vd4[] vd4VarArr = new vd4[i21];
        for (int i23 = 0; i23 < i21; i23++) {
            vd4VarArr[i23] = (tp4Var.f(i23) || tp4Var.A.contains(Integer.valueOf(kq4Var.c(i23))) || (kq4Var.c(i23) != -2 && iq4VarArr[i23] == null)) ? null : vd4.f16118a;
        }
        return Pair.create(vd4VarArr, iq4VarArr);
    }

    public final tp4 l() {
        tp4 tp4Var;
        synchronized (this.f8458d) {
            tp4Var = this.f8461g;
        }
        return tp4Var;
    }

    public final void q(rp4 rp4Var) {
        boolean z7;
        tp4 tp4Var = new tp4(rp4Var);
        synchronized (this.f8458d) {
            z7 = !this.f8461g.equals(tp4Var);
            this.f8461g = tp4Var;
        }
        if (z7) {
            if (tp4Var.f15232q0 && this.f8459e == null) {
                pf2.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            i();
        }
    }
}
