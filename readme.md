Projet semestre 4 année 2021-2022 Groupe B
https://github.com/pauloud/QuiEstCe

Construire et lancer :
En se placant dans le fichier src (en remplacant eventuellement Main par Generateur) :

Pour construire (testé sur Ubuntu et Windows 10)

javac -cp gson-2.8.2.jar -sourcepath . Main.java

Ensuite, pour lancer depuis le même dossier

Sur Ubuntu :
java -cp .:gson-2.8.2.jar Main 
Sur Windows 10:
java -cp '.;gson-2.8.2.jar' Main

Par défaut, le jeu reprend la partie sauvegardée SI LA PARTIE A ETE QUITTEE EN CLIQUANT SUR "File/Sauvegarder"
Sinon l'arguement n pour créer une nouvelle partie
Et l'argument c pour utiliser les personnages de src/persosCustom.json, unique fichier manipulé par le générateur


