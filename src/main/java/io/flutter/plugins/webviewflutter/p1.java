package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.n;
import java.util.ArrayList;
import s5.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p1 {
    public static s5.i<Object> a() {
        return new s5.s();
    }

    public static /* synthetic */ void b(n.a0 a0Var, Object obj, a.e eVar) {
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
        a0Var.a(lValueOf);
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void c(n.a0 a0Var, Object obj, a.e eVar) {
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
        a0Var.b(lValueOf, bool);
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void d(n.a0 a0Var, Object obj, a.e eVar) {
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
        a0Var.e(lValueOf, bool);
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void e(n.a0 a0Var, Object obj, a.e eVar) {
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
        a0Var.d(lValueOf, bool);
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void f(n.a0 a0Var, Object obj, a.e eVar) {
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
        a0Var.f(lValueOf, bool);
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void g(n.a0 a0Var, Object obj, a.e eVar) {
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
        a0Var.c(lValueOf, bool);
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static void h(s5.c cVar, final n.a0 a0Var) {
        s5.a aVar = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.create", a());
        if (a0Var != null) {
            aVar.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.j1
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    p1.b(a0Var, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        s5.a aVar2 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.setSynchronousReturnValueForOnShowFileChooser", a());
        if (a0Var != null) {
            aVar2.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.k1
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    p1.c(a0Var, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
        s5.a aVar3 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.setSynchronousReturnValueForOnConsoleMessage", a());
        if (a0Var != null) {
            aVar3.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.l1
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    p1.d(a0Var, obj, eVar);
                }
            });
        } else {
            aVar3.e(null);
        }
        s5.a aVar4 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.setSynchronousReturnValueForOnJsAlert", a());
        if (a0Var != null) {
            aVar4.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.m1
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    p1.e(a0Var, obj, eVar);
                }
            });
        } else {
            aVar4.e(null);
        }
        s5.a aVar5 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.setSynchronousReturnValueForOnJsConfirm", a());
        if (a0Var != null) {
            aVar5.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.n1
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    p1.f(a0Var, obj, eVar);
                }
            });
        } else {
            aVar5.e(null);
        }
        s5.a aVar6 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.setSynchronousReturnValueForOnJsPrompt", a());
        if (a0Var != null) {
            aVar6.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.o1
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    p1.g(a0Var, obj, eVar);
                }
            });
        } else {
            aVar6.e(null);
        }
    }
}
