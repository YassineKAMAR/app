package com.amazon.device.simplesignin.a.a.d;

import com.amazon.d.a.j;
import com.amazon.device.simplesignin.a.a.c;
import com.amazon.device.simplesignin.a.a.d;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.response.UnlinkUserAccountResponse;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f4401b = "SSI_UnlinkUserAccount";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f4402c = "1.0";

    public b(a aVar, String str) {
        super(aVar, f4401b, "1.0");
        super.a(com.amazon.device.simplesignin.a.a.a.f4347a, str);
    }

    private void b(RequestStatus requestStatus) {
        d dVar = (d) j();
        UnlinkUserAccountResponse unlinkUserAccountResponse = new UnlinkUserAccountResponse();
        unlinkUserAccountResponse.setRequestId(dVar.e());
        unlinkUserAccountResponse.setRequestStatus(requestStatus);
        super.a(unlinkUserAccountResponse);
    }

    @Override // com.amazon.device.simplesignin.a.a.c
    protected void a(RequestStatus requestStatus) {
        b(requestStatus);
    }

    @Override // com.amazon.a.a.n.a.h
    protected boolean b(j jVar) {
        b(RequestStatus.SUCCESSFUL);
        Map mapB = jVar.b();
        return mapB.containsKey(com.amazon.device.simplesignin.a.a.a.f4363q) && mapB.get(com.amazon.device.simplesignin.a.a.a.f4363q) != null;
    }
}
