package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import x0.f;
import x0.o;
import x0.v;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private UUID f3065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f3066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<String> f3067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f3068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Executor f3070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private h1.a f3071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private v f3072h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private o f3073i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private f f3074j;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<String> f3075a = Collections.emptyList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<Uri> f3076b = Collections.emptyList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Network f3077c;
    }

    public WorkerParameters(UUID uuid, b bVar, Collection<String> collection, a aVar, int i8, Executor executor, h1.a aVar2, v vVar, o oVar, f fVar) {
        this.f3065a = uuid;
        this.f3066b = bVar;
        this.f3067c = new HashSet(collection);
        this.f3068d = aVar;
        this.f3069e = i8;
        this.f3070f = executor;
        this.f3071g = aVar2;
        this.f3072h = vVar;
        this.f3073i = oVar;
        this.f3074j = fVar;
    }

    public Executor a() {
        return this.f3070f;
    }

    public f b() {
        return this.f3074j;
    }

    public UUID c() {
        return this.f3065a;
    }

    public b d() {
        return this.f3066b;
    }

    public Network e() {
        return this.f3068d.f3077c;
    }

    public o f() {
        return this.f3073i;
    }

    public int g() {
        return this.f3069e;
    }

    public Set<String> h() {
        return this.f3067c;
    }

    public h1.a i() {
        return this.f3071g;
    }

    public List<String> j() {
        return this.f3068d.f3075a;
    }

    public List<Uri> k() {
        return this.f3068d.f3076b;
    }

    public v l() {
        return this.f3072h;
    }
}
