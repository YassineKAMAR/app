package q0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f25738b;

    public a(String str) {
        this(str, null);
    }

    public a(String str, Object[] objArr) {
        this.f25737a = str;
        this.f25738b = objArr;
    }

    private static void b(d dVar, int i8, Object obj) {
        long jLongValue;
        int iByteValue;
        double dDoubleValue;
        if (obj == null) {
            dVar.S(i8);
            return;
        }
        if (obj instanceof byte[]) {
            dVar.F(i8, (byte[]) obj);
            return;
        }
        if (obj instanceof Float) {
            dDoubleValue = ((Float) obj).floatValue();
        } else {
            if (!(obj instanceof Double)) {
                if (obj instanceof Long) {
                    jLongValue = ((Long) obj).longValue();
                } else {
                    if (obj instanceof Integer) {
                        iByteValue = ((Integer) obj).intValue();
                    } else if (obj instanceof Short) {
                        iByteValue = ((Short) obj).shortValue();
                    } else if (obj instanceof Byte) {
                        iByteValue = ((Byte) obj).byteValue();
                    } else {
                        if (obj instanceof String) {
                            dVar.p(i8, (String) obj);
                            return;
                        }
                        if (!(obj instanceof Boolean)) {
                            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i8 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                        }
                        jLongValue = ((Boolean) obj).booleanValue() ? 1L : 0L;
                    }
                    jLongValue = iByteValue;
                }
                dVar.A(i8, jLongValue);
                return;
            }
            dDoubleValue = ((Double) obj).doubleValue();
        }
        dVar.v(i8, dDoubleValue);
    }

    public static void d(d dVar, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i8 = 0;
        while (i8 < length) {
            Object obj = objArr[i8];
            i8++;
            b(dVar, i8, obj);
        }
    }

    @Override // q0.e
    public void a(d dVar) {
        d(dVar, this.f25738b);
    }

    @Override // q0.e
    public String c() {
        return this.f25737a;
    }
}
