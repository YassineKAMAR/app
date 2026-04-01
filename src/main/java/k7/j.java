package k7;

import kotlin.jvm.internal.q;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    public static final class a extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f24280a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f24281a = new b();

        private b() {
            super(null);
        }
    }

    private j() {
    }

    public /* synthetic */ j(kotlin.jvm.internal.j jVar) {
        this();
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        String strB = z.b(getClass()).b();
        q.c(strB);
        return strB;
    }
}
