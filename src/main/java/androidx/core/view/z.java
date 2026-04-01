package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2260b;

    public z(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f2259a | this.f2260b;
    }

    public void b(View view, View view2, int i8) {
        c(view, view2, i8, 0);
    }

    public void c(View view, View view2, int i8, int i9) {
        if (i9 == 1) {
            this.f2260b = i8;
        } else {
            this.f2259a = i8;
        }
    }

    public void d(View view, int i8) {
        if (i8 == 1) {
            this.f2260b = 0;
        } else {
            this.f2259a = 0;
        }
    }
}
