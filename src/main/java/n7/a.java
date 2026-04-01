package n7;

import o7.f0;
import o7.g0;
import o7.r0;
import o7.u0;
import o7.x0;
import o7.y0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements i7.n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0153a f25157d = new C0153a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f25158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p7.c f25159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o7.v f25160c;

    /* JADX INFO: renamed from: n7.a$a, reason: collision with other inner class name */
    public static final class C0153a extends a {
        private C0153a() {
            super(new f(false, false, false, false, false, false, null, false, false, null, false, false, 4095, null), p7.d.a(), null);
        }

        public /* synthetic */ C0153a(kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    private a(f fVar, p7.c cVar) {
        this.f25158a = fVar;
        this.f25159b = cVar;
        this.f25160c = new o7.v();
    }

    public /* synthetic */ a(f fVar, p7.c cVar, kotlin.jvm.internal.j jVar) {
        this(fVar, cVar);
    }

    @Override // i7.g
    public p7.c a() {
        return this.f25159b;
    }

    @Override // i7.n
    public final <T> String b(i7.j<? super T> serializer, T t7) {
        kotlin.jvm.internal.q.f(serializer, "serializer");
        g0 g0Var = new g0();
        try {
            f0.a(this, g0Var, serializer, t7);
            return g0Var.toString();
        } finally {
            g0Var.g();
        }
    }

    @Override // i7.n
    public final <T> T c(i7.a<T> deserializer, String string) {
        kotlin.jvm.internal.q.f(deserializer, "deserializer");
        kotlin.jvm.internal.q.f(string, "string");
        u0 u0Var = new u0(string);
        T t7 = (T) new r0(this, y0.OBJ, u0Var, deserializer.getDescriptor(), null).e(deserializer);
        u0Var.w();
        return t7;
    }

    public final <T> h d(i7.j<? super T> serializer, T t7) {
        kotlin.jvm.internal.q.f(serializer, "serializer");
        return x0.c(this, t7, serializer);
    }

    public final f e() {
        return this.f25158a;
    }

    public final o7.v f() {
        return this.f25160c;
    }
}
