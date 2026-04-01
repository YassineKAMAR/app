package com.amazon.device.iap.internal.b;

import com.amazon.a.a.o.f;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e f4290b = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<String> f4291a = new ConcurrentSkipListSet();

    public static e a() {
        return f4290b;
    }

    public boolean a(String str) {
        if (f.a(str)) {
            return false;
        }
        return this.f4291a.remove(str);
    }

    public void b(String str) {
        if (f.a(str)) {
            return;
        }
        this.f4291a.add(str);
    }
}
