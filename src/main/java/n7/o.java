package n7;

import kotlin.jvm.internal.z;
import o7.v0;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f25203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f25204d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Object body, boolean z7) {
        super(null);
        kotlin.jvm.internal.q.f(body, "body");
        this.f25203c = z7;
        this.f25204d = body.toString();
    }

    @Override // n7.v
    public String a() {
        return this.f25204d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.q.b(z.b(o.class), z.b(obj.getClass()))) {
            return false;
        }
        o oVar = (o) obj;
        return g() == oVar.g() && kotlin.jvm.internal.q.b(a(), oVar.a());
    }

    @Override // n7.v
    public boolean g() {
        return this.f25203c;
    }

    public int hashCode() {
        return (androidx.privacysandbox.ads.adservices.topics.a.a(g()) * 31) + a().hashCode();
    }

    @Override // n7.v
    public String toString() {
        if (!g()) {
            return a();
        }
        StringBuilder sb = new StringBuilder();
        v0.c(sb, a());
        String string = sb.toString();
        kotlin.jvm.internal.q.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
