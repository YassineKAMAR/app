package h6;

import e6.s;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
public final class i<T> implements d<T>, kotlin.coroutines.jvm.internal.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f22444b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<i<?>, Object> f22445c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "result");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d<T> f22446a;
    private volatile Object result;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(d<? super T> delegate) {
        this(delegate, i6.a.f22556b);
        q.f(delegate, "delegate");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(d<? super T> delegate, Object obj) {
        q.f(delegate, "delegate");
        this.f22446a = delegate;
        this.result = obj;
    }

    public final Object a() throws Throwable {
        Object obj = this.result;
        i6.a aVar = i6.a.f22556b;
        if (obj == aVar) {
            if (androidx.concurrent.futures.b.a(f22445c, this, aVar, i6.d.e())) {
                return i6.d.e();
            }
            obj = this.result;
        }
        if (obj == i6.a.f22557c) {
            return i6.d.e();
        }
        if (obj instanceof s.b) {
            throw ((s.b) obj).f21444a;
        }
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        d<T> dVar = this.f22446a;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // h6.d
    public g getContext() {
        return this.f22446a.getContext();
    }

    @Override // h6.d
    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            i6.a aVar = i6.a.f22556b;
            if (obj2 == aVar) {
                if (androidx.concurrent.futures.b.a(f22445c, this, aVar, obj)) {
                    return;
                }
            } else {
                if (obj2 != i6.d.e()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (androidx.concurrent.futures.b.a(f22445c, this, i6.d.e(), i6.a.f22557c)) {
                    this.f22446a.resumeWith(obj);
                    return;
                }
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f22446a;
    }
}
