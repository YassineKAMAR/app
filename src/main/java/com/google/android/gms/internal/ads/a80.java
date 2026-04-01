package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fm0 f5073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5074b;

    public a80(fm0 fm0Var, String str) {
        this.f5073a = fm0Var;
        this.f5074b = str;
    }

    public final void b(int i8, int i9, int i10, int i11) {
        try {
            this.f5073a.e("onDefaultPositionReceived", new JSONObject().put("x", i8).put("y", i9).put("width", i10).put("height", i11));
        } catch (JSONException e8) {
            qg0.e("Error occurred while dispatching default position.", e8);
        }
    }

    public final void c(String str) {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("message", str).put("action", this.f5074b);
            fm0 fm0Var = this.f5073a;
            if (fm0Var != null) {
                fm0Var.e("onError", jSONObjectPut);
            }
        } catch (JSONException e8) {
            qg0.e("Error occurred while dispatching error event.", e8);
        }
    }

    public final void d(String str) {
        try {
            this.f5073a.e("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e8) {
            qg0.e("Error occurred while dispatching ready Event.", e8);
        }
    }

    public final void e(int i8, int i9, int i10, int i11, float f8, int i12) {
        try {
            this.f5073a.e("onScreenInfoChanged", new JSONObject().put("width", i8).put("height", i9).put("maxSizeWidth", i10).put("maxSizeHeight", i11).put("density", f8).put("rotation", i12));
        } catch (JSONException e8) {
            qg0.e("Error occurred while obtaining screen information.", e8);
        }
    }

    public final void f(int i8, int i9, int i10, int i11) {
        try {
            this.f5073a.e("onSizeChanged", new JSONObject().put("x", i8).put("y", i9).put("width", i10).put("height", i11));
        } catch (JSONException e8) {
            qg0.e("Error occurred while dispatching size change.", e8);
        }
    }

    public final void g(String str) {
        try {
            this.f5073a.e("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e8) {
            qg0.e("Error occurred while dispatching state change.", e8);
        }
    }
}
