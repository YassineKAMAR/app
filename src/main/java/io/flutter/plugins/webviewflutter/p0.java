package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.n;
import java.util.ArrayList;
import s5.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p0 {
    public static s5.i<Object> a() {
        return new s5.s();
    }

    public static /* synthetic */ void b(n.r rVar, Object obj, a.e eVar) {
        Long lValueOf;
        ArrayList<Object> arrayList = new ArrayList<>();
        Number number = (Number) ((ArrayList) obj).get(0);
        if (number == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        rVar.a(lValueOf);
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static void c(s5.c cVar, final n.r rVar) {
        new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.JavaObjectHostApi.dispose", a()).e(rVar != null ? new a.d() { // from class: io.flutter.plugins.webviewflutter.o0
            @Override // s5.a.d
            public final void a(Object obj, a.e eVar) {
                p0.b(rVar, obj, eVar);
            }
        } : null);
    }
}
