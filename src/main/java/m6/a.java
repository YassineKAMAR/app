package m6;

import r6.c;

/* JADX INFO: loaded from: classes2.dex */
public class a extends l6.a {

    /* JADX INFO: renamed from: m6.a$a, reason: collision with other inner class name */
    private static final class C0149a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0149a f24872a = new C0149a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f24873b;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null) {
                if (num2.intValue() > 0) {
                    num = num2;
                }
            }
            f24873b = num;
        }

        private C0149a() {
        }
    }

    private final boolean c(int i8) {
        Integer num = C0149a.f24873b;
        return num == null || num.intValue() >= i8;
    }

    @Override // k6.a
    public c b() {
        return c(34) ? new s6.a() : super.b();
    }
}
