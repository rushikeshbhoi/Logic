import java.util.*;

class Program188
{
    public static int ToggleBit(int iNo)
    {
        int iMask = 0x00000040;
        int iResult = 0;
        iResult = iNo ^ iMask;
        
        return iResult;
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        int iRet = 0;

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        iRet = ToggleBit(iNo);

        System.out.println("Updated number is : "+iRet);
    }
}