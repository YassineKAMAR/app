package n6;

import java.io.File;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(File file, File file2, String str) {
        super(file, file2, str);
        q.f(file, "file");
    }

    public /* synthetic */ k(File file, File file2, String str, int i8, kotlin.jvm.internal.j jVar) {
        this(file, (i8 & 2) != 0 ? null : file2, (i8 & 4) != 0 ? null : str);
    }
}
