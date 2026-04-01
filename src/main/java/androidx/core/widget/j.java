package androidx.core.widget;

import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    static class a {
        static boolean a(ListView listView, int i8) {
            return listView.canScrollList(i8);
        }

        static void b(ListView listView, int i8) {
            listView.scrollListBy(i8);
        }
    }

    public static void a(ListView listView, int i8) {
        a.b(listView, i8);
    }
}
