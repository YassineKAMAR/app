# BMCounter - Hematology Laboratory App

Application mobile pour le Laboratoire d'Hématologie du Centre Hospitalier Universitaire Générale Mohammed VI (GST - Tanger-Tétouan-Al Hoceima).

> 🔗 **TÉLÉCHARGER L'APK**: Consultez [`LIEN_TELECHARGEMENT_APK.md`](LIEN_TELECHARGEMENT_APK.md) pour les liens de téléchargement et le déploiement local.

> 📚 **Documentation Complète**: Consultez [`INDEX_DOCUMENTATION.md`](INDEX_DOCUMENTATION.md) pour naviguer dans toute la documentation du projet.

## Description

Cette application est personnalisée pour le laboratoire d'hématologie avec:
- Logo du laboratoire médical
- Thème de couleurs médicales (rouge/bordeaux)
- Interface adaptée pour les professionnels de santé

## Caractéristiques

- **Package**: hokudai.kazusasa.BMCounter
- **Version**: 2.0.0 (Code: 3)
- **SDK Cible**: Android 13 (API 33)
- **SDK Minimum**: Android 5.0 (API 21)

## Couleurs du Thème

- **Couleur Principale**: #B91E2E (Rouge/Bordeaux)
- **Couleur Foncée**: #8B1722 (Rouge Foncé)
- **Couleur Accent**: #B91E2E
- **Couleur Secondaire**: #FFFFFF (Blanc)

## 📱 Où Trouver l'APK?

**Important**: L'APK **n'est PAS inclus dans le dépôt GitHub** car les fichiers de build sont exclus par `.gitignore`.

### Options pour Obtenir l'APK:

1. **Compiler Localement** (recommandé pour les développeurs)
   - Voir la section "Construction de l'APK" ci-dessous
   - L'APK sera dans: `build/outputs/apk/debug/app-debug.apk`

2. **GitHub Releases** (recommandé pour les utilisateurs)
   - Allez dans l'onglet [Releases](../../releases)
   - Téléchargez l'APK depuis la dernière version

3. **GitHub Actions Artifacts**
   - Si configuré, téléchargez depuis les artifacts du workflow

📄 Consultez [OU_TROUVER_APK.md](OU_TROUVER_APK.md) pour plus de détails.

## Construction de l'APK

### Prérequis
- Android SDK installé (API 34)
- Gradle 7.5 ou supérieur
- JDK 17

### Commandes de Construction

```bash
# Assurez-vous d'être dans le répertoire du projet
cd /path/to/BMCounter

# Construire l'APK de débogage
./gradlew assembleDebug

# L'APK sera situé à:
# build/outputs/apk/debug/app-debug.apk
```

### Alternative (si gradlew n'est pas disponible)

```bash
# Initialiser le wrapper Gradle
gradle wrapper --gradle-version=7.5

# Puis construire
./gradlew assembleDebug
```

## Structure du Projet

```
BMCounter/
├── src/main/
│   ├── AndroidManifest.xml
│   ├── res/
│   │   ├── drawable/
│   │   │   ├── logo.jpg
│   │   │   ├── splash_logo.jpg
│   │   │   └── icon.jpg
│   │   ├── values/
│   │   │   └── colors.xml
│   │   └── mipmap-*/
│   │       └── ic_launcher.png
│   └── assets/
├── build.gradle
├── settings.gradle
└── gradle.properties
```

## Images et Branding

Les images du logo représentent:
- **Laboratoire d'Hématologie**
- **Centre Hospitalier Universitaire Générale Mohammed VI**
- **GST (Tanger-Tétouan-Al Hoceima)**

## Modifications Effectuées

1. ✅ Ajout des nouveaux logos dans les ressources drawable
2. ✅ Mise à jour du schéma de couleurs pour correspondre au thème médical
3. ✅ Configuration des icônes de lancement
4. ✅ Préparation des fichiers de configuration Gradle

## License

Ce projet est sous licence propriétaire pour le Centre Hospitalier Universitaire Générale Mohammed VI.

## Contact

Pour toute question concernant cette application, veuillez contacter l'administration du CHU Mohammed VI.
