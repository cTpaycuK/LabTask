package Lecture1.Task2;
import java.io.IOException;
import java.net.SocketException;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;


public class GetFiles {

	/**
	 * @param args
	 */
//lalalalalalalalala
	private static FTPClient ftpClient=new FTPClient();
	private static String str="ftp.mozilla.org";
	private static int tabCount=0;
	
	private void getFiles(FTPFile f){

		FTPFile[] files;
		try {
			ftpClient.changeWorkingDirectory(f.getName());
			files = ftpClient.listFiles();
			if(files!=null){
				for(FTPFile file:files){
					for(int i=0; i<tabCount;i++){
						System.out.print("\t");
					}
					if(file.isDirectory()){
						System.out.println(file.getName()+":");
						tabCount++;
						getFiles(file);
					}else{
						System.out.println(file.getName());
					}
				}
				tabCount--;
			}
			ftpClient.changeToParentDirectory();
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}
	
	public void startSearch(){
		ftpClient=new FTPClient();
		try {
			ftpClient.connect(str);
			ftpClient.login("anonymous", "");
			FTPFile[] files=ftpClient.listFiles();
			if(files!=null){
				for(FTPFile file:files){
					if(file.isDirectory()){
						System.out.println("Directory "+file.getName()+":");
						tabCount++;
						getFiles(file);
					}else{
						System.out.println(file.getName());
					}
				}
			}
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetFiles gf=new GetFiles();
		gf.startSearch();

	}

}
