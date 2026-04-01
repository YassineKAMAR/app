package com.amazon.a.b.a;

import com.amazon.a.a.d.b;
import com.amazon.a.a.o.b.f;
import com.amazon.a.a.o.d.c;

/* JADX INFO: loaded from: classes.dex */
public class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f3973a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f3974b;

    public a(c cVar) {
        super("LICENSE_VERIFICATION_FAILURE", "VERIFICATION_ERRORS", a(cVar));
        com.amazon.a.a.o.a.a.a(cVar.a(), "Created a verification exception with a Verifier that has no errors");
        this.f3974b = cVar;
    }

    private static String a(c cVar) {
        StringBuilder sb = new StringBuilder();
        for (com.amazon.a.a.o.d.a aVar : cVar) {
            if (sb.length() != 0) {
                sb.append(f.f3942a);
            }
            sb.append(aVar.a().a());
        }
        return sb.toString();
    }

    public c d() {
        return this.f3974b;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return this.f3974b.toString();
    }
}
