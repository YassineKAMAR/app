package w6;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class t extends s {
    public static Double f(String str) {
        kotlin.jvm.internal.q.f(str, "<this>");
        try {
            if (l.f27158b.b(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Float g(String str) {
        kotlin.jvm.internal.q.f(str, "<this>");
        try {
            if (l.f27158b.b(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
