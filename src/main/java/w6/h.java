package w6;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface h {

    public static final class a {
        public static b a(h hVar) {
            return new b(hVar);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h f27147a;

        public b(h match) {
            kotlin.jvm.internal.q.f(match, "match");
            this.f27147a = match;
        }

        public final h a() {
            return this.f27147a;
        }
    }

    b a();

    List<String> b();
}
