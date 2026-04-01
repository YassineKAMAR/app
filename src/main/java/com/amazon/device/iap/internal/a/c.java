package com.amazon.device.iap.internal.a;

import android.content.Context;
import android.os.Handler;
import com.amazon.a.a.n.a.h;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataResponse;

/* JADX INFO: loaded from: classes.dex */
public class c extends com.amazon.a.a.j.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f4227c = "c";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RequestId f4228d;

    public c(RequestId requestId) {
        this.f4228d = requestId;
    }

    @Override // com.amazon.a.a.j.a
    public com.amazon.a.a.j.b a() {
        return this.f3706a;
    }

    @Override // com.amazon.a.a.j.a
    protected void a(h hVar) {
        this.f3707b = hVar;
    }

    protected void a(Object obj) {
        a(obj, null);
    }

    protected void a(final Object obj, final h hVar) {
        com.amazon.a.a.o.f.a(obj, "response");
        Context contextB = com.amazon.device.iap.internal.d.e().b();
        final PurchasingListener purchasingListenerA = com.amazon.device.iap.internal.d.e().a();
        if (contextB != null && purchasingListenerA != null) {
            new Handler(contextB.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.iap.internal.a.c.1
                @Override // java.lang.Runnable
                public void run() {
                    c.this.a().a(com.amazon.a.a.o.b.al, Boolean.FALSE);
                    try {
                        Object obj2 = obj;
                        if (obj2 instanceof ProductDataResponse) {
                            purchasingListenerA.onProductDataResponse((ProductDataResponse) obj2);
                        } else if (obj2 instanceof UserDataResponse) {
                            purchasingListenerA.onUserDataResponse((UserDataResponse) obj2);
                        } else if (obj2 instanceof PurchaseUpdatesResponse) {
                            PurchaseUpdatesResponse purchaseUpdatesResponse = (PurchaseUpdatesResponse) obj2;
                            purchasingListenerA.onPurchaseUpdatesResponse(purchaseUpdatesResponse);
                            Object objA = c.this.a().a(com.amazon.a.a.o.b.am);
                            if (objA != null && (objA instanceof String)) {
                                com.amazon.device.iap.internal.util.a.a(purchaseUpdatesResponse.getUserData().getUserId(), objA.toString());
                            }
                        } else if (obj2 instanceof PurchaseResponse) {
                            purchasingListenerA.onPurchaseResponse((PurchaseResponse) obj2);
                        } else {
                            com.amazon.device.iap.internal.util.b.b(c.f4227c, "Unknown response type:" + obj.getClass().getName());
                        }
                        c.this.a().a(com.amazon.a.a.o.b.al, Boolean.TRUE);
                    } catch (Throwable th) {
                        com.amazon.device.iap.internal.util.b.b(c.f4227c, "Error in sendResponse: " + th);
                    }
                    h hVar2 = hVar;
                    if (hVar2 != null) {
                        hVar2.a(true);
                        hVar.l();
                    }
                }
            });
            return;
        }
        com.amazon.device.iap.internal.util.b.a(f4227c, "PurchasingListener is not set. Dropping response: " + obj);
    }

    @Override // com.amazon.a.a.j.a
    public void b() {
    }

    @Override // com.amazon.a.a.j.a
    public void c() {
    }

    public RequestId d() {
        return this.f4228d;
    }

    public void e() {
        h hVar = this.f3707b;
        if (hVar != null) {
            hVar.l();
        } else {
            b();
        }
    }
}
