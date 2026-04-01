package androidx.privacysandbox.ads.adservices.topics;

import android.annotation.SuppressLint;
import android.content.Context;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2723a = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final f a(Context context) {
            q.f(context, "context");
            h0.a aVar = h0.a.f22134a;
            if (aVar.a() >= 5) {
                return new h(context);
            }
            if (aVar.a() == 4) {
                return new g(context);
            }
            return null;
        }
    }

    public abstract Object a(b bVar, h6.d<? super c> dVar);
}
