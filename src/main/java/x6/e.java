package x6;

import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
class e {
    public static final double a(double d8, d sourceUnit, d targetUnit) {
        q.f(sourceUnit, "sourceUnit");
        q.f(targetUnit, "targetUnit");
        long jConvert = targetUnit.c().convert(1L, sourceUnit.c());
        return jConvert > 0 ? d8 * jConvert : d8 / sourceUnit.c().convert(1L, targetUnit.c());
    }

    public static final long b(long j8, d sourceUnit, d targetUnit) {
        q.f(sourceUnit, "sourceUnit");
        q.f(targetUnit, "targetUnit");
        return targetUnit.c().convert(j8, sourceUnit.c());
    }

    public static final long c(long j8, d sourceUnit, d targetUnit) {
        q.f(sourceUnit, "sourceUnit");
        q.f(targetUnit, "targetUnit");
        return targetUnit.c().convert(j8, sourceUnit.c());
    }
}
