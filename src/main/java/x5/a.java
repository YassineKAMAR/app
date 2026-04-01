package x5;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import t3.a;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f27304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f27305b;

    a(Integer num, List<String> list) {
        this.f27304a = num;
        this.f27305b = list;
    }

    t3.a a(Context context) {
        a.C0175a c0175a = new a.C0175a(context);
        Integer num = this.f27304a;
        if (num != null) {
            c0175a.c(num.intValue());
        }
        List<String> list = this.f27305b;
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                c0175a.a(it.next());
            }
        }
        return c0175a.b();
    }

    Integer b() {
        return this.f27304a;
    }

    List<String> c() {
        return this.f27305b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Objects.equals(this.f27304a, aVar.b()) && Objects.equals(this.f27305b, aVar.c());
    }

    public int hashCode() {
        return Objects.hash(this.f27304a, this.f27305b);
    }
}
