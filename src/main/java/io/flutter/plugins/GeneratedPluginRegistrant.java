package io.flutter.plugins;

import androidx.annotation.Keep;
import b5.c0;
import com.revenuecat.purchases_flutter.PurchasesFlutterPlugin;
import e5.d;
import f5.c;
import g5.b;
import io.flutter.embedding.engine.a;
import io.flutter.plugins.firebase.core.i;
import io.flutter.plugins.googlemobileads.h0;
import io.flutter.plugins.webviewflutter.p6;
import v5.n;
import y5.j;
import z5.l;

/* JADX INFO: loaded from: classes.dex */
@Keep
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(a aVar) {
        try {
            aVar.q().h(new n());
        } catch (Exception e8) {
            b.c(TAG, "Error registering plugin firebase_analytics, io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin", e8);
        }
        try {
            aVar.q().h(new i());
        } catch (Exception e9) {
            b.c(TAG, "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin", e9);
        }
        try {
            aVar.q().h(new q7.a());
        } catch (Exception e10) {
            b.c(TAG, "Error registering plugin flutter_native_splash, net.jonhanson.flutter_native_splash.FlutterNativeSplashPlugin", e10);
        }
        try {
            aVar.q().h(new c());
        } catch (Exception e11) {
            b.c(TAG, "Error registering plugin flutter_vibrate, flutter.plugins.vibrate.VibratePlugin", e11);
        }
        try {
            aVar.q().h(new c6.a());
        } catch (Exception e12) {
            b.c(TAG, "Error registering plugin fluttertoast, io.github.ponnamkarthik.toast.fluttertoast.FlutterToastPlugin", e12);
        }
        try {
            aVar.q().h(new h0());
        } catch (Exception e13) {
            b.c(TAG, "Error registering plugin google_mobile_ads, io.flutter.plugins.googlemobileads.GoogleMobileAdsPlugin", e13);
        }
        try {
            aVar.q().h(new y4.a());
        } catch (Exception e14) {
            b.c(TAG, "Error registering plugin launch_review, com.iyaffle.launchreview.LaunchReviewPlugin", e14);
        }
        try {
            aVar.q().h(new j());
        } catch (Exception e15) {
            b.c(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e15);
        }
        try {
            aVar.q().h(new PurchasesFlutterPlugin());
        } catch (Exception e16) {
            b.c(TAG, "Error registering plugin purchases_flutter, com.revenuecat.purchases_flutter.PurchasesFlutterPlugin", e16);
        }
        try {
            aVar.q().h(new i1.a());
        } catch (Exception e17) {
            b.c(TAG, "Error registering plugin rive_common, app.rive.rive.RivePlugin", e17);
        }
        try {
            aVar.q().h(new d());
        } catch (Exception e18) {
            b.c(TAG, "Error registering plugin share_plus, dev.fluttercommunity.plus.share.SharePlusPlugin", e18);
        }
        try {
            aVar.q().h(new l());
        } catch (Exception e19) {
            b.c(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e19);
        }
        try {
            aVar.q().h(new s7.b());
        } catch (Exception e20) {
            b.c(TAG, "Error registering plugin soundpool, pl.ukaszapps.soundpool.SoundpoolPlugin", e20);
        }
        try {
            aVar.q().h(new c0());
        } catch (Exception e21) {
            b.c(TAG, "Error registering plugin sqflite, com.tekartik.sqflite.SqflitePlugin", e21);
        }
        try {
            aVar.q().h(new a6.j());
        } catch (Exception e22) {
            b.c(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e22);
        }
        try {
            aVar.q().h(new p6());
        } catch (Exception e23) {
            b.c(TAG, "Error registering plugin webview_flutter_android, io.flutter.plugins.webviewflutter.WebViewFlutterPlugin", e23);
        }
    }
}
