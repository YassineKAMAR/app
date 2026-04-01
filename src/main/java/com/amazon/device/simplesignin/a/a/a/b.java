package com.amazon.device.simplesignin.a.a.a;

import com.amazon.d.a.j;
import com.amazon.device.simplesignin.a.a.c;
import com.amazon.device.simplesignin.a.a.d;
import com.amazon.device.simplesignin.model.Link;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.response.GetUserAndLinksResponse;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f4373b = "SSI_GetUserAndLinks";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f4374c = "1.0";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f4375d = "b";

    b(a aVar, String str) {
        super(aVar, f4373b, "1.0");
        super.a(com.amazon.device.simplesignin.a.a.a.f4347a, str);
    }

    private void a(RequestStatus requestStatus, String str, List<Link> list) {
        d dVar = (d) j();
        GetUserAndLinksResponse getUserAndLinksResponse = new GetUserAndLinksResponse();
        getUserAndLinksResponse.setRequestId(dVar.e());
        getUserAndLinksResponse.setRequestStatus(requestStatus);
        getUserAndLinksResponse.setAmazonUserId(str);
        getUserAndLinksResponse.setLinks(list);
        super.a(getUserAndLinksResponse);
    }

    @Override // com.amazon.device.simplesignin.a.a.c
    protected void a(RequestStatus requestStatus) {
        if (RequestStatus.INVALID_LINK_SIGNING_KEY_ENCRYPTION.equals(requestStatus) || RequestStatus.INVALID_LINK_SIGNING_KEY.equals(requestStatus)) {
            a(RequestStatus.FAILURE, null, null);
        } else {
            a(requestStatus, null, null);
        }
    }

    @Override // com.amazon.a.a.n.a.h
    protected boolean b(j jVar) {
        List<Link> listA;
        Map mapB = jVar.b();
        if (mapB.containsKey(com.amazon.device.simplesignin.a.a.a.f4348b) && mapB.containsKey(com.amazon.device.simplesignin.a.a.a.f4349c)) {
            String str = (String) mapB.get(com.amazon.device.simplesignin.a.a.a.f4348b);
            String str2 = (String) mapB.get(com.amazon.device.simplesignin.a.a.a.f4349c);
            if (str != null && str2 != null && (listA = com.amazon.device.simplesignin.a.d.b.a(str, str2)) != null) {
                a(RequestStatus.SUCCESSFUL, str, listA);
                return true;
            }
        }
        a(RequestStatus.FAILURE);
        return false;
    }
}
