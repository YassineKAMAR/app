package v6;

import f6.n;
import f6.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.q;
import p6.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class h extends g {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements Iterable<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f26982a;

        public a(b bVar) {
            this.f26982a = bVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.f26982a.iterator();
        }
    }

    public static <T> Iterable<T> c(b<? extends T> bVar) {
        q.f(bVar, "<this>");
        return new a(bVar);
    }

    public static <T, R> b<R> d(b<? extends T> bVar, l<? super T, ? extends R> transform) {
        q.f(bVar, "<this>");
        q.f(transform, "transform");
        return new i(bVar, transform);
    }

    public static <T> List<T> e(b<? extends T> bVar) {
        q.f(bVar, "<this>");
        Iterator<? extends T> it = bVar.iterator();
        if (!it.hasNext()) {
            return o.d();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return n.b(next);
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            arrayList.add(next);
            if (!it.hasNext()) {
                return arrayList;
            }
            next = it.next();
        }
    }
}
