package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: androidx.profileinstaller.a$a, reason: collision with other inner class name */
    private static class C0037a {
        static File a(Context context) {
            return context.getCodeCacheDir();
        }
    }

    private static class b {
        static File a(Context context) {
            return context.createDeviceProtectedStorageContext().getCodeCacheDir();
        }
    }

    static boolean a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z7 = true;
        for (File file2 : fileArrListFiles) {
            z7 = a(file2) && z7;
        }
        return z7;
    }

    static void b(Context context, ProfileInstallReceiver.a aVar) {
        int i8 = Build.VERSION.SDK_INT;
        aVar.b(a(i8 >= 24 ? b.a(context) : i8 >= 23 ? C0037a.a(context) : context.getCacheDir()) ? 14 : 15, null);
    }
}
