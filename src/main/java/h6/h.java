package h6;

import h6.g;
import java.io.Serializable;
import kotlin.jvm.internal.q;
import p6.p;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements g, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f22443a = new h();

    private h() {
    }

    @Override // h6.g
    public g E(g.c<?> key) {
        q.f(key, "key");
        return this;
    }

    @Override // h6.g
    public <R> R P(R r8, p<? super R, ? super g.b, ? extends R> operation) {
        q.f(operation, "operation");
        return r8;
    }

    @Override // h6.g
    public g X(g context) {
        q.f(context, "context");
        return context;
    }

    @Override // h6.g
    public <E extends g.b> E a(g.c<E> key) {
        q.f(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
