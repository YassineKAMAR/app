package q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n1.l;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f25748e = new C0160a().b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f25749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<d> f25750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f25751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f25752d;

    /* JADX INFO: renamed from: q1.a$a, reason: collision with other inner class name */
    public static final class C0160a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f f25753a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<d> f25754b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b f25755c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f25756d = "";

        C0160a() {
        }

        public C0160a a(d dVar) {
            this.f25754b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f25753a, Collections.unmodifiableList(this.f25754b), this.f25755c, this.f25756d);
        }

        public C0160a c(String str) {
            this.f25756d = str;
            return this;
        }

        public C0160a d(b bVar) {
            this.f25755c = bVar;
            return this;
        }

        public C0160a e(f fVar) {
            this.f25753a = fVar;
            return this;
        }
    }

    a(f fVar, List<d> list, b bVar, String str) {
        this.f25749a = fVar;
        this.f25750b = list;
        this.f25751c = bVar;
        this.f25752d = str;
    }

    public static C0160a e() {
        return new C0160a();
    }

    @l4.d(tag = 4)
    public String a() {
        return this.f25752d;
    }

    @l4.d(tag = 3)
    public b b() {
        return this.f25751c;
    }

    @l4.d(tag = 2)
    public List<d> c() {
        return this.f25750b;
    }

    @l4.d(tag = 1)
    public f d() {
        return this.f25749a;
    }

    public byte[] f() {
        return l.a(this);
    }
}
