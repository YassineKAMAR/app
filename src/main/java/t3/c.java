package t3;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes.dex */
public interface c {

    public interface a {
        void a(@RecentlyNonNull e eVar);
    }

    public interface b {
        void a();
    }

    /* JADX INFO: renamed from: t3.c$c, reason: collision with other inner class name */
    public enum EnumC0176c {
        UNKNOWN,
        NOT_REQUIRED,
        REQUIRED
    }

    void a(@RecentlyNonNull Activity activity, @RecentlyNonNull d dVar, @RecentlyNonNull b bVar, @RecentlyNonNull a aVar);

    int b();

    boolean c();

    void reset();
}
