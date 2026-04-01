package x0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f27195a = j.f("InputMerger");

    public static h a(String str) {
        try {
            return (h) Class.forName(str).newInstance();
        } catch (Exception e8) {
            j.c().b(f27195a, "Trouble instantiating + " + str, e8);
            return null;
        }
    }

    public abstract androidx.work.b b(List<androidx.work.b> list);
}
