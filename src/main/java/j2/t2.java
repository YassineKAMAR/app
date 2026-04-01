package j2;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.ns;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(28)
public class t2 extends q2 {
    static final /* synthetic */ WindowInsets o(Activity activity, View view, WindowInsets windowInsets) {
        if (g2.t.q().h().x() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String strConcat = "";
            if (displayCutout != null) {
                x1 x1VarH = g2.t.q().h();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    String str = String.format(Locale.US, "%d,%d,%d,%d", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
                    if (!TextUtils.isEmpty(strConcat)) {
                        strConcat = strConcat.concat(com.amazon.a.a.o.b.f.f3944c);
                    }
                    strConcat = strConcat.concat(String.valueOf(str));
                }
                x1VarH.z(strConcat);
            } else {
                g2.t.q().h().z("");
            }
        }
        p(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    private static final void p(boolean z7, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i8 = attributes.layoutInDisplayCutoutMode;
        int i9 = true != z7 ? 2 : 1;
        if (i9 != i8) {
            attributes.layoutInDisplayCutoutMode = i9;
            window.setAttributes(attributes);
        }
    }

    @Override // j2.c
    public final int j(AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }

    @Override // j2.c
    public final void k(final Activity activity) {
        if (((Boolean) h2.y.c().b(ns.f12059e1)).booleanValue() && g2.t.q().h().x() == null && !activity.isInMultiWindowMode()) {
            p(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: j2.r2
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return t2.o(activity, view, windowInsets);
                }
            });
        }
    }
}
