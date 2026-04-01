package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class bs extends fs {
    bs(int i8, String str, Float f8) {
        super(1, str, f8, null);
    }

    @Override // com.google.android.gms.internal.ads.fs
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(n(), ((Float) m()).floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.fs
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(n())) ? Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(n()))) : (Float) m();
    }

    @Override // com.google.android.gms.internal.ads.fs
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(n(), ((Float) m()).floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.fs
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(n(), ((Float) obj).floatValue());
    }
}
