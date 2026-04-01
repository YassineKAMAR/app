package z1;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.qg0;
import h2.v2;
import h2.w2;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final w2 f27620a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final v2 f27621a;

        public a() {
            v2 v2Var = new v2();
            this.f27621a = v2Var;
            v2Var.A("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        public a a(String str) {
            this.f27621a.y(str);
            return this;
        }

        public a b(Class<Object> cls, Bundle bundle) {
            this.f27621a.z(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.f27621a.B("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        public g c() {
            return new g(this);
        }

        public a d(String str) {
            a3.o.k(str, "Content URL must be non-null.");
            a3.o.g(str, "Content URL must be non-empty.");
            int length = str.length();
            a3.o.c(length <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
            this.f27621a.D(str);
            return this;
        }

        public a e(int i8) {
            this.f27621a.b(i8);
            return this;
        }

        public a f(List<String> list) {
            if (list == null) {
                qg0.g("neighboring content URLs list should not be null");
                return this;
            }
            this.f27621a.d(list);
            return this;
        }

        public a g(String str) {
            this.f27621a.f(str);
            return this;
        }

        @Deprecated
        public final a h(String str) {
            this.f27621a.A(str);
            return this;
        }

        @Deprecated
        public final a i(Date date) {
            this.f27621a.C(date);
            return this;
        }

        @Deprecated
        public final a j(int i8) {
            this.f27621a.a(i8);
            return this;
        }

        @Deprecated
        public final a k(boolean z7) {
            this.f27621a.c(z7);
            return this;
        }

        @Deprecated
        public final a l(boolean z7) {
            this.f27621a.g(z7);
            return this;
        }
    }

    protected g(a aVar) {
        this.f27620a = new w2(aVar.f27621a, null);
    }

    public final w2 a() {
        return this.f27620a;
    }
}
