package r5;

import java.util.ArrayList;
import s5.k;
import s5.t;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5.k f26066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f26067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k.c f26068c;

    class a implements k.c {
        a() {
        }

        @Override // s5.k.c
        public void onMethodCall(s5.j jVar, k.d dVar) {
            if (o.this.f26067b == null) {
                g5.b.f("SpellCheckChannel", "No SpellCheckeMethodHandler registered, call not forwarded to spell check API.");
                return;
            }
            String str = jVar.f26252a;
            Object obj = jVar.f26253b;
            g5.b.f("SpellCheckChannel", "Received '" + str + "' message.");
            str.hashCode();
            if (!str.equals("SpellCheck.initiateSpellCheck")) {
                dVar.c();
                return;
            }
            try {
                ArrayList arrayList = (ArrayList) obj;
                o.this.f26067b.a((String) arrayList.get(0), (String) arrayList.get(1), dVar);
            } catch (IllegalStateException e8) {
                dVar.b("error", e8.getMessage(), null);
            }
        }
    }

    public interface b {
        void a(String str, String str2, k.d dVar);
    }

    public o(h5.a aVar) {
        a aVar2 = new a();
        this.f26068c = aVar2;
        s5.k kVar = new s5.k(aVar, "flutter/spellcheck", t.f26267b);
        this.f26066a = kVar;
        kVar.e(aVar2);
    }

    public void b(b bVar) {
        this.f26067b = bVar;
    }
}
