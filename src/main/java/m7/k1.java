package m7;

import java.lang.annotation.Annotation;
import java.util.List;
import k7.k;

/* JADX INFO: loaded from: classes2.dex */
public final class k1<T> implements i7.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f24952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<? extends Annotation> f24953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e6.k f24954c;

    static final class a extends kotlin.jvm.internal.r implements p6.a<k7.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f24955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1<T> f24956b;

        /* JADX INFO: renamed from: m7.k1$a$a, reason: collision with other inner class name */
        static final class C0150a extends kotlin.jvm.internal.r implements p6.l<k7.a, e6.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ k1<T> f24957a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0150a(k1<T> k1Var) {
                super(1);
                this.f24957a = k1Var;
            }

            public final void a(k7.a buildSerialDescriptor) {
                kotlin.jvm.internal.q.f(buildSerialDescriptor, "$this$buildSerialDescriptor");
                buildSerialDescriptor.h(((k1) this.f24957a).f24953b);
            }

            @Override // p6.l
            public /* bridge */ /* synthetic */ e6.i0 invoke(k7.a aVar) {
                a(aVar);
                return e6.i0.f21430a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, k1<T> k1Var) {
            super(0);
            this.f24955a = str;
            this.f24956b = k1Var;
        }

        @Override // p6.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k7.f invoke() {
            return k7.i.c(this.f24955a, k.d.f24285a, new k7.f[0], new C0150a(this.f24956b));
        }
    }

    public k1(String serialName, T objectInstance) {
        kotlin.jvm.internal.q.f(serialName, "serialName");
        kotlin.jvm.internal.q.f(objectInstance, "objectInstance");
        this.f24952a = objectInstance;
        this.f24953b = f6.o.d();
        this.f24954c = e6.m.a(e6.o.f21436b, new a(serialName, this));
    }

    @Override // i7.a
    public T deserialize(l7.e decoder) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        k7.f descriptor = getDescriptor();
        l7.c cVarC = decoder.c(descriptor);
        int iS = cVarC.s(getDescriptor());
        if (iS == -1) {
            e6.i0 i0Var = e6.i0.f21430a;
            cVarC.d(descriptor);
            return this.f24952a;
        }
        throw new i7.i("Unexpected index " + iS);
    }

    @Override // i7.b, i7.j, i7.a
    public k7.f getDescriptor() {
        return (k7.f) this.f24954c.getValue();
    }

    @Override // i7.j
    public void serialize(l7.f encoder, T value) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        kotlin.jvm.internal.q.f(value, "value");
        encoder.c(getDescriptor()).d(getDescriptor());
    }
}
