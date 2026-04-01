package g2;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.qg0;
import com.google.android.gms.internal.ads.vt2;

/* JADX INFO: loaded from: classes.dex */
final class m extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f21976a;

    m(s sVar) {
        this.f21976a = sVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        s sVar = this.f21976a;
        if (sVar.f21992g != null) {
            try {
                sVar.f21992g.a(vt2.d(1, null, null));
            } catch (RemoteException e8) {
                qg0.i("#007 Could not call remote method.", e8);
            }
        }
        s sVar2 = this.f21976a;
        if (sVar2.f21992g != null) {
            try {
                sVar2.f21992g.g(0);
            } catch (RemoteException e9) {
                qg0.i("#007 Could not call remote method.", e9);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.f21976a.z())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            s sVar = this.f21976a;
            if (sVar.f21992g != null) {
                try {
                    sVar.f21992g.a(vt2.d(3, null, null));
                } catch (RemoteException e8) {
                    qg0.i("#007 Could not call remote method.", e8);
                }
            }
            s sVar2 = this.f21976a;
            if (sVar2.f21992g != null) {
                try {
                    sVar2.f21992g.g(3);
                } catch (RemoteException e9) {
                    qg0.i("#007 Could not call remote method.", e9);
                }
            }
            this.f21976a.O5(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            s sVar3 = this.f21976a;
            if (sVar3.f21992g != null) {
                try {
                    sVar3.f21992g.a(vt2.d(1, null, null));
                } catch (RemoteException e10) {
                    qg0.i("#007 Could not call remote method.", e10);
                }
            }
            s sVar4 = this.f21976a;
            if (sVar4.f21992g != null) {
                try {
                    sVar4.f21992g.g(0);
                } catch (RemoteException e11) {
                    qg0.i("#007 Could not call remote method.", e11);
                }
            }
            this.f21976a.O5(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            s sVar5 = this.f21976a;
            if (sVar5.f21992g != null) {
                try {
                    sVar5.f21992g.r();
                } catch (RemoteException e12) {
                    qg0.i("#007 Could not call remote method.", e12);
                }
            }
            this.f21976a.O5(this.f21976a.c(str));
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        s sVar6 = this.f21976a;
        if (sVar6.f21992g != null) {
            try {
                sVar6.f21992g.l();
                this.f21976a.f21992g.o();
            } catch (RemoteException e13) {
                qg0.i("#007 Could not call remote method.", e13);
            }
        }
        s.X5(this.f21976a, s.U5(this.f21976a, str));
        return true;
    }
}
