package com.google.android.gms.internal.ads;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAdView;

/* JADX INFO: loaded from: classes.dex */
public final class bu1 {
    bu1() {
    }

    public static final void a(Context context, ViewGroup viewGroup, z1.j jVar) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag("layout");
        f(linearLayout, -1, -1);
        linearLayout.setGravity(17);
        linearLayout.addView(jVar);
        jVar.setTag("ad_view");
        viewGroup.addView(linearLayout);
    }

    public static final void b(Context context, ViewGroup viewGroup, com.google.android.gms.ads.nativead.a aVar) {
        NativeAdView nativeAdView = new NativeAdView(context);
        nativeAdView.setTag("ad_view_tag");
        f(nativeAdView, -1, -1);
        viewGroup.addView(nativeAdView);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag("layout_tag");
        linearLayout.setOrientation(1);
        f(linearLayout, -1, -1);
        linearLayout.setBackgroundColor(-1);
        nativeAdView.addView(linearLayout);
        Resources resourcesD = g2.t.q().d();
        linearLayout.addView(c(context, resourcesD == null ? "Headline" : resourcesD.getString(e2.b.f21356b), "headline_header_tag"));
        View viewD = d(context, b93.c(aVar.e()), "headline_tag");
        nativeAdView.setHeadlineView(viewD);
        linearLayout.addView(viewD);
        linearLayout.addView(c(context, resourcesD == null ? "Body" : resourcesD.getString(e2.b.f21355a), "body_header_tag"));
        View viewD2 = d(context, b93.c(aVar.c()), "body_tag");
        nativeAdView.setBodyView(viewD2);
        linearLayout.addView(viewD2);
        linearLayout.addView(c(context, resourcesD == null ? "Media View" : resourcesD.getString(e2.b.f21357c), "media_view_header_tag"));
        MediaView mediaView = new MediaView(context);
        mediaView.setTag("media_view_tag");
        nativeAdView.setMediaView(mediaView);
        linearLayout.addView(mediaView);
        nativeAdView.setNativeAd(aVar);
    }

    private static TextView c(Context context, String str, String str2) {
        return e(context, str, R.style.TextAppearance.Small, -9210245, 0.0f, str2);
    }

    private static TextView d(Context context, String str, String str2) {
        return e(context, str, R.style.TextAppearance.Medium, -16777216, 12.0f, str2);
    }

    private static TextView e(Context context, String str, int i8, int i9, float f8, String str2) {
        TextView textView = new TextView(context);
        textView.setTag(str2);
        f(textView, -2, -2);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, f8, textView.getResources().getDisplayMetrics());
        textView.setLayoutParams(marginLayoutParams);
        textView.setTextAppearance(context, i8);
        textView.setTextColor(i9);
        textView.setText(str);
        return textView;
    }

    private static void f(View view, int i8, int i9) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
        layoutParams2.height = i8;
        layoutParams2.width = i9;
        view.setLayoutParams(layoutParams2);
    }
}
