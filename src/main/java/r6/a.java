package r6;

import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends c {
    @Override // r6.c
    public int b(int i8) {
        return d.e(f().nextInt(), i8);
    }

    @Override // r6.c
    public int c() {
        return f().nextInt();
    }

    @Override // r6.c
    public long d() {
        return f().nextLong();
    }

    public abstract Random f();
}
