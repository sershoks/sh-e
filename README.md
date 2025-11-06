# ShE Spigot Administration Plugin

ShE est un plugin Minecraft basé sur Spigot ciblant la dernière version de l'API (1.20.4). Il fournit une base pour des fonctionnalités d'administration de serveur, avec une structure prête à accueillir des commandes et gestionnaires d'événements supplémentaires.

## Fonctionnalités actuelles
- Initialisation d'un plugin Spigot/Bukkit en Java 17.
- Journalisation dans la console lors du chargement (`onEnable`) et du déchargement (`onDisable`) du plugin.

## Prérequis
- Java 17 ou une version compatible avec votre serveur.
- Maven 3.8+.
- Un serveur Spigot/Paper ciblant Minecraft 1.20.4.

## Construction
```bash
mvn clean package
```
Le JAR résultant se trouve dans `target/sh-e-plugin-1.0.0-SNAPSHOT.jar`.

## Installation sur le serveur
1. Copiez le JAR dans le dossier `plugins/` de votre serveur Spigot ou Paper.
2. Démarrez (ou redémarrez) le serveur.
3. Vérifiez la console pour confirmer le chargement du plugin.

## Développement
La classe principale `com.example.spigot.ShEPlugin` étend `JavaPlugin` et constitue le point d'entrée. Ajoutez-y vos commandes et listeners pour implémenter des outils d'administration supplémentaires.
