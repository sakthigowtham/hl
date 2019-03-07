import java.util.Scanner;
class alpha
{
public  static void main(String arg[])
{
Scanner s=new Scanner(System.in);
char aa=s.next().charAt(0);
if((aa >= 'a' && aa<='z') || (aa>= 'A' && aa<='Z'))
System.out.println("Alphabet");
else
System.out.println("No");

}}
