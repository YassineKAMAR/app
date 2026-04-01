package w6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class e implements v6.b<t6.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f27135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f27137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p6.p<CharSequence, Integer, e6.r<Integer, Integer>> f27138d;

    public static final class a implements Iterator<t6.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f27139a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f27140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f27141c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private t6.f f27142d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f27143e;

        a() {
            int iF = t6.l.f(e.this.f27136b, 0, e.this.f27135a.length());
            this.f27140b = iF;
            this.f27141c = iF;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void a() {
            /*
                r6 = this;
                int r0 = r6.f27141c
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f27139a = r1
                r0 = 0
                r6.f27142d = r0
                goto L99
            Lc:
                w6.e r0 = w6.e.this
                int r0 = w6.e.c(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f27143e
                int r0 = r0 + r3
                r6.f27143e = r0
                w6.e r4 = w6.e.this
                int r4 = w6.e.c(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f27141c
                w6.e r4 = w6.e.this
                java.lang.CharSequence r4 = w6.e.b(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                t6.f r0 = new t6.f
                int r1 = r6.f27140b
                w6.e r4 = w6.e.this
                java.lang.CharSequence r4 = w6.e.b(r4)
                int r4 = w6.m.E(r4)
                r0.<init>(r1, r4)
            L42:
                r6.f27142d = r0
            L44:
                r6.f27141c = r2
                goto L97
            L47:
                w6.e r0 = w6.e.this
                p6.p r0 = w6.e.a(r0)
                w6.e r4 = w6.e.this
                java.lang.CharSequence r4 = w6.e.b(r4)
                int r5 = r6.f27141c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                e6.r r0 = (e6.r) r0
                if (r0 != 0) goto L73
                t6.f r0 = new t6.f
                int r1 = r6.f27140b
                w6.e r4 = w6.e.this
                java.lang.CharSequence r4 = w6.e.b(r4)
                int r4 = w6.m.E(r4)
                r0.<init>(r1, r4)
                goto L42
            L73:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f27140b
                t6.f r4 = t6.j.k(r4, r2)
                r6.f27142d = r4
                int r2 = r2 + r0
                r6.f27140b = r2
                if (r0 != 0) goto L95
                r1 = 1
            L95:
                int r2 = r2 + r1
                goto L44
            L97:
                r6.f27139a = r3
            L99:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w6.e.a.a():void");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public t6.f next() {
            if (this.f27139a == -1) {
                a();
            }
            if (this.f27139a == 0) {
                throw new NoSuchElementException();
            }
            t6.f fVar = this.f27142d;
            kotlin.jvm.internal.q.d(fVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f27142d = null;
            this.f27139a = -1;
            return fVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f27139a == -1) {
                a();
            }
            return this.f27139a == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(CharSequence input, int i8, int i9, p6.p<? super CharSequence, ? super Integer, e6.r<Integer, Integer>> getNextMatch) {
        kotlin.jvm.internal.q.f(input, "input");
        kotlin.jvm.internal.q.f(getNextMatch, "getNextMatch");
        this.f27135a = input;
        this.f27136b = i8;
        this.f27137c = i9;
        this.f27138d = getNextMatch;
    }

    @Override // v6.b
    public Iterator<t6.f> iterator() {
        return new a();
    }
}
