package n6;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
public class e extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f25154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f25155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f25156c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(File file, File file2, String str) {
        super(c.b(file, file2, str));
        q.f(file, "file");
        this.f25154a = file;
        this.f25155b = file2;
        this.f25156c = str;
    }
}
