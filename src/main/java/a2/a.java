package a2;

import android.text.TextUtils;
import java.util.List;
import z1.g;

/* JADX INFO: loaded from: classes.dex */
public final class a extends z1.g {

    /* JADX INFO: renamed from: a2.a$a, reason: collision with other inner class name */
    public static final class C0000a extends g.a {
        public C0000a m(String str, String str2) {
            this.f27621a.x(str, str2);
            return this;
        }

        public C0000a n(String str, List<String> list) {
            if (list != null) {
                this.f27621a.x(str, TextUtils.join(com.amazon.a.a.o.b.f.f3942a, list));
            }
            return this;
        }

        @Override // z1.g.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public a c() {
            return new a(this, null);
        }

        public C0000a p(String str) {
            this.f27621a.e(str);
            return this;
        }
    }

    /* synthetic */ a(C0000a c0000a, f fVar) {
        super(c0000a);
    }
}
