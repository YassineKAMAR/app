package t6;

/* JADX INFO: loaded from: classes2.dex */
public class a implements Iterable<Character> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0177a f26510d = new C0177a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f26511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char f26512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26513c;

    /* JADX INFO: renamed from: t6.a$a, reason: collision with other inner class name */
    public static final class C0177a {
        private C0177a() {
        }

        public /* synthetic */ C0177a(kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    public a(char c8, char c9, int i8) {
        if (i8 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i8 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f26511a = c8;
        this.f26512b = (char) k6.c.c(c8, c9, i8);
        this.f26513c = i8;
    }

    public final char a() {
        return this.f26511a;
    }

    public final char e() {
        return this.f26512b;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public f6.l iterator() {
        return new b(this.f26511a, this.f26512b, this.f26513c);
    }
}
