package m7;

import l7.c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u0<K, V, R> implements i7.b<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i7.b<K> f25020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i7.b<V> f25021b;

    private u0(i7.b<K> bVar, i7.b<V> bVar2) {
        this.f25020a = bVar;
        this.f25021b = bVar2;
    }

    public /* synthetic */ u0(i7.b bVar, i7.b bVar2, kotlin.jvm.internal.j jVar) {
        this(bVar, bVar2);
    }

    protected abstract K a(R r8);

    protected abstract V b(R r8);

    protected abstract R c(K k8, V v7);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i7.a
    public R deserialize(l7.e decoder) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        l7.c cVarC = decoder.c(getDescriptor());
        if (cVarC.y()) {
            return (R) c(c.a.c(cVarC, getDescriptor(), 0, this.f25020a, null, 8, null), c.a.c(cVarC, getDescriptor(), 1, this.f25021b, null, 8, null));
        }
        Object objC = k2.f24958a;
        Object objC2 = k2.f24958a;
        while (true) {
            int iS = cVarC.s(getDescriptor());
            if (iS == -1) {
                cVarC.d(getDescriptor());
                if (objC == k2.f24958a) {
                    throw new i7.i("Element 'key' is missing");
                }
                if (objC2 != k2.f24958a) {
                    return (R) c(objC, objC2);
                }
                throw new i7.i("Element 'value' is missing");
            }
            if (iS == 0) {
                objC = c.a.c(cVarC, getDescriptor(), 0, this.f25020a, null, 8, null);
            } else {
                if (iS != 1) {
                    throw new i7.i("Invalid index: " + iS);
                }
                objC2 = c.a.c(cVarC, getDescriptor(), 1, this.f25021b, null, 8, null);
            }
        }
    }

    @Override // i7.j
    public void serialize(l7.f encoder, R r8) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        l7.d dVarC = encoder.c(getDescriptor());
        dVarC.l(getDescriptor(), 0, this.f25020a, a(r8));
        dVarC.l(getDescriptor(), 1, this.f25021b, b(r8));
        dVarC.d(getDescriptor());
    }
}
