package com.amazon.a.a.n.a;

import com.amazon.d.a.j;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f3841b = new com.amazon.a.a.o.c("KiwiCommand");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.amazon.a.a.j.a f3842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f3843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f3844e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f3845f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, Object> f3846g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f3848i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private h f3849j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private h f3850k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.amazon.a.b.f f3847h = new com.amazon.a.b.f();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f3851l = false;

    public h(com.amazon.a.a.j.a aVar, String str, String str2, String str3, String str4) {
        this.f3842c = aVar;
        this.f3843d = str3;
        this.f3844e = str;
        this.f3845f = str2;
        HashMap map = new HashMap();
        this.f3846g = map;
        map.put(com.amazon.a.a.o.b.B, str3);
        map.put(com.amazon.a.a.o.b.I, str4);
        this.f3848i = true;
        this.f3849j = null;
        this.f3850k = null;
    }

    private void a(com.amazon.a.a.i.c cVar) {
        if (cVar == null) {
            return;
        }
        com.amazon.a.a.i.a aVar = new com.amazon.a.a.i.a(cVar);
        com.amazon.a.a.i.e eVarA = com.amazon.a.a.a();
        if (eVarA == null) {
            f3841b.b("Prompt manager is null. Cannot show prompt dropping request");
        } else {
            eVarA.a((com.amazon.a.a.i.b) aVar);
        }
    }

    public h a(boolean z7) {
        this.f3851l = z7;
        return this;
    }

    public void a(h hVar) {
        this.f3849j = hVar;
    }

    @Override // com.amazon.a.a.n.a.a
    protected void a(com.amazon.d.a.h hVar) {
        h hVar2;
        String str;
        f3841b.a("onFailure: result = " + hVar);
        if (((hVar == null || (str = (String) hVar.f().get(com.amazon.a.a.o.b.ak)) == null || !str.equalsIgnoreCase("1.0")) ? false : true) && (hVar2 = this.f3850k) != null) {
            hVar2.a(this.f3851l);
            this.f3850k.l();
            return;
        }
        try {
            b(hVar);
        } catch (Exception e8) {
            f3841b.a("Error calling onResult: " + e8);
        }
        if (this.f3848i) {
            a(new com.amazon.a.a.i.c(hVar.b(), hVar.c(), hVar.d(), hVar.e()));
        }
        if (this.f3851l) {
            return;
        }
        this.f3842c.c();
    }

    @Override // com.amazon.a.a.n.a.a
    protected void a(j jVar) {
        h hVar;
        String str = (String) jVar.b().get(com.amazon.a.a.o.b.f3896f);
        f3841b.a("onSuccess: result = " + jVar + ", errorMessage: " + str);
        if (com.amazon.a.a.o.f.a(str)) {
            boolean zB = false;
            try {
                zB = b(jVar);
            } catch (Exception e8) {
                f3841b.a("Error calling onResult: " + e8);
            }
            if (zB && (hVar = this.f3849j) != null) {
                hVar.l();
                return;
            } else {
                if (this.f3851l) {
                    return;
                }
                if (zB) {
                    this.f3842c.b();
                    return;
                }
            }
        } else if (this.f3851l) {
            return;
        }
        this.f3842c.c();
    }

    protected void a(String str, Object obj) {
        this.f3846g.put(str, obj);
    }

    @Override // com.amazon.a.a.n.a.a
    protected String a_() {
        return this.f3844e;
    }

    @Override // com.amazon.a.a.n.a.a
    protected Map<String, Object> b() {
        return this.f3846g;
    }

    @Override // com.amazon.a.a.n.a.a
    protected void b(com.amazon.a.a.d.b bVar) {
        h hVar;
        if ("UNHANDLED_EXCEPTION".equals(bVar.a()) && com.amazon.a.a.o.b.ae.equals(this.f3845f) && (hVar = this.f3850k) != null) {
            hVar.a(this.f3851l);
            this.f3850k.l();
            return;
        }
        try {
            c(bVar);
        } catch (Exception e8) {
            f3841b.a("Error calling onResult: " + e8);
        }
        if (this.f3848i) {
            a(this.f3847h.a(bVar));
        }
        if (this.f3851l) {
            return;
        }
        this.f3842c.c();
    }

    public void b(h hVar) {
        this.f3850k = hVar;
    }

    protected void b(com.amazon.d.a.h hVar) {
    }

    protected void b(boolean z7) {
        this.f3848i = z7;
    }

    protected abstract boolean b(j jVar);

    @Override // com.amazon.a.a.n.a.a
    protected String c() {
        return this.f3845f;
    }

    protected void c(com.amazon.a.a.d.b bVar) {
    }

    @Override // com.amazon.a.a.n.a.a
    protected boolean d() {
        return true;
    }

    public boolean i() {
        return this.f3851l;
    }

    protected com.amazon.a.a.j.a j() {
        return this.f3842c;
    }

    protected String k() {
        return this.f3843d;
    }

    public void l() {
        com.amazon.a.a.a(this);
    }
}
