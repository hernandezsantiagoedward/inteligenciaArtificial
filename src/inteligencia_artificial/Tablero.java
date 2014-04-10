/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inteligencia_artificial;

/**
 *
 * @author Edward
 */
public class Tablero 
{
    
private static int auxi[][] = new int[8][8];
public static void  main(String arg[]) {
  int n=8;
  int columna[]=new int[n];
  boolean diag1[]= new boolean[15];
  boolean diag2[]= new boolean[15];
  boolean fila[] = new boolean[8];
  
  for(int i=0;i<(n*2)-1;++i){
        if(i<n)
            fila[i]=true;
        diag1[i]=diag2[i]=true;
    }
  System.out.print("SoLuCiOneS dE lAs 8 ReInAs\n 1 === Posicion de las Reinas");
     posiciones(0,columna,fila,diag1,diag2,n);
}

 public static void  posiciones(int i,int columna[],boolean fila[],boolean diag1[],boolean diag2[],int n){
    int j;
    if(i==n)
    {
        int k;
        for( k=0;k<n;++k)
        {
            auxi[k][columna[k]]=1;
        }
        System.out.println();
        tablero();
          
    }
      
    for(j=0;j<n;++j)
    {
        if(fila[j] && diag1[(n-1)+i-j] && diag2[i+j])
        {
            columna[i]=j;
            diag1[(n-1)+i-j]=diag2[i+j]=fila[j]=false;
            posiciones(i+1,columna,fila,diag1,diag2,n);
            diag1[(n-1)+i-j]=diag2[i+j]=fila[j]=true;
         }
        
     }
   }
 
 public static void tablero()
 {
     for(int q=0;q<8;q++)
     {
         System.out.println();
         for(int f=0;f<8;f++)
         {
             System.out.print(" "+auxi[q][f]);
         }
     }
     auxi=new int [8][8];
 }

    
}
