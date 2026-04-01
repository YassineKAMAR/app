package com.amazon.device.drm.a;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.amazon.device.drm.LicensingListener;
import com.amazon.device.drm.model.AppstoreSDKModes;
import com.amazon.device.drm.model.RequestId;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f4188a = "d";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static d f4189b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f4190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f4191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private LicensingListener f4192e;

    private d() {
    }

    public static d d() {
        return f4189b;
    }

    private void f() {
        if (this.f4192e == null) {
            throw new IllegalStateException("You must register a PurchasingListener before invoking this operation");
        }
    }

    private void g() {
        if (this.f4191d == null) {
            throw new IllegalStateException("You must register a ApplicationContext before invoking this operation");
        }
    }

    public String a() {
        try {
            g();
            return (com.amazon.a.a.a((Application) this.f4191d.getApplicationContext()) ? AppstoreSDKModes.SANDBOX : AppstoreSDKModes.PRODUCTION).name();
        } catch (IllegalStateException unused) {
            return AppstoreSDKModes.UNKNOWN.name();
        }
    }

    public void a(Context context, Intent intent) {
        try {
            this.f4190c.a(context, intent);
        } catch (Exception e8) {
            com.amazon.device.drm.a.e.b.b(f4188a, "Error in onReceive: " + e8);
        }
    }

    public void a(Context context, LicensingListener licensingListener) {
        if (licensingListener == null || context == null) {
            throw new IllegalArgumentException("LicensingManager/Context cannot be null");
        }
        com.amazon.device.drm.a.e.b.a(f4188a, "LicensingListener registered: " + licensingListener);
        com.amazon.device.drm.a.e.b.a(f4188a, "LicensingListener Context: " + context);
        this.f4191d = context.getApplicationContext();
        this.f4192e = licensingListener;
        c cVarA = a.a().a(this.f4191d);
        this.f4190c = cVarA;
        if (cVarA == null) {
            com.amazon.device.drm.a.e.b.a(f4188a, "requestHandler is null");
        }
    }

    public LicensingListener b() {
        return this.f4192e;
    }

    public Context c() {
        return this.f4191d;
    }

    public RequestId e() {
        f();
        RequestId requestId = new RequestId();
        this.f4190c.a(requestId);
        return requestId;
    }
}
