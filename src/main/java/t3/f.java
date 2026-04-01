package t3;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import m3.v0;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    public interface a {
        void a(@RecentlyNonNull e eVar);
    }

    public interface b {
        void b(@RecentlyNonNull t3.b bVar);
    }

    @RecentlyNonNull
    public static c a(@RecentlyNonNull Context context) {
        return v0.a(context).b();
    }

    public static void b(@RecentlyNonNull Context context, @RecentlyNonNull b bVar, @RecentlyNonNull a aVar) {
        v0.a(context).c().b(bVar, aVar);
    }
}
