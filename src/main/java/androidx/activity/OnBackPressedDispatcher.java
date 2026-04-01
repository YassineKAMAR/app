package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.d;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayDeque<b> f320b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements g, androidx.activity.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.activity.a f323c;

        LifecycleOnBackPressedCancellable(d dVar, b bVar) {
            this.f321a = dVar;
            this.f322b = bVar;
            dVar.a(this);
        }

        @Override // androidx.lifecycle.g
        public void a(i iVar, d.a aVar) {
            if (aVar == d.a.ON_START) {
                this.f323c = OnBackPressedDispatcher.this.b(this.f322b);
                return;
            }
            if (aVar != d.a.ON_STOP) {
                if (aVar == d.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.activity.a aVar2 = this.f323c;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            }
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f321a.c(this);
            this.f322b.e(this);
            androidx.activity.a aVar = this.f323c;
            if (aVar != null) {
                aVar.cancel();
                this.f323c = null;
            }
        }
    }

    private class a implements androidx.activity.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f325a;

        a(b bVar) {
            this.f325a = bVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            OnBackPressedDispatcher.this.f320b.remove(this.f325a);
            this.f325a.e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f319a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    public void a(i iVar, b bVar) {
        d dVarA = iVar.a();
        if (dVarA.b() == d.b.DESTROYED) {
            return;
        }
        bVar.a(new LifecycleOnBackPressedCancellable(dVarA, bVar));
    }

    androidx.activity.a b(b bVar) {
        this.f320b.add(bVar);
        a aVar = new a(bVar);
        bVar.a(aVar);
        return aVar;
    }

    public void c() {
        Iterator<b> itDescendingIterator = this.f320b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            b next = itDescendingIterator.next();
            if (next.c()) {
                next.b();
                return;
            }
        }
        Runnable runnable = this.f319a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
