package _02_nested_loops._3_for_loop_gauntlet;

public class Forloop {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            System.out.println(i);
        }

        for(int i2=100;i2>=1;i2--){
            System.out.println(i2);
        }
for(int i3=2; i3<=100;i3+=2){
    System.out.println(i3);
}
for(int i4=1; i4<=100;i4+=2) {
    System.out.print(i4);
}
        for(int i5=1; i5<=500;i5++) {
            System.out.println(i5);
            if(i5 % 2 == 0) {
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
        }
        for(int i6=7; i6<=777; i6+=7){
    System.out.println(i6);
        }
        int i7=2010;
for(int i8=0; i8<=12; i8++) {
    System.out.println("In "+i7+" I was "+i8);
    i7++;
}
for(int i9=0; i9<=2; i9++){
    for(int i10=0; i10<=2; i10++){
        System.out.println(i9+" "+i10);
    }
    for(int i11=1; i11<=3; i11++){
        for(int i12=1; i12<=3; i12++){
                System.out.print(i12-i11);
System.out.println();

            }


        }

    }

}
    }

