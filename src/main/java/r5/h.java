package r5;

import java.util.HashMap;
import s5.k;
import s5.t;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5.k f25943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f25944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k.c f25945c;

    class a implements k.c {
        a() {
        }

        @Override // s5.k.c
        public void onMethodCall(s5.j jVar, k.d dVar) {
            if (h.this.f25944b == null) {
                return;
            }
            String str = jVar.f26252a;
            g5.b.f("MouseCursorChannel", "Received '" + str + "' message.");
            byte b8 = -1;
            try {
                if (str.hashCode() == -1307105544 && str.equals("activateSystemCursor")) {
                    b8 = 0;
                }
                if (b8 != 0) {
                    return;
                }
                try {
                    h.this.f25944b.a((String) ((HashMap) jVar.f26253b).get("kind"));
                    dVar.a(Boolean.TRUE);
                } catch (Exception e8) {
                    dVar.b("error", "Error when setting cursors: " + e8.getMessage(), null);
                }
            } catch (Exception e9) {
                dVar.b("error", "Unhandled error: " + e9.getMessage(), null);
            }
        }
    }

    public interface b {
        void a(String str);
    }

    public h(h5.a aVar) {
        a aVar2 = new a();
        this.f25945c = aVar2;
        s5.k kVar = new s5.k(aVar, "flutter/mousecursor", t.f26267b);
        this.f25943a = kVar;
        kVar.e(aVar2);
    }

    public void b(b bVar) {
        this.f25944b = bVar;
    }
}
