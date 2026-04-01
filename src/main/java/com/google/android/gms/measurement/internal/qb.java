package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class qb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w5 f20419a;

    public qb(w5 w5Var) {
        this.f20419a = w5Var;
    }

    private final boolean d() {
        return this.f20419a.F().f20718x.a() > 0;
    }

    private final boolean e() {
        return d() && this.f20419a.k().a() - this.f20419a.F().f20718x.a() > this.f20419a.z().x(null, e0.V);
    }

    final void a() {
        this.f20419a.u().i();
        if (d()) {
            if (e()) {
                this.f20419a.F().f20717w.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.f20419a.H().z0("auto", "_cmpx", bundle);
            } else {
                String strA = this.f20419a.F().f20717w.a();
                if (TextUtils.isEmpty(strA)) {
                    this.f20419a.t().I().a("Cache still valid but referrer not found");
                } else {
                    long jA = ((this.f20419a.F().f20718x.a() / 3600000) - 1) * 3600000;
                    Uri uri = Uri.parse(strA);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str : uri.getQueryParameterNames()) {
                        bundle2.putString(str, uri.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", jA);
                    Object obj = pair.first;
                    this.f20419a.H().z0(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                this.f20419a.F().f20717w.b(null);
            }
            this.f20419a.F().f20718x.b(0L);
        }
    }

    final void b(String str, Bundle bundle) {
        String string;
        this.f20419a.u().i();
        if (this.f20419a.m()) {
            return;
        }
        if (bundle == null || bundle.isEmpty()) {
            string = null;
        } else {
            if (str == null || str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f20419a.F().f20717w.b(string);
        this.f20419a.F().f20718x.b(this.f20419a.k().a());
    }

    final void c() {
        if (d() && e()) {
            this.f20419a.F().f20717w.b(null);
        }
    }
}
