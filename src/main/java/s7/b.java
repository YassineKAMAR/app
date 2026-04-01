package s7;

import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import l5.a;
import s5.k;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements k.c, l5.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f26271c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f26272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<g> f26273b = new ArrayList();

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }
    }

    private final void b(Context context, s5.c cVar) {
        String[] list;
        Context applicationContext = context.getApplicationContext();
        q.e(applicationContext, "getApplicationContext(...)");
        this.f26272a = applicationContext;
        new k(cVar, "pl.ukaszapps/soundpool").e(this);
        Context context2 = this.f26272a;
        if (context2 == null) {
            q.t("application");
            context2 = null;
        }
        File cacheDir = context2.getCacheDir();
        if (cacheDir == null || (list = cacheDir.list(new FilenameFilter() { // from class: s7.a
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return b.c(file, str);
            }
        })) == null) {
            return;
        }
        q.c(list);
        for (String str : list) {
            new File(cacheDir, str).delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(File file, String str) {
        q.c(str);
        return new w6.j("sound(.*)pool").b(str);
    }

    @Override // l5.a
    public void onAttachedToEngine(a.b binding) {
        q.f(binding, "binding");
        Context contextA = binding.a();
        q.e(contextA, "getApplicationContext(...)");
        s5.c cVarB = binding.b();
        q.e(cVarB, "getBinaryMessenger(...)");
        b(contextA, cVarB);
    }

    @Override // l5.a
    public void onDetachedFromEngine(a.b binding) {
        q.f(binding, "binding");
        Iterator<T> it = this.f26273b.iterator();
        while (it.hasNext()) {
            ((g) it.next()).h();
        }
        this.f26273b.clear();
    }

    @Override // s5.k.c
    public void onMethodCall(s5.j call, k.d result) {
        int iValueOf;
        q.f(call, "call");
        q.f(result, "result");
        String str = call.f26252a;
        Context context = null;
        if (!q.b(str, "initSoundpool")) {
            if (!q.b(str, "dispose")) {
                Object obj = call.f26253b;
                q.d(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                Object obj2 = ((Map) obj).get("poolId");
                q.d(obj2, "null cannot be cast to non-null type kotlin.Int");
                this.f26273b.get(((Integer) obj2).intValue()).k(call, result);
                return;
            }
            Object obj3 = call.f26253b;
            q.d(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Int>");
            Object obj4 = ((Map) obj3).get("poolId");
            q.c(obj4);
            int iIntValue = ((Number) obj4).intValue();
            this.f26273b.get(iIntValue).h();
            this.f26273b.remove(iIntValue);
            result.a(null);
            return;
        }
        Object obj5 = call.f26253b;
        q.d(obj5, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Int>");
        Map map = (Map) obj5;
        Integer num = (Integer) map.get("streamType");
        Integer num2 = (Integer) map.get("maxStreams");
        int iIntValue2 = num2 != null ? num2.intValue() : 1;
        int i8 = 3;
        if (num != null && num.intValue() == 0) {
            i8 = 2;
        } else if (num != null && num.intValue() == 1) {
            i8 = 4;
        } else if (num == null || num.intValue() != 2) {
            i8 = (num != null && num.intValue() == 3) ? 5 : -1;
        }
        if (i8 > -1) {
            Context context2 = this.f26272a;
            if (context2 == null) {
                q.t("application");
            } else {
                context = context2;
            }
            g gVar = new g(context, iIntValue2, i8);
            int size = this.f26273b.size();
            this.f26273b.add(gVar);
            iValueOf = Integer.valueOf(size);
        } else {
            iValueOf = -1;
        }
        result.a(iValueOf);
    }
}
