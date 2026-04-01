package com.android.billingclient.api;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    h0(JSONObject jSONObject) throws JSONException {
        jSONObject.getLong("preorderReleaseTimeMillis");
        jSONObject.getLong("preorderPresaleEndTimeMillis");
    }
}
