package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class i1 extends ContextWrapper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f996c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ArrayList<WeakReference<i1>> f997d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources.Theme f999b;

    private i1(Context context) {
        super(context);
        if (!r1.b()) {
            this.f998a = new k1(this, context.getResources());
            this.f999b = null;
            return;
        }
        r1 r1Var = new r1(this, context.getResources());
        this.f998a = r1Var;
        Resources.Theme themeNewTheme = r1Var.newTheme();
        this.f999b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        return ((context instanceof i1) || (context.getResources() instanceof k1) || (context.getResources() instanceof r1) || !r1.b()) ? false : true;
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f996c) {
            ArrayList<WeakReference<i1>> arrayList = f997d;
            if (arrayList == null) {
                f997d = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference<i1> weakReference = f997d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f997d.remove(size);
                    }
                }
                for (int size2 = f997d.size() - 1; size2 >= 0; size2--) {
                    WeakReference<i1> weakReference2 = f997d.get(size2);
                    i1 i1Var = weakReference2 != null ? weakReference2.get() : null;
                    if (i1Var != null && i1Var.getBaseContext() == context) {
                        return i1Var;
                    }
                }
            }
            i1 i1Var2 = new i1(context);
            f997d.add(new WeakReference<>(i1Var2));
            return i1Var2;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f998a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f998a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f999b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i8) {
        Resources.Theme theme = this.f999b;
        if (theme == null) {
            super.setTheme(i8);
        } else {
            theme.applyStyle(i8, true);
        }
    }
}
