package com.amazon.device.simplesignin.a.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.amazon.device.simplesignin.ISimpleSignInResponseHandler;
import com.amazon.device.simplesignin.SimpleSignInService;
import com.amazon.device.simplesignin.a.c;
import com.amazon.device.simplesignin.model.AccountLinkType;
import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.request.LinkUserAccountRequest;
import com.amazon.device.simplesignin.model.response.GetUserAndLinksResponse;
import com.amazon.device.simplesignin.model.response.LinkUserAccountResponse;
import com.amazon.device.simplesignin.model.response.ShowLoginSelectionResponse;
import com.amazon.device.simplesignin.model.response.UnlinkUserAccountResponse;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b implements com.amazon.device.simplesignin.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f4430a = "b";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f4431b = "com.amazon.sdktestclient";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f4432c = "com.amazon.sdktestclient.command.CommandBroker";

    private Intent a(String str) {
        Intent intent = new Intent(str);
        intent.setComponent(new ComponentName(f4431b, f4432c));
        return intent;
    }

    private GetUserAndLinksResponse a(Intent intent) {
        GetUserAndLinksResponse getUserAndLinksResponse = new GetUserAndLinksResponse();
        try {
            JSONObject jSONObject = new JSONObject(intent.getStringExtra("getUserAndLinksOutput"));
            getUserAndLinksResponse.setRequestId(new RequestId(jSONObject.getString(com.amazon.a.a.o.b.B)));
            RequestStatus requestStatusValueOf = RequestStatus.valueOf(jSONObject.getString("status"));
            getUserAndLinksResponse.setRequestStatus(requestStatusValueOf);
            if (!RequestStatus.SUCCESSFUL.equals(requestStatusValueOf)) {
                return getUserAndLinksResponse;
            }
            String string = jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f4348b);
            getUserAndLinksResponse.setAmazonUserId(string);
            getUserAndLinksResponse.setLinks(com.amazon.device.simplesignin.a.d.b.a(string, jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f4349c)));
        } catch (JSONException e8) {
            Log.e(f4430a, "Exception while parsing GetUserAndLinks response", e8);
        }
        return getUserAndLinksResponse;
    }

    private void a(final Object obj) {
        Context contextC = c.a().c();
        final ISimpleSignInResponseHandler iSimpleSignInResponseHandlerD = c.a().d();
        if (contextC != null && obj != null) {
            new Handler(contextC.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.simplesignin.a.c.b.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Object obj2 = obj;
                        if (obj2 instanceof GetUserAndLinksResponse) {
                            iSimpleSignInResponseHandlerD.onGetUserAndLinksResponse((GetUserAndLinksResponse) obj2);
                        } else if (obj2 instanceof LinkUserAccountResponse) {
                            iSimpleSignInResponseHandlerD.onLinkUserAccountResponse((LinkUserAccountResponse) obj2);
                        } else if (obj2 instanceof ShowLoginSelectionResponse) {
                            iSimpleSignInResponseHandlerD.onShowLoginSelectionResponse((ShowLoginSelectionResponse) obj2);
                        } else if (obj2 instanceof UnlinkUserAccountResponse) {
                            iSimpleSignInResponseHandlerD.onUnlinkUserAccountResponse((UnlinkUserAccountResponse) obj2);
                        } else {
                            Log.e(b.f4430a, "Unknown response type:" + obj.getClass().getName());
                        }
                    } catch (Exception e8) {
                        Log.e(b.f4430a, "Error in sendResponse: " + e8);
                    }
                }
            });
            return;
        }
        Log.i(f4430a, "ISimpleSignInResponseHandler is not set. Dropping response: " + obj);
    }

    private LinkUserAccountResponse b(Intent intent) {
        LinkUserAccountResponse linkUserAccountResponse = new LinkUserAccountResponse();
        try {
            String stringExtra = intent.getStringExtra("linkUserAccountOutput");
            Log.i(f4430a, "SimpleSignInService : linkUserAccountOutput " + stringExtra);
            JSONObject jSONObject = new JSONObject(stringExtra);
            linkUserAccountResponse.setRequestId(new RequestId(jSONObject.getString(com.amazon.a.a.o.b.B)));
            RequestStatus requestStatusValueOf = RequestStatus.valueOf(jSONObject.getString("status"));
            linkUserAccountResponse.setRequestStatus(requestStatusValueOf);
            if (!RequestStatus.SUCCESSFUL.equals(requestStatusValueOf)) {
                return linkUserAccountResponse;
            }
            String string = jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f4357k);
            if (!LinkUserAccountResponse.SuccessCode.ConsentDenied.equals(LinkUserAccountResponse.SuccessCode.valueOf(string))) {
                linkUserAccountResponse.setLink(com.amazon.device.simplesignin.a.d.b.a(jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f4356j)));
            }
            linkUserAccountResponse.setSuccessCode(LinkUserAccountResponse.SuccessCode.valueOf(string));
        } catch (JSONException e8) {
            Log.e(f4430a, "Exception while parsing LinkUserAccount response", e8);
        }
        return linkUserAccountResponse;
    }

    private ShowLoginSelectionResponse c(Intent intent) {
        JSONObject jSONObject;
        RequestStatus requestStatusValueOf;
        ShowLoginSelectionResponse showLoginSelectionResponse = new ShowLoginSelectionResponse();
        try {
            String stringExtra = intent.getStringExtra("showLoginSelectionOutput");
            Log.i(f4430a, "SimpleSignInService : loginSelectionOutput " + stringExtra);
            jSONObject = new JSONObject(stringExtra);
            showLoginSelectionResponse.setRequestId(new RequestId(jSONObject.getString(com.amazon.a.a.o.b.B)));
            requestStatusValueOf = RequestStatus.valueOf(jSONObject.getString("status"));
            showLoginSelectionResponse.setRequestStatus(requestStatusValueOf);
        } catch (JSONException e8) {
            Log.e(f4430a, "Exception while parsing LinkUserAccount response", e8);
            showLoginSelectionResponse.setUserSelection(ShowLoginSelectionResponse.UserSelection.ManualSignIn);
        }
        if (!RequestStatus.SUCCESSFUL.equals(requestStatusValueOf)) {
            return showLoginSelectionResponse;
        }
        String string = jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f4361o);
        ShowLoginSelectionResponse.UserSelection userSelection = ShowLoginSelectionResponse.UserSelection.LoginSelected;
        if (!userSelection.name().equals(string)) {
            showLoginSelectionResponse.setUserSelection(ShowLoginSelectionResponse.UserSelection.ManualSignIn);
            return showLoginSelectionResponse;
        }
        String string2 = jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f4362p);
        if (string2 != null) {
            showLoginSelectionResponse.setUserSelection(userSelection);
            showLoginSelectionResponse.setLinkId(string2);
        }
        return showLoginSelectionResponse;
    }

    private UnlinkUserAccountResponse d(Intent intent) {
        UnlinkUserAccountResponse unlinkUserAccountResponse = new UnlinkUserAccountResponse();
        try {
            String stringExtra = intent.getStringExtra("unlinkUserAccountOutput");
            Log.i(f4430a, "SimpleSignInService : unlinkUserAccountOutput " + stringExtra);
            JSONObject jSONObject = new JSONObject(stringExtra);
            unlinkUserAccountResponse.setRequestId(new RequestId(jSONObject.getString(com.amazon.a.a.o.b.B)));
            RequestStatus requestStatusValueOf = RequestStatus.valueOf(jSONObject.getString("status"));
            unlinkUserAccountResponse.setRequestStatus(requestStatusValueOf);
            RequestStatus.SUCCESSFUL.equals(requestStatusValueOf);
            return unlinkUserAccountResponse;
        } catch (JSONException e8) {
            Log.e(f4430a, "Exception while parsing UnlinkUserAccount response", e8);
            return unlinkUserAccountResponse;
        }
    }

    @Override // com.amazon.device.simplesignin.a.b
    public void a(Context context, Intent intent) {
        Object objD;
        intent.setComponent(new ComponentName(f4431b, f4432c));
        try {
            String string = intent.getExtras().getString("responseType");
            if ("com.amazon.testclient.simplesignin.getUserAndLinks".equals(string)) {
                objD = a(intent);
            } else if ("com.amazon.testclient.simplesignin.linkUserAccount".equals(string)) {
                objD = b(intent);
            } else if ("com.amazon.testclient.simplesignin.showLoginSelection".equals(string)) {
                objD = c(intent);
            } else {
                if (!"com.amazon.testclient.simplesignin.unlinkUserAccount".equals(string)) {
                    Log.d(f4430a, "Unknown response type received.");
                    return;
                }
                objD = d(intent);
            }
            a(objD);
        } catch (Exception e8) {
            Log.e(f4430a, "Error handling response.", e8);
        }
    }

    @Override // com.amazon.device.simplesignin.a.b
    public void a(RequestId requestId, LinkUserAccountRequest linkUserAccountRequest) {
        Log.i(f4430a, "Handling linkUserAccount sandbox request.");
        Context contextC = c.a().c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.amazon.a.a.o.b.B, requestId);
            jSONObject.put("packageName", contextC.getPackageName());
            jSONObject.put(com.amazon.a.a.o.b.I, SimpleSignInService.SDK_VERSION);
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f4350d, linkUserAccountRequest.getPartnerUserId());
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f4347a, linkUserAccountRequest.getIdentityProviderName());
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f4351e, linkUserAccountRequest.getUserLoginName());
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f4354h, linkUserAccountRequest.getAccountLinkType());
            if (AccountLinkType.AMAZON_MANAGED.equals(linkUserAccountRequest.getAccountLinkType())) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("token", linkUserAccountRequest.getLinkToken().getToken());
                jSONObject2.put(com.amazon.device.simplesignin.a.a.a.A, linkUserAccountRequest.getLinkToken().getSchema());
                jSONObject.put(com.amazon.device.simplesignin.a.a.a.f4353g, jSONObject2.toString());
                jSONObject.put(com.amazon.device.simplesignin.a.a.a.f4352f, linkUserAccountRequest.getLinkSigningKey());
            }
            Bundle bundle = new Bundle();
            bundle.putString("linkUserAccountInput", jSONObject.toString());
            Intent intentA = a("com.amazon.testclient.simplesignin.linkUserAccount");
            intentA.addFlags(268435456);
            intentA.putExtras(bundle);
            contextC.startService(intentA);
        } catch (JSONException e8) {
            Log.e(f4430a, "Unable to create linkToken json");
            throw new IllegalStateException("Unable to create linkToken json", e8);
        }
    }

    @Override // com.amazon.device.simplesignin.a.b
    public void a(RequestId requestId, String str) {
        Log.i(f4430a, "Handling getUserAndLinks sandbox request.");
        Context contextC = c.a().c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.amazon.a.a.o.b.B, requestId);
            jSONObject.put("packageName", contextC.getPackageName());
            jSONObject.put(com.amazon.a.a.o.b.I, SimpleSignInService.SDK_VERSION);
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f4347a, str);
            Bundle bundle = new Bundle();
            bundle.putString("getUserAndLinksInput", jSONObject.toString());
            Intent intentA = a("com.amazon.testclient.simplesignin.getUserAndLinks");
            intentA.addFlags(268435456);
            intentA.putExtras(bundle);
            contextC.startService(intentA);
        } catch (JSONException unused) {
            Log.e(f4430a, "Error in preparing getUserAndLinksInput.");
        }
    }

    @Override // com.amazon.device.simplesignin.a.b
    public void a(RequestId requestId, Map<String, String> map) {
        Log.i(f4430a, "Handling showLoginSelection sandbox request.");
        Context contextC = c.a().c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.amazon.a.a.o.b.B, requestId);
            jSONObject.put("packageName", contextC.getPackageName());
            jSONObject.put(com.amazon.a.a.o.b.I, SimpleSignInService.SDK_VERSION);
            Intent intentA = a("com.amazon.testclient.simplesignin.showLoginSelection");
            intentA.putExtra("showLoginSelectionInput", jSONObject.toString());
            intentA.putExtra(com.amazon.device.simplesignin.a.a.a.f4359m, new HashMap(map));
            intentA.addFlags(268435456);
            contextC.startService(intentA);
        } catch (JSONException e8) {
            Log.e(f4430a, "Unable to create showLoginSelection Input");
            throw new IllegalStateException("Unable to create showLoginSelection input json", e8);
        }
    }

    @Override // com.amazon.device.simplesignin.a.b
    public void b(RequestId requestId, String str) {
        Log.i(f4430a, "Handling unlinkUserAccount sandbox request.");
        Context contextC = c.a().c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.amazon.a.a.o.b.B, requestId);
            jSONObject.put("packageName", contextC.getPackageName());
            jSONObject.put(com.amazon.a.a.o.b.I, SimpleSignInService.SDK_VERSION);
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f4347a, str);
            Bundle bundle = new Bundle();
            bundle.putString("unlinkUserAccountInput", jSONObject.toString());
            Intent intentA = a("com.amazon.testclient.simplesignin.unlinkUserAccount");
            intentA.addFlags(268435456);
            intentA.putExtras(bundle);
            contextC.startService(intentA);
        } catch (JSONException e8) {
            Log.e(f4430a, "Error in preparing unlinkUserAccount.", e8);
        }
    }
}
