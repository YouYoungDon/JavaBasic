package Seventh;
interface Comparable{
    int compareTo(Object other);
}

class MyStrcmp implements Comparable{
    private double area=0;

    public MyStrcmp(double area){
        this.area = area;
    }

    public int compareTo(Object otherDbj){
        MyStrcmp other = (MyStrcmp) otherDbj;
        if(this.area<other.area){
            return -1;
        }else if(this.area>other.area){
            return 1;
        }else{
            return 0;
        }

    }
}
public class InterfaceTest {
    public static void main(String[] args) {
        MyStrcmp ms1=new MyStrcmp(77.7);
        MyStrcmp ms2 = new MyStrcmp(33.3);

        if(ms1.compareTo(ms2)>0){
            System.out.println("ms1이 ms2보다 크다");
        }else if(ms1.compareTo(ms2)<0){
            System.out.println("ms1가ms2보다 작다");
        }else{
            System.out.println("같");
       }

    }
}
