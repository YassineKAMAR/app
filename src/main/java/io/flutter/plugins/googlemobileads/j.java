package io.flutter.plugins.googlemobileads;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class j extends e implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final io.flutter.plugins.googlemobileads.a f23204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f23205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<m> f23206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f23207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f23208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected a2.b f23209g;

    class a implements a2.e {
        a() {
        }

        @Override // a2.e
        public void w(String str, String str2) {
            j jVar = j.this;
            jVar.f23204b.q(jVar.f23147a, str, str2);
        }
    }

    public j(int i8, io.flutter.plugins.googlemobileads.a aVar, String str, List<m> list, i iVar, c cVar) {
        super(i8);
        b6.c.a(aVar);
        b6.c.a(str);
        b6.c.a(list);
        b6.c.a(iVar);
        this.f23204b = aVar;
        this.f23205c = str;
        this.f23206d = list;
        this.f23207e = iVar;
        this.f23208f = cVar;
    }

    public void a() {
        a2.b bVar = this.f23209g;
        if (bVar != null) {
            this.f23204b.m(this.f23147a, bVar.getResponseInfo());
        }
    }

    @Override // io.flutter.plugins.googlemobileads.e
    void b() {
        a2.b bVar = this.f23209g;
        if (bVar != null) {
            bVar.a();
            this.f23209g = null;
        }
    }

    @Override // io.flutter.plugins.googlemobileads.e
    io.flutter.plugin.platform.k c() {
        a2.b bVar = this.f23209g;
        if (bVar == null) {
            return null;
        }
        return new b0(bVar);
    }

    m d() {
        a2.b bVar = this.f23209g;
        if (bVar == null || bVar.getAdSize() == null) {
            return null;
        }
        return new m(this.f23209g.getAdSize());
    }

    void e() {
        a2.b bVarA = this.f23208f.a();
        this.f23209g = bVarA;
        if (this instanceof d) {
            bVarA.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        }
        this.f23209g.setAdUnitId(this.f23205c);
        this.f23209g.setAppEventListener(new a());
        z1.h[] hVarArr = new z1.h[this.f23206d.size()];
        for (int i8 = 0; i8 < this.f23206d.size(); i8++) {
            hVarArr[i8] = this.f23206d.get(i8).a();
        }
        this.f23209g.setAdSizes(hVarArr);
        this.f23209g.setAdListener(new r(this.f23147a, this.f23204b, this));
        this.f23209g.e(this.f23207e.k(this.f23205c));
    }
}
