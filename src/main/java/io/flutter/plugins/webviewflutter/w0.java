package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.n;
import java.util.ArrayList;
import java.util.List;
import s5.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w0 {
    public static s5.i<Object> a() {
        return new s5.s();
    }

    public static /* synthetic */ void b(n.v vVar, Object obj, a.e eVar) {
        Long lValueOf;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        List<String> list = (List) arrayList2.get(1);
        if (number == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        vVar.a(lValueOf, list);
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void c(n.v vVar, Object obj, a.e eVar) {
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
        vVar.b(lValueOf);
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static void d(s5.c cVar, final n.v vVar) {
        s5.a aVar = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.PermissionRequestHostApi.grant", a());
        if (vVar != null) {
            aVar.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.u0
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    w0.b(vVar, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        s5.a aVar2 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.PermissionRequestHostApi.deny", a());
        if (vVar != null) {
            aVar2.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.v0
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    w0.c(vVar, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
    }
}
