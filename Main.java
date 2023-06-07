class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    int j=0;
    int i=0;
    for(;i<=4;i++)
      {
        if(i == 0 || i==4)
          System.out.println("*");
        else if(i == 1 || i == 3 )
          System.out.println("*\t*");
        else if (i == 2)
          System.out.println("*\t*\t*");
      }
  }
}