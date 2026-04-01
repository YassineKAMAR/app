package com.amazon.device.simplesignin.a.a.b.a;

import com.amazon.d.a.j;
import com.amazon.device.simplesignin.a.a.b.c;
import com.amazon.device.simplesignin.a.a.d;
import com.amazon.device.simplesignin.model.Link;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.response.LinkUserAccountResponse;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class a extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f4377b = "SSI_LinkUserAccountResponse";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f4378c = "1.0";

    a(d dVar) {
        super(dVar, f4377b, "1.0");
    }

    @Override // com.amazon.a.a.n.a.h
    protected boolean b(j jVar) {
        String str;
        Map mapB = jVar.b();
        if ((mapB.containsKey(com.amazon.device.simplesignin.a.a.a.f4356j) || mapB.containsKey(com.amazon.device.simplesignin.a.a.a.f4357k)) && (str = (String) mapB.get(com.amazon.device.simplesignin.a.a.a.f4357k)) != null) {
            String str2 = (String) mapB.get(com.amazon.device.simplesignin.a.a.a.f4356j);
            LinkUserAccountResponse.SuccessCode successCode = LinkUserAccountResponse.SuccessCode.LinkEstablished;
            if (!successCode.name().equals(str) || str2 != null) {
                Link linkA = str2 != null ? com.amazon.device.simplesignin.a.d.b.a(str2) : null;
                if (!successCode.name().equals(str) || linkA != null) {
                    super.a(RequestStatus.SUCCESSFUL, linkA, LinkUserAccountResponse.SuccessCode.valueOf(str));
                    return true;
                }
            }
        }
        super.a(RequestStatus.FAILURE);
        return false;
    }
}
