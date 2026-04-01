package s5;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import s5.s;

/* JADX INFO: loaded from: classes.dex */
public final class t implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f26267b = new t(s.f26264a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f26268a;

    public t(s sVar) {
        this.f26268a = sVar;
    }

    @Override // s5.l
    public ByteBuffer a(j jVar) {
        s.a aVar = new s.a();
        this.f26268a.p(aVar, jVar.f26252a);
        this.f26268a.p(aVar, jVar.f26253b);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(aVar.size());
        byteBufferAllocateDirect.put(aVar.a(), 0, aVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // s5.l
    public j b(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        Object objF = this.f26268a.f(byteBuffer);
        Object objF2 = this.f26268a.f(byteBuffer);
        if (!(objF instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new j((String) objF, objF2);
    }

    @Override // s5.l
    public ByteBuffer c(Object obj) throws IOException {
        s.a aVar = new s.a();
        aVar.write(0);
        this.f26268a.p(aVar, obj);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(aVar.size());
        byteBufferAllocateDirect.put(aVar.a(), 0, aVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // s5.l
    public ByteBuffer d(String str, String str2, Object obj, String str3) throws IOException {
        s.a aVar = new s.a();
        aVar.write(1);
        this.f26268a.p(aVar, str);
        this.f26268a.p(aVar, str2);
        if (obj instanceof Throwable) {
            this.f26268a.p(aVar, g5.b.d((Throwable) obj));
        } else {
            this.f26268a.p(aVar, obj);
        }
        this.f26268a.p(aVar, str3);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(aVar.size());
        byteBufferAllocateDirect.put(aVar.a(), 0, aVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // s5.l
    public ByteBuffer e(String str, String str2, Object obj) throws IOException {
        s.a aVar = new s.a();
        aVar.write(1);
        this.f26268a.p(aVar, str);
        this.f26268a.p(aVar, str2);
        if (obj instanceof Throwable) {
            this.f26268a.p(aVar, g5.b.d((Throwable) obj));
        } else {
            this.f26268a.p(aVar, obj);
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(aVar.size());
        byteBufferAllocateDirect.put(aVar.a(), 0, aVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // s5.l
    public Object f(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        byte b8 = byteBuffer.get();
        if (b8 != 0) {
            if (b8 == 1) {
            }
            throw new IllegalArgumentException("Envelope corrupted");
        }
        Object objF = this.f26268a.f(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return objF;
        }
        Object objF2 = this.f26268a.f(byteBuffer);
        Object objF3 = this.f26268a.f(byteBuffer);
        Object objF4 = this.f26268a.f(byteBuffer);
        if ((objF2 instanceof String) && ((objF3 == null || (objF3 instanceof String)) && !byteBuffer.hasRemaining())) {
            throw new e((String) objF2, (String) objF3, objF4);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }
}
