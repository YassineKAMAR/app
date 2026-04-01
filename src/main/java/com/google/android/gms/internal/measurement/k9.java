package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class k9 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ma f18876a;

    public k9(String str) {
        super(str);
        this.f18876a = null;
    }

    static j9 a() {
        return new j9("Protocol message tag had invalid wire type.");
    }

    static k9 b() {
        return new k9("Protocol message contained an invalid tag (zero).");
    }

    static k9 c() {
        return new k9("Protocol message had invalid UTF-8.");
    }

    static k9 d() {
        return new k9("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static k9 e() {
        return new k9("Failed to parse the message.");
    }

    static k9 f() {
        return new k9("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
