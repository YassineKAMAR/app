package q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d f25774c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<c> f25776b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f25777a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<c> f25778b = new ArrayList();

        a() {
        }

        public d a() {
            return new d(this.f25777a, Collections.unmodifiableList(this.f25778b));
        }

        public a b(List<c> list) {
            this.f25778b = list;
            return this;
        }

        public a c(String str) {
            this.f25777a = str;
            return this;
        }
    }

    d(String str, List<c> list) {
        this.f25775a = str;
        this.f25776b = list;
    }

    public static a c() {
        return new a();
    }

    @l4.d(tag = 2)
    public List<c> a() {
        return this.f25776b;
    }

    @l4.d(tag = 1)
    public String b() {
        return this.f25775a;
    }
}
