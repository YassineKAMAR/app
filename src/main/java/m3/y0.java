package m3;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class y0 implements q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f24848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t0 f24849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f24850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f24851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r2 f24852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r f24853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final g0 f24854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final t f24855h;

    y0(Application application, t0 t0Var, Handler handler, Executor executor, r2 r2Var, r rVar, g0 g0Var, t tVar) {
        this.f24848a = application;
        this.f24849b = t0Var;
        this.f24850c = handler;
        this.f24851d = executor;
        this.f24852e = r2Var;
        this.f24853f = rVar;
        this.f24854g = g0Var;
        this.f24855h = tVar;
    }

    private final void e(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            Log.d("UserMessagingPlatform", "Action[browser]: empty url.");
        }
        Uri uri = Uri.parse(strOptString);
        if (uri.getScheme() == null) {
            Log.d("UserMessagingPlatform", "Action[browser]: empty scheme: ".concat(String.valueOf(strOptString)));
        }
        try {
            this.f24849b.startActivity(new Intent("android.intent.action.VIEW", uri));
        } catch (ActivityNotFoundException e8) {
            Log.d("UserMessagingPlatform", "Action[browser]: can not open url: ".concat(String.valueOf(strOptString)), e8);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    @Override // m3.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.String r7, org.json.JSONObject r8) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.y0.a(java.lang.String, org.json.JSONObject):boolean");
    }

    final /* synthetic */ void b() {
        String strConcat;
        Application application = this.f24848a;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
            Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
            if (applicationIcon == null) {
                strConcat = null;
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strConcat = "data:image/png;base64,".concat(String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
            }
            jSONObject.put("app_icon", strConcat);
            jSONObject.put("stored_infos_map", this.f24855h.b());
        } catch (JSONException unused) {
        }
        this.f24854g.b().c("UMP_configureFormWithAppAssets", jSONObject.toString());
    }

    final void c(String str) {
        Log.d("UserMessagingPlatform", "Receive consent action: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        this.f24852e.b(uri.getQueryParameter("action"), uri.getQueryParameter("args"), this, this.f24853f);
    }

    final void d(int i8, String str, String str2) {
        this.f24854g.g(new t2(2, String.format(Locale.US, "WebResourceError(%d, %s): %s", Integer.valueOf(i8), str2, str)));
    }

    @Override // m3.q2
    public final Executor j() {
        final Handler handler = this.f24850c;
        return new Executor() { // from class: m3.w0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }
}
