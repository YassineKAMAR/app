package p2;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.eh0;
import com.google.android.gms.internal.ads.jq1;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.zp1;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final jq1 f25596h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map f25597i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque f25594f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque f25595g = new ArrayDeque();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f25589a = ((Integer) h2.y.c().b(ns.U6)).intValue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f25590b = ((Long) h2.y.c().b(ns.V6)).longValue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f25591c = ((Boolean) h2.y.c().b(ns.f12029a7)).booleanValue();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f25592d = ((Boolean) h2.y.c().b(ns.Y6)).booleanValue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f25593e = Collections.synchronizedMap(new u(this));

    public v(jq1 jq1Var) {
        this.f25596h = jq1Var;
    }

    private final synchronized void g(final zp1 zp1Var) {
        if (this.f25591c) {
            ArrayDeque arrayDeque = this.f25595g;
            final ArrayDeque arrayDequeClone = arrayDeque.clone();
            arrayDeque.clear();
            ArrayDeque arrayDeque2 = this.f25594f;
            final ArrayDeque arrayDequeClone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            eh0.f7322a.execute(new Runnable() { // from class: p2.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25483a.e(zp1Var, arrayDequeClone, arrayDequeClone2);
                }
            });
        }
    }

    private final void h(zp1 zp1Var, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zp1Var.a());
            this.f25597i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.f25597i.put("e_r", str);
            this.f25597i.put("e_id", (String) pair2.first);
            if (this.f25592d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(y.a(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                j(this.f25597i, "e_type", (String) pair.first);
                j(this.f25597i, "e_agent", (String) pair.second);
            }
            this.f25596h.f(this.f25597i);
        }
    }

    private final synchronized void i() {
        long jA = g2.t.b().a();
        try {
            Iterator it = this.f25593e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (jA - ((Long) ((Pair) entry.getValue()).first).longValue() <= this.f25590b) {
                    break;
                }
                this.f25595g.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                it.remove();
            }
        } catch (ConcurrentModificationException e8) {
            g2.t.q().u(e8, "QueryJsonMap.removeExpiredEntries");
        }
    }

    private static final void j(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    public final synchronized String b(String str, zp1 zp1Var) {
        Pair pair = (Pair) this.f25593e.get(str);
        zp1Var.a().put("rid", str);
        if (pair == null) {
            zp1Var.a().put("mhit", com.amazon.a.a.o.b.ad);
            return null;
        }
        String str2 = (String) pair.second;
        this.f25593e.remove(str);
        zp1Var.a().put("mhit", com.amazon.a.a.o.b.ac);
        return str2;
    }

    public final synchronized void d(String str, String str2, zp1 zp1Var) {
        this.f25593e.put(str, new Pair(Long.valueOf(g2.t.b().a()), str2));
        i();
        g(zp1Var);
    }

    final /* synthetic */ void e(zp1 zp1Var, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        h(zp1Var, arrayDeque, "to");
        h(zp1Var, arrayDeque2, "of");
    }

    public final synchronized void f(String str) {
        this.f25593e.remove(str);
    }
}
