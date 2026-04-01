package p7;

import i7.j;
import java.util.List;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.l;

/* JADX INFO: loaded from: classes2.dex */
public interface e {

    public static final class a {

        /* JADX INFO: renamed from: p7.e$a$a, reason: collision with other inner class name */
        static final class C0158a extends r implements l<List<? extends i7.b<?>>, i7.b<?>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i7.b<T> f25637a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0158a(i7.b<T> bVar) {
                super(1);
                this.f25637a = bVar;
            }

            @Override // p6.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final i7.b<?> invoke(List<? extends i7.b<?>> it) {
                q.f(it, "it");
                return this.f25637a;
            }
        }

        public static <T> void a(e eVar, u6.c<T> kClass, i7.b<T> serializer) {
            q.f(kClass, "kClass");
            q.f(serializer, "serializer");
            eVar.e(kClass, new C0158a(serializer));
        }
    }

    <Base> void a(u6.c<Base> cVar, l<? super Base, ? extends j<? super Base>> lVar);

    <Base> void b(u6.c<Base> cVar, l<? super String, ? extends i7.a<? extends Base>> lVar);

    <Base, Sub extends Base> void c(u6.c<Base> cVar, u6.c<Sub> cVar2, i7.b<Sub> bVar);

    <T> void d(u6.c<T> cVar, i7.b<T> bVar);

    <T> void e(u6.c<T> cVar, l<? super List<? extends i7.b<?>>, ? extends i7.b<?>> lVar);
}
