# Où trouver l'APK BMCounter-debug.apk sur GitHub

## Réponse Importante

**L'APK n'existe PAS actuellement dans le dépôt GitHub.**

Le fichier `build/outputs/apk/debug/BMCounter-debug.apk` que vous recherchez **n'est pas présent** dans le dépôt GitHub pour les raisons suivantes:

### Pourquoi l'APK n'est pas sur GitHub?

1. **Le dossier `build/` n'existe pas** dans le dépôt
2. **Les fichiers APK ne sont généralement PAS versionnés** dans Git car:
   - Ce sont des fichiers binaires volumineux
   - Ils sont générés automatiquement lors de la compilation
   - Ils changent à chaque build
   - Ils alourdissent inutilement l'historique Git

3. **Aucun fichier .apk n'a jamais été commité** dans l'historique du dépôt

### Comment obtenir l'APK?

Vous devez **construire l'APK vous-même** en suivant ces étapes:

#### Option 1: Utiliser Android Studio (Recommandé)
1. Cloner le dépôt: `git clone https://github.com/YassineKAMAR/app.git`
2. Ouvrir le projet dans Android Studio
3. Attendre la synchronisation Gradle
4. Menu: **Build → Build Bundle(s) / APK(s) → Build APK(s)**
5. L'APK sera créé dans: `build/outputs/apk/debug/app-debug.apk`

#### Option 2: Ligne de commande
```bash
# 1. Cloner le dépôt
git clone https://github.com/YassineKAMAR/app.git
cd app

# 2. Créer le wrapper Gradle
gradle wrapper --gradle-version=7.5

# 3. Construire l'APK
./gradlew assembleDebug

# 4. L'APK sera dans:
# build/outputs/apk/debug/app-debug.apk
```

### Informations du Projet

- **Dépôt GitHub**: https://github.com/YassineKAMAR/app
- **Package**: hokudai.kazusasa.BMCounter
- **Version**: 2.0.0 (versionCode 3)
- **SDK Cible**: Android 33 (Android 13)
- **SDK Minimum**: Android 21 (Android 5.0 Lollipop)

### Si vous voulez publier l'APK

Si vous souhaitez partager l'APK sans que les utilisateurs aient à le compiler, vous avez plusieurs options:

1. **GitHub Releases** (Recommandé):
   - Allez sur: https://github.com/YassineKAMAR/app/releases
   - Créez une nouvelle release
   - Attachez l'APK compilé à la release

2. **GitHub Actions** (Automatique):
   - Configurez un workflow CI/CD pour compiler automatiquement l'APK
   - L'APK sera disponible en tant qu'artifact ou release

3. **Google Play Store**:
   - Publiez l'application sur le Play Store

### Fichiers présents dans le dépôt

Le dépôt contient actuellement:
- ✅ Code source Java (src/main/java/)
- ✅ Ressources Android (src/main/res/)
- ✅ AndroidManifest.xml
- ✅ build.gradle (configuration de build)
- ✅ Instructions de build (BUILD_INSTRUCTIONS.md)
- ❌ **PAS de fichiers APK compilés**
- ❌ **PAS de dossier build/**

## Conclusion

**Vous ne pouvez PAS télécharger directement l'APK depuis GitHub** car il n'y est pas stocké. Vous devez cloner le dépôt et compiler l'application vous-même en utilisant Android Studio ou Gradle.
