package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class u1 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r2 f19675a;

    public u1(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f19675a = null;
    }

    public u1(String str) {
        super(str);
        this.f19675a = null;
    }

    static t1 a() {
        return new t1("Protocol message tag had invalid wire type.");
    }

    static u1 b() {
        return new u1("Protocol message contained an invalid tag (zero).");
    }

    static u1 c() {
        return new u1("Protocol message had invalid UTF-8.");
    }

    static u1 d() {
        return new u1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static u1 e() {
        return new u1("Failed to parse the message.");
    }

    static u1 g() {
        return new u1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final u1 f(r2 r2Var) {
        this.f19675a = r2Var;
        return this;
    }
}
