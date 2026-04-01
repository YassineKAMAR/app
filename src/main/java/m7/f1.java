package m7;

import java.util.Iterator;
import java.util.Map;
import l7.c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f1<Key, Value, Collection, Builder extends Map<Key, Value>> extends a<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i7.b<Key> f24915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i7.b<Value> f24916b;

    private f1(i7.b<Key> bVar, i7.b<Value> bVar2) {
        super(null);
        this.f24915a = bVar;
        this.f24916b = bVar2;
    }

    public /* synthetic */ f1(i7.b bVar, i7.b bVar2, kotlin.jvm.internal.j jVar) {
        this(bVar, bVar2);
    }

    @Override // i7.b, i7.j, i7.a
    public abstract k7.f getDescriptor();

    public final i7.b<Key> m() {
        return this.f24915a;
    }

    public final i7.b<Value> n() {
        return this.f24916b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void g(l7.c decoder, Builder builder, int i8, int i9) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        kotlin.jvm.internal.q.f(builder, "builder");
        if (!(i9 >= 0)) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
        t6.d dVarJ = t6.l.j(t6.l.k(0, i9 * 2), 2);
        int iA = dVarJ.a();
        int iE = dVarJ.e();
        int iG = dVarJ.g();
        if ((iG <= 0 || iA > iE) && (iG >= 0 || iE > iA)) {
            return;
        }
        while (true) {
            h(decoder, i8 + iA, builder, false);
            if (iA == iE) {
                return;
            } else {
                iA += iG;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void h(l7.c decoder, int i8, Builder builder, boolean z7) {
        int iS;
        kotlin.jvm.internal.q.f(decoder, "decoder");
        kotlin.jvm.internal.q.f(builder, "builder");
        Object objC = c.a.c(decoder, getDescriptor(), i8, this.f24915a, null, 8, null);
        if (z7) {
            iS = decoder.s(getDescriptor());
            if (!(iS == i8 + 1)) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i8 + ", returned index for value: " + iS).toString());
            }
        } else {
            iS = i8 + 1;
        }
        int i9 = iS;
        builder.put(objC, (!builder.containsKey(objC) || (this.f24916b.getDescriptor().e() instanceof k7.e)) ? c.a.c(decoder, getDescriptor(), i9, this.f24916b, null, 8, null) : decoder.C(getDescriptor(), i9, this.f24916b, f6.k0.f(builder, objC)));
    }

    @Override // i7.j
    public void serialize(l7.f encoder, Collection collection) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        int iE = e(collection);
        k7.f descriptor = getDescriptor();
        l7.d dVarY = encoder.y(descriptor, iE);
        Iterator<Map.Entry<? extends Key, ? extends Value>> itD = d(collection);
        int i8 = 0;
        while (itD.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = itD.next();
            Key key = next.getKey();
            Value value = next.getValue();
            int i9 = i8 + 1;
            dVarY.l(getDescriptor(), i8, m(), key);
            dVarY.l(getDescriptor(), i9, n(), value);
            i8 = i9 + 1;
        }
        dVarY.d(descriptor);
    }
}
