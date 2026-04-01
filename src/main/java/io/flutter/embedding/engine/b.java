package io.flutter.embedding.engine;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static b f22753b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, a> f22754a = new HashMap();

    b() {
    }

    public static b b() {
        if (f22753b == null) {
            f22753b = new b();
        }
        return f22753b;
    }

    public a a(String str) {
        return this.f22754a.get(str);
    }

    public void c(String str, a aVar) {
        if (aVar != null) {
            this.f22754a.put(str, aVar);
        } else {
            this.f22754a.remove(str);
        }
    }

    public void d(String str) {
        c(str, null);
    }
}
