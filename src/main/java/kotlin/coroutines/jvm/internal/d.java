package kotlin.coroutines.jvm.internal;

import h6.g;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d extends a {
    private final h6.g _context;
    private transient h6.d<Object> intercepted;

    public d(h6.d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }

    public d(h6.d<Object> dVar, h6.g gVar) {
        super(dVar);
        this._context = gVar;
    }

    @Override // h6.d
    public h6.g getContext() {
        h6.g gVar = this._context;
        q.c(gVar);
        return gVar;
    }

    public final h6.d<Object> intercepted() {
        h6.d<Object> dVarO = this.intercepted;
        if (dVarO == null) {
            h6.e eVar = (h6.e) getContext().a(h6.e.T);
            if (eVar == null || (dVarO = eVar.o(this)) == null) {
                dVarO = this;
            }
            this.intercepted = dVarO;
        }
        return dVarO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected void releaseIntercepted() {
        h6.d<?> dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            g.b bVarA = getContext().a(h6.e.T);
            q.c(bVarA);
            ((h6.e) bVarA).h(dVar);
        }
        this.intercepted = c.f24286a;
    }
}
