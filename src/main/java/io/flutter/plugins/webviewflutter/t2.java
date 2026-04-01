package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.n;
import java.util.ArrayList;
import s5.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t2 {
    public static s5.i<Object> a() {
        return new s5.s();
    }

    public static /* synthetic */ void b(n.h0 h0Var, Object obj, a.e eVar) {
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
        h0Var.a(lValueOf);
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void c(n.h0 h0Var, Object obj, a.e eVar) {
        Long lValueOf;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        Boolean bool = (Boolean) arrayList2.get(1);
        if (number == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        h0Var.b(lValueOf, bool);
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static void d(s5.c cVar, final n.h0 h0Var) {
        s5.a aVar = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewClientHostApi.create", a());
        if (h0Var != null) {
            aVar.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.r2
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    t2.b(h0Var, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        s5.a aVar2 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewClientHostApi.setSynchronousReturnValueForShouldOverrideUrlLoading", a());
        if (h0Var != null) {
            aVar2.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.s2
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    t2.c(h0Var, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
    }
}
