package n6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.internal.q;
import w6.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class j extends i {
    public static final File c(File file, File target, boolean z7, int i8) throws IOException {
        q.f(file, "<this>");
        q.f(target, "target");
        if (!file.exists()) {
            throw new k(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            if (!z7) {
                throw new d(file, target, "The destination file already exists.");
            }
            if (!target.delete()) {
                throw new d(file, target, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (!file.isDirectory()) {
            File parentFile = target.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(target);
                try {
                    a.a(fileInputStream, fileOutputStream, i8);
                    b.a(fileOutputStream, null);
                    b.a(fileInputStream, null);
                } finally {
                }
            } finally {
            }
        } else if (!target.mkdirs()) {
            throw new e(file, target, "Failed to create target directory.");
        }
        return target;
    }

    public static /* synthetic */ File d(File file, File file2, boolean z7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z7 = false;
        }
        if ((i9 & 4) != 0) {
            i8 = 8192;
        }
        return c(file, file2, z7, i8);
    }

    public static File e(String prefix, String str, File file) throws IOException {
        q.f(prefix, "prefix");
        File fileCreateTempFile = File.createTempFile(prefix, str, file);
        q.e(fileCreateTempFile, "createTempFile(prefix, suffix, directory)");
        return fileCreateTempFile;
    }

    public static final File f(File file, File relative) {
        q.f(file, "<this>");
        q.f(relative, "relative");
        if (g.b(relative)) {
            return relative;
        }
        String string = file.toString();
        q.e(string, "this.toString()");
        if ((string.length() == 0) || w.B(string, File.separatorChar, false, 2, null)) {
            return new File(string + relative);
        }
        return new File(string + File.separatorChar + relative);
    }

    public static File g(File file, String relative) {
        q.f(file, "<this>");
        q.f(relative, "relative");
        return f(file, new File(relative));
    }
}
