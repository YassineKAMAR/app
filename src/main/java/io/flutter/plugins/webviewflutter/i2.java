package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.n;
import java.util.ArrayList;
import s5.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i2 {
    public static s5.i<Object> a() {
        return new s5.s();
    }

    public static /* synthetic */ void b(n.e0 e0Var, Object obj, a.e eVar) {
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
        e0Var.a(lValueOf);
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void c(n.e0 e0Var, Object obj, a.e eVar) {
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
        e0Var.b(lValueOf);
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static void d(s5.c cVar, final n.e0 e0Var) {
        s5.a aVar = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebStorageHostApi.create", a());
        if (e0Var != null) {
            aVar.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.g2
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    i2.b(e0Var, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        s5.a aVar2 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebStorageHostApi.deleteAllData", a());
        if (e0Var != null) {
            aVar2.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.h2
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    i2.c(e0Var, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
    }
}
