package androidx.work;

import androidx.work.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import x0.h;

/* JADX INFO: loaded from: classes.dex */
public final class OverwritingInputMerger extends h {
    @Override // x0.h
    public b b(List<b> list) {
        b.a aVar = new b.a();
        HashMap map = new HashMap();
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            map.putAll(it.next().h());
        }
        aVar.d(map);
        return aVar.a();
    }
}
