package f7;

import y6.i0;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f21852c;

    public k(Runnable runnable, long j8, i iVar) {
        super(j8, iVar);
        this.f21852c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f21852c.run();
        } finally {
            this.f21850b.a();
        }
    }

    public String toString() {
        return "Task[" + i0.a(this.f21852c) + '@' + i0.b(this.f21852c) + ", " + this.f21849a + ", " + this.f21850b + ']';
    }
}
