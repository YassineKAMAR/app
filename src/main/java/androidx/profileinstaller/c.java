package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.h;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AssetManager f2733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f2734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h.c f2735c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final File f2737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f2738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f2739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f2740h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private d[] f2742j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f2743k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2741i = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f2736d = d();

    public c(AssetManager assetManager, Executor executor, h.c cVar, String str, String str2, String str3, File file) {
        this.f2733a = assetManager;
        this.f2734b = executor;
        this.f2735c = cVar;
        this.f2738f = str;
        this.f2739g = str2;
        this.f2740h = str3;
        this.f2737e = file;
    }

    private c b(d[] dVarArr, byte[] bArr) {
        h.c cVar;
        int i8;
        InputStream inputStreamH;
        try {
            inputStreamH = h(this.f2733a, this.f2740h);
        } catch (FileNotFoundException e8) {
            e = e8;
            cVar = this.f2735c;
            i8 = 9;
            cVar.b(i8, e);
            return null;
        } catch (IOException e9) {
            e = e9;
            cVar = this.f2735c;
            i8 = 7;
            cVar.b(i8, e);
            return null;
        } catch (IllegalStateException e10) {
            e = e10;
            this.f2742j = null;
            cVar = this.f2735c;
            i8 = 8;
            cVar.b(i8, e);
            return null;
        }
        if (inputStreamH == null) {
            if (inputStreamH != null) {
                inputStreamH.close();
            }
            return null;
        }
        try {
            this.f2742j = m.q(inputStreamH, m.o(inputStreamH, m.f2771b), bArr, dVarArr);
            inputStreamH.close();
            return this;
        } finally {
        }
    }

    private void c() {
        if (!this.f2741i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 24 || i8 > 33) {
            return null;
        }
        switch (i8) {
            case 24:
            case 25:
                return o.f2786e;
            case 26:
                return o.f2785d;
            case 27:
                return o.f2784c;
            case 28:
            case 29:
            case 30:
                return o.f2783b;
            case 31:
            case com.amazon.c.a.a.c.f4053h /* 32 */:
            case 33:
                return o.f2782a;
            default:
                return null;
        }
    }

    private InputStream f(AssetManager assetManager) {
        h.c cVar;
        int i8;
        try {
            return h(assetManager, this.f2739g);
        } catch (FileNotFoundException e8) {
            e = e8;
            cVar = this.f2735c;
            i8 = 6;
            cVar.b(i8, e);
            return null;
        } catch (IOException e9) {
            e = e9;
            cVar = this.f2735c;
            i8 = 7;
            cVar.b(i8, e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(int i8, Object obj) {
        this.f2735c.b(i8, obj);
    }

    private InputStream h(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e8) {
            String message = e8.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f2735c.a(5, null);
            return null;
        }
    }

    private d[] j(InputStream inputStream) {
        try {
            try {
                try {
                    d[] dVarArrW = m.w(inputStream, m.o(inputStream, m.f2770a), this.f2738f);
                    try {
                        inputStream.close();
                        return dVarArrW;
                    } catch (IOException e8) {
                        this.f2735c.b(7, e8);
                        return dVarArrW;
                    }
                } catch (IOException e9) {
                    this.f2735c.b(7, e9);
                    inputStream.close();
                    return null;
                } catch (IllegalStateException e10) {
                    this.f2735c.b(8, e10);
                    inputStream.close();
                    return null;
                }
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException e11) {
                    this.f2735c.b(7, e11);
                }
                throw th;
            }
        } catch (IOException e12) {
            this.f2735c.b(7, e12);
        }
    }

    private static boolean k() {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 24 || i8 > 33) {
            return false;
        }
        if (i8 != 24 && i8 != 25) {
            switch (i8) {
                case 31:
                case com.amazon.c.a.a.c.f4053h /* 32 */:
                case 33:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    private void l(final int i8, final Object obj) {
        this.f2734b.execute(new Runnable() { // from class: androidx.profileinstaller.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f2730a.g(i8, obj);
            }
        });
    }

    public boolean e() {
        int i8;
        Integer numValueOf;
        if (this.f2736d == null) {
            i8 = 3;
            numValueOf = Integer.valueOf(Build.VERSION.SDK_INT);
        } else {
            if (this.f2737e.canWrite()) {
                this.f2741i = true;
                return true;
            }
            i8 = 4;
            numValueOf = null;
        }
        l(i8, numValueOf);
        return false;
    }

    public c i() {
        c cVarB;
        c();
        if (this.f2736d == null) {
            return this;
        }
        InputStream inputStreamF = f(this.f2733a);
        if (inputStreamF != null) {
            this.f2742j = j(inputStreamF);
        }
        d[] dVarArr = this.f2742j;
        return (dVarArr == null || !k() || (cVarB = b(dVarArr, this.f2736d)) == null) ? this : cVarB;
    }

    public c m() {
        h.c cVar;
        int i8;
        ByteArrayOutputStream byteArrayOutputStream;
        d[] dVarArr = this.f2742j;
        byte[] bArr = this.f2736d;
        if (dVarArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (IOException e8) {
                e = e8;
                cVar = this.f2735c;
                i8 = 7;
                cVar.b(i8, e);
            } catch (IllegalStateException e9) {
                e = e9;
                cVar = this.f2735c;
                i8 = 8;
                cVar.b(i8, e);
            }
            try {
                m.E(byteArrayOutputStream, bArr);
                if (!m.B(byteArrayOutputStream, bArr, dVarArr)) {
                    this.f2735c.b(5, null);
                    this.f2742j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.f2743k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.f2742j = null;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return this;
    }

    public boolean n() {
        byte[] bArr = this.f2743k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f2737e);
                    try {
                        e.l(byteArrayInputStream, fileOutputStream);
                        l(1, null);
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        return true;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e8) {
                l(6, e8);
                return false;
            } catch (IOException e9) {
                l(7, e9);
                return false;
            }
        } finally {
            this.f2743k = null;
            this.f2742j = null;
        }
    }
}
