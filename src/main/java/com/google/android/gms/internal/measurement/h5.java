package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public enum h5 implements e9 {
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN(0),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED(1),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED(2),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED(3),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED(4),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED(5);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final d9<h5> f18767h = new d9<h5>() { // from class: com.google.android.gms.internal.measurement.g5
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18769a;

    h5(int i8) {
        this.f18769a = i8;
    }

    public static h5 a(int i8) {
        if (i8 == 0) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN;
        }
        if (i8 == 1) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED;
        }
        if (i8 == 2) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED;
        }
        if (i8 == 3) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED;
        }
        if (i8 == 4) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED;
        }
        if (i8 != 5) {
            return null;
        }
        return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED;
    }

    public static g9 c() {
        return i5.f18798a;
    }

    @Override // com.google.android.gms.internal.measurement.e9
    public final int j() {
        return this.f18769a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + h5.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f18769a + " name=" + name() + '>';
    }
}
