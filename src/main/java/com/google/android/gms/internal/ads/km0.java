package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class km0 implements vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f10161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f10162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Uri f10163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ mm0 f10164d;

    km0(mm0 mm0Var, List list, String str, Uri uri) {
        this.f10164d = mm0Var;
        this.f10161a = list;
        this.f10162b = str;
        this.f10163c = uri;
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void a(Throwable th) {
        qg0.g("Failed to parse gmsg params for: ".concat(String.valueOf(this.f10163c)));
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        List list = this.f10161a;
        String str = this.f10162b;
        this.f10164d.m((Map) obj, list, str);
    }
}
