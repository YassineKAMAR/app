package io.flutter.plugins.googlemobileads;

/* JADX INFO: loaded from: classes.dex */
class q extends e implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f23324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f23325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m f23326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f23327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f23328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private z1.j f23329g;

    public q(int i8, a aVar, String str, l lVar, m mVar, c cVar) {
        super(i8);
        b6.c.a(aVar);
        b6.c.a(str);
        b6.c.a(lVar);
        b6.c.a(mVar);
        this.f23324b = aVar;
        this.f23325c = str;
        this.f23327e = lVar;
        this.f23326d = mVar;
        this.f23328f = cVar;
    }

    @Override // io.flutter.plugins.googlemobileads.g
    public void a() {
        z1.j jVar = this.f23329g;
        if (jVar != null) {
            this.f23324b.m(this.f23147a, jVar.getResponseInfo());
        }
    }

    @Override // io.flutter.plugins.googlemobileads.e
    void b() {
        z1.j jVar = this.f23329g;
        if (jVar != null) {
            jVar.a();
            this.f23329g = null;
        }
    }

    @Override // io.flutter.plugins.googlemobileads.e
    public io.flutter.plugin.platform.k c() {
        z1.j jVar = this.f23329g;
        if (jVar == null) {
            return null;
        }
        return new b0(jVar);
    }

    m d() {
        z1.j jVar = this.f23329g;
        if (jVar == null || jVar.getAdSize() == null) {
            return null;
        }
        return new m(this.f23329g.getAdSize());
    }

    void e() {
        z1.j jVarB = this.f23328f.b();
        this.f23329g = jVarB;
        jVarB.setAdUnitId(this.f23325c);
        this.f23329g.setAdSize(this.f23326d.a());
        this.f23329g.setOnPaidEventListener(new a0(this.f23324b, this));
        this.f23329g.setAdListener(new r(this.f23147a, this.f23324b, this));
        this.f23329g.b(this.f23327e.b(this.f23325c));
    }
}
