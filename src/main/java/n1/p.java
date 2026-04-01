package n1;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class p implements l1.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<l1.b> f25119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f25120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s f25121c;

    p(Set<l1.b> set, o oVar, s sVar) {
        this.f25119a = set;
        this.f25120b = oVar;
        this.f25121c = sVar;
    }

    @Override // l1.g
    public <T> l1.f<T> a(String str, Class<T> cls, l1.b bVar, l1.e<T, byte[]> eVar) {
        if (this.f25119a.contains(bVar)) {
            return new r(this.f25120b, str, bVar, eVar, this.f25121c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, this.f25119a));
    }
}
