package m3;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.webkit.WebSettings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.Executor;
import t3.c;

/* JADX INFO: loaded from: classes.dex */
final class h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f24712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f24713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f24714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f24715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t f24716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l0 f24717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w2 f24718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b f24719h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final r2 f24720i;

    h3(Application application, f fVar, Handler handler, Executor executor, t tVar, l0 l0Var, w2 w2Var, b bVar, r2 r2Var) {
        this.f24712a = application;
        this.f24713b = fVar;
        this.f24714c = handler;
        this.f24715d = executor;
        this.f24716e = tVar;
        this.f24717f = l0Var;
        this.f24718g = w2Var;
        this.f24719h = bVar;
        this.f24720i = r2Var;
    }

    private final i1 d(g1 g1Var) throws t2, IllegalAccessException, InvocationTargetException {
        String str;
        String str2;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent(this.f24712a));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            try {
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    String str3 = g1Var.f24688a;
                    if (str3 != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str3);
                    }
                    String str4 = g1Var.f24689b;
                    if (str4 != null) {
                        jsonWriter.name("adid");
                        jsonWriter.value(str4);
                    }
                    c1 c1Var = g1Var.f24690c;
                    if (c1Var != null) {
                        jsonWriter.name("device_info");
                        jsonWriter.beginObject();
                        int i8 = c1Var.f24633c;
                        if (i8 != 1) {
                            jsonWriter.name("os_type");
                            int i9 = i8 - 1;
                            if (i9 == 0) {
                                str2 = "UNKNOWN";
                            } else if (i9 == 1) {
                                str2 = "ANDROID";
                            }
                            jsonWriter.value(str2);
                        }
                        String str5 = c1Var.f24631a;
                        if (str5 != null) {
                            jsonWriter.name("model");
                            jsonWriter.value(str5);
                        }
                        Integer num = c1Var.f24632b;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    String str6 = g1Var.f24691d;
                    if (str6 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str6);
                    }
                    Boolean bool = g1Var.f24692e;
                    if (bool != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool.booleanValue());
                    }
                    Map map = g1Var.f24693f;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            jsonWriter.value((String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    e1 e1Var = g1Var.f24694g;
                    if (e1Var != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        Integer num2 = e1Var.f24653a;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        Integer num3 = e1Var.f24654b;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        Double d8 = e1Var.f24655c;
                        if (d8 != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d8);
                        }
                        List<d1> list = e1Var.f24656d;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (d1 d1Var : list) {
                                jsonWriter.beginObject();
                                Integer num4 = d1Var.f24643a;
                                if (num4 != null) {
                                    jsonWriter.name("top");
                                    jsonWriter.value(num4);
                                }
                                Integer num5 = d1Var.f24644b;
                                if (num5 != null) {
                                    jsonWriter.name("left");
                                    jsonWriter.value(num5);
                                }
                                Integer num6 = d1Var.f24645c;
                                if (num6 != null) {
                                    jsonWriter.name("right");
                                    jsonWriter.value(num6);
                                }
                                Integer num7 = d1Var.f24646d;
                                if (num7 != null) {
                                    jsonWriter.name("bottom");
                                    jsonWriter.value(num7);
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                    a1 a1Var = g1Var.f24695h;
                    if (a1Var != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        String str7 = a1Var.f24609a;
                        if (str7 != null) {
                            jsonWriter.name("package_name");
                            jsonWriter.value(str7);
                        }
                        String str8 = a1Var.f24610b;
                        if (str8 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str8);
                        }
                        String str9 = a1Var.f24611c;
                        if (str9 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str9);
                        }
                        jsonWriter.endObject();
                    }
                    f1 f1Var = g1Var.f24696i;
                    if (f1Var != null) {
                        jsonWriter.name("sdk_info");
                        jsonWriter.beginObject();
                        String str10 = f1Var.f24664a;
                        if (str10 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str10);
                        }
                        jsonWriter.endObject();
                    }
                    List list2 = g1Var.f24697j;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            int iOrdinal = ((b1) it.next()).ordinal();
                            if (iOrdinal == 0) {
                                str = "DEBUG_PARAM_UNKNOWN";
                            } else if (iOrdinal == 1) {
                                str = "ALWAYS_SHOW";
                            } else if (iOrdinal == 2) {
                                str = "GEO_OVERRIDE_EEA";
                            } else if (iOrdinal == 3) {
                                str = "GEO_OVERRIDE_NON_EEA";
                            } else if (iOrdinal == 4) {
                                str = "PREVIEWING_DEBUG_MESSAGES";
                            }
                            jsonWriter.value(str);
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        throw new IOException("Http error code - " + responseCode + ".\n" + new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
                    }
                    String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        i1 i1VarA = i1.a(new JsonReader(new StringReader(headerField)));
                        i1VarA.f24723a = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return i1VarA;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        JsonReader jsonReader = new JsonReader(bufferedReader);
                        try {
                            i1 i1VarA2 = i1.a(jsonReader);
                            jsonReader.close();
                            bufferedReader.close();
                            return i1VarA2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (SocketTimeoutException e8) {
            throw new t2(4, "The server timed out.", e8);
        } catch (IOException e9) {
            throw new t2(2, "Error making request.", e9);
        }
    }

    final /* synthetic */ void a(final c.b bVar, d dVar) {
        Handler handler = this.f24714c;
        bVar.getClass();
        handler.post(new Runnable() { // from class: m3.d3
            @Override // java.lang.Runnable
            public final void run() {
                bVar.a();
            }
        });
        if (dVar.f24639b != c.EnumC0176c.NOT_REQUIRED) {
            this.f24717f.c();
        }
    }

    final /* synthetic */ void b(Activity activity, t3.d dVar, final c.b bVar, final c.a aVar) throws IllegalAccessException, InvocationTargetException {
        try {
            t3.a aVarA = dVar.a();
            if (aVarA == null || !aVarA.b()) {
                Log.i("UserMessagingPlatform", "Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"" + j1.a(this.f24712a) + "\") to set this as a debug device.");
            }
            final d dVarA = new j3(this.f24719h, d(this.f24718g.d(activity, dVar))).a();
            this.f24716e.f(dVarA.f24638a);
            this.f24716e.g(dVarA.f24639b);
            this.f24717f.d(dVarA.f24640c);
            this.f24720i.a().execute(new Runnable() { // from class: m3.c3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f24635a.a(bVar, dVarA);
                }
            });
        } catch (RuntimeException e8) {
            final t2 t2Var = new t2(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e8))));
            this.f24714c.post(new Runnable() { // from class: m3.f3
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.a(t2Var.a());
                }
            });
        } catch (t2 e9) {
            this.f24714c.post(new Runnable() { // from class: m3.e3
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.a(e9.a());
                }
            });
        }
    }

    final void c(final Activity activity, final t3.d dVar, final c.b bVar, final c.a aVar) {
        this.f24715d.execute(new Runnable() { // from class: m3.g3
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, InvocationTargetException {
                this.f24699a.b(activity, dVar, bVar, aVar);
            }
        });
    }
}
