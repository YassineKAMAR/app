package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class z31 extends h2.l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f17979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f17980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f17981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f17982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f17983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f17984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f17985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c32 f17986h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Bundle f17987i;

    public z31(wr2 wr2Var, String str, c32 c32Var, as2 as2Var, String str2) {
        String string = null;
        this.f17980b = wr2Var == null ? null : wr2Var.f16872d0;
        this.f17981c = str2;
        this.f17982d = as2Var == null ? null : as2Var.f5462b;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                string = wr2Var.f16909x.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.f17979a = string != null ? string : str;
        this.f17983e = c32Var.c();
        this.f17986h = c32Var;
        this.f17984f = g2.t.b().a() / 1000;
        this.f17987i = (!((Boolean) h2.y.c().b(ns.M6)).booleanValue() || as2Var == null) ? new Bundle() : as2Var.f5470j;
        this.f17985g = (!((Boolean) h2.y.c().b(ns.W8)).booleanValue() || as2Var == null || TextUtils.isEmpty(as2Var.f5468h)) ? "" : as2Var.f5468h;
    }

    public final long l() {
        return this.f17984f;
    }

    @Override // h2.m2
    public final Bundle m() {
        return this.f17987i;
    }

    @Override // h2.m2
    public final h2.a5 n() {
        c32 c32Var = this.f17986h;
        if (c32Var != null) {
            return c32Var.a();
        }
        return null;
    }

    @Override // h2.m2
    public final String o() {
        return this.f17981c;
    }

    public final String p() {
        return this.f17985g;
    }

    @Override // h2.m2
    public final String q() {
        return this.f17979a;
    }

    @Override // h2.m2
    public final String r() {
        return this.f17980b;
    }

    public final String s() {
        return this.f17982d;
    }

    @Override // h2.m2
    public final List t() {
        return this.f17983e;
    }
}
