package z3;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f27748a = Logger.getLogger(b.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f27749b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: z3.b$b, reason: collision with other inner class name */
    public static abstract class EnumC0199b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EnumC0199b f27750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final EnumC0199b f27751b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ EnumC0199b[] f27752c;

        /* JADX INFO: renamed from: z3.b$b$a */
        enum a extends EnumC0199b {
            a(String str, int i8) {
                super(str, i8);
            }

            @Override // z3.b.EnumC0199b
            public boolean a() {
                return !b.c();
            }
        }

        /* JADX INFO: renamed from: z3.b$b$b, reason: collision with other inner class name */
        enum C0200b extends EnumC0199b {
            C0200b(String str, int i8) {
                super(str, i8);
            }

            @Override // z3.b.EnumC0199b
            public boolean a() {
                return !b.c() || b.b();
            }
        }

        static {
            a aVar = new a("ALGORITHM_NOT_FIPS", 0);
            f27750a = aVar;
            C0200b c0200b = new C0200b("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            f27751b = c0200b;
            f27752c = new EnumC0199b[]{aVar, c0200b};
        }

        private EnumC0199b(String str, int i8) {
        }

        public static EnumC0199b valueOf(String str) {
            return (EnumC0199b) Enum.valueOf(EnumC0199b.class, str);
        }

        public static EnumC0199b[] values() {
            return (EnumC0199b[]) f27752c.clone();
        }

        public abstract boolean a();
    }

    private b() {
    }

    static Boolean a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            f27748a.info("Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean b() {
        return a().booleanValue();
    }

    public static boolean c() {
        return z3.a.a() || f27749b.get();
    }
}
