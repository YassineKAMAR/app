package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.n;
import java.util.ArrayList;
import s5.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s0 {
    public static s5.i<Object> a() {
        return new s5.s();
    }

    public static /* synthetic */ void b(n.t tVar, Object obj, a.e eVar) {
        Long lValueOf;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        String str = (String) arrayList2.get(1);
        if (number == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        tVar.a(lValueOf, str);
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static void c(s5.c cVar, final n.t tVar) {
        new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannelHostApi.create", a()).e(tVar != null ? new a.d() { // from class: io.flutter.plugins.webviewflutter.r0
            @Override // s5.a.d
            public final void a(Object obj, a.e eVar) {
                s0.b(tVar, obj, eVar);
            }
        } : null);
    }
}
