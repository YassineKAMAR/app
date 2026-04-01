package y6;

/* JADX INFO: loaded from: classes2.dex */
public final class m {
    public static final <T> k<T> a(h6.d<? super T> dVar) {
        if (!(dVar instanceof d7.j)) {
            return new k<>(dVar, 1);
        }
        k<T> kVarK = ((d7.j) dVar).k();
        if (kVarK != null) {
            if (!kVarK.G()) {
                kVarK = null;
            }
            if (kVarK != null) {
                return kVarK;
            }
        }
        return new k<>(dVar, 2);
    }
}
