package o3;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.g2;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g2 f25301a;

    public a(g2 g2Var) {
        this.f25301a = g2Var;
    }

    public static a k(Context context, String str, String str2, String str3, Bundle bundle) {
        return g2.g(context, str, str2, str3, bundle).A();
    }

    public void a(String str) {
        this.f25301a.C(str);
    }

    public void b(String str, String str2, Bundle bundle) {
        this.f25301a.u(str, str2, bundle);
    }

    public void c(String str) {
        this.f25301a.I(str);
    }

    public long d() {
        return this.f25301a.b();
    }

    public String e() {
        return this.f25301a.L();
    }

    public String f() {
        return this.f25301a.P();
    }

    public List<Bundle> g(String str, String str2) {
        return this.f25301a.h(str, str2);
    }

    public String h() {
        return this.f25301a.Q();
    }

    public String i() {
        return this.f25301a.R();
    }

    public String j() {
        return this.f25301a.S();
    }

    public int l(String str) {
        return this.f25301a.a(str);
    }

    public Map<String, Object> m(String str, String str2, boolean z7) {
        return this.f25301a.i(str, str2, z7);
    }

    public void n(String str, String str2, Bundle bundle) {
        this.f25301a.E(str, str2, bundle);
    }

    public void o(Bundle bundle) {
        this.f25301a.c(bundle, false);
    }

    public Bundle p(Bundle bundle) {
        return this.f25301a.c(bundle, true);
    }

    public void q(Bundle bundle) {
        this.f25301a.m(bundle);
    }

    public void r(Bundle bundle) {
        this.f25301a.B(bundle);
    }

    public void s(Activity activity, String str, String str2) {
        this.f25301a.l(activity, str, str2);
    }

    public void t(String str, String str2, Object obj) {
        this.f25301a.w(str, str2, obj, true);
    }

    public final void u(boolean z7) {
        this.f25301a.x(z7);
    }
}
