# Où Trouver l'APK sur GitHub?

## Réponse Courte
**L'APK n'est PAS présent sur GitHub par défaut**, car les fichiers de build sont généralement exclus des dépôts Git.

## Pourquoi l'APK n'est pas sur GitHub?

Les fichiers APK sont des fichiers binaires générés lors de la compilation du projet Android. Pour les raisons suivantes, ils ne sont généralement **pas** inclus dans les dépôts GitHub:

1. **Fichiers volumineux**: Les APK peuvent peser plusieurs MB, ce qui alourdit le dépôt
2. **Fichiers générés**: Ils peuvent être recréés à tout moment en compilant le code source
3. **Bonnes pratiques Git**: Les fichiers de build (dossier `build/`) sont exclus via `.gitignore`
4. **Gestion des versions**: GitHub Releases est l'endroit approprié pour distribuer les APK

## Comment Obtenir l'APK?

### Option 1: Compiler le Projet Localement

1. Clonez le dépôt GitHub:
   ```bash
   git clone https://github.com/votre-utilisateur/votre-repo.git
   cd votre-repo
   ```

2. Installez les prérequis:
   - JDK 17
   - Android SDK (API 34)
   - Gradle

3. Compilez l'APK:
   ```bash
   gradle wrapper --gradle-version=7.5
   chmod +x gradlew
   ./gradlew assembleDebug
   ```

4. L'APK sera dans:
   ```
   build/outputs/apk/debug/app-debug.apk
   ```

### Option 2: GitHub Releases

Si vous voulez distribuer votre APK via GitHub:

1. Allez dans votre dépôt GitHub
2. Cliquez sur "Releases" (dans le menu de droite)
3. Cliquez sur "Create a new release"
4. Remplissez les informations:
   - Tag version (ex: v1.0.0)
   - Titre du release
   - Description
5. **Attachez votre fichier APK** en le glissant dans la zone "Attach binaries"
6. Publiez le release

Une fois publié, l'APK sera téléchargeable depuis:
```
https://github.com/votre-utilisateur/votre-repo/releases
```

### Option 3: GitHub Actions (CI/CD)

Vous pouvez automatiser la compilation de l'APK avec GitHub Actions:

1. Créez `.github/workflows/build-apk.yml`:
   ```yaml
   name: Build APK

   on:
     push:
       branches: [ main ]
     pull_request:
       branches: [ main ]

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

       - name: Setup Android SDK
         uses: android-actions/setup-android@v2

       - name: Build with Gradle
         run: |
           chmod +x gradlew
           ./gradlew assembleDebug

       - name: Upload APK
         uses: actions/upload-artifact@v3
         with:
           name: app-debug
           path: build/outputs/apk/debug/app-debug.apk
   ```

2. L'APK sera disponible dans les "Artifacts" de chaque exécution du workflow

## Structure des Fichiers (ce qui est sur GitHub)

```
votre-repo/
├── src/              ✅ Sur GitHub (code source)
├── build.gradle      ✅ Sur GitHub (configuration de build)
├── settings.gradle   ✅ Sur GitHub (paramètres projet)
├── .gitignore        ✅ Sur GitHub (exclut build/)
├── build/            ❌ PAS sur GitHub (fichiers générés)
│   └── outputs/
│       └── apk/
│           └── debug/
│               └── app-debug.apk  ❌ Fichier généré localement
```

## Résumé

- **Le code source** est sur GitHub
- **L'APK compilé** n'est PAS sur GitHub par défaut
- Pour obtenir l'APK:
  1. Compilez-le localement depuis le code source
  2. Téléchargez-le depuis GitHub Releases (si publié)
  3. Téléchargez-le depuis GitHub Actions Artifacts (si configuré)

## Fichier .gitignore

J'ai créé un fichier `.gitignore` qui exclut automatiquement:
- Le dossier `build/` (contient l'APK)
- Les fichiers `.apk`, `.aar`, `.aab`
- Les fichiers de configuration locale

Cela garantit que seul le code source est versionné sur GitHub, et non les fichiers binaires compilés.
