package w6;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class n {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    public static <T> void a(Appendable appendable, T t7, p6.l<? super T, ? extends CharSequence> lVar) {
        CharSequence charSequenceValueOf;
        kotlin.jvm.internal.q.f(appendable, "<this>");
        if (lVar == null) {
            if (!(t7 == 0 ? true : t7 instanceof CharSequence)) {
                if (t7 instanceof Character) {
                    appendable.append(((Character) t7).charValue());
                    return;
                }
                charSequenceValueOf = String.valueOf((Object) t7);
            }
            appendable.append(charSequenceValueOf);
        }
        t7 = (T) lVar.invoke(t7);
        charSequenceValueOf = (CharSequence) t7;
        appendable.append(charSequenceValueOf);
    }
}
