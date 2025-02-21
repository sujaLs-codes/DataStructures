import java.util.Arrays;
import java.util.Scanner;

public class Mix_Arr {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String val1;
        System.out.println("Enter the 'num' for insert data as in Numbers As well As Enter 'alpha' for insert data as in Alphabets : ");
        val1 = s.nextLine();

        int quant1 = 0;

        int arr[] = new int[0];
        String arr2[] = new String[0];

        if(val1.equals("num"))
        {

            System.out.println("Enter the quantity of the array list >> ");
            quant1 = s.nextInt();

            arr = new int[quant1];
            System.out.println("Enter the list of Elements here >> ");
            for (int i = 0; i < quant1; i++) {
                arr[i] = s.nextInt();
            }

            System.out.println("Elements are : ");
            for (int i = 0; i < quant1; i++) {
                System.out.println(arr[i]);
            }
        }
        else if (val1.equals("alpha"))
        {

            System.out.println("Enter the quantity if array list >> ");
            quant1 = s.nextInt();
            s.nextLine();

            arr2 = new String[quant1];
            System.out.println("Enter the list of Elements here >> ");
            for (int i = 0; i < quant1; i++) {
                arr2[i] = s.nextLine();
            }
        }
        else
        {
            System.out.println("Invalid!");
        }

        int dec;
        int select;
        int select1; // For Select = 1st Switch Case
        int select2; // For Select = 2nd switch case
        int select3; // For Select = 3rd switch case
        int select4; // For Select = 3rd switch case
        System.out.println("<<<<<<<<<<< If you wanna edit your data then write 1 otherwis 0 >>>>>>>>>> ");
        dec = s.nextInt();
        if(dec == 1){
            System.out.println("<<<<<<<<<<<<<< Select what you want to changes in your dataList >>>>>>>>>>>>> ");
            String [] EditList = {"1) Insertion" , "2) Deletion", "3) Sorting", "4) Searching"};
            for (int i = 0; i < EditList.length; i++)
            {
                System.out.println(EditList[i]);
            }
            System.out.print(" >> ");
            select = s.nextInt();
            if(select == 1)
            {
                System.out.print("Enter '0' for insert numeral data and '1' for insert alphabet data : ");
                Scanner scanner = new Scanner(System.in);
                select1 = scanner.nextInt();
                switch (select1)
                {
                    case 0:
                        Scanner sc = new Scanner(System.in);
                        int numnewElement;
                        System.out.println("Enter the quantity of new elements in the arrayList >>> ");
                        numnewElement = sc.nextInt();

                        int[] position = new int[numnewElement];
                        int[] newElement = new int[numnewElement];

                        for (int i = 0; i < numnewElement; i++)
                        {
                            System.out.println("Enter the data position where you want to insert data" + (i + 1) + ">>> ");
                            position[i] = sc.nextInt();
                            System.out.println("Enter the new data element to insert at that position " + position[i] + ">>> ");
                            newElement[i] = sc.nextInt();
                        }
                        int newsize = quant1 + numnewElement;
                        int b[] = new int[newsize];

                        int originalIndex = 0, newIndex = 0, insertionIndex = 0;

                        while(insertionIndex < newsize)
                        {
                            if(newIndex < numnewElement && insertionIndex == position[newIndex])
                            {
                                //newIndex keep tracking the new element we are currently inserting in that position.
                                //also check if the current insertionIndex matches the position where a new element should be inserted.
                                b[insertionIndex] = newElement[newIndex];
                                newIndex++;
                            }
                            else
                            {
                                b[insertionIndex] = arr[originalIndex];
                                originalIndex++;
                            }
                            insertionIndex++;
                        }
                        System.out.println("Elements in the new array : ");
                        for (int i = 0; i < newsize; i++)
                        {
                            System.out.println(b[i]);
                        }
                        break;

                    case 1:
                        Scanner scan = new Scanner(System.in);
                        System.out.println("Enter the quantity of new elements in the arrayList >>> ");
                        numnewElement = scan.nextInt();
                        scan.nextLine();// Consume the newLine Character after integer input

                        int[] positn = new int[numnewElement];
                        String[] newEle = new String[numnewElement];

                        for (int i = 0; i < numnewElement; i++)
                        {
                            System.out.println("Enter the data position where you want to insert data" + (i + 1) + ">>> ");
                            positn[i] = scan.nextInt();
                            scan.nextLine();
                            System.out.println("Enter the new data element to insert at that position " + positn[i] + ">>> ");
                            newEle[i] = scan.nextLine();
                        }
                        int Newsize = quant1 + numnewElement;
                        String c[] = new String[Newsize];

                        int OriginalIndex = 0, NewIndex = 0, insertnIndex = 0;

                        while(insertnIndex < Newsize)
                        {
                            if(NewIndex < numnewElement && insertnIndex == positn[NewIndex])
                            {
                                //newIndex keep tracking the new element we are currently inserting in that position.
                                //also check if the current insertionIndex matches the position where a new element should be inserted.
                                c[insertnIndex] = newEle[NewIndex];
                                NewIndex++;
                            }
                            else
                            {
                                c[insertnIndex] = arr2[OriginalIndex];
                                OriginalIndex++;
                            }
                            insertnIndex++;
                        }
                        System.out.println("Elements in the new array : ");
                        for (int i = 0; i < Newsize; i++)
                        {
                            System.out.println(c[i]);
                        }
                        break;

                    default:
                        System.out.println("invalid");
                        break;
                }
            }
            else if (select == 2)
            {
                System.out.print("Enter '0' for insert numeral data and '1' for insert alphabet data : ");
                Scanner scanner = new Scanner(System.in);
                select2 = scanner.nextInt();
                switch (select2)
                {
                    case 0:
                        Scanner sujal = new Scanner(System.in);
                        System.out.println("Enter the number of elements you want to delete : ");
                        int numDeleteElements = sujal.nextInt();

                        //Create an array to store the position of the element to delete
                        int[] positionToDelete = new int[numDeleteElements];

                        //Inpute the position of the element to delete
                        for (int i = 0; i < numDeleteElements; i++)
                        {
                            System.out.println("Enter the position of the element you want to delete (0-based index) >> ");
                            positionToDelete[i] = sujal.nextInt();
                        }
                        //Sort position to delete to handle removal from last to first to avoid index to avoid index shift issues
                        Arrays.sort(positionToDelete);

                        int newsize = quant1 - numDeleteElements;
                        int[] d = new int[newsize];

                        int OGIndex = 0;
                        int navinindex = 0;

                        for (int i = 0; i < quant1; i++) {
                            if(navinindex < numDeleteElements && i == positionToDelete[navinindex])
                            {
                                navinindex++;
                            }
                            else{
                                d[OGIndex] = arr[i]; //copy the element of the new array
                                OGIndex++;
                            }
                        }
                        System.out.println("Elements in the new array after deletion : ");
                        for (int i = 0; i < newsize; i++) {
                            System.out.println(d[i]);
                        }
                        break;

                    case 1:
                        Scanner Sujal = new Scanner(System.in);
                        System.out.println("Enter the number of elements you want to delete : ");
                        int NumDeleteElements = Sujal.nextInt();
                        Sujal.nextLine();

                        //Create an array to store the position of the element to delete
                        int[] PositionToDelete = new int[NumDeleteElements];

                        //Inpute the position of the element to delete
                        for (int i = 0; i < NumDeleteElements; i++)
                        {
                            System.out.println("Enter the position of the element you want to delete (0-based index) >> ");
                            PositionToDelete[i] = Sujal.nextInt();
                        }
                        //Sort position to delete to handle removal from last to first to avoid index to avoid index shift issues
                        Arrays.sort(PositionToDelete);

                        int newsizes = quant1 - NumDeleteElements;
                        String[] e = new String[newsizes];

                        int OGIndexes = 0;
                        int navinindexes = 0;

                        for (int i = 0; i < quant1; i++) {
                            if(navinindexes < NumDeleteElements && i == PositionToDelete[navinindexes])
                            {
                                navinindexes++;
                            }
                            else{
                                e[OGIndexes] = arr2[i]; //copy the element of the new array
                                OGIndexes++;
                            }
                        }
                        System.out.println("Elements in the new array after deletion : ");
                        for (int i = 0; i < newsizes; i++) {
                            System.out.println(e[i]);
                        }
                        break;

                    default:
                        System.out.println("Invalid");
                        break;
                }
            }
            else if (select == 3)
            {
                Scanner radhey = new Scanner(System.in);
                System.out.println("Enter '0' for insert numeral data and '1' for insert alphabet data : ");
                System.out.print(">>> ");
                select3 = radhey.nextInt();
                switch (select3){
                    case 0:
                        Arrays.sort(arr);
                        System.out.println("After Sorting >>> ");
                        for (int i = 0; i < arr.length; i++) {
                            System.out.println(arr[i]);
                        }
                        break;

                    case 1:
                        Arrays.sort(arr2);
                        System.out.println("After Sorting >>> ");
                        for (int i = 0; i < quant1; i++) {
                            System.out.println(arr2[i]);
                        }
                        break;

                    default:
                        System.out.println();
                        break;
                }
            }
            else if (select == 4) {
                Scanner radhe = new Scanner(System.in);
                System.out.println("Enter '0' for insert numeral data and '1' for insert alphabet data : ");
                System.out.print(">>> ");
                select4 = radhe.nextInt();
                switch (select4)
                {
                    case 0:
                        Scanner vs = new Scanner(System.in);
                        System.out.println("Enter the missing ID"); //Linear Search
                        int num = vs.nextInt();

                        boolean Id = false;

                        for(int element : arr)
                        {
                            if(num == element)
                            {
                                Id = true;
                                break;
                            }
                        }
                        if(Id)
                        {
                            System.out.println("This data present in the dataList...");
                        }
                        else
                        {
                            System.out.println("OOps this data is not available in it...");
                        }
                        break;

                    case 1:
                        Scanner vss = new Scanner(System.in);
                        System.out.println("Enter the missing ID");
                        String names = vss.nextLine();

                        boolean id = false;

                        for(String Element : arr2)
                        {
                            if(names.equals(Element))
                            {
                                id = true;
                                break;
                            }
                        }
                        if(id)
                        {
                            System.out.println("This data present in the dataList...");
                        }
                        else
                        {
                            System.out.println("OOps this data is not available in it...");
                        }
                        break;

                    default:
                        System.out.println("Invaid input....");
                        break;
                }
            }
            else
            {
                    System.exit(0);
            }
        }
        else
        {
            System.exit(0);
            System.out.println("Thank you");
        }
    }
}