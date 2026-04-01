package io.flutter.plugin.platform;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, l> f22961a = new HashMap();

    n() {
    }

    @Override // io.flutter.plugin.platform.m
    public boolean a(String str, l lVar) {
        if (this.f22961a.containsKey(str)) {
            return false;
        }
        this.f22961a.put(str, lVar);
        return true;
    }

    l b(String str) {
        return this.f22961a.get(str);
    }
}
