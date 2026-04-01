package io.flutter.plugin.editing;

import io.flutter.embedding.engine.FlutterJNI;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FlutterJNI f22855a;

    public a(FlutterJNI flutterJNI) {
        this.f22855a = flutterJNI;
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0133 A[PHI: r2 r4 r6
  0x0133: PHI (r2v2 int) = (r2v1 int), (r2v4 int), (r2v6 int) binds: [B:58:0x00b9, B:80:0x010f, B:86:0x0132] A[DONT_GENERATE, DONT_INLINE]
  0x0133: PHI (r4v2 int) = (r4v1 int), (r4v4 int), (r4v6 int) binds: [B:58:0x00b9, B:80:0x010f, B:86:0x0132] A[DONT_GENERATE, DONT_INLINE]
  0x0133: PHI (r6v6 boolean) = (r6v5 boolean), (r6v5 boolean), (r6v9 boolean) binds: [B:58:0x00b9, B:80:0x010f, B:86:0x0132] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0137 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013f A[ADDED_TO_REGION, EDGE_INSN: B:99:0x013f->B:93:0x013f BREAK  A[LOOP:1: B:52:0x00a6->B:104:?], REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(java.lang.CharSequence r10, int r11) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.a.a(java.lang.CharSequence, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x014c A[ADDED_TO_REGION, EDGE_INSN: B:101:0x014c->B:94:0x014c BREAK  A[LOOP:2: B:63:0x00ce->B:104:?], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0140 A[PHI: r2 r4 r5
  0x0140: PHI (r2v6 int) = (r2v3 int), (r2v8 int), (r2v9 int) binds: [B:79:0x010f, B:81:0x011c, B:87:0x013f] A[DONT_GENERATE, DONT_INLINE]
  0x0140: PHI (r4v5 int) = (r4v3 int), (r4v7 int), (r4v8 int) binds: [B:79:0x010f, B:81:0x011c, B:87:0x013f] A[DONT_GENERATE, DONT_INLINE]
  0x0140: PHI (r5v9 boolean) = (r5v8 boolean), (r5v8 boolean), (r5v12 boolean) binds: [B:79:0x010f, B:81:0x011c, B:87:0x013f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0144 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int b(java.lang.CharSequence r9, int r10) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.a.b(java.lang.CharSequence, int):int");
    }

    public boolean c(int i8) {
        return this.f22855a.isCodePointEmoji(i8);
    }

    public boolean d(int i8) {
        return this.f22855a.isCodePointEmojiModifier(i8);
    }

    public boolean e(int i8) {
        return this.f22855a.isCodePointEmojiModifierBase(i8);
    }

    public boolean f(int i8) {
        return (48 <= i8 && i8 <= 57) || i8 == 35 || i8 == 42;
    }

    public boolean g(int i8) {
        return this.f22855a.isCodePointRegionalIndicator(i8);
    }

    public boolean h(int i8) {
        return 917536 <= i8 && i8 <= 917630;
    }

    public boolean i(int i8) {
        return this.f22855a.isCodePointVariantSelector(i8);
    }
}
