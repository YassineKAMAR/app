package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.n;
import java.util.ArrayList;
import s5.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s {

    class a implements n.w<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f23582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a.e f23583b;

        a(ArrayList arrayList, a.e eVar) {
            this.f23582a = arrayList;
            this.f23583b = eVar;
        }

        @Override // io.flutter.plugins.webviewflutter.n.w
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Boolean bool) {
            this.f23582a.add(0, bool);
            this.f23583b.a(this.f23582a);
        }
    }

    public static s5.i<Object> a() {
        return new s5.s();
    }

    public static /* synthetic */ void b(n.c cVar, Object obj, a.e eVar) {
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
        cVar.b(lValueOf);
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void c(n.c cVar, Object obj, a.e eVar) {
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
        cVar.d(lValueOf, str, str2);
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void d(n.c cVar, Object obj, a.e eVar) {
        ArrayList arrayList = new ArrayList();
        Number number = (Number) ((ArrayList) obj).get(0);
        cVar.a(number == null ? null : Long.valueOf(number.longValue()), new a(arrayList, eVar));
    }

    public static /* synthetic */ void e(n.c cVar, Object obj, a.e eVar) {
        Long lValueOf;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        Number number2 = (Number) arrayList2.get(1);
        Boolean bool = (Boolean) arrayList2.get(2);
        if (number == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        cVar.c(lValueOf, number2 == null ? null : Long.valueOf(number2.longValue()), bool);
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static void f(s5.c cVar, final n.c cVar2) {
        s5.a aVar = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.CookieManagerHostApi.attachInstance", a());
        if (cVar2 != null) {
            aVar.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.o
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    s.b(cVar2, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        s5.a aVar2 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.CookieManagerHostApi.setCookie", a());
        if (cVar2 != null) {
            aVar2.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.p
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    s.c(cVar2, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
        s5.a aVar3 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.CookieManagerHostApi.removeAllCookies", a());
        if (cVar2 != null) {
            aVar3.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.q
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    s.d(cVar2, obj, eVar);
                }
            });
        } else {
            aVar3.e(null);
        }
        s5.a aVar4 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.CookieManagerHostApi.setAcceptThirdPartyCookies", a());
        if (cVar2 != null) {
            aVar4.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.r
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    s.e(cVar2, obj, eVar);
                }
            });
        } else {
            aVar4.e(null);
        }
    }
}
