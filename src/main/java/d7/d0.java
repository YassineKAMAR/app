package d7;

/* JADX INFO: loaded from: classes2.dex */
public class d0<T> extends y6.a<T> implements kotlin.coroutines.jvm.internal.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h6.d<T> f21013d;

    @Override // y6.q1
    protected final boolean Z() {
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public final kotlin.coroutines.jvm.internal.e getCallerFrame() {
        h6.d<T> dVar = this.f21013d;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // y6.q1
    protected void l(Object obj) {
        k.c(i6.c.c(this.f21013d), y6.y.a(obj, this.f21013d), null, 2, null);
    }

    @Override // y6.a
    protected void y0(Object obj) {
        h6.d<T> dVar = this.f21013d;
        dVar.resumeWith(y6.y.a(obj, dVar));
    }
}
