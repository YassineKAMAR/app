package n1;

/* JADX INFO: loaded from: classes.dex */
final class r<T> implements l1.f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f25122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l1.b f25124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l1.e<T, byte[]> f25125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s f25126e;

    r(o oVar, String str, l1.b bVar, l1.e<T, byte[]> eVar, s sVar) {
        this.f25122a = oVar;
        this.f25123b = str;
        this.f25124c = bVar;
        this.f25125d = eVar;
        this.f25126e = sVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(Exception exc) {
    }

    @Override // l1.f
    public void a(l1.c<T> cVar) {
        d(cVar, new l1.h() { // from class: n1.q
            @Override // l1.h
            public final void a(Exception exc) {
                r.c(exc);
            }
        });
    }

    public void d(l1.c<T> cVar, l1.h hVar) {
        this.f25126e.a(n.a().e(this.f25122a).c(cVar).f(this.f25123b).d(this.f25125d).b(this.f25124c).a(), hVar);
    }
}
