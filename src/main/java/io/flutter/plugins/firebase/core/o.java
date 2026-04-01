package io.flutter.plugins.firebase.core;

import io.flutter.plugins.firebase.core.o;
import io.flutter.plugins.firebase.core.p;
import java.util.ArrayList;
import s5.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o {

    class a implements p.g<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f23062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a.e f23063b;

        a(ArrayList arrayList, a.e eVar) {
            this.f23062a = arrayList;
            this.f23063b = eVar;
        }

        @Override // io.flutter.plugins.firebase.core.p.g
        public void b(Throwable th) {
            this.f23063b.a(p.a(th));
        }

        @Override // io.flutter.plugins.firebase.core.p.g
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Void r32) {
            this.f23062a.add(0, null);
            this.f23063b.a(this.f23062a);
        }
    }

    class b implements p.g<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f23064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a.e f23065b;

        b(ArrayList arrayList, a.e eVar) {
            this.f23064a = arrayList;
            this.f23065b = eVar;
        }

        @Override // io.flutter.plugins.firebase.core.p.g
        public void b(Throwable th) {
            this.f23065b.a(p.a(th));
        }

        @Override // io.flutter.plugins.firebase.core.p.g
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Void r32) {
            this.f23064a.add(0, null);
            this.f23065b.a(this.f23064a);
        }
    }

    class c implements p.g<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f23066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a.e f23067b;

        c(ArrayList arrayList, a.e eVar) {
            this.f23066a = arrayList;
            this.f23067b = eVar;
        }

        @Override // io.flutter.plugins.firebase.core.p.g
        public void b(Throwable th) {
            this.f23067b.a(p.a(th));
        }

        @Override // io.flutter.plugins.firebase.core.p.g
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Void r32) {
            this.f23066a.add(0, null);
            this.f23067b.a(this.f23066a);
        }
    }

    public static s5.i<Object> a() {
        return new s5.s();
    }

    public static /* synthetic */ void b(p.a aVar, Object obj, a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        aVar.f((String) arrayList.get(0), (Boolean) arrayList.get(1), new a(new ArrayList(), eVar));
    }

    public static /* synthetic */ void c(p.a aVar, Object obj, a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        aVar.d((String) arrayList.get(0), (Boolean) arrayList.get(1), new b(new ArrayList(), eVar));
    }

    public static void e(s5.c cVar, final p.a aVar) {
        s5.a aVar2 = new s5.a(cVar, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticDataCollectionEnabled", a());
        if (aVar != null) {
            aVar2.e(new a.d() { // from class: io.flutter.plugins.firebase.core.l
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    o.b(aVar, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
        s5.a aVar3 = new s5.a(cVar, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticResourceManagementEnabled", a());
        if (aVar != null) {
            aVar3.e(new a.d() { // from class: io.flutter.plugins.firebase.core.m
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    o.c(aVar, obj, eVar);
                }
            });
        } else {
            aVar3.e(null);
        }
        s5.a aVar4 = new s5.a(cVar, "dev.flutter.pigeon.FirebaseAppHostApi.delete", a());
        if (aVar != null) {
            aVar4.e(new a.d() { // from class: io.flutter.plugins.firebase.core.n
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    aVar.e((String) ((ArrayList) obj).get(0), new o.c(new ArrayList(), eVar));
                }
            });
        } else {
            aVar4.e(null);
        }
    }
}
