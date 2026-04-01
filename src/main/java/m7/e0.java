package m7;

import java.lang.Enum;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class e0<T extends Enum<T>> implements i7.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T[] f24904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k7.f f24905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e6.k f24906c;

    static final class a extends kotlin.jvm.internal.r implements p6.a<k7.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e0<T> f24907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24908b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e0<T> e0Var, String str) {
            super(0);
            this.f24907a = e0Var;
            this.f24908b = str;
        }

        @Override // p6.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k7.f invoke() {
            k7.f fVar = ((e0) this.f24907a).f24905b;
            return fVar == null ? this.f24907a.c(this.f24908b) : fVar;
        }
    }

    public e0(String serialName, T[] values) {
        kotlin.jvm.internal.q.f(serialName, "serialName");
        kotlin.jvm.internal.q.f(values, "values");
        this.f24904a = values;
        this.f24906c = e6.m.b(new a(this, serialName));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k7.f c(String str) {
        d0 d0Var = new d0(str, this.f24904a.length);
        for (T t7 : this.f24904a) {
            r1.m(d0Var, t7.name(), false, 2, null);
        }
        return d0Var;
    }

    @Override // i7.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public T deserialize(l7.e decoder) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        int iH = decoder.H(getDescriptor());
        boolean z7 = false;
        if (iH >= 0 && iH < this.f24904a.length) {
            z7 = true;
        }
        if (z7) {
            return this.f24904a[iH];
        }
        throw new i7.i(iH + " is not among valid " + getDescriptor().a() + " enum values, values size is " + this.f24904a.length);
    }

    @Override // i7.j
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void serialize(l7.f encoder, T value) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        kotlin.jvm.internal.q.f(value, "value");
        int iX = f6.j.x(this.f24904a, value);
        if (iX != -1) {
            encoder.w(getDescriptor(), iX);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(value);
        sb.append(" is not a valid enum ");
        sb.append(getDescriptor().a());
        sb.append(", must be one of ");
        String string = Arrays.toString(this.f24904a);
        kotlin.jvm.internal.q.e(string, "toString(this)");
        sb.append(string);
        throw new i7.i(sb.toString());
    }

    @Override // i7.b, i7.j, i7.a
    public k7.f getDescriptor() {
        return (k7.f) this.f24906c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().a() + '>';
    }
}
