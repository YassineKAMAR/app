package com.amazon.c.a.a;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f4046a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f4047b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f4048c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f4049d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f4050e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f4051f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f4052g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f4053h = 32;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final /* synthetic */ boolean f4054i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f4055j = 76;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f4058m = "US-ASCII";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final byte[] f4061p = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final byte f4059n = -5;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final byte f4056k = 61;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte f4060o = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final byte f4057l = 10;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final byte[] f4062q = {-9, -9, -9, -9, -9, -9, -9, -9, -9, f4059n, f4059n, -9, -9, f4059n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, f4059n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, f4056k, -9, -9, -9, f4060o, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, f4057l, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final byte[] f4063r = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final byte[] f4064s = {-9, -9, -9, -9, -9, -9, -9, -9, -9, f4059n, f4059n, -9, -9, f4059n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, f4059n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, f4056k, -9, -9, -9, f4060o, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, f4057l, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final byte[] f4065t = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final byte[] f4066u = {-9, -9, -9, -9, -9, -9, -9, -9, -9, f4059n, f4059n, -9, -9, f4059n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, f4059n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, f4057l, -9, -9, -9, f4060o, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, f4056k, 62, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    public static class a extends FilterInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f4067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f4068b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f4069c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f4070d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f4071e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f4072f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f4073g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f4074h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private byte[] f4075i;

        public a(InputStream inputStream) {
            this(inputStream, 0);
        }

        public a(InputStream inputStream, int i8) {
            super(inputStream);
            this.f4074h = i8;
            this.f4073g = (i8 & 8) > 0;
            boolean z7 = (i8 & 1) > 0;
            this.f4067a = z7;
            int i9 = z7 ? 4 : 3;
            this.f4070d = i9;
            this.f4069c = new byte[i9];
            this.f4068b = -1;
            this.f4072f = 0;
            this.f4075i = c.c(i8);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i8;
            if (this.f4068b < 0) {
                if (this.f4067a) {
                    byte[] bArr = new byte[3];
                    int i9 = 0;
                    for (int i10 = 0; i10 < 3; i10++) {
                        int i11 = ((FilterInputStream) this).in.read();
                        if (i11 < 0) {
                            break;
                        }
                        bArr[i10] = (byte) i11;
                        i9++;
                    }
                    if (i9 <= 0) {
                        return -1;
                    }
                    c.b(bArr, 0, i9, this.f4069c, 0, this.f4074h);
                    this.f4068b = 0;
                    this.f4071e = 4;
                } else {
                    byte[] bArr2 = new byte[4];
                    int i12 = 0;
                    while (i12 < 4) {
                        do {
                            i8 = ((FilterInputStream) this).in.read();
                            if (i8 < 0) {
                                break;
                            }
                        } while (this.f4075i[i8 & 127] <= -5);
                        if (i8 < 0) {
                            break;
                        }
                        bArr2[i12] = (byte) i8;
                        i12++;
                    }
                    if (i12 != 4) {
                        if (i12 == 0) {
                            return -1;
                        }
                        throw new IOException("Improperly padded Base64 input.");
                    }
                    this.f4071e = c.b(bArr2, 0, this.f4069c, 0, this.f4074h);
                    this.f4068b = 0;
                }
            }
            int i13 = this.f4068b;
            if (i13 < 0) {
                throw new IOException("Error in Base64 code reading stream.");
            }
            if (i13 >= this.f4071e) {
                return -1;
            }
            if (this.f4067a && this.f4073g && this.f4072f >= c.f4055j) {
                this.f4072f = 0;
                return 10;
            }
            this.f4072f++;
            byte[] bArr3 = this.f4069c;
            int i14 = i13 + 1;
            this.f4068b = i14;
            byte b8 = bArr3[i13];
            if (i14 >= this.f4070d) {
                this.f4068b = -1;
            }
            return b8 & c.f4060o;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i8, int i9) throws IOException {
            int i10 = 0;
            while (true) {
                if (i10 >= i9) {
                    break;
                }
                int i11 = read();
                if (i11 >= 0) {
                    bArr[i8 + i10] = (byte) i11;
                    i10++;
                } else if (i10 == 0) {
                    return -1;
                }
            }
            return i10;
        }
    }

    public static class b extends FilterOutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f4076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f4077b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f4078c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f4079d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f4080e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f4081f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte[] f4082g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f4083h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f4084i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte[] f4085j;

        public b(OutputStream outputStream) {
            this(outputStream, 1);
        }

        public b(OutputStream outputStream, int i8) {
            super(outputStream);
            this.f4081f = (i8 & 8) != 0;
            boolean z7 = (i8 & 1) != 0;
            this.f4076a = z7;
            int i9 = z7 ? 3 : 4;
            this.f4079d = i9;
            this.f4078c = new byte[i9];
            this.f4077b = 0;
            this.f4080e = 0;
            this.f4083h = false;
            this.f4082g = new byte[4];
            this.f4084i = i8;
            this.f4085j = c.c(i8);
        }

        public void a() throws IOException {
            int i8 = this.f4077b;
            if (i8 > 0) {
                if (!this.f4076a) {
                    throw new IOException("Base64 input not properly padded.");
                }
                ((FilterOutputStream) this).out.write(c.b(this.f4082g, this.f4078c, i8, this.f4084i));
                this.f4077b = 0;
            }
        }

        public void b() throws IOException {
            a();
            this.f4083h = true;
        }

        public void c() {
            this.f4083h = false;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            a();
            super.close();
            this.f4078c = null;
            ((FilterOutputStream) this).out = null;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i8) throws IOException {
            if (this.f4083h) {
                ((FilterOutputStream) this).out.write(i8);
                return;
            }
            if (this.f4076a) {
                byte[] bArr = this.f4078c;
                int i9 = this.f4077b;
                int i10 = i9 + 1;
                this.f4077b = i10;
                bArr[i9] = (byte) i8;
                int i11 = this.f4079d;
                if (i10 < i11) {
                    return;
                }
                ((FilterOutputStream) this).out.write(c.b(this.f4082g, bArr, i11, this.f4084i));
                int i12 = this.f4080e + 4;
                this.f4080e = i12;
                if (this.f4081f && i12 >= c.f4055j) {
                    ((FilterOutputStream) this).out.write(10);
                    this.f4080e = 0;
                }
            } else {
                byte b8 = this.f4085j[i8 & 127];
                if (b8 <= -5) {
                    if (b8 != -5) {
                        throw new IOException("Invalid character in Base64 data.");
                    }
                    return;
                }
                byte[] bArr2 = this.f4078c;
                int i13 = this.f4077b;
                int i14 = i13 + 1;
                this.f4077b = i14;
                bArr2[i13] = (byte) i8;
                if (i14 < this.f4079d) {
                    return;
                }
                ((FilterOutputStream) this).out.write(this.f4082g, 0, c.b(bArr2, 0, this.f4082g, 0, this.f4084i));
            }
            this.f4077b = 0;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i8, int i9) throws IOException {
            if (this.f4083h) {
                ((FilterOutputStream) this).out.write(bArr, i8, i9);
                return;
            }
            for (int i10 = 0; i10 < i9; i10++) {
                write(bArr[i8 + i10]);
            }
        }
    }

    private c() {
    }

    public static String a(Serializable serializable) {
        return a(serializable, 0);
    }

    public static String a(Serializable serializable, int i8) throws Throwable {
        OutputStream gZIPOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        b bVar;
        ObjectOutputStream objectOutputStream;
        if (serializable == null) {
            throw new NullPointerException("Cannot serialize a null object.");
        }
        ObjectOutputStream objectOutputStream2 = null;
        objectOutputStream2 = null;
        objectOutputStream2 = null;
        objectOutputStream2 = null;
        objectOutputStream2 = null;
        objectOutputStream2 = null;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bVar = new b(byteArrayOutputStream, i8 | 1);
                try {
                    if ((i8 & 2) != 0) {
                        gZIPOutputStream = new GZIPOutputStream(bVar);
                        try {
                            objectOutputStream2 = new ObjectOutputStream(gZIPOutputStream);
                            gZIPOutputStream = gZIPOutputStream;
                        } catch (IOException e8) {
                            e = e8;
                            objectOutputStream = objectOutputStream2;
                            byteArrayOutputStream2 = byteArrayOutputStream;
                            gZIPOutputStream = gZIPOutputStream;
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                ObjectOutputStream objectOutputStream3 = objectOutputStream;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                objectOutputStream2 = objectOutputStream3;
                                try {
                                    objectOutputStream2.close();
                                } catch (Exception unused) {
                                }
                                try {
                                    gZIPOutputStream.close();
                                } catch (Exception unused2) {
                                }
                                try {
                                    bVar.close();
                                } catch (Exception unused3) {
                                }
                                try {
                                    byteArrayOutputStream.close();
                                    throw th;
                                } catch (Exception unused4) {
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            objectOutputStream2.close();
                            gZIPOutputStream.close();
                            bVar.close();
                            byteArrayOutputStream.close();
                            throw th;
                        }
                    } else {
                        objectOutputStream2 = new ObjectOutputStream(bVar);
                        gZIPOutputStream = null;
                    }
                    objectOutputStream2.writeObject(serializable);
                    try {
                        objectOutputStream2.close();
                    } catch (Exception unused5) {
                    }
                    try {
                        gZIPOutputStream.close();
                    } catch (Exception unused6) {
                    }
                    try {
                        bVar.close();
                    } catch (Exception unused7) {
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception unused8) {
                    }
                    try {
                        return new String(byteArrayOutputStream.toByteArray(), f4058m);
                    } catch (UnsupportedEncodingException unused9) {
                        return new String(byteArrayOutputStream.toByteArray());
                    }
                } catch (IOException e9) {
                    e = e9;
                    ObjectOutputStream objectOutputStream4 = objectOutputStream2;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    objectOutputStream = objectOutputStream4;
                    gZIPOutputStream = objectOutputStream4;
                } catch (Throwable th3) {
                    th = th3;
                    gZIPOutputStream = objectOutputStream2;
                }
            } catch (IOException e10) {
                e = e10;
                gZIPOutputStream = null;
                bVar = null;
                byteArrayOutputStream2 = byteArrayOutputStream;
                objectOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                gZIPOutputStream = null;
                bVar = null;
            }
        } catch (IOException e11) {
            e = e11;
            gZIPOutputStream = null;
            objectOutputStream = null;
            bVar = null;
        } catch (Throwable th5) {
            th = th5;
            gZIPOutputStream = null;
            byteArrayOutputStream = null;
            bVar = null;
        }
    }

    public static String a(byte[] bArr) throws Throwable {
        String strA;
        try {
            strA = a(bArr, 0, bArr.length, 0);
        } catch (IOException e8) {
            if (!f4054i) {
                throw new AssertionError(e8.getMessage());
            }
            strA = null;
        }
        if (f4054i || strA != null) {
            return strA;
        }
        throw new AssertionError();
    }

    public static String a(byte[] bArr, int i8) {
        return a(bArr, 0, bArr.length, i8);
    }

    public static String a(byte[] bArr, int i8, int i9) throws Throwable {
        String strA;
        try {
            strA = a(bArr, i8, i9, 0);
        } catch (IOException e8) {
            if (!f4054i) {
                throw new AssertionError(e8.getMessage());
            }
            strA = null;
        }
        if (f4054i || strA != null) {
            return strA;
        }
        throw new AssertionError();
    }

    public static String a(byte[] bArr, int i8, int i9, int i10) throws Throwable {
        byte[] bArrB = b(bArr, i8, i9, i10);
        try {
            return new String(bArrB, f4058m);
        } catch (UnsupportedEncodingException unused) {
            return new String(bArrB);
        }
    }

    public static void a(String str, String str2) throws Throwable {
        b bVar = null;
        try {
            try {
                b bVar2 = new b(new FileOutputStream(str2), 0);
                try {
                    bVar2.write(str.getBytes(f4058m));
                    try {
                        bVar2.close();
                    } catch (Exception unused) {
                    }
                } catch (IOException e8) {
                } catch (Throwable th) {
                    th = th;
                    bVar = bVar2;
                    try {
                        bVar.close();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e9) {
            throw e9;
        }
    }

    public static void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        byte[] bArr = new byte[3];
        byte[] bArr2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int iMin = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(bArr, 0, iMin);
            b(bArr2, bArr, iMin, 0);
            byteBuffer2.put(bArr2);
        }
    }

    public static void a(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        byte[] bArr = new byte[3];
        byte[] bArr2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int iMin = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(bArr, 0, iMin);
            b(bArr2, bArr, iMin, 0);
            for (int i8 = 0; i8 < 4; i8++) {
                charBuffer.put((char) (bArr2[i8] & f4060o));
            }
        }
    }

    public static void a(byte[] bArr, String str) throws Throwable {
        if (bArr == null) {
            throw new NullPointerException("Data to encode was null.");
        }
        b bVar = null;
        try {
            try {
                b bVar2 = new b(new FileOutputStream(str), 1);
                try {
                    bVar2.write(bArr);
                    try {
                        bVar2.close();
                    } catch (Exception unused) {
                    }
                } catch (IOException e8) {
                    bVar = bVar2;
                    throw e8;
                } catch (Throwable th) {
                    th = th;
                    bVar = bVar2;
                    try {
                        bVar.close();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
            } catch (IOException e9) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static byte[] a(String str) {
        return a(str, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.io.ByteArrayInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.ByteArrayInputStream] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.ByteArrayInputStream] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:57:0x0059
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static byte[] a(java.lang.String r5, int r6) {
        /*
            if (r5 == 0) goto L8e
            java.lang.String r0 = "US-ASCII"
            byte[] r5 = r5.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L9
            goto Ld
        L9:
            byte[] r5 = r5.getBytes()
        Ld:
            int r0 = r5.length
            r1 = 0
            byte[] r5 = c(r5, r1, r0, r6)
            r0 = 4
            r6 = r6 & r0
            r2 = 1
            if (r6 == 0) goto L1a
            r6 = 1
            goto L1b
        L1a:
            r6 = 0
        L1b:
            if (r5 == 0) goto L8d
            int r3 = r5.length
            if (r3 < r0) goto L8d
            if (r6 != 0) goto L8d
            r6 = r5[r1]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r0 = r5[r2]
            int r0 = r0 << 8
            r2 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r2
            r6 = r6 | r0
            r0 = 35615(0x8b1f, float:4.9907E-41)
            if (r0 != r6) goto L8d
            r6 = 2048(0x800, float:2.87E-42)
            byte[] r6 = new byte[r6]
            r0 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L78
            r2.<init>()     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L78
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6f
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6f
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
        L48:
            int r0 = r4.read(r6)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            if (r0 < 0) goto L52
            r2.write(r6, r1, r0)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            goto L48
        L52:
            byte[] r5 = r2.toByteArray()     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r2.close()     // Catch: java.lang.Exception -> L59
        L59:
            r4.close()     // Catch: java.lang.Exception -> L5c
        L5c:
            r3.close()     // Catch: java.lang.Exception -> L8d
            goto L8d
        L60:
            r5 = move-exception
            goto L6d
        L62:
            r6 = move-exception
            goto L72
        L64:
            r5 = move-exception
            r4 = r0
            goto L6d
        L67:
            r6 = move-exception
            r4 = r0
            goto L72
        L6a:
            r5 = move-exception
            r3 = r0
            r4 = r3
        L6d:
            r0 = r2
            goto L83
        L6f:
            r6 = move-exception
            r3 = r0
            r4 = r3
        L72:
            r0 = r2
            goto L7b
        L74:
            r5 = move-exception
            r3 = r0
            r4 = r3
            goto L83
        L78:
            r6 = move-exception
            r3 = r0
            r4 = r3
        L7b:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L82
            r0.close()     // Catch: java.lang.Exception -> L59
            goto L59
        L82:
            r5 = move-exception
        L83:
            r0.close()     // Catch: java.lang.Exception -> L86
        L86:
            r4.close()     // Catch: java.lang.Exception -> L89
        L89:
            r3.close()     // Catch: java.lang.Exception -> L8c
        L8c:
            throw r5
        L8d:
            return r5
        L8e:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "Input string was null."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.c.a.a.c.a(java.lang.String, int):byte[]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(byte[] bArr, int i8, byte[] bArr2, int i9, int i10) {
        int i11;
        int i12;
        if (bArr == null) {
            throw new NullPointerException("Source array was null.");
        }
        if (bArr2 == null) {
            throw new NullPointerException("Destination array was null.");
        }
        if (i8 < 0 || (i11 = i8 + 3) >= bArr.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i8)));
        }
        if (i9 < 0 || (i12 = i9 + 2) >= bArr2.length) {
            throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", Integer.valueOf(bArr2.length), Integer.valueOf(i9)));
        }
        byte[] bArrC = c(i10);
        byte b8 = bArr[i8 + 2];
        if (b8 == 61) {
            bArr2[i9] = (byte) ((((bArrC[bArr[i8 + 1]] & f4060o) << 12) | ((bArrC[bArr[i8]] & f4060o) << 18)) >>> 16);
            return 1;
        }
        byte b9 = bArr[i11];
        if (b9 == 61) {
            int i13 = ((bArrC[bArr[i8 + 1]] & f4060o) << 12) | ((bArrC[bArr[i8]] & f4060o) << 18) | ((bArrC[b8] & f4060o) << 6);
            bArr2[i9] = (byte) (i13 >>> 16);
            bArr2[i9 + 1] = (byte) (i13 >>> 8);
            return 2;
        }
        int i14 = ((bArrC[bArr[i8 + 1]] & f4060o) << 12) | ((bArrC[bArr[i8]] & f4060o) << 18) | ((bArrC[b8] & f4060o) << 6) | (bArrC[b9] & f4060o);
        bArr2[i9] = (byte) (i14 >> 16);
        bArr2[i9 + 1] = (byte) (i14 >> 8);
        bArr2[i12] = (byte) i14;
        return 3;
    }

    public static void b(String str, String str2) throws Throwable {
        String strC = c(str);
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(str2));
                try {
                    bufferedOutputStream2.write(strC.getBytes(f4058m));
                    try {
                        bufferedOutputStream2.close();
                    } catch (Exception unused) {
                    }
                } catch (IOException e8) {
                    bufferedOutputStream = bufferedOutputStream2;
                    throw e8;
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    try {
                        bufferedOutputStream.close();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
            } catch (IOException e9) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static final byte[] b(int i8) {
        return (i8 & 16) == 16 ? f4063r : (i8 & 32) == 32 ? f4065t : f4061p;
    }

    public static byte[] b(String str) throws Throwable {
        a aVar = null;
        try {
            try {
                File file = new File(str);
                if (file.length() > 2147483647L) {
                    throw new IOException("File is too big for this convenience method (" + file.length() + " bytes).");
                }
                byte[] bArr = new byte[(int) file.length()];
                a aVar2 = new a(new BufferedInputStream(new FileInputStream(file)), 0);
                int i8 = 0;
                while (true) {
                    try {
                        int i9 = aVar2.read(bArr, i8, 4096);
                        if (i9 < 0) {
                            break;
                        }
                        i8 += i9;
                    } catch (IOException e8) {
                        throw e8;
                    } catch (Throwable th) {
                        th = th;
                        aVar = aVar2;
                        try {
                            aVar.close();
                        } catch (Exception unused) {
                        }
                        throw th;
                    }
                }
                byte[] bArr2 = new byte[i8];
                System.arraycopy(bArr, 0, bArr2, 0, i8);
                try {
                    aVar2.close();
                } catch (Exception unused2) {
                }
                return bArr2;
            } catch (IOException e9) {
                throw e9;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static byte[] b(byte[] bArr) {
        try {
            return b(bArr, 0, bArr.length, 0);
        } catch (IOException e8) {
            if (f4054i) {
                return null;
            }
            throw new AssertionError("IOExceptions only come from GZipping, which is turned off: " + e8.getMessage());
        }
    }

    public static byte[] b(byte[] bArr, int i8, int i9, int i10) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        b bVar;
        GZIPOutputStream gZIPOutputStream;
        if (bArr == null) {
            throw new NullPointerException("Cannot serialize a null array.");
        }
        if (i8 < 0) {
            throw new IllegalArgumentException("Cannot have negative offset: " + i8);
        }
        if (i9 < 0) {
            throw new IllegalArgumentException("Cannot have length offset: " + i9);
        }
        if (i8 + i9 > bArr.length) {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(bArr.length)));
        }
        if ((i10 & 2) == 0) {
            boolean z7 = (i10 & 8) != 0;
            int i11 = ((i9 / 3) * 4) + (i9 % 3 > 0 ? 4 : 0);
            if (z7) {
                i11 += i11 / f4055j;
            }
            int i12 = i11;
            byte[] bArr2 = new byte[i12];
            int i13 = i9 - 2;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (i14 < i13) {
                int i17 = i14;
                b(bArr, i14 + i8, 3, bArr2, i15, i10);
                int i18 = i16 + 4;
                if (!z7 || i18 < f4055j) {
                    i16 = i18;
                } else {
                    bArr2[i15 + 4] = f4057l;
                    i15++;
                    i16 = 0;
                }
                i14 = i17 + 3;
                i15 += 4;
            }
            int i19 = i14;
            if (i19 < i9) {
                b(bArr, i19 + i8, i9 - i19, bArr2, i15, i10);
                i15 += 4;
            }
            int i20 = i15;
            if (i20 > i12 - 1) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i20];
            System.arraycopy(bArr2, 0, bArr3, 0, i20);
            return bArr3;
        }
        GZIPOutputStream gZIPOutputStream2 = null;
        gZIPOutputStream2 = null;
        gZIPOutputStream2 = null;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bVar = new b(byteArrayOutputStream, i10 | 1);
            } catch (IOException e8) {
                e = e8;
                bVar = null;
                gZIPOutputStream = null;
            } catch (Throwable th) {
                th = th;
                bVar = null;
            }
        } catch (IOException e9) {
            e = e9;
            bVar = null;
            gZIPOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream = null;
            bVar = null;
        }
        try {
            gZIPOutputStream = new GZIPOutputStream(bVar);
            try {
                gZIPOutputStream.write(bArr, i8, i9);
                gZIPOutputStream.close();
                try {
                    gZIPOutputStream.close();
                } catch (Exception unused) {
                }
                try {
                    bVar.close();
                } catch (Exception unused2) {
                }
                try {
                    byteArrayOutputStream.close();
                } catch (Exception unused3) {
                }
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e10) {
                e = e10;
                byteArrayOutputStream2 = byteArrayOutputStream;
                try {
                    throw e;
                } catch (Throwable th3) {
                    th = th3;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    gZIPOutputStream2 = gZIPOutputStream;
                    try {
                        gZIPOutputStream2.close();
                    } catch (Exception unused4) {
                    }
                    try {
                        bVar.close();
                    } catch (Exception unused5) {
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (Exception unused6) {
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                gZIPOutputStream2 = gZIPOutputStream;
                gZIPOutputStream2.close();
                bVar.close();
                byteArrayOutputStream.close();
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            gZIPOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            gZIPOutputStream2.close();
            bVar.close();
            byteArrayOutputStream.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] b(byte[] bArr, int i8, int i9, byte[] bArr2, int i10, int i11) {
        byte[] bArrB = b(i11);
        int i12 = (i9 > 0 ? (bArr[i8] << 24) >>> 8 : 0) | (i9 > 1 ? (bArr[i8 + 1] << 24) >>> 16 : 0) | (i9 > 2 ? (bArr[i8 + 2] << 24) >>> 24 : 0);
        if (i9 == 1) {
            bArr2[i10] = bArrB[i12 >>> 18];
            bArr2[i10 + 1] = bArrB[(i12 >>> 12) & 63];
            bArr2[i10 + 2] = f4056k;
            bArr2[i10 + 3] = f4056k;
            return bArr2;
        }
        if (i9 == 2) {
            bArr2[i10] = bArrB[i12 >>> 18];
            bArr2[i10 + 1] = bArrB[(i12 >>> 12) & 63];
            bArr2[i10 + 2] = bArrB[(i12 >>> 6) & 63];
            bArr2[i10 + 3] = f4056k;
            return bArr2;
        }
        if (i9 != 3) {
            return bArr2;
        }
        bArr2[i10] = bArrB[i12 >>> 18];
        bArr2[i10 + 1] = bArrB[(i12 >>> 12) & 63];
        bArr2[i10 + 2] = bArrB[(i12 >>> 6) & 63];
        bArr2[i10 + 3] = bArrB[i12 & 63];
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] b(byte[] bArr, byte[] bArr2, int i8, int i9) {
        b(bArr2, 0, i8, bArr, 0, i9);
        return bArr;
    }

    public static String c(String str) throws Throwable {
        a aVar = null;
        try {
            try {
                File file = new File(str);
                byte[] bArr = new byte[Math.max((int) ((file.length() * 1.4d) + 1.0d), 40)];
                a aVar2 = new a(new BufferedInputStream(new FileInputStream(file)), 1);
                int i8 = 0;
                while (true) {
                    try {
                        int i9 = aVar2.read(bArr, i8, 4096);
                        if (i9 < 0) {
                            break;
                        }
                        i8 += i9;
                    } catch (IOException e8) {
                        aVar = aVar2;
                        throw e8;
                    } catch (Throwable th) {
                        th = th;
                        aVar = aVar2;
                        try {
                            aVar.close();
                        } catch (Exception unused) {
                        }
                        throw th;
                    }
                }
                String str2 = new String(bArr, 0, i8, f4058m);
                try {
                    aVar2.close();
                } catch (Exception unused2) {
                }
                return str2;
            } catch (IOException e9) {
                throw e9;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void c(String str, String str2) throws Throwable {
        byte[] bArrB = b(str);
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(str2));
                try {
                    bufferedOutputStream2.write(bArrB);
                    try {
                        bufferedOutputStream2.close();
                    } catch (Exception unused) {
                    }
                } catch (IOException e8) {
                    bufferedOutputStream = bufferedOutputStream2;
                    throw e8;
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    try {
                        bufferedOutputStream.close();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
            } catch (IOException e9) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] c(int i8) {
        return (i8 & 16) == 16 ? f4064s : (i8 & 32) == 32 ? f4066u : f4062q;
    }

    public static byte[] c(byte[] bArr) {
        return c(bArr, 0, bArr.length, 0);
    }

    public static byte[] c(byte[] bArr, int i8, int i9, int i10) throws IOException {
        int i11;
        if (bArr == null) {
            throw new NullPointerException("Cannot decode null source array.");
        }
        if (i8 < 0 || (i11 = i8 + i9) > bArr.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and process %d bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i8), Integer.valueOf(i9)));
        }
        if (i9 == 0) {
            return new byte[0];
        }
        if (i9 < 4) {
            throw new IllegalArgumentException("Base64-encoded string must have at least four characters, but length specified was " + i9);
        }
        byte[] bArrC = c(i10);
        byte[] bArr2 = new byte[(i9 * 3) / 4];
        byte[] bArr3 = new byte[4];
        int i12 = 0;
        int iB = 0;
        while (i8 < i11) {
            byte b8 = bArr[i8];
            byte b9 = bArrC[b8 & f4060o];
            if (b9 < -5) {
                throw new IOException(String.format("Bad Base64 input character decimal %d in array position %d", Integer.valueOf(bArr[i8] & f4060o), Integer.valueOf(i8)));
            }
            if (b9 >= -1) {
                int i13 = i12 + 1;
                bArr3[i12] = b8;
                if (i13 > 3) {
                    iB += b(bArr3, 0, bArr2, iB, i10);
                    if (bArr[i8] == 61) {
                        break;
                    }
                    i12 = 0;
                } else {
                    i12 = i13;
                }
            }
            i8++;
        }
        byte[] bArr4 = new byte[iB];
        System.arraycopy(bArr2, 0, bArr4, 0, iB);
        return bArr4;
    }
}
