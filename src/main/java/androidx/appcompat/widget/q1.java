package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f1095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextView f1096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WindowManager.LayoutParams f1097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f1098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f1099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f1100g;

    q1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1097d = layoutParams;
        this.f1098e = new Rect();
        this.f1099f = new int[2];
        this.f1100g = new int[2];
        this.f1094a = context;
        View viewInflate = LayoutInflater.from(context).inflate(e.g.f21204s, (ViewGroup) null);
        this.f1095b = viewInflate;
        this.f1096c = (TextView) viewInflate.findViewById(e.f.f21178s);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = e.i.f21218a;
        layoutParams.flags = 24;
    }

    private void a(View view, int i8, int i9, boolean z7, WindowManager.LayoutParams layoutParams) {
        int height;
        int i10;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1094a.getResources().getDimensionPixelOffset(e.d.f21131j);
        if (view.getWidth() < dimensionPixelOffset) {
            i8 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1094a.getResources().getDimensionPixelOffset(e.d.f21130i);
            height = i9 + dimensionPixelOffset2;
            i10 = i9 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i10 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1094a.getResources().getDimensionPixelOffset(z7 ? e.d.f21133l : e.d.f21132k);
        View viewB = b(view);
        if (viewB == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        viewB.getWindowVisibleDisplayFrame(this.f1098e);
        Rect rect = this.f1098e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1094a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1098e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewB.getLocationOnScreen(this.f1100g);
        view.getLocationOnScreen(this.f1099f);
        int[] iArr = this.f1099f;
        int i11 = iArr[0];
        int[] iArr2 = this.f1100g;
        int i12 = i11 - iArr2[0];
        iArr[0] = i12;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i12 + i8) - (viewB.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1095b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f1095b.getMeasuredHeight();
        int i13 = this.f1099f[1];
        int i14 = ((i10 + i13) - dimensionPixelOffset3) - measuredHeight;
        int i15 = i13 + height + dimensionPixelOffset3;
        if (!z7 ? measuredHeight + i15 <= this.f1098e.height() : i14 < 0) {
            layoutParams.y = i14;
        } else {
            layoutParams.y = i15;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    void c() {
        if (d()) {
            ((WindowManager) this.f1094a.getSystemService("window")).removeView(this.f1095b);
        }
    }

    boolean d() {
        return this.f1095b.getParent() != null;
    }

    void e(View view, int i8, int i9, boolean z7, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f1096c.setText(charSequence);
        a(view, i8, i9, z7, this.f1097d);
        ((WindowManager) this.f1094a.getSystemService("window")).addView(this.f1095b, this.f1097d);
    }
}
