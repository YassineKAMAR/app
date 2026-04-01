package z2;

import y2.a;
import y2.a.d;

/* JADX INFO: loaded from: classes.dex */
public final class b<O extends a.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y2.a<O> f27688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O f27689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f27690d;

    private b(y2.a<O> aVar, O o8, String str) {
        this.f27688b = aVar;
        this.f27689c = o8;
        this.f27690d = str;
        this.f27687a = a3.n.b(aVar, o8, str);
    }

    public static <O extends a.d> b<O> a(y2.a<O> aVar, O o8, String str) {
        return new b<>(aVar, o8, str);
    }

    public final String b() {
        return this.f27688b.b();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return a3.n.a(this.f27688b, bVar.f27688b) && a3.n.a(this.f27689c, bVar.f27689c) && a3.n.a(this.f27690d, bVar.f27690d);
    }

    public final int hashCode() {
        return this.f27687a;
    }
}
