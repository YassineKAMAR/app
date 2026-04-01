package t3;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.List;
import m3.j1;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f26487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26488b;

    /* JADX INFO: renamed from: t3.a$a, reason: collision with other inner class name */
    public static class C0175a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f26490b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f26492d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f26489a = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f26491c = 0;

        public C0175a(@RecentlyNonNull Context context) {
            this.f26490b = context.getApplicationContext();
        }

        @RecentlyNonNull
        public C0175a a(@RecentlyNonNull String str) {
            this.f26489a.add(str);
            return this;
        }

        @RecentlyNonNull
        public a b() {
            Context context = this.f26490b;
            List list = this.f26489a;
            boolean z7 = true;
            if (!j1.b() && !list.contains(j1.a(context)) && !this.f26492d) {
                z7 = false;
            }
            return new a(z7, this, null);
        }

        @RecentlyNonNull
        public C0175a c(int i8) {
            this.f26491c = i8;
            return this;
        }
    }

    /* synthetic */ a(boolean z7, C0175a c0175a, g gVar) {
        this.f26487a = z7;
        this.f26488b = c0175a.f26491c;
    }

    public int a() {
        return this.f26488b;
    }

    public boolean b() {
        return this.f26487a;
    }
}
