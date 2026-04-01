package s3;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f26150a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Queue f26151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26152c;

    b0() {
    }

    public final void a(a0 a0Var) {
        synchronized (this.f26150a) {
            if (this.f26151b == null) {
                this.f26151b = new ArrayDeque();
            }
            this.f26151b.add(a0Var);
        }
    }

    public final void b(h hVar) {
        a0 a0Var;
        synchronized (this.f26150a) {
            if (this.f26151b != null && !this.f26152c) {
                this.f26152c = true;
                while (true) {
                    synchronized (this.f26150a) {
                        a0Var = (a0) this.f26151b.poll();
                        if (a0Var == null) {
                            this.f26152c = false;
                            return;
                        }
                    }
                    a0Var.c(hVar);
                }
            }
        }
    }
}
