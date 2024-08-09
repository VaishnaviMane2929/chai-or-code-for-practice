class method{
int add(int a, int b) {
int c;
c= a++ + b-- + --a;
return c;

}
}
class mainMethod{
public static void main(String args[]) {
method m=new method();
System.out.println(m.add(10,30));
}
}