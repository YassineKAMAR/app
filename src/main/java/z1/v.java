package z1;

import com.google.android.gms.internal.ads.qg0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List f27656f = Arrays.asList("MA", "T", "PG", "G");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f27659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f27660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f27661e;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f27662a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f27663b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f27664c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f27665d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private b f27666e = b.DEFAULT;

        public v a() {
            return new v(this.f27662a, this.f27663b, this.f27664c, this.f27665d, this.f27666e, null);
        }

        public a b(String str) {
            if (str != null && !"".equals(str)) {
                if (!"G".equals(str) && !"PG".equals(str) && !"T".equals(str) && !"MA".equals(str)) {
                    qg0.g("Invalid value passed to setMaxAdContentRating: ".concat(str));
                }
                return this;
            }
            str = null;
            this.f27664c = str;
            return this;
        }

        public a c(int i8) {
            if (i8 == -1 || i8 == 0 || i8 == 1) {
                this.f27662a = i8;
            } else {
                qg0.g("Invalid value passed to setTagForChildDirectedTreatment: " + i8);
            }
            return this;
        }

        public a d(int i8) {
            if (i8 == -1 || i8 == 0 || i8 == 1) {
                this.f27663b = i8;
            } else {
                qg0.g("Invalid value passed to setTagForUnderAgeOfConsent: " + i8);
            }
            return this;
        }

        public a e(List<String> list) {
            this.f27665d.clear();
            if (list != null) {
                this.f27665d.addAll(list);
            }
            return this;
        }
    }

    public enum b {
        DEFAULT(0),
        ENABLED(1),
        DISABLED(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f27671a;

        b(int i8) {
            this.f27671a = i8;
        }

        public int a() {
            return this.f27671a;
        }
    }

    /* synthetic */ v(int i8, int i9, String str, List list, b bVar, h0 h0Var) {
        this.f27657a = i8;
        this.f27658b = i9;
        this.f27659c = str;
        this.f27660d = list;
        this.f27661e = bVar;
    }

    public String a() {
        String str = this.f27659c;
        return str == null ? "" : str;
    }

    public b b() {
        return this.f27661e;
    }

    public int c() {
        return this.f27657a;
    }

    public int d() {
        return this.f27658b;
    }

    public List<String> e() {
        return new ArrayList(this.f27660d);
    }

    public a f() {
        a aVar = new a();
        aVar.c(this.f27657a);
        aVar.d(this.f27658b);
        aVar.b(this.f27659c);
        aVar.e(this.f27660d);
        return aVar;
    }
}
