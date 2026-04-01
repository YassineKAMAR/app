package io.flutter.plugins.googlemobileads;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map<String, o> f23333a;

    t(f2.b bVar) {
        HashMap map = new HashMap();
        for (Map.Entry<String, f2.a> entry : bVar.a().entrySet()) {
            map.put(entry.getKey(), new o(entry.getValue()));
        }
        this.f23333a = map;
    }

    t(Map<String, o> map) {
        this.f23333a = map;
    }
}
