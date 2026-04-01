package com.amazon.a.a.o.b;

import android.app.Application;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: loaded from: classes.dex */
public class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f3933a = new com.amazon.a.a.o.c("DataAuthenticationKeyLoaderV3");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f3934b = "AppstoreAuthenticationKey.pem";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f3935c = "-----BEGIN PUBLIC KEY-----";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f3936d = "-----END PUBLIC KEY-----";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f3937e = "RSA";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private Application f3938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c f3939g;

    private void a(PublicKey publicKey) {
        if (com.amazon.a.a.o.c.f3947a) {
            f3933a.a("Placing auth key into storage");
        }
        this.f3939g.a(com.amazon.a.a.m.c.f3744a, publicKey);
    }

    private PublicKey b() {
        if (com.amazon.a.a.o.c.f3947a) {
            f3933a.a("Checking KiwiDataStore for key...");
        }
        PublicKey publicKey = (PublicKey) this.f3939g.a(com.amazon.a.a.m.c.f3744a);
        if (com.amazon.a.a.o.c.f3947a) {
            com.amazon.a.a.o.c cVar = f3933a;
            StringBuilder sb = new StringBuilder();
            sb.append("Key was cached: ");
            sb.append(publicKey != null);
            cVar.a(sb.toString());
        }
        return publicKey;
    }

    private PublicKey c() throws Throwable {
        if (com.amazon.a.a.o.c.f3947a) {
            f3933a.a("Loading authentication key from apk...");
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(this.f3938f.getAssets().open(f3934b)));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line != null) {
                            sb.append(line);
                        } else {
                            try {
                                break;
                            } catch (IOException e8) {
                                if (com.amazon.a.a.o.c.f3947a) {
                                    f3933a.b("Failed to close stream", e8);
                                }
                            }
                        }
                    } catch (Exception e9) {
                        e = e9;
                        f3933a.b("Unable to load authentication Key", e);
                        throw com.amazon.a.a.o.b.a.a.d();
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e10) {
                                if (com.amazon.a.a.o.c.f3947a) {
                                    f3933a.b("Failed to close stream", e10);
                                }
                            }
                        }
                        throw th;
                    }
                }
                bufferedReader2.close();
                return a(sb.toString());
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.amazon.a.a.o.b.b
    public PublicKey a() throws Throwable {
        if (com.amazon.a.a.o.c.f3947a) {
            f3933a.a("Loading data authentication key...");
        }
        PublicKey publicKeyB = b();
        if (publicKeyB != null) {
            return publicKeyB;
        }
        PublicKey publicKeyC = c();
        a(publicKeyC);
        return publicKeyC;
    }

    public PublicKey a(String str) throws com.amazon.a.a.o.b.a.a {
        try {
            return KeyFactory.getInstance(f3937e).generatePublic(new X509EncodedKeySpec(com.amazon.c.a.a.c.a(str.replace(f3935c, "").replace(f3936d, ""))));
        } catch (Exception e8) {
            throw com.amazon.a.a.o.b.a.a.a((Throwable) e8);
        }
    }
}
