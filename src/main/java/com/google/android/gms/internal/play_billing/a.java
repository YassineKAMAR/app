package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
enum a {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11),
    NETWORK_ERROR(12);


    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final j f19461q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f19463a;

    static {
        i iVar = new i();
        for (a aVar : values()) {
            iVar.a(Integer.valueOf(aVar.f19463a), aVar);
        }
        f19461q = iVar.b();
    }

    a(int i8) {
        this.f19463a = i8;
    }

    static a a(int i8) {
        j jVar = f19461q;
        Integer numValueOf = Integer.valueOf(i8);
        return !jVar.containsKey(numValueOf) ? RESPONSE_CODE_UNSPECIFIED : (a) jVar.get(numValueOf);
    }
}
