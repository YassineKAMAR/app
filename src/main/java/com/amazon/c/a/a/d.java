package com.amazon.c.a.a;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f4086a = "Kiwi__Version__Obfuscator";

    private d() {
    }

    public static String a(String str) {
        b(str, "text");
        return c.a(a(str.getBytes()));
    }

    public static void a(String str, String str2) throws Throwable {
        BufferedWriter bufferedWriter;
        b(str, "text");
        b(str2, "file");
        String strA = c.a(a(str.getBytes()));
        BufferedWriter bufferedWriter2 = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(str2));
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(strA);
            bufferedWriter.flush();
            try {
                bufferedWriter.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static void a(String[] strArr) throws Throwable {
        if (strArr == null || strArr.length == 0) {
            System.out.println("Usage: com.amazon.mas.kiwi.util.KiwiVersionEncrypter <textToBeEncrypted> [<encryptToFileName>]");
        } else if (strArr.length > 1) {
            a(strArr[0], strArr[1]);
        } else {
            System.out.println(a(strArr[0]));
        }
    }

    private static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        byte[] bytes = f4086a.getBytes();
        int i8 = 0;
        for (int i9 = 0; i9 < bArr.length; i9++) {
            bArr2[i9] = (byte) (bArr[i9] ^ bytes[i8]);
            i8++;
            if (i8 >= bytes.length) {
                i8 = 0;
            }
        }
        return bArr2;
    }

    public static String b(String str) {
        b(str, "text");
        return new String(a(c.c(str.getBytes())), "UTF-8");
    }

    private static void b(String str, String str2) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("input '" + str2 + "' cannot be null or empty");
        }
    }

    public static String c(String str) throws Throwable {
        BufferedReader bufferedReader;
        b(str, "file");
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(str));
        } catch (Throwable th) {
            th = th;
        }
        try {
            String line = bufferedReader.readLine();
            try {
                bufferedReader.close();
            } catch (IOException unused) {
            }
            return new String(a(c.c(line.getBytes())), "UTF-8");
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }
}
