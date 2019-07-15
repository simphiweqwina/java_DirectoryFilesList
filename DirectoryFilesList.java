import java.util.Scanner;
import java.io.File;

class DirectoryFilesList{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter firecory");
		String dir = sc.next();

		//instanciate file class
		File dirname= new File(dir);

		File[] listFiles = dirname.listFiles();

		for (int i = 0; i < listFiles.length; i++)
          {
            if (listFiles[i].isFile())
            {
              System.out.println("File: " + listFiles[i].getName());
            }
            else if (listFiles[i].isDirectory())
            {
                System.out.println("Directory: " + listFiles[i].getName());
            }
      }

	}
}