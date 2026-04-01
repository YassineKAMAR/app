package y6;

import h6.g;
import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b1 extends b0 implements Closeable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f27477c = new a(null);

    public static final class a extends h6.b<b0, b1> {

        /* JADX INFO: renamed from: y6.b1$a$a, reason: collision with other inner class name */
        static final class C0196a extends kotlin.jvm.internal.r implements p6.l<g.b, b1> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0196a f27478a = new C0196a();

            C0196a() {
                super(1);
            }

            @Override // p6.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b1 invoke(g.b bVar) {
                if (bVar instanceof b1) {
                    return (b1) bVar;
                }
                return null;
            }
        }

        private a() {
            super(b0.f27475b, C0196a.f27478a);
        }

        public /* synthetic */ a(kotlin.jvm.internal.j jVar) {
            this();
        }
    }
}
