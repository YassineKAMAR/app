package io.flutter.embedding.android;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import io.flutter.plugin.editing.d;
import java.util.HashSet;
import java.util.Map;
import r5.e;

/* JADX INFO: loaded from: classes.dex */
public class a0 implements d.a, e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final d[] f22580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet<KeyEvent> f22581b = new HashSet<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f22582c;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f22583a = 0;

        Character a(int i8) {
            char c8 = (char) i8;
            if ((Integer.MIN_VALUE & i8) != 0) {
                int deadChar = i8 & Integer.MAX_VALUE;
                int i9 = this.f22583a;
                if (i9 != 0) {
                    deadChar = KeyCharacterMap.getDeadChar(i9, deadChar);
                }
                this.f22583a = deadChar;
            } else {
                int i10 = this.f22583a;
                if (i10 != 0) {
                    int deadChar2 = KeyCharacterMap.getDeadChar(i10, i8);
                    if (deadChar2 > 0) {
                        c8 = (char) deadChar2;
                    }
                    this.f22583a = 0;
                }
            }
            return Character.valueOf(c8);
        }
    }

    private class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final KeyEvent f22584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f22585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f22586c = false;

        private class a implements d.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            boolean f22588a;

            private a() {
                this.f22588a = false;
            }

            @Override // io.flutter.embedding.android.a0.d.a
            public void a(boolean z7) {
                if (this.f22588a) {
                    throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
                }
                this.f22588a = true;
                c cVar = c.this;
                int i8 = cVar.f22585b - 1;
                cVar.f22585b = i8;
                boolean z8 = z7 | cVar.f22586c;
                cVar.f22586c = z8;
                if (i8 != 0 || z8) {
                    return;
                }
                a0.this.e(cVar.f22584a);
            }
        }

        c(KeyEvent keyEvent) {
            this.f22585b = a0.this.f22580a.length;
            this.f22584a = keyEvent;
        }

        public d.a a() {
            return new a();
        }
    }

    public interface d {

        public interface a {
            void a(boolean z7);
        }

        void a(KeyEvent keyEvent, a aVar);
    }

    public interface e {
        void b(KeyEvent keyEvent);

        boolean c(KeyEvent keyEvent);

        s5.c getBinaryMessenger();
    }

    public a0(e eVar) {
        this.f22582c = eVar;
        this.f22580a = new d[]{new z(eVar.getBinaryMessenger()), new u(new r5.d(eVar.getBinaryMessenger()))};
        new r5.e(eVar.getBinaryMessenger()).b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(KeyEvent keyEvent) {
        e eVar = this.f22582c;
        if (eVar == null || eVar.c(keyEvent)) {
            return;
        }
        this.f22581b.add(keyEvent);
        this.f22582c.b(keyEvent);
        if (this.f22581b.remove(keyEvent)) {
            g5.b.g("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
        }
    }

    @Override // io.flutter.plugin.editing.d.a
    public boolean a(KeyEvent keyEvent) {
        if (this.f22581b.remove(keyEvent)) {
            return false;
        }
        if (this.f22580a.length <= 0) {
            e(keyEvent);
            return true;
        }
        c cVar = new c(keyEvent);
        for (d dVar : this.f22580a) {
            dVar.a(keyEvent, cVar.a());
        }
        return true;
    }

    @Override // r5.e.b
    public Map<Long, Long> b() {
        return ((z) this.f22580a[0]).h();
    }

    public void d() {
        int size = this.f22581b.size();
        if (size > 0) {
            g5.b.g("KeyboardManager", "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
        }
    }
}
