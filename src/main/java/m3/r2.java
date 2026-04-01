package m3;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f24808a;

    r2(Executor executor) {
        this.f24808a = executor;
    }

    public final Executor a() {
        return this.f24808a;
    }

    public final void b(final String str, final String str2, final q2... q2VarArr) {
        this.f24808a.execute(new Runnable() { // from class: m3.p2
            @Override // java.lang.Runnable
            public final void run() {
                String str3;
                final JSONObject jSONObject;
                String str4;
                Throwable e8;
                String str5 = str;
                String str6 = str2;
                q2[] q2VarArr2 = q2VarArr;
                if (!TextUtils.isEmpty(str5)) {
                    final String lowerCase = str5.toLowerCase();
                    if (TextUtils.isEmpty(str6)) {
                        jSONObject = new JSONObject();
                    } else {
                        try {
                            jSONObject = new JSONObject(str6);
                        } catch (JSONException unused) {
                            str3 = "Action[" + lowerCase + "]: failed to parse args: " + str6;
                        }
                    }
                    Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: " + jSONObject.toString());
                    for (final q2 q2Var : q2VarArr2) {
                        FutureTask futureTask = new FutureTask(new Callable() { // from class: m3.w1
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return Boolean.valueOf(q2Var.a(lowerCase, jSONObject));
                            }
                        });
                        q2Var.j().execute(futureTask);
                        try {
                        } catch (InterruptedException e9) {
                            e8 = e9;
                            str4 = "Thread interrupted for Action[" + lowerCase + "]: ";
                            Log.d("UserMessagingPlatform", str4, e8);
                        } catch (ExecutionException e10) {
                            str4 = "Failed to run Action[" + lowerCase + "]: ";
                            e8 = e10.getCause();
                            Log.d("UserMessagingPlatform", str4, e8);
                        }
                        if (((Boolean) futureTask.get()).booleanValue()) {
                            return;
                        }
                    }
                    return;
                }
                str3 = "Error on action: empty action name";
                Log.d("UserMessagingPlatform", str3);
            }
        });
    }
}
