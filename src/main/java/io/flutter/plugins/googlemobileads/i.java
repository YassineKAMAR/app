package io.flutter.plugins.googlemobileads;

import a2.a;
import io.flutter.plugins.googlemobileads.l;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class i extends l {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map<String, String> f23196j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map<String, List<String>> f23197k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f23198l;

    static class b extends l.a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Map<String, String> f23199j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Map<String, List<String>> f23200k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f23201l;

        b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // io.flutter.plugins.googlemobileads.l.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public i a() {
            return new i(e(), c(), this.f23199j, this.f23200k, i(), h(), d(), this.f23201l, f(), g(), b(), j());
        }

        public b u(Map<String, String> map) {
            this.f23199j = map;
            return this;
        }

        public b v(Map<String, List<String>> map) {
            this.f23200k = map;
            return this;
        }

        public b w(String str) {
            this.f23201l = str;
            return this;
        }
    }

    private i(List<String> list, String str, Map<String, String> map, Map<String, List<String>> map2, Boolean bool, List<String> list2, Integer num, String str2, String str3, j0 j0Var, Map<String, String> map3, String str4) {
        super(list, str, bool, list2, num, str3, j0Var, map3, str4);
        this.f23196j = map;
        this.f23197k = map2;
        this.f23198l = str2;
    }

    @Override // io.flutter.plugins.googlemobileads.l
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return super.equals(obj) && Objects.equals(this.f23196j, iVar.f23196j) && Objects.equals(this.f23197k, iVar.f23197k);
    }

    @Override // io.flutter.plugins.googlemobileads.l
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f23196j, this.f23197k);
    }

    a2.a k(String str) {
        a.C0000a c0000a = new a.C0000a();
        j(c0000a, str);
        Map<String, String> map = this.f23196j;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                c0000a.m(entry.getKey(), entry.getValue());
            }
        }
        Map<String, List<String>> map2 = this.f23197k;
        if (map2 != null) {
            for (Map.Entry<String, List<String>> entry2 : map2.entrySet()) {
                c0000a.n(entry2.getKey(), entry2.getValue());
            }
        }
        String str2 = this.f23198l;
        if (str2 != null) {
            c0000a.p(str2);
        }
        return c0000a.c();
    }

    protected Map<String, String> l() {
        return this.f23196j;
    }

    protected Map<String, List<String>> m() {
        return this.f23197k;
    }

    protected String n() {
        return this.f23198l;
    }
}
