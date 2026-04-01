package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class bg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f5776a = BigInteger.ONE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f5777b = "0";

    public final synchronized String a() {
        String string;
        string = this.f5776a.toString();
        this.f5776a = this.f5776a.add(BigInteger.ONE);
        this.f5777b = string;
        return string;
    }

    public final synchronized String b() {
        return this.f5777b;
    }
}
