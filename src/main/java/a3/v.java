package a3;

import android.os.Bundle;
import y2.a;

/* JADX INFO: loaded from: classes.dex */
public class v implements a.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f168c = c().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f169b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f170a;

        /* synthetic */ a(x xVar) {
        }

        public v a() {
            return new v(this.f170a, null);
        }
    }

    /* synthetic */ v(String str, y yVar) {
        this.f169b = str;
    }

    public static a c() {
        return new a(null);
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        String str = this.f169b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            return n.a(this.f169b, ((v) obj).f169b);
        }
        return false;
    }

    public final int hashCode() {
        return n.b(this.f169b);
    }
}
