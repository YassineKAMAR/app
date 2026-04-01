package n7;

import e6.c0;
import k7.e;
import kotlin.jvm.internal.z;
import o7.b0;
import w6.d0;

/* JADX INFO: loaded from: classes2.dex */
final class p implements i7.b<o> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f25205a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k7.f f25206b = k7.i.a("kotlinx.serialization.json.JsonLiteral", e.i.f24258a);

    private p() {
    }

    @Override // i7.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public o deserialize(l7.e decoder) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        h hVarJ = k.d(decoder).j();
        if (hVarJ instanceof o) {
            return (o) hVarJ;
        }
        throw b0.f(-1, "Unexpected JSON element, expected JsonLiteral, had " + z.b(hVarJ.getClass()), hVarJ.toString());
    }

    @Override // i7.j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(l7.f encoder, o value) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        kotlin.jvm.internal.q.f(value, "value");
        k.h(encoder);
        if (value.g()) {
            encoder.F(value.a());
            return;
        }
        Long lQ = i.q(value);
        if (lQ != null) {
            encoder.B(lQ.longValue());
            return;
        }
        c0 c0VarH = d0.h(value.a());
        if (c0VarH != null) {
            encoder.t(j7.a.v(c0.f21409b).getDescriptor()).B(c0VarH.h());
            return;
        }
        Double dH = i.h(value);
        if (dH != null) {
            encoder.h(dH.doubleValue());
            return;
        }
        Boolean boolE = i.e(value);
        if (boolE != null) {
            encoder.k(boolE.booleanValue());
        } else {
            encoder.F(value.a());
        }
    }

    @Override // i7.b, i7.j, i7.a
    public k7.f getDescriptor() {
        return f25206b;
    }
}
