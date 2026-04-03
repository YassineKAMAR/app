# Guide de Localisation de l'APK - BMCounter

## 📍 Où Trouver l'APK dans GitHub

### Emplacement de l'APK après la Construction

Après avoir construit l'application avec succès, l'APK se trouvera à l'emplacement suivant dans votre dépôt GitHub :

```
build/outputs/apk/debug/BMCounter-debug.apk
```

ou selon la configuration du projet :

```
build/outputs/apk/debug/app-debug.apk
```

## 🔍 Structure Complète du Répertoire de Build

```
votre-repo-github/
├── build/
│   └── outputs/
│       └── apk/
│           ├── debug/
│           │   ├── BMCounter-debug.apk          ← APK DE DEBUG ICI
│           │   └── output-metadata.json
│           └── release/
│               ├── BMCounter-release.apk        ← APK DE RELEASE ICI
│               └── output-metadata.json
```

## ⚠️ Important à Noter

### Le dossier `build/` n'est PAS dans GitHub par défaut

**Le répertoire `build/` est normalement ignoré par Git** (via `.gitignore`) car il contient des fichiers générés. Cela signifie que :

1. ❌ Vous ne verrez PAS le fichier APK directement dans GitHub
2. ✅ Vous devez CONSTRUIRE l'APK localement pour le générer
3. ✅ L'APK sera créé dans `build/outputs/apk/debug/` après la construction

## 🛠️ Comment Obtenir l'APK

### Option 1: Construire Localement

```bash
# 1. Cloner le dépôt GitHub
git clone https://github.com/votre-utilisateur/BMCounter.git
cd BMCounter

# 2. Construire l'APK
./gradlew assembleDebug

# 3. L'APK sera disponible à :
ls -la build/outputs/apk/debug/BMCounter-debug.apk
```

### Option 2: GitHub Actions (CI/CD)

Si vous configurez GitHub Actions, vous pouvez automatiquement construire et télécharger l'APK :

**Créez `.github/workflows/build-apk.yml` :**

```yaml
name: Build Android APK

on:
  push:
    branches: [ main ]
  pull_request:
    branches: [ main ]
  workflow_dispatch:

jobs:
  build:
    runs-on: ubuntu-latest
    
    steps:
    - uses: actions/checkout@v3
    
    - name: Set up JDK 17
      uses: actions/setup-java@v3
      with:
        java-version: '17'
        distribution: 'temurin'
    
    - name: Grant execute permission for gradlew
      run: chmod +x gradlew
    
    - name: Build with Gradle
      run: ./gradlew assembleDebug
    
    - name: Upload APK
      uses: actions/upload-artifact@v3
      with:
        name: BMCounter-debug
        path: build/outputs/apk/debug/*.apk
```

Ensuite, l'APK sera disponible dans l'onglet **Actions** de GitHub comme un artefact téléchargeable.

### Option 3: GitHub Releases

Pour publier l'APK sur GitHub :

```bash
# 1. Construire l'APK de release
./gradlew assembleRelease

# 2. Créer un tag Git
git tag v1.0.0
git push origin v1.0.0

# 3. Aller dans GitHub → Releases → Create new release
# 4. Télécharger manuellement build/outputs/apk/release/BMCounter-release.apk
```

## 📋 Vérification Rapide

Pour vérifier si l'APK a été construit :

```bash
# Rechercher tous les fichiers APK
find . -name "*.apk" -type f

# Lister le contenu du répertoire de debug
ls -lah build/outputs/apk/debug/

# Obtenir la taille du fichier APK
du -h build/outputs/apk/debug/BMCounter-debug.apk
```

## 🎯 Résumé

| Question | Réponse |
|----------|---------|
| **Chemin de l'APK** | `build/outputs/apk/debug/BMCounter-debug.apk` |
| **Visible dans GitHub ?** | Non (ignoré par `.gitignore`) |
| **Comment l'obtenir ?** | Cloner le repo et construire avec Gradle |
| **Alternative ?** | Utiliser GitHub Actions pour générer automatiquement |

## 🔗 Liens Utiles

- [Documentation sur la construction d'APK](BUILD_INSTRUCTIONS.md)
- [Guide Android pour construire votre app](https://developer.android.com/studio/build)
- [GitHub Actions pour Android](https://github.com/actions/setup-java)
