package n1;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class m implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f25117a;

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f25118a;

        a(Runnable runnable) {
            this.f25118a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f25118a.run();
            } catch (Exception e8) {
                r1.a.d("Executor", "Background execution failure.", e8);
            }
        }
    }

    m(Executor executor) {
        this.f25117a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f25117a.execute(new a(runnable));
    }
}
