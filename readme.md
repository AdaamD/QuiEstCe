Projet semestre 4 année 2021-2022 Groupe B
https://github.com/pauloud/QuiEstCe

Construire et lancer :
En se placant dans le fichier src :

Pour construire (testé sur Ubuntu et Windows 10)

javac -cp gson-2.8.2.jar -sourcepath . Main.java

Ensuite, pour lancer depuis le même dossier

Sur Ubuntu :
java -cp .:gson-2.8.2.jar Main 
Sur Windows 10:
java -cp '.;gson-2.8.2.jar' Main

Les executables 2j et 2jCmplx permettent actuellement de jouer avec deux personnages, mais ne sont pas compatibles avec les persos customs
Le generateur est limite en terme de fonctionnalite mais il permet d'enregistrer ses propres persos dans src/persosCustom.json
Les commandes du menu pour redémarrer ne fonctionnent que sur Linux pour l'instant
