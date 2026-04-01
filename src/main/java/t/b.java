package t;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0351 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044 A[PHI: r8 r16
  0x0044: PHI (r8v3 boolean) = (r8v1 boolean), (r8v45 boolean) binds: [B:24:0x0042, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x0044: PHI (r16v3 boolean) = (r16v1 boolean), (r16v8 boolean) binds: [B:24:0x0042, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046 A[PHI: r8 r16
  0x0046: PHI (r8v43 boolean) = (r8v1 boolean), (r8v45 boolean) binds: [B:24:0x0042, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x0046: PHI (r16v6 boolean) = (r16v1 boolean), (r16v8 boolean) binds: [B:24:0x0042, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x039a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r38v0, types: [q.d] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29, types: [q.i] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [t.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void a(t.f r37, q.d r38, int r39, int r40, t.c r41) {
        /*
            Method dump skipped, instruction units count: 1333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.b.a(t.f, q.d, int, int, t.c):void");
    }

    public static void b(f fVar, q.d dVar, ArrayList<e> arrayList, int i8) {
        c[] cVarArr;
        int i9;
        int i10;
        if (i8 == 0) {
            i9 = fVar.W0;
            cVarArr = fVar.Z0;
            i10 = 0;
        } else {
            int i11 = fVar.X0;
            cVarArr = fVar.Y0;
            i9 = i11;
            i10 = 2;
        }
        for (int i12 = 0; i12 < i9; i12++) {
            c cVar = cVarArr[i12];
            cVar.a();
            if (arrayList == null || arrayList.contains(cVar.f26340a)) {
                a(fVar, dVar, i8, i10, cVar);
            }
        }
    }
}
