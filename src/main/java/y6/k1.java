package y6;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class k1 extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient j1 f27511a;

    public k1(String str, Throwable th, j1 j1Var) {
        super(str);
        this.f27511a = j1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof k1) {
                k1 k1Var = (k1) obj;
                if (!kotlin.jvm.internal.q.b(k1Var.getMessage(), getMessage()) || !kotlin.jvm.internal.q.b(k1Var.f27511a, this.f27511a) || !kotlin.jvm.internal.q.b(k1Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.q.c(message);
        int iHashCode = ((message.hashCode() * 31) + this.f27511a.hashCode()) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f27511a;
    }
}
