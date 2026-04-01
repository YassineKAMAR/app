package r5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import s5.k;
import s5.t;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s5.k f25914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i5.a f25915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, List<k.d>> f25916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final k.c f25917d;

    class a implements k.c {
        a() {
        }

        @Override // s5.k.c
        public void onMethodCall(s5.j jVar, k.d dVar) {
            int iIntValue;
            String str;
            String strC;
            if (b.this.f25915b == null) {
                return;
            }
            String str2 = jVar.f26252a;
            Map map = (Map) jVar.b();
            g5.b.f("DeferredComponentChannel", "Received '" + str2 + "' message.");
            iIntValue = ((Integer) map.get("loadingUnitId")).intValue();
            str = (String) map.get("componentName");
            str2.hashCode();
            switch (str2) {
                case "uninstallDeferredComponent":
                    b.this.f25915b.d(iIntValue, str);
                    strC = null;
                    break;
                case "getDeferredComponentInstallState":
                    strC = b.this.f25915b.c(iIntValue, str);
                    break;
                case "installDeferredComponent":
                    b.this.f25915b.b(iIntValue, str);
                    if (!b.this.f25916c.containsKey(str)) {
                        b.this.f25916c.put(str, new ArrayList());
                    }
                    ((List) b.this.f25916c.get(str)).add(dVar);
                    return;
                default:
                    dVar.c();
                    return;
            }
            dVar.a(strC);
        }
    }

    public b(h5.a aVar) {
        a aVar2 = new a();
        this.f25917d = aVar2;
        s5.k kVar = new s5.k(aVar, "flutter/deferredcomponent", t.f26267b);
        this.f25914a = kVar;
        kVar.e(aVar2);
        this.f25915b = g5.a.e().a();
        this.f25916c = new HashMap();
    }

    public void c(i5.a aVar) {
        this.f25915b = aVar;
    }
}
