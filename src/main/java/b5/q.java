package b5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class q implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f3356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f3357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f3358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedList<k> f3359d = new LinkedList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<m> f3360e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set<m> f3361f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<Integer, m> f3362g = new HashMap();

    q(String str, int i8, int i9) {
        this.f3356a = str;
        this.f3357b = i8;
        this.f3358c = i9;
    }

    private synchronized k f(m mVar) {
        k next;
        m mVar2;
        ListIterator<k> listIterator = this.f3359d.listIterator();
        do {
            if (!listIterator.hasNext()) {
                return null;
            }
            next = listIterator.next();
            mVar2 = next.a() != null ? this.f3362g.get(next.a()) : null;
            if (mVar2 == null) {
                break;
            }
        } while (mVar2 != mVar);
        listIterator.remove();
        return next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public synchronized void g(m mVar) {
        HashSet hashSet = new HashSet(this.f3360e);
        this.f3361f.remove(mVar);
        this.f3360e.add(mVar);
        if (!mVar.b() && mVar.d() != null) {
            this.f3362g.remove(mVar.d());
        }
        i(mVar);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            i((m) it.next());
        }
    }

    private synchronized void i(m mVar) {
        k kVarF = f(mVar);
        if (kVarF != null) {
            this.f3361f.add(mVar);
            this.f3360e.remove(mVar);
            if (kVarF.a() != null) {
                this.f3362g.put(kVarF.a(), mVar);
            }
            mVar.e(kVarF);
        }
    }

    @Override // b5.o
    public /* synthetic */ void a(i iVar, Runnable runnable) {
        n.a(this, iVar, runnable);
    }

    @Override // b5.o
    public synchronized void b() {
        Iterator<m> it = this.f3360e.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
        Iterator<m> it2 = this.f3361f.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
    }

    @Override // b5.o
    public synchronized void c(k kVar) {
        this.f3359d.add(kVar);
        Iterator it = new HashSet(this.f3360e).iterator();
        while (it.hasNext()) {
            i((m) it.next());
        }
    }

    protected m e(String str, int i8) {
        return new m(str, i8);
    }

    @Override // b5.o
    public synchronized void start() {
        for (int i8 = 0; i8 < this.f3357b; i8++) {
            final m mVarE = e(this.f3356a + i8, this.f3358c);
            mVarE.g(new Runnable() { // from class: b5.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3354a.g(mVarE);
                }
            });
            this.f3360e.add(mVarE);
        }
    }
}
