package x5;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import s5.s;

/* JADX INFO: loaded from: classes.dex */
public class c extends s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Integer, t3.b> f27308d = new HashMap();

    c() {
    }

    private List<String> q(Object obj) {
        if (obj == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                if (obj2 instanceof String) {
                    arrayList.add((String) obj2);
                }
            }
        }
        return arrayList;
    }

    @Override // s5.s
    protected Object g(byte b8, ByteBuffer byteBuffer) {
        switch (b8) {
            case -127:
                return new b((Boolean) g(byteBuffer.get(), byteBuffer), (a) g(byteBuffer.get(), byteBuffer));
            case -126:
                return new a((Integer) g(byteBuffer.get(), byteBuffer), q(g(byteBuffer.get(), byteBuffer)));
            case -125:
                return this.f27308d.get((Integer) g(byteBuffer.get(), byteBuffer));
            default:
                return super.g(b8, byteBuffer);
        }
    }

    @Override // s5.s
    protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        Object objC;
        if (obj instanceof b) {
            byteArrayOutputStream.write(-127);
            b bVar = (b) obj;
            p(byteArrayOutputStream, bVar.c());
            objC = bVar.b();
        } else {
            if (!(obj instanceof a)) {
                if (!(obj instanceof t3.b)) {
                    super.p(byteArrayOutputStream, obj);
                    return;
                } else {
                    byteArrayOutputStream.write(-125);
                    p(byteArrayOutputStream, Integer.valueOf(obj.hashCode()));
                    return;
                }
            }
            byteArrayOutputStream.write(-126);
            a aVar = (a) obj;
            p(byteArrayOutputStream, aVar.b());
            objC = aVar.c();
        }
        p(byteArrayOutputStream, objC);
    }

    void r(t3.b bVar) {
        this.f27308d.remove(Integer.valueOf(bVar.hashCode()));
    }

    void s(t3.b bVar) {
        this.f27308d.put(Integer.valueOf(bVar.hashCode()), bVar);
    }
}
