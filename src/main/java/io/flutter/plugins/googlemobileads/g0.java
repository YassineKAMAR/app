package io.flutter.plugins.googlemobileads;

import z1.z;

/* JADX INFO: loaded from: classes.dex */
class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Boolean f23180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Boolean f23181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Boolean f23182c;

    g0(Boolean bool, Boolean bool2, Boolean bool3) {
        this.f23180a = bool;
        this.f23181b = bool2;
        this.f23182c = bool3;
    }

    z1.z a() {
        z.a aVar = new z.a();
        Boolean bool = this.f23180a;
        if (bool != null) {
            aVar.b(bool.booleanValue());
        }
        Boolean bool2 = this.f23181b;
        if (bool2 != null) {
            aVar.c(bool2.booleanValue());
        }
        Boolean bool3 = this.f23182c;
        if (bool3 != null) {
            aVar.d(bool3.booleanValue());
        }
        return aVar.a();
    }
}
