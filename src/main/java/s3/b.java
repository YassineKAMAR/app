package s3;

/* JADX INFO: loaded from: classes.dex */
public final class b extends IllegalStateException {
    private b(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(h<?> hVar) {
        if (!hVar.l()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception excI = hVar.i();
        return new b("Complete with: ".concat(excI != null ? "failure" : hVar.m() ? "result ".concat(String.valueOf(hVar.j())) : hVar.k() ? "cancellation" : "unknown issue"), excI);
    }
}
