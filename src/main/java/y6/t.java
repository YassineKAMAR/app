package y6;

/* JADX INFO: loaded from: classes2.dex */
final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f27545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f27546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p6.l<Throwable, e6.i0> f27547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f27548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f27549e;

    /* JADX WARN: Multi-variable type inference failed */
    public t(Object obj, h hVar, p6.l<? super Throwable, e6.i0> lVar, Object obj2, Throwable th) {
        this.f27545a = obj;
        this.f27546b = hVar;
        this.f27547c = lVar;
        this.f27548d = obj2;
        this.f27549e = th;
    }

    public /* synthetic */ t(Object obj, h hVar, p6.l lVar, Object obj2, Throwable th, int i8, kotlin.jvm.internal.j jVar) {
        this(obj, (i8 & 2) != 0 ? null : hVar, (i8 & 4) != 0 ? null : lVar, (i8 & 8) != 0 ? null : obj2, (i8 & 16) != 0 ? null : th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ t b(t tVar, Object obj, h hVar, p6.l lVar, Object obj2, Throwable th, int i8, Object obj3) {
        if ((i8 & 1) != 0) {
            obj = tVar.f27545a;
        }
        if ((i8 & 2) != 0) {
            hVar = tVar.f27546b;
        }
        h hVar2 = hVar;
        if ((i8 & 4) != 0) {
            lVar = tVar.f27547c;
        }
        p6.l lVar2 = lVar;
        if ((i8 & 8) != 0) {
            obj2 = tVar.f27548d;
        }
        Object obj4 = obj2;
        if ((i8 & 16) != 0) {
            th = tVar.f27549e;
        }
        return tVar.a(obj, hVar2, lVar2, obj4, th);
    }

    public final t a(Object obj, h hVar, p6.l<? super Throwable, e6.i0> lVar, Object obj2, Throwable th) {
        return new t(obj, hVar, lVar, obj2, th);
    }

    public final boolean c() {
        return this.f27549e != null;
    }

    public final void d(k<?> kVar, Throwable th) {
        h hVar = this.f27546b;
        if (hVar != null) {
            kVar.k(hVar, th);
        }
        p6.l<Throwable, e6.i0> lVar = this.f27547c;
        if (lVar != null) {
            kVar.l(lVar, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return kotlin.jvm.internal.q.b(this.f27545a, tVar.f27545a) && kotlin.jvm.internal.q.b(this.f27546b, tVar.f27546b) && kotlin.jvm.internal.q.b(this.f27547c, tVar.f27547c) && kotlin.jvm.internal.q.b(this.f27548d, tVar.f27548d) && kotlin.jvm.internal.q.b(this.f27549e, tVar.f27549e);
    }

    public int hashCode() {
        Object obj = this.f27545a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        h hVar = this.f27546b;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        p6.l<Throwable, e6.i0> lVar = this.f27547c;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f27548d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f27549e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f27545a + ", cancelHandler=" + this.f27546b + ", onCancellation=" + this.f27547c + ", idempotentResume=" + this.f27548d + ", cancelCause=" + this.f27549e + ')';
    }
}
