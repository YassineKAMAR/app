package x0;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<a> f27184a = new HashSet();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f27185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f27186b;

        a(Uri uri, boolean z7) {
            this.f27185a = uri;
            this.f27186b = z7;
        }

        public Uri a() {
            return this.f27185a;
        }

        public boolean b() {
            return this.f27186b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f27186b == aVar.f27186b && this.f27185a.equals(aVar.f27185a);
        }

        public int hashCode() {
            return (this.f27185a.hashCode() * 31) + (this.f27186b ? 1 : 0);
        }
    }

    public void a(Uri uri, boolean z7) {
        this.f27184a.add(new a(uri, z7));
    }

    public Set<a> b() {
        return this.f27184a;
    }

    public int c() {
        return this.f27184a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f27184a.equals(((c) obj).f27184a);
    }

    public int hashCode() {
        return this.f27184a.hashCode();
    }
}
