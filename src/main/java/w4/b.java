package w4;

import com.google.firebase.components.ComponentRegistrar;
import f4.e;
import f4.h;
import f4.j;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b implements j {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object c(String str, f4.c cVar, e eVar) {
        try {
            c.b(str);
            return cVar.h().a(eVar);
        } finally {
            c.a();
        }
    }

    @Override // f4.j
    public List<f4.c<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final f4.c<?> cVarT : componentRegistrar.getComponents()) {
            final String strI = cVarT.i();
            if (strI != null) {
                cVarT = cVarT.t(new h() { // from class: w4.a
                    @Override // f4.h
                    public final Object a(e eVar) {
                        return b.c(strI, cVarT, eVar);
                    }
                });
            }
            arrayList.add(cVarT);
        }
        return arrayList;
    }
}
