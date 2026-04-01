package i2;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.fm0;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup.LayoutParams f22512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f22513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f22514d;

    public n(fm0 fm0Var) throws l {
        this.f22512b = fm0Var.getLayoutParams();
        ViewParent parent = fm0Var.getParent();
        this.f22514d = fm0Var.N();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new l("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f22513c = viewGroup;
        this.f22511a = viewGroup.indexOfChild(fm0Var.T());
        viewGroup.removeView(fm0Var.T());
        fm0Var.h1(true);
    }
}
