package com.revenuecat.purchases.utils;

import com.revenuecat.purchases.common.FileHelper;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.utils.Event;
import com.revenuecat.purchases.utils.EventsFileHelper;
import e6.i0;
import java.util.function.Function;
import java.util.stream.BaseStream;
import java.util.stream.Stream;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.json.JSONObject;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
public class EventsFileHelper<T extends Event> {
    private final l<String, T> eventDeserializer;
    private final FileHelper fileHelper;
    private final String filePath;

    /* JADX INFO: renamed from: com.revenuecat.purchases.utils.EventsFileHelper$readFile$1, reason: invalid class name */
    static final class AnonymousClass1 extends r implements l<Stream<String>, i0> {
        final /* synthetic */ l<Stream<T>, i0> $streamBlock;
        final /* synthetic */ EventsFileHelper<T> this$0;

        /* JADX INFO: renamed from: com.revenuecat.purchases.utils.EventsFileHelper$readFile$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00971 extends r implements l<String, T> {
            final /* synthetic */ EventsFileHelper<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00971(EventsFileHelper<T> eventsFileHelper) {
                super(1);
                this.this$0 = eventsFileHelper;
            }

            @Override // p6.l
            public final T invoke(String line) {
                EventsFileHelper<T> eventsFileHelper = this.this$0;
                q.e(line, "line");
                return (T) eventsFileHelper.mapToEvent(line);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(l<? super Stream<T>, i0> lVar, EventsFileHelper<T> eventsFileHelper) {
            super(1);
            this.$streamBlock = lVar;
            this.this$0 = eventsFileHelper;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Event invoke$lambda$0(l tmp0, Object obj) {
            q.f(tmp0, "$tmp0");
            return (Event) tmp0.invoke(obj);
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(Stream<String> stream) {
            invoke2(stream);
            return i0.f21430a;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Stream<String> stream) {
            q.f(stream, "stream");
            l<Stream<T>, i0> lVar = this.$streamBlock;
            final C00971 c00971 = new C00971(this.this$0);
            BaseStream map = stream.map(new Function() { // from class: com.revenuecat.purchases.utils.a
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return EventsFileHelper.AnonymousClass1.invoke$lambda$0(c00971, obj);
                }
            });
            q.e(map, "@Synchronized\n    fun re…        }\n        }\n    }");
            lVar.invoke(map);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.utils.EventsFileHelper$readFileAsJson$1, reason: invalid class name and case insensitive filesystem */
    static final class C02951 extends r implements l<Stream<String>, i0> {
        final /* synthetic */ l<Stream<JSONObject>, i0> $streamBlock;

        /* JADX INFO: renamed from: com.revenuecat.purchases.utils.EventsFileHelper$readFileAsJson$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00981 extends r implements l<String, JSONObject> {
            public static final C00981 INSTANCE = new C00981();

            C00981() {
                super(1);
            }

            @Override // p6.l
            public final JSONObject invoke(String str) {
                return new JSONObject(str);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02951(l<? super Stream<JSONObject>, i0> lVar) {
            super(1);
            this.$streamBlock = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final JSONObject invoke$lambda$0(l tmp0, Object obj) {
            q.f(tmp0, "$tmp0");
            return (JSONObject) tmp0.invoke(obj);
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(Stream<String> stream) {
            invoke2(stream);
            return i0.f21430a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Stream<String> stream) {
            q.f(stream, "stream");
            l<Stream<JSONObject>, i0> lVar = this.$streamBlock;
            final C00981 c00981 = C00981.INSTANCE;
            BaseStream map = stream.map(new Function() { // from class: com.revenuecat.purchases.utils.b
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return EventsFileHelper.C02951.invoke$lambda$0(c00981, obj);
                }
            });
            q.e(map, "stream.map { JSONObject(it) }");
            lVar.invoke(map);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EventsFileHelper(FileHelper fileHelper, String filePath, l<? super String, ? extends T> lVar) {
        q.f(fileHelper, "fileHelper");
        q.f(filePath, "filePath");
        this.fileHelper = fileHelper;
        this.filePath = filePath;
        this.eventDeserializer = lVar;
    }

    public /* synthetic */ EventsFileHelper(FileHelper fileHelper, String str, l lVar, int i8, j jVar) {
        this(fileHelper, str, (i8 & 4) != 0 ? null : lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T mapToEvent(String str) {
        StringBuilder sb;
        l<String, T> lVar = this.eventDeserializer;
        if (lVar == null) {
            return null;
        }
        try {
            return lVar.invoke(str);
        } catch (SerializationException e8) {
            e = e8;
            sb = new StringBuilder();
            sb.append("Error parsing event from file: ");
            sb.append(str);
            LogUtilsKt.errorLog(sb.toString(), e);
            return null;
        } catch (IllegalArgumentException e9) {
            e = e9;
            sb = new StringBuilder();
            sb.append("Error parsing event from file: ");
            sb.append(str);
            LogUtilsKt.errorLog(sb.toString(), e);
            return null;
        }
    }

    public final synchronized void appendEvent(T event) {
        q.f(event, "event");
        FileHelper fileHelper = this.fileHelper;
        String str = this.filePath;
        StringBuilder sb = new StringBuilder();
        sb.append(event);
        sb.append('\n');
        fileHelper.appendToFile(str, sb.toString());
    }

    public final synchronized void clear(int i8) {
        this.fileHelper.removeFirstLinesFromFile(this.filePath, i8);
    }

    public final synchronized void deleteFile() {
        if (!this.fileHelper.deleteFile(this.filePath)) {
            LogUtilsKt.verboseLog("Failed to delete events file in " + this.filePath + '.');
        }
    }

    public final synchronized void readFile(l<? super Stream<T>, i0> streamBlock) {
        q.f(streamBlock, "streamBlock");
        if (this.eventDeserializer == null || this.fileHelper.fileIsEmpty(this.filePath)) {
            Stream streamEmpty = Stream.empty();
            q.e(streamEmpty, "empty()");
            streamBlock.invoke(streamEmpty);
        } else {
            this.fileHelper.readFilePerLines(this.filePath, new AnonymousClass1(streamBlock, this));
        }
    }

    public final synchronized void readFileAsJson(l<? super Stream<JSONObject>, i0> streamBlock) {
        q.f(streamBlock, "streamBlock");
        if (this.fileHelper.fileIsEmpty(this.filePath)) {
            Stream streamEmpty = Stream.empty();
            q.e(streamEmpty, "empty()");
            streamBlock.invoke(streamEmpty);
        } else {
            this.fileHelper.readFilePerLines(this.filePath, new C02951(streamBlock));
        }
    }
}
