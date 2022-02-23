package vowell;

public class vowe {

  public static void main(String[] args) 
  {
    String str =" katlego ke bae thwii uu";
    vowelReplace(str);
  }
  public static void vowelReplace(String word)
  {
    char ch[]=word.toCharArray();
    String str ="";
    for(int i=0 ; i<word.length();i++)
    {
      if(ch[i]=='a' || ch[i]=='A')
      {
        ch[i]='2';
      }
      else
          if(ch[i]=='e' || ch[i]=='E')
           {
             ch[i]='3';
            }
            else
               if(ch[i]=='i' || ch[i]=='I')
                 {
                   ch[i]='3';
                 }
                 else
                    if(ch[i]=='o' || ch[i]=='O')
                      {
                         ch[i]='5';
                      }
                      else
                         if(ch[i]=='u' || ch[i]=='U')
                            {
                               ch[i]='6';
                            }
    }
     for(int i=0 ; i<word.length();i++)
    {
        str +=ch[i];
    }
    System.out.println(str);
  }
  
}
