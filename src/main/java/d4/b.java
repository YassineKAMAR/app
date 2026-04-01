package d4;

import a3.o;
import android.content.Context;
import android.os.Bundle;
import c4.e;
import com.google.android.gms.internal.measurement.g2;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class b implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile a f20989c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o3.a f20990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Map<String, Object> f20991b;

    private b(o3.a aVar) {
        o.j(aVar);
        this.f20990a = aVar;
        this.f20991b = new ConcurrentHashMap();
    }

    public static a a(e eVar, Context context, m4.d dVar) {
        o.j(eVar);
        o.j(context);
        o.j(dVar);
        o.j(context.getApplicationContext());
        if (f20989c == null) {
            synchronized (b.class) {
                if (f20989c == null) {
                    Bundle bundle = new Bundle(1);
                    if (eVar.x()) {
                        dVar.b(c4.b.class, new Executor() { // from class: d4.c
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new m4.b() { // from class: d4.d
                            @Override // m4.b
                            public final void a(m4.a aVar) {
                                b.b(aVar);
                            }
                        });
                        bundle.putBoolean("dataCollectionDefaultEnabled", eVar.w());
                    }
                    f20989c = new b(g2.g(context, null, null, null, bundle).A());
                }
            }
        }
        return f20989c;
    }

    static /* synthetic */ void b(m4.a aVar) {
        boolean z7 = ((c4.b) aVar.a()).f3439a;
        synchronized (b.class) {
            ((b) o.j(f20989c)).f20990a.u(z7);
        }
    }
}
