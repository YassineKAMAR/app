package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.n;
import java.util.ArrayList;
import s5.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k0 {
    public static s5.i<Object> a() {
        return new s5.s();
    }

    public static /* synthetic */ void b(n.o oVar, Object obj, a.e eVar) {
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
        arrayList.add(0, oVar.b(lValueOf));
        eVar.a(arrayList);
    }

    public static /* synthetic */ void c(n.o oVar, Object obj, a.e eVar) {
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
        oVar.a(lValueOf);
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void d(n.o oVar, Object obj, a.e eVar) {
        Long lValueOf;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        String str = (String) arrayList2.get(1);
        String str2 = (String) arrayList2.get(2);
        if (number == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        oVar.c(lValueOf, str, str2);
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static void e(s5.c cVar, final n.o oVar) {
        s5.a aVar = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandlerHostApi.useHttpAuthUsernamePassword", a());
        if (oVar != null) {
            aVar.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.h0
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    k0.b(oVar, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        s5.a aVar2 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandlerHostApi.cancel", a());
        if (oVar != null) {
            aVar2.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.i0
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    k0.c(oVar, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
        s5.a aVar3 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandlerHostApi.proceed", a());
        if (oVar != null) {
            aVar3.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.j0
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    k0.d(oVar, obj, eVar);
                }
            });
        } else {
            aVar3.e(null);
        }
    }
}
