package com.amazon.device.simplesignin.a.a;

import android.content.Context;
import android.content.Intent;
import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.model.request.LinkUserAccountRequest;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b implements com.amazon.device.simplesignin.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f4376a = "b";

    @Override // com.amazon.device.simplesignin.a.b
    public void a(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra(a.f4358l);
        if (stringExtra == null) {
            com.amazon.device.simplesignin.a.d.a.b(f4376a, "Invalid response type: null");
            return;
        }
        com.amazon.device.simplesignin.a.d.a.a(f4376a, "Found response type: " + stringExtra);
        if (a.f4364r.equals(stringExtra)) {
            new com.amazon.device.simplesignin.a.a.b.a.b(new RequestId(intent.getStringExtra(com.amazon.a.a.o.b.B))).d();
        }
        if (a.f4365s.equals(stringExtra)) {
            new com.amazon.device.simplesignin.a.a.c.a.a(new RequestId(intent.getStringExtra(com.amazon.a.a.o.b.B))).d();
        }
    }

    @Override // com.amazon.device.simplesignin.a.b
    public void a(RequestId requestId, LinkUserAccountRequest linkUserAccountRequest) {
        new com.amazon.device.simplesignin.a.a.b.a(requestId, linkUserAccountRequest).d();
    }

    @Override // com.amazon.device.simplesignin.a.b
    public void a(RequestId requestId, String str) {
        new com.amazon.device.simplesignin.a.a.a.a(requestId, str).d();
    }

    @Override // com.amazon.device.simplesignin.a.b
    public void a(RequestId requestId, Map<String, String> map) {
        new com.amazon.device.simplesignin.a.a.c.a(requestId, map).d();
    }

    @Override // com.amazon.device.simplesignin.a.b
    public void b(RequestId requestId, String str) {
        new com.amazon.device.simplesignin.a.a.d.a(requestId, str).d();
    }
}
