package androidx.fragment.app;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.c0;
import androidx.core.view.e0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f2546a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final q f2547b = new p();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final q f2548c = w();

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f2549a;

        a(ArrayList arrayList) {
            this.f2549a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            o.A(this.f2549a, 4);
        }
    }

    static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f2551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f2552c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Fragment f2553d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f2554e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f2555f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ArrayList f2556g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Object f2557h;

        b(Object obj, q qVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f2550a = obj;
            this.f2551b = qVar;
            this.f2552c = view;
            this.f2553d = fragment;
            this.f2554e = arrayList;
            this.f2555f = arrayList2;
            this.f2556g = arrayList3;
            this.f2557h = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f2550a;
            if (obj != null) {
                this.f2551b.p(obj, this.f2552c);
                this.f2555f.addAll(o.k(this.f2551b, this.f2550a, this.f2553d, this.f2554e, this.f2552c));
            }
            if (this.f2556g != null) {
                if (this.f2557h != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f2552c);
                    this.f2551b.q(this.f2557h, this.f2556g, arrayList);
                }
                this.f2556g.clear();
                this.f2556g.add(this.f2552c);
            }
        }
    }

    static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f2558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f2559b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f2560c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p.a f2561d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f2562e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ q f2563f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Rect f2564g;

        c(Fragment fragment, Fragment fragment2, boolean z7, p.a aVar, View view, q qVar, Rect rect) {
            this.f2558a = fragment;
            this.f2559b = fragment2;
            this.f2560c = z7;
            this.f2561d = aVar;
            this.f2562e = view;
            this.f2563f = qVar;
            this.f2564g = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            o.f(this.f2558a, this.f2559b, this.f2560c, this.f2561d, false);
            View view = this.f2562e;
            if (view != null) {
                this.f2563f.k(view, this.f2564g);
            }
        }
    }

    static class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f2565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p.a f2566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f2567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f2568d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f2569e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f2570f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Fragment f2571g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Fragment f2572h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f2573i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ ArrayList f2574j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Object f2575k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ Rect f2576l;

        d(q qVar, p.a aVar, Object obj, e eVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z7, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f2565a = qVar;
            this.f2566b = aVar;
            this.f2567c = obj;
            this.f2568d = eVar;
            this.f2569e = arrayList;
            this.f2570f = view;
            this.f2571g = fragment;
            this.f2572h = fragment2;
            this.f2573i = z7;
            this.f2574j = arrayList2;
            this.f2575k = obj2;
            this.f2576l = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.a<String, View> aVarH = o.h(this.f2565a, this.f2566b, this.f2567c, this.f2568d);
            if (aVarH != null) {
                this.f2569e.addAll(aVarH.values());
                this.f2569e.add(this.f2570f);
            }
            o.f(this.f2571g, this.f2572h, this.f2573i, aVarH, false);
            Object obj = this.f2567c;
            if (obj != null) {
                this.f2565a.z(obj, this.f2574j, this.f2569e);
                View viewS = o.s(aVarH, this.f2568d, this.f2575k, this.f2573i);
                if (viewS != null) {
                    this.f2565a.k(viewS, this.f2576l);
                }
            }
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Fragment f2577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f2578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public androidx.fragment.app.a f2579c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Fragment f2580d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f2581e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public androidx.fragment.app.a f2582f;

        e() {
        }
    }

    static void A(ArrayList<View> arrayList, int i8) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i8);
        }
    }

    static void B(j jVar, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i8, int i9, boolean z7) {
        if (jVar.f2452p < 1) {
            return;
        }
        SparseArray sparseArray = new SparseArray();
        for (int i10 = i8; i10 < i9; i10++) {
            androidx.fragment.app.a aVar = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue()) {
                e(aVar, sparseArray, z7);
            } else {
                c(aVar, sparseArray, z7);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(jVar.f2453q.g());
            int size = sparseArray.size();
            for (int i11 = 0; i11 < size; i11++) {
                int iKeyAt = sparseArray.keyAt(i11);
                p.a<String, String> aVarD = d(iKeyAt, arrayList, arrayList2, i8, i9);
                e eVar = (e) sparseArray.valueAt(i11);
                if (z7) {
                    o(jVar, iKeyAt, eVar, view, aVarD);
                } else {
                    n(jVar, iKeyAt, eVar, view, aVarD);
                }
            }
        }
    }

    private static void a(ArrayList<View> arrayList, p.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View viewN = aVar.n(size);
            if (collection.contains(e0.r(viewN))) {
                arrayList.add(viewN);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(androidx.fragment.app.a r16, androidx.fragment.app.n.a r17, android.util.SparseArray<androidx.fragment.app.o.e> r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.o.b(androidx.fragment.app.a, androidx.fragment.app.n$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(androidx.fragment.app.a aVar, SparseArray<e> sparseArray, boolean z7) {
        int size = aVar.f2520a.size();
        for (int i8 = 0; i8 < size; i8++) {
            b(aVar, aVar.f2520a.get(i8), sparseArray, false, z7);
        }
    }

    private static p.a<String, String> d(int i8, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i9, int i10) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        p.a<String, String> aVar = new p.a<>();
        for (int i11 = i10 - 1; i11 >= i9; i11--) {
            androidx.fragment.app.a aVar2 = arrayList.get(i11);
            if (aVar2.p(i8)) {
                boolean zBooleanValue = arrayList2.get(i11).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f2534o;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (zBooleanValue) {
                        arrayList3 = aVar2.f2534o;
                        arrayList4 = aVar2.f2535p;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.f2534o;
                        arrayList3 = aVar2.f2535p;
                        arrayList4 = arrayList6;
                    }
                    for (int i12 = 0; i12 < size; i12++) {
                        String str = arrayList4.get(i12);
                        String str2 = arrayList3.get(i12);
                        String strRemove = aVar.remove(str2);
                        if (strRemove != null) {
                            aVar.put(str, strRemove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void e(androidx.fragment.app.a aVar, SparseArray<e> sparseArray, boolean z7) {
        if (aVar.f2389s.f2454r.d()) {
            for (int size = aVar.f2520a.size() - 1; size >= 0; size--) {
                b(aVar, aVar.f2520a.get(size), sparseArray, true, z7);
            }
        }
    }

    static void f(Fragment fragment, Fragment fragment2, boolean z7, p.a<String, View> aVar, boolean z8) {
        if (z7) {
            fragment2.s();
        } else {
            fragment.s();
        }
    }

    private static boolean g(q qVar, List<Object> list) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (!qVar.e(list.get(i8))) {
                return false;
            }
        }
        return true;
    }

    static p.a<String, View> h(q qVar, p.a<String, String> aVar, Object obj, e eVar) {
        ArrayList<String> arrayList;
        Fragment fragment = eVar.f2577a;
        View viewL = fragment.L();
        if (aVar.isEmpty() || obj == null || viewL == null) {
            aVar.clear();
            return null;
        }
        p.a<String, View> aVar2 = new p.a<>();
        qVar.j(aVar2, viewL);
        androidx.fragment.app.a aVar3 = eVar.f2579c;
        if (eVar.f2578b) {
            fragment.v();
            arrayList = aVar3.f2534o;
        } else {
            fragment.s();
            arrayList = aVar3.f2535p;
        }
        if (arrayList != null) {
            aVar2.p(arrayList);
            aVar2.p(aVar.values());
        }
        x(aVar, aVar2);
        return aVar2;
    }

    private static p.a<String, View> i(q qVar, p.a<String, String> aVar, Object obj, e eVar) {
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = eVar.f2580d;
        p.a<String, View> aVar2 = new p.a<>();
        qVar.j(aVar2, fragment.c1());
        androidx.fragment.app.a aVar3 = eVar.f2582f;
        if (eVar.f2581e) {
            fragment.s();
            arrayList = aVar3.f2535p;
        } else {
            fragment.v();
            arrayList = aVar3.f2534o;
        }
        aVar2.p(arrayList);
        aVar.p(aVar2.keySet());
        return aVar2;
    }

    private static q j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object objT = fragment.t();
            if (objT != null) {
                arrayList.add(objT);
            }
            Object objG = fragment.G();
            if (objG != null) {
                arrayList.add(objG);
            }
            Object objI = fragment.I();
            if (objI != null) {
                arrayList.add(objI);
            }
        }
        if (fragment2 != null) {
            Object objR = fragment2.r();
            if (objR != null) {
                arrayList.add(objR);
            }
            Object objD = fragment2.D();
            if (objD != null) {
                arrayList.add(objD);
            }
            Object objH = fragment2.H();
            if (objH != null) {
                arrayList.add(objH);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        q qVar = f2547b;
        if (qVar != null && g(qVar, arrayList)) {
            return qVar;
        }
        q qVar2 = f2548c;
        if (qVar2 != null && g(qVar2, arrayList)) {
            return qVar2;
        }
        if (qVar == null && qVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    static ArrayList<View> k(q qVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View viewL = fragment.L();
        if (viewL != null) {
            qVar.f(arrayList2, viewL);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        qVar.b(obj, arrayList2);
        return arrayList2;
    }

    private static Object l(q qVar, ViewGroup viewGroup, View view, p.a<String, String> aVar, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object objT;
        p.a<String, String> aVar2;
        Object obj3;
        Rect rect;
        Fragment fragment = eVar.f2577a;
        Fragment fragment2 = eVar.f2580d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z7 = eVar.f2578b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            objT = null;
        } else {
            objT = t(qVar, fragment, fragment2, z7);
            aVar2 = aVar;
        }
        p.a<String, View> aVarI = i(qVar, aVar2, objT, eVar);
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(aVarI.values());
            obj3 = objT;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z7, aVarI, true);
        if (obj3 != null) {
            rect = new Rect();
            qVar.y(obj3, view, arrayList);
            z(qVar, obj3, obj2, aVarI, eVar.f2581e, eVar.f2582f);
            if (obj != null) {
                qVar.u(obj, rect);
            }
        } else {
            rect = null;
        }
        c0.a(viewGroup, new d(qVar, aVar, obj3, eVar, arrayList2, view, fragment, fragment2, z7, arrayList, obj, rect));
        return obj3;
    }

    private static Object m(q qVar, ViewGroup viewGroup, View view, p.a<String, String> aVar, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = eVar.f2577a;
        Fragment fragment2 = eVar.f2580d;
        if (fragment != null) {
            fragment.c1().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z7 = eVar.f2578b;
        Object objT = aVar.isEmpty() ? null : t(qVar, fragment, fragment2, z7);
        p.a<String, View> aVarI = i(qVar, aVar, objT, eVar);
        p.a<String, View> aVarH = h(qVar, aVar, objT, eVar);
        if (aVar.isEmpty()) {
            if (aVarI != null) {
                aVarI.clear();
            }
            if (aVarH != null) {
                aVarH.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, aVarI, aVar.keySet());
            a(arrayList2, aVarH, aVar.values());
            obj3 = objT;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z7, aVarI, true);
        if (obj3 != null) {
            arrayList2.add(view);
            qVar.y(obj3, view, arrayList);
            z(qVar, obj3, obj2, aVarI, eVar.f2581e, eVar.f2582f);
            Rect rect2 = new Rect();
            View viewS = s(aVarH, eVar, obj, z7);
            if (viewS != null) {
                qVar.u(obj, rect2);
            }
            rect = rect2;
            view2 = viewS;
        } else {
            view2 = null;
            rect = null;
        }
        c0.a(viewGroup, new c(fragment, fragment2, z7, aVarH, view2, qVar, rect));
        return obj3;
    }

    private static void n(j jVar, int i8, e eVar, View view, p.a<String, String> aVar) {
        Fragment fragment;
        Fragment fragment2;
        q qVarJ;
        Object obj;
        ViewGroup viewGroup = jVar.f2454r.d() ? (ViewGroup) jVar.f2454r.c(i8) : null;
        if (viewGroup == null || (qVarJ = j((fragment2 = eVar.f2580d), (fragment = eVar.f2577a))) == null) {
            return;
        }
        boolean z7 = eVar.f2578b;
        boolean z8 = eVar.f2581e;
        Object objQ = q(qVarJ, fragment, z7);
        Object objR = r(qVarJ, fragment2, z8);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objL = l(qVarJ, viewGroup, view, aVar, eVar, arrayList, arrayList2, objQ, objR);
        if (objQ == null && objL == null) {
            obj = objR;
            if (obj == null) {
                return;
            }
        } else {
            obj = objR;
        }
        ArrayList<View> arrayListK = k(qVarJ, obj, fragment2, arrayList, view);
        Object obj2 = (arrayListK == null || arrayListK.isEmpty()) ? null : obj;
        qVarJ.a(objQ, view);
        Object objU = u(qVarJ, objQ, obj2, objL, fragment, eVar.f2578b);
        if (objU != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            qVarJ.t(objU, objQ, arrayList3, obj2, arrayListK, objL, arrayList2);
            y(qVarJ, viewGroup, fragment, view, arrayList2, objQ, arrayList3, obj2, arrayListK);
            qVarJ.w(viewGroup, arrayList2, aVar);
            qVarJ.c(viewGroup, objU);
            qVarJ.s(viewGroup, arrayList2, aVar);
        }
    }

    private static void o(j jVar, int i8, e eVar, View view, p.a<String, String> aVar) {
        Fragment fragment;
        Fragment fragment2;
        q qVarJ;
        Object obj;
        ViewGroup viewGroup = jVar.f2454r.d() ? (ViewGroup) jVar.f2454r.c(i8) : null;
        if (viewGroup == null || (qVarJ = j((fragment2 = eVar.f2580d), (fragment = eVar.f2577a))) == null) {
            return;
        }
        boolean z7 = eVar.f2578b;
        boolean z8 = eVar.f2581e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objQ = q(qVarJ, fragment, z7);
        Object objR = r(qVarJ, fragment2, z8);
        Object objM = m(qVarJ, viewGroup, view, aVar, eVar, arrayList2, arrayList, objQ, objR);
        if (objQ == null && objM == null) {
            obj = objR;
            if (obj == null) {
                return;
            }
        } else {
            obj = objR;
        }
        ArrayList<View> arrayListK = k(qVarJ, obj, fragment2, arrayList2, view);
        ArrayList<View> arrayListK2 = k(qVarJ, objQ, fragment, arrayList, view);
        A(arrayListK2, 4);
        Object objU = u(qVarJ, objQ, obj, objM, fragment, z7);
        if (objU != null) {
            v(qVarJ, obj, fragment2, arrayListK);
            ArrayList<String> arrayListO = qVarJ.o(arrayList);
            qVarJ.t(objU, objQ, arrayListK2, obj, arrayListK, objM, arrayList);
            qVarJ.c(viewGroup, objU);
            qVarJ.x(viewGroup, arrayList2, arrayList, arrayListO, aVar);
            A(arrayListK2, 0);
            qVarJ.z(objM, arrayList2, arrayList);
        }
    }

    private static e p(e eVar, SparseArray<e> sparseArray, int i8) {
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        sparseArray.put(i8, eVar2);
        return eVar2;
    }

    private static Object q(q qVar, Fragment fragment, boolean z7) {
        if (fragment == null) {
            return null;
        }
        return qVar.g(z7 ? fragment.D() : fragment.r());
    }

    private static Object r(q qVar, Fragment fragment, boolean z7) {
        if (fragment == null) {
            return null;
        }
        return qVar.g(z7 ? fragment.G() : fragment.t());
    }

    static View s(p.a<String, View> aVar, e eVar, Object obj, boolean z7) {
        ArrayList<String> arrayList;
        androidx.fragment.app.a aVar2 = eVar.f2579c;
        if (obj == null || aVar == null || (arrayList = aVar2.f2534o) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z7 ? aVar2.f2534o : aVar2.f2535p).get(0));
    }

    private static Object t(q qVar, Fragment fragment, Fragment fragment2, boolean z7) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return qVar.A(qVar.g(z7 ? fragment2.I() : fragment.H()));
    }

    private static Object u(q qVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z7) {
        return (obj == null || obj2 == null || fragment == null) ? true : z7 ? fragment.m() : fragment.l() ? qVar.n(obj2, obj, obj3) : qVar.m(obj2, obj, obj3);
    }

    private static void v(q qVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.f2352k && fragment.f2366y && fragment.f2333a0) {
            fragment.i1(true);
            qVar.r(obj, fragment.L(), arrayList);
            c0.a(fragment.F, new a(arrayList));
        }
    }

    private static q w() {
        try {
            return (q) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void x(p.a<String, String> aVar, p.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.n(size))) {
                aVar.l(size);
            }
        }
    }

    private static void y(q qVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        c0.a(viewGroup, new b(obj, qVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    private static void z(q qVar, Object obj, Object obj2, p.a<String, View> aVar, boolean z7, androidx.fragment.app.a aVar2) {
        ArrayList<String> arrayList = aVar2.f2534o;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = aVar.get((z7 ? aVar2.f2535p : aVar2.f2534o).get(0));
        qVar.v(obj, view);
        if (obj2 != null) {
            qVar.v(obj2, view);
        }
    }
}
