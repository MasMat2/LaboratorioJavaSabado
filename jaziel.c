#include <stdio.h>
int main()
{
  int n, i, j, espacios;
  printf("Ingresa el numero de cadenas a caputrar: ");
  scanf("%d", &n);

  //Crear arreglo de cadenas
  char cadenas[n][30];
  //Aqui se guardara el numero de palabras de cada cadena
  int counter[n];

  //Llenar arreglo de cadenas con cadenas del usuario
  for (int i = 0; i < n; i++)
  {
    printf("\nIngresa la cadena numero %d:\n", i + 1);
    fflush(stdin);
    fgets(cadenas[i], 30, stdin);
  }

  //Recorrer arreglo de cadenas para contar palabras
  for (i = 0; i < n; i++)
  {
    espacios = 0;
    //Recorrer cadena
    for (j = 0; cadenas[i][j] != '\0'; j++)
    {
      //Contar espacios
      //cadenas[i][i][j+1] != ' ' se asegura de dos espacios juntos mas de una vez
      //Tambien aplica para mas de dos espacios
      if (cadenas[i][j] == ' ' && cadenas[i][j + 1] != ' ')
      {
        espacios++;
      } //if contador de espacios
    }   //for cadena
    //Guardar el numero de palabras de la cadena i en el indice i de counter
    counter[i] = espacios + 1;
  } //for arreglo de cadens

  //Encontrar string con mas palabras, recorriendo el contador
  int max = 0;
  for (i = 0; i < n; i++)
  {
    //Si un string tiene mas palabras que el indice max guardar el indice en max
    if (counter[i] > counter[max])
    {
      max = i;
    } //if encontrar string
  }   //for reccorrer contador
  printf("\nLa cadena con mas palabras es: \n%s", cadenas[max]);
  printf("\nCon %d palabras", counter[max]);
} //main
