package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class ye0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f17742a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f17743b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f17744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ud0 f17745d;

    ye0(Context context, ud0 ud0Var) {
        this.f17744c = context;
        this.f17745d = ud0Var;
    }

    final /* synthetic */ void b(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.f17745d.e();
        }
    }

    final synchronized void c(String str) {
        if (this.f17742a.containsKey(str)) {
            return;
        }
        SharedPreferences defaultSharedPreferences = (str == "__default__" || (str != null && str.equals("__default__"))) ? PreferenceManager.getDefaultSharedPreferences(this.f17744c) : this.f17744c.getSharedPreferences(str, 0);
        xe0 xe0Var = new xe0(this, str);
        this.f17742a.put(str, xe0Var);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(xe0Var);
    }

    final synchronized void d(we0 we0Var) {
        this.f17743b.add(we0Var);
    }
}
