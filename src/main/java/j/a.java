package j;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f23809a;

    private a(Context context) {
        this.f23809a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f23809a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f23809a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f23809a.getResources().getConfiguration();
        int i8 = configuration.screenWidthDp;
        int i9 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i8 > 600) {
            return 5;
        }
        if (i8 > 960 && i9 > 720) {
            return 5;
        }
        if (i8 > 720 && i9 > 960) {
            return 5;
        }
        if (i8 >= 500) {
            return 4;
        }
        if (i8 > 640 && i9 > 480) {
            return 4;
        }
        if (i8 <= 480 || i9 <= 640) {
            return i8 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int e() {
        return this.f23809a.getResources().getDimensionPixelSize(e.d.f21123b);
    }

    public int f() {
        TypedArray typedArrayObtainStyledAttributes = this.f23809a.obtainStyledAttributes(null, e.j.f21222a, e.a.f21089c, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(e.j.f21267j, 0);
        Resources resources = this.f23809a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(e.d.f21122a));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f23809a.getResources().getBoolean(e.b.f21113a);
    }

    public boolean h() {
        return true;
    }
}
