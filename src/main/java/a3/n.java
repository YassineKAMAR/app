package a3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f147b;

        /* synthetic */ a(Object obj, u0 u0Var) {
            o.j(obj);
            this.f147b = obj;
            this.f146a = new ArrayList();
        }

        public a a(String str, Object obj) {
            List list = this.f146a;
            o.j(str);
            list.add(str + com.amazon.a.a.o.b.f.f3943b + String.valueOf(obj));
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f147b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f146a.size();
            for (int i8 = 0; i8 < size; i8++) {
                sb.append((String) this.f146a.get(i8));
                if (i8 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a c(Object obj) {
        return new a(obj, null);
    }
}
