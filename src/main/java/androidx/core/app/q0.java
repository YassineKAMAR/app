package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    static class a {
        static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(q0 q0Var) {
            throw null;
        }

        static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    static RemoteInput a(q0 q0Var) {
        return a.b(q0Var);
    }

    static RemoteInput[] b(q0[] q0VarArr) {
        if (q0VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[q0VarArr.length];
        for (int i8 = 0; i8 < q0VarArr.length; i8++) {
            q0 q0Var = q0VarArr[i8];
            remoteInputArr[i8] = a(null);
        }
        return remoteInputArr;
    }
}
