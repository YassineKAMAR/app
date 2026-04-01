package com.amazon.device.iap.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.amazon.a.a.o.f;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f4326a = "d";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f4327b = "sku";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static d f4328c = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e f4329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f4330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PurchasingListener f4331f;

    private d() {
    }

    public static d e() {
        return f4328c;
    }

    private void f() {
        if (this.f4331f == null) {
            throw new IllegalStateException("You must register a PurchasingListener before invoking this operation");
        }
    }

    public PurchasingListener a() {
        return this.f4331f;
    }

    public RequestId a(String str) {
        f.a((Object) str, f4327b);
        f();
        RequestId requestId = new RequestId();
        this.f4329d.a(requestId, str);
        return requestId;
    }

    public RequestId a(Set<String> set) {
        f.a((Object) set, com.amazon.a.a.o.b.O);
        f.a((Collection<? extends Object>) set, com.amazon.a.a.o.b.O);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (it.next().trim().length() == 0) {
                throw new IllegalArgumentException("Empty SKU values are not allowed");
            }
        }
        if (set.size() <= 100) {
            f();
            RequestId requestId = new RequestId();
            this.f4329d.a(requestId, new LinkedHashSet(set));
            return requestId;
        }
        throw new IllegalArgumentException(set.size() + " SKUs were provided, but no more than 100 SKUs are allowed");
    }

    public RequestId a(boolean z7) {
        f();
        RequestId requestId = new RequestId();
        this.f4329d.a(requestId, z7);
        return requestId;
    }

    public void a(Context context, Intent intent) {
        try {
            this.f4329d.a(context, intent);
        } catch (Exception e8) {
            com.amazon.device.iap.internal.util.b.b(f4326a, "Error in onReceive: " + e8);
        }
    }

    public void a(Context context, PurchasingListener purchasingListener) {
        com.amazon.device.iap.internal.util.b.a(f4326a, "PurchasingListener registered: " + purchasingListener);
        com.amazon.device.iap.internal.util.b.a(f4326a, "PurchasingListener Context: " + context);
        if (purchasingListener == null || context == null) {
            throw new IllegalArgumentException("Neither PurchasingListener or its Context can be null");
        }
        this.f4330e = context.getApplicationContext();
        e eVarA = b.a().a(this.f4330e);
        this.f4329d = eVarA;
        if (eVarA == null) {
            com.amazon.device.iap.internal.util.b.a(f4326a, "requestHandler is null");
        }
        this.f4331f = purchasingListener;
    }

    public void a(String str, FulfillmentResult fulfillmentResult) {
        if (f.a(str)) {
            throw new IllegalArgumentException("Empty receiptId is not allowed");
        }
        f.a(fulfillmentResult, "fulfillmentResult");
        f();
        this.f4329d.a(new RequestId(), str, fulfillmentResult);
    }

    public Context b() {
        return this.f4330e;
    }

    public boolean c() {
        f();
        return com.amazon.a.a.a((Application) this.f4330e.getApplicationContext());
    }

    public RequestId d() {
        f();
        RequestId requestId = new RequestId();
        this.f4329d.a(requestId);
        return requestId;
    }
}
