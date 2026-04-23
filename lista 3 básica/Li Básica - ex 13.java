int somaPar = 0, somaImpar = 0;

for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) somaPar += i;
    else somaImpar += i;
}

System.out.println("Pares: " + somaPar);
System.out.println("Ímpares: " + somaImpar);