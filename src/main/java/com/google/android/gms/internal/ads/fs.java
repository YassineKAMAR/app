package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class fs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f8010c;

    /* synthetic */ fs(int i8, String str, Object obj, ds dsVar) {
        this.f8008a = i8;
        this.f8009b = str;
        this.f8010c = obj;
        h2.y.a().d(this);
    }

    public static fs f(int i8, String str, float f8) {
        return new bs(1, str, Float.valueOf(f8));
    }

    public static fs g(int i8, String str, int i9) {
        return new zr(1, str, Integer.valueOf(i9));
    }

    public static fs h(int i8, String str, long j8) {
        return new as(1, str, Long.valueOf(j8));
    }

    public static fs i(int i8, String str, Boolean bool) {
        return new yr(i8, str, bool);
    }

    public static fs j(int i8, String str, String str2) {
        return new cs(1, str, str2);
    }

    public static fs k(int i8, String str) {
        fs fsVarJ = j(1, "gads:sdk_core_constants:experiment_id", null);
        h2.y.a().c(fsVarJ);
        return fsVarJ;
    }

    protected abstract Object a(JSONObject jSONObject);

    public abstract Object b(Bundle bundle);

    protected abstract Object c(SharedPreferences sharedPreferences);

    public abstract void d(SharedPreferences.Editor editor, Object obj);

    public final int e() {
        return this.f8008a;
    }

    public final Object l() {
        return h2.y.c().b(this);
    }

    public final Object m() {
        return this.f8010c;
    }

    public final String n() {
        return this.f8009b;
    }
}
