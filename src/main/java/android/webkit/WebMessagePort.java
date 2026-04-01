package android.webkit;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class WebMessagePort {

    public /* synthetic */ class WebMessageCallback {
        static {
            throw new NoClassDefFoundError();
        }
    }

    static {
        throw new NoClassDefFoundError();
    }

    public abstract /* synthetic */ void close();

    public abstract /* synthetic */ void postMessage(WebMessage webMessage);

    public abstract /* synthetic */ void setWebMessageCallback(WebMessageCallback webMessageCallback);

    public abstract /* synthetic */ void setWebMessageCallback(WebMessageCallback webMessageCallback, Handler handler);
}
