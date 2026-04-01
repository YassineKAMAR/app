package a6;

import a6.a;
import java.util.ArrayList;
import java.util.Map;
import s5.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g {
    public static s5.i<Object> a() {
        return a.c.f224d;
    }

    public static /* synthetic */ void b(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.a((String) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void c(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.e((String) arrayList2.get(0), (Map) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void d(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.b((String) arrayList2.get(0), (Boolean) arrayList2.get(1), (a.d) arrayList2.get(2)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void e(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.c());
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void f(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            bVar.d();
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static void g(s5.c cVar, final a.b bVar) {
        s5.a aVar = new s5.a(cVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl", a());
        if (bVar != null) {
            aVar.e(new a.d() { // from class: a6.b
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    g.b(bVar, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        s5.a aVar2 = new s5.a(cVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl", a());
        if (bVar != null) {
            aVar2.e(new a.d() { // from class: a6.c
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    g.c(bVar, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
        s5.a aVar3 = new s5.a(cVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp", a());
        if (bVar != null) {
            aVar3.e(new a.d() { // from class: a6.d
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    g.d(bVar, obj, eVar);
                }
            });
        } else {
            aVar3.e(null);
        }
        s5.a aVar4 = new s5.a(cVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs", a());
        if (bVar != null) {
            aVar4.e(new a.d() { // from class: a6.e
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    g.e(bVar, obj, eVar);
                }
            });
        } else {
            aVar4.e(null);
        }
        s5.a aVar5 = new s5.a(cVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView", a());
        if (bVar != null) {
            aVar5.e(new a.d() { // from class: a6.f
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    g.f(bVar, obj, eVar);
                }
            });
        } else {
            aVar5.e(null);
        }
    }
}
