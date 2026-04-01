package a4;

import a4.e;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public final class d<T_WRAPPER extends a4.e<JcePrimitiveT>, JcePrimitiveT> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d<e.a, Cipher> f207b = new d<>(new e.a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d<e.C0005e, Mac> f208c = new d<>(new e.C0005e());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d<e.g, Signature> f209d = new d<>(new e.g());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d<e.f, MessageDigest> f210e = new d<>(new e.f());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d<e.b, KeyAgreement> f211f = new d<>(new e.b());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d<e.d, KeyPairGenerator> f212g = new d<>(new e.d());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d<e.c, KeyFactory> f213h = new d<>(new e.c());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e<JcePrimitiveT> f214a;

    private static class b<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a4.e<JcePrimitiveT> f215a;

        private b(a4.e<JcePrimitiveT> eVar) {
            this.f215a = eVar;
        }

        @Override // a4.d.e
        public JcePrimitiveT a(String str) {
            Iterator<Provider> it = d.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f215a.a(str, it.next());
                } catch (Exception e8) {
                    if (exc == null) {
                        exc = e8;
                    }
                }
            }
            return this.f215a.a(str, null);
        }
    }

    private static class c<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a4.e<JcePrimitiveT> f216a;

        private c(a4.e<JcePrimitiveT> eVar) {
            this.f216a = eVar;
        }

        @Override // a4.d.e
        public JcePrimitiveT a(String str) {
            return this.f216a.a(str, null);
        }
    }

    /* JADX INFO: renamed from: a4.d$d, reason: collision with other inner class name */
    private static class C0004d<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a4.e<JcePrimitiveT> f217a;

        private C0004d(a4.e<JcePrimitiveT> eVar) {
            this.f217a = eVar;
        }

        @Override // a4.d.e
        public JcePrimitiveT a(String str) throws GeneralSecurityException {
            Iterator<Provider> it = d.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f217a.a(str, it.next());
                } catch (Exception e8) {
                    if (exc == null) {
                        exc = e8;
                    }
                }
            }
            throw new GeneralSecurityException("No good Provider found.", exc);
        }
    }

    private interface e<JcePrimitiveT> {
        JcePrimitiveT a(String str);
    }

    public d(T_WRAPPER t_wrapper) {
        this.f214a = z3.b.c() ? new C0004d<>(t_wrapper) : h.a() ? new b<>(t_wrapper) : new c<>(t_wrapper);
    }

    public static List<Provider> b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public JcePrimitiveT a(String str) {
        return this.f214a.a(str);
    }
}
