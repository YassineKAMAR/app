package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class m14 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k24 f11122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f11123b;

    public m14(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f11122a = null;
    }

    public m14(String str) {
        super(str);
        this.f11122a = null;
    }

    static l14 a() {
        return new l14("Protocol message tag had invalid wire type.");
    }

    static m14 b() {
        return new m14("Protocol message end-group tag did not match expected tag.");
    }

    static m14 c() {
        return new m14("Protocol message contained an invalid tag (zero).");
    }

    static m14 d() {
        return new m14("Protocol message had invalid UTF-8.");
    }

    static m14 e() {
        return new m14("CodedInputStream encountered a malformed varint.");
    }

    static m14 f() {
        return new m14("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static m14 g() {
        return new m14("Failed to parse the message.");
    }

    static m14 i() {
        return new m14("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static m14 j() {
        return new m14("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final m14 h(k24 k24Var) {
        this.f11122a = k24Var;
        return this;
    }

    final void k() {
        this.f11123b = true;
    }

    final boolean l() {
        return this.f11123b;
    }
}
