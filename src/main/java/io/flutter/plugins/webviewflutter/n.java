package io.flutter.plugins.webviewflutter;

import android.util.Log;
import io.flutter.plugins.webviewflutter.n;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import s5.a;

/* JADX INFO: loaded from: classes.dex */
public class n {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f23496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f23497b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b f23498c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f23499d;

        /* JADX INFO: renamed from: io.flutter.plugins.webviewflutter.n$a$a, reason: collision with other inner class name */
        public static final class C0128a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Long f23500a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f23501b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private b f23502c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private String f23503d;

            public a a() {
                a aVar = new a();
                aVar.c(this.f23500a);
                aVar.d(this.f23501b);
                aVar.b(this.f23502c);
                aVar.e(this.f23503d);
                return aVar;
            }

            public C0128a b(b bVar) {
                this.f23502c = bVar;
                return this;
            }

            public C0128a c(Long l8) {
                this.f23500a = l8;
                return this;
            }

            public C0128a d(String str) {
                this.f23501b = str;
                return this;
            }

            public C0128a e(String str) {
                this.f23503d = str;
                return this;
            }
        }

        a() {
        }

        static a a(ArrayList<Object> arrayList) {
            Long lValueOf;
            a aVar = new a();
            Object obj = arrayList.get(0);
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            aVar.c(lValueOf);
            aVar.d((String) arrayList.get(1));
            aVar.b(b.values()[((Integer) arrayList.get(2)).intValue()]);
            aVar.e((String) arrayList.get(3));
            return aVar;
        }

        public void b(b bVar) {
            if (bVar == null) {
                throw new IllegalStateException("Nonnull field \"level\" is null.");
            }
            this.f23498c = bVar;
        }

        public void c(Long l8) {
            if (l8 == null) {
                throw new IllegalStateException("Nonnull field \"lineNumber\" is null.");
            }
            this.f23496a = l8;
        }

        public void d(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"message\" is null.");
            }
            this.f23497b = str;
        }

        public void e(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"sourceId\" is null.");
            }
            this.f23499d = str;
        }

        ArrayList<Object> f() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(this.f23496a);
            arrayList.add(this.f23497b);
            b bVar = this.f23498c;
            arrayList.add(bVar == null ? null : Integer.valueOf(bVar.f23511a));
            arrayList.add(this.f23499d);
            return arrayList;
        }
    }

    public interface a0 {
        void a(Long l8);

        void b(Long l8, Boolean bool);

        void c(Long l8, Boolean bool);

        void d(Long l8, Boolean bool);

        void e(Long l8, Boolean bool);

        void f(Long l8, Boolean bool);
    }

    public enum b {
        DEBUG(0),
        ERROR(1),
        LOG(2),
        TIP(3),
        WARNING(4),
        UNKNOWN(5);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f23511a;

        b(int i8) {
            this.f23511a = i8;
        }
    }

    public static final class b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f23512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f23513b;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Long f23514a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f23515b;

            public b0 a() {
                b0 b0Var = new b0();
                b0Var.c(this.f23514a);
                b0Var.b(this.f23515b);
                return b0Var;
            }

            public a b(String str) {
                this.f23515b = str;
                return this;
            }

            public a c(Long l8) {
                this.f23514a = l8;
                return this;
            }
        }

        b0() {
        }

        static b0 a(ArrayList<Object> arrayList) {
            Long lValueOf;
            b0 b0Var = new b0();
            Object obj = arrayList.get(0);
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            b0Var.c(lValueOf);
            b0Var.b((String) arrayList.get(1));
            return b0Var;
        }

        public void b(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"description\" is null.");
            }
            this.f23513b = str;
        }

        public void c(Long l8) {
            if (l8 == null) {
                throw new IllegalStateException("Nonnull field \"errorCode\" is null.");
            }
            this.f23512a = l8;
        }

        ArrayList<Object> d() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.f23512a);
            arrayList.add(this.f23513b);
            return arrayList;
        }
    }

    public interface c {
        void a(Long l8, w<Boolean> wVar);

        void b(Long l8);

        void c(Long l8, Long l9, Boolean bool);

        void d(Long l8, String str, String str2);
    }

    public static final class c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f23516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Boolean f23517b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Boolean f23518c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Boolean f23519d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f23520e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map<String, String> f23521f;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f23522a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Boolean f23523b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Boolean f23524c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private Boolean f23525d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private String f23526e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private Map<String, String> f23527f;

            public c0 a() {
                c0 c0Var = new c0();
                c0Var.g(this.f23522a);
                c0Var.c(this.f23523b);
                c0Var.d(this.f23524c);
                c0Var.b(this.f23525d);
                c0Var.e(this.f23526e);
                c0Var.f(this.f23527f);
                return c0Var;
            }

            public a b(Boolean bool) {
                this.f23525d = bool;
                return this;
            }

            public a c(Boolean bool) {
                this.f23523b = bool;
                return this;
            }

            public a d(Boolean bool) {
                this.f23524c = bool;
                return this;
            }

            public a e(String str) {
                this.f23526e = str;
                return this;
            }

            public a f(Map<String, String> map) {
                this.f23527f = map;
                return this;
            }

            public a g(String str) {
                this.f23522a = str;
                return this;
            }
        }

        c0() {
        }

        static c0 a(ArrayList<Object> arrayList) {
            c0 c0Var = new c0();
            c0Var.g((String) arrayList.get(0));
            c0Var.c((Boolean) arrayList.get(1));
            c0Var.d((Boolean) arrayList.get(2));
            c0Var.b((Boolean) arrayList.get(3));
            c0Var.e((String) arrayList.get(4));
            c0Var.f((Map) arrayList.get(5));
            return c0Var;
        }

        public void b(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"hasGesture\" is null.");
            }
            this.f23519d = bool;
        }

        public void c(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"isForMainFrame\" is null.");
            }
            this.f23517b = bool;
        }

        public void d(Boolean bool) {
            this.f23518c = bool;
        }

        public void e(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"method\" is null.");
            }
            this.f23520e = str;
        }

        public void f(Map<String, String> map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"requestHeaders\" is null.");
            }
            this.f23521f = map;
        }

        public void g(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"url\" is null.");
            }
            this.f23516a = str;
        }

        ArrayList<Object> h() {
            ArrayList<Object> arrayList = new ArrayList<>(6);
            arrayList.add(this.f23516a);
            arrayList.add(this.f23517b);
            arrayList.add(this.f23518c);
            arrayList.add(this.f23519d);
            arrayList.add(this.f23520e);
            arrayList.add(this.f23521f);
            return arrayList;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s5.c f23528a;

        public interface a<T> {
            void a(T t7);
        }

        public d(s5.c cVar) {
            this.f23528a = cVar;
        }

        static s5.i<Object> c() {
            return new s5.s();
        }

        public void b(Long l8, final a<Void> aVar) {
            new s5.a(this.f23528a, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallbackFlutterApi.create", c()).d(new ArrayList(Collections.singletonList(l8)), new a.e() { // from class: io.flutter.plugins.webviewflutter.t
                @Override // s5.a.e
                public final void a(Object obj) {
                    aVar.a(null);
                }
            });
        }
    }

    public interface d0 {
        String a(Long l8);

        void b(Long l8, Boolean bool);

        void c(Long l8, Boolean bool);

        void d(Long l8, Long l9);

        void e(Long l8, Boolean bool);

        void f(Long l8, Boolean bool);

        void g(Long l8, Long l9);

        void h(Long l8, Boolean bool);

        void i(Long l8, Boolean bool);

        void j(Long l8, Boolean bool);

        void k(Long l8, Boolean bool);

        void l(Long l8, Boolean bool);

        void m(Long l8, String str);

        void n(Long l8, Boolean bool);

        void o(Long l8, Boolean bool);
    }

    public interface e {
        void a(Long l8);
    }

    public interface e0 {
        void a(Long l8);

        void b(Long l8);
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s5.c f23529a;

        public interface a<T> {
            void a(T t7);
        }

        public f(s5.c cVar) {
            this.f23529a = cVar;
        }

        static s5.i<Object> b() {
            return new s5.s();
        }

        public void d(Long l8, String str, String str2, String str3, String str4, Long l9, final a<Void> aVar) {
            new s5.a(this.f23529a, "dev.flutter.pigeon.webview_flutter_android.DownloadListenerFlutterApi.onDownloadStart", b()).d(new ArrayList(Arrays.asList(l8, str, str2, str3, str4, l9)), new a.e() { // from class: io.flutter.plugins.webviewflutter.w
                @Override // s5.a.e
                public final void a(Object obj) {
                    aVar.a(null);
                }
            });
        }
    }

    public static class f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s5.c f23530a;

        public interface a<T> {
            void a(T t7);
        }

        public f0(s5.c cVar) {
            this.f23530a = cVar;
        }

        static s5.i<Object> j() {
            return g0.f23531d;
        }

        public void i(Long l8, Long l9, String str, Boolean bool, final a<Void> aVar) {
            new s5.a(this.f23530a, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.doUpdateVisitedHistory", j()).d(new ArrayList(Arrays.asList(l8, l9, str, bool)), new a.e() { // from class: io.flutter.plugins.webviewflutter.o2
                @Override // s5.a.e
                public final void a(Object obj) {
                    aVar.a(null);
                }
            });
        }

        public void s(Long l8, Long l9, String str, final a<Void> aVar) {
            new s5.a(this.f23530a, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.onPageFinished", j()).d(new ArrayList(Arrays.asList(l8, l9, str)), new a.e() { // from class: io.flutter.plugins.webviewflutter.n2
                @Override // s5.a.e
                public final void a(Object obj) {
                    aVar.a(null);
                }
            });
        }

        public void t(Long l8, Long l9, String str, final a<Void> aVar) {
            new s5.a(this.f23530a, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.onPageStarted", j()).d(new ArrayList(Arrays.asList(l8, l9, str)), new a.e() { // from class: io.flutter.plugins.webviewflutter.l2
                @Override // s5.a.e
                public final void a(Object obj) {
                    aVar.a(null);
                }
            });
        }

        public void u(Long l8, Long l9, Long l10, String str, String str2, final a<Void> aVar) {
            new s5.a(this.f23530a, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.onReceivedError", j()).d(new ArrayList(Arrays.asList(l8, l9, l10, str, str2)), new a.e() { // from class: io.flutter.plugins.webviewflutter.p2
                @Override // s5.a.e
                public final void a(Object obj) {
                    aVar.a(null);
                }
            });
        }

        public void v(Long l8, Long l9, Long l10, String str, String str2, final a<Void> aVar) {
            new s5.a(this.f23530a, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.onReceivedHttpAuthRequest", j()).d(new ArrayList(Arrays.asList(l8, l9, l10, str, str2)), new a.e() { // from class: io.flutter.plugins.webviewflutter.q2
                @Override // s5.a.e
                public final void a(Object obj) {
                    aVar.a(null);
                }
            });
        }

        public void w(Long l8, Long l9, c0 c0Var, b0 b0Var, final a<Void> aVar) {
            new s5.a(this.f23530a, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.onReceivedRequestError", j()).d(new ArrayList(Arrays.asList(l8, l9, c0Var, b0Var)), new a.e() { // from class: io.flutter.plugins.webviewflutter.j2
                @Override // s5.a.e
                public final void a(Object obj) {
                    aVar.a(null);
                }
            });
        }

        public void x(Long l8, Long l9, c0 c0Var, final a<Void> aVar) {
            new s5.a(this.f23530a, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.requestLoading", j()).d(new ArrayList(Arrays.asList(l8, l9, c0Var)), new a.e() { // from class: io.flutter.plugins.webviewflutter.k2
                @Override // s5.a.e
                public final void a(Object obj) {
                    aVar.a(null);
                }
            });
        }

        public void y(Long l8, Long l9, String str, final a<Void> aVar) {
            new s5.a(this.f23530a, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.urlLoading", j()).d(new ArrayList(Arrays.asList(l8, l9, str)), new a.e() { // from class: io.flutter.plugins.webviewflutter.m2
                @Override // s5.a.e
                public final void a(Object obj) {
                    aVar.a(null);
                }
            });
        }
    }

    public interface g {
        void a(Long l8);
    }

    private static class g0 extends s5.s {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final g0 f23531d = new g0();

        private g0() {
        }

        @Override // s5.s
        protected Object g(byte b8, ByteBuffer byteBuffer) {
            return b8 != -128 ? b8 != -127 ? super.g(b8, byteBuffer) : c0.a((ArrayList) f(byteBuffer)) : b0.a((ArrayList) f(byteBuffer));
        }

        @Override // s5.s
        protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            ArrayList<Object> arrayListH;
            if (obj instanceof b0) {
                byteArrayOutputStream.write(128);
                arrayListH = ((b0) obj).d();
            } else if (!(obj instanceof c0)) {
                super.p(byteArrayOutputStream, obj);
                return;
            } else {
                byteArrayOutputStream.write(129);
                arrayListH = ((c0) obj).h();
            }
            p(byteArrayOutputStream, arrayListH);
        }
    }

    public enum h {
        OPEN(0),
        OPEN_MULTIPLE(1),
        SAVE(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f23536a;

        h(int i8) {
            this.f23536a = i8;
        }
    }

    public interface h0 {
        void a(Long l8);

        void b(Long l8, Boolean bool);
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s5.c f23537a;

        public interface a<T> {
            void a(T t7);
        }

        public i(s5.c cVar) {
            this.f23537a = cVar;
        }

        static s5.i<Object> c() {
            return new s5.s();
        }

        public void b(Long l8, Boolean bool, List<String> list, h hVar, String str, final a<Void> aVar) {
            new s5.a(this.f23537a, "dev.flutter.pigeon.webview_flutter_android.FileChooserParamsFlutterApi.create", c()).d(new ArrayList(Arrays.asList(l8, bool, list, Integer.valueOf(hVar.f23536a), str)), new a.e() { // from class: io.flutter.plugins.webviewflutter.z
                @Override // s5.a.e
                public final void a(Object obj) {
                    aVar.a(null);
                }
            });
        }
    }

    public static class i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s5.c f23538a;

        public interface a<T> {
            void a(T t7);
        }

        public i0(s5.c cVar) {
            this.f23538a = cVar;
        }

        static s5.i<Object> c() {
            return new s5.s();
        }

        public void b(Long l8, final a<Void> aVar) {
            new s5.a(this.f23538a, "dev.flutter.pigeon.webview_flutter_android.WebViewFlutterApi.create", c()).d(new ArrayList(Collections.singletonList(l8)), new a.e() { // from class: io.flutter.plugins.webviewflutter.u2
                @Override // s5.a.e
                public final void a(Object obj) {
                    aVar.a(null);
                }
            });
        }
    }

    public interface j {
        String a(String str);

        List<String> b(String str);
    }

    public interface j0 {
        void a(Long l8);

        Long b(Long l8);

        void c(Long l8, String str, String str2, String str3);

        void d(Long l8, Long l9);

        void e(Boolean bool);

        void f(Long l8, Long l9);

        void g(Long l8);

        void h(Long l8, String str, Map<String, String> map);

        void i(Long l8, Boolean bool);

        void j(Long l8, String str, w<String> wVar);

        void k(Long l8, Long l9, Long l10);

        void l(Long l8, Long l9);

        Long m(Long l8);

        l0 n(Long l8);

        String o(Long l8);

        void p(Long l8);

        Boolean q(Long l8);

        void r(Long l8, String str, String str2, String str3, String str4, String str5);

        void s(Long l8);

        void t(Long l8, Long l9);

        void u(Long l8, Long l9);

        Boolean v(Long l8);

        String w(Long l8);

        void x(Long l8, String str, byte[] bArr);

        void y(Long l8, Long l9, Long l10);

        void z(Long l8, Long l9);
    }

    public static class k extends RuntimeException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f23540b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class k0 extends s5.s {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final k0 f23541d = new k0();

        private k0() {
        }

        @Override // s5.s
        protected Object g(byte b8, ByteBuffer byteBuffer) {
            return b8 != -128 ? super.g(b8, byteBuffer) : l0.a((ArrayList) f(byteBuffer));
        }

        @Override // s5.s
        protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (!(obj instanceof l0)) {
                super.p(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(128);
                p(byteArrayOutputStream, ((l0) obj).d());
            }
        }
    }

    public static class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s5.c f23542a;

        public interface a<T> {
            void a(T t7);
        }

        public l(s5.c cVar) {
            this.f23542a = cVar;
        }

        static s5.i<Object> c() {
            return new s5.s();
        }

        public void b(Long l8, final a<Void> aVar) {
            new s5.a(this.f23542a, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallbackFlutterApi.create", c()).d(new ArrayList(Collections.singletonList(l8)), new a.e() { // from class: io.flutter.plugins.webviewflutter.d0
                @Override // s5.a.e
                public final void a(Object obj) {
                    aVar.a(null);
                }
            });
        }
    }

    public static final class l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f23543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f23544b;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Long f23545a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Long f23546b;

            public l0 a() {
                l0 l0Var = new l0();
                l0Var.b(this.f23545a);
                l0Var.c(this.f23546b);
                return l0Var;
            }

            public a b(Long l8) {
                this.f23545a = l8;
                return this;
            }

            public a c(Long l8) {
                this.f23546b = l8;
                return this;
            }
        }

        l0() {
        }

        static l0 a(ArrayList<Object> arrayList) {
            Long lValueOf;
            l0 l0Var = new l0();
            Object obj = arrayList.get(0);
            Long lValueOf2 = null;
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            l0Var.b(lValueOf);
            Object obj2 = arrayList.get(1);
            if (obj2 != null) {
                lValueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            l0Var.c(lValueOf2);
            return l0Var;
        }

        public void b(Long l8) {
            if (l8 == null) {
                throw new IllegalStateException("Nonnull field \"x\" is null.");
            }
            this.f23543a = l8;
        }

        public void c(Long l8) {
            if (l8 == null) {
                throw new IllegalStateException("Nonnull field \"y\" is null.");
            }
            this.f23544b = l8;
        }

        ArrayList<Object> d() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.f23543a);
            arrayList.add(this.f23544b);
            return arrayList;
        }
    }

    public interface m {
        void a(Long l8, String str, Boolean bool, Boolean bool2);
    }

    /* JADX INFO: renamed from: io.flutter.plugins.webviewflutter.n$n, reason: collision with other inner class name */
    public static class C0129n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s5.c f23547a;

        /* JADX INFO: renamed from: io.flutter.plugins.webviewflutter.n$n$a */
        public interface a<T> {
            void a(T t7);
        }

        public C0129n(s5.c cVar) {
            this.f23547a = cVar;
        }

        static s5.i<Object> c() {
            return new s5.s();
        }

        public void b(Long l8, final a<Void> aVar) {
            new s5.a(this.f23547a, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandlerFlutterApi.create", c()).d(new ArrayList(Collections.singletonList(l8)), new a.e() { // from class: io.flutter.plugins.webviewflutter.g0
                @Override // s5.a.e
                public final void a(Object obj) {
                    aVar.a(null);
                }
            });
        }
    }

    public interface o {
        void a(Long l8);

        Boolean b(Long l8);

        void c(Long l8, String str, String str2);
    }

    public interface p {
        void clear();
    }

    public static class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s5.c f23548a;

        public interface a<T> {
            void a(T t7);
        }

        public q(s5.c cVar) {
            this.f23548a = cVar;
        }

        static s5.i<Object> c() {
            return new s5.s();
        }

        public void b(Long l8, final a<Void> aVar) {
            new s5.a(this.f23548a, "dev.flutter.pigeon.webview_flutter_android.JavaObjectFlutterApi.dispose", c()).d(new ArrayList(Collections.singletonList(l8)), new a.e() { // from class: io.flutter.plugins.webviewflutter.n0
                @Override // s5.a.e
                public final void a(Object obj) {
                    aVar.a(null);
                }
            });
        }
    }

    public interface r {
        void a(Long l8);
    }

    public static class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s5.c f23549a;

        public interface a<T> {
            void a(T t7);
        }

        public s(s5.c cVar) {
            this.f23549a = cVar;
        }

        static s5.i<Object> b() {
            return new s5.s();
        }

        public void d(Long l8, String str, final a<Void> aVar) {
            new s5.a(this.f23549a, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannelFlutterApi.postMessage", b()).d(new ArrayList(Arrays.asList(l8, str)), new a.e() { // from class: io.flutter.plugins.webviewflutter.q0
                @Override // s5.a.e
                public final void a(Object obj) {
                    aVar.a(null);
                }
            });
        }
    }

    public interface t {
        void a(Long l8, String str);
    }

    public static class u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s5.c f23550a;

        public interface a<T> {
            void a(T t7);
        }

        public u(s5.c cVar) {
            this.f23550a = cVar;
        }

        static s5.i<Object> c() {
            return new s5.s();
        }

        public void b(Long l8, List<String> list, final a<Void> aVar) {
            new s5.a(this.f23550a, "dev.flutter.pigeon.webview_flutter_android.PermissionRequestFlutterApi.create", c()).d(new ArrayList(Arrays.asList(l8, list)), new a.e() { // from class: io.flutter.plugins.webviewflutter.t0
                @Override // s5.a.e
                public final void a(Object obj) {
                    aVar.a(null);
                }
            });
        }
    }

    public interface v {
        void a(Long l8, List<String> list);

        void b(Long l8);
    }

    public interface w<T> {
        void a(T t7);
    }

    public static class x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s5.c f23551a;

        public interface a<T> {
            void a(T t7);
        }

        public x(s5.c cVar) {
            this.f23551a = cVar;
        }

        static s5.i<Object> c() {
            return new s5.s();
        }

        public void b(Long l8, final a<Void> aVar) {
            new s5.a(this.f23551a, "dev.flutter.pigeon.webview_flutter_android.ViewFlutterApi.create", c()).d(new ArrayList(Collections.singletonList(l8)), new a.e() { // from class: io.flutter.plugins.webviewflutter.x0
                @Override // s5.a.e
                public final void a(Object obj) {
                    aVar.a(null);
                }
            });
        }
    }

    public static class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s5.c f23552a;

        public interface a<T> {
            void a(T t7);
        }

        public y(s5.c cVar) {
            this.f23552a = cVar;
        }

        static s5.i<Object> l() {
            return z.f23553d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void r(a aVar, Object obj) {
            aVar.a((Boolean) obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void s(a aVar, Object obj) {
            aVar.a((String) obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void w(a aVar, Object obj) {
            aVar.a((List) obj);
        }

        public void A(Long l8, final a<Void> aVar) {
            new s5.a(this.f23552a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onHideCustomView", l()).d(new ArrayList(Collections.singletonList(l8)), new a.e() { // from class: io.flutter.plugins.webviewflutter.b1
                @Override // s5.a.e
                public final void a(Object obj) {
                    aVar.a(null);
                }
            });
        }

        public void B(Long l8, String str, String str2, final a<Void> aVar) {
            new s5.a(this.f23552a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onJsAlert", l()).d(new ArrayList(Arrays.asList(l8, str, str2)), new a.e() { // from class: io.flutter.plugins.webviewflutter.e1
                @Override // s5.a.e
                public final void a(Object obj) {
                    aVar.a(null);
                }
            });
        }

        public void C(Long l8, String str, String str2, final a<Boolean> aVar) {
            new s5.a(this.f23552a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onJsConfirm", l()).d(new ArrayList(Arrays.asList(l8, str, str2)), new a.e() { // from class: io.flutter.plugins.webviewflutter.a1
                @Override // s5.a.e
                public final void a(Object obj) {
                    n.y.r(aVar, obj);
                }
            });
        }

        public void D(Long l8, String str, String str2, String str3, final a<String> aVar) {
            new s5.a(this.f23552a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onJsPrompt", l()).d(new ArrayList(Arrays.asList(l8, str, str2, str3)), new a.e() { // from class: io.flutter.plugins.webviewflutter.y0
                @Override // s5.a.e
                public final void a(Object obj) {
                    n.y.s(aVar, obj);
                }
            });
        }

        public void E(Long l8, Long l9, final a<Void> aVar) {
            new s5.a(this.f23552a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onPermissionRequest", l()).d(new ArrayList(Arrays.asList(l8, l9)), new a.e() { // from class: io.flutter.plugins.webviewflutter.f1
                @Override // s5.a.e
                public final void a(Object obj) {
                    aVar.a(null);
                }
            });
        }

        public void F(Long l8, Long l9, Long l10, final a<Void> aVar) {
            new s5.a(this.f23552a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onProgressChanged", l()).d(new ArrayList(Arrays.asList(l8, l9, l10)), new a.e() { // from class: io.flutter.plugins.webviewflutter.h1
                @Override // s5.a.e
                public final void a(Object obj) {
                    aVar.a(null);
                }
            });
        }

        public void G(Long l8, Long l9, Long l10, final a<Void> aVar) {
            new s5.a(this.f23552a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onShowCustomView", l()).d(new ArrayList(Arrays.asList(l8, l9, l10)), new a.e() { // from class: io.flutter.plugins.webviewflutter.z0
                @Override // s5.a.e
                public final void a(Object obj) {
                    aVar.a(null);
                }
            });
        }

        public void H(Long l8, Long l9, Long l10, final a<List<String>> aVar) {
            new s5.a(this.f23552a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onShowFileChooser", l()).d(new ArrayList(Arrays.asList(l8, l9, l10)), new a.e() { // from class: io.flutter.plugins.webviewflutter.i1
                @Override // s5.a.e
                public final void a(Object obj) {
                    n.y.w(aVar, obj);
                }
            });
        }

        public void x(Long l8, a aVar, final a<Void> aVar2) {
            new s5.a(this.f23552a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onConsoleMessage", l()).d(new ArrayList(Arrays.asList(l8, aVar)), new a.e() { // from class: io.flutter.plugins.webviewflutter.d1
                @Override // s5.a.e
                public final void a(Object obj) {
                    aVar2.a(null);
                }
            });
        }

        public void y(Long l8, final a<Void> aVar) {
            new s5.a(this.f23552a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onGeolocationPermissionsHidePrompt", l()).d(new ArrayList(Collections.singletonList(l8)), new a.e() { // from class: io.flutter.plugins.webviewflutter.c1
                @Override // s5.a.e
                public final void a(Object obj) {
                    aVar.a(null);
                }
            });
        }

        public void z(Long l8, Long l9, String str, final a<Void> aVar) {
            new s5.a(this.f23552a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onGeolocationPermissionsShowPrompt", l()).d(new ArrayList(Arrays.asList(l8, l9, str)), new a.e() { // from class: io.flutter.plugins.webviewflutter.g1
                @Override // s5.a.e
                public final void a(Object obj) {
                    aVar.a(null);
                }
            });
        }
    }

    private static class z extends s5.s {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final z f23553d = new z();

        private z() {
        }

        @Override // s5.s
        protected Object g(byte b8, ByteBuffer byteBuffer) {
            return b8 != -128 ? super.g(b8, byteBuffer) : a.a((ArrayList) f(byteBuffer));
        }

        @Override // s5.s
        protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (!(obj instanceof a)) {
                super.p(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(128);
                p(byteArrayOutputStream, ((a) obj).f());
            }
        }
    }

    protected static ArrayList<Object> a(Throwable th) {
        Object obj;
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof k) {
            k kVar = (k) th;
            arrayList.add(kVar.f23539a);
            arrayList.add(kVar.getMessage());
            obj = kVar.f23540b;
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            obj = "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th);
        }
        arrayList.add(obj);
        return arrayList;
    }
}
