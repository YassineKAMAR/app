package io.flutter.plugins.googlemobileads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import z1.g;

/* JADX INFO: loaded from: classes.dex */
class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f23226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f23227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Boolean f23228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<String> f23229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f23230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f23231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j0 f23232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<String, String> f23233h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f23234i;

    protected static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<String> f23235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f23236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Boolean f23237c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<String> f23238d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f23239e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f23240f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private j0 f23241g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Map<String, String> f23242h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f23243i;

        protected a() {
        }

        l a() {
            return new l(this.f23235a, this.f23236b, this.f23237c, this.f23238d, this.f23239e, this.f23240f, this.f23241g, this.f23242h, this.f23243i);
        }

        protected Map<String, String> b() {
            return this.f23242h;
        }

        protected String c() {
            return this.f23236b;
        }

        protected Integer d() {
            return this.f23239e;
        }

        protected List<String> e() {
            return this.f23235a;
        }

        protected String f() {
            return this.f23240f;
        }

        protected j0 g() {
            return this.f23241g;
        }

        protected List<String> h() {
            return this.f23238d;
        }

        protected Boolean i() {
            return this.f23237c;
        }

        protected String j() {
            return this.f23243i;
        }

        a k(Map<String, String> map) {
            this.f23242h = map;
            return this;
        }

        a l(String str) {
            this.f23236b = str;
            return this;
        }

        a m(Integer num) {
            this.f23239e = num;
            return this;
        }

        a n(List<String> list) {
            this.f23235a = list;
            return this;
        }

        a o(String str) {
            this.f23240f = str;
            return this;
        }

        a p(j0 j0Var) {
            this.f23241g = j0Var;
            return this;
        }

        a q(List<String> list) {
            this.f23238d = list;
            return this;
        }

        a r(Boolean bool) {
            this.f23237c = bool;
            return this;
        }

        a s(String str) {
            this.f23243i = str;
            return this;
        }
    }

    protected l(List<String> list, String str, Boolean bool, List<String> list2, Integer num, String str2, j0 j0Var, Map<String, String> map, String str3) {
        this.f23226a = list;
        this.f23227b = str;
        this.f23228c = bool;
        this.f23229d = list2;
        this.f23230e = num;
        this.f23231f = str2;
        this.f23232g = j0Var;
        this.f23233h = map;
        this.f23234i = str3;
    }

    private void a(g.a aVar, String str) {
        HashMap map = new HashMap();
        j0 j0Var = this.f23232g;
        if (j0Var != null) {
            map.putAll(j0Var.a(str, this.f23231f));
        }
        Map<String, String> map2 = this.f23233h;
        if (map2 != null && !map2.isEmpty()) {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : this.f23233h.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            map.put(AdMobAdapter.class, bundle);
        }
        Boolean bool = this.f23228c;
        if (bool != null && bool.booleanValue()) {
            Bundle bundle2 = (Bundle) map.get(AdMobAdapter.class);
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putString("npa", "1");
            map.put(AdMobAdapter.class, bundle2);
        }
        for (Map.Entry entry2 : map.entrySet()) {
            aVar.b((Class) entry2.getKey(), (Bundle) entry2.getValue());
        }
    }

    z1.g b(String str) {
        return j(new g.a(), str).c();
    }

    protected Map<String, String> c() {
        return this.f23233h;
    }

    protected String d() {
        return this.f23227b;
    }

    protected Integer e() {
        return this.f23230e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Objects.equals(this.f23226a, lVar.f23226a) && Objects.equals(this.f23227b, lVar.f23227b) && Objects.equals(this.f23228c, lVar.f23228c) && Objects.equals(this.f23229d, lVar.f23229d) && Objects.equals(this.f23230e, lVar.f23230e) && Objects.equals(this.f23231f, lVar.f23231f) && Objects.equals(this.f23232g, lVar.f23232g) && Objects.equals(this.f23233h, lVar.f23233h);
    }

    protected List<String> f() {
        return this.f23226a;
    }

    protected String g() {
        return this.f23231f;
    }

    protected List<String> h() {
        return this.f23229d;
    }

    public int hashCode() {
        return Objects.hash(this.f23226a, this.f23227b, this.f23228c, this.f23229d, this.f23230e, this.f23231f, this.f23232g);
    }

    protected Boolean i() {
        return this.f23228c;
    }

    protected g.a j(g.a aVar, String str) {
        List<String> list = this.f23226a;
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                aVar.a(it.next());
            }
        }
        String str2 = this.f23227b;
        if (str2 != null) {
            aVar.d(str2);
        }
        a(aVar, str);
        List<String> list2 = this.f23229d;
        if (list2 != null) {
            aVar.f(list2);
        }
        Integer num = this.f23230e;
        if (num != null) {
            aVar.e(num.intValue());
        }
        aVar.g(this.f23234i);
        return aVar;
    }
}
