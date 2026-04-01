package r5;

import java.util.HashMap;
import java.util.Map;
import s5.k;
import s5.t;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5.k f25923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f25924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k.c f25925c;

    class a implements k.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Map<Long, Long> f25926a = new HashMap();

        a() {
        }

        @Override // s5.k.c
        public void onMethodCall(s5.j jVar, k.d dVar) {
            if (e.this.f25924b != null) {
                String str = jVar.f26252a;
                str.hashCode();
                if (!str.equals("getKeyboardState")) {
                    dVar.c();
                    return;
                } else {
                    try {
                        this.f25926a = e.this.f25924b.b();
                    } catch (IllegalStateException e8) {
                        dVar.b("error", e8.getMessage(), null);
                    }
                }
            }
            dVar.a(this.f25926a);
        }
    }

    public interface b {
        Map<Long, Long> b();
    }

    public e(s5.c cVar) {
        a aVar = new a();
        this.f25925c = aVar;
        s5.k kVar = new s5.k(cVar, "flutter/keyboard", t.f26267b);
        this.f25923a = kVar;
        kVar.e(aVar);
    }

    public void b(b bVar) {
        this.f25924b = bVar;
    }
}
