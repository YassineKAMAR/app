package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class aw0 implements u30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pk f5512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PowerManager f5513c;

    public aw0(Context context, pk pkVar) {
        this.f5511a = context;
        this.f5512b = pkVar;
        this.f5513c = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.u30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(dw0 dw0Var) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        sk skVar = dw0Var.f7032f;
        if (skVar == null) {
            jSONObject = new JSONObject();
        } else {
            if (this.f5512b.d() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z7 = skVar.f14720a;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("afmaVersion", this.f5512b.b()).put("activeViewJSON", this.f5512b.d()).put(DiagnosticsEntry.Event.TIMESTAMP_KEY, dw0Var.f7030d).put("adFormat", this.f5512b.a()).put("hashCode", this.f5512b.c()).put("isMraid", false).put("isStopped", false).put("isPaused", dw0Var.f7028b).put("isNative", this.f5512b.e()).put("isScreenOn", this.f5513c.isInteractive()).put("appMuted", g2.t.t().e()).put("appVolume", g2.t.t().a()).put("deviceVolume", j2.d.b(this.f5511a.getApplicationContext()));
            if (((Boolean) h2.y.c().b(ns.E5)).booleanValue()) {
                AudioManager audioManager = (AudioManager) this.f5511a.getApplicationContext().getSystemService("audio");
                Integer numValueOf = audioManager == null ? null : Integer.valueOf(audioManager.getMode());
                if (numValueOf != null) {
                    jSONObject3.put("audioMode", numValueOf);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.f5511a.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", skVar.f14721b).put("isAttachedToWindow", z7).put("viewBox", new JSONObject().put("top", skVar.f14722c.top).put("bottom", skVar.f14722c.bottom).put("left", skVar.f14722c.left).put("right", skVar.f14722c.right)).put("adBox", new JSONObject().put("top", skVar.f14723d.top).put("bottom", skVar.f14723d.bottom).put("left", skVar.f14723d.left).put("right", skVar.f14723d.right)).put("globalVisibleBox", new JSONObject().put("top", skVar.f14724e.top).put("bottom", skVar.f14724e.bottom).put("left", skVar.f14724e.left).put("right", skVar.f14724e.right)).put("globalVisibleBoxVisible", skVar.f14725f).put("localVisibleBox", new JSONObject().put("top", skVar.f14726g.top).put("bottom", skVar.f14726g.bottom).put("left", skVar.f14726g.left).put("right", skVar.f14726g.right)).put("localVisibleBoxVisible", skVar.f14727h).put("hitBox", new JSONObject().put("top", skVar.f14728i.top).put("bottom", skVar.f14728i.bottom).put("left", skVar.f14728i.left).put("right", skVar.f14728i.right)).put("screenDensity", this.f5511a.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", dw0Var.f7027a);
            if (((Boolean) h2.y.c().b(ns.f12140n1)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = skVar.f14730k;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(dw0Var.f7031e)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
