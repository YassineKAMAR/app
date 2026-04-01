package com.amazon.device.drm;

import com.amazon.device.drm.model.LicenseResponse;

/* JADX INFO: loaded from: classes.dex */
public interface LicensingListener {
    void onLicenseCommandResponse(LicenseResponse licenseResponse);
}
