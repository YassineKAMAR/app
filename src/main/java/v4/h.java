package v4;

import android.content.Context;
import f4.r;

/* JADX INFO: loaded from: classes.dex */
public class h {

    public interface a<T> {
        String a(T t7);
    }

    public static f4.c<?> b(String str, String str2) {
        return f4.c.l(f.a(str, str2), f.class);
    }

    public static f4.c<?> c(final String str, final a<Context> aVar) {
        return f4.c.m(f.class).b(r.i(Context.class)).e(new f4.h() { // from class: v4.g
            @Override // f4.h
            public final Object a(f4.e eVar) {
                return h.d(str, aVar, eVar);
            }
        }).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f d(String str, a aVar, f4.e eVar) {
        return f.a(str, aVar.a((Context) eVar.a(Context.class)));
    }
}
