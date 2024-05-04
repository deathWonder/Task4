package org.programm;

public class Task4 {

    public void multiplicationTable(int range){
        if(range>0){
            System.out.print("   ");
            for(int i = 1; i <= range; i++){
                if(i>9){
                    System.out.print(i+"  ");
                }else {
                    System.out.print(i + "   ");
                }
            }
            System.out.println();

            for(int i = 1; i <= range; i++){
                if(i>9){
                    System.out.print(i+" ");
                }else {
                    System.out.print(i + "  ");
                }
                for(int j = 1; j <= range; j++){
                    int num = j*i;
                    if(num>99){
                        System.out.print(j * i + " ");
                        }else if(num>9){
                        System.out.print(j * i + "  ");
                    }else {
                        System.out.print(j * i + "   ");
                    }
                }
                System.out.println();
            }
        }
    }
}
