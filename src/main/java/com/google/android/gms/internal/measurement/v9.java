package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class v9 extends u9 {
    private v9() {
        super();
    }

    private static <E> h9<E> e(Object obj, long j8) {
        return (h9) jc.B(obj, j8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.google.android.gms.internal.measurement.h9, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // com.google.android.gms.internal.measurement.u9
    final <E> void b(Object obj, Object obj2, long j8) {
        h9 h9VarE = e(obj, j8);
        ?? E = e(obj2, j8);
        int size = h9VarE.size();
        int size2 = E.size();
        ?? r02 = h9VarE;
        r02 = h9VarE;
        if (size > 0 && size2 > 0) {
            boolean zL = h9VarE.l();
            ?? B = h9VarE;
            if (!zL) {
                B = h9VarE.b(size2 + size);
            }
            B.addAll(E);
            r02 = B;
        }
        if (size > 0) {
            E = r02;
        }
        jc.j(obj, j8, E);
    }

    @Override // com.google.android.gms.internal.measurement.u9
    final void d(Object obj, long j8) {
        e(obj, j8).t();
    }
}
