package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class wi extends ak {
    public wi(ii iiVar, String str, String str2, ce ceVar, int i8, int i9) {
        super(iiVar, "Q+fOnDUQnIPH75lusFutOgWOI4DeJ6z7X13oo1pZ5m19Kfyi56UOJglWSBqO3AzA", "Hu+f/NX/SE2ncwqgjWboivCw8sh0xmVI9uGBmdlJpc4=", ceVar, i8, 49);
    }

    @Override // com.google.android.gms.internal.ads.ak
    protected final void a() throws InvocationTargetException {
        this.f5296e.V(3);
        try {
            int i8 = 1;
            boolean zBooleanValue = ((Boolean) this.f5297f.invoke(null, this.f5293b.b())).booleanValue();
            ce ceVar = this.f5296e;
            if (true == zBooleanValue) {
                i8 = 2;
            }
            ceVar.V(i8);
        } catch (InvocationTargetException e8) {
            if (!(e8.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e8;
            }
        }
    }
}
