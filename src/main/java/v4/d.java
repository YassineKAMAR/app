package v4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile d f26942b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<f> f26943a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = f26942b;
        if (dVar == null) {
            synchronized (d.class) {
                dVar = f26942b;
                if (dVar == null) {
                    dVar = new d();
                    f26942b = dVar;
                }
            }
        }
        return dVar;
    }

    Set<f> b() {
        Set<f> setUnmodifiableSet;
        synchronized (this.f26943a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f26943a);
        }
        return setUnmodifiableSet;
    }
}
