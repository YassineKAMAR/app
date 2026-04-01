package v4;

import f4.r;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f26941b;

    c(Set<f> set, d dVar) {
        this.f26940a = e(set);
        this.f26941b = dVar;
    }

    public static f4.c<i> c() {
        return f4.c.e(i.class).b(r.k(f.class)).e(new f4.h() { // from class: v4.b
            @Override // f4.h
            public final Object a(f4.e eVar) {
                return c.d(eVar);
            }
        }).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i d(f4.e eVar) {
        return new c(eVar.d(f.class), d.a());
    }

    private static String e(Set<f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb.append(next.b());
            sb.append('/');
            sb.append(next.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // v4.i
    public String a() {
        if (this.f26941b.b().isEmpty()) {
            return this.f26940a;
        }
        return this.f26940a + ' ' + e(this.f26941b.b());
    }
}
