package x0;

import android.os.Build;
import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import x0.u;

/* JADX INFO: loaded from: classes.dex */
public final class l extends u {

    public static final class a extends u.a<a, l> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f27225c.f21654d = OverwritingInputMerger.class.getName();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // x0.u.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public l c() {
            if (this.f27223a && Build.VERSION.SDK_INT >= 23 && this.f27225c.f21660j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new l(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // x0.u.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a d() {
            return this;
        }
    }

    l(a aVar) {
        super(aVar.f27224b, aVar.f27225c, aVar.f27226d);
    }

    public static l d(Class<? extends ListenableWorker> cls) {
        return new a(cls).b();
    }
}
