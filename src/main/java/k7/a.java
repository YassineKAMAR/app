package k7;

import f6.o;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<? extends Annotation> f24239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<String> f24240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<String> f24241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<f> f24242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<List<Annotation>> f24243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<Boolean> f24244g;

    public a(String serialName) {
        q.f(serialName, "serialName");
        this.f24238a = serialName;
        this.f24239b = o.d();
        this.f24240c = new ArrayList();
        this.f24241d = new HashSet();
        this.f24242e = new ArrayList();
        this.f24243f = new ArrayList();
        this.f24244g = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(a aVar, String str, f fVar, List list, boolean z7, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            list = o.d();
        }
        if ((i8 & 8) != 0) {
            z7 = false;
        }
        aVar.a(str, fVar, list, z7);
    }

    public final void a(String elementName, f descriptor, List<? extends Annotation> annotations, boolean z7) {
        q.f(elementName, "elementName");
        q.f(descriptor, "descriptor");
        q.f(annotations, "annotations");
        if (!this.f24241d.add(elementName)) {
            throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered").toString());
        }
        this.f24240c.add(elementName);
        this.f24242e.add(descriptor);
        this.f24243f.add(annotations);
        this.f24244g.add(Boolean.valueOf(z7));
    }

    public final List<Annotation> c() {
        return this.f24239b;
    }

    public final List<List<Annotation>> d() {
        return this.f24243f;
    }

    public final List<f> e() {
        return this.f24242e;
    }

    public final List<String> f() {
        return this.f24240c;
    }

    public final List<Boolean> g() {
        return this.f24244g;
    }

    public final void h(List<? extends Annotation> list) {
        q.f(list, "<set-?>");
        this.f24239b = list;
    }
}
