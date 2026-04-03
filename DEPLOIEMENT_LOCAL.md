# 🚀 Guide de Déploiement Local - BMCounter APK

## 📥 Lien de Téléchargement de l'APK

### Option 1: GitHub Releases (RECOMMANDÉ)

**Lien direct vers les releases:**
```
https://github.com/YassineKAMAR/app/releases
```

**Pour télécharger la dernière version:**
1. Visitez: https://github.com/YassineKAMAR/app/releases
2. Cliquez sur la dernière version (Latest)
3. Téléchargez le fichier `app-debug.apk` ou `BMCounter-v*.apk`
4. Transférez l'APK sur votre appareil Android

**Lien de téléchargement direct (une fois la release publiée):**
```
https://github.com/YassineKAMAR/app/releases/latest/download/app-debug.apk
```

---

### Option 2: Compiler Localement dans ce Sandbox

**⚠️ Note**: Ce sandbox a JDK 17 et Android SDK déjà installés, mais Gradle nécessite une configuration supplémentaire.

#### Étapes de Compilation:

```bash
# 1. Télécharger et configurer Gradle
curl -L https://services.gradle.org/distributions/gradle-7.5-bin.zip -o /tmp/gradle.zip
unzip -q /tmp/gradle.zip -d /tmp/
export PATH=/tmp/gradle-7.5/bin:$PATH

# 2. Configurer JAVA_HOME (trouver l'installation Java)
export JAVA_HOME=$(dirname $(dirname $(readlink -f $(which javac))))

# 3. Créer le wrapper Gradle
gradle wrapper --gradle-version=7.5

# 4. Rendre le script exécutable
chmod +x gradlew

# 5. Compiler l'APK
./gradlew assembleDebug

# 6. L'APK sera disponible à:
# build/outputs/apk/debug/app-debug.apk
```

---

### Option 3: GitHub Actions Artifacts

**Lien vers les workflows:**
```
https://github.com/YassineKAMAR/app/actions
```

**Pour télécharger depuis les artifacts:**
1. Visitez: https://github.com/YassineKAMAR/app/actions
2. Cliquez sur le dernier workflow "Build Android APK" (s'il existe)
3. Scrollez vers le bas jusqu'à la section "Artifacts"
4. Téléchargez l'artifact (fichier ZIP)
5. Décompressez pour obtenir l'APK

**⚠️ Note**: Les artifacts sont disponibles pendant 30 jours seulement.

---

## 📱 Installation de l'APK sur Android

### Méthode 1: Installation Directe sur l'Appareil

1. **Téléchargez l'APK** sur votre appareil Android
2. **Activez les sources inconnues:**
   - Allez dans: `Paramètres` → `Sécurité` → `Sources inconnues`
   - Ou: `Paramètres` → `Applications` → `Accès spécial` → `Installer des applications inconnues`
   - Autorisez votre navigateur ou gestionnaire de fichiers
3. **Ouvrez le fichier APK** téléchargé
4. **Appuyez sur "Installer"**
5. **Lancez l'application** une fois installée

### Méthode 2: Installation via ADB (Android Debug Bridge)

**Prérequis:**
- ADB installé sur votre ordinateur
- Débogage USB activé sur votre appareil Android

```bash
# 1. Connectez votre appareil Android via USB

# 2. Vérifiez que l'appareil est détecté
adb devices

# 3. Installez l'APK
adb install app-debug.apk

# Ou si vous avez déjà une version installée:
adb install -r app-debug.apk
```

### Méthode 3: Installation via Transfert de Fichier

1. **Connectez votre appareil** à l'ordinateur via USB
2. **Copiez l'APK** dans le dossier `Downloads` de votre appareil
3. **Déconnectez** l'appareil
4. **Ouvrez le gestionnaire de fichiers** sur Android
5. **Naviguez vers** `Downloads`
6. **Appuyez sur** le fichier APK
7. **Suivez les instructions** d'installation

---

## 🔗 Liens Rapides

| Ressource | Lien |
|-----------|------|
| **Dépôt GitHub** | https://github.com/YassineKAMAR/app |
| **Releases** | https://github.com/YassineKAMAR/app/releases |
| **Actions/Workflows** | https://github.com/YassineKAMAR/app/actions |
| **Code Source** | https://github.com/YassineKAMAR/app/tree/main |

---

## 📋 Informations sur l'Application

- **Nom**: BMCounter
- **Package**: hokudai.kazusasa.BMCounter
- **Version**: 2.0.0 (Code: 3)
- **SDK Minimum**: Android 5.0 (API 21)
- **SDK Cible**: Android 13 (API 33)
- **Taille APK**: ~15-30 MB (approximatif)

---

## 🛠️ Publier une Release (Pour le Mainteneur)

### Méthode Manuelle:

1. **Compilez l'APK** localement (voir ci-dessus)
2. **Allez sur GitHub**: https://github.com/YassineKAMAR/app/releases/new
3. **Créez un nouveau tag**: ex: `v1.0.0`, `v2.0.0`
4. **Titre de la release**: ex: "BMCounter v2.0.0"
5. **Description**: Ajoutez les notes de version
6. **Attachez l'APK**: Glissez-déposez `app-debug.apk`
7. **Publiez la release**

### Méthode Automatique avec Git Tags:

```bash
# 1. Créez un tag de version
git tag -a v2.0.0 -m "Version 2.0.0 - BMCounter pour CHU Mohammed VI"

# 2. Poussez le tag vers GitHub
git push origin v2.0.0

# 3. Si vous avez GitHub Actions configuré, l'APK sera compilé automatiquement
# Sinon, créez la release manuellement sur GitHub
```

---

## ⚠️ Dépannage

### Problème: "L'APK n'est pas dans le dépôt"
**Solution**: C'est normal! L'APK est un fichier compilé qui n'est pas versionné dans Git. Utilisez les releases ou compilez localement.

### Problème: "Installation bloquée"
**Solution**: Activez "Sources inconnues" dans les paramètres de sécurité Android.

### Problème: "L'application ne s'installe pas"
**Solutions possibles:**
- Vérifiez que votre Android est version 5.0 ou supérieure
- Désinstallez l'ancienne version si elle existe
- Vérifiez que vous avez assez d'espace de stockage
- Téléchargez à nouveau l'APK (le fichier peut être corrompu)

### Problème: "Gradle build failed"
**Solutions:**
- Vérifiez que JAVA_HOME est correctement configuré
- Vérifiez que ANDROID_SDK_ROOT pointe vers `/opt/android-sdk`
- Essayez: `./gradlew clean assembleDebug`

---

## 📞 Support

Pour toute question ou problème:
- 📚 Consultez la documentation complète: [`INDEX_DOCUMENTATION.md`](INDEX_DOCUMENTATION.md)
- 🐛 Vérifiez les issues GitHub: https://github.com/YassineKAMAR/app/issues
- 💬 Contact: Administration CHU Mohammed VI

---

## 📄 Documentation Complémentaire

| Document | Description |
|----------|-------------|
| [`OU_TROUVER_APK.md`](OU_TROUVER_APK.md) | Explication détaillée sur l'emplacement de l'APK |
| [`GUIDE_RAPIDE_APK.md`](GUIDE_RAPIDE_APK.md) | Guide rapide pour obtenir l'APK |
| [`BUILD_INSTRUCTIONS.md`](BUILD_INSTRUCTIONS.md) | Instructions complètes de compilation |
| [`PUBLIER_RELEASE.md`](PUBLIER_RELEASE.md) | Guide pour publier une release sur GitHub |
| [`README.md`](README.md) | Vue d'ensemble du projet |

---

**Dernière mise à jour**: 2026-04-03
**Créé pour**: Laboratoire d'Hématologie - CHU Mohammed VI (GST - Tanger-Tétouan-Al Hoceima)
