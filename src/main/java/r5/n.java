package r5;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.DisplayMetrics;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import s5.a;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f26049b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5.a<Object> f26050a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ConcurrentLinkedQueue<b> f26051a = new ConcurrentLinkedQueue<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f26052b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b f26053c;

        /* JADX INFO: renamed from: r5.n$a$a, reason: collision with other inner class name */
        class C0166a implements a.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f26054a;

            C0166a(b bVar) {
                this.f26054a = bVar;
            }

            @Override // s5.a.e
            public void a(Object obj) {
                a.this.f26051a.remove(this.f26054a);
                if (a.this.f26051a.isEmpty()) {
                    return;
                }
                g5.b.b("SettingsChannel", "The queue becomes empty after removing config generation " + String.valueOf(this.f26054a.f26057a));
            }
        }

        public static class b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f26056c = Integer.MIN_VALUE;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f26057a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final DisplayMetrics f26058b;

            public b(DisplayMetrics displayMetrics) {
                int i8 = f26056c;
                f26056c = i8 + 1;
                this.f26057a = i8;
                this.f26058b = displayMetrics;
            }
        }

        public a.e b(b bVar) {
            this.f26051a.add(bVar);
            b bVar2 = this.f26053c;
            this.f26053c = bVar;
            if (bVar2 == null) {
                return null;
            }
            return new C0166a(bVar2);
        }

        public b c(int i8) {
            b bVar;
            StringBuilder sb;
            String strValueOf;
            if (this.f26052b == null) {
                this.f26052b = this.f26051a.poll();
            }
            while (true) {
                bVar = this.f26052b;
                if (bVar == null || bVar.f26057a >= i8) {
                    break;
                }
                this.f26052b = this.f26051a.poll();
            }
            if (bVar == null) {
                sb = new StringBuilder();
                sb.append("Cannot find config with generation: ");
                sb.append(String.valueOf(i8));
                strValueOf = ", after exhausting the queue.";
            } else {
                if (bVar.f26057a == i8) {
                    return bVar;
                }
                sb = new StringBuilder();
                sb.append("Cannot find config with generation: ");
                sb.append(String.valueOf(i8));
                sb.append(", the oldest config is now: ");
                strValueOf = String.valueOf(this.f26052b.f26057a);
            }
            sb.append(strValueOf);
            g5.b.b("SettingsChannel", sb.toString());
            return null;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s5.a<Object> f26059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<String, Object> f26060b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private DisplayMetrics f26061c;

        b(s5.a<Object> aVar) {
            this.f26059a = aVar;
        }

        public void a() {
            g5.b.f("SettingsChannel", "Sending message: \ntextScaleFactor: " + this.f26060b.get("textScaleFactor") + "\nalwaysUse24HourFormat: " + this.f26060b.get("alwaysUse24HourFormat") + "\nplatformBrightness: " + this.f26060b.get("platformBrightness"));
            DisplayMetrics displayMetrics = this.f26061c;
            if (!n.c() || displayMetrics == null) {
                this.f26059a.c(this.f26060b);
                return;
            }
            a.b bVar = new a.b(displayMetrics);
            a.e<Object> eVarB = n.f26049b.b(bVar);
            this.f26060b.put("configurationId", Integer.valueOf(bVar.f26057a));
            this.f26059a.d(this.f26060b, eVarB);
        }

        public b b(boolean z7) {
            this.f26060b.put("brieflyShowPassword", Boolean.valueOf(z7));
            return this;
        }

        public b c(DisplayMetrics displayMetrics) {
            this.f26061c = displayMetrics;
            return this;
        }

        public b d(boolean z7) {
            this.f26060b.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z7));
            return this;
        }

        public b e(c cVar) {
            this.f26060b.put("platformBrightness", cVar.f26065a);
            return this;
        }

        public b f(float f8) {
            this.f26060b.put("textScaleFactor", Float.valueOf(f8));
            return this;
        }

        public b g(boolean z7) {
            this.f26060b.put("alwaysUse24HourFormat", Boolean.valueOf(z7));
            return this;
        }
    }

    public enum c {
        light("light"),
        dark("dark");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f26065a;

        c(String str) {
            this.f26065a = str;
        }
    }

    public n(h5.a aVar) {
        this.f26050a = new s5.a<>(aVar, "flutter/settings", s5.f.f26250a);
    }

    public static DisplayMetrics b(int i8) {
        a.b bVarC = f26049b.c(i8);
        if (bVarC == null) {
            return null;
        }
        return bVarC.f26058b;
    }

    @SuppressLint({"AnnotateVersionCheck"})
    public static boolean c() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public b d() {
        return new b(this.f26050a);
    }
}
