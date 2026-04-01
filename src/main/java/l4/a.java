package l4;

import java.lang.annotation.Annotation;
import l4.d;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f24384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d.a f24385b = d.a.DEFAULT;

    /* JADX INFO: renamed from: l4.a$a, reason: collision with other inner class name */
    private static final class C0143a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f24386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d.a f24387b;

        C0143a(int i8, d.a aVar) {
            this.f24386a = i8;
            this.f24387b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f24386a == dVar.tag() && this.f24387b.equals(dVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (this.f24386a ^ 14552422) + (this.f24387b.hashCode() ^ 2041407134);
        }

        @Override // l4.d
        public d.a intEncoding() {
            return this.f24387b;
        }

        @Override // l4.d
        public int tag() {
            return this.f24386a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f24386a + "intEncoding=" + this.f24387b + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0143a(this.f24384a, this.f24385b);
    }

    public a c(int i8) {
        this.f24384a = i8;
        return this;
    }
}
