// ciclo While
let contador = 0;
while(contador < 3){
    console.log(contador);
    contador++;
}
console.log("fin del ciclo While");

//do while
let conteo = 0;
do{
    console.log(conteo);
    conteo++;
}while(conteo < 3);
console.log("Fin del siclo do while");

//for
for(let contando = 0;contando < 3;contando++){
    console.log(contando);
}
console.log("Fin del ciclo For");

// Palabra reservada break
for(let contando = 0;contando <= 10;contando++){
    if (contando % 2 == 0){
        console.log(contando); //Muestra todos los numeros pares
        break; //rompe la estructura y sale del ciclo 
    }
}
console.log("Termina el ciclo al encontara el primer numero par");


//Etiquetas Labels
//Palabra reservada continuen
inicio:
for (let contando = 0;contando <= 10; contando++){
    if (contando % 2 !== 0){
        continue inicio;//continua a la siguiente iteracion. Ignora el resto del codigo del ciclo
    }
    console.log(contando);
}
console.log("Termina el ciclo");



