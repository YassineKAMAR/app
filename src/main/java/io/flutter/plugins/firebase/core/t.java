package io.flutter.plugins.firebase.core;

import io.flutter.plugins.firebase.core.p;
import io.flutter.plugins.firebase.core.t;
import java.util.ArrayList;
import java.util.List;
import s5.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t {

    class a implements p.g<p.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f23110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a.e f23111b;

        a(ArrayList arrayList, a.e eVar) {
            this.f23110a = arrayList;
            this.f23111b = eVar;
        }

        @Override // io.flutter.plugins.firebase.core.p.g
        public void b(Throwable th) {
            this.f23111b.a(p.a(th));
        }

        @Override // io.flutter.plugins.firebase.core.p.g
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(p.f fVar) {
            this.f23110a.add(0, fVar);
            this.f23111b.a(this.f23110a);
        }
    }

    class b implements p.g<List<p.f>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f23112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a.e f23113b;

        b(ArrayList arrayList, a.e eVar) {
            this.f23112a = arrayList;
            this.f23113b = eVar;
        }

        @Override // io.flutter.plugins.firebase.core.p.g
        public void b(Throwable th) {
            this.f23113b.a(p.a(th));
        }

        @Override // io.flutter.plugins.firebase.core.p.g
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(List<p.f> list) {
            this.f23112a.add(0, list);
            this.f23113b.a(this.f23112a);
        }
    }

    class c implements p.g<p.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f23114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a.e f23115b;

        c(ArrayList arrayList, a.e eVar) {
            this.f23114a = arrayList;
            this.f23115b = eVar;
        }

        @Override // io.flutter.plugins.firebase.core.p.g
        public void b(Throwable th) {
            this.f23115b.a(p.a(th));
        }

        @Override // io.flutter.plugins.firebase.core.p.g
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(p.e eVar) {
            this.f23114a.add(0, eVar);
            this.f23115b.a(this.f23114a);
        }
    }

    public static s5.i<Object> a() {
        return p.c.f23068d;
    }

    public static /* synthetic */ void b(p.b bVar, Object obj, a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        bVar.a((String) arrayList.get(0), (p.e) arrayList.get(1), new a(new ArrayList(), eVar));
    }

    public static void e(s5.c cVar, final p.b bVar) {
        s5.a aVar = new s5.a(cVar, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeApp", a());
        if (bVar != null) {
            aVar.e(new a.d() { // from class: io.flutter.plugins.firebase.core.q
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    t.b(bVar, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        s5.a aVar2 = new s5.a(cVar, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeCore", a());
        if (bVar != null) {
            aVar2.e(new a.d() { // from class: io.flutter.plugins.firebase.core.r
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    bVar.b(new t.b(new ArrayList(), eVar));
                }
            });
        } else {
            aVar2.e(null);
        }
        s5.a aVar3 = new s5.a(cVar, "dev.flutter.pigeon.FirebaseCoreHostApi.optionsFromResource", a());
        if (bVar != null) {
            aVar3.e(new a.d() { // from class: io.flutter.plugins.firebase.core.s
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    bVar.c(new t.c(new ArrayList(), eVar));
                }
            });
        } else {
            aVar3.e(null);
        }
    }
}
