package c4;

import a3.o;

/* JADX INFO: loaded from: classes.dex */
public class k extends Exception {
    @Deprecated
    protected k() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str) {
        super(str);
        o.g(str, "Detail message must not be empty");
    }
}
