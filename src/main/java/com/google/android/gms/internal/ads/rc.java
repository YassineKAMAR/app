package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class rc implements db {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qc f14039c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f14037a = new LinkedHashMap(16, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f14038b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f14040d = 5242880;

    public rc(qc qcVar, int i8) {
        this.f14039c = qcVar;
    }

    public rc(File file, int i8) {
        this.f14039c = new mc(this, file);
    }

    static int d(InputStream inputStream) {
        return (n(inputStream) << 24) | n(inputStream) | (n(inputStream) << 8) | (n(inputStream) << 16);
    }

    static long e(InputStream inputStream) {
        return (((long) n(inputStream)) & 255) | ((((long) n(inputStream)) & 255) << 8) | ((((long) n(inputStream)) & 255) << 16) | ((((long) n(inputStream)) & 255) << 24) | ((((long) n(inputStream)) & 255) << 32) | ((((long) n(inputStream)) & 255) << 40) | ((((long) n(inputStream)) & 255) << 48) | ((((long) n(inputStream)) & 255) << 56);
    }

    static String g(pc pcVar) {
        return new String(m(pcVar, e(pcVar)), "UTF-8");
    }

    static void i(OutputStream outputStream, int i8) throws IOException {
        outputStream.write(i8 & 255);
        outputStream.write((i8 >> 8) & 255);
        outputStream.write((i8 >> 16) & 255);
        outputStream.write((i8 >> 24) & 255);
    }

    static void j(OutputStream outputStream, long j8) throws IOException {
        outputStream.write((byte) j8);
        outputStream.write((byte) (j8 >>> 8));
        outputStream.write((byte) (j8 >>> 16));
        outputStream.write((byte) (j8 >>> 24));
        outputStream.write((byte) (j8 >>> 32));
        outputStream.write((byte) (j8 >>> 40));
        outputStream.write((byte) (j8 >>> 48));
        outputStream.write((byte) (j8 >>> 56));
    }

    static void l(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        j(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static byte[] m(pc pcVar, long j8) throws IOException {
        long jA = pcVar.a();
        if (j8 >= 0 && j8 <= jA) {
            int i8 = (int) j8;
            if (i8 == j8) {
                byte[] bArr = new byte[i8];
                new DataInputStream(pcVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j8 + ", maxLength=" + jA);
    }

    private static int n(InputStream inputStream) throws IOException {
        int i8 = inputStream.read();
        if (i8 != -1) {
            return i8;
        }
        throw new EOFException();
    }

    private final void o(String str, nc ncVar) {
        if (this.f14037a.containsKey(str)) {
            this.f14038b += ncVar.f11814a - ((nc) this.f14037a.get(str)).f11814a;
        } else {
            this.f14038b += ncVar.f11814a;
        }
        this.f14037a.put(str, ncVar);
    }

    private final void p(String str) {
        nc ncVar = (nc) this.f14037a.remove(str);
        if (ncVar != null) {
            this.f14038b -= ncVar.f11814a;
        }
    }

    private static final String q(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.db
    public final synchronized cb a(String str) {
        nc ncVar = (nc) this.f14037a.get(str);
        if (ncVar == null) {
            return null;
        }
        File fileF = f(str);
        try {
            pc pcVar = new pc(new BufferedInputStream(new FileInputStream(fileF)), fileF.length());
            try {
                nc ncVarA = nc.a(pcVar);
                if (!TextUtils.equals(str, ncVarA.f11815b)) {
                    gc.a("%s: key=%s, found=%s", fileF.getAbsolutePath(), str, ncVarA.f11815b);
                    p(str);
                    return null;
                }
                byte[] bArrM = m(pcVar, pcVar.a());
                cb cbVar = new cb();
                cbVar.f6263a = bArrM;
                cbVar.f6264b = ncVar.f11816c;
                cbVar.f6265c = ncVar.f11817d;
                cbVar.f6266d = ncVar.f11818e;
                cbVar.f6267e = ncVar.f11819f;
                cbVar.f6268f = ncVar.f11820g;
                List<lb> list = ncVar.f11821h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (lb lbVar : list) {
                    treeMap.put(lbVar.a(), lbVar.b());
                }
                cbVar.f6269g = treeMap;
                cbVar.f6270h = Collections.unmodifiableList(ncVar.f11821h);
                return cbVar;
            } finally {
                pcVar.close();
            }
        } catch (IOException e8) {
            gc.a("%s: %s", fileF.getAbsolutePath(), e8.toString());
            h(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.db
    public final synchronized void b(String str, cb cbVar) {
        BufferedOutputStream bufferedOutputStream;
        nc ncVar;
        long j8;
        long j9 = this.f14038b;
        int length = cbVar.f6263a.length;
        long j10 = j9 + ((long) length);
        int i8 = this.f14040d;
        if (j10 <= i8 || length <= i8 * 0.9f) {
            File fileF = f(str);
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileF));
                ncVar = new nc(str, cbVar);
            } catch (IOException unused) {
                if (!fileF.delete()) {
                    gc.a("Could not clean up file %s", fileF.getAbsolutePath());
                }
                if (!this.f14039c.j().exists()) {
                    gc.a("Re-initializing cache after external clearing.", new Object[0]);
                    this.f14037a.clear();
                    this.f14038b = 0L;
                    k();
                    return;
                }
            }
            try {
                i(bufferedOutputStream, 538247942);
                l(bufferedOutputStream, ncVar.f11815b);
                String str2 = ncVar.f11816c;
                if (str2 == null) {
                    str2 = "";
                }
                l(bufferedOutputStream, str2);
                j(bufferedOutputStream, ncVar.f11817d);
                j(bufferedOutputStream, ncVar.f11818e);
                j(bufferedOutputStream, ncVar.f11819f);
                j(bufferedOutputStream, ncVar.f11820g);
                List<lb> list = ncVar.f11821h;
                if (list != null) {
                    i(bufferedOutputStream, list.size());
                    for (lb lbVar : list) {
                        l(bufferedOutputStream, lbVar.a());
                        l(bufferedOutputStream, lbVar.b());
                    }
                } else {
                    i(bufferedOutputStream, 0);
                }
                bufferedOutputStream.flush();
                bufferedOutputStream.write(cbVar.f6263a);
                bufferedOutputStream.close();
                ncVar.f11814a = fileF.length();
                o(str, ncVar);
                if (this.f14038b >= this.f14040d) {
                    if (gc.f8287b) {
                        gc.d("Pruning old cache entries.", new Object[0]);
                    }
                    long j11 = this.f14038b;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    Iterator it = this.f14037a.entrySet().iterator();
                    int i9 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            j8 = jElapsedRealtime;
                            break;
                        }
                        nc ncVar2 = (nc) ((Map.Entry) it.next()).getValue();
                        if (f(ncVar2.f11815b).delete()) {
                            j8 = jElapsedRealtime;
                            this.f14038b -= ncVar2.f11814a;
                        } else {
                            j8 = jElapsedRealtime;
                            String str3 = ncVar2.f11815b;
                            gc.a("Could not delete cache entry for key=%s, filename=%s", str3, q(str3));
                        }
                        it.remove();
                        i9++;
                        if (this.f14038b < this.f14040d * 0.9f) {
                            break;
                        } else {
                            jElapsedRealtime = j8;
                        }
                    }
                    if (gc.f8287b) {
                        gc.d("pruned %d files, %d bytes, %d ms", Integer.valueOf(i9), Long.valueOf(this.f14038b - j11), Long.valueOf(SystemClock.elapsedRealtime() - j8));
                    }
                }
            } catch (IOException e8) {
                gc.a("%s", e8.toString());
                bufferedOutputStream.close();
                gc.a("Failed to write header for %s", fileF.getAbsolutePath());
                throw new IOException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.db
    public final synchronized void c(String str, boolean z7) {
        cb cbVarA = a(str);
        if (cbVarA != null) {
            cbVarA.f6268f = 0L;
            cbVarA.f6267e = 0L;
            b(str, cbVarA);
        }
    }

    public final File f(String str) {
        return new File(this.f14039c.j(), q(str));
    }

    public final synchronized void h(String str) {
        boolean zDelete = f(str).delete();
        p(str);
        if (zDelete) {
            return;
        }
        gc.a("Could not delete cache entry for key=%s, filename=%s", str, q(str));
    }

    @Override // com.google.android.gms.internal.ads.db
    public final synchronized void k() {
        long length;
        pc pcVar;
        File fileJ = this.f14039c.j();
        if (!fileJ.exists()) {
            if (fileJ.mkdirs()) {
                return;
            }
            gc.b("Unable to create cache dir %s", fileJ.getAbsolutePath());
            return;
        }
        File[] fileArrListFiles = fileJ.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                try {
                    length = file.length();
                    pcVar = new pc(new BufferedInputStream(new FileInputStream(file)), length);
                } catch (IOException unused) {
                    file.delete();
                }
                try {
                    nc ncVarA = nc.a(pcVar);
                    ncVarA.f11814a = length;
                    o(ncVarA.f11815b, ncVarA);
                    pcVar.close();
                } catch (Throwable th) {
                    pcVar.close();
                    throw th;
                }
            }
        }
    }
}
