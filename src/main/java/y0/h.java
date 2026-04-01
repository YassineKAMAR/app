package y0;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f27370a = x0.j.f("WrkDbPathHelper");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f27371b = {"-journal", "-shm", "-wal"};

    public static File a(Context context) {
        return Build.VERSION.SDK_INT < 23 ? b(context) : c(context, "androidx.work.workdb");
    }

    public static File b(Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }

    private static File c(Context context, String str) {
        return new File(context.getNoBackupFilesDir(), str);
    }

    public static String d() {
        return "androidx.work.workdb";
    }

    public static void e(Context context) {
        File fileB = b(context);
        if (Build.VERSION.SDK_INT < 23 || !fileB.exists()) {
            return;
        }
        x0.j.c().a(f27370a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
        Map<File, File> mapF = f(context);
        for (File file : mapF.keySet()) {
            File file2 = mapF.get(file);
            if (file.exists() && file2 != null) {
                if (file2.exists()) {
                    x0.j.c().h(f27370a, String.format("Over-writing contents of %s", file2), new Throwable[0]);
                }
                x0.j.c().a(f27370a, file.renameTo(file2) ? String.format("Migrated %s to %s", file, file2) : String.format("Renaming %s to %s failed", file, file2), new Throwable[0]);
            }
        }
    }

    public static Map<File, File> f(Context context) {
        HashMap map = new HashMap();
        if (Build.VERSION.SDK_INT >= 23) {
            File fileB = b(context);
            File fileA = a(context);
            map.put(fileB, fileA);
            for (String str : f27371b) {
                map.put(new File(fileB.getPath() + str), new File(fileA.getPath() + str));
            }
        }
        return map;
    }
}
