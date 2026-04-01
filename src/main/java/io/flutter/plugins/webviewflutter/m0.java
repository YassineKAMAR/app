package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.n;
import java.util.ArrayList;
import s5.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m0 {
    public static s5.i<Object> a() {
        return new s5.s();
    }

    public static /* synthetic */ void b(n.p pVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            pVar.clear();
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = n.a(th);
        }
        eVar.a(arrayList);
    }

    public static void c(s5.c cVar, final n.p pVar) {
        new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.InstanceManagerHostApi.clear", a()).e(pVar != null ? new a.d() { // from class: io.flutter.plugins.webviewflutter.l0
            @Override // s5.a.d
            public final void a(Object obj, a.e eVar) {
                m0.b(pVar, obj, eVar);
            }
        } : null);
    }
}
