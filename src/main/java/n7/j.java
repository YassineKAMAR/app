package n7;

import e6.i0;
import k7.d;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements i7.b<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f25194a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k7.f f25195b = k7.i.c("kotlinx.serialization.json.JsonElement", d.b.f24249a, new k7.f[0], a.f25196a);

    static final class a extends kotlin.jvm.internal.r implements p6.l<k7.a, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25196a = new a();

        /* JADX INFO: renamed from: n7.j$a$a, reason: collision with other inner class name */
        static final class C0154a extends kotlin.jvm.internal.r implements p6.a<k7.f> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0154a f25197a = new C0154a();

            C0154a() {
                super(0);
            }

            @Override // p6.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k7.f invoke() {
                return w.f25222a.getDescriptor();
            }
        }

        static final class b extends kotlin.jvm.internal.r implements p6.a<k7.f> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f25198a = new b();

            b() {
                super(0);
            }

            @Override // p6.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k7.f invoke() {
                return s.f25211a.getDescriptor();
            }
        }

        static final class c extends kotlin.jvm.internal.r implements p6.a<k7.f> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f25199a = new c();

            c() {
                super(0);
            }

            @Override // p6.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k7.f invoke() {
                return p.f25205a.getDescriptor();
            }
        }

        static final class d extends kotlin.jvm.internal.r implements p6.a<k7.f> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f25200a = new d();

            d() {
                super(0);
            }

            @Override // p6.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k7.f invoke() {
                return u.f25216a.getDescriptor();
            }
        }

        static final class e extends kotlin.jvm.internal.r implements p6.a<k7.f> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f25201a = new e();

            e() {
                super(0);
            }

            @Override // p6.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k7.f invoke() {
                return n7.c.f25163a.getDescriptor();
            }
        }

        a() {
            super(1);
        }

        public final void a(k7.a buildSerialDescriptor) {
            kotlin.jvm.internal.q.f(buildSerialDescriptor, "$this$buildSerialDescriptor");
            k7.a.b(buildSerialDescriptor, "JsonPrimitive", k.f(C0154a.f25197a), null, false, 12, null);
            k7.a.b(buildSerialDescriptor, "JsonNull", k.f(b.f25198a), null, false, 12, null);
            k7.a.b(buildSerialDescriptor, "JsonLiteral", k.f(c.f25199a), null, false, 12, null);
            k7.a.b(buildSerialDescriptor, "JsonObject", k.f(d.f25200a), null, false, 12, null);
            k7.a.b(buildSerialDescriptor, "JsonArray", k.f(e.f25201a), null, false, 12, null);
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(k7.a aVar) {
            a(aVar);
            return i0.f21430a;
        }
    }

    private j() {
    }

    @Override // i7.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public h deserialize(l7.e decoder) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        return k.d(decoder).j();
    }

    @Override // i7.j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(l7.f encoder, h value) {
        i7.a aVar;
        kotlin.jvm.internal.q.f(encoder, "encoder");
        kotlin.jvm.internal.q.f(value, "value");
        k.h(encoder);
        if (value instanceof v) {
            aVar = w.f25222a;
        } else if (value instanceof t) {
            aVar = u.f25216a;
        } else if (!(value instanceof b)) {
            return;
        } else {
            aVar = c.f25163a;
        }
        encoder.q(aVar, value);
    }

    @Override // i7.b, i7.j, i7.a
    public k7.f getDescriptor() {
        return f25195b;
    }
}
