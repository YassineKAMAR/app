package v3;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class c0 extends f0<Comparable<?>> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final c0 f26850a = new c0();

    private c0() {
    }

    @Override // v3.f0, java.util.Comparator
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        u3.h.i(comparable);
        u3.h.i(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
