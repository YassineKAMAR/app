package io.flutter.plugins.googlemobileads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final int f23147a;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f23148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f23149b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f23150c;

        a(int i8, String str, String str2) {
            this.f23148a = i8;
            this.f23149b = str;
            this.f23150c = str2;
        }

        a(z1.a aVar) {
            this.f23148a = aVar.a();
            this.f23149b = aVar.b();
            this.f23150c = aVar.c();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f23148a == aVar.f23148a && this.f23149b.equals(aVar.f23149b)) {
                return this.f23150c.equals(aVar.f23150c);
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f23148a), this.f23149b, this.f23150c);
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f23151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f23152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f23153c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map<String, String> f23154d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private a f23155e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f23156f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f23157g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final String f23158h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final String f23159i;

        b(String str, long j8, String str2, Map<String, String> map, a aVar, String str3, String str4, String str5, String str6) {
            this.f23151a = str;
            this.f23152b = j8;
            this.f23153c = str2;
            this.f23154d = map;
            this.f23155e = aVar;
            this.f23156f = str3;
            this.f23157g = str4;
            this.f23158h = str5;
            this.f23159i = str6;
        }

        b(z1.k kVar) {
            this.f23151a = kVar.f();
            this.f23152b = kVar.h();
            this.f23153c = kVar.toString();
            if (kVar.g() != null) {
                this.f23154d = new HashMap();
                for (String str : kVar.g().keySet()) {
                    this.f23154d.put(str, kVar.g().get(str).toString());
                }
            } else {
                this.f23154d = new HashMap();
            }
            if (kVar.a() != null) {
                this.f23155e = new a(kVar.a());
            }
            this.f23156f = kVar.e();
            this.f23157g = kVar.b();
            this.f23158h = kVar.d();
            this.f23159i = kVar.c();
        }

        public String a() {
            return this.f23157g;
        }

        public String b() {
            return this.f23159i;
        }

        public String c() {
            return this.f23158h;
        }

        public String d() {
            return this.f23156f;
        }

        public Map<String, String> e() {
            return this.f23154d;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Objects.equals(this.f23151a, bVar.f23151a) && this.f23152b == bVar.f23152b && Objects.equals(this.f23153c, bVar.f23153c) && Objects.equals(this.f23155e, bVar.f23155e) && Objects.equals(this.f23154d, bVar.f23154d) && Objects.equals(this.f23156f, bVar.f23156f) && Objects.equals(this.f23157g, bVar.f23157g) && Objects.equals(this.f23158h, bVar.f23158h) && Objects.equals(this.f23159i, bVar.f23159i);
        }

        public String f() {
            return this.f23151a;
        }

        public String g() {
            return this.f23153c;
        }

        public a h() {
            return this.f23155e;
        }

        public int hashCode() {
            return Objects.hash(this.f23151a, Long.valueOf(this.f23152b), this.f23153c, this.f23155e, this.f23156f, this.f23157g, this.f23158h, this.f23159i);
        }

        public long i() {
            return this.f23152b;
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f23160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f23161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f23162c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        C0127e f23163d;

        c(int i8, String str, String str2, C0127e c0127e) {
            this.f23160a = i8;
            this.f23161b = str;
            this.f23162c = str2;
            this.f23163d = c0127e;
        }

        c(z1.n nVar) {
            this.f23160a = nVar.a();
            this.f23161b = nVar.b();
            this.f23162c = nVar.c();
            if (nVar.f() != null) {
                this.f23163d = new C0127e(nVar.f());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f23160a == cVar.f23160a && this.f23161b.equals(cVar.f23161b) && Objects.equals(this.f23163d, cVar.f23163d)) {
                return this.f23162c.equals(cVar.f23162c);
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f23160a), this.f23161b, this.f23162c, this.f23163d);
        }
    }

    static abstract class d extends e {
        d(int i8) {
            super(i8);
        }

        abstract void d(boolean z7);

        abstract void e();
    }

    /* JADX INFO: renamed from: io.flutter.plugins.googlemobileads.e$e, reason: collision with other inner class name */
    static class C0127e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f23164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f23165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<b> f23166c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final b f23167d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Map<String, String> f23168e;

        C0127e(String str, String str2, List<b> list, b bVar, Map<String, String> map) {
            this.f23164a = str;
            this.f23165b = str2;
            this.f23166c = list;
            this.f23167d = bVar;
            this.f23168e = map;
        }

        C0127e(z1.w wVar) {
            this.f23164a = wVar.e();
            this.f23165b = wVar.c();
            ArrayList arrayList = new ArrayList();
            Iterator<z1.k> it = wVar.a().iterator();
            while (it.hasNext()) {
                arrayList.add(new b(it.next()));
            }
            this.f23166c = arrayList;
            this.f23167d = wVar.b() != null ? new b(wVar.b()) : null;
            HashMap map = new HashMap();
            if (wVar.d() != null) {
                for (String str : wVar.d().keySet()) {
                    map.put(str, wVar.d().get(str).toString());
                }
            }
            this.f23168e = map;
        }

        List<b> a() {
            return this.f23166c;
        }

        b b() {
            return this.f23167d;
        }

        String c() {
            return this.f23165b;
        }

        Map<String, String> d() {
            return this.f23168e;
        }

        String e() {
            return this.f23164a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0127e)) {
                return false;
            }
            C0127e c0127e = (C0127e) obj;
            return Objects.equals(this.f23164a, c0127e.f23164a) && Objects.equals(this.f23165b, c0127e.f23165b) && Objects.equals(this.f23166c, c0127e.f23166c) && Objects.equals(this.f23167d, c0127e.f23167d);
        }

        public int hashCode() {
            return Objects.hash(this.f23164a, this.f23165b, this.f23166c, this.f23167d);
        }
    }

    e(int i8) {
        this.f23147a = i8;
    }

    abstract void b();

    io.flutter.plugin.platform.k c() {
        return null;
    }
}
