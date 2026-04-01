package d7;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements y6.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h6.g f21018a;

    public f(h6.g gVar) {
        this.f21018a = gVar;
    }

    @Override // y6.e0
    public h6.g d() {
        return this.f21018a;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + d() + ')';
    }
}
