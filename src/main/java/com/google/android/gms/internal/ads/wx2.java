package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class wx2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16976a = (String) cu.f6482b.e();

    public final String a(Map map) {
        Uri.Builder builderBuildUpon = Uri.parse(this.f16976a).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }
}
