package u6;

import e6.p;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f26742c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f26743d = new j(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f26744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f26745b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26746a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.f26747a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.f26748b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.f26749c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f26746a = iArr;
        }
    }

    public j(k kVar, i iVar) {
        String str;
        this.f26744a = kVar;
        this.f26745b = iVar;
        if ((kVar == null) == (iVar == null)) {
            return;
        }
        if (kVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + kVar + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final i a() {
        return this.f26745b;
    }

    public final k b() {
        return this.f26744a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f26744a == jVar.f26744a && q.b(this.f26745b, jVar.f26745b);
    }

    public int hashCode() {
        k kVar = this.f26744a;
        int iHashCode = (kVar == null ? 0 : kVar.hashCode()) * 31;
        i iVar = this.f26745b;
        return iHashCode + (iVar != null ? iVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb;
        String str;
        k kVar = this.f26744a;
        int i8 = kVar == null ? -1 : b.f26746a[kVar.ordinal()];
        if (i8 == -1) {
            return "*";
        }
        if (i8 == 1) {
            return String.valueOf(this.f26745b);
        }
        if (i8 == 2) {
            sb = new StringBuilder();
            str = "in ";
        } else {
            if (i8 != 3) {
                throw new p();
            }
            sb = new StringBuilder();
            str = "out ";
        }
        sb.append(str);
        sb.append(this.f26745b);
        return sb.toString();
    }
}
