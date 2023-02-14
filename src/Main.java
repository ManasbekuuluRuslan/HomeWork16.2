public class Main {
    public static void main(String[] args) {

        Backend[] people = { new Java(), new CSharp(), new Python()};
        for (Backend a: people) {
            System.out.println(a.getClass());
            if (a instanceof Java){
                Java java = (Java) a;
                java.spring();
            }else if(a instanceof CSharp){
                CSharp cSharp = (CSharp) a;
                cSharp.dotNet();
            } else if (a instanceof Python) {
                Python python = (Python) a;
                python.django();
            }
        }
    }
}