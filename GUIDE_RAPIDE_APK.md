# 📱 Guide Rapide: Obtenir l'APK de BMCounter

## ❓ Vous Cherchez l'APK?

### L'APK n'est PAS dans le code source GitHub ❌

C'est normal et c'est une bonne pratique! Les fichiers compilés ne doivent pas être versionnés.

---

## ✅ 3 Façons d'Obtenir l'APK

### 🏆 Méthode 1: GitHub Releases (RECOMMANDÉE pour utilisateurs)

**Le plus simple pour télécharger et installer l'APK**

1. Allez sur: `https://github.com/VOTRE-UTILISATEUR/BMCounter/releases`
2. Cliquez sur la dernière version
3. Téléchargez le fichier `.apk`
4. Installez-le sur votre appareil Android

```
GitHub → Releases → Latest → Download APK → Install
```

**⚠️ Note**: La release doit d'abord être publiée (voir PUBLIER_RELEASE.md)

---

### 🔧 Méthode 2: Compiler Localement (pour développeurs)

**Si vous voulez compiler le code source vous-même**

```bash
# 1. Clonez le projet
git clone https://github.com/VOTRE-UTILISATEUR/BMCounter.git
cd BMCounter

# 2. Compilez l'APK
gradle wrapper --gradle-version=7.5
chmod +x gradlew
./gradlew assembleDebug

# 3. L'APK sera ici:
ls -lh build/outputs/apk/debug/app-debug.apk
```

**Prérequis**:
- JDK 17
- Android SDK (API 34)
- Gradle 7.5+

---

### ⚙️ Méthode 3: GitHub Actions Artifacts (automatique)

**APK compilé automatiquement à chaque modification**

1. Allez sur: `https://github.com/VOTRE-UTILISATEUR/BMCounter/actions`
2. Cliquez sur le dernier workflow "Build Android APK"
3. Scroll vers le bas → Section "Artifacts"
4. Téléchargez "BMCounter-debug"
5. Décompressez le ZIP pour obtenir l'APK

```
GitHub → Actions → Latest workflow → Artifacts → Download
```

**⚠️ Note**: Disponible pendant 30 jours après la compilation

---

## 🎯 Tableau Récapitulatif

| Méthode | Pour Qui? | Difficulté | Temps | Toujours Disponible? |
|---------|-----------|------------|-------|----------------------|
| **Releases** | Utilisateurs finaux | ⭐ Facile | 1 min | ✅ Oui (après publication) |
| **Compiler** | Développeurs | ⭐⭐⭐ Moyen | 10-30 min | ✅ Oui |
| **Artifacts** | Testeurs | ⭐⭐ Facile | 2 min | ⏰ 30 jours |

---

## 🚀 Publier une Release (pour le mainteneur)

**Méthode automatique avec GitHub Actions:**

```bash
# 1. Créez un tag de version
git tag -a v1.0.0 -m "Version 1.0.0"

# 2. Poussez le tag
git push origin v1.0.0

# 3. GitHub Actions va automatiquement:
#    - Compiler l'APK
#    - Créer la release
#    - Attacher l'APK
```

Ensuite l'APK sera téléchargeable depuis:
```
https://github.com/VOTRE-UTILISATEUR/BMCounter/releases/download/v1.0.0/app-debug.apk
```

---

## 📖 Documentation Complète

Pour plus de détails, consultez:

| Document | Contenu |
|----------|---------|
| [`OU_TROUVER_APK.md`](OU_TROUVER_APK.md) | Explication détaillée de chaque méthode |
| [`PUBLIER_RELEASE.md`](PUBLIER_RELEASE.md) | Guide complet pour publier sur GitHub |
| [`BUILD_INSTRUCTIONS.md`](BUILD_INSTRUCTIONS.md) | Instructions de compilation complètes |
| [`README.md`](README.md) | Vue d'ensemble du projet |

---

## ❓ Questions Fréquentes

### Q: Pourquoi l'APK n'est pas dans Git?
**R**: Les fichiers binaires compilés (APK) sont volumineux et peuvent être régénérés. Les inclure dans Git alourdirait inutilement l'historique.

### Q: Comment savoir quelle version de l'APK j'ai?
**R**: Une fois installée, allez dans: Paramètres Android → Applications → BMCounter → Informations

### Q: Je ne vois pas de Releases sur GitHub
**R**: Les releases doivent être créées manuellement ou via GitHub Actions. Voir `PUBLIER_RELEASE.md`

### Q: L'APK est-il sûr?
**R**: Oui, si vous le téléchargez depuis:
- ✅ GitHub Releases officiel du projet
- ✅ GitHub Actions Artifacts du projet
- ✅ Compilation locale du code source

Méfiez-vous des APK provenant d'autres sources!

### Q: Puis-je installer l'APK sans Google Play?
**R**: Oui! C'est une installation manuelle (sideloading):
1. Téléchargez l'APK
2. Activez "Sources inconnues" dans les paramètres Android
3. Ouvrez le fichier APK
4. Suivez les instructions d'installation

---

## 📞 Besoin d'Aide?

- 📚 Lisez la documentation complète dans les fichiers .md
- 🐛 Problème? Vérifiez les logs de GitHub Actions
- 💬 Contact: Administration CHU Mohammed VI

---

**Dernière mise à jour**: 2026-04-03
