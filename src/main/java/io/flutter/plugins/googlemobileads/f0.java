package io.flutter.plugins.googlemobileads;

import java.util.Objects;
import r2.e;

/* JADX INFO: loaded from: classes.dex */
class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f23179b;

    public f0(String str, String str2) {
        this.f23178a = str;
        this.f23179b = str2;
    }

    public r2.e a() {
        e.a aVar = new e.a();
        String str = this.f23178a;
        if (str != null) {
            aVar.c(str);
        }
        String str2 = this.f23179b;
        if (str2 != null) {
            aVar.b(str2);
        }
        return aVar.a();
    }

    public String b() {
        return this.f23179b;
    }

    public String c() {
        return this.f23178a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Objects.equals(f0Var.f23178a, this.f23178a) && Objects.equals(f0Var.f23179b, this.f23179b);
    }

    public int hashCode() {
        return Objects.hash(this.f23178a, this.f23179b);
    }
}
