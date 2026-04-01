package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class t13 extends u13 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet f14916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f14917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f14918e;

    public t13(l13 l13Var, HashSet hashSet, JSONObject jSONObject, long j8) {
        super(l13Var);
        this.f14916c = new HashSet(hashSet);
        this.f14917d = jSONObject;
        this.f14918e = j8;
    }
}
