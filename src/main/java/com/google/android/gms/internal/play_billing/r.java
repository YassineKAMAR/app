package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class r extends j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final j f19660g = new r(null, new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Object f19661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient Object[] f19662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f19663f;

    private r(Object obj, Object[] objArr, int i8) {
        this.f19661d = obj;
        this.f19662e = objArr;
        this.f19663f = i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v4 */
    static r g(int i8, Object[] objArr, i iVar) {
        short[] sArr;
        ?? r62;
        ?? r22;
        int i9 = i8;
        Object[] objArrCopyOf = objArr;
        if (i9 == 0) {
            return (r) f19660g;
        }
        h hVar = null;
        ?? r23 = 0;
        h hVar2 = null;
        h hVar3 = null;
        if (i9 == 1) {
            Object obj = objArrCopyOf[0];
            obj.getClass();
            Object obj2 = objArrCopyOf[1];
            obj2.getClass();
            b.a(obj, obj2);
            return new r(null, objArrCopyOf, 1);
        }
        a6.b(i9, objArrCopyOf.length >> 1, "index");
        char c8 = 2;
        int iMax = Math.max(i9, 2);
        int i10 = 1073741824;
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1);
            i10 = iHighestOneBit + iHighestOneBit;
            while (((double) i10) * 0.7d < iMax) {
                i10 += i10;
            }
        } else if (iMax >= 1073741824) {
            throw new IllegalArgumentException("collection too large");
        }
        if (i9 == 1) {
            Object obj3 = objArrCopyOf[0];
            obj3.getClass();
            Object obj4 = objArrCopyOf[1];
            obj4.getClass();
            b.a(obj3, obj4);
            i9 = 1;
        } else {
            int i11 = i10 - 1;
            byte b8 = -1;
            if (i10 <= 128) {
                byte[] bArr = new byte[i10];
                Arrays.fill(bArr, (byte) -1);
                int i12 = 0;
                for (int i13 = 0; i13 < i9; i13++) {
                    int i14 = i12 + i12;
                    int i15 = i13 + i13;
                    Object obj5 = objArrCopyOf[i15];
                    obj5.getClass();
                    Object obj6 = objArrCopyOf[i15 ^ 1];
                    obj6.getClass();
                    b.a(obj5, obj6);
                    int iA = c.a(obj5.hashCode());
                    while (true) {
                        int i16 = iA & i11;
                        int i17 = bArr[i16] & 255;
                        if (i17 == 255) {
                            bArr[i16] = (byte) i14;
                            if (i12 < i13) {
                                objArrCopyOf[i14] = obj5;
                                objArrCopyOf[i14 ^ 1] = obj6;
                            }
                            i12++;
                        } else {
                            if (obj5.equals(objArrCopyOf[i17 == true ? 1 : 0])) {
                                int i18 = ~i17;
                                Object obj7 = objArrCopyOf[i18 == true ? 1 : 0];
                                obj7.getClass();
                                h hVar4 = new h(obj5, obj6, obj7);
                                objArrCopyOf[i18 == true ? 1 : 0] = obj6;
                                hVar2 = hVar4;
                                break;
                            }
                            iA = i16 + 1;
                        }
                    }
                }
                if (i12 == i9) {
                    r22 = bArr;
                    c8 = 2;
                    r23 = r22;
                } else {
                    sArr = new Object[]{bArr, Integer.valueOf(i12), hVar2};
                }
            } else if (i10 <= 32768) {
                sArr = new short[i10];
                Arrays.fill(sArr, (short) -1);
                int i19 = 0;
                for (int i20 = 0; i20 < i9; i20++) {
                    int i21 = i19 + i19;
                    int i22 = i20 + i20;
                    Object obj8 = objArrCopyOf[i22];
                    obj8.getClass();
                    Object obj9 = objArrCopyOf[i22 ^ 1];
                    obj9.getClass();
                    b.a(obj8, obj9);
                    int iA2 = c.a(obj8.hashCode());
                    while (true) {
                        int i23 = iA2 & i11;
                        char c9 = (char) sArr[i23];
                        if (c9 == 65535) {
                            sArr[i23] = (short) i21;
                            if (i19 < i20) {
                                objArrCopyOf[i21] = obj8;
                                objArrCopyOf[i21 ^ 1] = obj9;
                            }
                            i19++;
                        } else {
                            if (obj8.equals(objArrCopyOf[c9])) {
                                int i24 = c9 ^ 1;
                                Object obj10 = objArrCopyOf[i24 == true ? 1 : 0];
                                obj10.getClass();
                                h hVar5 = new h(obj8, obj9, obj10);
                                objArrCopyOf[i24 == true ? 1 : 0] = obj9;
                                hVar3 = hVar5;
                                break;
                            }
                            iA2 = i23 + 1;
                        }
                    }
                }
                if (i19 != i9) {
                    c8 = 2;
                    r62 = new Object[]{sArr, Integer.valueOf(i19), hVar3};
                    r23 = r62;
                }
            } else {
                sArr = new int[i10];
                Arrays.fill((int[]) sArr, -1);
                int i25 = 0;
                int i26 = 0;
                while (i25 < i9) {
                    int i27 = i26 + i26;
                    int i28 = i25 + i25;
                    Object obj11 = objArrCopyOf[i28];
                    obj11.getClass();
                    Object obj12 = objArrCopyOf[i28 ^ 1];
                    obj12.getClass();
                    b.a(obj11, obj12);
                    int iA3 = c.a(obj11.hashCode());
                    while (true) {
                        int i29 = iA3 & i11;
                        ?? r15 = sArr[i29];
                        if (r15 == b8) {
                            sArr[i29] = i27;
                            if (i26 < i25) {
                                objArrCopyOf[i27] = obj11;
                                objArrCopyOf[i27 ^ 1] = obj12;
                            }
                            i26++;
                        } else {
                            if (obj11.equals(objArrCopyOf[r15])) {
                                int i30 = r15 ^ 1;
                                Object obj13 = objArrCopyOf[i30 == true ? 1 : 0];
                                obj13.getClass();
                                h hVar6 = new h(obj11, obj12, obj13);
                                objArrCopyOf[i30 == true ? 1 : 0] = obj12;
                                hVar = hVar6;
                                break;
                            }
                            iA3 = i29 + 1;
                            b8 = -1;
                        }
                    }
                    i25++;
                    b8 = -1;
                }
                if (i26 != i9) {
                    c8 = 2;
                    r62 = new Object[]{sArr, Integer.valueOf(i26), hVar};
                    r23 = r62;
                }
            }
            r22 = sArr;
            c8 = 2;
            r23 = r22;
        }
        boolean z7 = r23 instanceof Object[];
        ?? r24 = r23;
        if (z7) {
            Object[] objArr2 = (Object[]) r23;
            iVar.f19571c = (h) objArr2[c8];
            Object obj14 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            r24 = obj14;
            i9 = iIntValue;
        }
        return new r(r24, objArrCopyOf, i9);
    }

    @Override // com.google.android.gms.internal.play_billing.j
    final d a() {
        return new q(this.f19662e, 1, this.f19663f);
    }

    @Override // com.google.android.gms.internal.play_billing.j
    final k c() {
        return new o(this, this.f19662e, 0, this.f19663f);
    }

    @Override // com.google.android.gms.internal.play_billing.j
    final k d() {
        return new p(this, new q(this.f19662e, 0, this.f19663f));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0038->B:22:0x004e], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0063->B:32:0x007a], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0089->B:43:0x00a0]] */
    @Override // com.google.android.gms.internal.play_billing.j, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L6
        L3:
            r10 = r0
            goto L9c
        L6:
            int r1 = r9.f19663f
            java.lang.Object[] r2 = r9.f19662e
            r3 = 1
            if (r1 != r3) goto L20
            r1 = 0
            r1 = r2[r1]
            r1.getClass()
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L3
            r10 = r2[r3]
            r10.getClass()
            goto L9c
        L20:
            java.lang.Object r1 = r9.f19661d
            if (r1 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r1 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L51
            r4 = r1
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.play_billing.c.a(r1)
        L38:
            r1 = r1 & r6
            r5 = r4[r1]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L3
        L41:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L4e:
            int r1 = r1 + 1
            goto L38
        L51:
            boolean r4 = r1 instanceof short[]
            if (r4 == 0) goto L7d
            r4 = r1
            short[] r4 = (short[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.play_billing.c.a(r1)
        L63:
            r1 = r1 & r6
            short r5 = r4[r1]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L3
        L6d:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L7a:
            int r1 = r1 + 1
            goto L63
        L7d:
            int[] r1 = (int[]) r1
            int r4 = r1.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.play_billing.c.a(r6)
        L89:
            r6 = r6 & r4
            r7 = r1[r6]
            if (r7 != r5) goto L90
            goto L3
        L90:
            r8 = r2[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r2[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r0
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.r.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f19663f;
    }
}
