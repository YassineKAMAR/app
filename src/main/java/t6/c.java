package t6;

import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends t6.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f26518e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final c f26519f = new c(1, 0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    public c(char c8, char c9) {
        super(c8, c9, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (a() != cVar.a() || e() != cVar.e()) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (a() * 31) + e();
    }

    public boolean i(char c8) {
        return q.g(a(), c8) <= 0 && q.g(c8, e()) <= 0;
    }

    public boolean isEmpty() {
        return q.g(a(), e()) > 0;
    }

    public String toString() {
        return a() + ".." + e();
    }
}
