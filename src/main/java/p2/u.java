package p2;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class u extends LinkedHashMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ v f25588a;

    u(v vVar) {
        this.f25588a = vVar;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        synchronized (this.f25588a) {
            int size = size();
            v vVar = this.f25588a;
            if (size <= vVar.f25589a) {
                return false;
            }
            vVar.f25594f.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
            return size() > this.f25588a.f25589a;
        }
    }
}
