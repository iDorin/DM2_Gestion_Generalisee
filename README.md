# DM2_Gestion_Generalisee
Étendre et généraliser le design du DM1 pour qu'il permette aussi de réserver des cabines sur des paquebots de croisières et des sièges dans des trains.

## Tâches
Produisez le design logiciel du système de réservation généralisé. Vous n'êtes pas tenus de commencer à partir de votre design précédent. 

Le design doit inclure : diagramme de classe logiciel, les diagrammes de séquence ou de collaboration et un diagramme de paquets. Montrez uniquement les diagrammes de séquence/collaboration pour les actions client : vérifier les vols/itinéraires disponibles, réserver un siège/cabine, payer un siège/cabine, annuler et changer une réservation. Votre design doit être modulaire et réutilisable. Identifiez clairement les modules à usage général et réutilisables dans le rapport.

Rédigez en OCL les deux contraintes précédent la metion [OCL] dans l'énoncé. De plus, mettez à jour la contrainte "Réserver ne peut se faire que pour un siège/cabine libre".

Démontrez que votre design est de bonne qualité en utilisant les techniques vues en classe. Entre autres, justifiez votre raisonnement en s'appuyant sur le couplage et la cohésion des classes et paquets, la relation entre le fardeau et le domaine des classes. Identifiez clairement le type de couplage ou de cohésion concerné. Vous devez également produire un graphe IA montrant la stabilité et le niveau d'abstraction de chaque paquet. Justifier l'allure du graphe obtenu. Finalement, identifiez quels principes de conception vous avez appliquer dans votre design et justifiez leur utilisation (ou absence).

### Bonus
Implémentez le design en Java. L'implémentation doit être générée à partir du design dans Visual Paradigm. Une interface graphique n'est pas requise. La méthode main créera les objets exemples nécessaires.

## Bareme
Design logiciel [55%] :
* Diagramme de classe [20%]
* Diagrammes de séquence ou de collaboration [15%]
* Diagramme de paquets [8%]
* Contraintes OCL [7%]
* Identifications des modules réutilisables [5%]

Qualité du design [45%] :
* Discussion du couplage et de la cohésion des modules [10%]
* Discussion du fardeau des classes [10%]
* Graphe IA et justification [10%]
* Justification de l'application des principes de conception [15%]

Bonus (pas de note partielle) [10%]
