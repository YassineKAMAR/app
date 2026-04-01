package com.amazon.device.simplesignin.a.a;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import com.amazon.a.a.n.a.h;
import com.amazon.device.simplesignin.ISimpleSignInResponseHandler;
import com.amazon.device.simplesignin.SimpleSignInService;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.response.GetUserAndLinksResponse;
import com.amazon.device.simplesignin.model.response.LinkUserAccountResponse;
import com.amazon.device.simplesignin.model.response.ShowLoginSelectionResponse;
import com.amazon.device.simplesignin.model.response.UnlinkUserAccountResponse;
import lombok.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f4386b = "c";

    public c(d dVar, String str, String str2) {
        super(dVar, str, str2, dVar.e().toString(), SimpleSignInService.SDK_VERSION);
        super.b(false);
    }

    protected abstract void a(RequestStatus requestStatus);

    protected void a(@NonNull final Object obj) {
        if (obj == null) {
            throw new NullPointerException("response is marked non-null but is null");
        }
        String str = f4386b;
        com.amazon.device.simplesignin.a.d.a.a(str, "Response type received: " + obj.getClass().getSimpleName());
        Context contextC = com.amazon.device.simplesignin.a.c.a().c();
        final ISimpleSignInResponseHandler iSimpleSignInResponseHandlerD = com.amazon.device.simplesignin.a.c.a().d();
        if (contextC == null || iSimpleSignInResponseHandlerD == null) {
            com.amazon.device.simplesignin.a.d.a.a(str, "Dropping the response as context of response handler is null.");
        } else {
            new Handler(contextC.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.simplesignin.a.a.c.1
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
                            com.amazon.device.simplesignin.a.d.a.b(c.f4386b, "Unknown response type:" + obj.getClass().getName());
                        }
                    } catch (Exception e8) {
                        com.amazon.device.simplesignin.a.d.a.b(c.f4386b, "Error in sending response to callback: " + e8);
                    }
                }
            });
        }
    }

    @Override // com.amazon.a.a.n.a.h
    public void b(com.amazon.d.a.h hVar) {
        String strG;
        try {
            strG = hVar.g();
        } catch (RemoteException unused) {
            com.amazon.device.simplesignin.a.d.a.b(f4386b, "Exception while fetching reason for failure");
        }
        if (a.B.equals(strG)) {
            a(RequestStatus.NOT_SUPPORTED);
            return;
        }
        if (a.E.equals(strG)) {
            a(RequestStatus.NOT_AVAILABLE);
            return;
        }
        if (a.C.equals(strG)) {
            a(RequestStatus.DUPLICATE_REQUEST);
            return;
        }
        if (a.D.equals(strG)) {
            a(RequestStatus.FEATURE_TURNED_OFF);
            return;
        }
        if (a.F.equals(strG)) {
            a(RequestStatus.RETRYABLE_FAILURE);
            return;
        }
        if (a.G.equals(strG)) {
            a(RequestStatus.INVALID_LINK_SIGNING_KEY_ENCRYPTION);
            return;
        }
        if (a.H.equals(strG)) {
            a(RequestStatus.INVALID_LINK_SIGNING_KEY);
            return;
        }
        a(RequestStatus.FAILURE);
    }
}
