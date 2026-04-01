package com.amazon.device.drm.a.a;

import android.app.Application;
import com.amazon.a.a.h.c;
import com.amazon.a.a.n.a.a.f;
import com.amazon.a.a.n.a.a.i;
import com.amazon.a.a.n.a.g;
import com.amazon.a.a.n.a.h;
import com.amazon.d.a.j;
import com.amazon.device.drm.LicensingService;
import com.amazon.device.drm.model.LicenseResponse;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;

/* JADX INFO: loaded from: classes.dex */
public class a extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f4171c = "a";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f4172d = "get_license";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f4173e = "1.0";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.amazon.a.a.k.a
    c f4174b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private Application f4175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.o.b.b f4176g;

    /* JADX INFO: renamed from: com.amazon.device.drm.a.a.a$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4177a;

        static {
            int[] iArr = new int[g.values().length];
            f4177a = iArr;
            try {
                iArr[g.CLA_LICENSE_EXPIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4177a[g.SLA_NO_LICENSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4177a[g.CLA_NOT_ENTITLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4177a[g.CLA_NOT_LOGGED_IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4177a[g.SLA_NO_CUSTOMER_ID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4177a[g.CLA_LICENSE_INVALID.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4177a[g.CLA_NO_VALID_LICENSE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4177a[g.VLA_NOT_LOGGED_IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4177a[g.VLIA_NOT_LOGGED_IN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4177a[g.CLA_NO_DEVICE_ID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4177a[g.SLA_NO_DEVICE_ID.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4177a[g.CLA_NO_CONTENT_ID.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4177a[g.CSA_INVALID_CHECKSUM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4177a[g.CSA_INVALID_SIGNATURE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f4177a[g.CSA_NO_CONTENT_METADATA.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f4177a[g.CSA_CONTENT_MD_PKG_NAME_MISMATCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f4177a[g.CLA_NULL_LOCKER_RESPONSE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public a(com.amazon.device.drm.a.b.b bVar) {
        super(bVar, f4172d, "1.0", bVar.d().toString(), LicensingService.SDK_VERSION);
        b(false);
    }

    private com.amazon.a.b.b a(com.amazon.a.b.g gVar) {
        String str;
        String str2;
        LicenseResponse.RequestStatus requestStatus;
        try {
            return com.amazon.device.drm.a.e.a.a(gVar, this.f4176g.a());
        } catch (com.amazon.a.a.o.b.a.a e8) {
            e = e8;
            str = f4171c;
            str2 = "Unable to load the public key from the apk";
            com.amazon.device.drm.a.e.b.a(str, str2);
            requestStatus = LicenseResponse.RequestStatus.ERROR_INVALID_LICENSING_KEYS;
            a(requestStatus);
            this.f4174b.a(a(e));
            return null;
        } catch (com.amazon.a.a.o.b.a.b e9) {
            e = e9;
            com.amazon.device.drm.a.e.b.a(f4171c, "Unable to parse the license returned by Appstore Client");
            requestStatus = LicenseResponse.RequestStatus.ERROR_VERIFICATION;
            a(requestStatus);
            this.f4174b.a(a(e));
            return null;
        } catch (com.amazon.a.a.o.b.a.c e10) {
            e = e10;
            str = f4171c;
            str2 = "Unable to decode the license with the public key provided by the developer";
            com.amazon.device.drm.a.e.b.a(str, str2);
            requestStatus = LicenseResponse.RequestStatus.ERROR_INVALID_LICENSING_KEYS;
            a(requestStatus);
            this.f4174b.a(a(e));
            return null;
        } catch (Exception unused) {
            com.amazon.device.drm.a.e.b.a(f4171c, "Content License returned from Appstore is not in proper format");
            a(LicenseResponse.RequestStatus.ERROR_VERIFICATION);
            return null;
        }
    }

    private void a(LicenseResponse.RequestStatus requestStatus) {
        com.amazon.device.drm.a.b.b bVar = (com.amazon.device.drm.a.b.b) j();
        bVar.a().a(new com.amazon.device.drm.a.c.a().a(bVar.d()).a(requestStatus).a());
    }

    private boolean a(com.amazon.a.b.g gVar, com.amazon.a.b.b bVar) {
        LicenseResponse.RequestStatus requestStatus;
        if (bVar == null) {
            return false;
        }
        try {
            com.amazon.device.drm.a.e.a.a(gVar, bVar, this.f4175f);
            return true;
        } catch (com.amazon.a.b.a.a e8) {
            if (e8.d().a(com.amazon.a.b.h.EXPIRATION)) {
                com.amazon.device.drm.a.e.b.a(f4171c, "License has expired");
                this.f4174b.a(a((com.amazon.a.a.d.b) e8));
                requestStatus = LicenseResponse.RequestStatus.EXPIRED;
            } else {
                com.amazon.device.drm.a.e.b.a(f4171c, "License Verification failed" + e8.d());
                this.f4174b.a(a((com.amazon.a.a.d.b) e8));
                requestStatus = LicenseResponse.RequestStatus.ERROR_VERIFICATION;
            }
            a(requestStatus);
            return false;
        }
    }

    @Override // com.amazon.a.a.n.a.h
    protected void b(com.amazon.d.a.h hVar) {
        String strG;
        try {
            strG = hVar.g();
        } catch (Exception unused) {
            strG = "Unknown";
        }
        try {
            g gVarValueOf = g.valueOf(strG);
            switch (AnonymousClass1.f4177a[gVarValueOf.ordinal()]) {
                case 1:
                    com.amazon.device.drm.a.e.b.a(f4171c, String.format("License has expired: %s", gVarValueOf.name()));
                    a(LicenseResponse.RequestStatus.EXPIRED);
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    com.amazon.device.drm.a.e.b.a(f4171c, String.format("Customer is not licensed to use the Application: %s", gVarValueOf.name()));
                    a(LicenseResponse.RequestStatus.NOT_LICENSED);
                    break;
                case R.styleable.GradientColor_android_endX /* 10 */:
                case R.styleable.GradientColor_android_endY /* 11 */:
                    com.amazon.device.drm.a.e.b.a(f4171c, String.format("Unable to verify Device info: %s", gVarValueOf.name()));
                    a(LicenseResponse.RequestStatus.ERROR_VERIFICATION);
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                case 13:
                case 14:
                case 15:
                case com.amazon.c.a.a.c.f4052g /* 16 */:
                case 17:
                    com.amazon.device.drm.a.e.b.a(f4171c, String.format("Unable to verify Application metadata: %s", gVarValueOf.name()));
                    a(LicenseResponse.RequestStatus.ERROR_VERIFICATION);
                    break;
                default:
                    com.amazon.device.drm.a.e.b.a(f4171c, "No valid failure reason found. Defaulting to UNKNOWN_ERROR");
                    a(LicenseResponse.RequestStatus.UNKNOWN_ERROR);
                    break;
            }
        } catch (Exception unused2) {
            com.amazon.device.drm.a.e.b.a(f4171c, "Unknown Reason of failure" + strG);
            this.f4174b.a(a((com.amazon.a.a.d.b) new i(f4172d)));
        }
    }

    @Override // com.amazon.a.a.n.a.h
    protected boolean b(j jVar) {
        String str = f4171c;
        com.amazon.device.drm.a.e.b.a(str, "onResult: result = " + jVar);
        try {
            com.amazon.a.b.g gVar = new com.amazon.a.b.g(jVar.b());
            if (!a(gVar, a(gVar))) {
                return false;
            }
            com.amazon.device.drm.a.e.b.a(str, "License Verification was successful");
            this.f4174b.a(new com.amazon.a.b.b.a());
            a(LicenseResponse.RequestStatus.LICENSED);
            return true;
        } catch (Exception unused) {
            com.amazon.device.drm.a.e.b.a(f4171c, "License not returned by Appstore");
            a(LicenseResponse.RequestStatus.NOT_LICENSED);
            return false;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.amazon.a.a.n.a.h
    protected void c(com.amazon.a.a.d.b bVar) {
        String str;
        String str2;
        LicenseResponse.RequestStatus requestStatus;
        String strA = bVar.a();
        if (f.f3768a.equals(strA)) {
            String strB = bVar.b();
            byte b8 = -1;
            switch (strB.hashCode()) {
                case -1023164887:
                    if (strB.equals("INVALID_CONTENT_ID")) {
                        b8 = 0;
                    }
                    break;
                case 375605247:
                    if (strB.equals("NO_INTERNET")) {
                        b8 = 2;
                    }
                    break;
                case 433141802:
                    if (strB.equals("UNKNOWN")) {
                        b8 = 1;
                    }
                    break;
                case 2056521148:
                    if (strB.equals("INTERNAL_SERVICE_ERROR")) {
                        b8 = 3;
                    }
                    break;
            }
            str = f4171c;
            if (b8 != 0) {
                com.amazon.device.drm.a.e.b.a(str, "No valid failure reason found. Defaulting to UNKNOWN_ERROR");
                requestStatus = LicenseResponse.RequestStatus.UNKNOWN_ERROR;
                a(requestStatus);
            }
            str2 = "Unable to verify Application metadata";
        } else {
            if (!com.amazon.a.a.n.a.a.a.f3761a.equals(strA)) {
                if (com.amazon.a.a.o.b.a.a.f3924a.equals(strA)) {
                    com.amazon.device.drm.a.e.b.a(f4171c, "Unable to load the public key from the apk");
                    a(LicenseResponse.RequestStatus.ERROR_INVALID_LICENSING_KEYS);
                    return;
                }
                return;
            }
            str = f4171c;
            str2 = "AuthToken verification failed";
        }
        com.amazon.device.drm.a.e.b.a(str, str2);
        requestStatus = LicenseResponse.RequestStatus.ERROR_VERIFICATION;
        a(requestStatus);
    }

    @Override // com.amazon.a.a.n.a.a
    protected boolean f() {
        return false;
    }
}
