package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class ck0 extends dd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final ck0 f6384c = new ck0();

    ck0() {
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final hd b(String str, byte[] bArr, String str2) {
        return "moov".equals(str) ? new jd() : "mvhd".equals(str) ? new kd() : new ld(str);
    }
}
