package p7;

import java.util.List;
import kotlin.jvm.internal.q;
import p6.l;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: p7.a$a, reason: collision with other inner class name */
    public static final class C0157a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i7.b<?> f25630a;

        @Override // p7.a
        public i7.b<?> a(List<? extends i7.b<?>> typeArgumentsSerializers) {
            q.f(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.f25630a;
        }

        public final i7.b<?> b() {
            return this.f25630a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C0157a) && q.b(((C0157a) obj).f25630a, this.f25630a);
        }

        public int hashCode() {
            return this.f25630a.hashCode();
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l<List<? extends i7.b<?>>, i7.b<?>> f25631a;

        @Override // p7.a
        public i7.b<?> a(List<? extends i7.b<?>> typeArgumentsSerializers) {
            q.f(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.f25631a.invoke(typeArgumentsSerializers);
        }

        public final l<List<? extends i7.b<?>>, i7.b<?>> b() {
            return this.f25631a;
        }
    }

    private a() {
    }

    public abstract i7.b<?> a(List<? extends i7.b<?>> list);
}
