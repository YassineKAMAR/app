package androidx.core.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public class g {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f2114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b[] f2115b;

        @Deprecated
        public a(int i8, b[] bVarArr) {
            this.f2114a = i8;
            this.f2115b = bVarArr;
        }

        static a a(int i8, b[] bVarArr) {
            return new a(i8, bVarArr);
        }

        public b[] b() {
            return this.f2115b;
        }

        public int c() {
            return this.f2114a;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f2116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f2117b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f2118c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f2119d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f2120e;

        @Deprecated
        public b(Uri uri, int i8, int i9, boolean z7, int i10) {
            this.f2116a = (Uri) androidx.core.util.f.b(uri);
            this.f2117b = i8;
            this.f2118c = i9;
            this.f2119d = z7;
            this.f2120e = i10;
        }

        static b a(Uri uri, int i8, int i9, boolean z7, int i10) {
            return new b(uri, i8, i9, z7, i10);
        }

        public int b() {
            return this.f2120e;
        }

        public int c() {
            return this.f2117b;
        }

        public Uri d() {
            return this.f2116a;
        }

        public int e() {
            return this.f2118c;
        }

        public boolean f() {
            return this.f2119d;
        }
    }

    public static class c {
        public void a(int i8) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(Context context, e eVar, int i8, boolean z7, int i9, Handler handler, c cVar) {
        androidx.core.provider.a aVar = new androidx.core.provider.a(cVar, handler);
        return z7 ? f.e(context, eVar, aVar, i8, i9) : f.d(context, eVar, i8, null, aVar);
    }
}
