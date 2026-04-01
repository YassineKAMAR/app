package v3;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
final class j<T> extends f0<T> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Comparator<T> f26893a;

    j(Comparator<T> comparator) {
        this.f26893a = (Comparator) u3.h.i(comparator);
    }

    @Override // v3.f0, java.util.Comparator
    public int compare(T t7, T t8) {
        return this.f26893a.compare(t7, t8);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f26893a.equals(((j) obj).f26893a);
        }
        return false;
    }

    public int hashCode() {
        return this.f26893a.hashCode();
    }

    public String toString() {
        return this.f26893a.toString();
    }
}
