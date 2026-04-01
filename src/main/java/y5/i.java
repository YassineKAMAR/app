package y5;

import java.util.ArrayList;
import s5.a;
import s5.s;
import y5.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i {
    public static s5.i<Object> a() {
        return new s();
    }

    public static /* synthetic */ void b(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.d());
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void c(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.g());
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void d(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.f());
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void e(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.e());
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void f(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.c());
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void g(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.a());
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void h(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.b(arrayList2.get(0) == null ? null : a.c.values()[((Integer) arrayList2.get(0)).intValue()]));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static void i(s5.c cVar, final a.b bVar) {
        s5.a aVar = new s5.a(cVar, "dev.flutter.pigeon.PathProviderApi.getTemporaryPath", a(), cVar.b());
        if (bVar != null) {
            aVar.e(new a.d() { // from class: y5.b
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    i.b(bVar, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        s5.a aVar2 = new s5.a(cVar, "dev.flutter.pigeon.PathProviderApi.getApplicationSupportPath", a(), cVar.b());
        if (bVar != null) {
            aVar2.e(new a.d() { // from class: y5.c
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    i.c(bVar, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
        s5.a aVar3 = new s5.a(cVar, "dev.flutter.pigeon.PathProviderApi.getApplicationDocumentsPath", a(), cVar.b());
        if (bVar != null) {
            aVar3.e(new a.d() { // from class: y5.d
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    i.d(bVar, obj, eVar);
                }
            });
        } else {
            aVar3.e(null);
        }
        s5.a aVar4 = new s5.a(cVar, "dev.flutter.pigeon.PathProviderApi.getApplicationCachePath", a(), cVar.b());
        if (bVar != null) {
            aVar4.e(new a.d() { // from class: y5.e
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    i.e(bVar, obj, eVar);
                }
            });
        } else {
            aVar4.e(null);
        }
        s5.a aVar5 = new s5.a(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePath", a(), cVar.b());
        if (bVar != null) {
            aVar5.e(new a.d() { // from class: y5.f
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    i.f(bVar, obj, eVar);
                }
            });
        } else {
            aVar5.e(null);
        }
        s5.a aVar6 = new s5.a(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalCachePaths", a(), cVar.b());
        if (bVar != null) {
            aVar6.e(new a.d() { // from class: y5.g
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    i.g(bVar, obj, eVar);
                }
            });
        } else {
            aVar6.e(null);
        }
        s5.a aVar7 = new s5.a(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePaths", a(), cVar.b());
        if (bVar != null) {
            aVar7.e(new a.d() { // from class: y5.h
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    i.h(bVar, obj, eVar);
                }
            });
        } else {
            aVar7.e(null);
        }
    }
}
