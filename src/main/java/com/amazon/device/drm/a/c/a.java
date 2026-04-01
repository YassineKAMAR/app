package com.amazon.device.drm.a.c;

import com.amazon.device.drm.model.LicenseResponse;
import com.amazon.device.drm.model.RequestId;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RequestId f4186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LicenseResponse.RequestStatus f4187b;

    public a a(LicenseResponse.RequestStatus requestStatus) {
        this.f4187b = requestStatus;
        return this;
    }

    public a a(RequestId requestId) {
        this.f4186a = requestId;
        return this;
    }

    public LicenseResponse a() {
        return new LicenseResponse(this);
    }

    public RequestId b() {
        return this.f4186a;
    }

    public LicenseResponse.RequestStatus c() {
        return this.f4187b;
    }
}
