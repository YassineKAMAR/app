package io.flutter.plugins.firebase.core;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class p {

    public interface a {
        void d(String str, Boolean bool, g<Void> gVar);

        void e(String str, g<Void> gVar);

        void f(String str, Boolean bool, g<Void> gVar);
    }

    public interface b {
        void a(String str, e eVar, g<f> gVar);

        void b(g<List<f>> gVar);

        void c(g<e> gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c extends s5.s {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f23068d = new c();

        private c() {
        }

        @Override // s5.s
        protected Object g(byte b8, ByteBuffer byteBuffer) {
            return b8 != -128 ? b8 != -127 ? super.g(b8, byteBuffer) : f.a((ArrayList) f(byteBuffer)) : e.a((ArrayList) f(byteBuffer));
        }

        @Override // s5.s
        protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            ArrayList<Object> arrayListF;
            if (obj instanceof e) {
                byteArrayOutputStream.write(128);
                arrayListF = ((e) obj).x();
            } else if (!(obj instanceof f)) {
                super.p(byteArrayOutputStream, obj);
                return;
            } else {
                byteArrayOutputStream.write(129);
                arrayListF = ((f) obj).f();
            }
            p(byteArrayOutputStream, arrayListF);
        }
    }

    public static class d extends RuntimeException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f23070b;
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f23071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f23072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f23073c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f23074d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f23075e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f23076f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f23077g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f23078h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f23079i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f23080j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f23081k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f23082l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f23083m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f23084n;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f23085a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f23086b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f23087c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private String f23088d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private String f23089e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private String f23090f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private String f23091g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private String f23092h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private String f23093i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private String f23094j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private String f23095k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private String f23096l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private String f23097m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private String f23098n;

            public e a() {
                e eVar = new e();
                eVar.k(this.f23085a);
                eVar.m(this.f23086b);
                eVar.t(this.f23087c);
                eVar.u(this.f23088d);
                eVar.n(this.f23089e);
                eVar.o(this.f23090f);
                eVar.v(this.f23091g);
                eVar.s(this.f23092h);
                eVar.w(this.f23093i);
                eVar.p(this.f23094j);
                eVar.j(this.f23095k);
                eVar.r(this.f23096l);
                eVar.q(this.f23097m);
                eVar.l(this.f23098n);
                return eVar;
            }

            public a b(String str) {
                this.f23085a = str;
                return this;
            }

            public a c(String str) {
                this.f23086b = str;
                return this;
            }

            public a d(String str) {
                this.f23090f = str;
                return this;
            }

            public a e(String str) {
                this.f23087c = str;
                return this;
            }

            public a f(String str) {
                this.f23088d = str;
                return this;
            }

            public a g(String str) {
                this.f23091g = str;
                return this;
            }

            public a h(String str) {
                this.f23093i = str;
                return this;
            }
        }

        e() {
        }

        static e a(ArrayList<Object> arrayList) {
            e eVar = new e();
            eVar.k((String) arrayList.get(0));
            eVar.m((String) arrayList.get(1));
            eVar.t((String) arrayList.get(2));
            eVar.u((String) arrayList.get(3));
            eVar.n((String) arrayList.get(4));
            eVar.o((String) arrayList.get(5));
            eVar.v((String) arrayList.get(6));
            eVar.s((String) arrayList.get(7));
            eVar.w((String) arrayList.get(8));
            eVar.p((String) arrayList.get(9));
            eVar.j((String) arrayList.get(10));
            eVar.r((String) arrayList.get(11));
            eVar.q((String) arrayList.get(12));
            eVar.l((String) arrayList.get(13));
            return eVar;
        }

        public String b() {
            return this.f23071a;
        }

        public String c() {
            return this.f23072b;
        }

        public String d() {
            return this.f23075e;
        }

        public String e() {
            return this.f23076f;
        }

        public String f() {
            return this.f23073c;
        }

        public String g() {
            return this.f23074d;
        }

        public String h() {
            return this.f23077g;
        }

        public String i() {
            return this.f23079i;
        }

        public void j(String str) {
            this.f23081k = str;
        }

        public void k(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
            }
            this.f23071a = str;
        }

        public void l(String str) {
            this.f23084n = str;
        }

        public void m(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"appId\" is null.");
            }
            this.f23072b = str;
        }

        public void n(String str) {
            this.f23075e = str;
        }

        public void o(String str) {
            this.f23076f = str;
        }

        public void p(String str) {
            this.f23080j = str;
        }

        public void q(String str) {
            this.f23083m = str;
        }

        public void r(String str) {
            this.f23082l = str;
        }

        public void s(String str) {
            this.f23078h = str;
        }

        public void t(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
            }
            this.f23073c = str;
        }

        public void u(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"projectId\" is null.");
            }
            this.f23074d = str;
        }

        public void v(String str) {
            this.f23077g = str;
        }

        public void w(String str) {
            this.f23079i = str;
        }

        public ArrayList<Object> x() {
            ArrayList<Object> arrayList = new ArrayList<>(14);
            arrayList.add(this.f23071a);
            arrayList.add(this.f23072b);
            arrayList.add(this.f23073c);
            arrayList.add(this.f23074d);
            arrayList.add(this.f23075e);
            arrayList.add(this.f23076f);
            arrayList.add(this.f23077g);
            arrayList.add(this.f23078h);
            arrayList.add(this.f23079i);
            arrayList.add(this.f23080j);
            arrayList.add(this.f23081k);
            arrayList.add(this.f23082l);
            arrayList.add(this.f23083m);
            arrayList.add(this.f23084n);
            return arrayList;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f23099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private e f23100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Boolean f23101c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Map<String, Object> f23102d;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f23103a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private e f23104b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Boolean f23105c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private Map<String, Object> f23106d;

            public f a() {
                f fVar = new f();
                fVar.c(this.f23103a);
                fVar.d(this.f23104b);
                fVar.b(this.f23105c);
                fVar.e(this.f23106d);
                return fVar;
            }

            public a b(Boolean bool) {
                this.f23105c = bool;
                return this;
            }

            public a c(String str) {
                this.f23103a = str;
                return this;
            }

            public a d(e eVar) {
                this.f23104b = eVar;
                return this;
            }

            public a e(Map<String, Object> map) {
                this.f23106d = map;
                return this;
            }
        }

        f() {
        }

        static f a(ArrayList<Object> arrayList) {
            f fVar = new f();
            fVar.c((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            fVar.d(obj == null ? null : e.a((ArrayList) obj));
            fVar.b((Boolean) arrayList.get(2));
            fVar.e((Map) arrayList.get(3));
            return fVar;
        }

        public void b(Boolean bool) {
            this.f23101c = bool;
        }

        public void c(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"name\" is null.");
            }
            this.f23099a = str;
        }

        public void d(e eVar) {
            if (eVar == null) {
                throw new IllegalStateException("Nonnull field \"options\" is null.");
            }
            this.f23100b = eVar;
        }

        public void e(Map<String, Object> map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
            }
            this.f23102d = map;
        }

        public ArrayList<Object> f() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(this.f23099a);
            e eVar = this.f23100b;
            arrayList.add(eVar == null ? null : eVar.x());
            arrayList.add(this.f23101c);
            arrayList.add(this.f23102d);
            return arrayList;
        }
    }

    public interface g<T> {
        void a(T t7);

        void b(Throwable th);
    }

    protected static ArrayList<Object> a(Throwable th) {
        Object obj;
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof d) {
            d dVar = (d) th;
            arrayList.add(dVar.f23069a);
            arrayList.add(dVar.getMessage());
            obj = dVar.f23070b;
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            obj = "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th);
        }
        arrayList.add(obj);
        return arrayList;
    }
}
