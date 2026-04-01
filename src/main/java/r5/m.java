package r5;

import java.util.HashMap;
import java.util.Map;
import s5.k;
import s5.t;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f26040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s5.k f26041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private k.d f26042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f26043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f26044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k.c f26045g;

    class a implements k.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f26046a;

        a(byte[] bArr) {
            this.f26046a = bArr;
        }

        @Override // s5.k.d
        public void a(Object obj) {
            m.this.f26040b = this.f26046a;
        }

        @Override // s5.k.d
        public void b(String str, String str2, Object obj) {
            g5.b.b("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
        }

        @Override // s5.k.d
        public void c() {
        }
    }

    class b implements k.c {
        b() {
        }

        @Override // s5.k.c
        public void onMethodCall(s5.j jVar, k.d dVar) {
            Map mapI;
            String str = jVar.f26252a;
            Object obj = jVar.f26253b;
            str.hashCode();
            if (str.equals(com.amazon.a.a.o.b.ar)) {
                m.this.f26044f = true;
                if (!m.this.f26043e) {
                    m mVar = m.this;
                    if (mVar.f26039a) {
                        mVar.f26042d = dVar;
                        return;
                    }
                }
                m mVar2 = m.this;
                mapI = mVar2.i(mVar2.f26040b);
            } else if (!str.equals("put")) {
                dVar.c();
                return;
            } else {
                m.this.f26040b = (byte[]) obj;
                mapI = null;
            }
            dVar.a(mapI);
        }
    }

    public m(h5.a aVar, boolean z7) {
        this(new s5.k(aVar, "flutter/restoration", t.f26267b), z7);
    }

    m(s5.k kVar, boolean z7) {
        this.f26043e = false;
        this.f26044f = false;
        b bVar = new b();
        this.f26045g = bVar;
        this.f26041c = kVar;
        this.f26039a = z7;
        kVar.e(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> i(byte[] bArr) {
        HashMap map = new HashMap();
        map.put("enabled", Boolean.TRUE);
        map.put("data", bArr);
        return map;
    }

    public void g() {
        this.f26040b = null;
    }

    public byte[] h() {
        return this.f26040b;
    }

    public void j(byte[] bArr) {
        this.f26043e = true;
        k.d dVar = this.f26042d;
        if (dVar != null) {
            dVar.a(i(bArr));
            this.f26042d = null;
        } else if (this.f26044f) {
            this.f26041c.d("push", i(bArr), new a(bArr));
            return;
        }
        this.f26040b = bArr;
    }
}
