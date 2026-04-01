package x5;

import android.content.Context;
import java.util.Objects;
import t3.d;

/* JADX INFO: loaded from: classes.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f27306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f27307b;

    b(Boolean bool, a aVar) {
        this.f27306a = bool;
        this.f27307b = aVar;
    }

    t3.d a(Context context) {
        d.a aVar = new d.a();
        Boolean bool = this.f27306a;
        if (bool != null) {
            aVar.c(bool.booleanValue());
        }
        a aVar2 = this.f27307b;
        if (aVar2 != null) {
            aVar.b(aVar2.a(context));
        }
        return aVar.a();
    }

    a b() {
        return this.f27307b;
    }

    Boolean c() {
        return this.f27306a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(this.f27306a, bVar.c()) && Objects.equals(this.f27307b, bVar.b());
    }

    public int hashCode() {
        return Objects.hash(this.f27306a, this.f27307b);
    }
}
