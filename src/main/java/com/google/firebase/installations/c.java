package com.google.firebase.installations;

import c4.k;

/* JADX INFO: loaded from: classes.dex */
public class c extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f20853a;

    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public c(a aVar) {
        this.f20853a = aVar;
    }

    public c(String str, a aVar) {
        super(str);
        this.f20853a = aVar;
    }
}
