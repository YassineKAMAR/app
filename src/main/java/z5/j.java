package z5;

import java.util.ArrayList;
import java.util.List;
import s5.a;
import s5.s;
import z5.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j {
    public static s5.i<Object> a() {
        return new s();
    }

    public static /* synthetic */ void b(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.remove((String) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void c(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.f((String) arrayList2.get(0), (Boolean) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void d(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.e((String) arrayList2.get(0), (String) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void e(a.b bVar, Object obj, a.e eVar) {
        Long lValueOf;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        String str = (String) arrayList2.get(0);
        Number number = (Number) arrayList2.get(1);
        if (number == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = a.a(th);
            }
        }
        arrayList.add(0, bVar.d(str, lValueOf));
        eVar.a(arrayList);
    }

    public static /* synthetic */ void f(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.g((String) arrayList2.get(0), (Double) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void g(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.c((String) arrayList2.get(0), (List) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void h(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.b((String) arrayList2.get(0), (List) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void i(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.a((String) arrayList2.get(0), (List) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static void j(s5.c cVar, final a.b bVar) {
        s5.a aVar = new s5.a(cVar, "dev.flutter.pigeon.SharedPreferencesApi.remove", a(), cVar.b());
        if (bVar != null) {
            aVar.e(new a.d() { // from class: z5.b
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    j.b(bVar, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        s5.a aVar2 = new s5.a(cVar, "dev.flutter.pigeon.SharedPreferencesApi.setBool", a(), cVar.b());
        if (bVar != null) {
            aVar2.e(new a.d() { // from class: z5.c
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    j.c(bVar, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
        s5.a aVar3 = new s5.a(cVar, "dev.flutter.pigeon.SharedPreferencesApi.setString", a(), cVar.b());
        if (bVar != null) {
            aVar3.e(new a.d() { // from class: z5.d
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    j.d(bVar, obj, eVar);
                }
            });
        } else {
            aVar3.e(null);
        }
        s5.a aVar4 = new s5.a(cVar, "dev.flutter.pigeon.SharedPreferencesApi.setInt", a(), cVar.b());
        if (bVar != null) {
            aVar4.e(new a.d() { // from class: z5.e
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    j.e(bVar, obj, eVar);
                }
            });
        } else {
            aVar4.e(null);
        }
        s5.a aVar5 = new s5.a(cVar, "dev.flutter.pigeon.SharedPreferencesApi.setDouble", a(), cVar.b());
        if (bVar != null) {
            aVar5.e(new a.d() { // from class: z5.f
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    j.f(bVar, obj, eVar);
                }
            });
        } else {
            aVar5.e(null);
        }
        s5.a aVar6 = new s5.a(cVar, "dev.flutter.pigeon.SharedPreferencesApi.setStringList", a(), cVar.b());
        if (bVar != null) {
            aVar6.e(new a.d() { // from class: z5.g
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    j.g(bVar, obj, eVar);
                }
            });
        } else {
            aVar6.e(null);
        }
        s5.a aVar7 = new s5.a(cVar, "dev.flutter.pigeon.SharedPreferencesApi.clear", a(), cVar.b());
        if (bVar != null) {
            aVar7.e(new a.d() { // from class: z5.h
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    j.h(bVar, obj, eVar);
                }
            });
        } else {
            aVar7.e(null);
        }
        s5.a aVar8 = new s5.a(cVar, "dev.flutter.pigeon.SharedPreferencesApi.getAll", a(), cVar.b());
        if (bVar != null) {
            aVar8.e(new a.d() { // from class: z5.i
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    j.i(bVar, obj, eVar);
                }
            });
        } else {
            aVar8.e(null);
        }
    }
}
