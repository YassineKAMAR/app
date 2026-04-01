package d7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f21033a = new l();

    private l() {
    }

    private final <S> S a(String str, ClassLoader classLoader, Class<S> cls) throws ClassNotFoundException {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    private final <S> List<S> b(Class<S> cls, ClassLoader classLoader) {
        try {
            return d(cls, classLoader);
        } catch (Throwable unused) {
            return f6.w.U(ServiceLoader.load(cls, classLoader));
        }
    }

    private final List<String> e(URL url) throws IOException {
        BufferedReader bufferedReader;
        String string = url.toString();
        if (!w6.v.u(string, "jar", false, 2, null)) {
            bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List<String> listF = f21033a.f(bufferedReader);
                n6.b.a(bufferedReader, null);
                return listF;
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        }
        String strP0 = w6.w.p0(w6.w.k0(string, "jar:file:", null, 2, null), '!', null, 2, null);
        String strK0 = w6.w.k0(string, "!/", null, 2, null);
        JarFile jarFile = new JarFile(strP0, false);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(strK0)), "UTF-8"));
            try {
                List<String> listF2 = f21033a.f(bufferedReader);
                n6.b.a(bufferedReader, null);
                jarFile.close();
                return listF2;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    jarFile.close();
                    throw th3;
                } catch (Throwable th4) {
                    e6.f.a(th2, th4);
                    throw th2;
                }
            }
        }
    }

    private final List<String> f(BufferedReader bufferedReader) throws IOException {
        boolean z7;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return f6.w.U(linkedHashSet);
            }
            String string = w6.w.r0(w6.w.q0(line, "#", null, 2, null)).toString();
            int i8 = 0;
            while (true) {
                if (i8 >= string.length()) {
                    z7 = true;
                    break;
                }
                char cCharAt = string.charAt(i8);
                if (!(cCharAt == '.' || Character.isJavaIdentifierPart(cCharAt))) {
                    z7 = false;
                    break;
                }
                i8++;
            }
            if (!z7) {
                throw new IllegalArgumentException(("Illegal service provider class name: " + string).toString());
            }
            if (string.length() > 0) {
                linkedHashSet.add(string);
            }
        }
    }

    public final List<v> c() {
        v vVar;
        if (!m.a()) {
            return b(v.class, v.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            v vVar2 = null;
            try {
                vVar = (v) v.class.cast(Class.forName("z6.a", true, v.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                vVar = null;
            }
            if (vVar != null) {
                arrayList.add(vVar);
            }
            try {
                vVar2 = (v) v.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, v.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (vVar2 == null) {
                return arrayList;
            }
            arrayList.add(vVar2);
            return arrayList;
        } catch (Throwable unused3) {
            return b(v.class, v.class.getClassLoader());
        }
    }

    public final <S> List<S> d(Class<S> cls, ClassLoader classLoader) {
        ArrayList list = Collections.list(classLoader.getResources("META-INF/services/" + cls.getName()));
        kotlin.jvm.internal.q.e(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f6.t.p(arrayList, f21033a.e((URL) it.next()));
        }
        Set setY = f6.w.Y(arrayList);
        if (!(!setY.isEmpty())) {
            throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
        }
        ArrayList arrayList2 = new ArrayList(f6.p.m(setY, 10));
        Iterator it2 = setY.iterator();
        while (it2.hasNext()) {
            arrayList2.add(f21033a.a((String) it2.next(), classLoader, cls));
        }
        return arrayList2;
    }
}
