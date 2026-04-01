package androidx.core.os;

import android.os.OutcomeReceiver;
import e6.s;
import e6.t;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
final class c<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h6.d<R> f2072a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(h6.d<? super R> continuation) {
        super(false);
        q.f(continuation, "continuation");
        this.f2072a = continuation;
    }

    public void onError(E error) {
        q.f(error, "error");
        if (compareAndSet(false, true)) {
            h6.d<R> dVar = this.f2072a;
            s.a aVar = s.f21442b;
            dVar.resumeWith(s.b(t.a(error)));
        }
    }

    public void onResult(R result) {
        q.f(result, "result");
        if (compareAndSet(false, true)) {
            this.f2072a.resumeWith(s.b(result));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
