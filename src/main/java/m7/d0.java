package m7;

import java.util.Iterator;
import k7.j;
import k7.k;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends r1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final k7.j f24892m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final e6.k f24893n;

    static final class a extends kotlin.jvm.internal.r implements p6.a<k7.f[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f24894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24895b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d0 f24896c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i8, String str, d0 d0Var) {
            super(0);
            this.f24894a = i8;
            this.f24895b = str;
            this.f24896c = d0Var;
        }

        @Override // p6.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k7.f[] invoke() {
            int i8 = this.f24894a;
            k7.f[] fVarArr = new k7.f[i8];
            for (int i9 = 0; i9 < i8; i9++) {
                fVarArr[i9] = k7.i.d(this.f24895b + '.' + this.f24896c.g(i9), k.d.f24285a, new k7.f[0], null, 8, null);
            }
            return fVarArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(String name, int i8) {
        super(name, null, i8, 2, null);
        kotlin.jvm.internal.q.f(name, "name");
        this.f24892m = j.b.f24281a;
        this.f24893n = e6.m.b(new a(i8, name, this));
    }

    private final k7.f[] r() {
        return (k7.f[]) this.f24893n.getValue();
    }

    @Override // m7.r1, k7.f
    public k7.j e() {
        return this.f24892m;
    }

    @Override // m7.r1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k7.f)) {
            return false;
        }
        k7.f fVar = (k7.f) obj;
        return fVar.e() == j.b.f24281a && kotlin.jvm.internal.q.b(a(), fVar.a()) && kotlin.jvm.internal.q.b(p1.a(this), p1.a(fVar));
    }

    @Override // m7.r1
    public int hashCode() {
        int iHashCode = a().hashCode();
        Iterator<String> it = k7.h.b(this).iterator();
        int iHashCode2 = 1;
        while (it.hasNext()) {
            int i8 = iHashCode2 * 31;
            String next = it.next();
            iHashCode2 = i8 + (next != null ? next.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // m7.r1, k7.f
    public k7.f i(int i8) {
        return r()[i8];
    }

    @Override // m7.r1
    public String toString() {
        return f6.w.G(k7.h.b(this), ", ", a() + '(', ")", 0, null, null, 56, null);
    }
}
