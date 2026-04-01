package k6;

import java.lang.reflect.Method;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: k6.a$a, reason: collision with other inner class name */
    private static final class C0141a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0141a f24234a = new C0141a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Method f24235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Method f24236c;

        /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
        static {
            /*
                k6.a$a r0 = new k6.a$a
                r0.<init>()
                k6.a.C0141a.f24234a = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                kotlin.jvm.internal.q.e(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            L15:
                r5 = 0
                if (r4 >= r2) goto L42
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = kotlin.jvm.internal.q.b(r7, r8)
                if (r7 == 0) goto L3b
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                kotlin.jvm.internal.q.e(r7, r8)
                java.lang.Object r7 = f6.f.A(r7)
                boolean r7 = kotlin.jvm.internal.q.b(r7, r0)
                if (r7 == 0) goto L3b
                r7 = 1
                goto L3c
            L3b:
                r7 = 0
            L3c:
                if (r7 == 0) goto L3f
                goto L43
            L3f:
                int r4 = r4 + 1
                goto L15
            L42:
                r6 = r5
            L43:
                k6.a.C0141a.f24235b = r6
                int r0 = r1.length
            L46:
                if (r3 >= r0) goto L5b
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = kotlin.jvm.internal.q.b(r4, r6)
                if (r4 == 0) goto L58
                r5 = r2
                goto L5b
            L58:
                int r3 = r3 + 1
                goto L46
            L5b:
                k6.a.C0141a.f24236c = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: k6.a.C0141a.<clinit>():void");
        }

        private C0141a() {
        }
    }

    public void a(Throwable cause, Throwable exception) {
        q.f(cause, "cause");
        q.f(exception, "exception");
        Method method = C0141a.f24235b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public r6.c b() {
        return new r6.b();
    }
}
