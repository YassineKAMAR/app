package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class kn1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f10174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PopupWindow f10175b;

    public final void a(Context context, View view) {
        PopupWindow popupWindow;
        if (!e3.m.d() || e3.m.f()) {
            return;
        }
        Window window = context instanceof Activity ? ((Activity) context).getWindow() : null;
        if (window == null || window.getDecorView() == null || ((Activity) context).isDestroyed()) {
            popupWindow = null;
        } else {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.addView(view, -1, -1);
            popupWindow = new PopupWindow((View) frameLayout, 1, 1, false);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setClippingEnabled(false);
            qg0.b("Displaying the 1x1 popup off the screen.");
            try {
                popupWindow.showAtLocation(window.getDecorView(), 0, -1, -1);
            } catch (Exception unused) {
                popupWindow = null;
            }
        }
        this.f10175b = popupWindow;
        if (popupWindow == null) {
            context = null;
        }
        this.f10174a = context;
    }

    public final void b() {
        Context context = this.f10174a;
        if (context == null || this.f10175b == null) {
            return;
        }
        if ((!(context instanceof Activity) || !((Activity) context).isDestroyed()) && this.f10175b.isShowing()) {
            this.f10175b.dismiss();
        }
        this.f10174a = null;
        this.f10175b = null;
    }
}
