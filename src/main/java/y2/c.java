package y2;

import a3.o;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p.a<z2.b<?>, x2.b> f27427a;

    public c(p.a<z2.b<?>, x2.b> aVar) {
        this.f27427a = aVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z7 = true;
        for (z2.b<?> bVar : this.f27427a.keySet()) {
            x2.b bVar2 = (x2.b) o.j(this.f27427a.get(bVar));
            z7 &= !bVar2.u();
            String strB = bVar.b();
            String strValueOf = String.valueOf(bVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(strB).length() + 2 + strValueOf.length());
            sb.append(strB);
            sb.append(": ");
            sb.append(strValueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z7 ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
