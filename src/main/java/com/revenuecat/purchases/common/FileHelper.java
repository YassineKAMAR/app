package com.revenuecat.purchases.common;

import android.content.Context;
import com.revenuecat.purchases.common.FileHelper;
import com.revenuecat.purchases.utils.FileExtensionsKt;
import e6.i0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Consumer;
import java.util.stream.Stream;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
public final class FileHelper {
    private final Context applicationContext;

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.FileHelper$readFilePerLines$1, reason: invalid class name */
    static final class AnonymousClass1 extends r implements l<BufferedReader, i0> {
        final /* synthetic */ l<Stream<String>, i0> $streamBlock;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(l<? super Stream<String>, i0> lVar) {
            super(1);
            this.$streamBlock = lVar;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(BufferedReader bufferedReader) {
            invoke2(bufferedReader);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(BufferedReader bufferedReader) {
            q.f(bufferedReader, "bufferedReader");
            l<Stream<String>, i0> lVar = this.$streamBlock;
            Stream<String> streamLines = bufferedReader.lines();
            q.e(streamLines, "bufferedReader.lines()");
            lVar.invoke(streamLines);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.FileHelper$removeFirstLinesFromFile$1, reason: invalid class name and case insensitive filesystem */
    static final class C02431 extends r implements l<Stream<String>, i0> {
        final /* synthetic */ int $numberOfLinesToRemove;
        final /* synthetic */ StringBuilder $textToAppend;

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.FileHelper$removeFirstLinesFromFile$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00881 extends r implements l<String, i0> {
            final /* synthetic */ StringBuilder $textToAppend;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00881(StringBuilder sb) {
                super(1);
                this.$textToAppend = sb;
            }

            @Override // p6.l
            public /* bridge */ /* synthetic */ i0 invoke(String str) {
                invoke2(str);
                return i0.f21430a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
                StringBuilder sb = this.$textToAppend;
                sb.append(str);
                sb.append("\n");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02431(int i8, StringBuilder sb) {
            super(1);
            this.$numberOfLinesToRemove = i8;
            this.$textToAppend = sb;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(l tmp0, Object obj) {
            q.f(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(Stream<String> stream) {
            invoke2(stream);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Stream<String> stream) {
            q.f(stream, "stream");
            Stream<String> streamSkip = stream.skip(this.$numberOfLinesToRemove);
            final C00881 c00881 = new C00881(this.$textToAppend);
            streamSkip.forEach(new Consumer() { // from class: com.revenuecat.purchases.common.d
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    FileHelper.C02431.invoke$lambda$0(c00881, obj);
                }
            });
        }
    }

    public FileHelper(Context applicationContext) {
        q.f(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
    }

    private final File getFileInFilesDir(String str) {
        return new File(getFilesDir(), str);
    }

    private final File getFilesDir() {
        File filesDir = this.applicationContext.getFilesDir();
        q.e(filesDir, "applicationContext.filesDir");
        return filesDir;
    }

    private final void openBufferedReader(String str, l<? super BufferedReader, i0> lVar) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(getFileInFilesDir(str));
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            try {
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                try {
                    lVar.invoke(bufferedReader);
                    i0 i0Var = i0.f21430a;
                    n6.b.a(bufferedReader, null);
                    n6.b.a(inputStreamReader, null);
                    n6.b.a(fileInputStream, null);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final void appendToFile(String filePath, String contentToAppend) throws IOException {
        q.f(filePath, "filePath");
        q.f(contentToAppend, "contentToAppend");
        File fileInFilesDir = getFileInFilesDir(filePath);
        File parentFile = fileInFilesDir.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(fileInFilesDir, true);
        try {
            byte[] bytes = contentToAppend.getBytes(w6.d.f27129b);
            q.e(bytes, "this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            i0 i0Var = i0.f21430a;
            n6.b.a(fileOutputStream, null);
        } finally {
        }
    }

    public final boolean deleteFile(String filePath) {
        q.f(filePath, "filePath");
        return getFileInFilesDir(filePath).delete();
    }

    public final boolean fileIsEmpty(String filePath) {
        q.f(filePath, "filePath");
        File fileInFilesDir = getFileInFilesDir(filePath);
        return !fileInFilesDir.exists() || fileInFilesDir.length() == 0;
    }

    public final double fileSizeInKB(String filePath) {
        q.f(filePath, "filePath");
        return FileExtensionsKt.getSizeInKB(getFileInFilesDir(filePath));
    }

    public final void readFilePerLines(String filePath, l<? super Stream<String>, i0> streamBlock) throws IOException {
        q.f(filePath, "filePath");
        q.f(streamBlock, "streamBlock");
        openBufferedReader(filePath, new AnonymousClass1(streamBlock));
    }

    public final void removeFirstLinesFromFile(String filePath, int i8) throws IOException {
        q.f(filePath, "filePath");
        StringBuilder sb = new StringBuilder();
        readFilePerLines(filePath, new C02431(i8, sb));
        deleteFile(filePath);
        String string = sb.toString();
        q.e(string, "textToAppend.toString()");
        appendToFile(filePath, string);
    }
}
