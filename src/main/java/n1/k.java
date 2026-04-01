package n1;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class k implements p1.b<Executor> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final k f25115a = new k();
    }

    public static k a() {
        return a.f25115a;
    }

    public static Executor b() {
        return (Executor) p1.d.c(j.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // d6.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
