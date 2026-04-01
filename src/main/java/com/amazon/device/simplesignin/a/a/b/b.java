package com.amazon.device.simplesignin.a.a.b;

import android.app.Activity;
import android.content.Intent;
import com.amazon.a.a.n.b.d;
import com.amazon.d.a.j;
import com.amazon.device.simplesignin.model.AccountLinkType;
import com.amazon.device.simplesignin.model.Link;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.request.LinkUserAccountRequest;
import com.amazon.device.simplesignin.model.response.LinkUserAccountResponse;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f4379d = "SSI_LinkUserAccount";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f4380e = "1.0";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f4381f = "b";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.amazon.a.a.k.a
    protected com.amazon.a.a.n.b f4382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    protected com.amazon.a.a.a.a f4383c;

    b(a aVar, LinkUserAccountRequest linkUserAccountRequest) {
        super(aVar, f4379d, "1.0");
        super.a(com.amazon.device.simplesignin.a.a.a.f4350d, linkUserAccountRequest.getPartnerUserId());
        super.a(com.amazon.device.simplesignin.a.a.a.f4347a, linkUserAccountRequest.getIdentityProviderName());
        super.a(com.amazon.device.simplesignin.a.a.a.f4351e, linkUserAccountRequest.getUserLoginName());
        super.a(com.amazon.device.simplesignin.a.a.a.f4354h, linkUserAccountRequest.getAccountLinkType().toString());
        if (AccountLinkType.AMAZON_MANAGED.equals(linkUserAccountRequest.getAccountLinkType())) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("token", linkUserAccountRequest.getLinkToken().getToken());
                jSONObject.put(com.amazon.device.simplesignin.a.a.a.A, linkUserAccountRequest.getLinkToken().getSchema());
                super.a(com.amazon.device.simplesignin.a.a.a.f4353g, jSONObject.toString());
                super.a(com.amazon.device.simplesignin.a.a.a.f4352f, linkUserAccountRequest.getLinkSigningKey());
            } catch (JSONException e8) {
                com.amazon.device.simplesignin.a.d.a.b(f4381f, "Unable to create linkToken json " + e8);
                throw new IllegalStateException("Unable to create linkToken json", e8);
            }
        }
    }

    private void a(final Intent intent) {
        this.f4382b.b(d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.device.simplesignin.a.a.b.b.1
            @Override // com.amazon.a.a.n.a
            public void a() {
                try {
                    Activity activityB = b.this.f4383c.b();
                    if (activityB == null) {
                        activityB = b.this.f4383c.a();
                    }
                    com.amazon.device.simplesignin.a.d.a.a(b.f4381f, "Consent activity is about to start: " + activityB);
                    activityB.startActivity(intent);
                } catch (Exception e8) {
                    com.amazon.device.simplesignin.a.d.a.a(b.f4381f, "Exception when starting consent activity: " + e8);
                }
            }
        });
    }

    @Override // com.amazon.a.a.n.a.h
    protected boolean b(j jVar) {
        Map mapB = jVar.b();
        if (mapB.containsKey(com.amazon.device.simplesignin.a.a.a.f4355i) && mapB.get(com.amazon.device.simplesignin.a.a.a.f4355i) != null) {
            a((Intent) mapB.get(com.amazon.device.simplesignin.a.a.a.f4355i));
            return true;
        }
        if (!mapB.containsKey(com.amazon.device.simplesignin.a.a.a.f4356j) || mapB.get(com.amazon.device.simplesignin.a.a.a.f4356j) == null) {
            super.a(RequestStatus.FAILURE);
            return false;
        }
        String str = (String) mapB.get(com.amazon.device.simplesignin.a.a.a.f4356j);
        String str2 = (String) mapB.get(com.amazon.device.simplesignin.a.a.a.f4357k);
        Link linkA = com.amazon.device.simplesignin.a.d.b.a(str);
        if (linkA == null) {
            a(RequestStatus.FAILURE);
            return false;
        }
        super.a(RequestStatus.SUCCESSFUL, linkA, LinkUserAccountResponse.SuccessCode.valueOf(str2));
        return true;
    }
}
