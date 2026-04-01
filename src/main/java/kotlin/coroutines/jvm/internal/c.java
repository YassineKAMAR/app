package kotlin.coroutines.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements h6.d<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f24286a = new c();

    private c() {
    }

    @Override // h6.d
    public h6.g getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // h6.d
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
