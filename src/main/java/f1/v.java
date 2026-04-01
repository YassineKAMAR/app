package f1;

import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import x0.c;

/* JADX INFO: loaded from: classes.dex */
public class v {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f21696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f21697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f21698d;

        static {
            int[] iArr = new int[x0.n.values().length];
            f21698d = iArr;
            try {
                iArr[x0.n.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21698d[x0.n.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[x0.k.values().length];
            f21697c = iArr2;
            try {
                iArr2[x0.k.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21697c[x0.k.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21697c[x0.k.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21697c[x0.k.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21697c[x0.k.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[x0.a.values().length];
            f21696b = iArr3;
            try {
                iArr3[x0.a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21696b[x0.a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[x0.s.values().length];
            f21695a = iArr4;
            try {
                iArr4[x0.s.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21695a[x0.s.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21695a[x0.s.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21695a[x0.s.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f21695a[x0.s.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f21695a[x0.s.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public static int a(x0.a aVar) {
        int i8 = a.f21696b[aVar.ordinal()];
        if (i8 == 1) {
            return 0;
        }
        if (i8 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + aVar + " to int");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static x0.c b(byte[] r6) throws java.lang.Throwable {
        /*
            x0.c r0 = new x0.c
            r0.<init>()
            if (r6 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            r6 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d
            int r6 = r2.readInt()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
        L17:
            if (r6 <= 0) goto L2b
            java.lang.String r3 = r2.readUTF()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            boolean r4 = r2.readBoolean()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            r0.a(r3, r4)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            int r6 = r6 + (-1)
            goto L17
        L2b:
            r2.close()     // Catch: java.io.IOException -> L2f
            goto L33
        L2f:
            r6 = move-exception
            r6.printStackTrace()
        L33:
            r1.close()     // Catch: java.io.IOException -> L52
            goto L56
        L37:
            r6 = move-exception
            goto L41
        L39:
            r0 = move-exception
            r2 = r6
            r6 = r0
            goto L58
        L3d:
            r2 = move-exception
            r5 = r2
            r2 = r6
            r6 = r5
        L41:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L4e
            r2.close()     // Catch: java.io.IOException -> L4a
            goto L4e
        L4a:
            r6 = move-exception
            r6.printStackTrace()
        L4e:
            r1.close()     // Catch: java.io.IOException -> L52
            goto L56
        L52:
            r6 = move-exception
            r6.printStackTrace()
        L56:
            return r0
        L57:
            r6 = move-exception
        L58:
            if (r2 == 0) goto L62
            r2.close()     // Catch: java.io.IOException -> L5e
            goto L62
        L5e:
            r0 = move-exception
            r0.printStackTrace()
        L62:
            r1.close()     // Catch: java.io.IOException -> L66
            goto L6a
        L66:
            r0 = move-exception
            r0.printStackTrace()
        L6a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.v.b(byte[]):x0.c");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.ObjectOutputStream] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0067 -> B:35:0x006a). Please report as a decompilation issue!!! */
    public static byte[] c(x0.c cVar) throws Throwable {
        boolean zHasNext;
        ?? r12 = 0;
        ObjectOutputStream objectOutputStream = null;
        r12 = 0;
        if (cVar.c() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
        } catch (IOException e8) {
            e8.printStackTrace();
            r12 = r12;
        }
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(cVar.c());
                    Iterator<c.a> it = cVar.b().iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        if (zHasNext) {
                            c.a next = it.next();
                            objectOutputStream2.writeUTF(next.a().toString());
                            objectOutputStream2.writeBoolean(next.b());
                        } else {
                            try {
                                break;
                            } catch (IOException e9) {
                                e9.printStackTrace();
                            }
                        }
                    }
                    objectOutputStream2.close();
                    byteArrayOutputStream.close();
                    r12 = zHasNext;
                } catch (IOException e10) {
                    e = e10;
                    objectOutputStream = objectOutputStream2;
                    e.printStackTrace();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                    }
                    byteArrayOutputStream.close();
                    r12 = objectOutputStream;
                } catch (Throwable th) {
                    th = th;
                    r12 = objectOutputStream2;
                    if (r12 != 0) {
                        try {
                            r12.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e13) {
                        e13.printStackTrace();
                        throw th;
                    }
                }
            } catch (IOException e14) {
                e = e14;
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static x0.a d(int i8) {
        if (i8 == 0) {
            return x0.a.EXPONENTIAL;
        }
        if (i8 == 1) {
            return x0.a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i8 + " to BackoffPolicy");
    }

    public static x0.k e(int i8) {
        if (i8 == 0) {
            return x0.k.NOT_REQUIRED;
        }
        if (i8 == 1) {
            return x0.k.CONNECTED;
        }
        if (i8 == 2) {
            return x0.k.UNMETERED;
        }
        if (i8 == 3) {
            return x0.k.NOT_ROAMING;
        }
        if (i8 == 4) {
            return x0.k.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i8 == 5) {
            return x0.k.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i8 + " to NetworkType");
    }

    public static x0.n f(int i8) {
        if (i8 == 0) {
            return x0.n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i8 == 1) {
            return x0.n.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i8 + " to OutOfQuotaPolicy");
    }

    public static x0.s g(int i8) {
        if (i8 == 0) {
            return x0.s.ENQUEUED;
        }
        if (i8 == 1) {
            return x0.s.RUNNING;
        }
        if (i8 == 2) {
            return x0.s.SUCCEEDED;
        }
        if (i8 == 3) {
            return x0.s.FAILED;
        }
        if (i8 == 4) {
            return x0.s.BLOCKED;
        }
        if (i8 == 5) {
            return x0.s.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i8 + " to State");
    }

    public static int h(x0.k kVar) {
        int i8 = a.f21697c[kVar.ordinal()];
        if (i8 == 1) {
            return 0;
        }
        if (i8 == 2) {
            return 1;
        }
        if (i8 == 3) {
            return 2;
        }
        if (i8 == 4) {
            return 3;
        }
        if (i8 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && kVar == x0.k.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + kVar + " to int");
    }

    public static int i(x0.n nVar) {
        int i8 = a.f21698d[nVar.ordinal()];
        if (i8 == 1) {
            return 0;
        }
        if (i8 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + nVar + " to int");
    }

    public static int j(x0.s sVar) {
        switch (a.f21695a[sVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + sVar + " to int");
        }
    }
}
