package d5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import s5.k;

/* JADX INFO: loaded from: classes.dex */
public class c extends d5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map<String, Object> f20994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final a f20995b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f20996c;

    public class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f20997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f20998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f20999c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f21000d;

        public a() {
        }

        @Override // d5.f
        public void a(Object obj) {
            this.f20997a = obj;
        }

        @Override // d5.f
        public void b(String str, String str2, Object obj) {
            this.f20998b = str;
            this.f20999c = str2;
            this.f21000d = obj;
        }
    }

    public c(Map<String, Object> map, boolean z7) {
        this.f20994a = map;
        this.f20996c = z7;
    }

    @Override // d5.e
    public <T> T c(String str) {
        return (T) this.f20994a.get(str);
    }

    @Override // d5.b, d5.e
    public boolean e() {
        return this.f20996c;
    }

    @Override // d5.e
    public String getMethod() {
        return (String) this.f20994a.get("method");
    }

    @Override // d5.e
    public boolean h(String str) {
        return this.f20994a.containsKey(str);
    }

    @Override // d5.a
    public f n() {
        return this.f20995b;
    }

    public Map<String, Object> o() {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("code", this.f20995b.f20998b);
        map2.put("message", this.f20995b.f20999c);
        map2.put("data", this.f20995b.f21000d);
        map.put("error", map2);
        return map;
    }

    public Map<String, Object> p() {
        HashMap map = new HashMap();
        map.put("result", this.f20995b.f20997a);
        return map;
    }

    public void q(k.d dVar) {
        a aVar = this.f20995b;
        dVar.b(aVar.f20998b, aVar.f20999c, aVar.f21000d);
    }

    public void r(List<Map<String, Object>> list) {
        if (e()) {
            return;
        }
        list.add(o());
    }

    public void s(List<Map<String, Object>> list) {
        if (e()) {
            return;
        }
        list.add(p());
    }
}
