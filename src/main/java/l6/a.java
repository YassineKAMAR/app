package l6;

import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
public class a extends k6.a {

    /* JADX INFO: renamed from: l6.a$a, reason: collision with other inner class name */
    private static final class C0145a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0145a f24421a = new C0145a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f24422b;

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
            f24422b = num;
        }

        private C0145a() {
        }
    }

    private final boolean c(int i8) {
        Integer num = C0145a.f24422b;
        return num == null || num.intValue() >= i8;
    }

    @Override // k6.a
    public void a(Throwable cause, Throwable exception) {
        q.f(cause, "cause");
        q.f(exception, "exception");
        if (c(19)) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }
}
