package s5;

import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class s implements i<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f26264a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f26265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Charset f26266c;

    static final class a extends ByteArrayOutputStream {
        a() {
        }

        byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    static {
        f26265b = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
        f26266c = Charset.forName("UTF8");
    }

    protected static final void c(ByteBuffer byteBuffer, int i8) {
        int iPosition = byteBuffer.position() % i8;
        if (iPosition != 0) {
            byteBuffer.position((byteBuffer.position() + i8) - iPosition);
        }
    }

    protected static final byte[] d(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[e(byteBuffer)];
        byteBuffer.get(bArr);
        return bArr;
    }

    protected static final int e(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        int i8 = byteBuffer.get() & 255;
        return i8 < 254 ? i8 : i8 == 254 ? byteBuffer.getChar() : byteBuffer.getInt();
    }

    protected static final void h(ByteArrayOutputStream byteArrayOutputStream, int i8) {
        int size = byteArrayOutputStream.size() % i8;
        if (size != 0) {
            for (int i9 = 0; i9 < i8 - size; i9++) {
                byteArrayOutputStream.write(0);
            }
        }
    }

    protected static final void i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        o(byteArrayOutputStream, bArr.length);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }

    protected static final void j(ByteArrayOutputStream byteArrayOutputStream, int i8) {
        if (f26265b) {
            byteArrayOutputStream.write(i8);
            i8 >>>= 8;
        } else {
            byteArrayOutputStream.write(i8 >>> 8);
        }
        byteArrayOutputStream.write(i8);
    }

    protected static final void k(ByteArrayOutputStream byteArrayOutputStream, double d8) {
        n(byteArrayOutputStream, Double.doubleToLongBits(d8));
    }

    protected static final void l(ByteArrayOutputStream byteArrayOutputStream, float f8) {
        m(byteArrayOutputStream, Float.floatToIntBits(f8));
    }

    protected static final void m(ByteArrayOutputStream byteArrayOutputStream, int i8) {
        if (f26265b) {
            byteArrayOutputStream.write(i8);
            byteArrayOutputStream.write(i8 >>> 8);
            byteArrayOutputStream.write(i8 >>> 16);
            i8 >>>= 24;
        } else {
            byteArrayOutputStream.write(i8 >>> 24);
            byteArrayOutputStream.write(i8 >>> 16);
            byteArrayOutputStream.write(i8 >>> 8);
        }
        byteArrayOutputStream.write(i8);
    }

    protected static final void n(ByteArrayOutputStream byteArrayOutputStream, long j8) {
        if (f26265b) {
            byteArrayOutputStream.write((byte) j8);
            byteArrayOutputStream.write((byte) (j8 >>> 8));
            byteArrayOutputStream.write((byte) (j8 >>> 16));
            byteArrayOutputStream.write((byte) (j8 >>> 24));
            byteArrayOutputStream.write((byte) (j8 >>> 32));
            byteArrayOutputStream.write((byte) (j8 >>> 40));
            byteArrayOutputStream.write((byte) (j8 >>> 48));
            j8 >>>= 56;
        } else {
            byteArrayOutputStream.write((byte) (j8 >>> 56));
            byteArrayOutputStream.write((byte) (j8 >>> 48));
            byteArrayOutputStream.write((byte) (j8 >>> 40));
            byteArrayOutputStream.write((byte) (j8 >>> 32));
            byteArrayOutputStream.write((byte) (j8 >>> 24));
            byteArrayOutputStream.write((byte) (j8 >>> 16));
            byteArrayOutputStream.write((byte) (j8 >>> 8));
        }
        byteArrayOutputStream.write((byte) j8);
    }

    protected static final void o(ByteArrayOutputStream byteArrayOutputStream, int i8) {
        if (i8 < 254) {
            byteArrayOutputStream.write(i8);
        } else if (i8 <= 65535) {
            byteArrayOutputStream.write(254);
            j(byteArrayOutputStream, i8);
        } else {
            byteArrayOutputStream.write(255);
            m(byteArrayOutputStream, i8);
        }
    }

    @Override // s5.i
    public ByteBuffer a(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVar = new a();
        p(aVar, obj);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(aVar.size());
        byteBufferAllocateDirect.put(aVar.a(), 0, aVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // s5.i
    public Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object objF = f(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        return objF;
    }

    protected final Object f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return g(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.HashMap, java.util.Map] */
    protected Object g(byte b8, ByteBuffer byteBuffer) {
        int iE;
        int iE2;
        double[] dArr;
        ?? arrayList;
        float[] fArr;
        int i8 = 0;
        switch (b8) {
            case 0:
                return null;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                return Integer.valueOf(byteBuffer.getInt());
            case 4:
                return Long.valueOf(byteBuffer.getLong());
            case 5:
                return new BigInteger(new String(d(byteBuffer), f26266c), 16);
            case 6:
                c(byteBuffer, 8);
                return Double.valueOf(byteBuffer.getDouble());
            case 7:
                return new String(d(byteBuffer), f26266c);
            case 8:
                return d(byteBuffer);
            case 9:
                iE = e(byteBuffer);
                int[] iArr = new int[iE];
                c(byteBuffer, 4);
                byteBuffer.asIntBuffer().get(iArr);
                fArr = iArr;
                byteBuffer.position(byteBuffer.position() + (iE * 4));
                return fArr;
            case R.styleable.GradientColor_android_endX /* 10 */:
                iE2 = e(byteBuffer);
                long[] jArr = new long[iE2];
                c(byteBuffer, 8);
                byteBuffer.asLongBuffer().get(jArr);
                dArr = jArr;
                byteBuffer.position(byteBuffer.position() + (iE2 * 8));
                return dArr;
            case R.styleable.GradientColor_android_endY /* 11 */:
                iE2 = e(byteBuffer);
                double[] dArr2 = new double[iE2];
                c(byteBuffer, 8);
                byteBuffer.asDoubleBuffer().get(dArr2);
                dArr = dArr2;
                byteBuffer.position(byteBuffer.position() + (iE2 * 8));
                return dArr;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                int iE3 = e(byteBuffer);
                arrayList = new ArrayList(iE3);
                while (i8 < iE3) {
                    arrayList.add(f(byteBuffer));
                    i8++;
                }
                return arrayList;
            case 13:
                int iE4 = e(byteBuffer);
                arrayList = new HashMap();
                while (i8 < iE4) {
                    arrayList.put(f(byteBuffer), f(byteBuffer));
                    i8++;
                }
                return arrayList;
            case 14:
                iE = e(byteBuffer);
                float[] fArr2 = new float[iE];
                c(byteBuffer, 4);
                byteBuffer.asFloatBuffer().get(fArr2);
                fArr = fArr2;
                byteBuffer.position(byteBuffer.position() + (iE * 4));
                return fArr;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
    }

    protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        int i8 = 0;
        if (obj == null || obj.equals(null)) {
            byteArrayOutputStream.write(0);
            return;
        }
        if (obj instanceof Boolean) {
            byteArrayOutputStream.write(((Boolean) obj).booleanValue() ? 1 : 2);
            return;
        }
        if (obj instanceof Number) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                byteArrayOutputStream.write(3);
                m(byteArrayOutputStream, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Long) {
                byteArrayOutputStream.write(4);
                n(byteArrayOutputStream, ((Long) obj).longValue());
                return;
            }
            if ((obj instanceof Float) || (obj instanceof Double)) {
                byteArrayOutputStream.write(6);
                h(byteArrayOutputStream, 8);
                k(byteArrayOutputStream, ((Number) obj).doubleValue());
                return;
            } else {
                if (!(obj instanceof BigInteger)) {
                    throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
                }
                byteArrayOutputStream.write(5);
                i(byteArrayOutputStream, ((BigInteger) obj).toString(16).getBytes(f26266c));
                return;
            }
        }
        if (obj instanceof CharSequence) {
            byteArrayOutputStream.write(7);
            i(byteArrayOutputStream, obj.toString().getBytes(f26266c));
            return;
        }
        if (obj instanceof byte[]) {
            byteArrayOutputStream.write(8);
            i(byteArrayOutputStream, (byte[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            byteArrayOutputStream.write(9);
            int[] iArr = (int[]) obj;
            o(byteArrayOutputStream, iArr.length);
            h(byteArrayOutputStream, 4);
            int length = iArr.length;
            while (i8 < length) {
                m(byteArrayOutputStream, iArr[i8]);
                i8++;
            }
            return;
        }
        if (obj instanceof long[]) {
            byteArrayOutputStream.write(10);
            long[] jArr = (long[]) obj;
            o(byteArrayOutputStream, jArr.length);
            h(byteArrayOutputStream, 8);
            int length2 = jArr.length;
            while (i8 < length2) {
                n(byteArrayOutputStream, jArr[i8]);
                i8++;
            }
            return;
        }
        if (obj instanceof double[]) {
            byteArrayOutputStream.write(11);
            double[] dArr = (double[]) obj;
            o(byteArrayOutputStream, dArr.length);
            h(byteArrayOutputStream, 8);
            int length3 = dArr.length;
            while (i8 < length3) {
                k(byteArrayOutputStream, dArr[i8]);
                i8++;
            }
            return;
        }
        if (obj instanceof List) {
            byteArrayOutputStream.write(12);
            List list = (List) obj;
            o(byteArrayOutputStream, list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                p(byteArrayOutputStream, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            byteArrayOutputStream.write(13);
            Map map = (Map) obj;
            o(byteArrayOutputStream, map.size());
            for (Map.Entry entry : map.entrySet()) {
                p(byteArrayOutputStream, entry.getKey());
                p(byteArrayOutputStream, entry.getValue());
            }
            return;
        }
        if (!(obj instanceof float[])) {
            throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
        }
        byteArrayOutputStream.write(14);
        float[] fArr = (float[]) obj;
        o(byteArrayOutputStream, fArr.length);
        h(byteArrayOutputStream, 4);
        int length4 = fArr.length;
        while (i8 < length4) {
            l(byteArrayOutputStream, fArr[i8]);
            i8++;
        }
    }
}
