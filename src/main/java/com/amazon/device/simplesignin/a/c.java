package com.amazon.device.simplesignin.a;

import android.content.Context;
import android.content.Intent;
import com.amazon.a.a.o.f;
import com.amazon.device.simplesignin.ISimpleSignInResponseHandler;
import com.amazon.device.simplesignin.model.AccountLinkType;
import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.model.request.LinkUserAccountRequest;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f4407a = "c";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f4408b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final IllegalStateException f4409c = new IllegalStateException(String.format("%s. %s", "Simple Sign-In SDK not initialized", "To initialize and register responseHandler, call SimpleSignInService.registerResponseHandler()"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f4410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ISimpleSignInResponseHandler f4411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f4412f;

    private c() {
    }

    public static c a() {
        return f4408b;
    }

    private void b(LinkUserAccountRequest linkUserAccountRequest) {
        f.a(linkUserAccountRequest.getPartnerUserId(), com.amazon.device.simplesignin.a.a.a.f4368v);
        f.a(linkUserAccountRequest.getIdentityProviderName(), com.amazon.device.simplesignin.a.a.a.f4367u);
        f.a(linkUserAccountRequest.getUserLoginName(), "userLoginName");
        f.a(linkUserAccountRequest.getAccountLinkType(), "accountLinkType");
        if (AccountLinkType.AMAZON_MANAGED.equals(linkUserAccountRequest.getAccountLinkType())) {
            f.a(linkUserAccountRequest.getLinkToken(), "linkToken");
            f.a(linkUserAccountRequest.getLinkToken().getToken(), "linkToken.token");
            f.a(linkUserAccountRequest.getLinkToken().getSchema(), "linkToken.schema");
            f.a(linkUserAccountRequest.getLinkSigningKey(), "linkSigningKey");
        }
    }

    private boolean f() {
        return this.f4410d != null;
    }

    private void g() {
        if (f()) {
            return;
        }
        com.amazon.device.simplesignin.a.d.a.b(f4407a, "Simple Sign-In SDK not initialized.");
        throw f4409c;
    }

    public RequestId a(LinkUserAccountRequest linkUserAccountRequest) {
        g();
        b(linkUserAccountRequest);
        RequestId requestId = new RequestId();
        this.f4412f.a(requestId, linkUserAccountRequest);
        return requestId;
    }

    public RequestId a(String str) {
        g();
        f.a(str, com.amazon.device.simplesignin.a.a.a.f4367u);
        RequestId requestId = new RequestId();
        this.f4412f.a(requestId, str);
        return requestId;
    }

    public RequestId a(Map<String, String> map) {
        g();
        if (map.isEmpty()) {
            throw new IllegalArgumentException("loginNames must not be empty");
        }
        RequestId requestId = new RequestId();
        this.f4412f.a(requestId, map);
        return requestId;
    }

    public void a(Context context, Intent intent) {
        this.f4412f.a(context, intent);
    }

    public void a(Context context, ISimpleSignInResponseHandler iSimpleSignInResponseHandler) {
        com.amazon.a.a.a(context.getApplicationContext());
        this.f4410d = context;
        this.f4411e = iSimpleSignInResponseHandler;
        this.f4412f = a.a().a(context);
    }

    public RequestId b(String str) {
        g();
        f.a(str, com.amazon.device.simplesignin.a.a.a.f4367u);
        RequestId requestId = new RequestId();
        this.f4412f.b(requestId, str);
        return requestId;
    }

    public String b() {
        com.amazon.device.simplesignin.a.b.a aVar;
        if (f()) {
            aVar = a.a().b(this.f4410d) ? com.amazon.device.simplesignin.a.b.a.SANDBOX : com.amazon.device.simplesignin.a.b.a.PRODUCTION;
        } else {
            com.amazon.device.simplesignin.a.d.a.b(f4407a, "Application context not initialized, SDK mode is unknown.");
            aVar = com.amazon.device.simplesignin.a.b.a.UNKNOWN;
        }
        return aVar.name();
    }

    public Context c() {
        return this.f4410d;
    }

    public ISimpleSignInResponseHandler d() {
        return this.f4411e;
    }

    public b e() {
        return this.f4412f;
    }
}
