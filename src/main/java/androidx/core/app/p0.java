package androidx.core.app;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.app.Person;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    CharSequence f1918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    IconCompat f1919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f1920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f1921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f1922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f1923f;

    static class a {
        static p0 a(Person person) {
            return new b().f(person.getName()).c(person.getIcon() != null ? IconCompat.a(person.getIcon()) : null).g(person.getUri()).e(person.getKey()).b(person.isBot()).d(person.isImportant()).a();
        }

        static Person b(p0 p0Var) {
            return new Object() { // from class: android.app.Person.Builder
                static {
                    throw new NoClassDefFoundError();
                }

                @NonNull
                public native /* synthetic */ Person build();

                @NonNull
                public native /* synthetic */ Builder setBot(boolean z7);

                @NonNull
                public native /* synthetic */ Builder setIcon(@Nullable Icon icon);

                @NonNull
                public native /* synthetic */ Builder setImportant(boolean z7);

                @NonNull
                public native /* synthetic */ Builder setKey(@Nullable String str);

                @NonNull
                public native /* synthetic */ Builder setName(@Nullable CharSequence charSequence);

                @NonNull
                public native /* synthetic */ Builder setUri(@Nullable String str);
            }.setName(p0Var.c()).setIcon(p0Var.a() != null ? p0Var.a().o() : null).setUri(p0Var.d()).setKey(p0Var.b()).setBot(p0Var.e()).setImportant(p0Var.f()).build();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        CharSequence f1924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        IconCompat f1925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f1926c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f1927d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f1928e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f1929f;

        public p0 a() {
            return new p0(this);
        }

        public b b(boolean z7) {
            this.f1928e = z7;
            return this;
        }

        public b c(IconCompat iconCompat) {
            this.f1925b = iconCompat;
            return this;
        }

        public b d(boolean z7) {
            this.f1929f = z7;
            return this;
        }

        public b e(String str) {
            this.f1927d = str;
            return this;
        }

        public b f(CharSequence charSequence) {
            this.f1924a = charSequence;
            return this;
        }

        public b g(String str) {
            this.f1926c = str;
            return this;
        }
    }

    p0(b bVar) {
        this.f1918a = bVar.f1924a;
        this.f1919b = bVar.f1925b;
        this.f1920c = bVar.f1926c;
        this.f1921d = bVar.f1927d;
        this.f1922e = bVar.f1928e;
        this.f1923f = bVar.f1929f;
    }

    public IconCompat a() {
        return this.f1919b;
    }

    public String b() {
        return this.f1921d;
    }

    public CharSequence c() {
        return this.f1918a;
    }

    public String d() {
        return this.f1920c;
    }

    public boolean e() {
        return this.f1922e;
    }

    public boolean f() {
        return this.f1923f;
    }

    public String g() {
        String str = this.f1920c;
        if (str != null) {
            return str;
        }
        if (this.f1918a == null) {
            return "";
        }
        return "name:" + ((Object) this.f1918a);
    }

    public Person h() {
        return a.b(this);
    }
}
