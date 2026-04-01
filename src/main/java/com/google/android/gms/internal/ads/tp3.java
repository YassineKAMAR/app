package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class tp3 implements yp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wy3 f15214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rz3 f15215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final uv3 f15216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dx3 f15217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Integer f15218f;

    private tp3(String str, rz3 rz3Var, uv3 uv3Var, dx3 dx3Var, Integer num) {
        this.f15213a = str;
        this.f15214b = iq3.a(str);
        this.f15215c = rz3Var;
        this.f15216d = uv3Var;
        this.f15217e = dx3Var;
        this.f15218f = num;
    }

    public static tp3 a(String str, rz3 rz3Var, uv3 uv3Var, dx3 dx3Var, Integer num) throws GeneralSecurityException {
        if (dx3Var == dx3.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new tp3(str, rz3Var, uv3Var, dx3Var, num);
    }

    public final uv3 b() {
        return this.f15216d;
    }

    public final dx3 c() {
        return this.f15217e;
    }

    public final rz3 d() {
        return this.f15215c;
    }

    public final Integer e() {
        return this.f15218f;
    }

    public final String f() {
        return this.f15213a;
    }

    @Override // com.google.android.gms.internal.ads.yp3
    public final wy3 p() {
        return this.f15214b;
    }
}
