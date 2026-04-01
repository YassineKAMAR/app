package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.c0;
import androidx.core.view.c1;
import androidx.core.view.e0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public abstract class q {

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f2597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f2598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f2599c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f2600d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f2601e;

        a(int i8, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f2597a = i8;
            this.f2598b = arrayList;
            this.f2599c = arrayList2;
            this.f2600d = arrayList3;
            this.f2601e = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i8 = 0; i8 < this.f2597a; i8++) {
                e0.P((View) this.f2598b.get(i8), (String) this.f2599c.get(i8));
                e0.P((View) this.f2600d.get(i8), (String) this.f2601e.get(i8));
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f2603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f2604b;

        b(ArrayList arrayList, Map map) {
            this.f2603a = arrayList;
            this.f2604b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f2603a.size();
            for (int i8 = 0; i8 < size; i8++) {
                View view = (View) this.f2603a.get(i8);
                String strR = e0.r(view);
                if (strR != null) {
                    e0.P(view, q.i(this.f2604b, strR));
                }
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f2606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f2607b;

        c(ArrayList arrayList, Map map) {
            this.f2606a = arrayList;
            this.f2607b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f2606a.size();
            for (int i8 = 0; i8 < size; i8++) {
                View view = (View) this.f2606a.get(i8);
                e0.P(view, (String) this.f2607b.get(e0.r(view)));
            }
        }
    }

    protected static void d(List<View> list, View view) {
        int size = list.size();
        if (h(list, view, size)) {
            return;
        }
        list.add(view);
        for (int i8 = size; i8 < list.size(); i8++) {
            View view2 = list.get(i8);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i9 = 0; i9 < childCount; i9++) {
                    View childAt = viewGroup.getChildAt(i9);
                    if (!h(list, childAt, size)) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean h(List<View> list, View view, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            if (list.get(i9) == view) {
                return true;
            }
        }
        return false;
    }

    static String i(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    protected static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public abstract Object A(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    void f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z7 = view instanceof ViewGroup;
            View view2 = view;
            if (z7) {
                ViewGroup viewGroup = (ViewGroup) view;
                boolean zA = c1.a(viewGroup);
                view2 = viewGroup;
                if (!zA) {
                    int childCount = viewGroup.getChildCount();
                    for (int i8 = 0; i8 < childCount; i8++) {
                        f(arrayList, viewGroup.getChildAt(i8));
                    }
                    return;
                }
            }
            arrayList.add(view2);
        }
    }

    public abstract Object g(Object obj);

    void j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String strR = e0.r(view);
            if (strR != null) {
                map.put(strR, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    j(map, viewGroup.getChildAt(i8));
                }
            }
        }
    }

    protected void k(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i8 = iArr[0];
        rect.set(i8, iArr[1], view.getWidth() + i8, iArr[1] + view.getHeight());
    }

    public abstract Object m(Object obj, Object obj2, Object obj3);

    public abstract Object n(Object obj, Object obj2, Object obj3);

    ArrayList<String> o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            View view = arrayList.get(i8);
            arrayList2.add(e0.r(view));
            e0.P(view, null);
        }
        return arrayList2;
    }

    public abstract void p(Object obj, View view);

    public abstract void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void r(Object obj, View view, ArrayList<View> arrayList);

    void s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        c0.a(viewGroup, new c(arrayList, map));
    }

    public abstract void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    void w(View view, ArrayList<View> arrayList, Map<String, String> map) {
        c0.a(view, new b(arrayList, map));
    }

    void x(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i8 = 0; i8 < size; i8++) {
            View view2 = arrayList.get(i8);
            String strR = e0.r(view2);
            arrayList4.add(strR);
            if (strR != null) {
                e0.P(view2, null);
                String str = map.get(strR);
                int i9 = 0;
                while (true) {
                    if (i9 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i9))) {
                        e0.P(arrayList2.get(i9), strR);
                        break;
                    }
                    i9++;
                }
            }
        }
        c0.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void y(Object obj, View view, ArrayList<View> arrayList);

    public abstract void z(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);
}
