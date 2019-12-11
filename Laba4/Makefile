.PHONY: build
build:	
	javac -d . Input.java Main.java Printer.java Tasks.java 

.PHONY: run
run:	
	java -classpath . Main

.PHONY: execute
execute:	
	javac -d . Input.java Printer.java Task1.java Task2.java Main.java 
	java by.bntu.fitr.alex.javalabs.lab04.control.Main	

.DEFAULT_GOAL := execute