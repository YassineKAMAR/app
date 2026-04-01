package d7;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient h6.g f21024a;

    public i(h6.g gVar) {
        this.f21024a = gVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f21024a.toString();
    }
}
