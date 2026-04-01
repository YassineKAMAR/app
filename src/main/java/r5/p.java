package r5;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5.a<Object> f26070a;

    public p(h5.a aVar) {
        this.f26070a = new s5.a<>(aVar, "flutter/system", s5.f.f26250a);
    }

    public void a() {
        g5.b.f("SystemChannel", "Sending memory pressure warning to Flutter.");
        HashMap map = new HashMap(1);
        map.put("type", "memoryPressure");
        this.f26070a.c(map);
    }
}
