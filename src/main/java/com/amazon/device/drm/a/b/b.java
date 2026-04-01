package com.amazon.device.drm.a.b;

import android.content.Context;
import android.os.Handler;
import com.amazon.a.a.n.a.h;
import com.amazon.a.a.o.f;
import com.amazon.device.drm.LicensingListener;
import com.amazon.device.drm.a.d;
import com.amazon.device.drm.model.LicenseResponse;
import com.amazon.device.drm.model.RequestId;

/* JADX INFO: loaded from: classes.dex */
public class b extends com.amazon.a.a.j.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f4180c = "b";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RequestId f4181d;

    public b(RequestId requestId) {
        this.f4181d = requestId;
    }

    @Override // com.amazon.a.a.j.a
    public com.amazon.a.a.j.b a() {
        return this.f3706a;
    }

    @Override // com.amazon.a.a.j.a
    protected void a(h hVar) {
        this.f3707b = hVar;
    }

    protected void a(final Object obj) {
        f.a(obj, "response");
        Context contextC = d.d().c();
        final LicensingListener licensingListenerB = d.d().b();
        if (contextC != null && licensingListenerB != null) {
            new Handler(contextC.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.drm.a.b.b.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Object obj2 = obj;
                        if (obj2 instanceof LicenseResponse) {
                            licensingListenerB.onLicenseCommandResponse((LicenseResponse) obj2);
                        } else {
                            com.amazon.device.drm.a.e.b.b(b.f4180c, "Unknown response type:" + obj.getClass().getName());
                        }
                    } catch (Throwable th) {
                        com.amazon.device.drm.a.e.b.b(b.f4180c, "Error in sendResponse: " + th);
                    }
                }
            });
            return;
        }
        com.amazon.device.drm.a.e.b.a(f4180c, "LicensingListener is not set. Dropping response: " + obj);
    }

    @Override // com.amazon.a.a.j.a
    public void b() {
    }

    @Override // com.amazon.a.a.j.a
    public void c() {
    }

    public RequestId d() {
        return this.f4181d;
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
