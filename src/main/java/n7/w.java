package n7;

import k7.e;
import kotlin.jvm.internal.z;
import o7.b0;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements i7.b<v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f25222a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k7.f f25223b = k7.i.d("kotlinx.serialization.json.JsonPrimitive", e.i.f24258a, new k7.f[0], null, 8, null);

    private w() {
    }

    @Override // i7.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public v deserialize(l7.e decoder) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        h hVarJ = k.d(decoder).j();
        if (hVarJ instanceof v) {
            return (v) hVarJ;
        }
        throw b0.f(-1, "Unexpected JSON element, expected JsonPrimitive, had " + z.b(hVarJ.getClass()), hVarJ.toString());
    }

    @Override // i7.j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(l7.f encoder, v value) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        kotlin.jvm.internal.q.f(value, "value");
        k.h(encoder);
        if (value instanceof r) {
            encoder.q(s.f25211a, r.f25207c);
        } else {
            encoder.q(p.f25205a, (o) value);
        }
    }

    @Override // i7.b, i7.j, i7.a
    public k7.f getDescriptor() {
        return f25223b;
    }
}
