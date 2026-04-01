package a3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Uri f98f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f99a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ComponentName f101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f103e;

    public g1(String str, String str2, int i8, boolean z7) {
        o.f(str);
        this.f99a = str;
        o.f(str2);
        this.f100b = str2;
        this.f101c = null;
        this.f102d = 4225;
        this.f103e = z7;
    }

    public final ComponentName a() {
        return this.f101c;
    }

    public final Intent b(Context context) {
        Bundle bundleCall;
        if (this.f99a == null) {
            return new Intent().setComponent(this.f101c);
        }
        if (this.f103e) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", this.f99a);
            try {
                bundleCall = context.getContentResolver().call(f98f, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e8) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e8.toString()));
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f99a)));
            }
        }
        return intent == null ? new Intent(this.f99a).setPackage(this.f100b) : intent;
    }

    public final String c() {
        return this.f100b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return n.a(this.f99a, g1Var.f99a) && n.a(this.f100b, g1Var.f100b) && n.a(this.f101c, g1Var.f101c) && this.f103e == g1Var.f103e;
    }

    public final int hashCode() {
        return n.b(this.f99a, this.f100b, this.f101c, 4225, Boolean.valueOf(this.f103e));
    }

    public final String toString() {
        String str = this.f99a;
        if (str != null) {
            return str;
        }
        o.j(this.f101c);
        return this.f101c.flattenToString();
    }
}
