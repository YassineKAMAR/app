package kotlin.coroutines.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j extends a {
    public j(h6.d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.getContext() == h6.h.f22443a)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // h6.d
    public h6.g getContext() {
        return h6.h.f22443a;
    }
}
