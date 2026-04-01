package l0;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import androidx.core.os.j;
import e6.i0;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.q;
import y6.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f24338a = new b(null);

    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    private static final class a extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MeasurementManager f24339b;

        public a(MeasurementManager mMeasurementManager) {
            q.f(mMeasurementManager, "mMeasurementManager");
            this.f24339b = mMeasurementManager;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Context context) {
            q.f(context, "context");
            Object systemService = context.getSystemService((Class<Object>) MeasurementManager.class);
            q.e(systemService, "context.getSystemService…:class.java\n            )");
            this((MeasurementManager) systemService);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DeletionRequest k(l0.a aVar) {
            new DeletionRequest.Builder();
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WebSourceRegistrationRequest l(d dVar) {
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WebTriggerRegistrationRequest m(e eVar) {
            throw null;
        }

        @Override // l0.c
        public Object a(l0.a aVar, h6.d<? super i0> dVar) throws Throwable {
            k kVar = new k(i6.c.c(dVar), 1);
            kVar.x();
            this.f24339b.deleteRegistrations(k(aVar), new l0.b(), j.a(kVar));
            Object objU = kVar.u();
            if (objU == i6.d.e()) {
                h.c(dVar);
            }
            return objU == i6.d.e() ? objU : i0.f21430a;
        }

        @Override // l0.c
        public Object b(h6.d<? super Integer> dVar) throws Throwable {
            k kVar = new k(i6.c.c(dVar), 1);
            kVar.x();
            this.f24339b.getMeasurementApiStatus(new l0.b(), j.a(kVar));
            Object objU = kVar.u();
            if (objU == i6.d.e()) {
                h.c(dVar);
            }
            return objU;
        }

        @Override // l0.c
        public Object c(Uri uri, InputEvent inputEvent, h6.d<? super i0> dVar) throws Throwable {
            k kVar = new k(i6.c.c(dVar), 1);
            kVar.x();
            this.f24339b.registerSource(uri, inputEvent, new l0.b(), j.a(kVar));
            Object objU = kVar.u();
            if (objU == i6.d.e()) {
                h.c(dVar);
            }
            return objU == i6.d.e() ? objU : i0.f21430a;
        }

        @Override // l0.c
        public Object d(Uri uri, h6.d<? super i0> dVar) throws Throwable {
            k kVar = new k(i6.c.c(dVar), 1);
            kVar.x();
            this.f24339b.registerTrigger(uri, new l0.b(), j.a(kVar));
            Object objU = kVar.u();
            if (objU == i6.d.e()) {
                h.c(dVar);
            }
            return objU == i6.d.e() ? objU : i0.f21430a;
        }

        @Override // l0.c
        public Object e(d dVar, h6.d<? super i0> dVar2) throws Throwable {
            k kVar = new k(i6.c.c(dVar2), 1);
            kVar.x();
            this.f24339b.registerWebSource(l(dVar), new l0.b(), j.a(kVar));
            Object objU = kVar.u();
            if (objU == i6.d.e()) {
                h.c(dVar2);
            }
            return objU == i6.d.e() ? objU : i0.f21430a;
        }

        @Override // l0.c
        public Object f(e eVar, h6.d<? super i0> dVar) throws Throwable {
            k kVar = new k(i6.c.c(dVar), 1);
            kVar.x();
            this.f24339b.registerWebTrigger(m(eVar), new l0.b(), j.a(kVar));
            Object objU = kVar.u();
            if (objU == i6.d.e()) {
                h.c(dVar);
            }
            return objU == i6.d.e() ? objU : i0.f21430a;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.j jVar) {
            this();
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final c a(Context context) {
            q.f(context, "context");
            StringBuilder sb = new StringBuilder();
            sb.append("AdServicesInfo.version=");
            h0.a aVar = h0.a.f22134a;
            sb.append(aVar.a());
            Log.d("MeasurementManager", sb.toString());
            if (aVar.a() >= 5) {
                return new a(context);
            }
            return null;
        }
    }

    public abstract Object a(l0.a aVar, h6.d<? super i0> dVar);

    public abstract Object b(h6.d<? super Integer> dVar);

    public abstract Object c(Uri uri, InputEvent inputEvent, h6.d<? super i0> dVar);

    public abstract Object d(Uri uri, h6.d<? super i0> dVar);

    public abstract Object e(d dVar, h6.d<? super i0> dVar2);

    public abstract Object f(e eVar, h6.d<? super i0> dVar);
}
