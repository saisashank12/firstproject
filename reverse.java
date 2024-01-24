class reverse
{
 public static void main(String args[])
 {
  int input=1200, rem=0, sum=0;
  int x=input;
  while(input>0)
   {
     rem=input%10;
     sum=sum*10+rem;
     input/=10;
   }
    System.out.println(sum*100);
     if(x==sum)
    System.out.println("palindrome");
     else
        System.out.println("not a palindrome");
 }
}