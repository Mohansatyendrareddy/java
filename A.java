class A
{
static java.util.Scanner sc=new java.util.Scanner(System.in);
static String m1(int i)
{
System.out.println(i);
return sc.next();
}
static int m2(String s)
{
System.out.println(s);
return sc.nextInt();
}
A(String f,int z)
{
System.out.println(f+" "+z);
}
A(A obj)
{

}
public static void main(String a[])
{
new A(new A(m1(sc.nextInt()),m2(sc.next())));

}
}