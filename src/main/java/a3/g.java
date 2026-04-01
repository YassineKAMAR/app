package a3;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import y2.a;
import y2.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class g<T extends IInterface> extends c<T> implements a.f {
    private final d F;
    private final Set<Scope> G;
    private final Account H;

    @Deprecated
    protected g(Context context, Looper looper, int i8, d dVar, f.a aVar, f.b bVar) {
        this(context, looper, i8, dVar, (z2.c) aVar, (z2.h) bVar);
    }

    protected g(Context context, Looper looper, int i8, d dVar, z2.c cVar, z2.h hVar) {
        this(context, looper, h.b(context), x2.e.m(), i8, dVar, (z2.c) o.j(cVar), (z2.h) o.j(hVar));
    }

    protected g(Context context, Looper looper, h hVar, x2.e eVar, int i8, d dVar, z2.c cVar, z2.h hVar2) {
        super(context, looper, hVar, eVar, i8, cVar == null ? null : new e0(cVar), hVar2 == null ? null : new f0(hVar2), dVar.h());
        this.F = dVar;
        this.H = dVar.a();
        this.G = k0(dVar.c());
    }

    private final Set<Scope> k0(Set<Scope> set) {
        Set<Scope> setJ0 = j0(set);
        Iterator<Scope> it = setJ0.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return setJ0;
    }

    @Override // a3.c
    protected final Set<Scope> C() {
        return this.G;
    }

    @Override // y2.a.f
    public Set<Scope> b() {
        return o() ? this.G : Collections.emptySet();
    }

    protected Set<Scope> j0(Set<Scope> set) {
        return set;
    }

    @Override // a3.c
    public final Account u() {
        return this.H;
    }

    @Override // a3.c
    protected final Executor w() {
        return null;
    }
}
