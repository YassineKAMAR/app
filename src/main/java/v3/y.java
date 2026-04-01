package v3;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static abstract class a implements u3.c<Map.Entry<?, ?>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26935a = new C0185a("KEY", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f26936b = new b("VALUE", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ a[] f26937c = a();

        /* JADX INFO: renamed from: v3.y$a$a, reason: collision with other inner class name */
        enum C0185a extends a {
            C0185a(String str, int i8) {
                super(str, i8, null);
            }

            @Override // u3.c
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        enum b extends a {
            b(String str, int i8) {
                super(str, i8, null);
            }

            @Override // u3.c
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        private a(String str, int i8) {
        }

        /* synthetic */ a(String str, int i8, x xVar) {
            this(str, i8);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{f26935a, f26936b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f26937c.clone();
        }
    }

    static boolean a(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    static <K> u3.c<Map.Entry<K, ?>, K> b() {
        return a.f26935a;
    }

    static String c(Map<?, ?> map) {
        StringBuilder sbA = g.a(map.size());
        sbA.append('{');
        boolean z7 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z7) {
                sbA.append(", ");
            }
            z7 = false;
            sbA.append(entry.getKey());
            sbA.append('=');
            sbA.append(entry.getValue());
        }
        sbA.append('}');
        return sbA.toString();
    }

    static <V> u3.c<Map.Entry<?, V>, V> d() {
        return a.f26936b;
    }
}
