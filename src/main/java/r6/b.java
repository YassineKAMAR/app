package r6;

import java.util.Random;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends r6.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f26118c = new a();

    public static final class a extends ThreadLocal<Random> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // r6.a
    public Random f() {
        Random random = this.f26118c.get();
        q.e(random, "implStorage.get()");
        return random;
    }
}
