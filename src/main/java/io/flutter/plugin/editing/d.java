package io.flutter.plugin.editing;

import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.e;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import r5.q;

/* JADX INFO: loaded from: classes.dex */
public class d extends BaseInputConnection implements e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f22856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q f22858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f22859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EditorInfo f22860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ExtractedTextRequest f22861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f22862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private CursorAnchorInfo.Builder f22863h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ExtractedText f22864i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InputMethodManager f22865j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Layout f22866k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private io.flutter.plugin.editing.a f22867l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final a f22868m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f22869n;

    public interface a {
        boolean a(KeyEvent keyEvent);
    }

    public d(View view, int i8, q qVar, a aVar, e eVar, EditorInfo editorInfo) {
        this(view, i8, qVar, aVar, eVar, editorInfo, new FlutterJNI());
    }

    public d(View view, int i8, q qVar, a aVar, e eVar, EditorInfo editorInfo, FlutterJNI flutterJNI) {
        super(view, true);
        this.f22862g = false;
        this.f22864i = new ExtractedText();
        this.f22869n = 0;
        this.f22856a = view;
        this.f22857b = i8;
        this.f22858c = qVar;
        this.f22859d = eVar;
        eVar.a(this);
        this.f22860e = editorInfo;
        this.f22868m = aVar;
        this.f22867l = new io.flutter.plugin.editing.a(flutterJNI);
        this.f22866k = new DynamicLayout(eVar, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f22865j = (InputMethodManager) view.getContext().getSystemService("input_method");
    }

    private boolean b(int i8) {
        if (i8 == 16908319) {
            setSelection(0, this.f22859d.length());
            return true;
        }
        if (i8 == 16908320) {
            int selectionStart = Selection.getSelectionStart(this.f22859d);
            int selectionEnd = Selection.getSelectionEnd(this.f22859d);
            if (selectionStart != selectionEnd) {
                int iMin = Math.min(selectionStart, selectionEnd);
                int iMax = Math.max(selectionStart, selectionEnd);
                ((ClipboardManager) this.f22856a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f22859d.subSequence(iMin, iMax)));
                this.f22859d.delete(iMin, iMax);
                setSelection(iMin, iMin);
            }
            return true;
        }
        if (i8 == 16908321) {
            int selectionStart2 = Selection.getSelectionStart(this.f22859d);
            int selectionEnd2 = Selection.getSelectionEnd(this.f22859d);
            if (selectionStart2 != selectionEnd2) {
                ((ClipboardManager) this.f22856a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f22859d.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
            }
            return true;
        }
        if (i8 != 16908322) {
            return false;
        }
        ClipData primaryClip = ((ClipboardManager) this.f22856a.getContext().getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip != null) {
            CharSequence charSequenceCoerceToText = primaryClip.getItemAt(0).coerceToText(this.f22856a.getContext());
            int iMax2 = Math.max(0, Selection.getSelectionStart(this.f22859d));
            int iMax3 = Math.max(0, Selection.getSelectionEnd(this.f22859d));
            int iMin2 = Math.min(iMax2, iMax3);
            int iMax4 = Math.max(iMax2, iMax3);
            if (iMin2 != iMax4) {
                this.f22859d.delete(iMin2, iMax4);
            }
            this.f22859d.insert(iMin2, charSequenceCoerceToText);
            int length = iMin2 + charSequenceCoerceToText.length();
            setSelection(length, length);
        }
        return true;
    }

    private CursorAnchorInfo c() {
        CursorAnchorInfo.Builder builder = this.f22863h;
        if (builder == null) {
            this.f22863h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        this.f22863h.setSelectionRange(this.f22859d.i(), this.f22859d.h());
        int iG = this.f22859d.g();
        int iF = this.f22859d.f();
        if (iG < 0 || iF <= iG) {
            this.f22863h.setComposingText(-1, "");
        } else {
            this.f22863h.setComposingText(iG, this.f22859d.toString().subSequence(iG, iF));
        }
        return this.f22863h.build();
    }

    private ExtractedText d(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.f22864i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        extractedText.selectionStart = this.f22859d.i();
        this.f22864i.selectionEnd = this.f22859d.h();
        this.f22864i.text = (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) ? this.f22859d.toString() : this.f22859d;
        return this.f22864i;
    }

    private boolean e(boolean z7, boolean z8) {
        int selectionStart = Selection.getSelectionStart(this.f22859d);
        int selectionEnd = Selection.getSelectionEnd(this.f22859d);
        boolean z9 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        int iMax = z7 ? Math.max(this.f22867l.b(this.f22859d, selectionEnd), 0) : Math.min(this.f22867l.a(this.f22859d, selectionEnd), this.f22859d.length());
        if (selectionStart == selectionEnd && !z8) {
            z9 = true;
        }
        if (z9) {
            setSelection(iMax, iMax);
        } else {
            setSelection(selectionStart, iMax);
        }
        return true;
    }

    private boolean g(boolean z7, boolean z8) {
        int selectionStart = Selection.getSelectionStart(this.f22859d);
        int selectionEnd = Selection.getSelectionEnd(this.f22859d);
        boolean z9 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z8) {
            z9 = true;
        }
        beginBatchEdit();
        if (z9) {
            if (z7) {
                Selection.moveUp(this.f22859d, this.f22866k);
            } else {
                Selection.moveDown(this.f22859d, this.f22866k);
            }
            int selectionStart2 = Selection.getSelectionStart(this.f22859d);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z7) {
                Selection.extendUp(this.f22859d, this.f22866k);
            } else {
                Selection.extendDown(this.f22859d, this.f22866k);
            }
            setSelection(Selection.getSelectionStart(this.f22859d), Selection.getSelectionEnd(this.f22859d));
        }
        endBatchEdit();
        return true;
    }

    private byte[] h(InputStream inputStream, int i8) {
        int i9;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[i8];
        while (true) {
            try {
                i9 = inputStream.read(bArr);
            } catch (IOException unused) {
                i9 = -1;
            }
            if (i9 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i9);
        }
    }

    @Override // io.flutter.plugin.editing.e.b
    public void a(boolean z7, boolean z8, boolean z9) {
        this.f22865j.updateSelection(this.f22856a, this.f22859d.i(), this.f22859d.h(), this.f22859d.g(), this.f22859d.f());
        ExtractedTextRequest extractedTextRequest = this.f22861f;
        if (extractedTextRequest != null) {
            this.f22865j.updateExtractedText(this.f22856a, extractedTextRequest.token, d(extractedTextRequest));
        }
        if (this.f22862g) {
            this.f22865j.updateCursorAnchorInfo(this.f22856a, c());
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.f22859d.b();
        this.f22869n++;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i8) {
        return super.clearMetaKeyStates(i8);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public void closeConnection() {
        super.closeConnection();
        this.f22859d.l(this);
        while (this.f22869n > 0) {
            endBatchEdit();
            this.f22869n--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    @TargetApi(25)
    public boolean commitContent(InputContentInfo inputContentInfo, int i8, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i8 & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                if (inputContentInfo.getDescription().getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    Uri contentUri = inputContentInfo.getContentUri();
                    String mimeType = inputContentInfo.getDescription().getMimeType(0);
                    Context context = this.f22856a.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (inputStreamOpenInputStream != null) {
                                byte[] bArrH = h(inputStreamOpenInputStream, 65536);
                                HashMap map = new HashMap();
                                map.put("mimeType", mimeType);
                                map.put("data", bArrH);
                                map.put("uri", contentUri.toString());
                                this.f22858c.b(this.f22857b, map);
                                inputContentInfo.releasePermission();
                                return true;
                            }
                        } catch (FileNotFoundException unused) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i8) {
        return super.commitText(charSequence, i8);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i8, int i9) {
        if (this.f22859d.i() == -1) {
            return true;
        }
        return super.deleteSurroundingText(i8, i9);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i8, int i9) {
        return super.deleteSurroundingTextInCodePoints(i8, i9);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        boolean zEndBatchEdit = super.endBatchEdit();
        this.f22869n--;
        this.f22859d.d();
        return zEndBatchEdit;
    }

    public boolean f(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 21) {
                return e(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 22) {
                return e(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 19) {
                return g(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 20) {
                return g(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                EditorInfo editorInfo = this.f22860e;
                if ((131072 & editorInfo.inputType) == 0) {
                    performEditorAction(editorInfo.imeOptions & 255);
                    return true;
                }
            }
            int selectionStart = Selection.getSelectionStart(this.f22859d);
            int selectionEnd = Selection.getSelectionEnd(this.f22859d);
            int unicodeChar = keyEvent.getUnicodeChar();
            if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                int iMin = Math.min(selectionStart, selectionEnd);
                int iMax = Math.max(selectionStart, selectionEnd);
                beginBatchEdit();
                if (iMin != iMax) {
                    this.f22859d.delete(iMin, iMax);
                }
                this.f22859d.insert(iMin, (CharSequence) String.valueOf((char) unicodeChar));
                int i8 = iMin + 1;
                setSelection(i8, i8);
                endBatchEdit();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        return super.finishComposingText();
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public Editable getEditable() {
        return this.f22859d;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i8) {
        boolean z7 = (i8 & 1) != 0;
        if (z7 == (this.f22861f == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled text monitoring ");
            sb.append(z7 ? "on" : "off");
            g5.b.a("InputConnectionAdaptor", sb.toString());
        }
        this.f22861f = z7 ? extractedTextRequest : null;
        return d(extractedTextRequest);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i8) {
        beginBatchEdit();
        boolean zB = b(i8);
        endBatchEdit();
        return zB;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i8) {
        if (i8 == 0) {
            this.f22858c.p(this.f22857b);
        } else if (i8 == 1) {
            this.f22858c.g(this.f22857b);
        } else if (i8 == 2) {
            this.f22858c.f(this.f22857b);
        } else if (i8 == 3) {
            this.f22858c.m(this.f22857b);
        } else if (i8 == 4) {
            this.f22858c.n(this.f22857b);
        } else if (i8 == 5) {
            this.f22858c.h(this.f22857b);
        } else if (i8 != 7) {
            this.f22858c.e(this.f22857b);
        } else {
            this.f22858c.k(this.f22857b);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        this.f22858c.j(this.f22857b, str, bundle);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i8) {
        if ((i8 & 1) != 0) {
            this.f22865j.updateCursorAnchorInfo(this.f22856a, c());
        }
        boolean z7 = (i8 & 2) != 0;
        if (z7 != this.f22862g) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled cursor monitoring ");
            sb.append(z7 ? "on" : "off");
            g5.b.a("InputConnectionAdaptor", sb.toString());
        }
        this.f22862g = z7;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.f22868m.a(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i8, int i9) {
        return super.setComposingRegion(i8, i9);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i8) {
        beginBatchEdit();
        boolean zCommitText = charSequence.length() == 0 ? super.commitText(charSequence, i8) : super.setComposingText(charSequence, i8);
        endBatchEdit();
        return zCommitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setSelection(int i8, int i9) {
        beginBatchEdit();
        boolean selection = super.setSelection(i8, i9);
        endBatchEdit();
        return selection;
    }
}
