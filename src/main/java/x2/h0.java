package x2;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class h0 extends j0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Callable f27266f;

    /* synthetic */ h0(Callable callable, g0 g0Var) {
        super();
        this.f27266f = callable;
    }

    @Override // x2.j0
    final String a() {
        try {
            return (String) this.f27266f.call();
        } catch (Exception e8) {
            throw new RuntimeException(e8);
        }
    }
}
