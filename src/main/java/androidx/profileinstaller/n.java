package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.concurrent.futures.d<c> f2772a = androidx.concurrent.futures.d.A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f2773b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f2774c = null;

    private static class a {
        static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f2775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f2776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f2777c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f2778d;

        b(int i8, int i9, long j8, long j9) {
            this.f2775a = i8;
            this.f2776b = i9;
            this.f2777c = j8;
            this.f2778d = j9;
        }

        static b a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        void b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f2775a);
                dataOutputStream.writeInt(this.f2776b);
                dataOutputStream.writeLong(this.f2777c);
                dataOutputStream.writeLong(this.f2778d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f2776b == bVar.f2776b && this.f2777c == bVar.f2777c && this.f2775a == bVar.f2775a && this.f2778d == bVar.f2778d;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f2776b), Long.valueOf(this.f2777c), Integer.valueOf(this.f2775a), Long.valueOf(this.f2778d));
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f2779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f2780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f2781c;

        c(int i8, boolean z7, boolean z8) {
            this.f2779a = i8;
            this.f2781c = z8;
            this.f2780b = z7;
        }
    }

    private static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return (Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context) : packageManager.getPackageInfo(context.getPackageName(), 0)).lastUpdateTime;
    }

    private static c b(int i8, boolean z7, boolean z8) {
        c cVar = new c(i8, z7, z8);
        f2774c = cVar;
        f2772a.w(cVar);
        return f2774c;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static androidx.profileinstaller.n.c c(android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.n.c(android.content.Context, boolean):androidx.profileinstaller.n$c");
    }
}
