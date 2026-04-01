package s1;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static <TInput, TResult, TException extends Throwable> TResult a(int i8, TInput tinput, a<TInput, TResult, TException> aVar, c<TInput, TResult> cVar) {
        TResult tresultApply;
        if (i8 < 1) {
            return aVar.apply(tinput);
        }
        do {
            tresultApply = aVar.apply(tinput);
            tinput = cVar.a(tinput, tresultApply);
            if (tinput == null) {
                break;
            }
            i8--;
        } while (i8 >= 1);
        return tresultApply;
    }
}
