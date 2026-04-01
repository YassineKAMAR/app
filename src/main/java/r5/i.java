package r5;

import java.util.HashMap;
import s5.k;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5.k f25947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k.c f25948b;

    class a implements k.c {
        a() {
        }

        @Override // s5.k.c
        public void onMethodCall(s5.j jVar, k.d dVar) {
            dVar.a(null);
        }
    }

    public i(h5.a aVar) {
        a aVar2 = new a();
        this.f25948b = aVar2;
        s5.k kVar = new s5.k(aVar, "flutter/navigation", s5.g.f26251a);
        this.f25947a = kVar;
        kVar.e(aVar2);
    }

    public void a() {
        g5.b.f("NavigationChannel", "Sending message to pop route.");
        this.f25947a.c("popRoute", null);
    }

    public void b(String str) {
        g5.b.f("NavigationChannel", "Sending message to push route information '" + str + "'");
        HashMap map = new HashMap();
        map.put("location", str);
        this.f25947a.c("pushRouteInformation", map);
    }

    public void c(String str) {
        g5.b.f("NavigationChannel", "Sending message to set initial route to '" + str + "'");
        this.f25947a.c("setInitialRoute", str);
    }
}
