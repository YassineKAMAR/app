package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class rz2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zz2 f14389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zz2 f14390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vz2 f14391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final yz2 f14392d;

    private rz2(vz2 vz2Var, yz2 yz2Var, zz2 zz2Var, zz2 zz2Var2, boolean z7) {
        this.f14391c = vz2Var;
        this.f14392d = yz2Var;
        this.f14389a = zz2Var;
        if (zz2Var2 == null) {
            this.f14390b = zz2.NONE;
        } else {
            this.f14390b = zz2Var2;
        }
    }

    public static rz2 a(vz2 vz2Var, yz2 yz2Var, zz2 zz2Var, zz2 zz2Var2, boolean z7) {
        h13.b(yz2Var, "ImpressionType is null");
        h13.b(zz2Var, "Impression owner is null");
        if (zz2Var == zz2.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (vz2Var == vz2.DEFINED_BY_JAVASCRIPT && zz2Var == zz2.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (yz2Var == yz2.DEFINED_BY_JAVASCRIPT && zz2Var == zz2.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new rz2(vz2Var, yz2Var, zz2Var, zz2Var2, true);
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        c13.e(jSONObject, "impressionOwner", this.f14389a);
        c13.e(jSONObject, "mediaEventsOwner", this.f14390b);
        c13.e(jSONObject, "creativeType", this.f14391c);
        c13.e(jSONObject, "impressionType", this.f14392d);
        c13.e(jSONObject, "isolateVerificationScripts", Boolean.TRUE);
        return jSONObject;
    }
}
