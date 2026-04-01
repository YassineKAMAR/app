package com.amazon.a.a.o.c;

import com.amazon.a.a.o.c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c f3952a = new c("Serializer");

    public static <T> T a(String str) throws Throwable {
        ObjectInputStream objectInputStream;
        Object obj;
        InputStream inputStream = (T) null;
        if (str != null && str.length() != 0) {
            try {
                try {
                    try {
                        objectInputStream = new ObjectInputStream(new ByteArrayInputStream(com.amazon.c.a.a.c.c(str.getBytes())));
                    } catch (Exception e8) {
                        e = e8;
                        objectInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        com.amazon.a.a.o.a.a(inputStream);
                        throw th;
                    }
                    try {
                        obj = (T) objectInputStream.readObject();
                    } catch (Exception e9) {
                        e = e9;
                        obj = inputStream;
                        if (c.f3948b) {
                            f3952a.b("Could not read object from string: " + str, e);
                            obj = inputStream;
                        }
                    }
                    com.amazon.a.a.o.a.a(objectInputStream);
                    return (T) obj;
                } catch (IOException e10) {
                    if (c.f3948b) {
                        f3952a.b("Could not decode string", e10);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = (T) objectInputStream;
            }
        }
        return null;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0042: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:22:0x0042 */
    public static String a(Serializable serializable) throws Throwable {
        ObjectOutputStream objectOutputStream;
        OutputStream outputStream;
        OutputStream outputStream2 = null;
        if (serializable == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (IOException e8) {
                e = e8;
                objectOutputStream = null;
            } catch (Throwable th) {
                th = th;
                com.amazon.a.a.o.a.a(outputStream2);
                throw th;
            }
            try {
                objectOutputStream.writeObject(serializable);
                String strA = com.amazon.c.a.a.c.a(byteArrayOutputStream.toByteArray());
                com.amazon.a.a.o.a.a(objectOutputStream);
                return strA;
            } catch (IOException e9) {
                e = e9;
                if (c.f3948b) {
                    f3952a.b("Could not serialize object: " + serializable, e);
                }
                com.amazon.a.a.o.a.a(objectOutputStream);
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            outputStream2 = outputStream;
            com.amazon.a.a.o.a.a(outputStream2);
            throw th;
        }
    }
}
