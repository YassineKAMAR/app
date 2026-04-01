package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.n;
import java.util.ArrayList;
import s5.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 {
    public static s5.i<Object> a() {
        return new s5.s();
    }

    public static /* synthetic */ void b(n.j jVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, jVar.b((String) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = n.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void c(n.j jVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, jVar.a((String) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = n.a(th);
        }
        eVar.a(arrayList);
    }

    public static void d(s5.c cVar, final n.j jVar) {
        s5.a aVar = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManagerHostApi.list", a());
        if (jVar != null) {
            aVar.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.a0
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    c0.b(jVar, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        s5.a aVar2 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManagerHostApi.getAssetFilePathByName", a());
        if (jVar != null) {
            aVar2.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.b0
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    c0.c(jVar, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
    }
}
