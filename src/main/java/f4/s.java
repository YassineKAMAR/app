package f4;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class s extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<c<?>> f21771a;

    public s(List<c<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f21771a = list;
    }
}
