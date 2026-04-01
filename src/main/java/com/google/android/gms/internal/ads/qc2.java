package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class qc2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h2.w4 f13393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f13397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f13399g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f13400h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f13401i;

    public qc2(h2.w4 w4Var, String str, boolean z7, String str2, float f8, int i8, int i9, String str3, boolean z8) {
        a3.o.k(w4Var, "the adSize must not be null");
        this.f13393a = w4Var;
        this.f13394b = str;
        this.f13395c = z7;
        this.f13396d = str2;
        this.f13397e = f8;
        this.f13398f = i8;
        this.f13399g = i9;
        this.f13400h = str3;
        this.f13401i = z8;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        ft2.f(bundle, "smart_w", "full", this.f13393a.f22355e == -1);
        ft2.f(bundle, "smart_h", "auto", this.f13393a.f22352b == -2);
        ft2.g(bundle, "ene", true, this.f13393a.f22360j);
        ft2.f(bundle, "rafmt", "102", this.f13393a.f22363m);
        ft2.f(bundle, "rafmt", "103", this.f13393a.f22364n);
        ft2.f(bundle, "rafmt", "105", this.f13393a.f22365o);
        ft2.g(bundle, "inline_adaptive_slot", true, this.f13401i);
        ft2.g(bundle, "interscroller_slot", true, this.f13393a.f22365o);
        ft2.c(bundle, "format", this.f13394b);
        ft2.f(bundle, "fluid", "height", this.f13395c);
        ft2.f(bundle, "sz", this.f13396d, !TextUtils.isEmpty(this.f13396d));
        bundle.putFloat("u_sd", this.f13397e);
        bundle.putInt("sw", this.f13398f);
        bundle.putInt("sh", this.f13399g);
        ft2.f(bundle, "sc", this.f13400h, !TextUtils.isEmpty(this.f13400h));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        h2.w4[] w4VarArr = this.f13393a.f22357g;
        if (w4VarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.f13393a.f22352b);
            bundle2.putInt("width", this.f13393a.f22355e);
            bundle2.putBoolean("is_fluid_height", this.f13393a.f22359i);
            arrayList.add(bundle2);
        } else {
            for (h2.w4 w4Var : w4VarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", w4Var.f22359i);
                bundle3.putInt("height", w4Var.f22352b);
                bundle3.putInt("width", w4Var.f22355e);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
