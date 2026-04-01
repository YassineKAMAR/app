package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class zr extends fs {
    zr(int i8, String str, Integer num) {
        super(1, str, num, null);
    }

    @Override // com.google.android.gms.internal.ads.fs
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(n(), ((Integer) m()).intValue()));
    }

    @Override // com.google.android.gms.internal.ads.fs
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(n())) ? Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(n()))) : (Integer) m();
    }

    @Override // com.google.android.gms.internal.ads.fs
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(n(), ((Integer) m()).intValue()));
    }

    @Override // com.google.android.gms.internal.ads.fs
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Object obj) {
        editor.putInt(n(), ((Integer) obj).intValue());
    }
}
