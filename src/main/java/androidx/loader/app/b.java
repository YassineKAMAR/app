package androidx.loader.app;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.i;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
class b extends androidx.loader.app.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static boolean f2706c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f2707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0036b f2708b;

    public static class a<D> extends o<D> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f2709l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Bundle f2710m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private i f2711n;

        @Override // androidx.lifecycle.LiveData
        protected void e() {
            if (b.f2706c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        protected void f() {
            if (b.f2706c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void h(p<? super D> pVar) {
            super.h(pVar);
            this.f2711n = null;
        }

        @Override // androidx.lifecycle.o, androidx.lifecycle.LiveData
        public void i(D d8) {
            super.i(d8);
        }

        g0.a<D> j(boolean z7) {
            if (b.f2706c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            throw null;
        }

        public void k(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f2709l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f2710m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            throw null;
        }

        void l() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f2709l);
            sb.append(" : ");
            androidx.core.util.b.a(null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: androidx.loader.app.b$b, reason: collision with other inner class name */
    static class C0036b extends w {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final y.a f2712f = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private p.i<a> f2713d = new p.i<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f2714e = false;

        /* JADX INFO: renamed from: androidx.loader.app.b$b$a */
        static class a implements y.a {
            a() {
            }

            @Override // androidx.lifecycle.y.a
            public <T extends w> T a(Class<T> cls) {
                return new C0036b();
            }

            @Override // androidx.lifecycle.y.a
            public /* synthetic */ w b(Class cls, f0.a aVar) {
                return x.a(this, cls, aVar);
            }
        }

        C0036b() {
        }

        static C0036b f(z zVar) {
            return (C0036b) new y(zVar, f2712f).a(C0036b.class);
        }

        @Override // androidx.lifecycle.w
        protected void d() {
            super.d();
            int iR = this.f2713d.r();
            for (int i8 = 0; i8 < iR; i8++) {
                this.f2713d.s(i8).j(true);
            }
            this.f2713d.e();
        }

        public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f2713d.r() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i8 = 0; i8 < this.f2713d.r(); i8++) {
                    a aVarS = this.f2713d.s(i8);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f2713d.o(i8));
                    printWriter.print(": ");
                    printWriter.println(aVarS.toString());
                    aVarS.k(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void g() {
            int iR = this.f2713d.r();
            for (int i8 = 0; i8 < iR; i8++) {
                this.f2713d.s(i8).l();
            }
        }
    }

    b(i iVar, z zVar) {
        this.f2707a = iVar;
        this.f2708b = C0036b.f(zVar);
    }

    @Override // androidx.loader.app.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f2708b.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public void c() {
        this.f2708b.g();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        androidx.core.util.b.a(this.f2707a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
