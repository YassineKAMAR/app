package r5;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r5.l;
import s5.k;
import s5.t;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s5.k f26001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f26002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k.c f26003c;

    class a implements k.c {
        a() {
        }

        private void b(s5.j jVar, k.d dVar) {
            try {
                l.this.f26002b.g(((Integer) jVar.b()).intValue());
                dVar.a(null);
            } catch (IllegalStateException e8) {
                dVar.b("error", l.c(e8), null);
            }
        }

        private void c(s5.j jVar, k.d dVar) {
            Map map = (Map) jVar.b();
            boolean z7 = true;
            boolean z8 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
            ByteBuffer byteBufferWrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
            try {
                if (z8) {
                    l.this.f26002b.h(new d(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), d.a.HYBRID_ONLY, byteBufferWrap));
                } else {
                    if (!map.containsKey("hybridFallback") || !((Boolean) map.get("hybridFallback")).booleanValue()) {
                        z7 = false;
                    }
                    long jD = l.this.f26002b.d(new d(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), z7 ? d.a.TEXTURE_WITH_HYBRID_FALLBACK : d.a.TEXTURE_WITH_VIRTUAL_FALLBACK, byteBufferWrap));
                    if (jD != -2) {
                        dVar.a(Long.valueOf(jD));
                        return;
                    } else if (!z7) {
                        throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                    }
                }
                dVar.a(null);
            } catch (IllegalStateException e8) {
                dVar.b("error", l.c(e8), null);
            }
        }

        private void d(s5.j jVar, k.d dVar) {
            try {
                l.this.f26002b.i(((Integer) ((Map) jVar.b()).get("id")).intValue());
                dVar.a(null);
            } catch (IllegalStateException e8) {
                dVar.b("error", l.c(e8), null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(k.d dVar, c cVar) {
            if (cVar == null) {
                dVar.b("error", "Failed to resize the platform view", null);
                return;
            }
            HashMap map = new HashMap();
            map.put("width", Double.valueOf(cVar.f26005a));
            map.put("height", Double.valueOf(cVar.f26006b));
            dVar.a(map);
        }

        private void f(s5.j jVar, k.d dVar) {
            Map map = (Map) jVar.b();
            try {
                l.this.f26002b.f(((Integer) map.get("id")).intValue(), ((Double) map.get("top")).doubleValue(), ((Double) map.get("left")).doubleValue());
                dVar.a(null);
            } catch (IllegalStateException e8) {
                dVar.b("error", l.c(e8), null);
            }
        }

        private void g(s5.j jVar, final k.d dVar) {
            Map map = (Map) jVar.b();
            try {
                l.this.f26002b.e(new e(((Integer) map.get("id")).intValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue()), new b() { // from class: r5.k
                    @Override // r5.l.b
                    public final void a(l.c cVar) {
                        l.a.e(dVar, cVar);
                    }
                });
            } catch (IllegalStateException e8) {
                dVar.b("error", l.c(e8), null);
            }
        }

        private void h(s5.j jVar, k.d dVar) {
            Map map = (Map) jVar.b();
            try {
                l.this.f26002b.b(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
                dVar.a(null);
            } catch (IllegalStateException e8) {
                dVar.b("error", l.c(e8), null);
            }
        }

        private void i(s5.j jVar, k.d dVar) {
            try {
                l.this.f26002b.a(((Boolean) jVar.b()).booleanValue());
                dVar.a(null);
            } catch (IllegalStateException e8) {
                dVar.b("error", l.c(e8), null);
            }
        }

        private void j(s5.j jVar, k.d dVar) {
            k.d dVar2;
            List list = (List) jVar.b();
            try {
                l.this.f26002b.c(new f(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                dVar2 = dVar;
                try {
                    dVar2.a(null);
                } catch (IllegalStateException e8) {
                    e = e8;
                    dVar2.b("error", l.c(e), null);
                }
            } catch (IllegalStateException e9) {
                e = e9;
                dVar2 = dVar;
            }
        }

        @Override // s5.k.c
        public void onMethodCall(s5.j jVar, k.d dVar) {
            if (l.this.f26002b == null) {
            }
            g5.b.f("PlatformViewsChannel", "Received '" + jVar.f26252a + "' message.");
            String str = jVar.f26252a;
            str.hashCode();
            switch (str) {
                case "create":
                    c(jVar, dVar);
                    break;
                case "offset":
                    f(jVar, dVar);
                    break;
                case "resize":
                    g(jVar, dVar);
                    break;
                case "clearFocus":
                    b(jVar, dVar);
                    break;
                case "synchronizeToNativeViewHierarchy":
                    i(jVar, dVar);
                    break;
                case "touch":
                    j(jVar, dVar);
                    break;
                case "setDirection":
                    h(jVar, dVar);
                    break;
                case "dispose":
                    d(jVar, dVar);
                    break;
                default:
                    dVar.c();
                    break;
            }
        }
    }

    public interface b {
        void a(c cVar);
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f26006b;

        public c(int i8, int i9) {
            this.f26005a = i8;
            this.f26006b = i9;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f26008b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f26009c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final double f26010d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final double f26011e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final double f26012f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f26013g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final a f26014h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final ByteBuffer f26015i;

        public enum a {
            TEXTURE_WITH_VIRTUAL_FALLBACK,
            TEXTURE_WITH_HYBRID_FALLBACK,
            HYBRID_ONLY
        }

        public d(int i8, String str, double d8, double d9, double d10, double d11, int i9, a aVar, ByteBuffer byteBuffer) {
            this.f26007a = i8;
            this.f26008b = str;
            this.f26011e = d8;
            this.f26012f = d9;
            this.f26009c = d10;
            this.f26010d = d11;
            this.f26013g = i9;
            this.f26014h = aVar;
            this.f26015i = byteBuffer;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f26021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f26022c;

        public e(int i8, double d8, double d9) {
            this.f26020a = i8;
            this.f26021b = d8;
            this.f26022c = d9;
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Number f26024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Number f26025c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f26026d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f26027e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Object f26028f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Object f26029g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f26030h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f26031i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final float f26032j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final float f26033k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f26034l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f26035m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f26036n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f26037o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final long f26038p;

        public f(int i8, Number number, Number number2, int i9, int i10, Object obj, Object obj2, int i11, int i12, float f8, float f9, int i13, int i14, int i15, int i16, long j8) {
            this.f26023a = i8;
            this.f26024b = number;
            this.f26025c = number2;
            this.f26026d = i9;
            this.f26027e = i10;
            this.f26028f = obj;
            this.f26029g = obj2;
            this.f26030h = i11;
            this.f26031i = i12;
            this.f26032j = f8;
            this.f26033k = f9;
            this.f26034l = i13;
            this.f26035m = i14;
            this.f26036n = i15;
            this.f26037o = i16;
            this.f26038p = j8;
        }
    }

    public interface g {
        void a(boolean z7);

        void b(int i8, int i9);

        void c(f fVar);

        long d(d dVar);

        void e(e eVar, b bVar);

        void f(int i8, double d8, double d9);

        void g(int i8);

        void h(d dVar);

        void i(int i8);
    }

    public l(h5.a aVar) {
        a aVar2 = new a();
        this.f26003c = aVar2;
        s5.k kVar = new s5.k(aVar, "flutter/platform_views", t.f26267b);
        this.f26001a = kVar;
        kVar.e(aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(Exception exc) {
        return g5.b.d(exc);
    }

    public void d(int i8) {
        s5.k kVar = this.f26001a;
        if (kVar == null) {
            return;
        }
        kVar.c("viewFocused", Integer.valueOf(i8));
    }

    public void e(g gVar) {
        this.f26002b = gVar;
    }
}
