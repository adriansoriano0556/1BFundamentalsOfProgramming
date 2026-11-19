public class CoffeShopAnalyzer {//ito ang ating class name
    public static void main(String[] args){//ito naman ang ating main execution o ginagamit natin para i run ang code
        int []weeklySales = {120,145,130,155,180,210,195};//nag declare tayo ng integer
        String []daysOfWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};//nag declare tayo ng string

        System.out.println("---Daily Sales---");//dinisplay natin ang daily sales
        for(int i = 0; i < weeklySales.length;i++){//loop conditon natin ito
         System.out.println(daysOfWeek[i] + " sales:" + weeklySales[i]);//dinisplay natin ang daysofWeek and ang weeklySales natin
        }
        int totalSales = 0;//nag declare tayo ng integer totalSales na may initial value na 0
        for(int i = 0; i < weeklySales.length; i++){//ito naman ang ating loop conditon
            totalSales += weeklySales[i];//ina-add natin ang weeklySales sa totaSales at kinikuha ang total nito
        }
        double averageSales = (double) totalSales / weeklySales.length;//nag declare tayo ng double averageSales tapos cinonvert natin ang integer totalSales sa double
        // idinivide naman natin ang totalSales sa weeklySales
        System.out.println("\n---Weekly Summary---");//nag display tayo ng weekly Summary
        System.out.println("Total Sales:" + totalSales + " cups");//dinisplay natin ang TotalSales plus cups
        System.out.printf("Average Daily Sales: %.2f cups",averageSales);//dinisplay natin ang average Daily Sales sa paggamit ng printf upang dalawang decimal lang anglalabas dito
    }
}
