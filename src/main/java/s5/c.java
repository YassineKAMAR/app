package s5;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface c {

    public interface a {
        void a(ByteBuffer byteBuffer, b bVar);
    }

    public interface b {
        void a(ByteBuffer byteBuffer);
    }

    /* JADX INFO: renamed from: s5.c$c, reason: collision with other inner class name */
    public interface InterfaceC0171c {
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f26238a = true;

        public boolean a() {
            return this.f26238a;
        }
    }

    InterfaceC0171c a(d dVar);

    InterfaceC0171c b();

    void c(String str, ByteBuffer byteBuffer);

    void d(String str, a aVar, InterfaceC0171c interfaceC0171c);

    void e(String str, a aVar);

    void h(String str, ByteBuffer byteBuffer, b bVar);
}
