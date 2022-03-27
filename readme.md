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


