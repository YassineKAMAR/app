package t3;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f26497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t3.a f26499c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f26500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f26501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private t3.a f26502c;

        @RecentlyNonNull
        public d a() {
            return new d(this, null);
        }

        @RecentlyNonNull
        public a b(t3.a aVar) {
            this.f26502c = aVar;
            return this;
        }

        @RecentlyNonNull
        public a c(boolean z7) {
            this.f26500a = z7;
            return this;
        }
    }

    /* synthetic */ d(a aVar, h hVar) {
        this.f26497a = aVar.f26500a;
        this.f26498b = aVar.f26501b;
        this.f26499c = aVar.f26502c;
    }

    @RecentlyNullable
    public t3.a a() {
        return this.f26499c;
    }

    public boolean b() {
        return this.f26497a;
    }

    @RecentlyNullable
    public final String c() {
        return this.f26498b;
    }
}
