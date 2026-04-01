package w6;

import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import w6.h;

/* JADX INFO: loaded from: classes2.dex */
final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Matcher f27148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f27149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f27150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<String> f27151d;

    public static final class a extends f6.b<String> {
        a() {
        }

        @Override // f6.a
        public int a() {
            return i.this.d().groupCount() + 1;
        }

        @Override // f6.a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return e((String) obj);
            }
            return false;
        }

        public /* bridge */ boolean e(String str) {
            return super.contains(str);
        }

        @Override // f6.b, java.util.List
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public String get(int i8) {
            String strGroup = i.this.d().group(i8);
            return strGroup == null ? "" : strGroup;
        }

        public /* bridge */ int i(String str) {
            return super.indexOf(str);
        }

        @Override // f6.b, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return i((String) obj);
            }
            return -1;
        }

        @Override // f6.b, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return n((String) obj);
            }
            return -1;
        }

        public /* bridge */ int n(String str) {
            return super.lastIndexOf(str);
        }
    }

    public static final class b extends f6.a<f> implements g {

        static final class a extends kotlin.jvm.internal.r implements p6.l<Integer, f> {
            a() {
                super(1);
            }

            public final f a(int i8) {
                return b.this.g(i8);
            }

            @Override // p6.l
            public /* bridge */ /* synthetic */ f invoke(Integer num) {
                return a(num.intValue());
            }
        }

        b() {
        }

        @Override // f6.a
        public int a() {
            return i.this.d().groupCount() + 1;
        }

        @Override // f6.a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof f) {
                return e((f) obj);
            }
            return false;
        }

        public /* bridge */ boolean e(f fVar) {
            return super.contains(fVar);
        }

        public f g(int i8) {
            t6.f fVarD = k.d(i.this.d(), i8);
            if (fVarD.v().intValue() < 0) {
                return null;
            }
            String strGroup = i.this.d().group(i8);
            kotlin.jvm.internal.q.e(strGroup, "matchResult.group(index)");
            return new f(strGroup, fVarD);
        }

        @Override // f6.a, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<f> iterator() {
            return v6.h.d(f6.w.u(f6.o.e(this)), new a()).iterator();
        }
    }

    public i(Matcher matcher, CharSequence input) {
        kotlin.jvm.internal.q.f(matcher, "matcher");
        kotlin.jvm.internal.q.f(input, "input");
        this.f27148a = matcher;
        this.f27149b = input;
        this.f27150c = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchResult d() {
        return this.f27148a;
    }

    @Override // w6.h
    public h.b a() {
        return h.a.a(this);
    }

    @Override // w6.h
    public List<String> b() {
        if (this.f27151d == null) {
            this.f27151d = new a();
        }
        List<String> list = this.f27151d;
        kotlin.jvm.internal.q.c(list);
        return list;
    }
}
