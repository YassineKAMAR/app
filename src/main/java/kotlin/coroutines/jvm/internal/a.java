package kotlin.coroutines.jvm.internal;

import e6.i0;
import e6.s;
import e6.t;
import java.io.Serializable;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements h6.d<Object>, e, Serializable {
    private final h6.d<Object> completion;

    public a(h6.d<Object> dVar) {
        this.completion = dVar;
    }

    public h6.d<i0> create(h6.d<?> completion) {
        q.f(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public h6.d<i0> create(Object obj, h6.d<?> completion) {
        q.f(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public e getCallerFrame() {
        h6.d<Object> dVar = this.completion;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public final h6.d<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    @Override // h6.d
    public final void resumeWith(Object obj) {
        Object objInvokeSuspend;
        h6.d<Object> dVar = this;
        while (true) {
            h.b(dVar);
            a aVar = (a) dVar;
            h6.d<Object> dVar2 = aVar.completion;
            q.c(dVar2);
            try {
                objInvokeSuspend = aVar.invokeSuspend(obj);
            } catch (Throwable th) {
                s.a aVar2 = s.f21442b;
                obj = s.b(t.a(th));
            }
            if (objInvokeSuspend == i6.d.e()) {
                return;
            }
            obj = s.b(objInvokeSuspend);
            aVar.releaseIntercepted();
            if (!(dVar2 instanceof a)) {
                dVar2.resumeWith(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }
}
