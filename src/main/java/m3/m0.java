package m3;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o2 f24773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o2 f24774b;

    public m0(o2 o2Var, o2 o2Var2) {
        this.f24773a = o2Var;
        this.f24774b = o2Var2;
    }

    @Override // m3.o2
    public final /* synthetic */ Object k() {
        o2 o2Var = this.f24773a;
        Executor executor = p1.f24789b;
        n2.a(executor);
        return new l0(o2Var, executor);
    }
}
