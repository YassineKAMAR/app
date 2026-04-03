# Comment Publier une Release avec l'APK sur GitHub

Ce guide explique comment publier votre APK sur GitHub de manière professionnelle.

## Méthode 1: Utilisation des GitHub Actions (Automatique - Recommandé)

### Étape 1: Créer un Tag Git

```bash
# 1. Assurez-vous que vos modifications sont commitées
git add .
git commit -m "Préparation de la version 1.0.0"

# 2. Créez un tag avec le numéro de version
git tag -a v1.0.0 -m "Version 1.0.0 - Première release officielle"

# 3. Poussez le tag vers GitHub
git push origin v1.0.0
```

### Étape 2: GitHub Actions se Déclenche Automatiquement

Une fois le tag poussé, le workflow `.github/workflows/release-apk.yml` va:
1. ✅ Compiler l'APK automatiquement
2. ✅ Créer une nouvelle Release sur GitHub
3. ✅ Attacher l'APK à la Release
4. ✅ Générer les notes de version

### Étape 3: Vérifier la Release

1. Allez sur votre dépôt GitHub
2. Cliquez sur "Releases" (menu de droite)
3. Vous devriez voir votre nouvelle release avec l'APK téléchargeable

## Méthode 2: Release Manuelle (Sans GitHub Actions)

### Étape 1: Compiler l'APK Localement

```bash
# Assurez-vous d'avoir les prérequis installés
# JDK 17, Android SDK, Gradle

# Compilez l'APK
./gradlew assembleDebug

# L'APK sera dans:
# build/outputs/apk/debug/app-debug.apk
```

### Étape 2: Créer la Release sur GitHub

1. **Allez sur votre dépôt GitHub**
   - Exemple: `https://github.com/votre-nom/BMCounter`

2. **Cliquez sur "Releases"**
   - Dans le menu de droite, ou dans l'onglet en haut

3. **Cliquez sur "Create a new release"**

4. **Remplissez le formulaire:**

   **Choose a tag:**
   - Tapez `v1.0.0` (ou votre numéro de version)
   - Cliquez sur "Create new tag: v1.0.0 on publish"

   **Release title:**
   ```
   BMCounter v1.0.0 - Laboratoire d'Hématologie CHU Mohammed VI
   ```

   **Description:**
   ```markdown
   ## BMCounter - Version 1.0.0

   Application mobile pour le Laboratoire d'Hématologie du Centre Hospitalier Universitaire Générale Mohammed VI (GST - Tanger-Tétouan-Al Hoceima).

   ### 📥 Installation

   1. Téléchargez le fichier `app-debug.apk` ci-dessous
   2. Sur votre appareil Android, allez dans Paramètres → Sécurité
   3. Activez "Sources inconnues" ou "Autoriser l'installation d'applications provenant de sources inconnues"
   4. Ouvrez le fichier APK téléchargé
   5. Suivez les instructions d'installation

   ### ✨ Caractéristiques

   - Interface personnalisée pour laboratoire d'hématologie
   - Thème rouge/bordeaux médical
   - Logo du CHU Mohammed VI
   - Optimisé pour les professionnels de santé

   ### 📋 Informations Techniques

   - **Version**: 2.0.0 (Code: 3)
   - **Package**: hokudai.kazusasa.BMCounter
   - **SDK Cible**: Android 13 (API 33)
   - **SDK Minimum**: Android 5.0 (API 21)
   - **Taille**: ~X MB

   ### 🎨 Thème

   - Couleur principale: #B91E2E (Rouge/Bordeaux)
   - Couleur foncée: #8B1722 (Rouge Foncé)

   ### 📝 Notes de Version

   - Première release officielle
   - Personnalisation complète pour le CHU Mohammed VI
   - Interface adaptée aux besoins du laboratoire d'hématologie

   ### ⚠️ Compatibilité

   Compatible avec Android 5.0 (Lollipop) et versions ultérieures.

   ---

   Pour toute question ou assistance, contactez l'administration du CHU Mohammed VI.
   ```

5. **Attacher l'APK:**
   - Faites glisser votre fichier `app-debug.apk` dans la zone "Attach binaries by dropping them here or selecting them"
   - Ou cliquez sur "Attach binaries" et sélectionnez le fichier

6. **Options:**
   - ✅ Set as the latest release (coché)
   - ⬜ Set as a pre-release (décoché, sauf si c'est une version test)

7. **Cliquez sur "Publish release"**

## Méthode 3: Utilisation du CLI GitHub (Pour Experts)

```bash
# 1. Installez GitHub CLI si ce n'est pas déjà fait
# https://cli.github.com/

# 2. Authentifiez-vous
gh auth login

# 3. Compilez l'APK
./gradlew assembleDebug

# 4. Créez la release avec l'APK
gh release create v1.0.0 \
  build/outputs/apk/debug/app-debug.apk \
  --title "BMCounter v1.0.0 - CHU Mohammed VI" \
  --notes "Application pour le Laboratoire d'Hématologie du CHU Mohammed VI

## Installation
Téléchargez l'APK et installez-le sur votre appareil Android.

## Caractéristiques
- Interface personnalisée
- Thème médical rouge/bordeaux
- Logo du CHU Mohammed VI"
```

## Numérotation des Versions

Suivez le système de versioning sémantique (SemVer):

- **v1.0.0**: Première release stable
- **v1.1.0**: Ajout de nouvelles fonctionnalités (minor)
- **v1.0.1**: Corrections de bugs (patch)
- **v2.0.0**: Changements majeurs incompatibles (major)

## Vérification Après Publication

1. **Testez le lien de téléchargement:**
   - URL: `https://github.com/votre-nom/BMCounter/releases/download/v1.0.0/app-debug.apk`

2. **Vérifiez que l'APK est téléchargeable:**
   - Cliquez sur le fichier APK dans la release
   - Le téléchargement doit démarrer

3. **Testez l'installation:**
   - Téléchargez l'APK sur un appareil Android
   - Installez et vérifiez que l'app fonctionne

## Conseils

- 🔒 **Ne jamais commit l'APK dans Git** - Utilisez uniquement les Releases
- 📝 **Documentez chaque version** - Ajoutez des notes de version détaillées
- 🔖 **Utilisez des tags** - Facilitent le suivi des versions
- ✅ **Testez avant de publier** - Vérifiez que l'APK fonctionne correctement
- 📅 **Planifiez vos releases** - Évitez trop de releases trop rapprochées

## Automation Complète avec GitHub Actions

Les workflows créés dans `.github/workflows/` permettent:

1. **build-apk.yml**: Compile l'APK à chaque push (disponible en Artifacts)
2. **release-apk.yml**: Crée automatiquement une release quand vous créez un tag

Pour utiliser l'automation:
```bash
# Créez et poussez un tag
git tag v1.0.0
git push origin v1.0.0

# GitHub Actions va automatiquement:
# - Compiler l'APK
# - Créer la release
# - Attacher l'APK
```

## Dépannage

### Erreur: "Resource not accessible by integration"
- Allez dans Settings → Actions → General
- Dans "Workflow permissions", sélectionnez "Read and write permissions"

### L'APK n'apparaît pas dans la Release
- Vérifiez que le workflow s'est terminé avec succès
- Consultez les logs dans l'onglet "Actions"

### Le workflow ne se déclenche pas
- Vérifiez que le tag commence par 'v' (ex: v1.0.0)
- Assurez-vous que les workflows sont activés dans Settings → Actions
