package v3;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class e<F, T> extends f0<F> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final u3.c<F, ? extends T> f26851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final f0<T> f26852b;

    e(u3.c<F, ? extends T> cVar, f0<T> f0Var) {
        this.f26851a = (u3.c) u3.h.i(cVar);
        this.f26852b = (f0) u3.h.i(f0Var);
    }

    @Override // v3.f0, java.util.Comparator
    public int compare(F f8, F f9) {
        return this.f26852b.compare(this.f26851a.apply(f8), this.f26851a.apply(f9));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f26851a.equals(eVar.f26851a) && this.f26852b.equals(eVar.f26852b);
    }

    public int hashCode() {
        return u3.f.b(this.f26851a, this.f26852b);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f26852b);
        String strValueOf2 = String.valueOf(this.f26851a);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 13 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append(".onResultOf(");
        sb.append(strValueOf2);
        sb.append(")");
        return sb.toString();
    }
}
