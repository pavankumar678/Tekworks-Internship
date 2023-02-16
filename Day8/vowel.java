import java.util.Scanner;
class vowel
  {
    public static void main(String arg[])
    {
      char ch;
      System.out.println("enter alphabet");
      Scanner d=new Scanner(System.in);
      ch=d.next().charAt(0);
      switch(ch)
        {
          case 'a':
            System.out.println("ch is an vowel"+ch);
            break;
          case 'A':
            System.out.println("ch is an vowel"+ch);
            break;
          case 'e':
            System.out.println("ch is an vowel"+ch);
            break;
          case 'E':
            System.out.println("ch is an vowel"+ch);
            break;
          case 'i':
            System.out.println("ch is an vowel"+ch);
            break;
          case 'I':
            System.out.println("ch is an vowel"+ch);
            break;
          case 'o':
            System.out.println("ch is an vowel"+ch);
            break;
          case 'O':
            System.out.println("ch is an vowel"+ch);
            break;
          case 'u':
            System.out.println("ch is an vowel"+ch);
            break;
          case 'U':
            System.out.println("ch is an vowel"+ch);
            break;
          default:
            System.out.println("ch is constant"+ch);
        }
    }
  }