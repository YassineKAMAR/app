package i7;

import e6.i0;
import java.lang.annotation.Annotation;
import java.util.List;
import k7.d;
import k7.j;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;

/* JADX INFO: loaded from: classes2.dex */
public final class e<T> extends m7.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u6.c<T> f22567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<? extends Annotation> f22568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e6.k f22569c;

    static final class a extends r implements p6.a<k7.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e<T> f22570a;

        /* JADX INFO: renamed from: i7.e$a$a, reason: collision with other inner class name */
        static final class C0122a extends r implements p6.l<k7.a, i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e<T> f22571a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0122a(e<T> eVar) {
                super(1);
                this.f22571a = eVar;
            }

            public final void a(k7.a buildSerialDescriptor) {
                q.f(buildSerialDescriptor, "$this$buildSerialDescriptor");
                k7.a.b(buildSerialDescriptor, "type", j7.a.G(c0.f24298a).getDescriptor(), null, false, 12, null);
                k7.a.b(buildSerialDescriptor, "value", k7.i.d("kotlinx.serialization.Polymorphic<" + this.f22571a.e().b() + '>', j.a.f24280a, new k7.f[0], null, 8, null), null, false, 12, null);
                buildSerialDescriptor.h(((e) this.f22571a).f22568b);
            }

            @Override // p6.l
            public /* bridge */ /* synthetic */ i0 invoke(k7.a aVar) {
                a(aVar);
                return i0.f21430a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e<T> eVar) {
            super(0);
            this.f22570a = eVar;
        }

        @Override // p6.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k7.f invoke() {
            return k7.b.c(k7.i.c("kotlinx.serialization.Polymorphic", d.a.f24248a, new k7.f[0], new C0122a(this.f22570a)), this.f22570a.e());
        }
    }

    public e(u6.c<T> baseClass) {
        q.f(baseClass, "baseClass");
        this.f22567a = baseClass;
        this.f22568b = f6.o.d();
        this.f22569c = e6.m.a(e6.o.f21436b, new a(this));
    }

    @Override // m7.b
    public u6.c<T> e() {
        return this.f22567a;
    }

    @Override // i7.b, i7.j, i7.a
    public k7.f getDescriptor() {
        return (k7.f) this.f22569c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + e() + ')';
    }
}
