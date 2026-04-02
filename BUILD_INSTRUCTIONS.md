# Instructions de Construction de l'APK Android

## 📱 Modifications Effectuées

### Images Mises à Jour
✅ **Logo de l'application** : Remplacé par la nouvelle image (1000340678.jpg)
✅ **Écran de démarrage** : Mis à jour avec la nouvelle image (1000340679.jpg)
✅ **Image de référence des cellules** : Ajoutée (1000340677.jpg)
✅ **Icônes de lancement** : Toutes les résolutions mises à jour (hdpi, mdpi, xhdpi, xxhdpi, xxxhdpi)

### Couleurs Mises à Jour
✅ **Thème principal** : Changé de turquoise à violet
✅ **Couleurs d'accent** : #9C27B0 (violet) et #7B1FA2 (violet foncé)
✅ **Arrière-plan du lanceur** : #9C27B0

## 🔗 Liens de Téléchargement

### Code Source Modifié
- **Branche GitHub** : `agent/changer-les-couleurs-et-les-im-mc-cline`
- **URL de téléchargement** : https://github.com/YassineKAMAR/app/archive/refs/heads/agent/changer-les-couleurs-et-les-im-mc-cline.zip
- **Cloner le dépôt** :
  ```bash
  git clone -b agent/changer-les-couleurs-et-les-im-mc-cline https://github.com/YassineKAMAR/app.git
  ```

### Pull Request
- **Créer une Pull Request** : https://github.com/YassineKAMAR/app/pull/new/agent/changer-les-couleurs-et-les-im-mc-cline

## 🛠️ Comment Construire l'APK

### Prérequis
- **JDK 17** ou supérieur
- **Android SDK** (API 33)
- **Gradle 8.0+** (inclus via wrapper)

### Étapes de Construction

#### Option 1 : Utiliser Android Studio
1. Téléchargez et extrayez le code source
2. Ouvrez le projet dans Android Studio
3. Attendez la synchronisation Gradle
4. Allez dans **Build** → **Build Bundle(s) / APK(s)** → **Build APK(s)**
5. L'APK sera dans `build/outputs/apk/debug/`

#### Option 2 : Ligne de Commande
```bash
# 1. Télécharger le code source
git clone -b agent/changer-les-couleurs-et-les-im-mc-cline https://github.com/YassineKAMAR/app.git
cd app

# 2. Construire l'APK de débogage
./gradlew assembleDebug

# 3. L'APK sera créé dans :
# build/outputs/apk/debug/app-debug.apk
```

#### Option 3 : APK de Release (Signé)
```bash
# Pour une version de production signée
./gradlew assembleRelease

# L'APK sera dans :
# build/outputs/apk/release/app-release.apk
```

## 📦 Localisation des Fichiers APK

Après la construction, vous trouverez les APK ici :
- **Debug APK** : `build/outputs/apk/debug/app-debug.apk`
- **Release APK** : `build/outputs/apk/release/app-release.apk`

## 📋 Informations sur l'Application

- **Nom du package** : `hokudai.kazusasa.BMCounter`
- **Version** : 2.0.0 (versionCode 3)
- **SDK minimum** : API 21 (Android 5.0)
- **SDK cible** : API 33 (Android 13)
- **Framework** : Flutter

## 🎨 Détails des Modifications

### Fichiers Modifiés
1. `src/main/res/values/colors.xml` - Schéma de couleurs mis à jour
2. `src/main/assets/flutter_assets/assets/images/logo.png` - Nouveau logo
3. `src/main/assets/flutter_assets/assets/images/app_splash.png` - Nouvel écran de démarrage
4. `src/main/assets/flutter_assets/assets/images/cells_reference.jpg` - Nouvelle image de référence
5. `src/main/res/mipmap-*/ic_launcher.png` - Icônes de lancement mises à jour

### Fichiers Ajoutés
1. `README.md` - Documentation du projet
2. `BUILD_INSTRUCTIONS.md` - Ce fichier
3. `gradlew` - Script wrapper Gradle
4. `gradle/wrapper/*` - Fichiers wrapper Gradle
5. `settings.gradle` - Configuration du projet

## 🚀 Installation de l'APK

Une fois l'APK construit :
1. Transférez le fichier APK sur votre appareil Android
2. Activez "Sources inconnues" dans les paramètres
3. Ouvrez le fichier APK pour l'installer
4. Profitez de l'application avec le nouveau thème violet !

## 📞 Support

Pour toute question ou problème :
- Ouvrez une issue sur GitHub : https://github.com/YassineKAMAR/app/issues
- Consultez la documentation Flutter : https://flutter.dev/docs

---

**Note** : Ce projet a été modifié automatiquement pour mettre à jour les images et le schéma de couleurs selon vos spécifications.
