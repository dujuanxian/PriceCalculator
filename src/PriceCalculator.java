import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by IntelliJ IDEA.
 * User: DW
 * Date: 12-1-7
 * Time: 下午2:57
 * To change this template use File | Settings | File Templates.
 */
public class PriceCalculator {
    public int calculate(int i) {
              if(i==1){
                  return 1000;
              }
        else  if(i==2){
                  return 2000;
              }
        else  if(i==3){
                  return 4000;
              }
        else 
                  return 0;
    }
    
    public static void main(String[] args){
        System.out.println("mp3请输入1，iPad请输入2，iBook请输入3，推出请按0")  ;
        PriceCalculator cal = new PriceCalculator();
        int sum = 0;
        int count1 = 0;
        int count2 = 0;
        while(true){
        Scanner s = new Scanner(System.in);
        int item = s.nextInt();
            if(item==0)
                break;
            if(item==1){
                count1++;
                if (count1 == 3){
                    sum = sum - 1000;
                    count1 = 0;
                }
                System.out.println("您购买了一个mp3");
            }
            else  if(item==2){
                count2++;
                if (count2 == 4){
                    sum = sum - 2000;
                    count2 = 0;
                }
                System.out.println("您购买了一个iPad");
            }
            else if(item==3){
                System.out.println("您购买了一个iBook");
            }
            else
                System.out.println("非法输入，请输入1、2、3、0");

        int price = cal.calculate(item) ;
        sum = sum +price;
        }

        int member=1;
        
        System.out.println("您是否是会员？是点1，否点0");
        Scanner s = new Scanner(System.in);
       int yn = s.nextInt();

        Calendar ca = Calendar.getInstance();
        int date = ca.get(Calendar.DAY_OF_WEEK);


        if(date==7&&yn==1){
        member =2;
        }
        System.out.println("总价:"+ sum/member);

    }
}
