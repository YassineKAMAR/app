package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class p30 implements f20, o30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o30 f12725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet f12726b = new HashSet();

    public p30(o30 o30Var) {
        this.f12725a = o30Var;
    }

    @Override // com.google.android.gms.internal.ads.o30
    public final void D(String str, qz qzVar) {
        this.f12725a.D(str, qzVar);
        this.f12726b.add(new AbstractMap.SimpleEntry(str, qzVar));
    }

    @Override // com.google.android.gms.internal.ads.d20
    public final /* synthetic */ void U(String str, Map map) {
        e20.a(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.f20, com.google.android.gms.internal.ads.q20
    public final void a(String str) {
        this.f12725a.a(str);
    }

    @Override // com.google.android.gms.internal.ads.f20, com.google.android.gms.internal.ads.q20
    public final /* synthetic */ void b(String str, String str2) {
        e20.c(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.f20, com.google.android.gms.internal.ads.d20
    public final /* synthetic */ void e(String str, JSONObject jSONObject) {
        e20.b(this, str, jSONObject);
    }

    public final void l() {
        for (AbstractMap.SimpleEntry simpleEntry : this.f12726b) {
            j2.v1.k("Unregistering eventhandler: ".concat(String.valueOf(((qz) simpleEntry.getValue()).toString())));
            this.f12725a.m((String) simpleEntry.getKey(), (qz) simpleEntry.getValue());
        }
        this.f12726b.clear();
    }

    @Override // com.google.android.gms.internal.ads.o30
    public final void m(String str, qz qzVar) {
        this.f12725a.m(str, qzVar);
        this.f12726b.remove(new AbstractMap.SimpleEntry(str, qzVar));
    }

    @Override // com.google.android.gms.internal.ads.q20
    public final /* synthetic */ void x0(String str, JSONObject jSONObject) {
        e20.d(this, str, jSONObject);
    }
}
