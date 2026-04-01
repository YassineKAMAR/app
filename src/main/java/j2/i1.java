package j2;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.ns;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f23978a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f23979b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f23980c;

    i1(Context context) {
        this.f23980c = context;
    }

    final synchronized void b(String str) {
        if (this.f23978a.containsKey(str)) {
            return;
        }
        SharedPreferences defaultSharedPreferences = (str == "__default__" || (str != null && str.equals("__default__"))) ? PreferenceManager.getDefaultSharedPreferences(this.f23980c) : this.f23980c.getSharedPreferences(str, 0);
        h1 h1Var = new h1(this, str);
        this.f23978a.put(str, h1Var);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(h1Var);
    }

    public final void c() {
        if (((Boolean) h2.y.c().b(ns.C9)).booleanValue()) {
            g2.t.r();
            Map mapV = k2.V((String) h2.y.c().b(ns.G9));
            Iterator it = mapV.keySet().iterator();
            while (it.hasNext()) {
                b((String) it.next());
            }
            d(new g1(mapV));
        }
    }

    final synchronized void d(g1 g1Var) {
        this.f23979b.add(g1Var);
    }
}
