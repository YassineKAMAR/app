package j2;

/* JADX INFO: loaded from: classes.dex */
final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b0 f23907a;

    a(b0 b0Var) {
        this.f23907a = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23907a.f23938b = Thread.currentThread();
        this.f23907a.a();
    }
}
