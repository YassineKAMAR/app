package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewParent f2254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewParent f2255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f2256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f2258e;

    public w(View view) {
        this.f2256c = view;
    }

    private boolean f(int i8, int i9, int i10, int i11, int[] iArr, int i12, int[] iArr2) {
        ViewParent viewParentG;
        int i13;
        int i14;
        int[] iArr3;
        if (!j() || (viewParentG = g(i12)) == null) {
            return false;
        }
        if (i8 == 0 && i9 == 0 && i10 == 0 && i11 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f2256c.getLocationInWindow(iArr);
            i13 = iArr[0];
            i14 = iArr[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr2 == null) {
            int[] iArrH = h();
            iArrH[0] = 0;
            iArrH[1] = 0;
            iArr3 = iArrH;
        } else {
            iArr3 = iArr2;
        }
        d1.d(viewParentG, this.f2256c, i8, i9, i10, i11, i12, iArr3);
        if (iArr != null) {
            this.f2256c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i13;
            iArr[1] = iArr[1] - i14;
        }
        return true;
    }

    private ViewParent g(int i8) {
        if (i8 == 0) {
            return this.f2254a;
        }
        if (i8 != 1) {
            return null;
        }
        return this.f2255b;
    }

    private int[] h() {
        if (this.f2258e == null) {
            this.f2258e = new int[2];
        }
        return this.f2258e;
    }

    private void l(int i8, ViewParent viewParent) {
        if (i8 == 0) {
            this.f2254a = viewParent;
        } else {
            if (i8 != 1) {
                return;
            }
            this.f2255b = viewParent;
        }
    }

    public boolean a(float f8, float f9, boolean z7) {
        ViewParent viewParentG;
        if (!j() || (viewParentG = g(0)) == null) {
            return false;
        }
        return d1.a(viewParentG, this.f2256c, f8, f9, z7);
    }

    public boolean b(float f8, float f9) {
        ViewParent viewParentG;
        if (!j() || (viewParentG = g(0)) == null) {
            return false;
        }
        return d1.b(viewParentG, this.f2256c, f8, f9);
    }

    public boolean c(int i8, int i9, int[] iArr, int[] iArr2, int i10) {
        ViewParent viewParentG;
        int i11;
        int i12;
        if (!j() || (viewParentG = g(i10)) == null) {
            return false;
        }
        if (i8 == 0 && i9 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f2256c.getLocationInWindow(iArr2);
            i11 = iArr2[0];
            i12 = iArr2[1];
        } else {
            i11 = 0;
            i12 = 0;
        }
        if (iArr == null) {
            iArr = h();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        d1.c(viewParentG, this.f2256c, i8, i9, iArr, i10);
        if (iArr2 != null) {
            this.f2256c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i11;
            iArr2[1] = iArr2[1] - i12;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public void d(int i8, int i9, int i10, int i11, int[] iArr, int i12, int[] iArr2) {
        f(i8, i9, i10, i11, iArr, i12, iArr2);
    }

    public boolean e(int i8, int i9, int i10, int i11, int[] iArr) {
        return f(i8, i9, i10, i11, iArr, 0, null);
    }

    public boolean i(int i8) {
        return g(i8) != null;
    }

    public boolean j() {
        return this.f2257d;
    }

    public void k(boolean z7) {
        if (this.f2257d) {
            e0.S(this.f2256c);
        }
        this.f2257d = z7;
    }

    public boolean m(int i8, int i9) {
        if (i(i9)) {
            return true;
        }
        if (!j()) {
            return false;
        }
        View view = this.f2256c;
        for (ViewParent parent = this.f2256c.getParent(); parent != null; parent = parent.getParent()) {
            if (d1.f(parent, view, this.f2256c, i8, i9)) {
                l(i9, parent);
                d1.e(parent, view, this.f2256c, i8, i9);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void n(int i8) {
        ViewParent viewParentG = g(i8);
        if (viewParentG != null) {
            d1.g(viewParentG, this.f2256c, i8);
            l(i8, null);
        }
    }
}
