package m3;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class s2 implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o2 f24815a;

    public s2(o2 o2Var) {
        this.f24815a = o2Var;
    }

    @Override // m3.o2
    public final /* bridge */ /* synthetic */ Object k() {
        Executor executor = p1.f24789b;
        n2.a(executor);
        return new r2(executor);
    }
}
