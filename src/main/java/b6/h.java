package b6;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.window.layout.WindowMetrics;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    public interface a {
        void a(float f8, float f9, float f10);
    }

    public interface b {
        boolean a(View view);
    }

    public static void c(Context context, a aVar) {
        Activity activityF = f(context);
        if (activityF != null) {
            WindowMetrics windowMetricsComputeMaximumWindowMetrics = androidx.window.layout.g.a().computeMaximumWindowMetrics(activityF);
            aVar.a(windowMetricsComputeMaximumWindowMetrics.getBounds().width(), windowMetricsComputeMaximumWindowMetrics.getBounds().height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static boolean d(View view) {
        return j(view, new b() { // from class: b6.f
            @Override // b6.h.b
            public final boolean a(View view2) {
                return view2.hasFocus();
            }
        });
    }

    public static int e(int i8) {
        return View.generateViewId();
    }

    public static Activity f(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return f(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static boolean g(View view, final Class<? extends View>[] clsArr) {
        return j(view, new b() { // from class: b6.g
            @Override // b6.h.b
            public final boolean a(View view2) {
                return h.i(clsArr, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean i(Class[] clsArr, View view) {
        for (Class cls : clsArr) {
            if (cls.isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(View view, b bVar) {
        if (view == null) {
            return false;
        }
        if (bVar.a(view)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                if (j(viewGroup.getChildAt(i8), bVar)) {
                    return true;
                }
            }
        }
        return false;
    }
}
