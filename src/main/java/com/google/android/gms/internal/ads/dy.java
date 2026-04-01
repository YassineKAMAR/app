package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class dy implements qz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ey f7059a;

    public dy(ey eyVar) {
        this.f7059a = eyVar;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void a(Object obj, Map map) {
        if (this.f7059a == null) {
            return;
        }
        String str = (String) map.get("name");
        if (str == null) {
            qg0.f("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundleA = null;
        if (map.containsKey("info")) {
            try {
                bundleA = j2.y0.a(new JSONObject((String) map.get("info")));
            } catch (JSONException e8) {
                qg0.e("Failed to convert ad metadata to JSON.", e8);
            }
        }
        if (bundleA == null) {
            qg0.d("Failed to convert ad metadata to Bundle.");
        } else {
            this.f7059a.G(str, bundleA);
        }
    }
}
