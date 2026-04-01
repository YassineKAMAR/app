package v6;

import java.util.Iterator;
import kotlin.jvm.internal.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class f extends e {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f26981a;

        public a(Iterator it) {
            this.f26981a = it;
        }

        @Override // v6.b
        public Iterator<T> iterator() {
            return this.f26981a;
        }
    }

    public static <T> b<T> a(Iterator<? extends T> it) {
        q.f(it, "<this>");
        return b(new a(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> b<T> b(b<? extends T> bVar) {
        q.f(bVar, "<this>");
        return bVar instanceof v6.a ? bVar : new v6.a(bVar);
    }
}
