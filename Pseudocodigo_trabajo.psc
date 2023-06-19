Algoritmo sin_titulo
	Definir costos, num, i, numZapatos Como Entero
	Escribir "Digite cuantos pares de zapatos se compraron."
	Leer numZapatos
	valorTotal<- 0
	
	Para i<-1 Hasta numZapatos Con Paso i+1 Hacer
		Escribir "Digite la talla del par de zapatos";
		Leer num;
		Escribir "Digite el costo del par de zapatos";
		Leer costos;
		Segun num Hacer
			Caso 35:
				talla_35 <- talla_35 + 1;
			Caso 36:
				talla_36 <- talla_36 + 1;
			Caso 37:
				talla_37 <- talla_37 + 1;
			Caso 38:
				talla_38 <- talla_38 + 1;
			Caso 39:
				talla_39 <- talla_39 + 1;
			Caso 40:
				talla_40 <- talla_40 + 1;
		FinSegun
		valorTotal = valorTotal + costos
	Fin Para
	
	Escribir "Se compraron ",talla_35," pares de zapatos de la talla 35";
	Escribir "Se compraron ",talla_36," pares de zapatos de la talla 36";
	Escribir "Se compraron ",talla_37," pares de zapatos de la talla 37";
	Escribir "Se compraron ",talla_38," pares de zapatos de la talla 38";
	Escribir "Se compraron ",talla_39," pares de zapatos de la talla 39";
	Escribir "Se compraron ",talla_40," pares de zapatos de la talla 40";
	Escribir "Con un gasto total de ", valorTotal;

FinAlgoritmo
