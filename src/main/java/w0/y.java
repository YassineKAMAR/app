package w0;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<y> f27085c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27087b;

    public static class a extends y {
        a(String str, String str2) {
            super(str, str2);
        }
    }

    public static class b extends y {
        b(String str, String str2) {
            super(str, str2);
        }
    }

    y(String str, String str2) {
        this.f27086a = str;
        this.f27087b = str2;
        f27085c.add(this);
    }
}
