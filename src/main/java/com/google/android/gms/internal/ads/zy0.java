package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zy0 extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f18510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f18511b;

    private zy0(Context context) {
        super(context);
        this.f18510a = context;
    }

    public static zy0 a(Context context, View view, wr2 wr2Var) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zy0 zy0Var = new zy0(context);
        if (!wr2Var.f16908w.isEmpty() && (resources = zy0Var.f18510a.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f8 = ((xr2) wr2Var.f16908w.get(0)).f17446a;
            float f9 = displayMetrics.density;
            zy0Var.setLayoutParams(new FrameLayout.LayoutParams((int) (f8 * f9), (int) (r1.f17447b * f9)));
        }
        zy0Var.f18511b = view;
        zy0Var.addView(view);
        g2.t.z();
        rh0.b(zy0Var, zy0Var);
        g2.t.z();
        rh0.a(zy0Var, zy0Var);
        JSONObject jSONObject = wr2Var.f16884j0;
        RelativeLayout relativeLayout = new RelativeLayout(zy0Var.f18510a);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            zy0Var.c(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            zy0Var.c(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        zy0Var.addView(relativeLayout);
        return zy0Var;
    }

    private final int b(double d8) {
        h2.v.b();
        return jg0.B(this.f18510a, (int) d8);
    }

    private final void c(JSONObject jSONObject, RelativeLayout relativeLayout, int i8) {
        TextView textView = new TextView(this.f18510a);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int iB = b(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, iB, 0, iB);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, b(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i8);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.f18511b.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.f18511b.setY(-r0[1]);
    }
}
