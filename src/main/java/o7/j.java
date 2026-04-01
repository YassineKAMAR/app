package o7;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f25335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f25336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f25337c;

    static {
        j jVar = new j();
        f25335a = jVar;
        f25336b = new char[117];
        f25337c = new byte[126];
        jVar.f();
        jVar.e();
    }

    private j() {
    }

    private final void a(char c8, char c9) {
        b(c8, c9);
    }

    private final void b(int i8, char c8) {
        if (c8 != 'u') {
            f25336b[c8] = (char) i8;
        }
    }

    private final void c(char c8, byte b8) {
        d(c8, b8);
    }

    private final void d(int i8, byte b8) {
        f25337c[i8] = b8;
    }

    private final void e() {
        for (int i8 = 0; i8 < 33; i8++) {
            d(i8, (byte) 127);
        }
        d(9, (byte) 3);
        d(10, (byte) 3);
        d(13, (byte) 3);
        d(32, (byte) 3);
        c(',', (byte) 4);
        c(':', (byte) 5);
        c('{', (byte) 6);
        c('}', (byte) 7);
        c('[', (byte) 8);
        c(']', (byte) 9);
        c('\"', (byte) 1);
        c('\\', (byte) 2);
    }

    private final void f() {
        for (int i8 = 0; i8 < 32; i8++) {
            b(i8, 'u');
        }
        b(8, 'b');
        b(9, 't');
        b(10, 'n');
        b(12, 'f');
        b(13, 'r');
        a('/', '/');
        a('\"', '\"');
        a('\\', '\\');
    }
}
