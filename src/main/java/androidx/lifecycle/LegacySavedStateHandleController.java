package androidx.lifecycle;

import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.lifecycle.d;
import androidx.savedstate.a;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class LegacySavedStateHandleController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LegacySavedStateHandleController f2614a = new LegacySavedStateHandleController();

    public static final class a implements a.InterfaceC0042a {
        @Override // androidx.savedstate.a.InterfaceC0042a
        public void a(p0.d owner) {
            kotlin.jvm.internal.q.f(owner, "owner");
            if (!(owner instanceof a0)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
            }
            z zVarE = ((a0) owner).e();
            androidx.savedstate.a aVarU = owner.u();
            Iterator<String> it = zVarE.c().iterator();
            while (it.hasNext()) {
                w wVarB = zVarE.b(it.next());
                kotlin.jvm.internal.q.c(wVarB);
                LegacySavedStateHandleController.a(wVarB, aVarU, owner.a());
            }
            if (!zVarE.c().isEmpty()) {
                aVarU.h(a.class);
            }
        }
    }

    private LegacySavedStateHandleController() {
    }

    public static final void a(w viewModel, androidx.savedstate.a registry, d lifecycle) {
        kotlin.jvm.internal.q.f(viewModel, "viewModel");
        kotlin.jvm.internal.q.f(registry, "registry");
        kotlin.jvm.internal.q.f(lifecycle, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) viewModel.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.c()) {
            return;
        }
        savedStateHandleController.b(registry, lifecycle);
        f2614a.b(registry, lifecycle);
    }

    private final void b(final androidx.savedstate.a aVar, final d dVar) {
        d.b bVarB = dVar.b();
        if (bVarB == d.b.INITIALIZED || bVarB.c(d.b.STARTED)) {
            aVar.h(a.class);
        } else {
            dVar.a(new g() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.g
                public void a(i source, d.a event) {
                    kotlin.jvm.internal.q.f(source, "source");
                    kotlin.jvm.internal.q.f(event, "event");
                    if (event == d.a.ON_START) {
                        dVar.c(this);
                        aVar.h(LegacySavedStateHandleController.a.class);
                    }
                }
            });
        }
    }
}
