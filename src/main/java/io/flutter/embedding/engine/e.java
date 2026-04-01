package io.flutter.embedding.engine;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile e f22787b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, d> f22788a = new HashMap();

    e() {
    }

    public static e b() {
        if (f22787b == null) {
            synchronized (e.class) {
                if (f22787b == null) {
                    f22787b = new e();
                }
            }
        }
        return f22787b;
    }

    public d a(String str) {
        return this.f22788a.get(str);
    }
}
