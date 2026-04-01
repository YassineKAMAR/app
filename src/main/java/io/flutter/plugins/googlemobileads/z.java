package io.flutter.plugins.googlemobileads;

import o2.b;

/* JADX INFO: loaded from: classes.dex */
class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Integer f23364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Integer f23365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final g0 f23366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Boolean f23367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Boolean f23368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Boolean f23369f;

    z(Integer num, Integer num2, g0 g0Var, Boolean bool, Boolean bool2, Boolean bool3) {
        this.f23364a = num;
        this.f23365b = num2;
        this.f23366c = g0Var;
        this.f23367d = bool;
        this.f23368e = bool2;
        this.f23369f = bool3;
    }

    o2.b a() {
        b.a aVar = new b.a();
        Integer num = this.f23364a;
        if (num != null) {
            aVar.c(num.intValue());
        }
        Integer num2 = this.f23365b;
        if (num2 != null) {
            aVar.d(num2.intValue());
        }
        g0 g0Var = this.f23366c;
        if (g0Var != null) {
            aVar.h(g0Var.a());
        }
        Boolean bool = this.f23367d;
        if (bool != null) {
            aVar.e(bool.booleanValue());
        }
        Boolean bool2 = this.f23368e;
        if (bool2 != null) {
            aVar.f(bool2.booleanValue());
        }
        Boolean bool3 = this.f23369f;
        if (bool3 != null) {
            aVar.g(bool3.booleanValue());
        }
        return aVar.a();
    }
}
