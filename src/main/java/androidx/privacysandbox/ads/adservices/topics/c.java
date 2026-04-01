package androidx.privacysandbox.ads.adservices.topics;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<e> f2719a;

    public c(List<e> topics) {
        q.f(topics, "topics");
        this.f2719a = topics;
    }

    public final List<e> a() {
        return this.f2719a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f2719a.size() != cVar.f2719a.size()) {
            return false;
        }
        return q.b(new HashSet(this.f2719a), new HashSet(cVar.f2719a));
    }

    public int hashCode() {
        return Objects.hash(this.f2719a);
    }

    public String toString() {
        return "Topics=" + this.f2719a;
    }
}
