# 🔗 Liens Rapides - BMCounter

## 📱 TÉLÉCHARGER L'APK

### 🎯 Lien Direct (une fois la release créée)
```
https://github.com/YassineKAMAR/app/releases/latest/download/app-debug.apk
```

### 📦 Toutes les Releases
```
https://github.com/YassineKAMAR/app/releases
```

### ⚙️ GitHub Actions (Artifacts)
```
https://github.com/YassineKAMAR/app/actions
```

---

## 💻 DÉPLOYER EN LOCAL

### Cloner le Projet
```bash
git clone https://github.com/YassineKAMAR/app.git
cd app
```

### Compiler l'APK
```bash
# Créer le wrapper Gradle (première fois seulement)
gradle wrapper --gradle-version=7.5
chmod +x gradlew

# Compiler l'APK de debug
./gradlew assembleDebug
```

### Localisation de l'APK Compilé
```
app/build/outputs/apk/debug/app-debug.apk
```

### Installer sur Appareil Android (via ADB)
```bash
# Installer l'APK via ADB
adb install -r build/outputs/apk/debug/app-debug.apk
```

---

## 🚀 CRÉER UNE RELEASE (pour publier l'APK)

```bash
# Créer et pousser un tag
git tag -a v1.0.0 -m "Version 1.0.0"
git push origin v1.0.0

# GitHub Actions va automatiquement:
# ✅ Compiler l'APK
# ✅ Créer la release  
# ✅ Publier l'APK
```

**Lien de la nouvelle release:**
```
https://github.com/YassineKAMAR/app/releases/tag/v1.0.0
```

---

## 📋 Prérequis pour Compiler Localement

- **Git**: Pour cloner le projet
- **JDK 17**: Java Development Kit
- **Android SDK**: API 34 minimum
- **Gradle**: Version 7.5+

---

## 📚 Documentation Complète

Pour plus de détails, consultez:
- **[LIEN_TELECHARGEMENT_APK.md](LIEN_TELECHARGEMENT_APK.md)** - Guide complet
- **[BUILD_INSTRUCTIONS.md](BUILD_INSTRUCTIONS.md)** - Instructions de build
- **[INDEX_DOCUMENTATION.md](INDEX_DOCUMENTATION.md)** - Index de toute la doc

---

**Dépôt GitHub**: https://github.com/YassineKAMAR/app
