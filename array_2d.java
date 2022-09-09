

class array_2d
  {
    public static void main(String [] args){
      int [][] car = new int [4][3];
      car [2][1]=8;
      for(int i=0; i<car.length; i++)
        {
          for(int j=0; j<car[i].length;j++){
            System.out.print(car[i][j]+" ");
          }
          System.out.println();
        }
    }

    
  }