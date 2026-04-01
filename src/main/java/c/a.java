package c;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<b> f3399a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Context f3400b;

    public void a() {
        this.f3400b = null;
    }

    public void b(Context context) {
        this.f3400b = context;
        Iterator<b> it = this.f3399a.iterator();
        while (it.hasNext()) {
            it.next().a(context);
        }
    }
}
