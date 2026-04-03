# Instructions de Construction - BMCounter App

## Pour Construire l'APK Android

### Option 1: Utiliser Android Studio

1. Ouvrir Android Studio
2. Sélectionner "Open an Existing Project"
3. Naviguer vers ce dossier et l'ouvrir
4. Attendre que Gradle se synchronise
5. Aller dans: Build → Build Bundle(s) / APK(s) → Build APK(s)
6. L'APK sera dans: `build/outputs/apk/debug/`

### Option 2: Ligne de Commande

```bash
# 1. Assurez-vous que ANDROID_SDK_ROOT est défini
export ANDROID_SDK_ROOT=/path/to/android-sdk

# 2. Utilisez le wrapper Gradle (fourni dans ce dépôt)
chmod +x gradlew

# 3. Construisez l'APK
./gradlew assembleDebug

# 6. Trouvez votre APK
ls -la build/outputs/apk/debug/
```

### Option 3: Environnement Docker

```bash
# Utilisez une image Docker avec Android SDK
docker run --rm -v "$PWD":/project -w /project \
  mingc/android-build-box:latest \
  bash -c "gradle wrapper && ./gradlew assembleDebug"
```

## Problèmes Courants

### Erreur: SDK not found
```bash
# Créez local.properties avec:
echo "sdk.dir=/path/to/android-sdk" > local.properties
```

### Remarque
Le wrapper Gradle est déjà inclus dans le dépôt (gradlew + gradle/wrapper/).

### Erreur: Build Tools
```bash
# Installez les build tools via SDK Manager:
sdkmanager "build-tools;33.0.0"
```

## Après la Construction

L'APK sera situé dans:
```
build/outputs/apk/debug/app-debug.apk
```

Vous pouvez l'installer sur un appareil Android via:
```bash
adb install build/outputs/apk/debug/app-debug.apk
```

## Informations Système Requises

- **JDK**: Version 17 ou supérieure
- **Android SDK**: API Level 33
- **Build Tools**: 33.0.0 ou compatible
- **Gradle**: 7.5 ou supérieur
- **Espace Disque**: ~500MB pour la construction

## Support

Pour toute question technique, consultez:
- [Documentation Android](https://developer.android.com/studio/build)
- [Guide Gradle](https://docs.gradle.org/)
