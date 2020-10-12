package ru.mirea.practice12;
public class Main {
        public static void main(String[] args) {
            String[] tests ={
                    "84956979989",
                    "+74959969092",
                    "456",
                    "84991567543",
                    "+79246752345"
            };
            for (String test: tests) {
                if ((test.length()==11)){
                    System.out.print("+<7>"+"-<");
                }
                else if((test.length()==12)&(test.charAt(0)=='+')){
                    System.out.print("+<"+test.substring(1,test.length()-10)+">-<");
                }
                else{
                    System.out.println("Неправильно набран номер");
                    continue;
                }
                System.out.print(test.substring(test.substring(1,test.length()-10).length()+1,test.length()-7)
                        +">-<"+test.substring(test.length()-7,test.length()-4)
                        +">-<"+test.substring(test.length()-4)+">");
                System.out.println();
        }
    }
}