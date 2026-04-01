package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class os1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f12629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ApplicationInfo f12630b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f12633e = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12631c = ((Integer) h2.y.c().b(ns.S8)).intValue();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f12632d = ((Integer) h2.y.c().b(ns.T8)).intValue();

    public os1(Context context) {
        this.f12629a = context;
        this.f12630b = context.getApplicationInfo();
    }

    public final JSONObject a() throws JSONException {
        Drawable drawable;
        String strEncodeToString;
        JSONObject jSONObject = new JSONObject();
        try {
            Context context = this.f12629a;
            String str = this.f12630b.packageName;
            e53 e53Var = j2.k2.f23991k;
            jSONObject.put("name", f3.e.a(context).d(str));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.f12630b.packageName);
        g2.t.r();
        jSONObject.put("adMobAppId", j2.k2.Q(this.f12629a));
        if (this.f12633e.isEmpty()) {
            try {
                drawable = f3.e.a(this.f12629a).e(this.f12630b.packageName).f2133b;
            } catch (PackageManager.NameNotFoundException unused2) {
                drawable = null;
            }
            if (drawable == null) {
                strEncodeToString = "";
            } else {
                drawable.setBounds(0, 0, this.f12631c, this.f12632d);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f12631c, this.f12632d, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(bitmapCreateBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f12633e = strEncodeToString;
        }
        if (!this.f12633e.isEmpty()) {
            jSONObject.put("icon", this.f12633e);
            jSONObject.put("iconWidthPx", this.f12631c);
            jSONObject.put("iconHeightPx", this.f12632d);
        }
        return jSONObject;
    }
}
