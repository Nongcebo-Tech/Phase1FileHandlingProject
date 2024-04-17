package Project;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Phase1Project {

	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		int ch;
		String fname;
		do
		{
			
			System.out.println("----------------************----------------");
			
			System.out.println("___________Welcome to my Application_________");
			System.out.println("______________NONGCEBO HLONGWANE__________________");
			System.out.println("___________Java Full Stack Developer__________ ");
			
			System.out.println("----------------************----------------");
			
			
			System.out.println("Operations");
			System.out.println("1. File creation");
			System.out.println("2. Write in the file ");
			System.out.println("3. Reading a file ");
			System.out.println("4. Delete the file ");
			System.out.println("5. Search the file");
			System.out.println("6. List of Files ");
			System.out.println("7. Exit");
			
			System.out.println("Enter your choice!");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				
				System.out.println("Enter the file name to create :");
				
				fname=sc.next();
				
				File f = new File("C:\\Users\\NONGCEBO\\eclipse-workspace\\Phase1FileHandlingProject\\"+fname+".txt");
				
				
				if(f.createNewFile())
				{
					System.out.println("File created successfully!");
				}
				else
				{
					if(f.exists())
					{
						System.out.println("File already exist");
					}
					else
					{
						System.out.println("Error in creating the file!");
					}
				}
				break;
			case  2:
				
				System.out.println("Enter the file name where you want to write!");
				fname=sc.next();
				
				Scanner sc1= new Scanner(System.in);
				
				System.out.println("Enter the content you want to write in a file!");
				String content=sc1.nextLine();
				
				FileWriter fw = new FileWriter("C:\\Users\\NONGCEBO\\eclipse-workspace\\Phase1FileHandlingProject\\"+fname+".txt");
				fw.write(content);
				
				System.out.println("Data Written in the file successfully!");
				
				fw.close();
				break;
			case 3:
				
				System.out.println("Enter the file name whose data you want to read!");
				fname=sc.next();
				
				File f2= new File("C:\\Users\\NONGCEBO\\eclipse-workspace\\Phase1FileHandlingProject\\"+fname+".txt");
				Scanner sc2 = new Scanner(f2);
				
				while(sc2.hasNextLine())
				{
					String line=sc2.nextLine();
					System.out.println(line);
				}
				
				sc2.close();
				
				
				
				break;
			case 4:
				
				System.out.println("Enter file name which you want to delete ");
				fname=sc.next();
				
				File f3 = new File("C:\\Users\\NONGCEBO\\eclipse-workspace\\Phase1FileHandlingProject\\"+fname+".txt");
				
				f3.delete();
				
				if(f3.exists())
				{
					System.out.println("Error found in deleting the file!");
				}
				else
				{
					System.out.println("File deleted successfully!");
				}
				
				break;
			case 5:
				
				System.out.println("Enter the file name for searching!");
				fname=sc.next();
				
				File f5 = new File("C:\\Users\\NONGCEBO\\eclipse-workspace\\Phase1FileHandlingProject\\");
				
				String[] list = f5.list();
				int fl=0;
				if(list==null)
				{
					System.out.println("There is no file present in the directory!");
				}
				else
				{
					for(int i=0;i<list.length;i++)
					{
						String sfile= list[i];
						if(sfile.equalsIgnoreCase(fname))
						{
							System.out.println("File found in the directory successfully!");
						
							fl=1;
						}
					}
					
					if(fl==0)
					{
						System.out.println("File not found!");
					}
				}
				
				
				
				break;
			case 6:
				
				System.out.println("List of Files and Folders are :");
				
				File f6 = new File("C:\\Users\\NONGCEBO\\eclipse-workspace\\Phase1FileHandlingProject\\");
				
				File[] l1 = f6.listFiles();
				
				for(File fi: l1)
				{
					if(fi.isDirectory())
					{
						System.out.println(fi.getName());
					}
					else if(fi.isFile())
					{
						System.out.println(fi.getName());
					}
				}
				break;
			case 7:
				System.out.println("Thank you for using the Application! ");
				System.exit(ch);
				break;
			default:
				System.out.println("Enter the choice again! ");
			}
		}
		while(true);

	}

}
