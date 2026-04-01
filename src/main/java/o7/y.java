package o7;

/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m7.c0 f25395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f25396b;

    /* synthetic */ class a extends kotlin.jvm.internal.o implements p6.p<k7.f, Integer, Boolean> {
        a(Object obj) {
            super(2, obj, y.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        public final Boolean e(k7.f p02, int i8) {
            kotlin.jvm.internal.q.f(p02, "p0");
            return Boolean.valueOf(((y) this.receiver).e(p02, i8));
        }

        @Override // p6.p
        public /* bridge */ /* synthetic */ Boolean invoke(k7.f fVar, Integer num) {
            return e(fVar, num.intValue());
        }
    }

    public y(k7.f descriptor) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        this.f25395a = new m7.c0(descriptor, new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(k7.f fVar, int i8) {
        boolean z7 = !fVar.j(i8) && fVar.i(i8).c();
        this.f25396b = z7;
        return z7;
    }

    public final boolean b() {
        return this.f25396b;
    }

    public final void c(int i8) {
        this.f25395a.a(i8);
    }

    public final int d() {
        return this.f25395a.d();
    }
}
